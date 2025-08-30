package com.wsw.controller;

import com.wsw.pojo.User;
import com.wsw.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author loriyuhv
 * @date 2025/8/30 10:27
 * @description
 */
@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ResponseBody
    @RequestMapping("/user/save")
    public String save(@RequestBody User user) {
        System.out.println("user controller save ... user ==> " + user);
        Integer count = userService.save(user);
        return count == 1 ? "{'module': 'save success!!!'}" : "{'module': 'save failed!!!'}";
    }
}
