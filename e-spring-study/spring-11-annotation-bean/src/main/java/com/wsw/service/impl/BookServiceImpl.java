package com.wsw.service.impl;

import com.wsw.service.BookService;
import org.springframework.stereotype.Component;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/26 20:23
 */
// 注解开发（Spring2.5）：步骤5: Service上添加注解
@Component
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("book service save ...");
    }
}
