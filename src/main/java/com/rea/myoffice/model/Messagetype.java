package com.rea.myoffice.model;

import java.io.Serializable;

public class Messagetype implements Serializable {
    private Integer messagetypeid;

    private String messagetypename;

    private String messagedesc;

    private static final long serialVersionUID = 1L;

    public Integer getMessagetypeid() {
        return messagetypeid;
    }

    public void setMessagetypeid(Integer messagetypeid) {
        this.messagetypeid = messagetypeid;
    }

    public String getMessagetypename() {
        return messagetypename;
    }

    public void setMessagetypename(String messagetypename) {
        this.messagetypename = messagetypename;
    }

    public String getMessagedesc() {
        return messagedesc;
    }

    public void setMessagedesc(String messagedesc) {
        this.messagedesc = messagedesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", messagetypeid=").append(messagetypeid);
        sb.append(", messagetypename=").append(messagetypename);
        sb.append(", messagedesc=").append(messagedesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}