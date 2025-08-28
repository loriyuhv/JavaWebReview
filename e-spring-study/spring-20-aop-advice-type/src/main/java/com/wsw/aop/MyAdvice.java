package com.wsw.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author loriyuhv
 * @date 2025/8/28 17:14
 * @description
 */
@Aspect
@Component
public class MyAdvice {
    @Pointcut("execution(void com.*.*.*Dao.save())")
    public void pt1() {}

    @Pointcut("execution(int com.*.*.*Dao.select())")
    public void pt2() {}

    // 前置通知
    @Before("pt1()")
    public void beforeSave() {
        System.out.println("before advice...");
    }

    // 后置通知
    @After("pt1()")
    public void afterSave() {
        System.out.println("after advice...");
    }

    // 环绕通知
    @Around("pt2()")
    public Integer aroundSelect(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around before advice...");
        Integer ret = (Integer) joinPoint.proceed();
        System.out.println("around after advice...");
        return ret + 200;
    }

    // 返回后通知
    @AfterReturning("pt2()")
    public void afterReturningSelect() {
        System.out.println("afterReturning advice...");
    }

    // 异常后通知
    @AfterThrowing("pt2()")
    public void afterThrowingSelect() {
        System.out.println("afterThrowing advice...");
    }
}
