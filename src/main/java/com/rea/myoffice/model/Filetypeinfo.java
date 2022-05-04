package com.rea.myoffice.model;

import java.io.Serializable;

public class Filetypeinfo implements Serializable {
    private Integer filetypeid;

    private String filetypename;

    private String filetypeimage;

    private String filetypesuffix;

    private static final long serialVersionUID = 1L;

    public Integer getFiletypeid() {
        return filetypeid;
    }

    public void setFiletypeid(Integer filetypeid) {
        this.filetypeid = filetypeid;
    }

    public String getFiletypename() {
        return filetypename;
    }

    public void setFiletypename(String filetypename) {
        this.filetypename = filetypename;
    }

    public String getFiletypeimage() {
        return filetypeimage;
    }

    public void setFiletypeimage(String filetypeimage) {
        this.filetypeimage = filetypeimage;
    }

    public String getFiletypesuffix() {
        return filetypesuffix;
    }

    public void setFiletypesuffix(String filetypesuffix) {
        this.filetypesuffix = filetypesuffix;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", filetypeid=").append(filetypeid);
        sb.append(", filetypename=").append(filetypename);
        sb.append(", filetypeimage=").append(filetypeimage);
        sb.append(", filetypesuffix=").append(filetypesuffix);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}