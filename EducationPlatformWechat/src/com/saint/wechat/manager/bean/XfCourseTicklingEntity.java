package com.saint.wechat.manager.bean;

import com.saint.pub.plugin.PageEntity;

public class XfCourseTicklingEntity extends XfCourseTicklingKey {
    /**���ݿ�������:String,���ݿ���ע��:��Ա����**/
    private String username;

    /**���ݿ�������:String,���ݿ���ע��:��ĿID**/
    private String proid;

    /**���ݿ�������:String,���ݿ���ע��:��Ŀ����**/
    private String proname;

    /**���ݿ�������:String,���ݿ���ע��:��Ŀ�ٰ쵥λ**/
    private String holdunit;

    /**���ݿ�������:String,���ݿ���ע��:��������**/
    private String coursename;

    /**���ݿ�������:String,���ݿ���ע��:��Ŀ1**/
    private String subjectone;

    /**���ݿ�������:String,���ݿ���ע��:��Ŀ2**/
    private String subjecttwo;

    /**���ݿ�������:String,���ݿ���ע��:��Ŀ3**/
    private String subjectthree;

    /**���ݿ�������:String,���ݿ���ע��:��Ŀ4**/
    private String subjectfour;

    /**���ݿ�������:String,���ݿ���ע��:��Ŀ5**/
    private String subjectfive;

    /**���ݿ�������:String,���ݿ���ע��:��Ŀ6**/
    private String subjectsix;

    /**���ݿ�������:String,���ݿ���ע��:��Ŀ7**/
    private String subjectseven;

    /**���ݿ�������:Date,���ݿ���ע��:���ʱ��**/
    private String addtime;

    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String type;

    /**���ݿ�������:String,���ݿ���ע��:״̬**/
    private String state;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark1;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark2;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark3;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark4;

    /**���ݿ�������:String,���ݿ���ע��:null**/
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