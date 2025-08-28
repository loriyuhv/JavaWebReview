package com.wsw;

import com.wsw.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author loriyuhv
 * @date 2025/8/26 15:20
 * @description 测试bean的作用范围
 */
public class AppForScope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        BookService bookService1 = (BookService) context.getBean("bookService");
        BookService bookService2 = (BookService) context.getBean("bookService");
        System.out.println(bookService1);
        System.out.println(bookService2);

    }
}
