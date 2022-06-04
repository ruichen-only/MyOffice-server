package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Messagetouser implements Serializable {
    @ApiModelProperty(value = "序号Id")
    private Integer id;

    @ApiModelProperty(value = "消息Id")
    private Integer messageId;

    @ApiModelProperty(value = "发送对象Id")
    private String toUserId;

    @ApiModelProperty(value = "是否已读。1：已读、0：未读")
    private Integer ifRead;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getToUserId() {
        return toUserId;
    }

    public void setToUserId(String toUserId) {
        this.toUserId = toUserId;
    }

    public Integer getIfRead() {
        return ifRead;
    }

    public void setIfRead(Integer ifRead) {
        this.ifRead = ifRead;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", messageId=").append(messageId);
        sb.append(", toUserId=").append(toUserId);
        sb.append(", ifRead=").append(ifRead);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}