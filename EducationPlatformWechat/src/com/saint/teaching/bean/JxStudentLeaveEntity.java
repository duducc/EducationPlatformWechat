package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxStudentLeaveEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:唯一主键**/
    private String xh;

    /**数据库列类型:String,数据库列注释:学生ID**/
    private String stuid;

    /**数据库列类型:String,数据库列注释:学生姓名**/
    private String stuname;

    /**数据库列类型:String,数据库列注释:状态**/
    private String state;

    /**数据库列类型:String,数据库列注释:请假事由**/
    private String cause;

    /**数据库列类型:Date,数据库列注释:请假开始时间**/
    private String leavedatestart;

    /**数据库列类型:Date,数据库列注释:请假结束时间**/
    private String leavedateend;

    /**数据库列类型:String,数据库列注释:请假类型**/
    private String type;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark1;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark2;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark3;

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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

    public String getLeavedatestart() {
        return leavedatestart;
    }

    public void setLeavedatestart(String leavedatestart) {
        this.leavedatestart = leavedatestart;
    }

    public String getLeavedateend() {
        return leavedateend;
    }

    public void setLeavedateend(String leavedateend) {
        this.leavedateend = leavedateend;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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
}