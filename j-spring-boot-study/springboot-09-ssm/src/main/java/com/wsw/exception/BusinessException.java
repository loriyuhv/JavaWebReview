package com.wsw.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author loriyuhv
 * @date 2025/9/2 16:32
 * @description
 */
@Setter
@Getter
public class BusinessException extends RuntimeException {
    private Integer code;

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
