package com.wsw.controller;

import com.wsw.common.ApiResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/30 8:51
 */
@Controller
@RequestMapping("/users")
public class UserController {
    @ResponseBody
    @RequestMapping("/delete")
    public ApiResult<String> delete(String name) {
        System.out.println("user controller delete name ===> " + name);
        return ApiResult.ok("user controller servlet delete");
    }
}
