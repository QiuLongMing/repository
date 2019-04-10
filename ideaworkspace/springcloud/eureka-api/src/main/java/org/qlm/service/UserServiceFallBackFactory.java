package org.qlm.service;

import feign.hystrix.FallbackFactory;
import org.qlm.model.Users;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class UserServiceFallBackFactory  implements FallbackFactory<UsersService> {

    @Override
    public UsersService create(Throwable cause) {
        return new UsersService() {
            @Override
            public List<Users> getUsers() {
                List<Users> users=new ArrayList<>();
                Users u=new Users();
                u.setMemo("信息不存在，服务器已降级");
                users.add(u);
                return users;
            }
        };
    }
}
