package com.wsw;

import com.wsw.pojo.Car;

import java.net.URL;

/**
 * @author loriyuhv
 * @date 2025/8/27 8:59
 * @description
 */
public class HelloWorld {
    public static void main(String[] args) {
        // 获取当前类的根路径
        URL resource = HelloWorld.class.getResource("");
        if (resource != null) {
            System.out.println(resource.getPath());
        }

        // 获取Car类的路径
        URL resource1 = Car.class.getResource("");
        assert resource1 != null;
        System.out.println(resource1.getPath());
    }
}
