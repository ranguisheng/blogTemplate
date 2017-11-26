package com.ranguisheng.blog.template.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * 数据源配置类
 */
@Configuration
@ComponentScan
@PropertySource(value = {"classpath:primaryjdbc.properties","classpath:secondaryjdbc.properties"},ignoreResourceNotFound = true)
public class DataSourceConfig {
    @Bean(name="primaryDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    public DataSource primaryDataSource(){
        return new DriverManagerDataSource();
    }
    @Bean(name="secondaryDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.secondary")
    public DataSource secondaryDataSource(){
        return new DriverManagerDataSource();
    }
}
