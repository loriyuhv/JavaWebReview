package com.wsw.controller;

import com.wsw.common.ApiResult;
import com.wsw.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/30 22:00
 */
@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 普通参数
     */
    @ResponseBody
    @RequestMapping("/common-param")
    public ApiResult<String> commonParam(String name, int age) {
        System.out.println("普通参数传递 name ==> " + name);
        System.out.println("普通参数传递 age ==> " + age);
        return ApiResult.ok("common param");
    }
    
    /**
     * <p>参数不同名：</p>
     * 如果形参与地址参数名不一致, 解决办法，加@RequestParam("name")
     */
    @ResponseBody
    @RequestMapping("/common-param-different-name")
    public ApiResult<String> commonParamDifferentName(@RequestParam("name") String username, int age) {
        System.out.println("普通参数传递 name ===>" + username);
        System.out.println("普通参数传递 age ===>" + age);
        return ApiResult.ok("common param different name");
    }

    /**
     * <p>POJO类型参数：</p>
     * 请求参数与形参对象中的属性对应即可完成参数传递
     */
    @ResponseBody
    @RequestMapping("/pojo-param")
    public ApiResult<String> pojoParam(User user) {
        System.out.println("pojo参数传递 ===>" + user);
        return ApiResult.ok("pojo param");
    }

    /**
     * <p>嵌套POJO类型参数：</p>
     * 请求参数与形参对象中的属性对应即可完成参数传递
     */
    @ResponseBody
    @RequestMapping("/pojo-contain-pojo-param")
    public ApiResult<String> pojoContainPojoParam(User user) {
        System.out.println("pojo嵌套pojo参数传递 ===> " + user);
        return ApiResult.ok("pojo contain pojo param");
    }

    /**
     * <p>数组类型参数：</p>
     * 同名请求参数可以直接映射到对应名称的形参数组对象中。
     */
    @ResponseBody
    @RequestMapping("/array-param")
    public ApiResult<String> arrayParam(String[] likes) {
        System.out.println("数组参数传递 likes ==> " + Arrays.toString(likes));
        return ApiResult.ok("array param");
    }

    /**
     * <p>集合类型参数：</p>
     * 同名请求参数可以使用@RequestParam注解映射到对应名称的集合对象中作为数据。
     */
    @ResponseBody
    @RequestMapping("/list-param")
    public ApiResult<String> listParam(@RequestParam("hobbies") List<String> likes) {
        System.out.println("集合参数传递 ===> " + likes);
        return ApiResult.ok("list param");
    }

    /**
     * <p>JSON普通数组参数：</p>
     * 使用@RequestBody注解将外部传递的json数组映射到形参的集合对象中作为数据
     */
    @ResponseBody
    @RequestMapping("/list-param-for-json")
    // 接收json数据步骤三：使用@RequestBody修饰接受参数
    public ApiResult<String> listParamForJson(@RequestBody List<String> likes) {
        System.out.println("list common(json)参数传递 likes ===> " + likes);
        return ApiResult.ok("list param for json");
    }

    /**
     * <p>JSON对象参数：</p>
     */
    @ResponseBody
    @RequestMapping("/pojo-param-for-json")
    public ApiResult<String> pojoParamForJson(@RequestBody User user) {
        System.out.println("pojo(json)参数传递 user ==> " + user);
        return ApiResult.ok("pojo param for json");
    }

    /**
     * <p>JSON对象数组参数：</p>
     */
    @ResponseBody
    @RequestMapping("/list-pojo-param-for-json")
    public ApiResult<String> listPojoParamForJson(@RequestBody List<User> users) {
        System.out.println("list pojo(json)参数传递 ==> " + users);
        return ApiResult.ok("list pojo param for json");
    }

    /**
     * <p>日期参数：</p>
     */
    @ResponseBody
    @RequestMapping("/date-param")
    public ApiResult<String> dateParam(
            Date date1,
            @DateTimeFormat(pattern="yyyy-MM-dd") Date date2,
            @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date date3) {
        System.out.println("参数传递 date1 ==> " + date1);
        System.out.println("参数传递 date2 ==> " + date2);
        System.out.println("参数传递 date3 ==> " + date3);
        return ApiResult.ok("date param");
    }
}
