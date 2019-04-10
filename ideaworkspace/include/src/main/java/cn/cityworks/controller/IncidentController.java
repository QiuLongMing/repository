package cn.cityworks.controller;
import cn.cityworks.message.BaseReturnVO;
import cn.cityworks.model.Incident;
import cn.cityworks.service.IncidentService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;





@RequestMapping("/incident")
@RestController
public class IncidentController {

    @Autowired
    private IncidentService incidentService;


    /*添加事件*/

    @ApiOperation(value = "提交事件",notes = "提交事件")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "tid",value = "事件类型"),
            @ApiImplicitParam(name = "media",value = "图片或视频"),
            @ApiImplicitParam(name = "location",value = "位置"),
            @ApiImplicitParam(name = "remark",value = "描述"),
            @ApiImplicitParam(name = "memo",value = "备注")
    })
    @PostMapping("/addincident")
    public Object addIncs(@RequestParam(value = "tid") String tid,@RequestParam(value = "media")String media,
                          @RequestParam(value = "location")String location, @RequestParam(value = "remark")String remark,
                          @RequestParam(value = "memo",required = false)String memo){

        Integer flag=incidentService.addInces("111111111",tid,"0",media,location,remark,memo);
        if (flag>0){

            return new BaseReturnVO("提交成功");

        }
        return new BaseReturnVO(300,"提交失败");
    }


    /*根据类型查找事件*/

    @GetMapping("/findincident")
    @ApiOperation(value = "事件状态获取事件",notes = "事件状态获取事件")
    @ApiImplicitParams({
            @ApiImplicitParam(name= "state",value = "事件状态值")
    })
    public Object findIncident(@RequestParam(value = "state",required = false) Integer state){
        System.out.println(state);
        List<Incident> incs=incidentService.findIncidents(state);
        return new BaseReturnVO(incs);
    }
}
