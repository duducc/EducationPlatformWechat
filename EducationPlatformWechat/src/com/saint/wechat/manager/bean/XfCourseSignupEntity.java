package com.saint.wechat.manager.bean;

import com.saint.pub.plugin.PageEntity;

public class XfCourseSignupEntity extends XfCourseSignupKey {
    private String xm;

    private String proId;

    private String proName;

    private String coursesTask;

    private String coursesContent;

    private String credit;

    private String hours;

    private String method;

    private String state;

    private String signupDate;

    private String remark1;

    private String remark2;

    private String remark3;

    private String gxsj;

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId == null ? null : proId.trim();
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public String getCoursesTask() {
        return coursesTask;
    }

    public void setCoursesTask(String coursesTask) {
        this.coursesTask = coursesTask == null ? null : coursesTask.trim();
    }

    public String getCoursesContent() {
        return coursesContent;
    }

    public void setCoursesContent(String coursesContent) {
        this.coursesContent = coursesContent == null ? null : coursesContent.trim();
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getSignupDate() {
        return signupDate;
    }

    public void setSignupDate(String signupDate) {
        this.signupDate = signupDate;
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

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }
}