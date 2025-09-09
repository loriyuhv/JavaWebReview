package com.wsw;

import com.wsw.controller.BookController;
import com.wsw.controller.Result;
import com.wsw.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot09SsmApplicationTests {
    @Autowired
    private BookController bookController;

    @Test
    void testFindById() {
        Result<Book> result = bookController.findById(1);
        System.out.println(result);
    }

}
