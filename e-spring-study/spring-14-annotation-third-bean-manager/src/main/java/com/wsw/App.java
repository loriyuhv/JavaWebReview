package com.wsw;

import com.wsw.config.SpringConfig;
// import com.wsw.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * @author loriyuhv
 * @date 2025/8/26 21:56
 * @description
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // BookDao bookDao = context.getBean(BookDao.class);
        // bookDao.save();

        // 获取DataSource对象
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println(dataSource);
    }
}
