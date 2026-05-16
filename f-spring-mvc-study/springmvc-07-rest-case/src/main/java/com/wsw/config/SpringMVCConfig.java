package com.wsw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/31 13:19
 */
@EnableWebMvc
@Configuration
@ComponentScan("com.wsw")
public class SpringMVCConfig {
}
