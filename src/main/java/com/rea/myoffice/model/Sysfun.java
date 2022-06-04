package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Sysfun implements Serializable {
    @ApiModelProperty(value = "菜单节点id")
    private Integer nodeId;

    @ApiModelProperty(value = "菜单名称")
    private String displayName;

    @ApiModelProperty(value = "菜单连接地址")
    private String nodeURL;

    @ApiModelProperty(value = "菜单显示顺序")
    private Integer displayOrder;

    @ApiModelProperty(value = "父节点id")
    private Integer parentNodeId;

    private static final long serialVersionUID = 1L;

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getNodeURL() {
        return nodeURL;
    }

    public void setNodeURL(String nodeURL) {
        this.nodeURL = nodeURL;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public Integer getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(Integer parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nodeId=").append(nodeId);
        sb.append(", displayName=").append(displayName);
        sb.append(", nodeURL=").append(nodeURL);
        sb.append(", displayOrder=").append(displayOrder);
        sb.append(", parentNodeId=").append(parentNodeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}