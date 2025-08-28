package com.wsw.dao.impl;

import com.wsw.dao.BookDao;

/**
 * @author loriyuhv
 * @date 2025/8/26 17:42
 * @description
 */
public class BookDaoImpl implements BookDao {

    public BookDaoImpl() {
        System.out.println("bookDaoImpl constructor is running ...");
    }

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
