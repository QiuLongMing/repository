package org.qlm.eurekaclient8003.service;



import org.qlm.eurekaclient8003.mapper.UserMapper;
import org.qlm.model.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    /*查找所有用户*/
     public List<Users> getUsers(){
      return userMapper.getUsers();
    }
}
