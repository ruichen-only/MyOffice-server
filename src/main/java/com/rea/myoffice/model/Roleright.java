package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Roleright implements Serializable {
    @ApiModelProperty(value = "角色权限id")
    private Integer roleRightId;

    @ApiModelProperty(value = "角色id")
    private Integer roleId;

    @ApiModelProperty(value = "菜单节点id")
    private Integer nodeId;

    private static final long serialVersionUID = 1L;

    public Integer getRoleRightId() {
        return roleRightId;
    }

    public void setRoleRightId(Integer roleRightId) {
        this.roleRightId = roleRightId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleRightId=").append(roleRightId);
        sb.append(", roleId=").append(roleId);
        sb.append(", nodeId=").append(nodeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}