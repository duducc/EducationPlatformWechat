package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxStudentLeaveCheckEntity extends PageEntity {
    /**���ݿ�������:String,���ݿ���ע��:Ψһ����**/
    private String xh;

    /**���ݿ�������:String,���ݿ���ע��:��ٱ�id**/
    private String stulevid;

    /**���ݿ�������:String,���ݿ���ע��:���˳��**/
    private String checkorder;

    /**���ݿ�������:String,���ݿ���ע��:�����id**/
    private String checkperid;

    /**���ݿ�������:String,���ݿ���ע��:���״̬��1.ͨ����2.��ͨ����**/
    private String state;

    /**���ݿ�������:String,���ݿ���ע��:˵��**/
    private String explanation;

    /**���ݿ�������:Date,���ݿ���ע��:��������**/
    private String createdate;

    /**���ݿ�������:Date,���ݿ���ע��:null**/
    private String uptime;

    /**���ݿ�������:String,���ݿ���ע��:����˿���**/
    private String checkperdepart;

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

    public String getStulevid() {
        return stulevid;
    }

    public void setStulevid(String stulevid) {
        this.stulevid = stulevid == null ? null : stulevid.trim();
    }

    public String getCheckorder() {
        return checkorder;
    }

    public void setCheckorder(String checkorder) {
        this.checkorder = checkorder == null ? null : checkorder.trim();
    }

    public String getCheckperid() {
        return checkperid;
    }

    public void setCheckperid(String checkperid) {
        this.checkperid = checkperid == null ? null : checkperid.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation == null ? null : explanation.trim();
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public String getCheckperdepart() {
        return checkperdepart;
    }

    public void setCheckperdepart(String checkperdepart) {
        this.checkperdepart = checkperdepart == null ? null : checkperdepart.trim();
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