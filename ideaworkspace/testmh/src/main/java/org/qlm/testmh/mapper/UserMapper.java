package org.qlm.testmh.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.qlm.testmh.model.Users;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper {

    /*根据名称找用户*/
    @Select(value = "select  * from users where name=#{name}")
    Users getUserByName( String name);

}
