package com.wsw.controller;

import com.wsw.exception.BusinessException;
import com.wsw.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author loriyuhv
 * @date 2025/9/2 16:28
 * @description
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {
    @ExceptionHandler(value = SystemException.class)
    public Result<Object> handleSystemException(BusinessException e) {
        return new Result<>(null, e.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = BusinessException.class)
    public Result<Object> handleBusinessException(BusinessException e) {
        return new Result<>(null, e.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    public Result<String> handleException() {
        System.out.println("服务器未知异常错误！！！");
        return new Result<>(null, Code.SYSTEM_UNKNOWN_ERR, "服务器访问错误，请稍后重试！！！");
    }
}
