package org.qlm.permission.mapper;


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.qlm.permission.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {


    /*登录检查*/
    @Select(value = "select * from users where name='${name}' and  pwd='${pwd}'")
    User checkLogin(@Param("name") String name, @Param("pwd")String pwd);


    /*查找所有用户*/
    @Select(value = "select * from users")
    List<User> listUser();


   /*根据用户ID找对应的用户*/
    @Select(value = "select * from users where id=${id} ")
    User getUserById(@Param("id") Integer id);


    /*添加用户*/
    @Insert(value = "insert into users values(nextval('seq_users'),'${user.name}','${user.pwd}',1,'${user.memo}',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)")
    Integer addUser(@Param("user") User user);


    /*删除用户*/
    @Delete(value = "delete from users where id=${id}")
    Integer deleteUserById(@Param("id") Integer id);

}
