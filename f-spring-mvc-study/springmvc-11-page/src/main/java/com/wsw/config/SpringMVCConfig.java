package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author loriyuhv
 * @date 2025/9/1 5:58
 * @description
 */
@EnableWebMvc
@Configuration
@ComponentScan({"com.wsw.controller", "com.wsw.config"})
public class SpringMVCConfig {
}
