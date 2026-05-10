package com.wsw.dao.impl;

import com.wsw.dao.CarDao;
import com.wsw.mapper.CarMapper;
import com.wsw.pojo.Car;
import com.wsw.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/27 11:05
 */
public class CarDaoImpl implements CarDao {
    @Override
    public int insertCar(Car car) {
        int count;
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.getSqlSession();
            CarMapper carMapper = sqlSession.getMapper(CarMapper.class);
            count = carMapper.insertCar(car);
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
