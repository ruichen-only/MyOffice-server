package com.rea.myoffice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Userinfo implements Serializable {
  @JsonProperty("userId")
  private String userid;

  private String username;

  private String password;

  @JsonProperty("deptId")
  private Integer departid;

  private Integer gender;

  @JsonProperty("roleId")
  private Integer roleid;

  @JsonProperty("userStateId")
  private Integer userstate;

  private static final long serialVersionUID = 1L;

  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Integer getDepartid() {
    return departid;
  }

  public void setDepartid(Integer departid) {
    this.departid = departid;
  }

  public Integer getGender() {
    return gender;
  }

  public void setGender(Integer gender) {
    this.gender = gender;
  }

  public Integer getRoleid() {
    return roleid;
  }

  public void setRoleid(Integer roleid) {
    this.roleid = roleid;
  }

  public Integer getUserstate() {
    return userstate;
  }

  public void setUserstate(Integer userstate) {
    this.userstate = userstate;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" [");
    sb.append("Hash = ").append(hashCode());
    sb.append(", userid=").append(userid);
    sb.append(", username=").append(username);
    sb.append(", password=").append(password);
    sb.append(", departid=").append(departid);
    sb.append(", gender=").append(gender);
    sb.append(", roleid=").append(roleid);
    sb.append(", userstate=").append(userstate);
    sb.append(", serialVersionUID=").append(serialVersionUID);
    sb.append("]");
    return sb.toString();
  }
}
