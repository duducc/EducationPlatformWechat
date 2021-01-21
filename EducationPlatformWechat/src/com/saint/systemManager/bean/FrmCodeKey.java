package com.saint.systemManager.bean;

public class FrmCodeKey {
    /**数据库列类型:String,数据库列注释:系统类别**/
    private String xtlb;

    /**数据库列类型:String,数据库列注释:代码类别**/
    private String dmlb;

    /**数据库列类型:String,数据库列注释:代码值**/
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