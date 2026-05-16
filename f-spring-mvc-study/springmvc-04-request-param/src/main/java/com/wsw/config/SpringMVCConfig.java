package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/30 22:00
 */
// 接收json数据步骤二：使用@EnableWebMvc启用WebMvc
@EnableWebMvc
@Configuration
@ComponentScan("com.wsw.controller")
public class SpringMVCConfig {
}
