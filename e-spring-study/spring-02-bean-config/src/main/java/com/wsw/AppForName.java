package com.wsw;

import com.wsw.dao.BookDao;
import com.wsw.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author loriyuhv
 * @date 2025/8/26 14:27
 * @description 测试Bean的name属性
 */
public class AppForName {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        BookDao dao = (BookDao) context.getBean("dao");
        dao.save();
        BookDao bookDao1 = (BookDao) context.getBean("bookDao1");
        bookDao1.save();
        BookService bookEbi = (BookService) context.getBean("bookEbi");
        bookEbi.save();
    }
}
