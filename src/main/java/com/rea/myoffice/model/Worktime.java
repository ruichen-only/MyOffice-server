package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Worktime implements Serializable {
    @ApiModelProperty(value = "工作时间Id")
    private Integer workTimeId;

    @ApiModelProperty(value = "上班时间")
    private Date onDutyTime;

    @ApiModelProperty(value = "下班时间")
    private Date offDutyTime;

    private static final long serialVersionUID = 1L;

    public Integer getWorkTimeId() {
        return workTimeId;
    }

    public void setWorkTimeId(Integer workTimeId) {
        this.workTimeId = workTimeId;
    }

    public Date getOnDutyTime() {
        return onDutyTime;
    }

    public void setOnDutyTime(Date onDutyTime) {
        this.onDutyTime = onDutyTime;
    }

    public Date getOffDutyTime() {
        return offDutyTime;
    }

    public void setOffDutyTime(Date offDutyTime) {
        this.offDutyTime = offDutyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", workTimeId=").append(workTimeId);
        sb.append(", onDutyTime=").append(onDutyTime);
        sb.append(", offDutyTime=").append(offDutyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}