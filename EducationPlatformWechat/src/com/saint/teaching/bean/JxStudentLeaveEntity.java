package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxStudentLeaveEntity extends PageEntity {
    /**���ݿ�������:String,���ݿ���ע��:Ψһ����**/
    private String xh;

    /**���ݿ�������:String,���ݿ���ע��:ѧ��ID**/
    private String stuid;

    /**���ݿ�������:String,���ݿ���ע��:ѧ������**/
    private String stuname;

    /**���ݿ�������:String,���ݿ���ע��:״̬**/
    private String state;

    /**���ݿ�������:String,���ݿ���ע��:�������**/
    private String cause;

    /**���ݿ�������:Date,���ݿ���ע��:��ٿ�ʼʱ��**/
    private String leavedatestart;

    /**���ݿ�������:Date,���ݿ���ע��:��ٽ���ʱ��**/
    private String leavedateend;

    /**���ݿ�������:String,���ݿ���ע��:�������**/
    private String type;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark1;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark2;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark3;

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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

    public String getLeavedatestart() {
        return leavedatestart;
    }

    public void setLeavedatestart(String leavedatestart) {
        this.leavedatestart = leavedatestart;
    }

    public String getLeavedateend() {
        return leavedateend;
    }

    public void setLeavedateend(String leavedateend) {
        this.leavedateend = leavedateend;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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