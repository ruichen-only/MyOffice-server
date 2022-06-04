package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class Userinfo implements Serializable {
  @ApiModelProperty(value = "用户唯一标识")
  private String userId;

  @ApiModelProperty(value = "真实姓名")
  private String username;

  @ApiModelProperty(value = "密码")
  private String password;

  @ApiModelProperty(value = "所在部门")
  private Integer departId;

  @ApiModelProperty(value = "性别")
  private Integer gender;

  @ApiModelProperty(value = "用户角色")
  private Integer roleId;

  @ApiModelProperty(value = "用户状态")
  private Integer userState;

  private static final long serialVersionUID = 1L;

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUsername() {
    return username;
  }

  public void setUserName(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Integer getDepartId() {
    return departId;
  }

  public void setDepartId(Integer departId) {
    this.departId = departId;
  }

  public Integer getGender() {
    return gender;
  }

  public void setGender(Integer gender) {
    this.gender = gender;
  }

  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  public Integer getUserState() {
    return userState;
  }

  public void setUserState(Integer userState) {
    this.userState = userState;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" [");
    sb.append("Hash = ").append(hashCode());
    sb.append(", userId=").append(userId);
    sb.append(", userName=").append(username);
    sb.append(", password=").append(password);
    sb.append(", departId=").append(departId);
    sb.append(", gender=").append(gender);
    sb.append(", roleId=").append(roleId);
    sb.append(", userState=").append(userState);
    sb.append(", serialVersionUID=").append(serialVersionUID);
    sb.append("]");
    return sb.toString();
  }
}
