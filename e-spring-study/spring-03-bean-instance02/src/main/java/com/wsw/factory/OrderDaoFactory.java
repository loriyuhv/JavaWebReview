package com.wsw.factory;

import com.wsw.dao.OrderDao;
import com.wsw.dao.impl.OrderDaoImpl;

/**
 * @author loriyuhv
 * @date 2025/8/26 15:46
 * @description
 */
public class OrderDaoFactory {
    public static OrderDao getOrderDao() {
        // 有人问，直接new不就行了吗？回答：工厂里可能做些初始化的事情。
        System.out.println("factory setup ...");
        return new OrderDaoImpl();
    }
}
