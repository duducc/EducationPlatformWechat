package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxTeachingManusEntity extends PageEntity {
    /**���ݿ�������:String,���ݿ���ע��:�ֲ�id**/
    private String manuId;

    /**���ݿ�������:String,���ݿ���ע��:�ֲ���**/
    private String manuJc;

    /**���ݿ�������:String,���ݿ���ע��:�ֲ�����**/
    private String manuName;

    /**���ݿ�������:String,���ݿ���ע��:�ֲ����**/
    private String manuDm;

    /**���ݿ�������:BigDecimal,���ݿ���ע��:�ֲ�����**/
    private String manuShl;

    /**���ݿ�������:String,���ݿ���ע��:ͼƬ·��**/
    private String manuImg;

    /**���ݿ�������:String,���ݿ���ע��:˵��**/
    private String manuShm;

    /**���ݿ�������:String,���ݿ���ע��:״̬**/
    private String state;

    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String manuType;

    /**���ݿ�������:String,���ݿ���ע��:������**/
    private String glbm;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark1;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark2;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark3;

    /**���ݿ�������:Date,���ݿ���ע��:����ʱ��**/
    private String manuDate;

    public String getManuId() {
        return manuId;
    }

    public void setManuId(String manuId) {
        this.manuId = manuId == null ? null : manuId.trim();
    }

    public String getManuJc() {
        return manuJc;
    }

    public void setManuJc(String manuJc) {
        this.manuJc = manuJc == null ? null : manuJc.trim();
    }

    public String getManuName() {
        return manuName;
    }

    public void setManuName(String manuName) {
        this.manuName = manuName == null ? null : manuName.trim();
    }

    public String getManuDm() {
        return manuDm;
    }

    public void setManuDm(String manuDm) {
        this.manuDm = manuDm == null ? null : manuDm.trim();
    }

    public String getManuShl() {
        return manuShl;
    }

    public void setManuShl(String manuShl) {
        this.manuShl = manuShl;
    }

    public String getManuImg() {
        return manuImg;
    }

    public void setManuImg(String manuImg) {
        this.manuImg = manuImg == null ? null : manuImg.trim();
    }

    public String getManuShm() {
        return manuShm;
    }

    public void setManuShm(String manuShm) {
        this.manuShm = manuShm == null ? null : manuShm.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getManuType() {
        return manuType;
    }

    public void setManuType(String manuType) {
        this.manuType = manuType == null ? null : manuType.trim();
    }

    public String getGlbm() {
        return glbm;
    }

    public void setGlbm(String glbm) {
        this.glbm = glbm == null ? null : glbm.trim();
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

    public String getManuDate() {
        return manuDate;
    }

    public void setManuDate(String manuDate) {
        this.manuDate = manuDate;
    }
}