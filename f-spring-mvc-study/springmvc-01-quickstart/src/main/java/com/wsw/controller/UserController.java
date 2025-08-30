package com.wsw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author loriyuhv
 * @date 2025/8/30 9:07
 * @description SpringMVC  UserController控制类
 */
// 2. 定义Controller
// 2.1 使用Controller定义Bean
@Controller
public class UserController {
    // 2.3 设置当前操作的返回值类型
    @ResponseBody
    // 2.2 设置当前操作的请求路径
    @RequestMapping("/save")
    public String save() {
        System.out.println("user controller save ...");
        return "{'module': 'Hello spring mvc'}";
    }
}
