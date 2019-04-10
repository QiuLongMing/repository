package org.qlm.service01.mapper;

import org.apache.ibatis.annotations.Param;
import org.qlm.service01.entity.ServiceBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceMapper {

    /*c查询所有服务*/
    List<ServiceBean> getService();

    /*根据ID删除服务*/
    Integer deleteService(@Param("serId") Integer serId);

    /*添加服务*/

    Integer addService(@Param("serId")Integer serId ,@Param("serName")String serName,@Param("serObj")String serObj ,
                       @Param("serContent")String serContent,@Param("serMemo")String serMemo);

    /*修改服务*/
    Integer updateService(@Param("serId")Integer serId ,@Param("serName")String serName,@Param("serObj")String serObj ,
                          @Param("serContent")String serContent,@Param("serMemo")String serMemo);


}
