package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxBreakSchoolEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:null**/
    private String xh;

    /**数据库列类型:String,数据库列注释:违纪学生ID**/
    private String stuid;

    /**数据库列类型:String,数据库列注释:违纪学生姓名**/
    private String stuname;

    /**数据库列类型:String,数据库列注释:登记科室ID**/
    private String deptid;

    /**数据库列类型:String,数据库列注释:登记科室名称**/
    private String deptname;

    /**数据库列类型:String,数据库列注释:违纪类型**/
    private String breaktype;

    /**数据库列类型:String,数据库列注释:学生所在学校id**/
    private String stuschoolid;

    /**数据库列类型:String,数据库列注释:学生所在学校名称**/
    private String stuschoolname;

    /**数据库列类型:String,数据库列注释:学生学历**/
    private String education;

    /**数据库列类型:String,数据库列注释:状态（1：科室登记；2:科室已处理，不上报；3：上报至教学部；4：教学部已处理；5：上报至学校）**/
    private String state;

    /**数据库列类型:String,数据库列注释:科室处理方式**/
    private String depdisposemod;

    /**数据库列类型:String,数据库列注释:科室处理结果**/
    private String depdisposeresult;

    /**数据库列类型:String,数据库列注释:科室处理意见**/
    private String depdisposeyj;

    /**数据库列类型:Date,数据库列注释:科室处理时间**/
    private String depdisposedate;

    /**数据库列类型:String,数据库列注释:教学部处理方式**/
    private String jxbdisposemod;

    /**数据库列类型:String,数据库列注释:教学部处理结果**/
    private String jxbdisposeresult;

    /**数据库列类型:String,数据库列注释:教学部处理意见**/
    private String jxbdisposeyj;

    /**数据库列类型:Date,数据库列注释:教学部处理时间**/
    private String jxbdisposedate;

    /**数据库列类型:String,数据库列注释:学校处理方式**/
    private String xxbdisposemod;

    /**数据库列类型:String,数据库列注释:学校处理结果**/
    private String xxbdisposeresult;

    /**数据库列类型:String,数据库列注释:学校处理意见**/
    private String xxbdisposeyj;

    /**数据库列类型:Date,数据库列注释:学校处理时间**/
    private String xxbdisposedate;

    /**数据库列类型:String,数据库列注释:登记人ID**/
    private String opemid;

    /**数据库列类型:String,数据库列注释:登记人姓名**/
    private String opemname;

    /**数据库列类型:Date,数据库列注释:登记时间**/
    private String opdate;

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

    /**数据库列类型:String,数据库列注释:违纪内容**/
    private String content;

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

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getBreaktype() {
        return breaktype;
    }

    public void setBreaktype(String breaktype) {
        this.breaktype = breaktype == null ? null : breaktype.trim();
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

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getDepdisposemod() {
        return depdisposemod;
    }

    public void setDepdisposemod(String depdisposemod) {
        this.depdisposemod = depdisposemod == null ? null : depdisposemod.trim();
    }

    public String getDepdisposeresult() {
        return depdisposeresult;
    }

    public void setDepdisposeresult(String depdisposeresult) {
        this.depdisposeresult = depdisposeresult == null ? null : depdisposeresult.trim();
    }

    public String getDepdisposeyj() {
        return depdisposeyj;
    }

    public void setDepdisposeyj(String depdisposeyj) {
        this.depdisposeyj = depdisposeyj == null ? null : depdisposeyj.trim();
    }

    public String getDepdisposedate() {
        return depdisposedate;
    }

    public void setDepdisposedate(String depdisposedate) {
        this.depdisposedate = depdisposedate;
    }

    public String getJxbdisposemod() {
        return jxbdisposemod;
    }

    public void setJxbdisposemod(String jxbdisposemod) {
        this.jxbdisposemod = jxbdisposemod == null ? null : jxbdisposemod.trim();
    }

    public String getJxbdisposeresult() {
        return jxbdisposeresult;
    }

    public void setJxbdisposeresult(String jxbdisposeresult) {
        this.jxbdisposeresult = jxbdisposeresult == null ? null : jxbdisposeresult.trim();
    }

    public String getJxbdisposeyj() {
        return jxbdisposeyj;
    }

    public void setJxbdisposeyj(String jxbdisposeyj) {
        this.jxbdisposeyj = jxbdisposeyj == null ? null : jxbdisposeyj.trim();
    }

    public String getJxbdisposedate() {
        return jxbdisposedate;
    }

    public void setJxbdisposedate(String jxbdisposedate) {
        this.jxbdisposedate = jxbdisposedate;
    }

    public String getXxbdisposemod() {
        return xxbdisposemod;
    }

    public void setXxbdisposemod(String xxbdisposemod) {
        this.xxbdisposemod = xxbdisposemod == null ? null : xxbdisposemod.trim();
    }

    public String getXxbdisposeresult() {
        return xxbdisposeresult;
    }

    public void setXxbdisposeresult(String xxbdisposeresult) {
        this.xxbdisposeresult = xxbdisposeresult == null ? null : xxbdisposeresult.trim();
    }

    public String getXxbdisposeyj() {
        return xxbdisposeyj;
    }

    public void setXxbdisposeyj(String xxbdisposeyj) {
        this.xxbdisposeyj = xxbdisposeyj == null ? null : xxbdisposeyj.trim();
    }

    public String getXxbdisposedate() {
        return xxbdisposedate;
    }

    public void setXxbdisposedate(String xxbdisposedate) {
        this.xxbdisposedate = xxbdisposedate;
    }

    public String getOpemid() {
        return opemid;
    }

    public void setOpemid(String opemid) {
        this.opemid = opemid == null ? null : opemid.trim();
    }

    public String getOpemname() {
        return opemname;
    }

    public void setOpemname(String opemname) {
        this.opemname = opemname == null ? null : opemname.trim();
    }

    public String getOpdate() {
        return opdate;
    }

    public void setOpdate(String opdate) {
        this.opdate = opdate;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}