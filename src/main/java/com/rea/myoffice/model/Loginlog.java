package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Loginlog implements Serializable {
    @ApiModelProperty(value = "登录日志id")
    private Integer loginId;

    @ApiModelProperty(value = "登录者")
    private String userId;

    @ApiModelProperty(value = "登录时间")
    private Date loginTime;

    @ApiModelProperty(value = "登录是否成功。1：成功、0失败。")
    private Integer ifSuccess;

    @ApiModelProperty(value = "登录用户IP")
    private String loginUserIp;

    @ApiModelProperty(value = "登录备注")
    private String loginDesc;

    private static final long serialVersionUID = 1L;

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getIfSuccess() {
        return ifSuccess;
    }

    public void setIfSuccess(Integer ifSuccess) {
        this.ifSuccess = ifSuccess;
    }

    public String getLoginUserIp() {
        return loginUserIp;
    }

    public void setLoginUserIp(String loginUserIp) {
        this.loginUserIp = loginUserIp;
    }

    public String getLoginDesc() {
        return loginDesc;
    }

    public void setLoginDesc(String loginDesc) {
        this.loginDesc = loginDesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", loginId=").append(loginId);
        sb.append(", userId=").append(userId);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", ifSuccess=").append(ifSuccess);
        sb.append(", loginUserIp=").append(loginUserIp);
        sb.append(", loginDesc=").append(loginDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}