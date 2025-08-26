package com.wsw.service.impl;

import com.wsw.dao.BookDao;
import com.wsw.dao.impl.BookDaoImpl;
import com.wsw.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author loriyuhv
 * @date 2025/8/26 14:26
 * @description
 */
public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao = new BookDaoImpl();

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        bookDao.save();
        System.out.println("book service save ...");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("book service init ...");
    }

    @Override
    public void destroy() {
        System.out.println("book service destroy ...");
    }
}
