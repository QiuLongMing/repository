package cn.cityworks.repository;

import cn.cityworks.model.Incident;
import org.apache.ibatis.annotations.*;



/*
*
* 继承Mapper接口
* */
@Mapper
public interface IncidentMapper extends tk.mybatis.mapper.common.Mapper<Incident> {
    /*添加事件*/
   /* @Insert(value = "insert into incident values(#{incId},#{userId},#{typeId},#{dutyId},#{media},#{location},1,#{remark},#{memo},CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)")
    Integer addInc(@Param("incId") String incId, @Param("userId") String userId, @Param("typeId") String typeId, @Param("dutyId") String dutyId, @Param("media") String media,
                   @Param("location") String location, @Param("remark") String remark, @Param("memo") String memo);*/


    /*根据type查询事件*/
   /* @Select(" <script> SELECT   *  from incident where " +
            " 1=1 " +
            "<if test=\"state != 0\">and state=#{state} </if></script>")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "applyId", column = "apply_id"),
            @Result(property = "typeId", column = "type_id"),
            @Result(property = "dutyId", column = "duty_id"),
            @Result(property = "state", column = "state"),
            @Result(property = "remark", column = "remark"),
            @Result(property = "memo", column = "memo"),
            @Result(property = "ctime", column = "ctime"),
            @Result(property = "utime", column = "utime")
    })
    List<Incident> findByType(@Param("state") Integer state);*/

}
