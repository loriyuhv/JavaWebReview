package com.wsw.service.impl;

import com.wsw.service.BookService;
import org.springframework.stereotype.Service;

/**
 * @author loriyuhv
 * @date 2025/9/2 13:29
 * @description
 */
@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("book service save ...");
    }
}
