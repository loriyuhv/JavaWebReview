package com.wsw.mapper.impl;

import com.wsw.domain.User;
import com.wsw.mapper.UserMapper;
import com.wsw.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author loriyuhv
 * @date 2025/8/27 21:09
 * @description
 */
public class UserMapperImpl implements UserMapper {
    private static final Logger log = LoggerFactory.getLogger(UserMapperImpl.class);

    @Override
    public int insertUser(User user) {
        int count;
        SqlSession sqlSession = null;
        try {
            // 4. 获取SqlSession
            sqlSession = MyBatisUtil.getSqlSession();
            // 5. 执行SqlSession对象执行查询，获取结果User
            count = sqlSession.insert("MySQL84.insertUser", user);
            sqlSession.commit();
        } catch (Exception e) {
            count = 0;
            log.error(e.getMessage(), e);
            MyBatisUtil.rollbackSqlSession(sqlSession);
        } finally {
            // 6. 释放资源
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        return count;
    }
}
