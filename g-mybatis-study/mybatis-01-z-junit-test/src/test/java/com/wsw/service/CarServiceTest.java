package com.wsw.service;

import com.wsw.pojo.Car;
import com.wsw.service.impl.CarServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.net.URL;
import java.time.LocalDate;

class CarServiceTest {

    @Test
    void insertCar() {
        CarService carService = new CarServiceImpl();
        Car car = new Car(
                null,
                "京A01128",
                "奥迪",
                BigDecimal.valueOf(48.32),
                LocalDate.parse("2026-03-15"),
                "燃油轿车"
        );
        int count = carService.insertCar(car);
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