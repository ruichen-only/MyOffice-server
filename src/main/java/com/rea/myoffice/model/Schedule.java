package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Schedule implements Serializable {
    @ApiModelProperty(value = "日程Id")
    private Integer scheduleId;

    @ApiModelProperty(value = "日程标题")
    private String title;

    @ApiModelProperty(value = "会议地址")
    private String address;

    @ApiModelProperty(value = "会议类型")
    private Integer meetingId;

    @ApiModelProperty(value = "日程开始时间")
    private Date beginTime;

    @ApiModelProperty(value = "日程结束时间")
    private Date endTime;

    @ApiModelProperty(value = "日程内容")
    private String schContent;

    @ApiModelProperty(value = "创建者")
    private String createUser;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "是否私有")
    private Integer ifPrivate;

    private static final long serialVersionUID = 1L;

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(Integer meetingId) {
        this.meetingId = meetingId;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getSchContent() {
        return schContent;
    }

    public void setSchContent(String schContent) {
        this.schContent = schContent;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIfPrivate() {
        return ifPrivate;
    }

    public void setIfPrivate(Integer ifPrivate) {
        this.ifPrivate = ifPrivate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scheduleId=").append(scheduleId);
        sb.append(", title=").append(title);
        sb.append(", address=").append(address);
        sb.append(", meetingId=").append(meetingId);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", schContent=").append(schContent);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", ifPrivate=").append(ifPrivate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}