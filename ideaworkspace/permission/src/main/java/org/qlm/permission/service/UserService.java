package org.qlm.permission.service;

import org.qlm.permission.entity.User;

import java.util.List;

public interface UserService {

    /*登录检查*/
    User checkLogin(String name, String pwd);


    /*查询所有用户*/
    List<User> listUser();

    /*根据用户ID找用户*/
    User getUserById(Integer id);


    /*添加用户*/

    Integer addUser(User user);


    /*根据ID删除用户*/
    Integer deleteUserById(Integer id);
}
