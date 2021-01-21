package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxCoursePlanEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:对应主键序列**/
    private String xh;

    /**数据库列类型:String,数据库列注释:课程对应ID**/
    private String courseid;

    /**数据库列类型:String,数据库列注释:课程名称**/
    private String coursename;

    /**数据库列类型:String,数据库列注释:任课教研室对应编号**/
    private String rkjyshid;

    /**数据库列类型:String,数据库列注释:任课教研室名称**/
    private String rkjyshmc;

    /**数据库列类型:String,数据库列注释:理论总学时**/
    private String zxsh;

    /**数据库列类型:String,数据库列注释:课程性质（对应字典表）**/
    private String kchxzh;

    /**数据库列类型:String,数据库列注释:授课地点**/
    private String shkdid;

    /**数据库列类型:String,数据库列注释:人数**/
    private String emonum;

    /**数据库列类型:String,数据库列注释:学生专业**/
    private String xshszzhy;

    /**数据库列类型:String,数据库列注释:授课班级（多个班级用逗号隔开）**/
    private String shkbanj;

    /**数据库列类型:String,数据库列注释:选用教材名称**/
    private String xyjcshm;

    /**数据库列类型:String,数据库列注释:选用教材出版社**/
    private String xyjcchbsh;

    /**数据库列类型:String,数据库列注释:选用教材班次**/
    private String xyjcbanc;

    /**数据库列类型:String,数据库列注释:选用教材主编**/
    private String xyjczhb;

    /**数据库列类型:String,数据库列注释:授课学校对应编号**/
    private String shkxuexid;

    /**数据库列类型:String,数据库列注释:授课学校名称**/
    private String shkxuexname;

    /**数据库列类型:String,数据库列注释:授课学院对应编号**/
    private String shkxueyid;

    /**数据库列类型:String,数据库列注释:授课学院名称**/
    private String shkxueyname;

    /**数据库列类型:String,数据库列注释:授课年度时间段**/
    private String ndshjd;

    /**数据库列类型:String,数据库列注释:授课学期**/
    private String shkxueqi;

    /**数据库列类型:String,数据库列注释:课程状态（1正在举行；2延期举行；3已结结束）**/
    private String kchstate;

    /**数据库列类型:String,数据库列注释:课程类型**/
    private String kchtype;

    /**数据库列类型:String,数据库列注释:添加人**/
    private String opemid;

    /**数据库列类型:String,数据库列注释:添加人名称**/
    private String opemname;

    /**数据库列类型:Date,数据库列注释:添加时间**/
    private String opdate;

    /**数据库列类型:String,数据库列注释:年度**/
    private String year;

    /**数据库列类型:String,数据库列注释:管理部门**/
    private String glbm;

    /**数据库列类型:BigDecimal,数据库列注释:年级**/
    private String nj;

    /**数据库列类型:String,数据库列注释:负责老师ID**/
    private String fzlsid;

    /**数据库列类型:String,数据库列注释:负责老师姓名**/
    private String fzlsname;

    /**数据库列类型:String,数据库列注释:负责老师职称**/
    private String fzlszc;

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

    /**数据库列类型:String,数据库列注释:实践总学时**/
    private String sjzxs;

    /**数据库列类型:String,数据库列注释:是否计数费用 0：都不计算 1：只计算理论教学 2：只计算实践教学 3：都计算**/
    private String sfjsfy;
    
    private String kclb;
    
    private String jxshkdid;
    
    

    public String getJxshkdid() {
		return jxshkdid;
	}

	public void setJxshkdid(String jxshkdid) {
		this.jxshkdid = jxshkdid;
	}

	public String getKclb() {
		return kclb;
	}

	public void setKclb(String kclb) {
		this.kclb = kclb;
	}

	public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
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

    public String getRkjyshid() {
        return rkjyshid;
    }

    public void setRkjyshid(String rkjyshid) {
        this.rkjyshid = rkjyshid == null ? null : rkjyshid.trim();
    }

    public String getRkjyshmc() {
        return rkjyshmc;
    }

    public void setRkjyshmc(String rkjyshmc) {
        this.rkjyshmc = rkjyshmc == null ? null : rkjyshmc.trim();
    }

    public String getZxsh() {
        return zxsh;
    }

    public void setZxsh(String zxsh) {
        this.zxsh = zxsh == null ? null : zxsh.trim();
    }

    public String getKchxzh() {
        return kchxzh;
    }

    public void setKchxzh(String kchxzh) {
        this.kchxzh = kchxzh == null ? null : kchxzh.trim();
    }

    public String getShkdid() {
        return shkdid;
    }

    public void setShkdid(String shkdid) {
        this.shkdid = shkdid == null ? null : shkdid.trim();
    }

    public String getEmonum() {
        return emonum;
    }

    public void setEmonum(String emonum) {
        this.emonum = emonum == null ? null : emonum.trim();
    }

    public String getXshszzhy() {
        return xshszzhy;
    }

    public void setXshszzhy(String xshszzhy) {
        this.xshszzhy = xshszzhy == null ? null : xshszzhy.trim();
    }

    public String getShkbanj() {
        return shkbanj;
    }

    public void setShkbanj(String shkbanj) {
        this.shkbanj = shkbanj == null ? null : shkbanj.trim();
    }

    public String getXyjcshm() {
        return xyjcshm;
    }

    public void setXyjcshm(String xyjcshm) {
        this.xyjcshm = xyjcshm == null ? null : xyjcshm.trim();
    }

    public String getXyjcchbsh() {
        return xyjcchbsh;
    }

    public void setXyjcchbsh(String xyjcchbsh) {
        this.xyjcchbsh = xyjcchbsh == null ? null : xyjcchbsh.trim();
    }

    public String getXyjcbanc() {
        return xyjcbanc;
    }

    public void setXyjcbanc(String xyjcbanc) {
        this.xyjcbanc = xyjcbanc == null ? null : xyjcbanc.trim();
    }

    public String getXyjczhb() {
        return xyjczhb;
    }

    public void setXyjczhb(String xyjczhb) {
        this.xyjczhb = xyjczhb == null ? null : xyjczhb.trim();
    }

    public String getShkxuexid() {
        return shkxuexid;
    }

    public void setShkxuexid(String shkxuexid) {
        this.shkxuexid = shkxuexid == null ? null : shkxuexid.trim();
    }

    public String getShkxuexname() {
        return shkxuexname;
    }

    public void setShkxuexname(String shkxuexname) {
        this.shkxuexname = shkxuexname == null ? null : shkxuexname.trim();
    }

    public String getShkxueyid() {
        return shkxueyid;
    }

    public void setShkxueyid(String shkxueyid) {
        this.shkxueyid = shkxueyid == null ? null : shkxueyid.trim();
    }

    public String getShkxueyname() {
        return shkxueyname;
    }

    public void setShkxueyname(String shkxueyname) {
        this.shkxueyname = shkxueyname == null ? null : shkxueyname.trim();
    }

    public String getNdshjd() {
        return ndshjd;
    }

    public void setNdshjd(String ndshjd) {
        this.ndshjd = ndshjd == null ? null : ndshjd.trim();
    }

    public String getShkxueqi() {
        return shkxueqi;
    }

    public void setShkxueqi(String shkxueqi) {
        this.shkxueqi = shkxueqi == null ? null : shkxueqi.trim();
    }

    public String getKchstate() {
        return kchstate;
    }

    public void setKchstate(String kchstate) {
        this.kchstate = kchstate == null ? null : kchstate.trim();
    }

    public String getKchtype() {
        return kchtype;
    }

    public void setKchtype(String kchtype) {
        this.kchtype = kchtype == null ? null : kchtype.trim();
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getGlbm() {
        return glbm;
    }

    public void setGlbm(String glbm) {
        this.glbm = glbm == null ? null : glbm.trim();
    }

    public String getNj() {
        return nj;
    }

    public void setNj(String nj) {
        this.nj = nj;
    }

    public String getFzlsid() {
        return fzlsid;
    }

    public void setFzlsid(String fzlsid) {
        this.fzlsid = fzlsid == null ? null : fzlsid.trim();
    }

    public String getFzlsname() {
        return fzlsname;
    }

    public void setFzlsname(String fzlsname) {
        this.fzlsname = fzlsname == null ? null : fzlsname.trim();
    }

    public String getFzlszc() {
        return fzlszc;
    }

    public void setFzlszc(String fzlszc) {
        this.fzlszc = fzlszc == null ? null : fzlszc.trim();
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

    public String getSjzxs() {
        return sjzxs;
    }

    public void setSjzxs(String sjzxs) {
        this.sjzxs = sjzxs == null ? null : sjzxs.trim();
    }

    public String getSfjsfy() {
        return sfjsfy;
    }

    public void setSfjsfy(String sfjsfy) {
        this.sfjsfy = sfjsfy == null ? null : sfjsfy.trim();
    }
}