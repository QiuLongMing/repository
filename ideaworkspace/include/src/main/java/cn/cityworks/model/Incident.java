package cn.cityworks.model;


import javax.persistence.*;
import java.util.Date;


@Table(name = "incident")
public class Incident {

    private String  id;

    private String  applyId;

    private String  typeId;

    private String  dutyId;

    private String media;

    private String location;

    private Integer state;

    private String remark;

    private String memo;

    private Date ctime;

    private Date utime;

    public Incident() {
    }

    public Incident(String id, String applyId, String typeId, String dutyId, String media, String location, Integer state, String remark, String memo, Date ctime, Date utime) {
        this.id = id;
        this.applyId = applyId;
        this.typeId = typeId;
        this.dutyId = dutyId;
        this.media = media;
        this.location = location;
        this.state = state;
        this.remark = remark;
        this.memo = memo;
        this.ctime = ctime;
        this.utime = utime;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }




    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getTypeId() {
        return typeId;
    }



    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getDutyId() {
        return dutyId;
    }

    public void setDutyId(String dutyId) {
        this.dutyId = dutyId;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getUtime() {
        return utime;
    }

    public void setUtime(Date utime) {
        this.utime = utime;
    }
}
