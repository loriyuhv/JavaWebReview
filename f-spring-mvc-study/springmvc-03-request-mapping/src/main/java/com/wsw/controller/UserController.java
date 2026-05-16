package com.wsw.controller;

import com.wsw.common.ApiResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/30 12:03
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @ResponseBody
    @RequestMapping("/save")
    public ApiResult<String> save() {
        System.out.println("user controller save ...");
        return ApiResult.ok("user controller save");
    }

    @ResponseBody
    @RequestMapping("/delete")
    public ApiResult<String> delete() {
        System.out.println("user controller delete ...");
        return ApiResult.ok("user controller delete");
    }
}
