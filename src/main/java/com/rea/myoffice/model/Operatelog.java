package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Operatelog implements Serializable {
    @ApiModelProperty(value = "操作日志Id")
    private Integer operateId;

    @ApiModelProperty(value = "操作者")
    private String userId;

    @ApiModelProperty(value = "操作名称")
    private String operateName;

    @ApiModelProperty(value = "操作对象Id")
    private String objectId;

    @ApiModelProperty(value = "操作描述")
    private String operateDesc;

    @ApiModelProperty(value = "操作时间")
    private Date operateTime;

    private static final long serialVersionUID = 1L;

    public Integer getOperateId() {
        return operateId;
    }

    public void setOperateId(Integer operateId) {
        this.operateId = operateId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOperateName() {
        return operateName;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getOperateDesc() {
        return operateDesc;
    }

    public void setOperateDesc(String operateDesc) {
        this.operateDesc = operateDesc;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", operateId=").append(operateId);
        sb.append(", userId=").append(userId);
        sb.append(", operateName=").append(operateName);
        sb.append(", objectId=").append(objectId);
        sb.append(", operateDesc=").append(operateDesc);
        sb.append(", operateTime=").append(operateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}