package com.wsw.dao.impl;

import com.wsw.dao.BookDao;

/**
 * @author loriyuhv
 * @date 2025/8/26 15:36
 * @description
 */
public class BookDaoImpl implements BookDao {

    private BookDaoImpl() {
        System.out.println("book dao constructor is running ...");
    }

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
