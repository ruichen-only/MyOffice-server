package com.rea.myoffice.model;

import java.io.Serializable;
import java.util.Date;

public class Schedule implements Serializable {
    private Integer scheduleid;

    private String title;

    private String address;

    private Integer meetingid;

    private Date begintime;

    private Date endtime;

    private String schcontent;

    private String createuser;

    private Date createtime;

    private Integer ifprivate;

    private static final long serialVersionUID = 1L;

    public Integer getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(Integer scheduleid) {
        this.scheduleid = scheduleid;
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

    public Integer getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(Integer meetingid) {
        this.meetingid = meetingid;
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getSchcontent() {
        return schcontent;
    }

    public void setSchcontent(String schcontent) {
        this.schcontent = schcontent;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getIfprivate() {
        return ifprivate;
    }

    public void setIfprivate(Integer ifprivate) {
        this.ifprivate = ifprivate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scheduleid=").append(scheduleid);
        sb.append(", title=").append(title);
        sb.append(", address=").append(address);
        sb.append(", meetingid=").append(meetingid);
        sb.append(", begintime=").append(begintime);
        sb.append(", endtime=").append(endtime);
        sb.append(", schcontent=").append(schcontent);
        sb.append(", createuser=").append(createuser);
        sb.append(", createtime=").append(createtime);
        sb.append(", ifprivate=").append(ifprivate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}