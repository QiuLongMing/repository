package org.qlm.testmh.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "USERS")
public class Users {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    private String name;
    @Column(name = "pwd",length = 30)
    private String pwd;
    private Integer state;
    private String memo;
    private Date ctime;
    private Date utime;

    public Users() {

    }

    public Users(Integer id, String name, String pwd, Integer state, String memo, Date ctime, Date utime) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
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
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", state=" + state +
                ", memo='" + memo + '\'' +
                ", ctime=" + ctime +
                ", utime=" + utime +
                '}';
    }
}

