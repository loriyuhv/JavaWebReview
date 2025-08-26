package com.wsw.factory;

import com.wsw.dao.UserDao;
import com.wsw.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author loriyuhv
 * @date 2025/8/26 16:05
 * @description
 */
public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    // 代替原始实例工厂中创建对象的方法
    @Override
    public UserDao getObject() {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    @Override
    public boolean isSingleton() {
        // true: 单例  false: 非单例
        return false;
    }
}
