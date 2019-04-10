package org.qlm.eurekarclient01.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {




    @GetMapping(value = "/say")
    public String getUser(){
        return "eureka";
    }
}
