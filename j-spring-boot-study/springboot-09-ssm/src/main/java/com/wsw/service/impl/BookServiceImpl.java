package com.wsw.service.impl;

import com.wsw.dao.BookDao;
import com.wsw.domain.Book;
import com.wsw.service.BookService;
import org.springframework.stereotype.Service;

/**
 * @author loriyuhv
 * @date 2025/9/2 14:12
 * @description
 */
@Service
public class BookServiceImpl implements BookService {
    private final BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public Book findById(Integer id) {
        return bookDao.findById(id);
    }
}
