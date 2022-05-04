package com.rea.myoffice.model;

import java.io.Serializable;

public class Branchinfo implements Serializable {
    private Integer branchid;

    private String branchname;

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