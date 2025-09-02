package com.wsw;

import com.wsw.dao.BookDao;
import com.wsw.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot08MybatisApplicationTests {
    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        Book book = bookDao.findById(3);
        String name = book.getName();
        book.setName("《" + name + "》");
        System.out.println(book);
    }

}
