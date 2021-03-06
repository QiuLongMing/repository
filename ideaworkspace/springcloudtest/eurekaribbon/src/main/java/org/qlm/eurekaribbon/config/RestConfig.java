package org.qlm.eurekaribbon.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/*rest调用的配置类*/
@Configuration
public class RestConfig {



    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){


        return new RestTemplate();
    }
}
