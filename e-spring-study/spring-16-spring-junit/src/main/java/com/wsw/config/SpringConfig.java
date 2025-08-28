package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author loriyuhv
 * @date 2025/8/28 12:20
 * @description
 */
@Configuration
@ComponentScan("com.wsw")
@PropertySource("classpath:jdbc.properties")
@Import({JDBCConfig.class, MyBatisConfig.class})
public class SpringConfig {
}
