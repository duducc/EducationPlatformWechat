package com.saint.systemManager.bean;

public class FrmSysparaTypeKey {
    private String xtlb;

    private String gjz;

    public String getXtlb() {
        return xtlb;
    }

    public void setXtlb(String xtlb) {
        this.xtlb = xtlb == null ? null : xtlb.trim();
    }

    public String getGjz() {
        return gjz;
    }

    public void setGjz(String gjz) {
        this.gjz = gjz == null ? null : gjz.trim();
    }
}