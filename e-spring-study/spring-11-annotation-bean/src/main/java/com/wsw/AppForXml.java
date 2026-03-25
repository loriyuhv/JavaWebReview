package com.wsw;

import com.wsw.dao.BookDao;
import com.wsw.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注解开发（Spring2.5）：步骤4：运行程序
 *
 * @author loriyuhv
 * @version 1.0 2025/8/26 20:25
 */
public class AppForXml {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        // @Component("bookDao")
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        System.out.println(bookDao);
        bookDao.save();

        // @Component
        // 按名称
        BookService bookService = (BookService) context.getBean("bookServiceImpl");
        System.out.println(bookService);
        bookService.save();

        // 按类型
        BookService bookService1 = context.getBean(BookService.class);
        bookService1.save();
    }
}
