package com.wsw.dao.impl;

import com.wsw.dao.BookDao;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
// import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * @author loriyuhv
 * @date 2025/8/26 21:03
 * @description
 * 注意：为什么 @PreDestroy 在 prototype 作用域下不生效？
 * Spring容器管理的生命周期：
 * 对于 singleton 作用域的 Bean，Spring 容器负责创建和销毁。因此，@PreDestroy 注解在容器关闭时被调用。
 * 对于 prototype 作用域的 Bean，Spring 容器只负责创建 Bean，但不负责销毁。因此，@PreDestroy 注解不会被调用。
 */
@Repository
// Scope注解：配置bean的作用范围：prototype：原型 singleton：单例（默认）
// @Scope("prototype")
public class BookDaoImpl implements BookDao {

    public BookDaoImpl() {
        System.out.println("BookDaoImpl is constructed ...");
    }

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }

    // 在构造方法之后执行，替换 init-method
    @PostConstruct
    public void init() {
        System.out.println("book dao init ...");
    }

    // 在销毁方法之前执行,替换 destroy-method
    @PreDestroy
    public void destroy() {
        System.out.println("book dao destroy ...");
    }
}
