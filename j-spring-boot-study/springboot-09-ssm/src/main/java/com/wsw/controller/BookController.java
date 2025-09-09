package com.wsw.controller;

import com.wsw.domain.Book;
import com.wsw.exception.SystemException;
import com.wsw.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author loriyuhv
 * @date 2025/9/2 14:13
 * @description
 */
@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{id}")
    public Result<Book> findById(@PathVariable Integer id) {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            throw new SystemException(Code.SYSTEM_TIME_OUT_ERR, e.getMessage());
        }
        return new Result<>(bookService.findById(id), Code.GET_OK);
    }
}
