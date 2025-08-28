package com.wsw.service.impl;

import com.wsw.dao.BookDao;
import com.wsw.dao.impl.BookDaoImpl;
import com.wsw.service.BookService;

/**
 * @author loriyuhv
 * @date 2025/8/26 14:26
 * @description
 */
public class BookServiceImpl implements BookService {
    // 5. 删除业务层中使用new的方式创建的dao对象
    private BookDao bookDao = new BookDaoImpl();

    // 6. 为属性提供setter方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        bookDao.save();
        System.out.println("book service save ...");
    }
}
