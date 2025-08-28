package com.wsw.dao.impl;

import com.wsw.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author loriyuhv
 * @date 2025/8/28 17:13
 * @description
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }

    @Override
    public int select() {
        System.out.println("book dao select ...");
        // int i = 2 / 0;
        return 0;
    }
}
