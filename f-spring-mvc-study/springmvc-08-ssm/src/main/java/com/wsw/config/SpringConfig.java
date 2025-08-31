package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author loriyuhv
 * @date 2025/8/31 14:35
 * @description
 */
@Configuration
@EnableTransactionManagement
@PropertySource("classpath:jdbc.properties")
@ComponentScan({"com.wsw.service", "com.wsw.dao"})
@Import({JDBCConfig.class, MyBatisConfig.class})
public class SpringConfig {
}
