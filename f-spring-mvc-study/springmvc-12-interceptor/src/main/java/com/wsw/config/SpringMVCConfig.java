package com.wsw.config;

import com.wsw.controller.interceptor.ProjectInterceptor;
import com.wsw.controller.interceptor.ProjectInterceptor2;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author loriyuhv
 * @date 2025/9/1 10:42
 * @description
 */
@EnableWebMvc
@Configuration
// 步骤3:SpringMVC添加SpringMvcSupport包扫描
// @ComponentScan({"com.wsw.controller", "com.wsw.config"})
@ComponentScan({"com.wsw.controller"})
// 实现接口WebMvcConfigurer 可以简化SpringMVCSupport配置类开发
public class SpringMVCConfig implements WebMvcConfigurer {
    private final ProjectInterceptor projectInterceptor;
    private final ProjectInterceptor2 projectInterceptor2;

    public SpringMVCConfig(ProjectInterceptor projectInterceptor, ProjectInterceptor2 projectInterceptor2) {
        this.projectInterceptor = projectInterceptor;
        this.projectInterceptor2 = projectInterceptor2;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(projectInterceptor).addPathPatterns("/books", "/books/*");
        registry.addInterceptor(projectInterceptor2).addPathPatterns("/books", "/books/*");
    }
}
