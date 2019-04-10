package org.qlm.service01.service.impl;

import org.apache.ibatis.annotations.Param;
import org.qlm.service01.entity.Incident;
import org.qlm.service01.mapper.IncidentMapper;
import org.qlm.service01.service.InclidentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class InclidentServiceImpl implements InclidentService {

   @Resource
   private IncidentMapper  incidentMapper;

    @Transactional
    @Override
    public Integer addIncs(String userId, String typeId, String duId,String media,
                           String location , String remark, String memo) {
        String incId= UUID.randomUUID().toString().replace("-", "");
        return incidentMapper.addInc( incId,userId, typeId, duId, media,
                location , remark, memo);
    }

    @Override
    public List<Incident> findIncident(Integer state) {
        System.out.println(state+"---------");
        return incidentMapper.findByType(state);
    }
}
