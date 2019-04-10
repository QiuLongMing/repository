package org.qlm.service;


import org.qlm.model.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
/*feign接口*/
@FeignClient(value = "server-lb",fallbackFactory = UserServiceFallBackFactory.class)
@Component
public interface UsersService  {



    @GetMapping("/user/getusers")
    List<Users> getUsers();
}
