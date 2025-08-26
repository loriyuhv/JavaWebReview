package com.wsw;

import com.wsw.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author loriyuhv
 * @date 2025/8/26 18:19
 * @description Bean的获取三种方式
 */
public class AppFroGetBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        // Bean的获取三种方式
        // 方式一
        BookDao bookDao1 = (BookDao) context.getBean("bookDao");
        bookDao1.save();

        // 方式二
        BookDao bookDao2 = context.getBean("bookDao", BookDao.class);
        bookDao2.save();

        // 方式三
        BookDao bookDao3 = context.getBean(BookDao.class);
        bookDao3.save();
    }
}
