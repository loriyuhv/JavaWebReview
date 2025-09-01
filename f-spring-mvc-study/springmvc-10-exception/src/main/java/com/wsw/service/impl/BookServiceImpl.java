package com.wsw.service.impl;

import com.wsw.controller.Code;
import com.wsw.dao.BookDao;
import com.wsw.domain.Book;
import com.wsw.exception.BusinessException;
import com.wsw.exception.SystemException;
import com.wsw.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author loriyuhv
 * @date 2025/9/1 6:03
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
        if (id == 1) {
            throw new BusinessException(Code.BUSINESS_ERR, "请不要用你的技术挑战我的耐心！");
        }
        // 将可能出现的异常进行包装，转换成自定义异常
        try {
            // int i = 1 / 0;
            System.out.println("error!");
        } catch (Exception e) {
            throw new SystemException(Code.SYSTEM_TIME_OUT_ERR, "服务器访问超时，请重试！", e);
        }

        return bookDao.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }
}
