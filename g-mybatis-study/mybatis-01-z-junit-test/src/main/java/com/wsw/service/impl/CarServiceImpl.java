package com.wsw.service.impl;

import com.wsw.dao.CarDao;
import com.wsw.dao.impl.CarDaoImpl;
import com.wsw.pojo.Car;
import com.wsw.service.CarService;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/27 11:17
 */
public class CarServiceImpl implements CarService {
    private final CarDao carDao = new CarDaoImpl();

    @Override
    public int insertCar(Car car) {
        System.out.println("car service insert car ...");
        return carDao.insertCar(car);
    }
}
