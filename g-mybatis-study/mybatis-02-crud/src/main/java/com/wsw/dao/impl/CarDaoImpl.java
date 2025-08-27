package com.wsw.dao.impl;

import com.wsw.dao.CarDao;
import com.wsw.pojo.Car;
import com.wsw.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author loriyuhv
 * @date 2025/8/27 17:07
 * @description
 */
public class CarDaoImpl implements CarDao {
    private static final Logger log = LoggerFactory.getLogger(CarDaoImpl.class);

    @Override
    public int insertCar() {
        SqlSession sqlSession = null;
        int count;

        // 2. 执行SQL语句
        try {
            // 1. 获取SqlSession对象
            sqlSession = MyBatisUtil.getSqlSession();
            // 2. 获取数据
            Car car = new Car();
            car.setCarNum("赣AB5J32");
            car.setCarType("新能源");
            car.setBrand("宝马");
            car.setGuidePrice(480000.00);
            car.setProduceTime("2025-8-23");
            // 3. 执行SQL语句
            count = sqlSession.insert("insertCar", car);
            // 4. 提交事务
            sqlSession.commit();
        } catch (Exception e) {
            count = 0;
            log.error(e.getMessage(), e);
            MyBatisUtil.rollbackSqlSession(sqlSession);
        } finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        return count;
    }
}
