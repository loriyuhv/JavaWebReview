package com.wsw.controller;

import com.wsw.exception.BusinessException;
import com.wsw.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author loriyuhv
 * @date 2025/9/1 8:30
 * @description
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {
    @ExceptionHandler(value = SystemException.class)
    public Result<Object> handleSystemException(SystemException e) {
        return new Result<>(null, e.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = BusinessException.class)
    public Result<Object> handleBusinessException(BusinessException e) {
        return new Result<>(null, e.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    public Result<Object> handleException(Exception e) {
        System.out.println(e.getMessage());
        return new Result<>(null, Code.SYSTEM_UNKNOWN_ERR, e.getMessage());
    }
}
