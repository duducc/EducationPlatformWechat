package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxCourseArrangeEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:主键**/
    private String xh;

    /**数据库列类型:String,数据库列注释:对应理论课编号**/
    private String coursenum;

    /**数据库列类型:String,数据库列注释:对应理论课名称**/
    private String coursename;

    /**数据库列类型:String,数据库列注释:对应作息时间编号**/
    private String zxtimenum;

    /**数据库列类型:String,数据库列注释:对应作息时间名称**/
    private String zxtimename;

    /**数据库列类型:String,数据库列注释:任课教师ID**/
    private String rkjshid;

    /**数据库列类型:String,数据库列注释:任课教师名称**/
    private String rkjshname;

    /**数据库列类型:String,数据库列注释:任课教师职称**/
    private String rkjshzhch;

    /**数据库列类型:String,数据库列注释:联系电话**/
    private String lxdh;

    /**数据库列类型:String,数据库列注释:课程类别 1：理论课 2：见习课**/
    private String kclb;

    /**数据库列类型:String,数据库列注释:对应周次**/
    private String shkzhci;

    /**数据库列类型:String,数据库列注释:上课对应星期**/
    private String shkxqi;

    /**数据库列类型:Date,数据库列注释:上课日期**/
    private String skdate;

    /**数据库列类型:String,数据库列注释:上课时间段**/
    private String shtime;

    /**数据库列类型:String,数据库列注释:上课对应的节数**/
    private String skjshu;

    /**数据库列类型:String,数据库列注释:讲授内容**/
    private String jshnr;

    /**数据库列类型:String,数据库列注释:理论学时**/
    private String shkxsh;

    /**数据库列类型:String,数据库列注释:班级**/
    private String bj;

    /**数据库列类型:String,数据库列注释:实践学时**/
    private String sjxs;

    /**数据库列类型:String,数据库列注释:添加人ID**/
    private String opemid;

    /**数据库列类型:String,数据库列注释:添加人姓名**/
    private String opemname;

    /**数据库列类型:Date,数据库列注释:添加时间**/
    private String opdate;

    /**数据库列类型:String,数据库列注释:部门**/
    private String glbm;

    /**数据库列类型:String,数据库列注释:短信是否提醒(天)  1：已提醒 0：未提醒**/
    private String daystatedx;

    /**数据库列类型:String,数据库列注释:短信是否提醒(周)  1：已提醒 0：未提醒**/
    private String weekstatedx;

    /**数据库列类型:String,数据库列注释:短信有无回复(天)  1：已回复 0：未回复**/
    private String dayreplydx;

    /**数据库列类型:String,数据库列注释:短信有无回复(周)  1：已回复 0：未回复**/
    private String weekreplydx;

    /**数据库列类型:String,数据库列注释:微信是否提醒(天)  1：已提醒 0：未提醒**/
    private String daystatewx;

    /**数据库列类型:String,数据库列注释:微信是否提醒(周)  1：已提醒 0：未提醒**/
    private String weekstatewx;

    /**数据库列类型:String,数据库列注释:微信有无回复(天)  1：已回复 0：未回复**/
    private String dayreplywx;

    /**数据库列类型:String,数据库列注释:微信有无回复(周)  1：已回复 0：未回复**/
    private String weekreplywx;

    /**数据库列类型:String,数据库列注释:备注**/
    private String beizhu;
    
    /**数据库列类型:String,数据库列注释:是否打分 0:未打分，1:已打分,默认为0**/
    private String sfdf;
    
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
    
    private String sknd;
    
    private String shkxuexid;
    
    private String state;
    
    private String position;
    
    
    
    public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getShkxuexid() {
		return shkxuexid;
	}

	public void setShkxuexid(String shkxuexid) {
		this.shkxuexid = shkxuexid;
	}

	public String getSknd() {
		return sknd;
	}

	public void setSknd(String sknd) {
		this.sknd = sknd;
	}

	public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getCoursenum() {
        return coursenum;
    }

    public void setCoursenum(String coursenum) {
        this.coursenum = coursenum == null ? null : coursenum.trim();
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public String getZxtimenum() {
        return zxtimenum;
    }

    public void setZxtimenum(String zxtimenum) {
        this.zxtimenum = zxtimenum == null ? null : zxtimenum.trim();
    }

    public String getZxtimename() {
        return zxtimename;
    }

    public void setZxtimename(String zxtimename) {
        this.zxtimename = zxtimename == null ? null : zxtimename.trim();
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

    public String getRkjshzhch() {
        return rkjshzhch;
    }

    public void setRkjshzhch(String rkjshzhch) {
        this.rkjshzhch = rkjshzhch == null ? null : rkjshzhch.trim();
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh == null ? null : lxdh.trim();
    }

    public String getKclb() {
        return kclb;
    }

    public void setKclb(String kclb) {
        this.kclb = kclb == null ? null : kclb.trim();
    }

    public String getShkzhci() {
        return shkzhci;
    }

    public void setShkzhci(String shkzhci) {
        this.shkzhci = shkzhci == null ? null : shkzhci.trim();
    }

    public String getShkxqi() {
        return shkxqi;
    }

    public void setShkxqi(String shkxqi) {
        this.shkxqi = shkxqi == null ? null : shkxqi.trim();
    }

    public String getSkdate() {
        return skdate;
    }

    public void setSkdate(String skdate) {
        this.skdate = skdate;
    }

    public String getShtime() {
        return shtime;
    }

    public void setShtime(String shtime) {
        this.shtime = shtime == null ? null : shtime.trim();
    }

    public String getSkjshu() {
        return skjshu;
    }

    public void setSkjshu(String skjshu) {
        this.skjshu = skjshu == null ? null : skjshu.trim();
    }

    public String getJshnr() {
        return jshnr;
    }

    public void setJshnr(String jshnr) {
        this.jshnr = jshnr == null ? null : jshnr.trim();
    }

    public String getShkxsh() {
        return shkxsh;
    }

    public void setShkxsh(String shkxsh) {
        this.shkxsh = shkxsh == null ? null : shkxsh.trim();
    }

    public String getBj() {
        return bj;
    }

    public void setBj(String bj) {
        this.bj = bj == null ? null : bj.trim();
    }

    public String getSjxs() {
        return sjxs;
    }

    public void setSjxs(String sjxs) {
        this.sjxs = sjxs == null ? null : sjxs.trim();
    }

    public String getOpemid() {
        return opemid;
    }

    public void setOpemid(String opemid) {
        this.opemid = opemid == null ? null : opemid.trim();
    }

    public String getOpemname() {
        return opemname;
    }

    public void setOpemname(String opemname) {
        this.opemname = opemname == null ? null : opemname.trim();
    }

    public String getOpdate() {
        return opdate;
    }

    public void setOpdate(String opdate) {
        this.opdate = opdate;
    }

    public String getGlbm() {
        return glbm;
    }

    public void setGlbm(String glbm) {
        this.glbm = glbm == null ? null : glbm.trim();
    }

    public String getDaystatedx() {
        return daystatedx;
    }

    public void setDaystatedx(String daystatedx) {
        this.daystatedx = daystatedx == null ? null : daystatedx.trim();
    }

    public String getWeekstatedx() {
        return weekstatedx;
    }

    public void setWeekstatedx(String weekstatedx) {
        this.weekstatedx = weekstatedx == null ? null : weekstatedx.trim();
    }

    public String getDayreplydx() {
        return dayreplydx;
    }

    public void setDayreplydx(String dayreplydx) {
        this.dayreplydx = dayreplydx == null ? null : dayreplydx.trim();
    }

    public String getWeekreplydx() {
        return weekreplydx;
    }

    public void setWeekreplydx(String weekreplydx) {
        this.weekreplydx = weekreplydx == null ? null : weekreplydx.trim();
    }

    public String getDaystatewx() {
        return daystatewx;
    }

    public void setDaystatewx(String daystatewx) {
        this.daystatewx = daystatewx == null ? null : daystatewx.trim();
    }

    public String getWeekstatewx() {
        return weekstatewx;
    }

    public void setWeekstatewx(String weekstatewx) {
        this.weekstatewx = weekstatewx == null ? null : weekstatewx.trim();
    }

    public String getDayreplywx() {
        return dayreplywx;
    }

    public void setDayreplywx(String dayreplywx) {
        this.dayreplywx = dayreplywx == null ? null : dayreplywx.trim();
    }

    public String getWeekreplywx() {
        return weekreplywx;
    }

    public void setWeekreplywx(String weekreplywx) {
        this.weekreplywx = weekreplywx == null ? null : weekreplywx.trim();
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public String getSfdf() {
		return sfdf;
	}

	public void setSfdf(String sfdf) {
		this.sfdf = sfdf == null ? null :sfdf.trim();
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