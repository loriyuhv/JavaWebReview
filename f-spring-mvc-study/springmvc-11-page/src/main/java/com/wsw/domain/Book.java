package com.wsw.domain;

import lombok.Data;

/**
 * @author loriyuhv
 * @version 1.0 2025/9/1 6:00
 */
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
