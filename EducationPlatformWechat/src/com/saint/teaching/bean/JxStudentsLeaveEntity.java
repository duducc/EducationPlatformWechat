package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxStudentsLeaveEntity extends PageEntity {
    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String xh;

    /**���ݿ�������:String,���ݿ���ע��:ѧ��ID**/
    private String stuid;

    /**���ݿ�������:String,���ݿ���ע��:ѧ������**/
    private String stuname;

    /**���ݿ�������:String,���ݿ���ע��:��Ա���� dmjc='EMPLX'**/
    private String emplx;

    /**���ݿ�������:String,���ݿ���ע��:״̬(0�����ύ��1-1���������ͨ����1-2��������˲�ͨ����2-1���ƽ̿����ͨ����2-2���ƽ̿���˲�ͨ����3-1��ѧУ���ͨ����3-2��ѧУ��˲�ͨ����9���ѳ�����)**/
    private String state;

    /**���ݿ�������:String,���ݿ���ע��:�������**/
    private String cause;

    /**���ݿ�������:Date,���ݿ���ע��:��ٿ�ʼʱ��**/
    private String leavedatestart;

    /**���ݿ�������:Date,���ݿ���ע��:��ٽ���ʱ��**/
    private String leavedateend;

    /**���ݿ�������:String,���ݿ���ע��:�������**/
    private String type;

    /**���ݿ�������:String,���ݿ���ע��:ͼƬ·��1**/
    private String picpatho;

    /**���ݿ�������:String,���ݿ���ע��:ͼƬ·��2**/
    private String picpatht;

    /**���ݿ�������:String,���ݿ���ע��:ͼƬ·��3**/
    private String picpaths;

    /**���ݿ�������:String,���ݿ���ע��:�γ�ID**/
    private String courseid;

    /**���ݿ�������:String,���ݿ���ע��:�γ�����**/
    private String coursename;

    /**���ݿ�������:String,���ݿ���ע��:�ν�ID**/
    private String arrangexh;

    /**���ݿ�������:String,���ݿ���ע��:��������**/
    private String jshnr;

    /**���ݿ�������:String,���ݿ���ע��:�����id**/
    private String checkperid;

    /**���ݿ�������:String,���ݿ���ע��:������ʦID**/
    private String teacherid;

    /**���ݿ�������:String,���ݿ���ע��:������ʦ����**/
    private String teachername;

    /**���ݿ�������:String,���ݿ���ע��:��ѵ����ID**/
    private String lunxundept;

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

    public String getEmplx() {
        return emplx;
    }

    public void setEmplx(String emplx) {
        this.emplx = emplx == null ? null : emplx.trim();
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

    public String getPicpatho() {
        return picpatho;
    }

    public void setPicpatho(String picpatho) {
        this.picpatho = picpatho == null ? null : picpatho.trim();
    }

    public String getPicpatht() {
        return picpatht;
    }

    public void setPicpatht(String picpatht) {
        this.picpatht = picpatht == null ? null : picpatht.trim();
    }

    public String getPicpaths() {
        return picpaths;
    }

    public void setPicpaths(String picpaths) {
        this.picpaths = picpaths == null ? null : picpaths.trim();
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid == null ? null : courseid.trim();
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public String getArrangexh() {
        return arrangexh;
    }

    public void setArrangexh(String arrangexh) {
        this.arrangexh = arrangexh == null ? null : arrangexh.trim();
    }

    public String getJshnr() {
        return jshnr;
    }

    public void setJshnr(String jshnr) {
        this.jshnr = jshnr == null ? null : jshnr.trim();
    }

    public String getCheckperid() {
        return checkperid;
    }

    public void setCheckperid(String checkperid) {
        this.checkperid = checkperid == null ? null : checkperid.trim();
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

    public String getLunxundept() {
        return lunxundept;
    }

    public void setLunxundept(String lunxundept) {
        this.lunxundept = lunxundept == null ? null : lunxundept.trim();
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