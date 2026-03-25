package com.wsw;

import com.wsw.dao.OrderDao;
import com.wsw.factory.OrderDaoFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 通过静态工厂实例化对象
 *
 * @author loriyuhv
 * @version 1.0 2025/8/26 15:36
 */
public class App {
    public static void main(String[] args) {
        // 通过静态工厂创建对象
        OrderDao orderDao1 = OrderDaoFactory.getOrderDao();
        orderDao1.save();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        OrderDao orderDao = (OrderDao) context.getBean("orderDao");
        orderDao.save();
    }
}
