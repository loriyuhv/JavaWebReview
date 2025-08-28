package com.wsw.dao.impl;

import com.wsw.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author loriyuhv
 * @date 2025/8/28 15:56
 * @description
 */
// 步骤二：定义dao接口与实现类
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("bookDao save ...");
    }

    @Override
    public void update() {
        System.out.println("bookDao update ...");
    }

    @Override
    public void delete() {
        System.out.println("bookDao delete ...");
    }
}
