package com.wsw.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author loriyuhv
 * @date 2025/8/28 16:26
 * @description 通知类
 */
@Component
@Aspect
public class MyAdvice {
    // 1. 定义切入点
    // @description 匹配接口
    // @Pointcut("execution(void com.wsw.dao.BookDao.update())")
    
    // @description 匹配实现类
    // @Pointcut("execution(void com.wsw.dao.impl.BookDaoImpl.update())")

    // @description 返回值任意
    // @Pointcut("execution(* com.wsw.dao.impl.BookDaoImpl.update())")

    // @description 返回值任意，但是update方法必须要有一个参数
    // @Pointcut("execution(* com.wsw.dao.impl.BookDaoImpl.update(*))")

    // @description 返回值为void，匹配com包下任意三层子包中的任意类的update方法
    // @Pointcut("execution(void com.*.*.*.*.update())")

    // @description 返回值为void，匹配任意包中的任意类的update方法
    // @Pointcut("execution(void *..update())")

    // @description 返回值任意，匹配任意包中的任意类下的任意方法，且方法参数为0或多个
    // @Pointcut("execution(* *..*(..))")

    // @description 返回值任意，匹配任意包中的任意类下的以u开头方法，且方法参数为0或多个
    // @Pointcut("execution(* *..*u*(..))")

    // @description 返回值任意，匹配任意包中的任意类下的以e结尾方法，且方法参数为0或多个
    // @Pointcut("execution(* *..*e(..))")

    // @description 返回值为void，匹配com包下的任意子包中的任意类下的方法
    // @Pointcut("execution(void com..*())")

    // @description 返回值为void，匹配com.wsw包下的子包中的任意业务层接口下的find开头的方法
    // @Pointcut("execution(* com.wsw.*.*Service.find*(..))")

    // @description 返回值为void，匹配com.wsw包下的子包中的任意业务层接口下的save开头的方法
    // @Pointcut("execution(* com.wsw.*.*Service.save*(..))")
    
    /**
     * @description 体会方法参数列表中*和..的区别
     * (*)：一个或多个参数
     * (..)：0个或多个参数
     */
    @Pointcut("execution(void com..*Dao.save(..))")
    public void pt() {}

    // 3. 绑定切入点与通知（创建切面）
    @Before("pt()")
    // 2. 定义通知
    public void method() {
        System.out.println(System.currentTimeMillis());
    }
}
