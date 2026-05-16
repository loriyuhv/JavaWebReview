package com.wsw.controller;

import com.wsw.common.ApiResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * SpringMVC  UserController控制类
 *
 * @author loriyuhv
 * @version 1.0 2025/8/30 9:07
 */
// 2. 定义Controller
// 2.1 使用Controller定义Bean
@Controller
public class UserController {
    // 2.3 设置当前操作的返回值类型
    @ResponseBody
    // 2.2 设置当前操作的请求路径
    @RequestMapping("/save")
    public ApiResult<String> save() {
        System.out.println("user controller save ...");
        return ApiResult.ok("user controller save success");
    }
}
