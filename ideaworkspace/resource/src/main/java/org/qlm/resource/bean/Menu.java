package org.qlm.resource.bean;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="menu")
public class Menu {


    @Id
    private Integer id;
    private String name;
    private Integer fid;
    private String icon;
    private String url;
    private Integer state;
    @Column(name = "DESC")
    private String desc;
    private String memo;
    private Date ctime;
    private Date utime;


    @OneToMany
    @JoinColumn
    private List<Menu> menus;


    public Menu() {
    }

    public Menu(Integer id, String name, Integer fid, String icon, String url, Integer state, String desc, String memo, Date ctime, Date utime) {
        this.id = id;
        this.name = name;
        this.fid = fid;
        this.icon = icon;
        this.url = url;
        this.state = state;
        this.desc = desc;
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

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fid=" + fid +
                ", icon='" + icon + '\'' +
                ", url='" + url + '\'' +
                ", state=" + state +
                ", desc='" + desc + '\'' +
                ", memo='" + memo + '\'' +
                ", ctime=" + ctime +
                ", utime=" + utime +
                '}';
    }
}
