package org.qlm.eurekarclient01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eurekarclient01Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekarclient01Application.class, args);
    }

}
