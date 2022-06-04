package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Meetinginfo implements Serializable {
    @ApiModelProperty(value = "会议类型Id")
    private Integer meetingId;

    @ApiModelProperty(value = "会议类型名称")
    private String meetingName;

    private static final long serialVersionUID = 1L;

    public Integer getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(Integer meetingId) {
        this.meetingId = meetingId;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", meetingId=").append(meetingId);
        sb.append(", meetingName=").append(meetingName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}