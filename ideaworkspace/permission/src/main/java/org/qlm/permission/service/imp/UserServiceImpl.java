package org.qlm.permission.service.imp;

import org.qlm.permission.entity.User;
import org.qlm.permission.mapper.UserMapper;
import org.qlm.permission.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {



    @Autowired
    private UserMapper userMapper;

    /*检查登录*/
    @Override
    public User checkLogin(String name, String pwd) {
        return userMapper.checkLogin(name,pwd);
    }
/*c查看所有用户*/
    @Override
    public List<User> listUser() {
        return userMapper.listUser();
    }

/*根据ID找用户*/
    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }
/*添加用户*/
    @Override
    public Integer addUser(User user) {
        return userMapper.addUser(user);
    }
/*根据ID删除用户*/
    @Override
    public Integer deleteUserById(Integer id) {
        return userMapper.deleteUserById(id);
    }
}
