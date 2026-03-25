package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/26 21:56
 */
@Configuration
@ComponentScan("com.wsw")
@Import(JDBCConfig.class)
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {
}
