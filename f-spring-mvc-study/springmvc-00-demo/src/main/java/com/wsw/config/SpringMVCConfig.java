package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/30 8:49
 */
@EnableWebMvc
@Configuration
@ComponentScan("com.wsw.controller")
public class SpringMVCConfig {
}
