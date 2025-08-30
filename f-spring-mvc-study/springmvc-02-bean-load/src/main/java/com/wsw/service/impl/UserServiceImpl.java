package com.wsw.service.impl;

import com.wsw.dao.UserDao;
import com.wsw.pojo.User;
import com.wsw.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author loriyuhv
 * @date 2025/8/30 10:32
 * @description
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Integer save(User user) {
        int result = 0;
        System.out.println("user service save ... user ==> " + user);
        try {
            result = userDao.save(user);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        } finally {
            System.out.println("result ==> " + result);
        }
        return result;
    }
}
