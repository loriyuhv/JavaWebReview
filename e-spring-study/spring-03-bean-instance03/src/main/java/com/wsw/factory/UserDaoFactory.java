package com.wsw.factory;

import com.wsw.dao.UserDao;
import com.wsw.dao.impl.UserDaoImpl;

/**
 * @author loriyuhv
 * @date 2025/8/26 15:59
 * @description
 */
public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
