package org.qlm.resource.repository;

import org.qlm.resource.bean.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RoleRepository extends JpaRepository<Role,String>, JpaSpecificationExecutor<Role> {



    /*根据用户名找对应角色权限*/
    @Query(value = "select r.* from role r inner join ur_link ur on ur.rid = r.id inner join  users u  on u.id=ur.uid where u.username = ?1", nativeQuery = true)
    List<Role> findRolesOfUser(String username);

    /*根据菜单ID找所有角色权限*/
    @Query(value = "select r.* from role r inner join  rm_link  rm  on  rr.rid = r.id where rm.rid = ?1", nativeQuery = true)
    List<Role> findRolesOfMenu(Integer id);
}
