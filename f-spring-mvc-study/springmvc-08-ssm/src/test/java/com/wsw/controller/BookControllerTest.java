package com.wsw.controller;

import com.wsw.config.SpringConfig;
import com.wsw.config.SpringMVCConfig;
import com.wsw.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitWebConfig(classes = {SpringMVCConfig.class, SpringConfig.class})
class BookControllerTest {
    @Autowired
    private BookController bookController;

    @Test
    void save() {
        Book book = new Book();
        book.setType("计算机理论");
        book.setName("Python快速入门");
        book.setDescription("人生苦短，我学Python！！！");
        Boolean save = bookController.save(book);
        assertTrue(save);
    }

    @Test
    void update() {
        Book book = new Book();
        book.setId(17);
        book.setType("计算机理论");
        book.setName("Java快速入门");
        book.setDescription("一次编写，到处运行！！！");
        Boolean save = bookController.update(book);
        assertTrue(save);
    }

    @Test
    void delete() {
        Boolean delete = bookController.delete(17);
        assertTrue(delete);
    }

    @Test
    void findById() {
        Book book = bookController.findById(16);
        assertNotNull(book);
        System.out.println("book ==> " + book);
    }

    @Test
    void findAll() {
        for (Book book : bookController.findAll()) {
            System.out.println("book ==> " + book);
        }
    }
}