package org.qlm.resource.service;


import org.qlm.resource.bean.Role;
import org.qlm.resource.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {


    @Autowired
    private RoleRepository roleRepository;


//根据用户名找对应角色
    public List<Role> findRolesByUserName(String username){



        return roleRepository.findRolesOfUser(username);
    };


    /*根据菜单ID找对应的角色*/


    public List<Role> findRolesByMenuId(Integer id){



        return  roleRepository.findRolesOfMenu(id);
    }


}
