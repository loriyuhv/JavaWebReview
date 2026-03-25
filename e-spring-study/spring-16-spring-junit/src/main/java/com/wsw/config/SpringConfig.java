package com.wsw.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/28 12:20
 */
@Configuration
@ComponentScan("com.wsw")
/* Spring 6 默认不会自动扫描 MyBatis Mapper 接口，需要额外配置。 */
@MapperScan("com.wsw.dao")
@PropertySource("classpath:jdbc.properties")
@Import({JDBCConfig.class, MyBatisConfig.class})
public class SpringConfig {
}
