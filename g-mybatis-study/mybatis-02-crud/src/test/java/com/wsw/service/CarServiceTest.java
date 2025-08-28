package com.wsw.service;

import com.wsw.service.impl.CarServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarServiceTest {

    @Test
    void insertCar() {
        CarService carService = new CarServiceImpl();
        int count = carService.insertCar();
        Assertions.assertTrue(count > 0);
    }
}