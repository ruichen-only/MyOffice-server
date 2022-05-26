package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Messagetouser implements Serializable {
    @ApiModelProperty(value = "序号Id")
    private Integer id;

    @ApiModelProperty(value = "消息Id")
    private Integer messageid;

    @ApiModelProperty(value = "发送对象Id")
    private String touserid;

    @ApiModelProperty(value = "是否已读。1：已读、0：未读")
    private Integer ifread;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public String getTouserid() {
        return touserid;
    }

    public void setTouserid(String touserid) {
        this.touserid = touserid;
    }

    public Integer getIfread() {
        return ifread;
    }

    public void setIfread(Integer ifread) {
        this.ifread = ifread;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", messageid=").append(messageid);
        sb.append(", touserid=").append(touserid);
        sb.append(", ifread=").append(ifread);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}