package com.wsw.service.impl;

import com.wsw.dao.CarDao;
import com.wsw.dao.impl.CarDaoImpl;
import com.wsw.service.CarService;

/**
 * @author loriyuhv
 * @date 2025/8/27 11:17
 * @description
 */
public class CarServiceImpl implements CarService {
    private final CarDao carDao = new CarDaoImpl();

    @Override
    public int insertCar() {
        System.out.println("car service insert car ...");
        return carDao.insertCar();
    }
}
