package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxStudentsGradeEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:主键**/
    private String xh;

    /**数据库列类型:String,数据库列注释:学员ID**/
    private String studentid;

    /**数据库列类型:String,数据库列注释:学员姓名**/
    private String studentname;

    /**数据库列类型:String,数据库列注释:人员类型 dmjc='EMPLX'**/
    private String emplx;

    /**数据库列类型:String,数据库列注释:加减分原因**/
    private String jjfyy;

    /**数据库列类型:BigDecimal,数据库列注释:分数**/
    private String grade;

    /**数据库列类型:Date,数据库列注释:加减分时间**/
    private String jjfsj;

    /**数据库列类型:String,数据库列注释:地点**/
    private String address;

    /**数据库列类型:String,数据库列注释:创建人ID**/
    private String crateid;

    /**数据库列类型:String,数据库列注释:创建人姓名**/
    private String createname;

    /**数据库列类型:Date,数据库列注释:创建日期**/
    private String createdate;

    /**数据库列类型:String,数据库列注释:说明**/
    private String remark;

    /**数据库列类型:String,数据库列注释:使用标记 1：正常 0：作废**/
    private String sybj;

    /**数据库列类型:String,数据库列注释:作废原因**/
    private String zfyy;

    /**数据库列类型:String,数据库列注释:备用**/
    private String remark1;

    /**数据库列类型:String,数据库列注释:备用**/
    private String remark2;

    /**数据库列类型:String,数据库列注释:备用**/
    private String remark3;

    /**数据库列类型:String,数据库列注释:备用**/
    private String remark4;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public String getEmplx() {
        return emplx;
    }

    public void setEmplx(String emplx) {
        this.emplx = emplx == null ? null : emplx.trim();
    }

    public String getJjfyy() {
        return jjfyy;
    }

    public void setJjfyy(String jjfyy) {
        this.jjfyy = jjfyy == null ? null : jjfyy.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getJjfsj() {
        return jjfsj;
    }

    public void setJjfsj(String jjfsj) {
        this.jjfsj = jjfsj;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCrateid() {
        return crateid;
    }

    public void setCrateid(String crateid) {
        this.crateid = crateid == null ? null : crateid.trim();
    }

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname == null ? null : createname.trim();
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSybj() {
        return sybj;
    }

    public void setSybj(String sybj) {
        this.sybj = sybj == null ? null : sybj.trim();
    }

    public String getZfyy() {
        return zfyy;
    }

    public void setZfyy(String zfyy) {
        this.zfyy = zfyy == null ? null : zfyy.trim();
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

    public String getRemark4() {
        return remark4;
    }

    public void setRemark4(String remark4) {
        this.remark4 = remark4 == null ? null : remark4.trim();
    }
}