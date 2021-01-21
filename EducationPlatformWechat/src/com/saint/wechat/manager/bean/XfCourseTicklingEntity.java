package com.saint.wechat.manager.bean;

import com.saint.pub.plugin.PageEntity;

public class XfCourseTicklingEntity extends XfCourseTicklingKey {
    /**数据库列类型:String,数据库列注释:人员姓名**/
    private String username;

    /**数据库列类型:String,数据库列注释:项目ID**/
    private String proid;

    /**数据库列类型:String,数据库列注释:项目名称**/
    private String proname;

    /**数据库列类型:String,数据库列注释:项目举办单位**/
    private String holdunit;

    /**数据库列类型:String,数据库列注释:课题名称**/
    private String coursename;

    /**数据库列类型:String,数据库列注释:题目1**/
    private String subjectone;

    /**数据库列类型:String,数据库列注释:题目2**/
    private String subjecttwo;

    /**数据库列类型:String,数据库列注释:题目3**/
    private String subjectthree;

    /**数据库列类型:String,数据库列注释:题目4**/
    private String subjectfour;

    /**数据库列类型:String,数据库列注释:题目5**/
    private String subjectfive;

    /**数据库列类型:String,数据库列注释:题目6**/
    private String subjectsix;

    /**数据库列类型:String,数据库列注释:题目7**/
    private String subjectseven;

    /**数据库列类型:Date,数据库列注释:添加时间**/
    private String addtime;

    /**数据库列类型:String,数据库列注释:类型**/
    private String type;

    /**数据库列类型:String,数据库列注释:状态**/
    private String state;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid == null ? null : proid.trim();
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public String getHoldunit() {
        return holdunit;
    }

    public void setHoldunit(String holdunit) {
        this.holdunit = holdunit == null ? null : holdunit.trim();
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public String getSubjectone() {
        return subjectone;
    }

    public void setSubjectone(String subjectone) {
        this.subjectone = subjectone == null ? null : subjectone.trim();
    }

    public String getSubjecttwo() {
        return subjecttwo;
    }

    public void setSubjecttwo(String subjecttwo) {
        this.subjecttwo = subjecttwo == null ? null : subjecttwo.trim();
    }

    public String getSubjectthree() {
        return subjectthree;
    }

    public void setSubjectthree(String subjectthree) {
        this.subjectthree = subjectthree == null ? null : subjectthree.trim();
    }

    public String getSubjectfour() {
        return subjectfour;
    }

    public void setSubjectfour(String subjectfour) {
        this.subjectfour = subjectfour == null ? null : subjectfour.trim();
    }

    public String getSubjectfive() {
        return subjectfive;
    }

    public void setSubjectfive(String subjectfive) {
        this.subjectfive = subjectfive == null ? null : subjectfive.trim();
    }

    public String getSubjectsix() {
        return subjectsix;
    }

    public void setSubjectsix(String subjectsix) {
        this.subjectsix = subjectsix == null ? null : subjectsix.trim();
    }

    public String getSubjectseven() {
        return subjectseven;
    }

    public void setSubjectseven(String subjectseven) {
        this.subjectseven = subjectseven == null ? null : subjectseven.trim();
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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
}