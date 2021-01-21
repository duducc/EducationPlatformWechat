package com.saint.systemManager.bean;

import com.saint.pub.plugin.PageEntity;

public class FrmCodeEntity extends FrmCodeKey {
    /**数据库列类型:String,数据库列注释:代码简称**/
    private String dmjc;

    /**数据库列类型:String,数据库列注释:代码名称**/
    private String dmmc;

    /**数据库列类型:String,数据库列注释:代码属性1**/
    private String dmsm1;

    /**数据库列类型:String,数据库列注释:代码属性2**/
    private String dmsm2;

    /**数据库列类型:String,数据库列注释:代码属性3**/
    private String dmsm3;

    /**数据库列类型:String,数据库列注释:代码属性4**/
    private String dmsm4;

    /**数据库列类型:String,数据库列注释:代码属性（0-不允许修改 1-允许修改）**/
    private String dmsx;

    /**数据库列类型:String,数据库列注释:状态标记（0-删除 1-正常）**/
    private String zt;

    /**数据库列类型:String,数据库列注释:业务使用对象（空，都能使用
业务使用对象以逗号分隔
）**/
    private String ywdx;

    /**数据库列类型:Long,数据库列注释:顺序号**/
    private String sxh;

    public String getDmjc() {
        return dmjc;
    }

    public void setDmjc(String dmjc) {
        this.dmjc = dmjc == null ? null : dmjc.trim();
    }

    public String getDmmc() {
        return dmmc;
    }

    public void setDmmc(String dmmc) {
        this.dmmc = dmmc == null ? null : dmmc.trim();
    }

    public String getDmsm1() {
        return dmsm1;
    }

    public void setDmsm1(String dmsm1) {
        this.dmsm1 = dmsm1 == null ? null : dmsm1.trim();
    }

    public String getDmsm2() {
        return dmsm2;
    }

    public void setDmsm2(String dmsm2) {
        this.dmsm2 = dmsm2 == null ? null : dmsm2.trim();
    }

    public String getDmsm3() {
        return dmsm3;
    }

    public void setDmsm3(String dmsm3) {
        this.dmsm3 = dmsm3 == null ? null : dmsm3.trim();
    }

    public String getDmsm4() {
        return dmsm4;
    }

    public void setDmsm4(String dmsm4) {
        this.dmsm4 = dmsm4 == null ? null : dmsm4.trim();
    }

    public String getDmsx() {
        return dmsx;
    }

    public void setDmsx(String dmsx) {
        this.dmsx = dmsx == null ? null : dmsx.trim();
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt == null ? null : zt.trim();
    }

    public String getYwdx() {
        return ywdx;
    }

    public void setYwdx(String ywdx) {
        this.ywdx = ywdx == null ? null : ywdx.trim();
    }

    public String getSxh() {
        return sxh;
    }

    public void setSxh(String sxh) {
        this.sxh = sxh;
    }
}