package com.wsw.config;

import org.springframework.lang.NonNull;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * Servlet容器配置类，替换web.xml
 *
 * @author loriyuhv
 * @version 1.0 2025/8/30 9:10
 */
// 4. 定义一个Servlet容器启动的配置类，在里面加载SpringMVC和SpringCore的配置
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    @Override
    protected @NonNull WebApplicationContext createServletApplicationContext() {
        // 初始化WebApplicationContext对象
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        // 加载指定配置类
        context.register(SpringMVCConfig.class);
        return context;
    }

    // 设置由SpringMVC控制器处理的请求映射路径
    @Override
    protected @NonNull String[] getServletMappings() {
        return new String[]{"/"};
    }

    // 加载Spring配置类
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
