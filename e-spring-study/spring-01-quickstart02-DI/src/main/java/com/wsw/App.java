package com.wsw;

import com.wsw.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author loriyuhv
 * @date 2025/8/26 14:27
 * @description
 */
public class App {
    public static void main(String[] args) {
        // 3. 获取IoC容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        // 4. 从容器中获取对象进行方法调用
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.save();
    }
}
