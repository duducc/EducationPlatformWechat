package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxStudentsGradeEntity extends PageEntity {
    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String xh;

    /**���ݿ�������:String,���ݿ���ע��:ѧԱID**/
    private String studentid;

    /**���ݿ�������:String,���ݿ���ע��:ѧԱ����**/
    private String studentname;

    /**���ݿ�������:String,���ݿ���ע��:��Ա���� dmjc='EMPLX'**/
    private String emplx;

    /**���ݿ�������:String,���ݿ���ע��:�Ӽ���ԭ��**/
    private String jjfyy;

    /**���ݿ�������:BigDecimal,���ݿ���ע��:����**/
    private String grade;

    /**���ݿ�������:Date,���ݿ���ע��:�Ӽ���ʱ��**/
    private String jjfsj;

    /**���ݿ�������:String,���ݿ���ע��:�ص�**/
    private String address;

    /**���ݿ�������:String,���ݿ���ע��:������ID**/
    private String crateid;

    /**���ݿ�������:String,���ݿ���ע��:����������**/
    private String createname;

    /**���ݿ�������:Date,���ݿ���ע��:��������**/
    private String createdate;

    /**���ݿ�������:String,���ݿ���ע��:˵��**/
    private String remark;

    /**���ݿ�������:String,���ݿ���ע��:ʹ�ñ�� 1������ 0������**/
    private String sybj;

    /**���ݿ�������:String,���ݿ���ע��:����ԭ��**/
    private String zfyy;

    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String remark1;

    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String remark2;

    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String remark3;

    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String remark4;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
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

    public String getEmplx() {
        return emplx;
    }

    public void setEmplx(String emplx) {
        this.emplx = emplx == null ? null : emplx.trim();
    }

    public String getJjfyy() {
        return jjfyy;
    }

    public void setJjfyy(String jjfyy) {
        this.jjfyy = jjfyy == null ? null : jjfyy.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getJjfsj() {
        return jjfsj;
    }

    public void setJjfsj(String jjfsj) {
        this.jjfsj = jjfsj;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCrateid() {
        return crateid;
    }

    public void setCrateid(String crateid) {
        this.crateid = crateid == null ? null : crateid.trim();
    }

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname == null ? null : createname.trim();
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSybj() {
        return sybj;
    }

    public void setSybj(String sybj) {
        this.sybj = sybj == null ? null : sybj.trim();
    }

    public String getZfyy() {
        return zfyy;
    }

    public void setZfyy(String zfyy) {
        this.zfyy = zfyy == null ? null : zfyy.trim();
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
}