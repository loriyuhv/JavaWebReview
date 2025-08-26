package com.wsw;

import com.wsw.config.SpringConfig;
import com.wsw.dao.BookDao;
import com.wsw.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author loriyuhv
 * @date 2025/8/26 20:42
 * @description 纯注解开发（Spring3.0）：步骤4:创建运行类并执行
 */
public class AppForAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = context.getBean(BookDao.class);
        System.out.println(bookDao);

        BookService bookService = context.getBean(BookService.class);
        System.out.println(bookService);
    }
}
