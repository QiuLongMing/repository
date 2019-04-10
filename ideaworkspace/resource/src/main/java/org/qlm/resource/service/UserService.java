package org.qlm.resource.service;

import org.qlm.resource.bean.UserDetailsImpl;
import org.qlm.resource.bean.Users;
import org.qlm.resource.repository.RoleRepository;
import org.qlm.resource.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

//框架需要使用到一个实现了UserDetailsService接口的类
@Service
public class UserService implements UserDetailsService {




    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleService roleService;





    @Transactional
    public List<Users> getAllUser()
    {
        return userRepository.findAll();
    }

    @Transactional
   public List<Users> getByUsername(String username)
    {
        return userRepository.findByUsername(username);
    }


    //重写UserDetailsService接口里面的抽象方法
    //根据用户名 返回一个UserDetails的实现类的实例
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        System.out.println("查找用户：" + s);
        Users user = getByUsername(s).get(0);
        if(user == null)
        {
            throw new UsernameNotFoundException("没有该用户");
        }

        //查到User后将其封装为UserDetails的实现类的实例供程序调用
        //用该User和它对应的Role实体们构造UserDetails的实现类
        return new UserDetailsImpl(user, roleService.findRolesByUserName(user.getUsername()));


    }



}
