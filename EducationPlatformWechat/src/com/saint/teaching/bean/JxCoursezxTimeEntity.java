package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxCoursezxTimeEntity extends PageEntity {
    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String xh;

    /**���ݿ�������:String,���ݿ���ע��:��Ϣ���ͣ��ֵ���ţ�**/
    private String zxtype;
    
    /**���ݿ�������:String,���ݿ���ע��:��Ϣ���ͣ��ֵ���ţ�**/
    private String zxname;

    /**���ݿ�������:String,���ݿ���ע��:��Ϣʱ��Σ��м���*������**/
    private String zxdate;

    /**���ݿ�������:String,���ݿ���ע��:�ν�**/
    private String zxkj;

    /**���ݿ�������:String,���ݿ���ע��:�ν�ʱ���**/
    private String kjsjd;

    /**���ݿ�������:String,���ݿ���ע��:�ν�ʱ��**/
    private String kjshc;
    
    /**���ݿ�������:String,���ݿ���ע��:�ν�ʱ��**/
    private String glbm;
    
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

    public String getZxtype() {
        return zxtype;
    }

    public void setZxtype(String zxtype) {
        this.zxtype = zxtype == null ? null : zxtype.trim();
    }

    public String getZxdate() {
        return zxdate;
    }

    public void setZxdate(String zxdate) {
        this.zxdate = zxdate == null ? null : zxdate.trim();
    }

    public String getZxkj() {
        return zxkj;
    }

    public void setZxkj(String zxkj) {
        this.zxkj = zxkj == null ? null : zxkj.trim();
    }

    public String getKjsjd() {
        return kjsjd;
    }

    public void setKjsjd(String kjsjd) {
        this.kjsjd = kjsjd == null ? null : kjsjd.trim();
    }

    public String getKjshc() {
        return kjshc;
    }

    public void setKjshc(String kjshc) {
        this.kjshc = kjshc == null ? null : kjshc.trim();
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

	public String getZxname() {
		return zxname;
	}

	public void setZxname(String zxname) {
		this.zxname = zxname;
	}

	public String getGlbm() {
		return glbm;
	}

	public void setGlbm(String glbm) {
		this.glbm = glbm;
	}
    
    
}