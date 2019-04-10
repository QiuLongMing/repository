package org.qlm.resource.service;


import org.qlm.resource.bean.Menu;
import org.qlm.resource.bean.Role;
import org.qlm.resource.repository.MenuRepository;
import org.qlm.resource.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private RoleRepository roleRepository;


    public Menu getMenu(String url){


        return menuRepository.findByUrl(url);
    }


    /*根据菜单ID找对应的角色*/


    public List<Role> findRolesByMenuId(Integer id){



        return  roleRepository.findRolesOfMenu(id);
    }

}
