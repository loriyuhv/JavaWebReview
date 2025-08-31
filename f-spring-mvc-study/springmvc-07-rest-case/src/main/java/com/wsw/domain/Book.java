package com.wsw.domain;

import lombok.Data;

/**
 * @author loriyuhv
 * @date 2025/8/31 13:20
 * @description 图书类
 */
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
