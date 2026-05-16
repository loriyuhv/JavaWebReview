package com.wsw.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author loriyuhv
 * @version 1.0 2026/5/11 16:55
 * @since 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResult<T> {
    private Integer code;
    private String msg;
    private T data;

    // 成功
    public static <T> ApiResult<T> ok(T data) {
        ApiResult<T> r = new ApiResult<>();
        r.code = 200;
        r.msg = "success";
        r.data = data;
        return r;
    }

    // 失败
    public static <T> ApiResult<T> fail(T data) {
        ApiResult<T> r = new ApiResult<>();
        r.code = 500;
        r.msg = "failure";
        r.data = data;
        return r;
    }
}
