package com.wsw.domain;

import lombok.Data;

/**
 * @author loriyuhv
 * @date 2025/8/31 14:58
 * @description 模型类
 */
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
