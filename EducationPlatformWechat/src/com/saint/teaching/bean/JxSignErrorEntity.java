package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxSignErrorEntity extends PageEntity {
    /**���ݿ�������:String,���ݿ���ע��:Ψһ����**/
    private String xh;

    /**���ݿ�������:String,���ݿ���ע��:ǩ����ԱID**/
    private String stuid;

    /**���ݿ�������:String,���ݿ���ע��:ǩ����Ա����**/
    private String stuname;

    /**���ݿ�������:Date,���ݿ���ע��:ǩ��ʱ��**/
    private String signtime;

    /**���ݿ�������:String,���ݿ���ע��:ǩ��ʧ��ԭ��**/
    private String cause;

    /**���ݿ�������:String,���ݿ���ע��:ʧ����Աopenid**/
    private String openid;

    /**���ݿ�������:String,���ݿ���ע��:��Ա����**/
    private String type;

    /**���ݿ�������:String,���ݿ���ע��:��Ա���һ�༶**/
    private String dept;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remarks1;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remarks2;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remarks3;

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

    public String getSigntime() {
        return signtime;
    }

    public void setSigntime(String signtime) {
        this.signtime = signtime;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public String getRemarks1() {
        return remarks1;
    }

    public void setRemarks1(String remarks1) {
        this.remarks1 = remarks1 == null ? null : remarks1.trim();
    }

    public String getRemarks2() {
        return remarks2;
    }

    public void setRemarks2(String remarks2) {
        this.remarks2 = remarks2 == null ? null : remarks2.trim();
    }

    public String getRemarks3() {
        return remarks3;
    }

    public void setRemarks3(String remarks3) {
        this.remarks3 = remarks3 == null ? null : remarks3.trim();
    }
}