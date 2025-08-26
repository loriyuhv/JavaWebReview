package com.wsw;

import com.wsw.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author loriyuhv
 * @date 2025/8/26 17:43
 * @description Spring容器创建的两种方式
 */
public class AppForCreateContainer {
    public static void main(String[] args) {
        // 容器的创建方式
        // 1.类路径下的XML配置文件
        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("application-context.xml");
        BookDao bookDao1 = (BookDao) context1.getBean("bookDao");
        bookDao1.save();

        // 2.文件系统下的XML配置文件
        FileSystemXmlApplicationContext context2 = new FileSystemXmlApplicationContext("../e-spring-study/spring-10-container/src/main/resources/application-context.xml");
        BookDao bookDao2 = (BookDao) context2.getBean("bookDao");
        bookDao2.save();
    }
}
