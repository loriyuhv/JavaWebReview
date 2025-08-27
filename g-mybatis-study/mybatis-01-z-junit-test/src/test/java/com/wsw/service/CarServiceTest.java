package com.wsw.service;

import com.wsw.pojo.Car;
import com.wsw.service.impl.CarServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.URL;

class CarServiceTest {

    @Test
    void insertCar() {
        CarService carService = new CarServiceImpl();
        int count = carService.insertCar();
        System.out.println(count);
        // 断言：记录数大于0就通过
        Assertions.assertTrue(count > 0);
    }

    @Test
    public void getCarRootPath() {
        // URL resource = Car.class.getResource("/");
        URL resource = Car.class.getResource("");
        Assertions.assertNotNull(resource);
        System.out.println(resource.getPath());
    }
}