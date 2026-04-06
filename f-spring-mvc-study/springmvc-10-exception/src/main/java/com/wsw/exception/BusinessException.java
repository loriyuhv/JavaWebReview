package com.wsw.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * 业务异常处理
 * @author loriyuhv
 * @version 2025/9/1 7:35
 */
@Getter
@Setter
public class BusinessException extends RuntimeException {
    private Integer code;

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    // public BusinessException(Integer code, String message, Throwable cause) {
    //     super(message, cause);
    //     this.code = code;
    // }
}
