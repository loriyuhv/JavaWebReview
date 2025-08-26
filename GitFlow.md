# Git 工作流与分支策略

**推荐使用功能分支工作流 (Feature Branch Workflow)**

```
main (稳定版本)
└── develop (集成分支)
    ├── feature/a-maven-study (功能分支)
    ├── feature/b-spring-core-study
    ├── feature/c-redis-integration-study
    └── hotfix/xxx (紧急修复)
```

# 一、具体操作流程

## 1.1 初始化设置

```cmd
# 克隆你的空仓库（如果尚未初始化）
git clone "仓库地址"
cd javaweb-review

# 创建并切换到开发分支
git checkout -b develop
# 把开发分支提交到远程分支
git push -u origin develop
```

## 1.2 开始新功能开发

```cmd
# 确保在develop分支
git checkout develop
# 保持本地分支与远程分支信息同步
git pull origin develop

# 创建功能分支
git checkout -b feature/a-maven-study
```

## 1.3 在功能分支上开发

```cmd
# 这一步可以用IDEA实现
# 添加Maven模块
mkdir a-maven-study
# ... 创建文件并编码

# 提交更改
git add a-maven-study/
git commit -m "feat: 添加Maven学习模块结构"

# 定期推送到远程备份
git push -u origin feature/a-maven-study
```

## 1.4 完成功能后合并

```cmd
# 切换回develop分支
git checkout develop
git pull origin develop

# 合并功能分支
git merge --no-ff feature/a-maven-study -m "Merge feature/a-maven-study"

# 解决可能的冲突后推送到远程
git push origin develop

# 删除功能分支
git branch -d feature/a-maven-study
git push origin --delete feature/a-maven-study
```

## 1.5 发布版本

```cmd
# 当完成一个重要阶段后，合并到main分支
git checkout main
git merge develop

# 创建版本标签
git tag -a v1.0.0 -m "完成Maven学习阶段"
git push origin main --tags
```

# 二、提交信息规范

使用约定式提交 (Conventional Commits) 规范：

```cmd
# 功能实现
git commit -m "feat: 添加Spring IOC容器示例"

# 文档更新
git commit -m "docs: 更新Redis学习笔记"

# 修复问题
git commit -m "fix: 修正MySQL连接池配置错误"

# 代码重构
git commit -m "refactor: 优化MyBatis映射器结构"

# 测试相关
git commit -m "test: 添加Spring MVC控制器测试"
```

# 三、标签策略

使用语义化版本控制 (Semantic Versioning)：

```
# 主版本号.次版本号.修订号-描述
git tag -a v0.1.0-a-maven-study -m "完成Maven基础学习"
git tag -a v0.2.0-servlet-complete -m "完成Servlet学习"
git tag -a v1.0.0-monolithic-project -m "完成单体项目"
git tag -a v2.0.0-microservices -m "完成微服务项目"

# 推送标签到远程
git push origin --tags
```

# 四、日常操作清单

## 4.1 开始新一天工作

```
git checkout develop
git pull origin develop
git checkout -b feature/模块名称
```

## 4.2 工作期间

```
# 多次小步提交
git add .
git commit -m "feat: 描述具体完成的工作"

# 定期推送到远程备份
git push origin feature/模块名称
```

## 4.3 结束一天工作

```
# 确保所有更改已提交和推送
git push origin feature/模块名称

# 或者，如果工作未完成但想保存进度
git stash
```

## 4.4 完成一个功能

```
# 合并到develop分支
git checkout develop
git pull origin develop
git merge --no-ff feature/模块名称
git push origin develop

# 删除功能分支
git branch -d feature/模块名称
git push origin --delete feature/模块名称

# 如果需要，打上标签
git tag -a vx.x.x-模块名称 -m "描述"
git push origin --tags
```

# 五、解决常见问题

## 5.1 处理合并冲突

```
# 发生冲突时
git status # 查看冲突文件
# 手动解决冲突后
git add 冲突文件
git commit -m "解决合并冲突"
```

## 5.2 撤销更改

```
# 撤销未暂存的更改
git checkout -- 文件名

# 撤销已暂存未提交的更改
git reset HEAD 文件名

# 撤销最近一次提交
git reset --soft HEAD^
```

# 六、可视化工具推荐

1. **Git Graph (VSCode 扩展)**：可视化分支和提交历史
2. **GitLens (VSCode 扩展)**：增强的 Git 功能
3. **Sourcetree**：免费的 Git 图形化客户端
4. **GitKraken**：强大的跨平台 Git 客户端