package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Loginlog implements Serializable {
    @ApiModelProperty(value = "登录日志id")
    private Integer loginid;

    @ApiModelProperty(value = "登录者")
    private String userid;

    @ApiModelProperty(value = "登录时间")
    private Date logintime;

    @ApiModelProperty(value = "登录是否成功。1：成功、0失败。")
    private Integer ifsuccess;

    @ApiModelProperty(value = "登录用户IP")
    private String loginuserip;

    @ApiModelProperty(value = "登录备注")
    private String logindesc;

    private static final long serialVersionUID = 1L;

    public Integer getLoginid() {
        return loginid;
    }

    public void setLoginid(Integer loginid) {
        this.loginid = loginid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public Integer getIfsuccess() {
        return ifsuccess;
    }

    public void setIfsuccess(Integer ifsuccess) {
        this.ifsuccess = ifsuccess;
    }

    public String getLoginuserip() {
        return loginuserip;
    }

    public void setLoginuserip(String loginuserip) {
        this.loginuserip = loginuserip;
    }

    public String getLogindesc() {
        return logindesc;
    }

    public void setLogindesc(String logindesc) {
        this.logindesc = logindesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", loginid=").append(loginid);
        sb.append(", userid=").append(userid);
        sb.append(", logintime=").append(logintime);
        sb.append(", ifsuccess=").append(ifsuccess);
        sb.append(", loginuserip=").append(loginuserip);
        sb.append(", logindesc=").append(logindesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}