package com.wsw.dao.impl;

import com.wsw.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author loriyuhv
 * @date 2025/8/26 21:32
 * @description
 */
@Repository("bookDao1")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
