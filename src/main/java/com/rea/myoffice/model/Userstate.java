package com.rea.myoffice.model;

import java.io.Serializable;

public class Userstate implements Serializable {
    private Integer userstateid;

    private String userstatename;

    private static final long serialVersionUID = 1L;

    public Integer getUserstateid() {
        return userstateid;
    }

    public void setUserstateid(Integer userstateid) {
        this.userstateid = userstateid;
    }

    public String getUserstatename() {
        return userstatename;
    }

    public void setUserstatename(String userstatename) {
        this.userstatename = userstatename;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userstateid=").append(userstateid);
        sb.append(", userstatename=").append(userstatename);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}