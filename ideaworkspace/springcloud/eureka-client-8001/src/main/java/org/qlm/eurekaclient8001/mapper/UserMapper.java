package org.qlm.eurekaclient8001.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.qlm.model.Users;

import java.util.List;

@Mapper
public interface UserMapper {

    /*查找所有的用户*/
    @Select(value = "select *  from  users")
    List<Users> getUsers();
}
