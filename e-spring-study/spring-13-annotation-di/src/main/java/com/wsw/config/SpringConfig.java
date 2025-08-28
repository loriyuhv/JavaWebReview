package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author loriyuhv
 * @date 2025/8/26 21:39
 * @description
 */
@Configuration
@ComponentScan("com.wsw")
// @PropertySource("jdbc.properties")
@PropertySource("classpath:jdbc.properties") // classpath: 从当前项目根路径找文件
public class SpringConfig {
}
