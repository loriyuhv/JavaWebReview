package com.wsw;

import com.wsw.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 通过构造方法实例化对象
 * @author loriyuhv
 * @version 1.0 2025/8/26 15:36
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        bookDao.save();
    }
}
