package org.qlm.testjpa.controller;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.qlm.testjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/user")
@RestController
public class UserController {


    @Autowired
    private UserService userService;


    @ApiOperation(value = "根据用户名找用户",notes = "根据用户名找用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",value = "用户名")

    })
    @GetMapping(value = "/viewusers/{name}")
    public Object listUsers(@PathVariable("name") String name){
       return userService.findByName(name);
    }
    @ApiOperation(value = "查看全部用户",notes = "查看全部用户")
    @GetMapping("/getusers")
    public  Object getUsers(){


        return userService.listUser();

    }



}
