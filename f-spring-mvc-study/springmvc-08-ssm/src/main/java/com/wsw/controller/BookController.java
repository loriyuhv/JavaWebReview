package com.wsw.controller;

import com.wsw.domain.Book;
import com.wsw.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author loriyuhv
 * @date 2025/8/31 15:11
 * @description
 */
@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public Boolean save(@RequestBody Book book) {
        return bookService.save(book) > 0;
    }

    @PutMapping
    public Boolean update(@RequestBody Book book) {
        return bookService.update(book) > 0;
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable("id") Integer id) {
        return bookService.delete(id) > 0;
    }

    @GetMapping("/{id}")
    public Book findById(@PathVariable("id") Integer id) {
        return bookService.findById(id);
    }

    @GetMapping
    public List<Book> findAll() {
        return bookService.findAll();
    }
}
