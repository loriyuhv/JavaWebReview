package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author loriyuhv
 * @date 2025/8/31 14:47
 * @description
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.wsw.controller")
public class SpringMVCConfig {
}
