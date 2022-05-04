package com.rea.myoffice.model;

import java.io.Serializable;

public class Sysfun implements Serializable {
    private Integer nodeid;

    private String displayname;

    private String nodeurl;

    private Integer displayorder;

    private Integer parentnodeid;

    private static final long serialVersionUID = 1L;

    public Integer getNodeid() {
        return nodeid;
    }

    public void setNodeid(Integer nodeid) {
        this.nodeid = nodeid;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public String getNodeurl() {
        return nodeurl;
    }

    public void setNodeurl(String nodeurl) {
        this.nodeurl = nodeurl;
    }

    public Integer getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(Integer displayorder) {
        this.displayorder = displayorder;
    }

    public Integer getParentnodeid() {
        return parentnodeid;
    }

    public void setParentnodeid(Integer parentnodeid) {
        this.parentnodeid = parentnodeid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nodeid=").append(nodeid);
        sb.append(", displayname=").append(displayname);
        sb.append(", nodeurl=").append(nodeurl);
        sb.append(", displayorder=").append(displayorder);
        sb.append(", parentnodeid=").append(parentnodeid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}