package org.qlm.eurekacustomer8080.controller;
import org.qlm.model.Users;
import org.qlm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class UserController {

  @Autowired
  private UsersService usersService;

  @GetMapping(value = "/users")
  public List<Users> getUsers(){
    System.out.println("---->"+"sdfdfds");
     return usersService.getUsers();
  }




}
