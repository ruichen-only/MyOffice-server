package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Messagetype implements Serializable {
    @ApiModelProperty(value = "消息类型Id")
    private Integer messageTypeId;

    @ApiModelProperty(value = "消息类型名称")
    private String messageTypeName;

    @ApiModelProperty(value = "消息类型描述")
    private String messageDesc;

    private static final long serialVersionUID = 1L;

    public Integer getMessageTypeId() {
        return messageTypeId;
    }

    public void setMessageTypeId(Integer messageTypeId) {
        this.messageTypeId = messageTypeId;
    }

    public String getMessageTypeName() {
        return messageTypeName;
    }

    public void setMessageTypeName(String messageTypeName) {
        this.messageTypeName = messageTypeName;
    }

    public String getMessageDesc() {
        return messageDesc;
    }

    public void setMessageDesc(String messageDesc) {
        this.messageDesc = messageDesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", messageTypeId=").append(messageTypeId);
        sb.append(", messageTypeName=").append(messageTypeName);
        sb.append(", messageDesc=").append(messageDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}