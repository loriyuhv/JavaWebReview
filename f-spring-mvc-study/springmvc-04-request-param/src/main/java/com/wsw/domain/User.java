package com.wsw.domain;

import lombok.Data;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/30 22:07
 */
@Data
public class User {
    private String name;
    private Integer age;
    private Address address;
}
