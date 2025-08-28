package com.wsw.config;

import org.apache.ibatis.logging.slf4j.Slf4jImpl;
import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author loriyuhv
 * @date 2025/8/28 0:16
 * @description
 */
public class MyBatisConfig {
    // 定义bean，SqlSessionFactoryBean，用于产生SqlSessionFactory对象
    @Bean
    public SqlSessionFactoryBean getSqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

        // 设置模型类的别名扫描
        sqlSessionFactoryBean.setTypeAliasesPackage("com.wsw.domain");

        // 设置数据源
        sqlSessionFactoryBean.setDataSource(dataSource);

        // 设置LogBack日志
        Configuration configuration = new Configuration();
        configuration.setLogImpl(Slf4jImpl.class);
        sqlSessionFactoryBean.setConfiguration(configuration);

        return sqlSessionFactoryBean;
    }

    // 定义bean，返回MapperScannerConfigurer对象
    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        // Mapper映射文件
        mapperScannerConfigurer.setBasePackage("com.wsw.dao");
        return mapperScannerConfigurer;
    }
}
