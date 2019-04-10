package org.qlm.resource.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "ur_link")
public class URlink {


    @Id
    private Integer id;
    private Integer uid;
    private Integer rid;
    private Integer state;
    private String memo;
    private Date ctime;
    private Date utime;

    public URlink() {

    }

    public URlink(Integer id, Integer uid, Integer rid, Integer state, String memo, Date ctime, Date utime) {
        this.id = id;
        this.uid = uid;
        this.rid = rid;
        this.state = state;
        this.memo = memo;
        this.ctime = ctime;
        this.utime = utime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
        return "URlink{" +
                "id=" + id +
                ", uid=" + uid +
                ", rid=" + rid +
                ", state=" + state +
                ", memo='" + memo + '\'' +
                ", ctime=" + ctime +
                ", utime=" + utime +
                '}';
    }
}
