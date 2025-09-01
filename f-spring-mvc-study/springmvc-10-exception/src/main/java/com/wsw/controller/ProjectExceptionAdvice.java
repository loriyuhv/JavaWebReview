package com.wsw.controller;

import com.wsw.exception.BusinessException;
import com.wsw.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author loriyuhv
 * @date 2025/9/1 7:08
 * @description 步骤1:创建异常处理器类
 */
// @RestControllerAdvice用于标识当前类为REST风格对应的异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result<Object> doSystemException(SystemException e) {
        // 记录日志
        // 发送消息给运维
        // 发送邮件给开发人员 e对象发送给开发人员
        return new Result<>(null, e.getCode(), e.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result<Object> doException(BusinessException e) {
        return new Result<>(null, e.getCode(), e.getMessage());
    }

    // 除了自定义的异常处理器，保留对Exception类型的异常处理，用于处理非预期的异常
    @ExceptionHandler(Exception.class)
    public Result<Object> doException(Exception e) {
        // 记录日志
        // 发送消息给运维
        // 发送邮件给开发人员 e对象发送给开发人员
        System.out.println(e.getMessage());
        return new Result<>(null, Code.SYSTEM_UNKNOWN_ERR, "系统繁忙，请稍后重试！");
    }
}
