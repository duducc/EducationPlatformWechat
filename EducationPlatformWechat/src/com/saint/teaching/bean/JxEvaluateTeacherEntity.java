package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxEvaluateTeacherEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:主键**/
    private String xh;

    /**数据库列类型:String,数据库列注释:培训内容**/
    private String content;

    /**数据库列类型:Date,数据库列注释:开始时间**/
    private String startdate;

    /**数据库列类型:Date,数据库列注释:结束时间**/
    private String enddate;

    /**数据库列类型:String,数据库列注释:教师编号**/
    private String teacherid;

    /**数据库列类型:String,数据库列注释:教师姓名**/
    private String teachername;

    /**数据库列类型:String,数据库列注释:科室编号**/
    private String depid;

    /**数据库列类型:String,数据库列注释:科室名称**/
    private String depname;

    /**数据库列类型:String,数据库列注释:学生编号**/
    private String studentid;

    /**数据库列类型:String,数据库列注释:学生姓名**/
    private String studentname;

    /**数据库列类型:String,数据库列注释:选择问题1**/
    private String radio1;

    /**数据库列类型:String,数据库列注释:选择问题1**/
    private String radio2;

    /**数据库列类型:String,数据库列注释:选择问题1**/
    private String radio3;

    /**数据库列类型:String,数据库列注释:选择问题1**/
    private String radio4;

    /**数据库列类型:String,数据库列注释:选择问题1**/
    private String radio5;

    /**数据库列类型:String,数据库列注释:选择问题1**/
    private String radio6;

    /**数据库列类型:String,数据库列注释:问题1**/
    private String question1;

    /**数据库列类型:String,数据库列注释:问题1**/
    private String question2;

    /**数据库列类型:String,数据库列注释:问题1**/
    private String question3;

    /**数据库列类型:String,数据库列注释:问题1**/
    private String question4;

    /**数据库列类型:String,数据库列注释:问题1**/
    private String question5;

    /**数据库列类型:String,数据库列注释:问题1**/
    private String question6;

    /**数据库列类型:String,数据库列注释:操作人员id**/
    private String operateuserid;

    /**数据库列类型:String,数据库列注释:操作人员姓名**/
    private String operateusername;

    /**数据库列类型:Date,数据库列注释:登记时间**/
    private String operatedate;

    /**数据库列类型:Date,数据库列注释:修改时间**/
    private String updatedate;

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

    /**数据库列类型:String,数据库列注释:null**/
    private String remark6;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
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

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid == null ? null : depid.trim();
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname == null ? null : depname.trim();
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

    public String getRadio1() {
        return radio1;
    }

    public void setRadio1(String radio1) {
        this.radio1 = radio1 == null ? null : radio1.trim();
    }

    public String getRadio2() {
        return radio2;
    }

    public void setRadio2(String radio2) {
        this.radio2 = radio2 == null ? null : radio2.trim();
    }

    public String getRadio3() {
        return radio3;
    }

    public void setRadio3(String radio3) {
        this.radio3 = radio3 == null ? null : radio3.trim();
    }

    public String getRadio4() {
        return radio4;
    }

    public void setRadio4(String radio4) {
        this.radio4 = radio4 == null ? null : radio4.trim();
    }

    public String getRadio5() {
        return radio5;
    }

    public void setRadio5(String radio5) {
        this.radio5 = radio5 == null ? null : radio5.trim();
    }

    public String getRadio6() {
        return radio6;
    }

    public void setRadio6(String radio6) {
        this.radio6 = radio6 == null ? null : radio6.trim();
    }

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1 == null ? null : question1.trim();
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2 == null ? null : question2.trim();
    }

    public String getQuestion3() {
        return question3;
    }

    public void setQuestion3(String question3) {
        this.question3 = question3 == null ? null : question3.trim();
    }

    public String getQuestion4() {
        return question4;
    }

    public void setQuestion4(String question4) {
        this.question4 = question4 == null ? null : question4.trim();
    }

    public String getQuestion5() {
        return question5;
    }

    public void setQuestion5(String question5) {
        this.question5 = question5 == null ? null : question5.trim();
    }

    public String getQuestion6() {
        return question6;
    }

    public void setQuestion6(String question6) {
        this.question6 = question6 == null ? null : question6.trim();
    }

    public String getOperateuserid() {
        return operateuserid;
    }

    public void setOperateuserid(String operateuserid) {
        this.operateuserid = operateuserid == null ? null : operateuserid.trim();
    }

    public String getOperateusername() {
        return operateusername;
    }

    public void setOperateusername(String operateusername) {
        this.operateusername = operateusername == null ? null : operateusername.trim();
    }

    public String getOperatedate() {
        return operatedate;
    }

    public void setOperatedate(String operatedate) {
        this.operatedate = operatedate;
    }

    public String getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate;
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

    public String getRemark6() {
        return remark6;
    }

    public void setRemark6(String remark6) {
        this.remark6 = remark6 == null ? null : remark6.trim();
    }
}