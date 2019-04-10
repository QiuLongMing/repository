package org.qlm.testmh.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.HibernateExceptionTranslator;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * jpa的配置类，包括数据源，事务管理等
 * Created by  on 2019/3/15
 */
// 标明该类使用Spring基于Java的配置
@Configuration
// 读取配置文件的，通过Environment读取
@PropertySource(value = {"classpath:application.yml"})
// scan the package of the annotated configuration class for Spring Data repositories
@EnableJpaRepositories(basePackages = "org.qlm.testmh.repository")
// Enables Spring's annotation-driven transaction management
@EnableTransactionManagement
public class JpaConfig {


    @Autowired
    private Environment env;


    /**
     * 1.配置数据源
     *
     * @return DataSource
     */
    @Bean(destroyMethod = "close",initMethod = "init")
    public DataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(env.getRequiredProperty("spring.datasource.url"));
        druidDataSource.setUsername(env.getRequiredProperty("spring.datasource.username"));
        druidDataSource.setPassword(env.getRequiredProperty("spring.datasource.password"));
        return druidDataSource;
    }

    /**
     * 2.配置EntityManagerFactory
     *
     * @return
     */
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        // 配置数据源
        factory.setDataSource(druidDataSource());
        // VendorAdapter
        HibernateJpaVendorAdapter jpaVendorAdapter=new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setShowSql(true);
        factory.setJpaVendorAdapter(jpaVendorAdapter);
        // entity包扫描路径
        factory.setPackagesToScan("org.qlm.testmh.model");
        // jpa属性
        factory.setJpaProperties(hibernateProperties());
        factory.afterPropertiesSet();
        return factory;
    }

    /**
     * 3.事务管理器配置
     *
     * @return
     */
    @Bean
    public PlatformTransactionManager transactionManager() {
        JpaTransactionManager manager = new JpaTransactionManager();
        manager.setEntityManagerFactory(entityManagerFactory().getObject());
        return manager;
    }
    /**
     * 把HibernateExceptions转换成DataAccessExceptions
     */
    @Bean
    public HibernateExceptionTranslator hibernateExceptionTranslator() {
        return new HibernateExceptionTranslator();
    }
    /**
     * hibernate配置
     * @return
     */
    private Properties hibernateProperties() {
        Properties properties = new Properties();
        // 显示sql语句
        properties.put("hibernate.show_sql", env.getRequiredProperty("spring.jpa.show-sql"));
        // 格式化sql语句
        //properties.put("hibernate.format_sql", env.getRequiredProperty("hibernate.format_sql"));
        // 方言
        properties.put("hibernate.dialect", env.getRequiredProperty("spring.jpa.hibernate.dialect"));
        // 自动生成表
        properties.put("hibernate.hbm2ddl.auto", env.getRequiredProperty("spring.jpa.hibernate.ddl-auto"));
        // 名字策略
        // properties.put("hibernate.ejb.naming_strategy", env.getRequiredProperty("hibernate.ejb.naming_strategy"));
        return properties;
    }




}

