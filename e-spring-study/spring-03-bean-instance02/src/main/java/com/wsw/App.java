package com.wsw;

import com.wsw.dao.OrderDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author loriyuhv
 * @date 2025/8/26 15:36
 * @description 通过静态工厂实例化对象
 */
public class App {
    public static void main(String[] args) {
        // 通过静态工厂创建对象
        // OrderDao orderDao = OrderFactory.getOrderDao();
        // orderDao.save();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        OrderDao orderDao = (OrderDao) context.getBean("orderDao");
        orderDao.save();
    }
}
