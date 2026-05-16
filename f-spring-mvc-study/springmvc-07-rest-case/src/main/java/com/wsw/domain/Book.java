package com.wsw.domain;

import lombok.Data;

/**
 * 图书类
 * @author loriyuhv
 * @version 1.0 2025/8/31 13:20
 */
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
