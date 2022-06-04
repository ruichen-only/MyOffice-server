package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Precontract implements Serializable {
    @ApiModelProperty(value = "预约序号Id")
    private Integer preContractId;

    @ApiModelProperty(value = "日程Id")
    private Integer scheduleId;

    @ApiModelProperty(value = "预约人")
    private byte[] userId;

    private static final long serialVersionUID = 1L;

    public Integer getPreContractId() {
        return preContractId;
    }

    public void setPreContractId(Integer preContractId) {
        this.preContractId = preContractId;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", preContractId=").append(preContractId);
        sb.append(", scheduleId=").append(scheduleId);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}