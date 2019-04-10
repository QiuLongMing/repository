package org.qlm.resource.component;

import org.qlm.resource.bean.Menu;
import org.qlm.resource.bean.Role;
import org.qlm.resource.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;


@Component
public class FilterInvocationSecurityMetadataSourceImpl implements FilterInvocationSecurityMetadataSource {

    @Autowired
    private MenuService menuService;



    //接收用户请求的地址，返回访问该地址需要的所有权限
    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        //得到用户的请求地址,控制台输出一下
        String requestUrl = ((FilterInvocation) o).getRequestUrl();
        System.out.println("用户请求的地址是：" + requestUrl);

        //如果登录页面就不需要权限
        if ("/login".equals(requestUrl)) {
            return null;
        }

        Menu menu = menuService.getMenu(requestUrl);

        //如果没有匹配的url则说明大家都可以访问
        if(menu == null) {
            return SecurityConfig.createList("ROLE_LOGIN");
        }

        //将resource所需要到的roles按框架要求封装返回（ResourceService里面的getRoles方法是基于RoleRepository实现的）
        List<Role> roles = menuService.findRolesByMenuId(menu.getId());
        int size = roles.size();
        String[] values = new String[size];
        for (int i = 0; i < size; i++) {
            values[i] = roles.get(i).getName();
        }
        return SecurityConfig.createList(values);

    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
