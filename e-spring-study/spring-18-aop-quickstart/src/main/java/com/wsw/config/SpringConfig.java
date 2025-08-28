package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author loriyuhv
 * @date 2025/8/28 15:55
 * @description
 */
@Configuration
@ComponentScan("com.wsw")
// 步骤七：开启Spring对AOP注解驱动支持
@EnableAspectJAutoProxy
public class SpringConfig {
}
