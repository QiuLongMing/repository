package org.qlm.testjpa.service;

import org.apache.catalina.User;
import org.qlm.testjpa.model.Users;

import java.util.List;

public interface UserService {


    /*根据用户名找用户*/
    Users findByName(String name);

    List<Users> listUser();

}
