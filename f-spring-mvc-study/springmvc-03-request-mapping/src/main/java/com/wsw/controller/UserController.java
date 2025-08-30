package com.wsw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author loriyuhv
 * @date 2025/8/30 12:03
 * @description
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @ResponseBody
    @RequestMapping("/save")
    public String save() {
        System.out.println("user controller save ...");
        return "{'module': 'user controller save'}";
    }

    @ResponseBody
    @RequestMapping("/delete")
    public String delete() {
        System.out.println("user controller delete ...");
        return "{'module': 'user controller delete'}";
    }
}
