package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Accessoryfile implements Serializable {
    @ApiModelProperty(value = "文件附件Id")
    private Integer accessoryid;

    @ApiModelProperty(value = "文件Id")
    private Integer fileid;

    @ApiModelProperty(value = "附件名称")
    private String accessoryname;

    @ApiModelProperty(value = "附件大小")
    private Integer accessorysize;

    @ApiModelProperty(value = "附件类型")
    private Integer accessorytype;

    @ApiModelProperty(value = "创建日期")
    private Date createdate;

    @ApiModelProperty(value = "附件路径")
    private String accessorypath;

    private static final long serialVersionUID = 1L;

    public Integer getAccessoryid() {
        return accessoryid;
    }

    public void setAccessoryid(Integer accessoryid) {
        this.accessoryid = accessoryid;
    }

    public Integer getFileid() {
        return fileid;
    }

    public void setFileid(Integer fileid) {
        this.fileid = fileid;
    }

    public String getAccessoryname() {
        return accessoryname;
    }

    public void setAccessoryname(String accessoryname) {
        this.accessoryname = accessoryname;
    }

    public Integer getAccessorysize() {
        return accessorysize;
    }

    public void setAccessorysize(Integer accessorysize) {
        this.accessorysize = accessorysize;
    }

    public Integer getAccessorytype() {
        return accessorytype;
    }

    public void setAccessorytype(Integer accessorytype) {
        this.accessorytype = accessorytype;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getAccessorypath() {
        return accessorypath;
    }

    public void setAccessorypath(String accessorypath) {
        this.accessorypath = accessorypath;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", accessoryid=").append(accessoryid);
        sb.append(", fileid=").append(fileid);
        sb.append(", accessoryname=").append(accessoryname);
        sb.append(", accessorysize=").append(accessorysize);
        sb.append(", accessorytype=").append(accessorytype);
        sb.append(", createdate=").append(createdate);
        sb.append(", accessorypath=").append(accessorypath);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}