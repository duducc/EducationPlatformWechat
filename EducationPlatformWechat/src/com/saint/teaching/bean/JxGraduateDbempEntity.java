package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxGraduateDbempEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:序号**/
    private String xh;

    /**数据库列类型:String,数据库列注释:答辩表序号（关联答辩表）**/
    private String dbxh;

    /**数据库列类型:String,数据库列注释:学校id**/
    private String schoolid;

    /**数据库列类型:String,数据库列注释:学校名称**/
    private String schoolname;

    /**数据库列类型:String,数据库列注释:人员id**/
    private String empid;

    /**数据库列类型:String,数据库列注释:人员名称**/
    private String empname;

    /**数据库列类型:String,数据库列注释:教学职称id**/
    private String jxzhichengid;

    /**数据库列类型:String,数据库列注释:教学职称名称**/
    private String jxzhichengname;

    /**数据库列类型:String,数据库列注释:理论职称id、**/
    private String llzhichengid;

    /**数据库列类型:String,数据库列注释:理论职称名称**/
    private String llzhichengname;

    /**数据库列类型:String,数据库列注释:第一学历**/
    private String dyxueli;

    /**数据库列类型:String,数据库列注释:最该学历**/
    private String zgxueli;

    /**数据库列类型:String,数据库列注释:是否硕导**/
    private String sfshd;

    /**数据库列类型:String,数据库列注释:备注**/
    private String baizhu;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark1;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark2;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark3;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark4;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark5;

    /**数据库列类型:Date,数据库列注释:添加时间**/
    private String creditdate;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getDbxh() {
        return dbxh;
    }

    public void setDbxh(String dbxh) {
        this.dbxh = dbxh == null ? null : dbxh.trim();
    }

    public String getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(String schoolid) {
        this.schoolid = schoolid == null ? null : schoolid.trim();
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname == null ? null : schoolname.trim();
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid == null ? null : empid.trim();
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    public String getJxzhichengid() {
        return jxzhichengid;
    }

    public void setJxzhichengid(String jxzhichengid) {
        this.jxzhichengid = jxzhichengid == null ? null : jxzhichengid.trim();
    }

    public String getJxzhichengname() {
        return jxzhichengname;
    }

    public void setJxzhichengname(String jxzhichengname) {
        this.jxzhichengname = jxzhichengname == null ? null : jxzhichengname.trim();
    }

    public String getLlzhichengid() {
        return llzhichengid;
    }

    public void setLlzhichengid(String llzhichengid) {
        this.llzhichengid = llzhichengid == null ? null : llzhichengid.trim();
    }

    public String getLlzhichengname() {
        return llzhichengname;
    }

    public void setLlzhichengname(String llzhichengname) {
        this.llzhichengname = llzhichengname == null ? null : llzhichengname.trim();
    }

    public String getDyxueli() {
        return dyxueli;
    }

    public void setDyxueli(String dyxueli) {
        this.dyxueli = dyxueli == null ? null : dyxueli.trim();
    }

    public String getZgxueli() {
        return zgxueli;
    }

    public void setZgxueli(String zgxueli) {
        this.zgxueli = zgxueli == null ? null : zgxueli.trim();
    }

    public String getSfshd() {
        return sfshd;
    }

    public void setSfshd(String sfshd) {
        this.sfshd = sfshd == null ? null : sfshd.trim();
    }

    public String getBaizhu() {
        return baizhu;
    }

    public void setBaizhu(String baizhu) {
        this.baizhu = baizhu == null ? null : baizhu.trim();
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

    public String getRemark5() {
        return remark5;
    }

    public void setRemark5(String remark5) {
        this.remark5 = remark5 == null ? null : remark5.trim();
    }

    public String getCreditdate() {
        return creditdate;
    }

    public void setCreditdate(String creditdate) {
        this.creditdate = creditdate;
    }
}