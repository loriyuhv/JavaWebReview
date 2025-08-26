package com.wsw;

import com.wsw.dao.BookDao;
import com.wsw.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author loriyuhv
 * @date 2025/8/26 14:27
 * @description Bean的生命周期
 */
public class AppForLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        // 设置容器注册关闭钩子。虚拟机在关闭前先关闭容器
        context.registerShutdownHook();
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        bookDao.save();
        // 这种方式比较暴力
        // context.close();

        BookService bookService = (BookService) context.getBean("bookService");
        bookService.save();
    }
}
