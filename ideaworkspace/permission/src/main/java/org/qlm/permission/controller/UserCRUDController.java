package org.qlm.permission.controller;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Delete;
import org.qlm.permission.entity.User;
import org.qlm.permission.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/*用户CRUD操作controller*/
@RequestMapping("/api")
@RestController
public class UserCRUDController {
    @Autowired
    private UserService userService;

    /*查找所有用户*/
     @ApiOperation(value = "查看用户",notes = "查看用户")
     @GetMapping("/user/")
    public List<User> listUsers(){
          return userService.listUser();
    }

   /*根据用户ID查找用户*/
    @ApiOperation(value ="根据ID获取对应用户",notes ="根据ID获取对应用户" )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户ID")
    })
    @GetMapping("/user/{id}")
    public  User getUserById(@PathVariable("id") Integer id){
        return userService.getUserById(id);
    }

    /*添加用户*/
    @ApiOperation(value ="添加用户",notes ="添加用户" )
    @PostMapping("/user/")
    public Object addUser(@RequestBody User user){


        return userService.addUser(user);
    }


    /*根据ID删除用户*/
    @ApiOperation(value ="根据ID删除用户",notes ="根据ID删除用户" )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户ID")
    })
    @DeleteMapping("/user/{id}")
    public Object deleteUser(@PathVariable("id") Integer id){

        return userService.deleteUserById(id);
    }




}
