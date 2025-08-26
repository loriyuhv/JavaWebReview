package com.wsw;

import com.wsw.dao.UserDao;
import com.wsw.factory.UserDaoFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author loriyuhv
 * @date 2025/8/26 16:00
 * @description 通过实例工厂实例化Bean
 */
public class App {
    public static void main(String[] args) {
        // 创建实例工厂对象
        UserDaoFactory userDaoFactory = new UserDaoFactory();
        // 通过实例工厂对象创建Bean
        UserDao userDao1 = userDaoFactory.getUserDao();
        userDao1.save();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        UserDao userDao2 = (UserDao) context.getBean("userDao");
        UserDao userDao3 = (UserDao) context.getBean("userDao");
        userDao2.save();
        userDao3.save();

        System.out.println(userDao2);
        System.out.println(userDao3);

    }
}
