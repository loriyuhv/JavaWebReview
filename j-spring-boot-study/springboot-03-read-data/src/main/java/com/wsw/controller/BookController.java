package com.wsw.controller;

import com.wsw.domain.Enterprise;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author loriyuhv
 * @date 2025/9/2 10:07
 * @description
 */
@RestController
@RequestMapping("/books")
public class BookController {
    // 第一种方案
    @Value("${lesson}")
    private String lesson;
    @Value("${server.port}")
    private String port;
    @Value("${enterprise.name}")
    private String name;
    @Value("${enterprise.age}")
    private Integer age;
    @Value("${enterprise.subjects[0]}")
    private String subject1;
    @Value("${enterprise.subjects[1]}")
    private String subject2;
    @Value("${enterprise.subjects[2]}")
    private String subject3;

    // 第二种方案
    private final Environment environment;

    // 第三种方案（常用）
    private final Enterprise enterprise;

    public BookController(Environment environment, Enterprise enterprise) {
        this.environment = environment;
        this.enterprise = enterprise;
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable String id) {
        System.out.println("id ===> " + id);
        System.out.println("lesson ===> " + lesson);
        System.out.println("server.port ===> " + port);
        System.out.println("server.name ===> " + name);
        System.out.println("server.age ===> " + age);
        System.out.println("enterprise.subject1 ==> " + subject1);
        System.out.println("enterprise.subject2 ==> " + subject2);
        System.out.println("enterprise.subject3 ==> " + subject3);

        System.out.println("--------------");
        System.out.println(environment.getProperty("lesson"));
        System.out.println(environment.getProperty("server.port"));
        System.out.println(environment.getProperty("enterprise.name"));
        System.out.println(environment.getProperty("enterprise.age"));
        System.out.println(environment.getProperty("enterprise.subjects[0]"));
        System.out.println(environment.getProperty("enterprise.subjects[1]"));
        System.out.println(environment.getProperty("enterprise.subjects[2]"));
        System.out.println(environment.getProperty("enterprise.tel"));

        System.out.println("--------------");
        System.out.println(enterprise);

        return "Hello spring boot!";
    }

}

