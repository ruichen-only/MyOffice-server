package com.rea.myoffice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Roleinfo implements Serializable {
  @JsonProperty("roleId")
  private Integer roleid;

  @JsonProperty("roleName")
  private String rolename;

  @JsonProperty("roleDesc")
  private String roledesc;

  private static final long serialVersionUID = 1L;

  public Integer getRoleid() {
    return roleid;
  }

  public void setRoleid(Integer roleid) {
    this.roleid = roleid;
  }

  public String getRolename() {
    return rolename;
  }

  public void setRolename(String rolename) {
    this.rolename = rolename;
  }

  public String getRoledesc() {
    return roledesc;
  }

  public void setRoledesc(String roledesc) {
    this.roledesc = roledesc;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" [");
    sb.append("Hash = ").append(hashCode());
    sb.append(", roleid=").append(roleid);
    sb.append(", rolename=").append(rolename);
    sb.append(", roledesc=").append(roledesc);
    sb.append(", serialVersionUID=").append(serialVersionUID);
    sb.append("]");
    return sb.toString();
  }
}
