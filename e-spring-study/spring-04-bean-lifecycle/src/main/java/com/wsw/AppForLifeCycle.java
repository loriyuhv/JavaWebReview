package com.wsw;

import com.wsw.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的生命周期
 *
 * @author loriyuhv
 * @version 1.0 2025/8/26 14:27
 */
public class AppForLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        // 设置容器注册关闭钩子。虚拟机在关闭前先关闭容器
        context.registerShutdownHook();

        BookService bookService = (BookService) context.getBean("bookService");
        bookService.save();

        // 这种方式比较暴力
        // context.close();
    }
}
