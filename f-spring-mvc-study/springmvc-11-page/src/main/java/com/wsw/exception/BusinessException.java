package com.wsw.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author loriyuhv
 * @version 1.0 2025/9/1 8:37
 */
@Getter
@Setter
public class BusinessException extends RuntimeException {
    private Integer code;

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
