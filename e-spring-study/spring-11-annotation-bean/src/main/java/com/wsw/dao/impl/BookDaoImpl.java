package com.wsw.dao.impl;

import com.wsw.dao.BookDao;
import org.springframework.stereotype.Component;

/**
 * @author loriyuhv
 * @date 2025/8/26 20:22
 * @description
 */
// 注解开发（Spring2.5）：步骤2:Dao上添加注解
@Component("bookDao")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
