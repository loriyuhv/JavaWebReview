package com.wsw.controller;

import com.wsw.common.ApiResult;
import com.wsw.domain.Book;
import org.springframework.web.bind.annotation.*;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/31 12:52
 */
@RestController // @Controller + @ResponseBody
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public ApiResult<String> save(@RequestBody Book book) {
        System.out.println("save a book ==> " + book);
        return ApiResult.ok("save a book ...");
    }

    @DeleteMapping("/{id}")
    public ApiResult<String> delete(@PathVariable Integer id) {
        System.out.println("delete a book by id ==> " + id);
        return ApiResult.ok("delete a book by id ...");
    }

    @PutMapping
    public ApiResult<String> update(@RequestBody Book book) {
        System.out.println("update a book ==> " + book);
        return ApiResult.ok("update a book ...");
    }

    @GetMapping("/{id}")
    public ApiResult<String> getById(@PathVariable Integer id) {
        System.out.println("get a book by id ==> " + id);
        return ApiResult.ok("get a book by id ...");
    }

    @GetMapping
    public ApiResult<String> getAll() {
        System.out.println("get all books ...");
        return ApiResult.ok("get all books ...");
    }
}
