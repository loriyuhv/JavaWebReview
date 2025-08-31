package com.wsw.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author loriyuhv
 * @date 2025/8/31 13:50
 * @description 统一响应类
 */
@Setter
@Getter
public class ApiResponse<T> {
    // Getters 和 Setters
    @JsonProperty("code")
    private int code; // 状态码

    @JsonProperty("message")
    private String message; // 错误信息或成功提示

    @JsonProperty("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data; // 返回的数据

    // 默认构造函数
    public ApiResponse() {
    }

    // 成功响应构造函数
    public ApiResponse(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    // 成功响应构造函数（无数据）
    public ApiResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    // 失败响应构造函数
    public ApiResponse(int code, String message, Map<String, String> errors) {
        this.code = code;
        this.message = message;
        this.data = (T) errors; // 这里将错误信息作为 data 返回
    }

    // 静态方法，用于快速创建成功响应
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(200, "操作成功", data);
    }

    public static <T> ApiResponse<T> success(String message, T data) {
        return new ApiResponse<>(200, message, data);
    }

    public static <T> ApiResponse<T> success(String message) {
        return new ApiResponse<>(200, message);
    }

    // 静态方法，用于快速创建失败响应
    public static <T> ApiResponse<T> failure(int code, String message) {
        return new ApiResponse<>(code, message);
    }

    public static <T> ApiResponse<T> failure(int code, String message, Map<String, String> errors) {
        return new ApiResponse<>(code, message, errors);
    }
}