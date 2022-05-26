package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Manualsign implements Serializable {
    @ApiModelProperty(value = "签卡Id")
    private Integer signid;

    @ApiModelProperty(value = "用户id")
    private String userid;

    @ApiModelProperty(value = "签卡时间")
    private Date signtime;

    @ApiModelProperty(value = "签卡备注")
    private String signdesc;

    @ApiModelProperty(value = "签卡标记")
    private Integer signtag;

    private static final long serialVersionUID = 1L;

    public Integer getSignid() {
        return signid;
    }

    public void setSignid(Integer signid) {
        this.signid = signid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Date getSigntime() {
        return signtime;
    }

    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }

    public String getSigndesc() {
        return signdesc;
    }

    public void setSigndesc(String signdesc) {
        this.signdesc = signdesc;
    }

    public Integer getSigntag() {
        return signtag;
    }

    public void setSigntag(Integer signtag) {
        this.signtag = signtag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", signid=").append(signid);
        sb.append(", userid=").append(userid);
        sb.append(", signtime=").append(signtime);
        sb.append(", signdesc=").append(signdesc);
        sb.append(", signtag=").append(signtag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}