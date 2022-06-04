package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Userstate implements Serializable {
    @ApiModelProperty(value = "1：正常状态；0：被屏蔽")
    private Integer userStateId;

    private String userStateName;

    private static final long serialVersionUID = 1L;

    public Integer getUserStateId() {
        return userStateId;
    }

    public void setUserStateId(Integer userStateId) {
        this.userStateId = userStateId;
    }

    public String getUserStateName() {
        return userStateName;
    }

    public void setUserStateName(String userStateName) {
        this.userStateName = userStateName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userStateId=").append(userStateId);
        sb.append(", userStateName=").append(userStateName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}