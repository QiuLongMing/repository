package org.qlm.testmh.repository;

import org.qlm.testmh.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<Users,String> {

    /*查看所有用户*/
    List<Users> findBy();
}
