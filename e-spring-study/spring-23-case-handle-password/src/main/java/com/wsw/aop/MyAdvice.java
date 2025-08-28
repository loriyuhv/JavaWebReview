package com.wsw.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author loriyuhv
 * @date 2025/8/28 18:34
 * @description
 */
@Aspect
@Component
public class MyAdvice {
    @Pointcut("execution(boolean com.wsw.service.*Service.openURL(..))")
    public void pt() {}

    @Around("pt()")
    public Object trimString(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println("args" + Arrays.toString(args));

        for (int i = 0; i < args.length; i++) {
            if (args[i] instanceof String) {
                args[i] =args[i].toString().trim();
            }
        }

        return pjp.proceed(args);
    }
}
