package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Roleright implements Serializable {
    @ApiModelProperty(value = "角色权限id")
    private Integer rolerightid;

    @ApiModelProperty(value = "角色id")
    private Integer roleid;

    @ApiModelProperty(value = "菜单节点id")
    private Integer nodeid;

    private static final long serialVersionUID = 1L;

    public Integer getRolerightid() {
        return rolerightid;
    }

    public void setRolerightid(Integer rolerightid) {
        this.rolerightid = rolerightid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getNodeid() {
        return nodeid;
    }

    public void setNodeid(Integer nodeid) {
        this.nodeid = nodeid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rolerightid=").append(rolerightid);
        sb.append(", roleid=").append(roleid);
        sb.append(", nodeid=").append(nodeid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}