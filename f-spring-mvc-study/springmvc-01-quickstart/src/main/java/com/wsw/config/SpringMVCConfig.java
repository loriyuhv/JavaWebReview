package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/30 9:06
 */
// 3. 创建Spring MVC的配置类，加载controller包下对应的Bean
@EnableWebMvc
@Configuration
@ComponentScan("com.wsw.controller")
public class SpringMVCConfig {
}
