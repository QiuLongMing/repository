package org.qlm.eurekaclient.controller;


import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {





    @GetMapping(value = "/show")
    public String showUser(){

        return "helloworld";
    }
}
