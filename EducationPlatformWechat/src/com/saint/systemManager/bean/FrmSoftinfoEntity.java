package com.saint.systemManager.bean;

import com.saint.pub.plugin.PageEntity;

public class FrmSoftinfoEntity extends PageEntity {
    private String softdm;

    private String softname;

    private String softver;

    private String softcontext;

    private String softgroup;

    private String softxdr;

    private String softxdrq;

    private String softazsj;

    private String bz;

    private String gxsj;

    
    public String getSoftdm() {
        return softdm;
    }

    public void setSoftdm(String softdm) {
        this.softdm = softdm == null ? null : softdm.trim();
    }

    public String getSoftname() {
        return softname;
    }

    public void setSoftname(String softname) {
        this.softname = softname == null ? null : softname.trim();
    }

    public String getSoftver() {
        return softver;
    }

    public void setSoftver(String softver) {
        this.softver = softver == null ? null : softver.trim();
    }

    public String getSoftcontext() {
        return softcontext;
    }

    public void setSoftcontext(String softcontext) {
        this.softcontext = softcontext == null ? null : softcontext.trim();
    }

    public String getSoftgroup() {
        return softgroup;
    }

    public void setSoftgroup(String softgroup) {
        this.softgroup = softgroup == null ? null : softgroup.trim();
    }

    public String getSoftxdr() {
        return softxdr;
    }

    public void setSoftxdr(String softxdr) {
        this.softxdr = softxdr == null ? null : softxdr.trim();
    }

    public String getSoftxdrq() {
        return softxdrq;
    }

    public void setSoftxdrq(String softxdrq) {
        this.softxdrq = softxdrq;
    }

    public String getSoftazsj() {
        return softazsj;
    }

    public void setSoftazsj(String softazsj) {
        this.softazsj = softazsj;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }
}