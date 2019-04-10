package org.qlm.permission.controller;


import org.qlm.permission.entity.User;
import org.qlm.permission.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    /*显示用户登录页面*/
    @RequestMapping(value = "/login")
    public String showLoginPage(){

        return"login";
    }


    /*用户登录*/
    @RequestMapping("/checklogin")
    public String  checkLogin(ModelMap map, @RequestParam(value = "name" ,required = false) String name, @RequestParam(value = "pwd" ,required = false)String pwd){

        if(name.equals("")||pwd.equals("")||name==null||pwd==null){
            map.addAttribute("message","用户名或者密码不能为空");
        return "redirect:login";
        }
        User user=userService.checkLogin(name,pwd);


        if(user==null){
            map.addAttribute("message","用户名或者密码不正确");
            return "forward:login";

        }
        return "forward:login";
    }



}
