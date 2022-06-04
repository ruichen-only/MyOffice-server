package com.rea.myoffice.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Filetypeinfo implements Serializable {
    @ApiModelProperty(value = "文件类型id")
    private Integer fileTypeId;

    @ApiModelProperty(value = "文件类型名")
    private String fileTypeName;

    @ApiModelProperty(value = "文件类型对应的图标")
    private String fileTypeImage;

    @ApiModelProperty(value = "文件类型后缀")
    private String fileTypeSuffix;

    private static final long serialVersionUID = 1L;

    public Integer getFileTypeId() {
        return fileTypeId;
    }

    public void setFileTypeId(Integer fileTypeId) {
        this.fileTypeId = fileTypeId;
    }

    public String getFileTypeName() {
        return fileTypeName;
    }

    public void setFileTypeName(String fileTypeName) {
        this.fileTypeName = fileTypeName;
    }

    public String getFileTypeImage() {
        return fileTypeImage;
    }

    public void setFileTypeImage(String fileTypeImage) {
        this.fileTypeImage = fileTypeImage;
    }

    public String getFileTypeSuffix() {
        return fileTypeSuffix;
    }

    public void setFileTypeSuffix(String fileTypeSuffix) {
        this.fileTypeSuffix = fileTypeSuffix;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fileTypeId=").append(fileTypeId);
        sb.append(", fileTypeName=").append(fileTypeName);
        sb.append(", fileTypeImage=").append(fileTypeImage);
        sb.append(", fileTypeSuffix=").append(fileTypeSuffix);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}