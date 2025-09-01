package com.wsw.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author loriyuhv
 * @date 2025/9/1 7:35
 * @description
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
