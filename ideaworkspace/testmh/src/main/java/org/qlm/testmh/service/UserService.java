package org.qlm.testmh.service;

import org.qlm.testmh.model.Users;

import java.util.List;

public interface UserService {


    /*根据用户名找用户*/
    Users findByName(String name);

    List<Users> listUser();


}
