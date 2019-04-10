package org.qlm.permission.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {


    private int id;
    private String name;
    private String pwd;
    private int state;
    private String memo;
    private Date ctime;
    private Date utime;

    public User() {
    }

    public User(int id, String name, String pwd, int state, String memo, Date ctime, Date utime) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.state = state;
        this.memo = memo;
        this.ctime = ctime;
        this.utime = utime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getState() {
        return state;
    }

    public void setState(int state) {
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
        return "User{" +
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
