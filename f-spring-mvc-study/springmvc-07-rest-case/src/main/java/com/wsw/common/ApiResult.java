package com.wsw.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * 统一响应类
 *
 * @author loriyuhv
 * @version 1.0 2025/8/31 13:50
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResult<T> {
    /**
     * 状态码
     */
    @JsonProperty("code")
    private int code;

    /**
     * 错误信息或成功提示
     */
    @JsonProperty("msg")
    private String msg;

    /**
     * 返回数据
     */
    @JsonProperty("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    /***
     * 成功响应体
     *
     * @param data 响应数据
     * @return 响应体
     * @param <T> 数据类型
     */
    public static <T> ApiResult<T> ok(T data) {
        ApiResult<T> r = new ApiResult<>();
        r.code = 200;
        r.msg = "success";
        r.data = data;
        return r;
    }
}