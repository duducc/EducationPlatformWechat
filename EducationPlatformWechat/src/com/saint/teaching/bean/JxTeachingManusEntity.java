package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxTeachingManusEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:手册id**/
    private String manuId;

    /**数据库列类型:String,数据库列注释:手册简称**/
    private String manuJc;

    /**数据库列类型:String,数据库列注释:手册名称**/
    private String manuName;

    /**数据库列类型:String,数据库列注释:手册代码**/
    private String manuDm;

    /**数据库列类型:BigDecimal,数据库列注释:手册数量**/
    private String manuShl;

    /**数据库列类型:String,数据库列注释:图片路径**/
    private String manuImg;

    /**数据库列类型:String,数据库列注释:说明**/
    private String manuShm;

    /**数据库列类型:String,数据库列注释:状态**/
    private String state;

    /**数据库列类型:String,数据库列注释:类型**/
    private String manuType;

    /**数据库列类型:String,数据库列注释:管理部门**/
    private String glbm;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark1;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark2;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark3;

    /**数据库列类型:Date,数据库列注释:创建时间**/
    private String manuDate;

    public String getManuId() {
        return manuId;
    }

    public void setManuId(String manuId) {
        this.manuId = manuId == null ? null : manuId.trim();
    }

    public String getManuJc() {
        return manuJc;
    }

    public void setManuJc(String manuJc) {
        this.manuJc = manuJc == null ? null : manuJc.trim();
    }

    public String getManuName() {
        return manuName;
    }

    public void setManuName(String manuName) {
        this.manuName = manuName == null ? null : manuName.trim();
    }

    public String getManuDm() {
        return manuDm;
    }

    public void setManuDm(String manuDm) {
        this.manuDm = manuDm == null ? null : manuDm.trim();
    }

    public String getManuShl() {
        return manuShl;
    }

    public void setManuShl(String manuShl) {
        this.manuShl = manuShl;
    }

    public String getManuImg() {
        return manuImg;
    }

    public void setManuImg(String manuImg) {
        this.manuImg = manuImg == null ? null : manuImg.trim();
    }

    public String getManuShm() {
        return manuShm;
    }

    public void setManuShm(String manuShm) {
        this.manuShm = manuShm == null ? null : manuShm.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getManuType() {
        return manuType;
    }

    public void setManuType(String manuType) {
        this.manuType = manuType == null ? null : manuType.trim();
    }

    public String getGlbm() {
        return glbm;
    }

    public void setGlbm(String glbm) {
        this.glbm = glbm == null ? null : glbm.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }

    public String getManuDate() {
        return manuDate;
    }

    public void setManuDate(String manuDate) {
        this.manuDate = manuDate;
    }
}