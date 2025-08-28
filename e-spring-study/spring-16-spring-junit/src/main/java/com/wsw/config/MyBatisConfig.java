package com.wsw.config;

import org.apache.ibatis.logging.slf4j.Slf4jImpl;
import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author loriyuhv
 * @date 2025/8/28 12:22
 * @description
 */
public class MyBatisConfig {
    // SqlSessionFactoryBean
    @Bean
    public SqlSessionFactoryBean getSqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        // 数据源
        sqlSessionFactoryBean.setDataSource(dataSource);
        // 别名包
        sqlSessionFactoryBean.setTypeAliasesPackage("com.wsw.domain");
        // 配置
        Configuration configuration = new Configuration();
        // 配置日志
        configuration.setLogImpl(Slf4jImpl.class);
        sqlSessionFactoryBean.setConfiguration(configuration);
        return sqlSessionFactoryBean;
    }

    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        // mapper映射包
        mapperScannerConfigurer.setBasePackage("com.wsw.dao");
        return mapperScannerConfigurer;
    }
}
