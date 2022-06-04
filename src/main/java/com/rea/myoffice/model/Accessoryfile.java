package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Accessoryfile implements Serializable {
    @ApiModelProperty(value = "文件附件Id")
    private Integer accessoryId;

    @ApiModelProperty(value = "文件Id")
    private Integer fileId;

    @ApiModelProperty(value = "附件名称")
    private String accessoryName;

    @ApiModelProperty(value = "附件大小")
    private Integer accessorySize;

    @ApiModelProperty(value = "附件类型")
    private Integer accessoryType;

    @ApiModelProperty(value = "创建日期")
    private Date createDate;

    @ApiModelProperty(value = "附件路径")
    private String accessoryPath;

    private static final long serialVersionUID = 1L;

    public Integer getAccessoryId() {
        return accessoryId;
    }

    public void setAccessoryId(Integer accessoryId) {
        this.accessoryId = accessoryId;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getAccessoryName() {
        return accessoryName;
    }

    public void setAccessoryName(String accessoryName) {
        this.accessoryName = accessoryName;
    }

    public Integer getAccessorySize() {
        return accessorySize;
    }

    public void setAccessorySize(Integer accessorySize) {
        this.accessorySize = accessorySize;
    }

    public Integer getAccessoryType() {
        return accessoryType;
    }

    public void setAccessoryType(Integer accessoryType) {
        this.accessoryType = accessoryType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getAccessoryPath() {
        return accessoryPath;
    }

    public void setAccessoryPath(String accessoryPath) {
        this.accessoryPath = accessoryPath;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", accessoryId=").append(accessoryId);
        sb.append(", fileId=").append(fileId);
        sb.append(", accessoryName=").append(accessoryName);
        sb.append(", accessorySize=").append(accessorySize);
        sb.append(", accessoryType=").append(accessoryType);
        sb.append(", createDate=").append(createDate);
        sb.append(", accessoryPath=").append(accessoryPath);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}