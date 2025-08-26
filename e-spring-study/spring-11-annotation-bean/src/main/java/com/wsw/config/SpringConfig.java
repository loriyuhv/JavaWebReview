package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author loriyuhv
 * @date 2025/8/26 20:40
 * @description
 */
// 纯注解开发（Spring3.0）：步骤1: 创建配置类
// 纯注解开发（Spring3.0）：步骤2:标识该类为配置类
@Configuration
// 纯注解开发（Spring3.0）：步骤3:用注解替换包扫描配置
@ComponentScan("com.wsw")
public class SpringConfig {
}
