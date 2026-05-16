package com.wsw.controller;

import com.wsw.common.ApiResult;
import com.wsw.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/31 13:19
 */
@RestController
@RequestMapping("/books")
public class BookController {
    private static final List<Book> books = new ArrayList<>();
    {
        Book book1 = new Book();
        book1.setName("Python入门教程");
        book1.setId(1);
        book1.setType("计算机");
        book1.setDescription("人生苦短，我学Python！！！");
        books.add(book1);

        Book book2 = new Book();
        book2.setName("Java入门教程");
        book2.setId(2);
        book2.setType("计算机");
        book2.setDescription("一次编译，到处运行！！！");
        books.add(book2);

        Book book3 = new Book();
        book3.setName("C语言入门教程");
        book3.setId(3);
        book3.setType("计算机");
        book3.setDescription("运行效率最快的语言！！！");
        books.add(book3);
    }

    /***
     * 保存图书控制器
     * @param book 图书
     * @return 响应
     */
    @PostMapping
    public ApiResult<Book> save(@RequestBody Book book) {
        System.out.println("book save ==> " + book);
        books.add(book);
        return ApiResult.ok(book);
    }

    /***
     * 查询全部图书
     * @return 图书列表
     */
    @GetMapping
    public ApiResult<List<Book>> getAll() {
        System.out.println("book getAll is running ...");
        return ApiResult.ok(books);
    }
}
