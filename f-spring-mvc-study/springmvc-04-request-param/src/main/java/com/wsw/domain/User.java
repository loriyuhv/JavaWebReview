package com.wsw.domain;

import lombok.Data;

/**
 * @author loriyuhv
 * @date 2025/8/30 22:07
 * @description
 */
@Data
public class User {
    private String name;
    private Integer age;
    private Address address;
}
