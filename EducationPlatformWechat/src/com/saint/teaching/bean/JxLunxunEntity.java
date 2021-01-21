package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxLunxunEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:主键**/
    private String xh;

    /**数据库列类型:String,数据库列注释:组编号**/
    private String zuid;

    /**数据库列类型:String,数据库列注释:组名称**/
    private String zuname;

    /**数据库列类型:String,数据库列注释:班级编号**/
    private String classid;

    /**数据库列类型:String,数据库列注释:班级名称**/
    private String classname;

    /**数据库列类型:String,数据库列注释:科室编号**/
    private String deptid;

    /**数据库列类型:Date,数据库列注释:轮训开始时间**/
    private String startdate;

    /**数据库列类型:Date,数据库列注释:轮训结束时间**/
    private String enddate;

    /**数据库列类型:String,数据库列注释:科室老师编号**/
    private String teacherid;

    /**数据库列类型:String,数据库列注释:科室老师姓名**/
    private String teachername;

    /**数据库列类型:String,数据库列注释:科室老师联系电话**/
    private String teachertel;

    /**数据库列类型:BigDecimal,数据库列注释:轮训总科室数**/
    private String total;

    /**数据库列类型:String,数据库列注释:当前科室顺序**/
    private String num;

    /**数据库列类型:String,数据库列注释:科室位置**/
    private String weizhi;

    /**数据库列类型:String,数据库列注释:科室说明**/
    private String explain;

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

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
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

    public String getTeachertel() {
        return teachertel;
    }

    public void setTeachertel(String teachertel) {
        this.teachertel = teachertel == null ? null : teachertel.trim();
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public String getWeizhi() {
        return weizhi;
    }

    public void setWeizhi(String weizhi) {
        this.weizhi = weizhi == null ? null : weizhi.trim();
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain == null ? null : explain.trim();
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