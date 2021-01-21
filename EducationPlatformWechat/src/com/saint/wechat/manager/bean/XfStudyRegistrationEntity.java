package com.saint.wechat.manager.bean;

import com.saint.pub.plugin.PageEntity;

public class XfStudyRegistrationEntity extends PageEntity {
    /**���ݿ�������:String,���ݿ���ע��:���**/
    private String xh;

    /**���ݿ�������:BigDecimal,���ݿ���ע��:�γ�id**/
    private String courseId;

    /**���ݿ�������:String,���ݿ���ע��:ѧԱҽͨ����xf_employee��user_number�ֶ�**/
    private String empNumber;

    /**���ݿ�������:BigDecimal,���ݿ���ע��:��λid**/
    private String deptId;

    /**���ݿ�������:String,���ݿ���ע��:��������**/
    private String deptName;

    /**���ݿ�������:String,���ݿ���ע��:�γ�����**/
    private String courseName;

    /**���ݿ�������:String,���ݿ���ע��:�ص�����**/
    private String placeName;

    /**���ݿ�������:String,���ݿ���ע��:���꾭γ��**/
    private String position;

    /**���ݿ�������:Date,���ݿ���ע��:�򿨵Ǽ�ʱ��**/
    private String dakaTime;

    /**���ݿ�������:String,���ݿ���ע��:�򿨵Ǽ����**/
    private String addYear;

    /**���ݿ�������:Long,���ݿ���ע��:���Ƿ���Ч**/
    private String isvalid;

    /**���ݿ�������:Long,���ݿ���ע��:�Ƿ����ܷ�**/
    private String isgrant;

    /**���ݿ�������:String,���ݿ���ע��:��״̬��0 ������1�ٵ���2����**/
    private String awardstate;

    /**���ݿ�������:String,���ݿ���ע��:����Դ��0 pos�򿨣�1 ΢��ˢ��**/
    private String state;

    /**���ݿ�������:Date,���ݿ���ע��:���ʱ�䣨�ϴ�ʱ�䣩**/
    private String addTime;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remarks1;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remarks2;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remarks3;

    /**���ݿ�������:Date,���ݿ���ע��:����ʱ��**/
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

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber == null ? null : empNumber.trim();
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