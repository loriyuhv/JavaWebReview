package com.wsw.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author loriyuhv
 * @date 2025/8/28 19:21
 * @description
 */
@Aspect
@Component
public class MyAdvice {
    @Pointcut("execution(void com.wsw.dao.*Dao.update(..))")
    public void pointcut1() {}

    @Pointcut("execution(void com.wsw.dao.*Dao.*e*(..))")
    public void pointcut2() {}



    @Around("pointcut1()")
    public Object aroundUpdate(ProceedingJoinPoint joinPoint) throws Throwable {
        return calculateTotalTime(joinPoint);
    }

    @Around("pointcut2()")
    public Object aroundIncludeCharacterE(ProceedingJoinPoint joinPoint) throws Throwable {
        return calculateTotalTime(joinPoint);
    }

    public Object calculateTotalTime(ProceedingJoinPoint joinPoint) throws Throwable {
        Object proceed = null;
        // 记录程序当前执行时间（开始时间）
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            proceed = joinPoint.proceed();
        }
        // 记录程序当前执行时间（结束时间）
        long endTime = System.currentTimeMillis();
        // 计算时间差
        long totalTime = endTime - startTime;
        // 输出信息
        System.out.println("执行万次消耗时间：" + totalTime + "ms");
        return proceed;
    }
}
