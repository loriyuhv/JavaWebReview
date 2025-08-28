package com.wsw.service.impl;

import com.wsw.domain.User;
import com.wsw.mapper.UserMapper;
import com.wsw.mapper.impl.UserMapperImpl;
import com.wsw.service.UserService;

/**
 * @author loriyuhv
 * @date 2025/8/27 21:17
 * @description
 */
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper = new UserMapperImpl();
    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }
}
