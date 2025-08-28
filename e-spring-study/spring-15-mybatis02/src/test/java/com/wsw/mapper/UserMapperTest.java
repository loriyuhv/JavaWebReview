package com.wsw.mapper;

import com.wsw.domain.User;
import com.wsw.mapper.impl.UserMapperImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserMapperTest {
    private final UserMapper userMapper = new UserMapperImpl();

    @Test
    void insertUser() {
        User user = new User();
        user.setName("James");
        user.setAge(45);
        int count = userMapper.insertUser(user);
        assertEquals(1, count);
    }
}