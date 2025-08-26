package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author loriyuhv
 * @date 2025/8/26 21:56
 * @description
 */
@Configuration
@ComponentScan("com.wsw")
@Import(JDBCConfig.class)
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {
}
