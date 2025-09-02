package com.wsw.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author loriyuhv
 * @date 2025/9/2 10:24
 * @description
 */
@Data
@Component
@ConfigurationProperties(prefix = "enterprise")
public class Enterprise {
    private String name;
    private Integer age;
    private String tel;
    private String[] subjects;
}
