package com.wsw.service.impl;

import com.wsw.dao.BookDao;
import com.wsw.domain.Book;
import com.wsw.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author loriyuhv
 * @date 2025/8/31 15:08
 * @description
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
        return bookDao.delete(id);
    }

    @Override
    public Book findById(Integer id) {
        return bookDao.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }
}
