package com.saint.systemManager.bean;

public class FrmCodeKey {
    /**���ݿ�������:String,���ݿ���ע��:ϵͳ���**/
    private String xtlb;

    /**���ݿ�������:String,���ݿ���ע��:�������**/
    private String dmlb;

    /**���ݿ�������:String,���ݿ���ע��:����ֵ**/
    private String dmz;

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

    public String getDmz() {
        return dmz;
    }

    public void setDmz(String dmz) {
        this.dmz = dmz == null ? null : dmz.trim();
    }
}