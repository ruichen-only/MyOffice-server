package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Precontract implements Serializable {
    @ApiModelProperty(value = "预约序号Id")
    private Integer precontractid;

    @ApiModelProperty(value = "日程Id")
    private Integer scheduleid;

    @ApiModelProperty(value = "预约人")
    private byte[] userid;

    private static final long serialVersionUID = 1L;

    public Integer getPrecontractid() {
        return precontractid;
    }

    public void setPrecontractid(Integer precontractid) {
        this.precontractid = precontractid;
    }

    public Integer getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(Integer scheduleid) {
        this.scheduleid = scheduleid;
    }

    public byte[] getUserid() {
        return userid;
    }

    public void setUserid(byte[] userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", precontractid=").append(precontractid);
        sb.append(", scheduleid=").append(scheduleid);
        sb.append(", userid=").append(userid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}