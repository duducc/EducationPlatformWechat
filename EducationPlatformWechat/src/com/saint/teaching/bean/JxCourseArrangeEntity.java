package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxCourseArrangeEntity extends PageEntity {
    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String xh;

    /**���ݿ�������:String,���ݿ���ע��:��Ӧ���ۿα��**/
    private String coursenum;

    /**���ݿ�������:String,���ݿ���ע��:��Ӧ���ۿ�����**/
    private String coursename;

    /**���ݿ�������:String,���ݿ���ע��:��Ӧ��Ϣʱ����**/
    private String zxtimenum;

    /**���ݿ�������:String,���ݿ���ע��:��Ӧ��Ϣʱ������**/
    private String zxtimename;

    /**���ݿ�������:String,���ݿ���ע��:�ον�ʦID**/
    private String rkjshid;

    /**���ݿ�������:String,���ݿ���ע��:�ον�ʦ����**/
    private String rkjshname;

    /**���ݿ�������:String,���ݿ���ע��:�ον�ʦְ��**/
    private String rkjshzhch;

    /**���ݿ�������:String,���ݿ���ע��:��ϵ�绰**/
    private String lxdh;

    /**���ݿ�������:String,���ݿ���ע��:�γ���� 1�����ۿ� 2����ϰ��**/
    private String kclb;

    /**���ݿ�������:String,���ݿ���ע��:��Ӧ�ܴ�**/
    private String shkzhci;

    /**���ݿ�������:String,���ݿ���ע��:�Ͽζ�Ӧ����**/
    private String shkxqi;

    /**���ݿ�������:Date,���ݿ���ע��:�Ͽ�����**/
    private String skdate;

    /**���ݿ�������:String,���ݿ���ע��:�Ͽ�ʱ���**/
    private String shtime;

    /**���ݿ�������:String,���ݿ���ע��:�Ͽζ�Ӧ�Ľ���**/
    private String skjshu;

    /**���ݿ�������:String,���ݿ���ע��:��������**/
    private String jshnr;

    /**���ݿ�������:String,���ݿ���ע��:����ѧʱ**/
    private String shkxsh;

    /**���ݿ�������:String,���ݿ���ע��:�༶**/
    private String bj;

    /**���ݿ�������:String,���ݿ���ע��:ʵ��ѧʱ**/
    private String sjxs;

    /**���ݿ�������:String,���ݿ���ע��:�����ID**/
    private String opemid;

    /**���ݿ�������:String,���ݿ���ע��:���������**/
    private String opemname;

    /**���ݿ�������:Date,���ݿ���ע��:���ʱ��**/
    private String opdate;

    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String glbm;

    /**���ݿ�������:String,���ݿ���ע��:�����Ƿ�����(��)  1�������� 0��δ����**/
    private String daystatedx;

    /**���ݿ�������:String,���ݿ���ע��:�����Ƿ�����(��)  1�������� 0��δ����**/
    private String weekstatedx;

    /**���ݿ�������:String,���ݿ���ע��:�������޻ظ�(��)  1���ѻظ� 0��δ�ظ�**/
    private String dayreplydx;

    /**���ݿ�������:String,���ݿ���ע��:�������޻ظ�(��)  1���ѻظ� 0��δ�ظ�**/
    private String weekreplydx;

    /**���ݿ�������:String,���ݿ���ע��:΢���Ƿ�����(��)  1�������� 0��δ����**/
    private String daystatewx;

    /**���ݿ�������:String,���ݿ���ע��:΢���Ƿ�����(��)  1�������� 0��δ����**/
    private String weekstatewx;

    /**���ݿ�������:String,���ݿ���ע��:΢�����޻ظ�(��)  1���ѻظ� 0��δ�ظ�**/
    private String dayreplywx;

    /**���ݿ�������:String,���ݿ���ע��:΢�����޻ظ�(��)  1���ѻظ� 0��δ�ظ�**/
    private String weekreplywx;

    /**���ݿ�������:String,���ݿ���ע��:��ע**/
    private String beizhu;
    
    /**���ݿ�������:String,���ݿ���ע��:�Ƿ��� 0:δ��֣�1:�Ѵ��,Ĭ��Ϊ0**/
    private String sfdf;
    
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