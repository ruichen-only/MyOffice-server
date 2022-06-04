package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Manualsign implements Serializable {
    @ApiModelProperty(value = "签卡Id")
    private Integer signId;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "签卡时间")
    private Date signTime;

    @ApiModelProperty(value = "签卡备注")
    private String signDesc;

    @ApiModelProperty(value = "签卡标记")
    private Integer signTag;

    private static final long serialVersionUID = 1L;

    public Integer getSignId() {
        return signId;
    }

    public void setSignId(Integer signId) {
        this.signId = signId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public String getSignDesc() {
        return signDesc;
    }

    public void setSignDesc(String signDesc) {
        this.signDesc = signDesc;
    }

    public Integer getSignTag() {
        return signTag;
    }

    public void setSignTag(Integer signTag) {
        this.signTag = signTag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", signId=").append(signId);
        sb.append(", userId=").append(userId);
        sb.append(", signTime=").append(signTime);
        sb.append(", signDesc=").append(signDesc);
        sb.append(", signTag=").append(signTag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}