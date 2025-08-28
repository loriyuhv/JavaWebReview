package com.wsw.service.impl;

import com.wsw.dao.BookDao;
import com.wsw.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author loriyuhv
 * @date 2025/8/26 21:37
 * @description
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    @Qualifier("bookDao1")
    private BookDao bookDao;

    @Value("${name}")
    // @Value("Jerry")
    private String name;

    // public void setBookDao(BookDao bookDao) {
    //     this.bookDao = bookDao;
    // }

    @Override
    public void save() {
        System.out.println("book service save ..." + name);
        bookDao.save();
    }
}
