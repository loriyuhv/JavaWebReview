package com.wsw.controller;

import com.wsw.common.ApiResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/30 21:54
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @ResponseBody
    @RequestMapping("/save")
    public ApiResult<String> save() {
        System.out.println("book controller save ...");
        return ApiResult.ok("book controller save");
    }

    @ResponseBody
    @RequestMapping("/delete")
    public ApiResult<String> delete() {
        System.out.println("book controller delete ...");
        return ApiResult.ok("book controller delete");
    }
}
