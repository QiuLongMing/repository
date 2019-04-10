package org.qlm.service01.mapper;

import org.apache.ibatis.annotations.*;
import org.qlm.service01.entity.Incident;

import java.util.List;

@Mapper
public interface IncidentMapper {

    /*添加事件*/
    @Insert(value = "insert into incident values(#{incId},#{userId},#{typeId},#{duId},#{media},#{location},1,#{remark},#{memo},CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)")
    Integer addInc(@Param("incId")String incId,@Param("userId") String  userId, @Param("typeId")String typeId, @Param("duId")String duId, @Param("media")String media,
                   @Param("location")String location ,@Param("remark")String remark,@Param("memo") String memo);


    /*根据type查询事件*/
   //@Select(" <script> SELECT   *  from incident where type_id=#{typeId} </script>")
    /*@Select(" <script> SELECT id,"+
            "p_t pT," +
            " WHERE " +
            "1+1"+
            " and s = #{pa.s}"+
            " <if test=\"#{pa.d} != null\">and uid = #{pa.d} </if> "+
            " <if test=\"#{pa.d} != null \">and brand_id = #{pa.d} </if> "+
            " <if test=\"#{pa.d1} != null \">and id limit #{pa.d1},#{pa.d2} </if> </script>")*/
    @Select(" <script> SELECT   *  from incident where " +
            " 1=1 " +
            "<if test=\"state != 0\">and state=#{state} </if></script>")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "userId", column = "apply_id"),
            @Result(property = "typeId", column = "type_id"),
            @Result(property = "duId", column = "duty_id"),
            @Result(property = "state", column = "state"),
            @Result(property = "remark", column = "remark"),
            @Result(property = "memo", column = "memo"),
            @Result(property = "ctime", column = "ctime"),
            @Result(property = "utime", column = "utime")
    })
    List<Incident> findByType(@Param("state")Integer state);
}
