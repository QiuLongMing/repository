package org.qlm.service01.entity;

import java.util.Date;

public class Incident {

    private String  id;

    private String  userId;

    private String typeId;

    private String duId;

    private String media;

    private String location;

    private Integer state;

    private String remark;

    private String memo;

    private Date ctime;

    private Date utime;

    public Incident() {
    }

    public Incident(String id, String userId, String typeId, String duId, String media, String location, Integer state, String remark, String memo, Date ctime, Date utime) {
        this.id = id;
        this.userId = userId;
        this.typeId = typeId;
        this.duId = duId;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getDuId() {
        return duId;
    }

    public void setDuId(String duId) {
        this.duId = duId;
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

    @Override
    public String toString() {
        return "Incident{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", typeId=" + typeId +
                ", duId='" + duId + '\'' +
                ", media='" + media + '\'' +
                ", location='" + location + '\'' +
                ", state=" + state +
                ", remark='" + remark + '\'' +
                ", memo='" + memo + '\'' +
                ", ctime=" + ctime +
                ", utime=" + utime +
                '}';
    }
}
