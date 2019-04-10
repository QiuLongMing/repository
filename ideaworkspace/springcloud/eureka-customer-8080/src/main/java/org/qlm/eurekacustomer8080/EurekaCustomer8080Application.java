package org.qlm.eurekacustomer8080;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"org.qlm"})
@ComponentScan("org.qlm")//扫描所有组件
public class EurekaCustomer8080Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCustomer8080Application.class, args);
    }

}
