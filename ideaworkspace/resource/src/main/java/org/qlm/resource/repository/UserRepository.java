package org.qlm.resource.repository;


import org.qlm.resource.bean.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<Users,String> {



    /*查找全部用户*/
      List<Users> findAll();



      /*根据用户名找对象集合*/
    List<Users> findByUsername(String username);


}
