package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxSignInfoEntity extends PageEntity {
    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String xh;
    
    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String name;
    
    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String marking;
    
    /**���ݿ�������:BigDecimal,���ݿ���ע��:ǩ������**/
    private String signcs;

    /**���ݿ�������:String,���ݿ���ע��:��Чǩ��ʱ����**/
    private String statetime;

    /**���ݿ�������:String,���ݿ���ע��:��Чǩ��ʱ��ֹ**/
    private String endtime;

    /**���ݿ�������:String,���ݿ���ע��:��ʱ������ͣ�1.������2.���һ�Σ�����ʱ��󲻿��ٴ򿨣�**/
    private String timetype;

    /**���ݿ�������:String,���ݿ���ע��:�ص�����**/
    private String politionname;

    /**���ݿ�������:String,���ݿ���ע��:�ص㾭��**/
    private String politionjd;

    /**���ݿ�������:String,���ݿ���ע��:�ص�ά��**/
    private String politionwd;

    /**���ݿ�������:BigDecimal,���ݿ���ע��:ǩ����Χ���뾶��**/
    private String scope;

    /**���ݿ�������:String,���ݿ���ע��:wifiIP��ַ**/
    private String wifiip;

    /**���ݿ�������:String,���ݿ���ע��:WIFI����**/
    private String wifiname;

    /**���ݿ�������:String,���ݿ���ע��:WIFI���ӱ���**/
    private String wifiremark1;

    /**���ݿ�������:String,���ݿ���ע��:WIFI���ӱ���**/
    private String wifiremark2;

    /**���ݿ�������:String,���ݿ���ע��:WIFI���ӱ���**/
    private String wifiremark3;

    /**���ݿ�������:String,���ݿ���ע��:����ԱID**/
    private String opid;

    /**���ݿ�������:String,���ݿ���ע��:����Ա����**/
    private String opname;

    /**���ݿ�������:String,���ݿ���ע��:����ʱ��**/
    private String opdate;

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
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMarking() {
		return marking;
	}

	public void setMarking(String marking) {
		this.marking = marking;
	}

	public String getSigncs() {
        return signcs;
    }

    public void setSigncs(String signcs) {
        this.signcs = signcs;
    }

    public String getStatetime() {
        return statetime;
    }

    public void setStatetime(String statetime) {
        this.statetime = statetime == null ? null : statetime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getTimetype() {
        return timetype;
    }

    public void setTimetype(String timetype) {
        this.timetype = timetype == null ? null : timetype.trim();
    }

    public String getPolitionname() {
        return politionname;
    }

    public void setPolitionname(String politionname) {
        this.politionname = politionname == null ? null : politionname.trim();
    }

    public String getPolitionjd() {
        return politionjd;
    }

    public void setPolitionjd(String politionjd) {
        this.politionjd = politionjd == null ? null : politionjd.trim();
    }

    public String getPolitionwd() {
        return politionwd;
    }

    public void setPolitionwd(String politionwd) {
        this.politionwd = politionwd == null ? null : politionwd.trim();
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getWifiip() {
        return wifiip;
    }

    public void setWifiip(String wifiip) {
        this.wifiip = wifiip == null ? null : wifiip.trim();
    }

    public String getWifiname() {
        return wifiname;
    }

    public void setWifiname(String wifiname) {
        this.wifiname = wifiname == null ? null : wifiname.trim();
    }

    public String getWifiremark1() {
        return wifiremark1;
    }

    public void setWifiremark1(String wifiremark1) {
        this.wifiremark1 = wifiremark1 == null ? null : wifiremark1.trim();
    }

    public String getWifiremark2() {
        return wifiremark2;
    }

    public void setWifiremark2(String wifiremark2) {
        this.wifiremark2 = wifiremark2 == null ? null : wifiremark2.trim();
    }

    public String getWifiremark3() {
        return wifiremark3;
    }

    public void setWifiremark3(String wifiremark3) {
        this.wifiremark3 = wifiremark3 == null ? null : wifiremark3.trim();
    }

    public String getOpid() {
        return opid;
    }

    public void setOpid(String opid) {
        this.opid = opid == null ? null : opid.trim();
    }

    public String getOpname() {
        return opname;
    }

    public void setOpname(String opname) {
        this.opname = opname == null ? null : opname.trim();
    }

    public String getOpdate() {
        return opdate;
    }

    public void setOpdate(String opdate) {
        this.opdate = opdate == null ? null : opdate.trim();
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