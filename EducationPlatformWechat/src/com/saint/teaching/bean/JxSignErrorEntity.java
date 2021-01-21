package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxSignErrorEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:唯一主键**/
    private String xh;

    /**数据库列类型:String,数据库列注释:签到人员ID**/
    private String stuid;

    /**数据库列类型:String,数据库列注释:签到人员姓名**/
    private String stuname;

    /**数据库列类型:Date,数据库列注释:签到时间**/
    private String signtime;

    /**数据库列类型:String,数据库列注释:签到失败原因**/
    private String cause;

    /**数据库列类型:String,数据库列注释:失败人员openid**/
    private String openid;

    /**数据库列类型:String,数据库列注释:人员类型**/
    private String type;

    /**数据库列类型:String,数据库列注释:人员科室或班级**/
    private String dept;

    /**数据库列类型:String,数据库列注释:null**/
    private String remarks1;

    /**数据库列类型:String,数据库列注释:null**/
    private String remarks2;

    /**数据库列类型:String,数据库列注释:null**/
    private String remarks3;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid == null ? null : stuid.trim();
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public String getSigntime() {
        return signtime;
    }

    public void setSigntime(String signtime) {
        this.signtime = signtime;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public String getRemarks1() {
        return remarks1;
    }

    public void setRemarks1(String remarks1) {
        this.remarks1 = remarks1 == null ? null : remarks1.trim();
    }

    public String getRemarks2() {
        return remarks2;
    }

    public void setRemarks2(String remarks2) {
        this.remarks2 = remarks2 == null ? null : remarks2.trim();
    }

    public String getRemarks3() {
        return remarks3;
    }

    public void setRemarks3(String remarks3) {
        this.remarks3 = remarks3 == null ? null : remarks3.trim();
    }
}