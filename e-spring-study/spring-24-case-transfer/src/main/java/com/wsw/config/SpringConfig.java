package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author loriyuhv
 * @date 2025/8/28 20:33
 * @description
 */
@Configuration
@ComponentScan("com.wsw")
@PropertySource("classpath:jdbc.properties")
@Import({JDBCConfig.class, MyBatisConfig.class})
// 步骤3：开启事务注解
@EnableTransactionManagement
public class SpringConfig {
}
