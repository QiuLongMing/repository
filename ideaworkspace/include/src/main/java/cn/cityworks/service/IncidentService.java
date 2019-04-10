package cn.cityworks.service;
import cn.cityworks.model.Incident;
import cn.cityworks.repository.IncidentMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@Service
public class IncidentService {
    @Resource
    private IncidentMapper incidentMapper;
    //添加事件
   // @Transactional
    /*public Integer addIncs(String userId, String typeId, String dutyId,String media,
                           String location , String remark, String memo) {
        String incId= UUID.randomUUID().toString().replace("-", "");
        return incidentMapper.addInc( incId,userId, typeId, dutyId, media,
                location , remark, memo);
    }*/

    //添加事件 (利用Mapper插件)
    @Transactional
    public Integer addInces(String userId, String typeId, String dutyId,String media,
                            String location , String remark, String memo){
        String incId= UUID.randomUUID().toString().replace("-", "");
        Incident inc=new Incident(incId,userId,typeId,dutyId,media,location,1,remark,memo,new Date(),new Date());
        Integer flag=incidentMapper.insertSelective(inc);
        System.out.println(flag);
        return flag;
    }


    //查询事件
    /*public List<Incident> findIncident(Integer state) {
        //使用分页PageHelp插件
        //PageHelper.startPage(1,5);
        List<Incident> incs= incidentMapper.findByType(state);
        //PageInfo<Incident> pageInfo=new PageInfo<>(incs);
       // System.out.println(pageInfo);
        return incs;
    }*/



    //查询事件 用mapper插件
    public List<Incident> findIncidents(Integer state){

        List<Incident> incs=incidentMapper.select(new Incident(null,null,null,null,null,null,state,null,null,null,null));

        return incs;
    }



}
