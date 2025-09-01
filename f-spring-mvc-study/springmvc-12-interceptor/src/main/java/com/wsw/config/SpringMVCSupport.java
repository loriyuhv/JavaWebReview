package com.wsw.config;

import com.wsw.controller.interceptor.ProjectInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author loriyuhv
 * @date 2025/9/1 10:51
 * @description 步骤2:配置拦截器类
 */
@Configuration
public class SpringMVCSupport extends WebMvcConfigurationSupport {
    private final ProjectInterceptor projectInterceptor;

    public SpringMVCSupport(ProjectInterceptor projectInterceptor) {
        this.projectInterceptor = projectInterceptor;
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
    }

    // 配置拦截器
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        // 步骤5:修改拦截器拦截规则
        registry.addInterceptor(projectInterceptor).addPathPatterns("/books", "/books/*");
    }
}
