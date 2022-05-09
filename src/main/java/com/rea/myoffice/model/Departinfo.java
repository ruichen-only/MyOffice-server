package com.rea.myoffice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Departinfo implements Serializable {
  @JsonProperty("deptId")
  private Integer departid;

  @JsonProperty("deptName")
  private String departname;

  @JsonProperty("username")
  private String principaluser;

  @JsonProperty("telephone")
  private Long connecttelno;

  @JsonProperty("mobilePhone")
  private Long connectmobiletelno;

  private Long faxes;

  @JsonProperty("branchId")
  private Integer branchid;

  private static final long serialVersionUID = 1L;

  public Integer getDepartid() {
    return departid;
  }

  public void setDepartid(Integer departid) {
    this.departid = departid;
  }

  public String getDepartname() {
    return departname;
  }

  public void setDepartname(String departname) {
    this.departname = departname;
  }

  public String getPrincipaluser() {
    return principaluser;
  }

  public void setPrincipaluser(String principaluser) {
    this.principaluser = principaluser;
  }

  public Long getConnecttelno() {
    return connecttelno;
  }

  public void setConnecttelno(Long connecttelno) {
    this.connecttelno = connecttelno;
  }

  public Long getConnectmobiletelno() {
    return connectmobiletelno;
  }

  public void setConnectmobiletelno(Long connectmobiletelno) {
    this.connectmobiletelno = connectmobiletelno;
  }

  public Long getFaxes() {
    return faxes;
  }

  public void setFaxes(Long faxes) {
    this.faxes = faxes;
  }

  public Integer getBranchid() {
    return branchid;
  }

  public void setBranchid(Integer branchid) {
    this.branchid = branchid;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" [");
    sb.append("Hash = ").append(hashCode());
    sb.append(", departid=").append(departid);
    sb.append(", departname=").append(departname);
    sb.append(", principaluser=").append(principaluser);
    sb.append(", connecttelno=").append(connecttelno);
    sb.append(", connectmobiletelno=").append(connectmobiletelno);
    sb.append(", faxes=").append(faxes);
    sb.append(", branchid=").append(branchid);
    sb.append(", serialVersionUID=").append(serialVersionUID);
    sb.append("]");
    return sb.toString();
  }
}
