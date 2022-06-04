package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Departinfo implements Serializable {
    @ApiModelProperty(value = "部门id")
    private Integer departId;

    @ApiModelProperty(value = "部门名称")
    private String departName;

    @ApiModelProperty(value = "部门负责人")
    private String principalUser;

    @ApiModelProperty(value = "联系电话")
    private Long connectTelNo;

    @ApiModelProperty(value = "移动电话")
    private Long connectMobileTelNo;

    @ApiModelProperty(value = "传真")
    private Long faxes;

    @ApiModelProperty(value = "所属机构")
    private Integer branchId;

    private static final long serialVersionUID = 1L;

    public Integer getDepartId() {
        return departId;
    }

    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getPrincipalUser() {
        return principalUser;
    }

    public void setPrincipalUser(String principalUser) {
        this.principalUser = principalUser;
    }

    public Long getConnectTelNo() {
        return connectTelNo;
    }

    public void setConnectTelNo(Long connectTelNo) {
        this.connectTelNo = connectTelNo;
    }

    public Long getConnectMobileTelNo() {
        return connectMobileTelNo;
    }

    public void setConnectMobileTelNo(Long connectMobileTelNo) {
        this.connectMobileTelNo = connectMobileTelNo;
    }

    public Long getFaxes() {
        return faxes;
    }

    public void setFaxes(Long faxes) {
        this.faxes = faxes;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", departId=").append(departId);
        sb.append(", departName=").append(departName);
        sb.append(", principalUser=").append(principalUser);
        sb.append(", connectTelNo=").append(connectTelNo);
        sb.append(", connectMobileTelNo=").append(connectMobileTelNo);
        sb.append(", faxes=").append(faxes);
        sb.append(", branchId=").append(branchId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}