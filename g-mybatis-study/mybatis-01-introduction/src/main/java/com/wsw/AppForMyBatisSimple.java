package com.wsw;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author loriyuhv
 * @date 2025/8/27 9:26
 * @description
 */
public class AppForMyBatisSimple {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream stream = Resources.getResourceAsStream(resource);
        // 1. 获取SqlSessionBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 2. 获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(stream); // 一般情况下都是一个数据库对应一个SqlSessionFactory对象
        // 3. 获取SqlSession对象
        // SqlSession sqlSession = sqlSessionFactory.openSession(); // 如果使用的事务管理器是JDBC的话，底层实际上会执行：conn.setAutoCommit(false)
        // 这种方式实际上是不建议的，因为没有开启事务
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 4. 执行SQL
        int insertCar = sqlSession.insert("insertCar");
        System.out.println(insertCar);

        // 5. 手动提交事务
        // sqlSession.commit(); // 如果使用的事务管理器是JDBC的话，底层实际上会执行：conn.setAutoCommit(false)

        // 6. 关闭SqlSession对象
        sqlSession.close();
    }
}
