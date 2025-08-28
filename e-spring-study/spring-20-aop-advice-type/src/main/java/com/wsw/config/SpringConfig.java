package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author loriyuhv
 * @date 2025/8/28 17:13
 * @description
 */
@Configuration
@ComponentScan("com.wsw")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}
