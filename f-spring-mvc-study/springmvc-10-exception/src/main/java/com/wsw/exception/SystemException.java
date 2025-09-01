package com.wsw.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author loriyuhv
 * @date 2025/9/1 7:31
 * @description
 */
@Getter
@Setter
public class SystemException extends RuntimeException {
    private Integer code;

    // public SystemException(Integer code, String message) {
    //     super(message);
    //     this.code = code;
    // }

    public SystemException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
