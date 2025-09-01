package com.wsw.controller;

import com.wsw.config.SpringConfig;
import com.wsw.config.SpringMVCConfig;
import com.wsw.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitWebConfig(classes = {SpringMVCConfig.class, SpringConfig.class})
class BookControllerTest {
    @Autowired
    private BookController bookController;

    @Test
    void save() {
        Book book = new Book();
        book.setType("计算机理论");
        book.setName("Rust快速入门");
        book.setDescription("存储最高效的语言！！！");
        Result<Boolean> save = bookController.save(book);
        System.out.println(save);
        assertTrue(save.getData());
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void findById() {
        Result<Book> result = bookController.findById(1);
        System.out.println(result.getData());
    }

    @Test
    void findAll() {
        Result<List<Book>> result = bookController.findAll();
        List<Book> books = result.getData();
        for (Book book : books) {
            System.out.println(book);
        }
    }
}