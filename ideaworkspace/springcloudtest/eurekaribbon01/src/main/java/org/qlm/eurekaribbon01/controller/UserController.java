package org.qlm.eurekaribbon01.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    private static final  String REST_URL="http://service-hi";

    @Autowired
    private RestTemplate restTemplate;



    @GetMapping("/look")
    public String showUser(){


        return restTemplate.getForObject(REST_URL+"/show",String.class);
    }
}
