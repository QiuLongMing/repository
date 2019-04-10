package org.qlm.testmh.controller;


import org.qlm.testmh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/getuser/{name}")
    public Object getUserByName(@PathVariable String name){

    System.out.println(name);

        return userService.findByName(name);
    }

    @GetMapping("/getusers")
    public Object getUsers(){


        return userService.listUser();
    }
}
