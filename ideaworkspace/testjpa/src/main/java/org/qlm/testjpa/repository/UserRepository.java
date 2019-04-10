package org.qlm.testjpa.repository;

import org.apache.catalina.User;
import org.qlm.testjpa.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<Users,String> {


    /*根据名称找用户*/
    Users findByName(String name);

    /*查看所有用户*/
    List<Users> findBy();
}
