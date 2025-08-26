package com.wsw.dao.impl;

import com.wsw.dao.BookDao;

/**
 * @author loriyuhv
 * @date 2025/8/26 14:25
 * @description BookDao接口实现类
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
