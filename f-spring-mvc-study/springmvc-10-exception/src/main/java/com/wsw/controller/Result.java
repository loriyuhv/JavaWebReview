package com.wsw.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author loriyuhv
 * @date 2025/9/1 6:10
 * @description 响应结果封装类
 */
@Data
@AllArgsConstructor
public class Result<T> {
    // 描述统一格式中的数据
    private T data;
    // 描述统一格式中的编码，用于区分操作，可以简化配置0或1表示成功失败
    private Integer code;
    // 描述统一格式中的消息，可选属性
    private String message;

    public Result(T data, Integer code) {
        this.data = data;
        this.code = code;
    }
}
