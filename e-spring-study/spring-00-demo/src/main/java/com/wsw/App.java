package com.wsw;

import com.wsw.service.BookService;
import com.wsw.service.impl.BookServiceImpl;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/26 14:27
 */
public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
