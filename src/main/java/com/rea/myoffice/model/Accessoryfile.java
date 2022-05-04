package com.rea.myoffice.model;

import java.io.Serializable;
import java.util.Date;

public class Accessoryfile implements Serializable {
    private Integer accessoryid;

    private Integer fileid;

    private String accessoryname;

    private Integer accessorysize;

    private Integer accessorytype;

    private Date createdate;

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