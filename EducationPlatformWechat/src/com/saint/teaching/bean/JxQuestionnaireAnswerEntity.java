package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxQuestionnaireAnswerEntity extends JxQuestionnaireAnswerKey {
    /**���ݿ�������:String,���ݿ���ע��:ѧ������**/
    private String studentname;

    /**���ݿ�������:String,���ݿ���ע��:�γ�ID**/
    private String courseid;

    /**���ݿ�������:String,���ݿ���ע��:�γ�����**/
    private String coursename;

    /**���ݿ�������:String,���ݿ���ע��:��������**/
    private String jshnr;

    /**���ݿ�������:String,���ݿ���ע��:�ον�ʦID**/
    private String rkjshid;

    /**���ݿ�������:String,���ݿ���ע��:�ον�ʦ����**/
    private String rkjshname;

    /**���ݿ�������:String,���ݿ���ע��:�Ƿ���� 0���� 1����**/
    private String sfdt;

    /**���ݿ�������:String,���ݿ���ע��:�ʾ���� 1�����������ۿ�**/
    private String wjlb;

    /**���ݿ�������:String,���ݿ���ע��:�����**/
    private String wtda;

    /**���ݿ�������:String,���ݿ���ע��:��Ӧ����**/
    private String dyfsh;

    /**���ݿ�������:String,���ݿ���ע��:�Ƿ���ȷ 0���� 1����**/
    private String sfzq;

    /**���ݿ�������:Date,���ݿ���ע��:����ʱ��**/
    private String createtime;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark1;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark2;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark3;

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
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

    public String getJshnr() {
        return jshnr;
    }

    public void setJshnr(String jshnr) {
        this.jshnr = jshnr == null ? null : jshnr.trim();
    }

    public String getRkjshid() {
        return rkjshid;
    }

    public void setRkjshid(String rkjshid) {
        this.rkjshid = rkjshid == null ? null : rkjshid.trim();
    }

    public String getRkjshname() {
        return rkjshname;
    }

    public void setRkjshname(String rkjshname) {
        this.rkjshname = rkjshname == null ? null : rkjshname.trim();
    }

    public String getSfdt() {
        return sfdt;
    }

    public void setSfdt(String sfdt) {
        this.sfdt = sfdt == null ? null : sfdt.trim();
    }

    public String getWjlb() {
        return wjlb;
    }

    public void setWjlb(String wjlb) {
        this.wjlb = wjlb == null ? null : wjlb.trim();
    }

    public String getWtda() {
        return wtda;
    }

    public void setWtda(String wtda) {
        this.wtda = wtda == null ? null : wtda.trim();
    }

    public String getDyfsh() {
        return dyfsh;
    }

    public void setDyfsh(String dyfsh) {
        this.dyfsh = dyfsh == null ? null : dyfsh.trim();
    }

    public String getSfzq() {
        return sfzq;
    }

    public void setSfzq(String sfzq) {
        this.sfzq = sfzq == null ? null : sfzq.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
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