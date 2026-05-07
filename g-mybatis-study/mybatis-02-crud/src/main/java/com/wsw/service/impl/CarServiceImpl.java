package com.wsw.service.impl;

import com.wsw.dao.CarDao;
import com.wsw.dao.impl.CarDaoImpl;
import com.wsw.service.CarService;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/27 17:08
 */
public class CarServiceImpl implements CarService {
    private final CarDao carDao = new CarDaoImpl();

    @Override
    public int insertCar() {
        System.out.println("car service insert a car ...");
        return carDao.insertCar();
    }
}
