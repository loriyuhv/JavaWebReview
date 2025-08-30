package com.wsw.dao;

import com.wsw.pojo.User;
import org.apache.ibatis.annotations.Insert;

/**
 * @author loriyuhv
 * @date 2025/8/30 10:24
 * @description
 */
public interface UserDao {
    @Insert("INSERT INTO tb_user (id, name, age) VALUES (#{id}, #{name}, #{age})")
    Integer save(User user);
}
