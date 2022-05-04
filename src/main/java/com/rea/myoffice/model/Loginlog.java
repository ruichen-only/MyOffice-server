package com.rea.myoffice.model;

import java.io.Serializable;
import java.util.Date;

public class Loginlog implements Serializable {
    private Integer loginid;

    private String userid;

    private Date logintime;

    private Integer ifsuccess;

    private String loginuserip;

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