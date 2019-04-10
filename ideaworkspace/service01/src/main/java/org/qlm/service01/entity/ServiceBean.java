package org.qlm.service01.entity;
/*服务类实体*/
public class ServiceBean {

    private Integer serId;
    private String serName;
    private String serObj;
    private String serContent;
    private String serMemo;

    public ServiceBean() {

    }

    public ServiceBean(Integer serId, String serName, String serObj, String serContent, String serMemo) {
        this.serId = serId;
        this.serName = serName;
        this.serObj = serObj;
        this.serContent = serContent;
        this.serMemo = serMemo;
    }

    public Integer getSerId() {
        return serId;
    }

    public void setSerId(Integer serId) {
        this.serId = serId;
    }

    public String getSerName() {
        return serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public String getSerObj() {
        return serObj;
    }

    public void setSerObj(String serObj) {
        this.serObj = serObj;
    }

    public String getSerContent() {
        return serContent;
    }

    public void setSerContent(String serContent) {
        this.serContent = serContent;
    }

    public String getSerMemo() {
        return serMemo;
    }

    public void setSerMemo(String serMemo) {
        this.serMemo = serMemo;
    }

    @Override
    public String toString() {
        return "ServiceBean{" +
                "serId=" + serId +
                ", serName='" + serName + '\'' +
                ", serObj='" + serObj + '\'' +
                ", serContent='" + serContent + '\'' +
                ", serMemo='" + serMemo + '\'' +
                '}';
    }
}
