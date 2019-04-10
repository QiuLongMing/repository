package org.qlm.service01.service.impl;

import org.qlm.service01.entity.ServiceBean;
import org.qlm.service01.mapper.ServiceMapper;
import org.qlm.service01.service.Services;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service(value = "services")
public class ServicesImpl  implements Services {
    @Resource
    private ServiceMapper serviceMapper;

    /*查询*/
    @Override
    public List<ServiceBean> getService() {
        return serviceMapper.getService();
    }



/*删除*/
    public Integer deleteService(Integer serid){


        return serviceMapper.deleteService( serid);
    }
   /*添加*/
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Integer addService(Integer serid, String serName, String serObj, String serContent, String serMemo) {
        return serviceMapper.addService(serid, serName, serObj, serContent,serMemo);
    }

    @Override
    public Integer updateService(Integer serId, String serName, String serObj, String serContent, String serMemo) {
        return serviceMapper.updateService( serId, serName, serObj,  serContent, serMemo);
    }
}
