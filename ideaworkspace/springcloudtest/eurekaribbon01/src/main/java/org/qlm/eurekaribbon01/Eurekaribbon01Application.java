package org.qlm.eurekaribbon01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class Eurekaribbon01Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaribbon01Application.class, args);
    }

}
