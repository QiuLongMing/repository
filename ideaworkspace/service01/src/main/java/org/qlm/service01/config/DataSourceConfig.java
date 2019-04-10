package org.qlm.service01.config;
/*数据源配置类*/

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
/*将配置文件传进来*/
@PropertySource(value = "classpath:application.yml")
public class DataSourceConfig {

    /*利用该对象读配置文件属性*/
    @Autowired
    private Environment ev;


    @Bean(destroyMethod = "close",initMethod = "init")
    public DataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(ev.getRequiredProperty("spring.datasource.url"));
        druidDataSource.setUsername(ev.getRequiredProperty("spring.datasource.username"));
        druidDataSource.setPassword(ev.getRequiredProperty("spring.datasource.password"));
        return druidDataSource;
    }
}
