package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxStudyRegistrationEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:序号**/
    private String xh;

    /**数据库列类型:BigDecimal,数据库列注释:课程id**/
    private String courseId;

    /**数据库列类型:String,数据库列注释:学生工号**/
    private String stuid;

    /**数据库列类型:String,数据库列注释:学生姓名**/
    private String stuname;

    /**数据库列类型:BigDecimal,数据库列注释:学校ID**/
    private String deptId;

    /**数据库列类型:String,数据库列注释:学校名称**/
    private String deptName;

    /**数据库列类型:String,数据库列注释:课程名称**/
    private String courseName;

    /**数据库列类型:String,数据库列注释:地点名称**/
    private String placeName;

    /**数据库列类型:String,数据库列注释:坐标经纬度**/
    private String position;

    /**数据库列类型:Date,数据库列注释:上课签到时间**/
    private String uptime;

    /**数据库列类型:Date,数据库列注释:下课签到时间**/
    private String downtime;

    /**数据库列类型:Date,数据库列注释:打卡登记时间**/
    private String dakaTime;

    /**数据库列类型:String,数据库列注释:打卡登记年份**/
    private String addYear;

    /**数据库列类型:Long,数据库列注释:打卡次数**/
    private String isvalid;

    /**数据库列类型:Long,数据库列注释:是否已受分(0,未授分  1,已授分  2,授分失败)**/
    private String isgrant;

    /**数据库列类型:String,数据库列注释:打卡状态：0 正常；1迟到；2其他**/
    private String awardstate;

    /**数据库列类型:String,数据库列注释:打卡来源：0 微信刷卡**/
    private String state;

    /**数据库列类型:Date,数据库列注释:添加时间（上传时间）**/
    private String addTime;

    /**数据库列类型:String,数据库列注释:null**/
    private String remarks1;

    /**数据库列类型:String,数据库列注释:null**/
    private String remarks2;

    /**数据库列类型:String,数据库列注释:null**/
    private String remarks3;

    /**数据库列类型:Date,数据库列注释:更新时间**/
    private String gxsj;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
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

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName == null ? null : placeName.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public String getDowntime() {
        return downtime;
    }

    public void setDowntime(String downtime) {
        this.downtime = downtime;
    }

    public String getDakaTime() {
        return dakaTime;
    }

    public void setDakaTime(String dakaTime) {
        this.dakaTime = dakaTime;
    }

    public String getAddYear() {
        return addYear;
    }

    public void setAddYear(String addYear) {
        this.addYear = addYear == null ? null : addYear.trim();
    }

    public String getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(String isvalid) {
        this.isvalid = isvalid;
    }

    public String getIsgrant() {
        return isgrant;
    }

    public void setIsgrant(String isgrant) {
        this.isgrant = isgrant;
    }

    public String getAwardstate() {
        return awardstate;
    }

    public void setAwardstate(String awardstate) {
        this.awardstate = awardstate == null ? null : awardstate.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getRemarks1() {
        return remarks1;
    }

    public void setRemarks1(String remarks1) {
        this.remarks1 = remarks1 == null ? null : remarks1.trim();
    }

    public String getRemarks2() {
        return remarks2;
    }

    public void setRemarks2(String remarks2) {
        this.remarks2 = remarks2 == null ? null : remarks2.trim();
    }

    public String getRemarks3() {
        return remarks3;
    }

    public void setRemarks3(String remarks3) {
        this.remarks3 = remarks3 == null ? null : remarks3.trim();
    }

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }
}