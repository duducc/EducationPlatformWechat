package com.saint.research.bean;

import com.saint.pub.plugin.PageEntity;

public class KyProjectGressEntity extends PageEntity {
    /**���ݿ�������:String,���ݿ���ע��:Ψһ��ʶ**/
    private String xh;

    /**���ݿ�������:String,���ݿ���ע��:��Ŀ���**/
    private String prosequence;

    /**���ݿ�������:String,���ݿ���ע��:��Ŀ����**/
    private String proname;

    /**���ݿ�������:String,���ݿ���ע��:��������**/
    private String progressdesc;

    /**���ݿ�������:String,���ݿ���ע��:����������**/
    private String tasknum;

    /**���ݿ�������:String,���ݿ���ע��:������������**/
    private String taskname;

    /**���ݿ�������:Date,���ݿ���ע��:�Ǽ�����**/
    private String regdate;

    /**���ݿ�������:String,���ݿ���ע��:�Ǽ��˱��**/
    private String regperid;

    /**���ݿ�������:String,���ݿ���ע��:�Ǽ�������**/
    private String regpername;

    /**���ݿ�������:BigDecimal,���ݿ���ע��:��ռ��Ŀ�ܱ�**/
    private String proproion;

    /**���ݿ�������:BigDecimal,���ݿ���ע��:������ɱ���**/
    private String subproportion;

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

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getProsequence() {
        return prosequence;
    }

    public void setProsequence(String prosequence) {
        this.prosequence = prosequence == null ? null : prosequence.trim();
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public String getProgressdesc() {
        return progressdesc;
    }

    public void setProgressdesc(String progressdesc) {
        this.progressdesc = progressdesc == null ? null : progressdesc.trim();
    }

    public String getTasknum() {
        return tasknum;
    }

    public void setTasknum(String tasknum) {
        this.tasknum = tasknum == null ? null : tasknum.trim();
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname == null ? null : taskname.trim();
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public String getRegperid() {
        return regperid;
    }

    public void setRegperid(String regperid) {
        this.regperid = regperid == null ? null : regperid.trim();
    }

    public String getRegpername() {
        return regpername;
    }

    public void setRegpername(String regpername) {
        this.regpername = regpername == null ? null : regpername.trim();
    }

    public String getProproion() {
        return proproion;
    }

    public void setProproion(String proproion) {
        this.proproion = proproion;
    }

    public String getSubproportion() {
        return subproportion;
    }

    public void setSubproportion(String subproportion) {
        this.subproportion = subproportion;
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