package com.wsw.service;

import com.wsw.domain.Book;

/**
 * @author loriyuhv
 * @date 2025/9/2 14:11
 * @description
 */
public interface BookService {
    Book findById(Integer id);
}
