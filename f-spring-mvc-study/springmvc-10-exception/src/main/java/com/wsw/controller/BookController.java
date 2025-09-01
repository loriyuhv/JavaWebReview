package com.wsw.controller;

import com.wsw.domain.Book;
import com.wsw.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author loriyuhv
 * @date 2025/9/1 5:58
 * @description 统一每一个控制器方法返回值
 */
@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public Result<Boolean> save(@RequestBody Book book) {
        Integer flag = bookService.save(book);
        return new Result<>(flag > 0, flag > 0 ? Code.SAVE_OK : Code.SAVE_ERR);
    }

    @PutMapping
    public Result<Boolean> update(@RequestBody Book book) {
        Integer flag = bookService.update(book);
        return  new Result<>(flag > 0, flag > 0 ? Code.UPDATE_OK : Code.UPDATE_ERR);
    }

    @DeleteMapping("/{id}")
    public Result<Boolean> delete(@PathVariable("id") Integer id) {
        Integer flag = bookService.delete(id);
        return  new Result<>(flag > 0, flag > 0 ? Code.DELETE_OK : Code.DELETE_ERR);
    }

    @GetMapping("/{id}")
    public Result<Book> findById(@PathVariable("id") Integer id) {
        // 步骤2:让程序抛出异常
        // int i = 1 / 0;
        Book book = bookService.findById(id);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        String message = book != null ? "" : "数据查询失败，请重试!";
        return new Result<>(book, code, message);
    }

    @GetMapping
    public Result<List<Book>> findAll() {
        List<Book> books = bookService.findAll();
        Integer code = books != null ? Code.GET_OK : Code.GET_ERR;
        String message = books != null ? "" : "数据查询失败，请重试!";
        return new Result<>(books, code, message);
    }
}
