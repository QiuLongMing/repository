package org.qlm.service01.service;

import org.apache.ibatis.annotations.Param;
import org.qlm.service01.entity.ServiceBean;

import java.util.List;

public interface Services {
/*查询所有的服务*/
    List<ServiceBean> getService();

    /*删除服务*/

    Integer deleteService(Integer serid);


    /*添加服务*/
    Integer addService(Integer serid,String serName,String serObj,String serContent,String serMemo);


    /*修改服务*/

    Integer updateService(Integer serId , String serName, String serObj ,
                         String serContent, String serMemo);


}
