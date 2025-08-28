package com.wsw.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author loriyuhv
 * @date 2025/8/27 21:09
 * @description
 */
public class MyBatisUtil {
    private static final Logger log = LoggerFactory.getLogger(MyBatisUtil.class);
    private static SqlSessionFactory sqlSessionFactory;

    static {
        String resource = "mybatis-config.xml";
        try {
            // 1. 创建SqlSessionFactoryBuilder对象
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            // 2. 加载mybatis-config.xml配置文件
            InputStream inputStream = Resources.getResourceAsStream(resource);
            // 3. 创建SqlSessionFactory对象
            sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }
    }

    // 4. 获取SqlSession
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }

    public static void closeSqlSession(SqlSession sqlSession) {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    // 6. 释放资源
    public static void rollbackSqlSession(SqlSession sqlSession) {
        if (sqlSession != null) {
            sqlSession.rollback();
        }
    }
}
