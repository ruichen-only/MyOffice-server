package com.rea.myoffice.model;

import java.io.Serializable;
import java.util.Date;

public class Manualsign implements Serializable {
    private Integer signid;

    private String userid;

    private Date signtime;

    private String signdesc;

    private Integer signtag;

    private static final long serialVersionUID = 1L;

    public Integer getSignid() {
        return signid;
    }

    public void setSignid(Integer signid) {
        this.signid = signid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Date getSigntime() {
        return signtime;
    }

    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }

    public String getSigndesc() {
        return signdesc;
    }

    public void setSigndesc(String signdesc) {
        this.signdesc = signdesc;
    }

    public Integer getSigntag() {
        return signtag;
    }

    public void setSigntag(Integer signtag) {
        this.signtag = signtag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", signid=").append(signid);
        sb.append(", userid=").append(userid);
        sb.append(", signtime=").append(signtime);
        sb.append(", signdesc=").append(signdesc);
        sb.append(", signtag=").append(signtag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}