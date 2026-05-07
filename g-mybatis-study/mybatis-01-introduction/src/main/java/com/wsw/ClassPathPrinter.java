package com.wsw;

import com.wsw.pojo.Car;

import java.net.URL;

/**
 * 演示如何获取Java类的运行时根目录路径（Classpath根路径）。
 * 对于被编译生成的 .class 文件，通过 Class.getResource("") 可以获取该类所在的目录。
 *
 * @author loriyuhv
 * @version 1.0 2025/8/27 8:59
 */
public class ClassPathPrinter {
    public static void main(String[] args) {
        // 获取当前类（ClassPathPrinter）所在目录的绝对路径
        URL resourceClassPathPrinter = ClassPathPrinter.class.getResource("");
        if (resourceClassPathPrinter != null) {
            System.out.println(resourceClassPathPrinter.getPath());
        }

        // 获取 Car 类所在目录的绝对路径
        URL resourceCar = Car.class.getResource("");
        assert resourceCar != null;
        System.out.println(resourceCar.getPath());
    }
}
