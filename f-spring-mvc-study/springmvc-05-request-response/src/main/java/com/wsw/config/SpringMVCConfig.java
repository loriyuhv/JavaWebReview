package com.wsw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/30 22:44
 */
@EnableWebMvc
@Configuration
@ComponentScan("com.wsw.controller")
public class SpringMVCConfig implements WebMvcConfigurer {
    /**
     * 配置 JSP 视图解析器
     * @return 视图解析器对象
     */
    @Bean
    public ViewResolver viewResolver() {
        // 创建InternalResourceViewResolver实例，用于解析JSP视图
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        // 设置视图文件的前缀为根目录"/"
        resolver.setPrefix("/");
        // 设置视图文件的后缀为".jsp"
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
