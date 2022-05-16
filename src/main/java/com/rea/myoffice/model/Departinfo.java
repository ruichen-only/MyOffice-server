package com.rea.myoffice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Departinfo implements Serializable {
  @JsonProperty("deptId")
  private Integer departid;

  @JsonProperty("deptName")
  private String departname;

  @JsonProperty("userId")
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
    return getClass().getSimpleName()
        + " ["
        + "Hash = "
        + hashCode()
        + ", departid="
        + departid
        + ", departname="
        + departname
        + ", principaluser="
        + principaluser
        + ", connecttelno="
        + connecttelno
        + ", connectmobiletelno="
        + connectmobiletelno
        + ", faxes="
        + faxes
        + ", branchid="
        + branchid
        + ", serialVersionUID="
        + serialVersionUID
        + "]";
  }
}
