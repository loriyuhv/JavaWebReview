package com.wsw.dao.impl;

import com.wsw.dao.BookDao;

/**
 * BookDao接口实现类
 * @author loriyuhv
 * @version 1.0 2025/8/26 14:25
 */
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }

    // 表示Bean初始化对应的操作
    public void init() {
        System.out.println("book dao init ...");
    }

    // 表示Bean销毁前对应的操作
    public void destroy() {
        System.out.println("book dao destroy ...");
    }
}
