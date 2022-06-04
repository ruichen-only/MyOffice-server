package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Branchinfo implements Serializable {
    @ApiModelProperty(value = "机构id")
    private Integer branchId;

    @ApiModelProperty(value = "机构名称")
    private String branchName;

    @ApiModelProperty(value = "机构简称")
    private String branchShortName;

    private static final long serialVersionUID = 1L;

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchShortName() {
        return branchShortName;
    }

    public void setBranchShortName(String branchShortName) {
        this.branchShortName = branchShortName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", branchId=").append(branchId);
        sb.append(", branchName=").append(branchName);
        sb.append(", branchShortName=").append(branchShortName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}