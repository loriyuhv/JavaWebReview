package com.wsw.controller.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author loriyuhv
 * @date 2025/9/1 10:48
 * @description 步骤1:创建拦截器类
 */
// 定义拦截器类，实现HandlerInterceptor接口
// 注意当前类必须受Spring容器控制
@Component
public class ProjectInterceptor implements HandlerInterceptor {
    // 原始方法调用前执行的内容 实用性最强
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String contentType = request.getHeader("Content-Type");
        System.out.println("preHandle ... contentType: " + contentType);
        return true;
    }

    // 原始方法调用后执行的内容
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        System.out.println("postHandle");
    }

    // 原始方法调用完成后执行的内容
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        System.out.println("afterCompletion");
    }
}
