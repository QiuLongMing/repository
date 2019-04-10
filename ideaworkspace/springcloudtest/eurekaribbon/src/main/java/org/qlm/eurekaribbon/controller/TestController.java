package org.qlm.eurekaribbon.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {


    public static final  String REST_URL="http://service-hi";
    public static final  String REST_URL01="http://service-hi01";
    @Autowired
    private RestTemplate restTemplate;


    @GetMapping(value = "/user/show")
    public String say(){
        return restTemplate.getForObject(REST_URL+"/show",String.class);
    }

    @GetMapping(value = "/user/say")
    public String hello(){



        return restTemplate.getForObject(REST_URL01+"/say",String.class);
    }


}
