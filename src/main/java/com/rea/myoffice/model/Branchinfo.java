package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Branchinfo implements Serializable {
    @ApiModelProperty(value = "机构id")
    private Integer branchid;

    @ApiModelProperty(value = "机构名称")
    private String branchname;

    @ApiModelProperty(value = "机构简称")
    private String branchshortname;

    private static final long serialVersionUID = 1L;

    public Integer getBranchid() {
        return branchid;
    }

    public void setBranchid(Integer branchid) {
        this.branchid = branchid;
    }

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    public String getBranchshortname() {
        return branchshortname;
    }

    public void setBranchshortname(String branchshortname) {
        this.branchshortname = branchshortname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", branchid=").append(branchid);
        sb.append(", branchname=").append(branchname);
        sb.append(", branchshortname=").append(branchshortname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}