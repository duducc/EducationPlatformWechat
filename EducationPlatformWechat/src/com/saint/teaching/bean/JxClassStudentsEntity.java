package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxClassStudentsEntity extends PageEntity {
    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String xh;

    /**���ݿ�������:String,���ݿ���ע��:�༶id �����༶��**/
    private String classid;

    /**���ݿ�������:String,���ݿ���ע��:�༶����**/
    private String classname;

    /**���ݿ�������:String,���ݿ���ע��:ѧ��id ����ѧ����**/
    private String studentid;

    /**���ݿ�������:String,���ݿ���ע��:ѧ������**/
    private String studentname;

    /**���ݿ�������:Long,���ݿ���ע��:������**/
    private String zushu;

    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String zuid;

    /**���ݿ�������:String,���ݿ���ע��:������**/
    private String zuname;

    /**���ݿ�������:Long,���ݿ���ע��:���鷽ʽ 1 �Զ����� 2 �ֶ�����**/
    private String fenzustyle;

    /**���ݿ�������:String,���ݿ���ע��:������id**/
    private String createuserid;

    /**���ݿ�������:String,���ݿ���ע��:����������**/
    private String createusername;

    /**���ݿ�������:Date,���ݿ���ע��:����ʱ��**/
    private String createtime;

    /**���ݿ�������:Date,���ݿ���ע��:����ʱ��**/
    private String updatetime;

    /**���ݿ�������:String,���ݿ���ע��:��ע**/
    private String remark1;

    /**���ݿ�������:String,���ݿ���ע��:��ע**/
    private String remark2;

    /**���ݿ�������:String,���ݿ���ע��:��ע**/
    private String remark3;

    /**���ݿ�������:String,���ݿ���ע��:��ע**/
    private String remark4;

    /**���ݿ�������:String,���ݿ���ע��:��ע**/
    private String remark5;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid == null ? null : classid.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
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

    public String getZushu() {
        return zushu;
    }

    public void setZushu(String zushu) {
        this.zushu = zushu;
    }

    public String getZuid() {
        return zuid;
    }

    public void setZuid(String zuid) {
        this.zuid = zuid == null ? null : zuid.trim();
    }

    public String getZuname() {
        return zuname;
    }

    public void setZuname(String zuname) {
        this.zuname = zuname == null ? null : zuname.trim();
    }

    public String getFenzustyle() {
        return fenzustyle;
    }

    public void setFenzustyle(String fenzustyle) {
        this.fenzustyle = fenzustyle;
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid	) {
        this.createuserid	= createuserid	== null ? null : createuserid.trim();
    }

    public String getCreateusername() {
        return createusername;
    }

    public void setCreateusername(String createusername) {
        this.createusername = createusername == null ? null : createusername.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
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