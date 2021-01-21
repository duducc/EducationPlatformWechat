package com.saint.systemManager.bean;

public class FrmCodetypeKey {
    private String xtlb;

    private String dmlb;

    public String getXtlb() {
        return xtlb;
    }

    public void setXtlb(String xtlb) {
        this.xtlb = xtlb == null ? null : xtlb.trim();
    }

    public String getDmlb() {
        return dmlb;
    }

    public void setDmlb(String dmlb) {
        this.dmlb = dmlb == null ? null : dmlb.trim();
    }
}