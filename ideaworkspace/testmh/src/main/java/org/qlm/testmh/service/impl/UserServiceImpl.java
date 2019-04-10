package org.qlm.testmh.service.impl;

import org.qlm.testmh.mapper.UserMapper;
import org.qlm.testmh.model.Users;
import org.qlm.testmh.repository.UserRepository;
import org.qlm.testmh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Resource
    private UserMapper userMapper;

    @Override
    public Users findByName(String name) {

        System.out.println("----"+name);
        return userMapper.getUserByName(name);
    }

    @Override
    public List<Users> listUser() {
        return userRepository.findBy();
    }
}
