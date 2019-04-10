package org.qlm.resource.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "rm_link")
public class RMlink {



    @Id
    private Integer id;

    private Integer rid;
    private Integer mid;
    private Integer state;
    private String memo;
    private Date ctime;
    private Date utime;

    public RMlink() {
    }

    public RMlink(Integer id, Integer rid, Integer mid, Integer state, String memo, Date ctime, Date utime) {
        this.id = id;
        this.rid = rid;
        this.mid = mid;
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

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
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
        return "RMlink{" +
                "id=" + id +
                ", rid=" + rid +
                ", mid=" + mid +
                ", state=" + state +
                ", memo='" + memo + '\'' +
                ", ctime=" + ctime +
                ", utime=" + utime +
                '}';
    }
}
