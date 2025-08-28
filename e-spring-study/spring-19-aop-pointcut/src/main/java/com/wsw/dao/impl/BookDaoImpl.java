package com.wsw.dao.impl;

import com.wsw.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author loriyuhv
 * @date 2025/8/28 16:24
 * @description
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }

    @Override
    public void update() {
        System.out.println("book dao update ...");
    }
}
