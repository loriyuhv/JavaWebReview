package com.wsw.service.impl;

import com.wsw.controller.Code;
import com.wsw.dao.BookDao;
import com.wsw.domain.Book;
import com.wsw.exception.SystemException;
import com.wsw.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author loriyuhv
 * @version 1.0 2025/9/1 6:03
 */
@Service
@Transactional
public class BookServiceImpl implements BookService {
    private final BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public Integer save(Book book) {
        return bookDao.save(book);
    }

    @Override
    public Integer update(Book book) {
        return bookDao.update(book);
    }

    @Override
    public Integer delete(Integer id) {
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            throw new SystemException(Code.SYSTEM_TIME_OUT_ERR, e.getMessage());
        }
        return bookDao.delete(id);
    }

    @Override
    public Book findById(Integer id) {
        return bookDao.findById(id);
    }

    @Override
    public List<Book> findByName(String name) {
        return bookDao.findByName(name);
    }

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }
}
