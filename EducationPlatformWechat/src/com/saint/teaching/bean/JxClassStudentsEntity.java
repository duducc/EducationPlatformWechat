package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxClassStudentsEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:主键**/
    private String xh;

    /**数据库列类型:String,数据库列注释:班级id 关联班级表**/
    private String classid;

    /**数据库列类型:String,数据库列注释:班级名称**/
    private String classname;

    /**数据库列类型:String,数据库列注释:学生id 关联学生表**/
    private String studentid;

    /**数据库列类型:String,数据库列注释:学生姓名**/
    private String studentname;

    /**数据库列类型:Long,数据库列注释:分组数**/
    private String zushu;

    /**数据库列类型:String,数据库列注释:组编号**/
    private String zuid;

    /**数据库列类型:String,数据库列注释:组名称**/
    private String zuname;

    /**数据库列类型:Long,数据库列注释:分组方式 1 自动分组 2 手动分组**/
    private String fenzustyle;

    /**数据库列类型:String,数据库列注释:创建人id**/
    private String createuserid;

    /**数据库列类型:String,数据库列注释:创建人姓名**/
    private String createusername;

    /**数据库列类型:Date,数据库列注释:创建时间**/
    private String createtime;

    /**数据库列类型:Date,数据库列注释:更新时间**/
    private String updatetime;

    /**数据库列类型:String,数据库列注释:备注**/
    private String remark1;

    /**数据库列类型:String,数据库列注释:备注**/
    private String remark2;

    /**数据库列类型:String,数据库列注释:备注**/
    private String remark3;

    /**数据库列类型:String,数据库列注释:备注**/
    private String remark4;

    /**数据库列类型:String,数据库列注释:备注**/
    private String remark5;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid == null ? null : classid.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
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

    public String getZushu() {
        return zushu;
    }

    public void setZushu(String zushu) {
        this.zushu = zushu;
    }

    public String getZuid() {
        return zuid;
    }

    public void setZuid(String zuid) {
        this.zuid = zuid == null ? null : zuid.trim();
    }

    public String getZuname() {
        return zuname;
    }

    public void setZuname(String zuname) {
        this.zuname = zuname == null ? null : zuname.trim();
    }

    public String getFenzustyle() {
        return fenzustyle;
    }

    public void setFenzustyle(String fenzustyle) {
        this.fenzustyle = fenzustyle;
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid	) {
        this.createuserid	= createuserid	== null ? null : createuserid.trim();
    }

    public String getCreateusername() {
        return createusername;
    }

    public void setCreateusername(String createusername) {
        this.createusername = createusername == null ? null : createusername.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
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