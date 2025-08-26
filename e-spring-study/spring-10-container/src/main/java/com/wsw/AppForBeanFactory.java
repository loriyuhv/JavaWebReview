package com.wsw;

import com.wsw.dao.BookDao;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author loriyuhv
 * @date 2025/8/26 18:23
 * @description 使用BeanFactory加载容器
 */
public class AppForBeanFactory {
    public static void main(String[] args) {
        // 方式一：在Spring6.2.10版本中已经废弃
        // Resource resource = new ClassPathResource("applicationContext.xml");
        // BeanFactory beanFactory = new XmlBeanFactory(resource);
        // BookDao bean = beanFactory.getBean(BookDao.class);
        // bean.save();

        // 方式二：在Spring6.2.10 版本 特点：延迟加载bean
        // 创建BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 创建 XML Bean 定义读取器
        XmlBeanDefinitionReader render = new XmlBeanDefinitionReader(beanFactory);
        // 加载XML配置文件
        render.loadBeanDefinitions(new ClassPathResource("application-context.xml"));

        // BookDao bookDao = beanFactory.getBean(BookDao.class);
        // bookDao.save();

        // 方式三：
        // ApplicationContext ==> ListableBeanFactory ==> BeanFactory(顶层接口)
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        BookDao bean = context.getBean(BookDao.class);
        bean.save();
    }
}
