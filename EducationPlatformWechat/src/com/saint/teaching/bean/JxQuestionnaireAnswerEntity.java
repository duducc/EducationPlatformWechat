package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxQuestionnaireAnswerEntity extends JxQuestionnaireAnswerKey {
    /**数据库列类型:String,数据库列注释:学生姓名**/
    private String studentname;

    /**数据库列类型:String,数据库列注释:课程ID**/
    private String courseid;

    /**数据库列类型:String,数据库列注释:课程名称**/
    private String coursename;

    /**数据库列类型:String,数据库列注释:讲授内容**/
    private String jshnr;

    /**数据库列类型:String,数据库列注释:任课教师ID**/
    private String rkjshid;

    /**数据库列类型:String,数据库列注释:任课教师名称**/
    private String rkjshname;

    /**数据库列类型:String,数据库列注释:是否答题 0：否 1：是**/
    private String sfdt;

    /**数据库列类型:String,数据库列注释:问卷类别 1：本科生理论课**/
    private String wjlb;

    /**数据库列类型:String,数据库列注释:问题答案**/
    private String wtda;

    /**数据库列类型:String,数据库列注释:对应分数**/
    private String dyfsh;

    /**数据库列类型:String,数据库列注释:是否正确 0：否 1：是**/
    private String sfzq;

    /**数据库列类型:Date,数据库列注释:创建时间**/
    private String createtime;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark1;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark2;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark3;

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
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

    public String getJshnr() {
        return jshnr;
    }

    public void setJshnr(String jshnr) {
        this.jshnr = jshnr == null ? null : jshnr.trim();
    }

    public String getRkjshid() {
        return rkjshid;
    }

    public void setRkjshid(String rkjshid) {
        this.rkjshid = rkjshid == null ? null : rkjshid.trim();
    }

    public String getRkjshname() {
        return rkjshname;
    }

    public void setRkjshname(String rkjshname) {
        this.rkjshname = rkjshname == null ? null : rkjshname.trim();
    }

    public String getSfdt() {
        return sfdt;
    }

    public void setSfdt(String sfdt) {
        this.sfdt = sfdt == null ? null : sfdt.trim();
    }

    public String getWjlb() {
        return wjlb;
    }

    public void setWjlb(String wjlb) {
        this.wjlb = wjlb == null ? null : wjlb.trim();
    }

    public String getWtda() {
        return wtda;
    }

    public void setWtda(String wtda) {
        this.wtda = wtda == null ? null : wtda.trim();
    }

    public String getDyfsh() {
        return dyfsh;
    }

    public void setDyfsh(String dyfsh) {
        this.dyfsh = dyfsh == null ? null : dyfsh.trim();
    }

    public String getSfzq() {
        return sfzq;
    }

    public void setSfzq(String sfzq) {
        this.sfzq = sfzq == null ? null : sfzq.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
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