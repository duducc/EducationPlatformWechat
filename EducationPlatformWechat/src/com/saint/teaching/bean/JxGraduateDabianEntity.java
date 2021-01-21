package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxGraduateDabianEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:序号**/
    private String xh;

    /**数据库列类型:String,数据库列注释:学生id**/
    private String stuid;

    /**数据库列类型:String,数据库列注释:学生姓名**/
    private String stuname;

    /**数据库列类型:String,数据库列注释:学生联系电话**/
    private String stutel;

    /**数据库列类型:String,数据库列注释:学生学校id**/
    private String stuschoolid;

    /**数据库列类型:String,数据库列注释:学生学校名称**/
    private String stuschoolname;

    /**数据库列类型:String,数据库列注释:学生学员id**/
    private String collageid;

    /**数据库列类型:String,数据库列注释:学生学院名称**/
    private String collagename;

    /**数据库列类型:String,数据库列注释:学生年级**/
    private String stugrade;

    /**数据库列类型:String,数据库列注释:学生专业id**/
    private String stuprofessid;

    /**数据库列类型:String,数据库列注释:学生专业名称**/
    private String stuprofessname;

    /**数据库列类型:String,数据库列注释:年度**/
    private String stuyear;

    /**数据库列类型:String,数据库列注释:是否规培**/
    private String sfgp;

    /**数据库列类型:String,数据库列注释:导师id**/
    private String teacherid;

    /**数据库列类型:String,数据库列注释:导师姓名**/
    private String teachername;

    /**数据库列类型:String,数据库列注释:导师科室id**/
    private String teacherdeptid;

    /**数据库列类型:String,数据库列注释:导师科室姓名**/
    private String teacherdeptname;

    /**数据库列类型:Date,数据库列注释:答辩时间**/
    private String dbdate;

    /**数据库列类型:String,数据库列注释:答辩地点**/
    private String dbposition;

    /**数据库列类型:String,数据库列注释:答辩题目**/
    private String dbtopic;

    /**数据库列类型:String,数据库列注释:附件路径**/
    private String fjlj;

    /**数据库列类型:String,数据库列注释:附件名称**/
    private String fjname;

    /**数据库列类型:String,数据库列注释:状态（0：已保存、未上报；1：已上报，未审核；2：教学部审核通过；3：教学部审核不通过；）**/
    private String state;

    /**数据库列类型:String,数据库列注释:答辩类型（1：预答辩；2：正式答辩）**/
    private String type;

    /**数据库列类型:String,数据库列注释:备用**/
    private String dbst;

    /**数据库列类型:String,数据库列注释:备用**/
    private String shstate;

    /**数据库列类型:String,数据库列注释:审核人id**/
    private String shrid;

    /**数据库列类型:String,数据库列注释:审核人姓名**/
    private String shrname;

    /**数据库列类型:Date,数据库列注释:审核时间**/
    private String shtime;

    /**数据库列类型:String,数据库列注释:审核意见**/
    private String shyj;

    /**数据库列类型:String,数据库列注释:信息提醒状态（0：未提醒；1已提醒）**/
    private String remindst;

    /**数据库列类型:Date,数据库列注释:信息提醒时间**/
    private String reminddate;

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

    /**数据库列类型:Date,数据库列注释:创建时间**/
    private String creditdate;

    /**数据库列类型:Date,数据库列注释:更新时间**/
    private String uptime;

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

    public String getStutel() {
        return stutel;
    }

    public void setStutel(String stutel) {
        this.stutel = stutel == null ? null : stutel.trim();
    }

    public String getStuschoolid() {
        return stuschoolid;
    }

    public void setStuschoolid(String stuschoolid) {
        this.stuschoolid = stuschoolid == null ? null : stuschoolid.trim();
    }

    public String getStuschoolname() {
        return stuschoolname;
    }

    public void setStuschoolname(String stuschoolname) {
        this.stuschoolname = stuschoolname == null ? null : stuschoolname.trim();
    }

    public String getCollageid() {
        return collageid;
    }

    public void setCollageid(String collageid) {
        this.collageid = collageid == null ? null : collageid.trim();
    }

    public String getCollagename() {
        return collagename;
    }

    public void setCollagename(String collagename) {
        this.collagename = collagename == null ? null : collagename.trim();
    }

    public String getStugrade() {
        return stugrade;
    }

    public void setStugrade(String stugrade) {
        this.stugrade = stugrade == null ? null : stugrade.trim();
    }

    public String getStuprofessid() {
        return stuprofessid;
    }

    public void setStuprofessid(String stuprofessid) {
        this.stuprofessid = stuprofessid == null ? null : stuprofessid.trim();
    }

    public String getStuprofessname() {
        return stuprofessname;
    }

    public void setStuprofessname(String stuprofessname) {
        this.stuprofessname = stuprofessname == null ? null : stuprofessname.trim();
    }

    public String getStuyear() {
        return stuyear;
    }

    public void setStuyear(String stuyear) {
        this.stuyear = stuyear == null ? null : stuyear.trim();
    }

    public String getSfgp() {
        return sfgp;
    }

    public void setSfgp(String sfgp) {
        this.sfgp = sfgp == null ? null : sfgp.trim();
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

    public String getTeacherdeptid() {
        return teacherdeptid;
    }

    public void setTeacherdeptid(String teacherdeptid) {
        this.teacherdeptid = teacherdeptid == null ? null : teacherdeptid.trim();
    }

    public String getTeacherdeptname() {
        return teacherdeptname;
    }

    public void setTeacherdeptname(String teacherdeptname) {
        this.teacherdeptname = teacherdeptname == null ? null : teacherdeptname.trim();
    }

    public String getDbdate() {
        return dbdate;
    }

    public void setDbdate(String dbdate) {
        this.dbdate = dbdate;
    }

    public String getDbposition() {
        return dbposition;
    }

    public void setDbposition(String dbposition) {
        this.dbposition = dbposition == null ? null : dbposition.trim();
    }

    public String getDbtopic() {
        return dbtopic;
    }

    public void setDbtopic(String dbtopic) {
        this.dbtopic = dbtopic == null ? null : dbtopic.trim();
    }

    public String getFjlj() {
        return fjlj;
    }

    public void setFjlj(String fjlj) {
        this.fjlj = fjlj == null ? null : fjlj.trim();
    }

    public String getFjname() {
        return fjname;
    }

    public void setFjname(String fjname) {
        this.fjname = fjname == null ? null : fjname.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDbst() {
        return dbst;
    }

    public void setDbst(String dbst) {
        this.dbst = dbst == null ? null : dbst.trim();
    }

    public String getShstate() {
        return shstate;
    }

    public void setShstate(String shstate) {
        this.shstate = shstate == null ? null : shstate.trim();
    }

    public String getShrid() {
        return shrid;
    }

    public void setShrid(String shrid) {
        this.shrid = shrid == null ? null : shrid.trim();
    }

    public String getShrname() {
        return shrname;
    }

    public void setShrname(String shrname) {
        this.shrname = shrname == null ? null : shrname.trim();
    }

    public String getShtime() {
        return shtime;
    }

    public void setShtime(String shtime) {
        this.shtime = shtime;
    }

    public String getShyj() {
        return shyj;
    }

    public void setShyj(String shyj) {
        this.shyj = shyj == null ? null : shyj.trim();
    }

    public String getRemindst() {
        return remindst;
    }

    public void setRemindst(String remindst) {
        this.remindst = remindst == null ? null : remindst.trim();
    }

    public String getReminddate() {
        return reminddate;
    }

    public void setReminddate(String reminddate) {
        this.reminddate = reminddate;
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

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }
}