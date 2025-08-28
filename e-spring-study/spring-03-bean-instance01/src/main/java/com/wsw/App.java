package com.wsw;

import com.wsw.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author loriyuhv
 * @date 2025/8/26 15:36
 * @description 通过构造方法实例化对象
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        bookDao.save();
    }
}
