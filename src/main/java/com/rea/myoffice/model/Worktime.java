package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Worktime implements Serializable {
    @ApiModelProperty(value = "工作时间Id")
    private Integer worktimeid;

    @ApiModelProperty(value = "上班时间")
    private Date ondutytime;

    @ApiModelProperty(value = "下班时间")
    private Date offdutytime;

    private static final long serialVersionUID = 1L;

    public Integer getWorktimeid() {
        return worktimeid;
    }

    public void setWorktimeid(Integer worktimeid) {
        this.worktimeid = worktimeid;
    }

    public Date getOndutytime() {
        return ondutytime;
    }

    public void setOndutytime(Date ondutytime) {
        this.ondutytime = ondutytime;
    }

    public Date getOffdutytime() {
        return offdutytime;
    }

    public void setOffdutytime(Date offdutytime) {
        this.offdutytime = offdutytime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", worktimeid=").append(worktimeid);
        sb.append(", ondutytime=").append(ondutytime);
        sb.append(", offdutytime=").append(offdutytime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}