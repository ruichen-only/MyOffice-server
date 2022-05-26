package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Operatelog implements Serializable {
    @ApiModelProperty(value = "操作日志Id")
    private Integer operateid;

    @ApiModelProperty(value = "操作者")
    private String userid;

    @ApiModelProperty(value = "操作名称")
    private String operatename;

    @ApiModelProperty(value = "操作对象Id")
    private String objectid;

    @ApiModelProperty(value = "操作描述")
    private String operatedesc;

    @ApiModelProperty(value = "操作时间")
    private Date operatetime;

    private static final long serialVersionUID = 1L;

    public Integer getOperateid() {
        return operateid;
    }

    public void setOperateid(Integer operateid) {
        this.operateid = operateid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getOperatename() {
        return operatename;
    }

    public void setOperatename(String operatename) {
        this.operatename = operatename;
    }

    public String getObjectid() {
        return objectid;
    }

    public void setObjectid(String objectid) {
        this.objectid = objectid;
    }

    public String getOperatedesc() {
        return operatedesc;
    }

    public void setOperatedesc(String operatedesc) {
        this.operatedesc = operatedesc;
    }

    public Date getOperatetime() {
        return operatetime;
    }

    public void setOperatetime(Date operatetime) {
        this.operatetime = operatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", operateid=").append(operateid);
        sb.append(", userid=").append(userid);
        sb.append(", operatename=").append(operatename);
        sb.append(", objectid=").append(objectid);
        sb.append(", operatedesc=").append(operatedesc);
        sb.append(", operatetime=").append(operatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}