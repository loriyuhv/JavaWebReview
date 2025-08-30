package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author loriyuhv
 * @date 2025/8/30 9:06
 * @description 3. 创建Spring MVC的配置类，加载controller包下对应的Bean
 */
@Configuration
@ComponentScan("com.wsw.controller")
public class SpringMVCConfig {
}
