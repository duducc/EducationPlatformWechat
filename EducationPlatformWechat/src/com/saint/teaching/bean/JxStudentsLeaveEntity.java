package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxStudentsLeaveEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:主键**/
    private String xh;

    /**数据库列类型:String,数据库列注释:学生ID**/
    private String stuid;

    /**数据库列类型:String,数据库列注释:学生姓名**/
    private String stuname;

    /**数据库列类型:String,数据库列注释:人员类型 dmjc='EMPLX'**/
    private String emplx;

    /**数据库列类型:String,数据库列注释:状态(0：已提交；1-1：科室审核通过；1-2：科室审核不通过；2-1：科教科审核通过；2-2：科教科审核不通过；3-1：学校审核通过；3-2：学校审核不通过；9：已撤销；)**/
    private String state;

    /**数据库列类型:String,数据库列注释:请假事由**/
    private String cause;

    /**数据库列类型:Date,数据库列注释:请假开始时间**/
    private String leavedatestart;

    /**数据库列类型:Date,数据库列注释:请假结束时间**/
    private String leavedateend;

    /**数据库列类型:String,数据库列注释:请假类型**/
    private String type;

    /**数据库列类型:String,数据库列注释:图片路径1**/
    private String picpatho;

    /**数据库列类型:String,数据库列注释:图片路径2**/
    private String picpatht;

    /**数据库列类型:String,数据库列注释:图片路径3**/
    private String picpaths;

    /**数据库列类型:String,数据库列注释:课程ID**/
    private String courseid;

    /**数据库列类型:String,数据库列注释:课程名称**/
    private String coursename;

    /**数据库列类型:String,数据库列注释:课节ID**/
    private String arrangexh;

    /**数据库列类型:String,数据库列注释:讲授内容**/
    private String jshnr;

    /**数据库列类型:String,数据库列注释:审核人id**/
    private String checkperid;

    /**数据库列类型:String,数据库列注释:带教老师ID**/
    private String teacherid;

    /**数据库列类型:String,数据库列注释:带教老师名称**/
    private String teachername;

    /**数据库列类型:String,数据库列注释:轮训科室ID**/
    private String lunxundept;

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

    public String getEmplx() {
        return emplx;
    }

    public void setEmplx(String emplx) {
        this.emplx = emplx == null ? null : emplx.trim();
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

    public String getPicpatho() {
        return picpatho;
    }

    public void setPicpatho(String picpatho) {
        this.picpatho = picpatho == null ? null : picpatho.trim();
    }

    public String getPicpatht() {
        return picpatht;
    }

    public void setPicpatht(String picpatht) {
        this.picpatht = picpatht == null ? null : picpatht.trim();
    }

    public String getPicpaths() {
        return picpaths;
    }

    public void setPicpaths(String picpaths) {
        this.picpaths = picpaths == null ? null : picpaths.trim();
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid == null ? null : courseid.trim();
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public String getArrangexh() {
        return arrangexh;
    }

    public void setArrangexh(String arrangexh) {
        this.arrangexh = arrangexh == null ? null : arrangexh.trim();
    }

    public String getJshnr() {
        return jshnr;
    }

    public void setJshnr(String jshnr) {
        this.jshnr = jshnr == null ? null : jshnr.trim();
    }

    public String getCheckperid() {
        return checkperid;
    }

    public void setCheckperid(String checkperid) {
        this.checkperid = checkperid == null ? null : checkperid.trim();
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public String getLunxundept() {
        return lunxundept;
    }

    public void setLunxundept(String lunxundept) {
        this.lunxundept = lunxundept == null ? null : lunxundept.trim();
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