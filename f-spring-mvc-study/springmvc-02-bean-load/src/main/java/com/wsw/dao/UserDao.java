package com.wsw.dao;

import com.wsw.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/30 10:24
 */
@Repository
public interface UserDao {
    @Insert("INSERT INTO tb_user (id, name, age) VALUES (#{id}, #{name}, #{age})")
    Integer save(User user);
}
