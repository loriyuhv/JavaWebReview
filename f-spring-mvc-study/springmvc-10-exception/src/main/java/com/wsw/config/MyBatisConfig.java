package com.wsw.config;

import org.apache.ibatis.logging.slf4j.Slf4jImpl;
import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author loriyuhv
 * @date 2025/9/1 5:53
 * @description
 */
public class MyBatisConfig {
    // 1. SqlSessionFactoryBean
    @Bean
    public SqlSessionFactoryBean getSqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        // 1.1 数据源
        sqlSessionFactoryBean.setDataSource(dataSource);
        // 1.2 别名包
        sqlSessionFactoryBean.setTypeAliasesPackage("com.wsw.domain");
        // 1.3 日志配置
        Configuration configuration = new Configuration();
        configuration.setLogImpl(Slf4jImpl.class);
        sqlSessionFactoryBean.setConfiguration(configuration);
        return sqlSessionFactoryBean;
    }

    // 2. Mapper扫描器配置
    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        // 2.1 配置扫描的包路径，Spring会自动扫描该包下的所有接口，并为每个接口创建代理对象
        mapperScannerConfigurer.setBasePackage("com.wsw.dao");
        return mapperScannerConfigurer;
    }
}
