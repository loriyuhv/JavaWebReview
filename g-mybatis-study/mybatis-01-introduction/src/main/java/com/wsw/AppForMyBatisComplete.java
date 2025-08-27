package com.wsw;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author loriyuhv
 * @date 2025/8/27 10:46
 * @description MyBatis完整程序
 */
public class AppForMyBatisComplete {
    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            // 1. 获取SqlSessionBuilder对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            // 2. 获取SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
            // 3. 获取SqlSession对象
            sqlSession = sqlSessionFactory.openSession();
            // 4. 执行SQL语句，处理事务
            int count = sqlSession.insert("insertCar");
            System.out.println(count);
            // int i = 2 / 0;
            // 5. 执行到这里，没有发生任何异常，提交事务，终止事务
            sqlSession.commit();
        } catch (Exception e) {
            // 最好回滚事务
            if (sqlSession != null) {
                sqlSession.rollback();
            }
            // e.printStackTrace(); // 开发阶段使用可以，但项目上线使用日志框架代替
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }


    }
}
