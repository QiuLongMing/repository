package org.qlm.eurekaclient8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClient8001Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient8001Application.class, args);
    }

}
