package com.wsw.dao.impl;

import com.wsw.dao.CarDao;
import com.wsw.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @author loriyuhv
 * @date 2025/8/27 11:05
 * @description
 */
public class CarDaoImpl implements CarDao {
    @Override
    public int insertCar() {
        int count;
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.getSqlSession();
            count = sqlSession.insert("insertCar");
            // int i = 2 / 0;
            sqlSession.commit();
        }  catch (Exception e) {
            MyBatisUtil.rollbackSqlSession(sqlSession);
            count = 0;
            // e.printStackTrace(); // 测试时用，实际项目用logback
        } finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        return count;
    }
}
