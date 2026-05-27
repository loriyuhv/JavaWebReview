<template>
  <el-container class="layout-container" style="height: 95vh">
    <el-header>图书管理系统</el-header>
    <el-main>
      <el-row>
        <el-col>
          <el-card>
            <!-- 数据搜索 -->
            <el-input
              v-model="queryBookName"
              placeholder="图书名称"
              clearable
              @keyup.enter="getBooksByName"
              style="width: 20%"
            />
            <el-button @click="getBooksByName" type="info">查询</el-button>
            <el-button @click="addBook" type="primary">新建</el-button>
            <!-- 数据展示 -->
            <el-table :data="bookList" stripe border>
              <!-- 类别 -->
              <el-table-column
                prop="type"
                label="类别"
                header-align="center"
                align="center"
              ></el-table-column>
              <!-- 名称 -->
              <el-table-column
                prop="name"
                label="名称"
                header-align="center"
                align="center"
              ></el-table-column>
              <!-- 描述 -->
              <el-table-column
                prop="description"
                label="描述"
                header-align="center"
                align="center"
              ></el-table-column>
              <!-- 操作 -->
              <el-table-column label="操作" header-align="center" align="center">
                <template #default="scope">
                  <el-button @click="editBook(scope.row)" type="primary" size="small">
                    编辑
                  </el-button>
                  <el-button @click="deleteBook(scope.row.id)" type="danger" size="small">
                    删除
                  </el-button>
                </template>
              </el-table-column>
            </el-table>
          </el-card>
        </el-col>
      </el-row>

      <el-dialog v-model="dialogBookFormVisible" :title="dialogTitle" width="60%">
        <el-form ref="addBookFormRef" :model="bookForm" :rules="rulesBookForm" label-width="100px">
          <el-row>
            <el-col :span="11">
              <el-form-item label="图书类别" prop="type">
                <el-input v-model="bookForm.type" autocomplete="on" />
              </el-form-item>
            </el-col>
            <el-col :span="2"></el-col>
            <el-col :span="11">
              <el-form-item label="图书名称" prop="name">
                <el-input v-model="bookForm.name" autocomplete="on" />
              </el-form-item>
            </el-col>
          </el-row>
          <el-row>
            <el-col :span="24">
              <el-form-item label="图书描述" prop="description">
                <el-input
                  v-model="bookForm.description"
                  autocomplete="off"
                  type="textarea"
                ></el-input>
              </el-form-item>
            </el-col>
          </el-row>
        </el-form>
        <template #footer>
          <div class="dialog-footer">
            <el-button @click="dialogBookFormVisible = false">取消</el-button>
            <el-button type="primary" @click="submitForm"> 确认 </el-button>
          </div>
        </template>
      </el-dialog>
    </el-main>
  </el-container>
</template>

<script setup lang="ts">
import * as bookApi from '@/api'
import { nextTick, reactive, ref } from 'vue'
import type { Book, BookForm } from '@/types'
import type { FormInstance, FormRules } from 'element-plus'
import { ElLoading, ElMessage, ElMessageBox } from 'element-plus'

/* 数据 */
const queryBookName = ref('')
const dialogBookFormVisible = ref(false)
const dialogTitle = ref('新增图书')
const isEdit = ref(false) // 编辑标记状态
const currentEditId = ref<number | null>(null)
const bookList = ref<Book[]>([])
const addBookFormRef = ref<FormInstance>()
const bookForm = reactive<BookForm>({
  type: '',
  name: '',
  description: '',
})
const rulesBookForm = reactive<FormRules<BookForm>>({
  type: [{ required: true, message: '请输入图书类别', trigger: ['blur', 'change'] }],
  name: [{ required: true, message: '请输入图书名称', trigger: ['blur', 'change'] }],
})

/* 方法 */
// 查询全部图书
const getAllBooks = async () => {
  try {
    bookList.value = await bookApi.getAllBooks()
  } catch {
    ElMessage.error('获取图书列表失败')
  }
}

// 根据图书名称查询图书
const getBooksByName = async () => {
  if (!queryBookName.value) {
    ElMessage.warning('请输入图书名称, 否则查询全部图书')
    await getAllBooks()
    return
  }
  try {
    bookList.value = await bookApi.getBooksByName(queryBookName.value)
  } catch {
    ElMessage.error('查询失败')
  }
}

// 新增图书
const addBook = () => {
  isEdit.value = false
  dialogTitle.value = '新增图书'
  addBookFormRef.value?.resetFields()
  dialogBookFormVisible.value = true
}

// 编辑图书
const editBook = (row: Book) => {
  isEdit.value = true
  currentEditId.value = row.id as number
  dialogTitle.value = '编辑图书'

  // 回填数据到表单
  addBookFormRef.value?.resetFields()
  bookForm.type = row.type
  bookForm.name = row.name
  bookForm.description = row.description || ''
  nextTick(() => {
    addBookFormRef.value?.clearValidate()
  })
  dialogBookFormVisible.value = true
}

// 删除图书
const deleteBook = async (id: number) => {
  try {
    await ElMessageBox.confirm('确定要删除该图书吗？', '提示', {
      confirmButtonText: '确定',
      cancelButtonText: '取消',
      type: 'warning',
    })
  } catch {
    return // 用户取消
  }
  try {
    await bookApi.deleteBook(id)
    bookList.value = bookList.value.filter((item) => item.id !== id)
    ElMessage.success('删除成功！')
  } catch {
    ElMessage.error('删除失败，请稍后重试')
  }
}

// 提交：新增 + 编辑 共用
const submitForm = async () => {
  if (!addBookFormRef.value) return

  // 表单校验
  try {
    await addBookFormRef.value.validate()
  } catch {
    ElMessage.error('请完善必填信息')
    return
  }

  // 加载状态，防止重复点击
  const loading = ElLoading.service({
    lock: true,
    text: '正在提交...',
    background: 'rgba(0, 0, 0, 0.7)',
  })

  try {
    if (isEdit.value) {
      const updateData: Book = {
        id: currentEditId.value!,
        ...bookForm,
      }

      await bookApi.updateBook(updateData)

      // 本地同步更新
      const index = bookList.value.findIndex((item) => item.id === currentEditId.value)
      if (index !== -1) {
        bookList.value[index] = updateData
      }

      ElMessage.success('编辑成功')
    } else {
      const addData: Book = {
        ...bookForm,
      }
      const res = await bookApi.addBook(addData)
      if (res.data) {
        await getAllBooks()
      }
      ElMessage.success('新增图书成功')
    }

    dialogBookFormVisible.value = false
    addBookFormRef.value?.resetFields()
  } catch (err) {
    console.error('提交失败：', err)
    ElMessage.error('提交失败，请稍后重试')
  } finally {
    // 关闭 loading
    loading.close()
  }
}

getAllBooks()
</script>

<style scoped>
/*noinspection CssUnusedSymbol*/
.layout-container :deep(.el-header) {
  position: relative;
}
/*noinspection CssUnusedSymbol*/
:deep(.el-header) {
  box-shadow: 0 0 10px;
  border-radius: 12px;
  background-color: #409eff;
  color: white;
  font-size: 20px;
  line-height: 60px;
  text-align: center;
}
/*noinspection CssUnusedSymbol*/
:deep(.el-main) {
  border-radius: 12px;
  padding: 10px 0;
}

/*noinspection CssUnusedSymbol*/
:deep(.el-button) {
  margin-left: 20px;
  margin-bottom: 10px;
}

/*noinspection CssUnusedSymbol*/
:deep(.el-input) {
  margin: 0 0 10px 0;
}
</style>
