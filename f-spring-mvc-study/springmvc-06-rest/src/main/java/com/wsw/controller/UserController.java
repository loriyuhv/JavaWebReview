package com.wsw.controller;

import com.wsw.common.ApiResult;
import com.wsw.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/31 12:46
 */
@Controller
public class UserController {
    /**
     * POST：新增
     */
    @ResponseBody
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public ApiResult<String> save(@RequestBody User user) {
        System.out.println("user controller save ==> " + user);
        return ApiResult.ok("save a user ...");
    }

    /**
     * DELETE：删除
     */
    @ResponseBody
    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public ApiResult<String> delete(@PathVariable Integer id) {
        System.out.println("user controller delete ==> " + id);
        return ApiResult.ok("delete a user ...");
    }

    /**
     * PUT：更新
     */
    @ResponseBody
    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    public ApiResult<String> update(@RequestBody User user) {
        System.out.println("user controller update ==> " + user);
        return ApiResult.ok("update a user ...");
    }

    /**
     * getById
     */
    @ResponseBody
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public ApiResult<String> getById(@PathVariable Integer id) {
        System.out.println("user controller getById ==> " + id);
        return ApiResult.ok("get a user by id ...");
    }

    @ResponseBody
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ApiResult<String> getAllUsers() {
        System.out.println("user controller getAllUsers ..." );
        return ApiResult.ok("get all users ...");
    }
}
