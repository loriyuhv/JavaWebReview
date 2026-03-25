package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/28 13:02
 */
@Configuration
@ComponentScan("com.wsw")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}
