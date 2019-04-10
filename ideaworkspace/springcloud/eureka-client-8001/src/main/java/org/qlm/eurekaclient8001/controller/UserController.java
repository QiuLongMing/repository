package org.qlm.eurekaclient8001.controller;

import org.qlm.eurekaclient8001.service.UserService;

import org.qlm.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;


    @GetMapping("/getusers")
    private List<Users> getUsers(){
        return userService.getUsers();
    }







}
