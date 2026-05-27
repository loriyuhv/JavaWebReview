package com.wsw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author loriyuhv
 * @version 1.0 2026/5/27 22:14
 * @since 1.0
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping("/{id}")
    public String getBook(@PathVariable String id) {
        System.out.println("get book id: " + id);
        return "get book id: " + id;
    }
}
