package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxCoursezxTimeEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:主键**/
    private String xh;

    /**数据库列类型:String,数据库列注释:作息类型（字典表编号）**/
    private String zxtype;
    
    /**数据库列类型:String,数据库列注释:作息类型（字典表编号）**/
    private String zxname;

    /**数据库列类型:String,数据库列注释:作息时间段（中间用*隔开）**/
    private String zxdate;

    /**数据库列类型:String,数据库列注释:课节**/
    private String zxkj;

    /**数据库列类型:String,数据库列注释:课节时间段**/
    private String kjsjd;

    /**数据库列类型:String,数据库列注释:课节时长**/
    private String kjshc;
    
    /**数据库列类型:String,数据库列注释:课节时长**/
    private String glbm;
    
    /**数据库列类型:String,数据库列注释:null**/
    private String remark1;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark2;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark3;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark4;

    /**数据库列类型:String,数据库列注释:null**/
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