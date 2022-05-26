package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Departinfo implements Serializable {
    @ApiModelProperty(value = "部门id")
    private Integer departid;

    @ApiModelProperty(value = "部门名称")
    private String departname;

    @ApiModelProperty(value = "部门负责人")
    private String principaluser;

    @ApiModelProperty(value = "联系电话")
    private Long connecttelno;

    @ApiModelProperty(value = "移动电话")
    private Long connectmobiletelno;

    @ApiModelProperty(value = "传真")
    private Long faxes;

    @ApiModelProperty(value = "所属机构")
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