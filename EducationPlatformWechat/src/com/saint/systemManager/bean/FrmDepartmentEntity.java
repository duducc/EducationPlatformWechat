package com.saint.systemManager.bean;

import com.saint.pub.plugin.PageEntity;

public class FrmDepartmentEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:管理部门**/
    private String glbm;

    /**数据库列类型:String,数据库列注释:部门全称**/
    private String bmmc;

    /**数据库列类型:String,数据库列注释:部门名称**/
    private String bmjc;

    /**数据库列类型:String,数据库列注释:印章名称**/
    private String yzmc;

    /**数据库列类型:String,数据库列注释:部门级别**/
    private String bmjb;

    /**数据库列类型:String,数据库列注释:部门可处理业务**/
    private String kclyw;

    /**数据库列类型:String,数据库列注释:业务类别**/
    private String ywlb;

    /**数据库列类型:String,数据库列注释:负责人**/
    private String fzr;

    /**数据库列类型:String,数据库列注释:联系人**/
    private String lxr;

    /**数据库列类型:String,数据库列注释:联系电话**/
    private String lxdh;

    /**数据库列类型:String,数据库列注释:传真号码**/
    private String czhm;

    /**数据库列类型:String,数据库列注释:联系地址**/
    private String lxdz;

    /**数据库列类型:String,数据库列注释:上级部门**/
    private String sjbm;

    /**数据库列类型:String,数据库列注释:(0.启用；1.停用)**/
    private String bz;

    /**数据库列类型:String,数据库列注释:记录状态 1-正常 0-删除**/
    private String jlzt;

    /**数据库列类型:Date,数据库列注释:更新时间**/
    private String gxsj;

    /**数据库列类型:String,数据库列注释:1:单位；0:科室**/
    private String type;

    public String getGlbm() {
        return glbm;
    }

    public void setGlbm(String glbm) {
        this.glbm = glbm == null ? null : glbm.trim();
    }

    public String getBmmc() {
        return bmmc;
    }

    public void setBmmc(String bmmc) {
        this.bmmc = bmmc == null ? null : bmmc.trim();
    }

    public String getBmjc() {
        return bmjc;
    }

    public void setBmjc(String bmjc) {
        this.bmjc = bmjc == null ? null : bmjc.trim();
    }

    public String getYzmc() {
        return yzmc;
    }

    public void setYzmc(String yzmc) {
        this.yzmc = yzmc == null ? null : yzmc.trim();
    }

    public String getBmjb() {
        return bmjb;
    }

    public void setBmjb(String bmjb) {
        this.bmjb = bmjb == null ? null : bmjb.trim();
    }

    public String getKclyw() {
        return kclyw;
    }

    public void setKclyw(String kclyw) {
        this.kclyw = kclyw == null ? null : kclyw.trim();
    }

    public String getYwlb() {
        return ywlb;
    }

    public void setYwlb(String ywlb) {
        this.ywlb = ywlb == null ? null : ywlb.trim();
    }

    public String getFzr() {
        return fzr;
    }

    public void setFzr(String fzr) {
        this.fzr = fzr == null ? null : fzr.trim();
    }

    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr == null ? null : lxr.trim();
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh == null ? null : lxdh.trim();
    }

    public String getCzhm() {
        return czhm;
    }

    public void setCzhm(String czhm) {
        this.czhm = czhm == null ? null : czhm.trim();
    }

    public String getLxdz() {
        return lxdz;
    }

    public void setLxdz(String lxdz) {
        this.lxdz = lxdz == null ? null : lxdz.trim();
    }

    public String getSjbm() {
        return sjbm;
    }

    public void setSjbm(String sjbm) {
        this.sjbm = sjbm == null ? null : sjbm.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public String getJlzt() {
        return jlzt;
    }

    public void setJlzt(String jlzt) {
        this.jlzt = jlzt == null ? null : jlzt.trim();
    }

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}