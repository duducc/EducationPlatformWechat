package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxCoursePlanEntity extends PageEntity {
    /**���ݿ�������:String,���ݿ���ע��:��Ӧ��������**/
    private String xh;

    /**���ݿ�������:String,���ݿ���ע��:�γ̶�ӦID**/
    private String courseid;

    /**���ݿ�������:String,���ݿ���ע��:�γ�����**/
    private String coursename;

    /**���ݿ�������:String,���ݿ���ע��:�ον����Ҷ�Ӧ���**/
    private String rkjyshid;

    /**���ݿ�������:String,���ݿ���ע��:�ον���������**/
    private String rkjyshmc;

    /**���ݿ�������:String,���ݿ���ע��:������ѧʱ**/
    private String zxsh;

    /**���ݿ�������:String,���ݿ���ע��:�γ����ʣ���Ӧ�ֵ��**/
    private String kchxzh;

    /**���ݿ�������:String,���ݿ���ע��:�ڿεص�**/
    private String shkdid;

    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String emonum;

    /**���ݿ�������:String,���ݿ���ע��:ѧ��רҵ**/
    private String xshszzhy;

    /**���ݿ�������:String,���ݿ���ע��:�ڿΰ༶������༶�ö��Ÿ�����**/
    private String shkbanj;

    /**���ݿ�������:String,���ݿ���ע��:ѡ�ý̲�����**/
    private String xyjcshm;

    /**���ݿ�������:String,���ݿ���ע��:ѡ�ý̲ĳ�����**/
    private String xyjcchbsh;

    /**���ݿ�������:String,���ݿ���ע��:ѡ�ý̲İ��**/
    private String xyjcbanc;

    /**���ݿ�������:String,���ݿ���ע��:ѡ�ý̲�����**/
    private String xyjczhb;

    /**���ݿ�������:String,���ݿ���ע��:�ڿ�ѧУ��Ӧ���**/
    private String shkxuexid;

    /**���ݿ�������:String,���ݿ���ע��:�ڿ�ѧУ����**/
    private String shkxuexname;

    /**���ݿ�������:String,���ݿ���ע��:�ڿ�ѧԺ��Ӧ���**/
    private String shkxueyid;

    /**���ݿ�������:String,���ݿ���ע��:�ڿ�ѧԺ����**/
    private String shkxueyname;

    /**���ݿ�������:String,���ݿ���ע��:�ڿ����ʱ���**/
    private String ndshjd;

    /**���ݿ�������:String,���ݿ���ע��:�ڿ�ѧ��**/
    private String shkxueqi;

    /**���ݿ�������:String,���ݿ���ע��:�γ�״̬��1���ھ��У�2���ھ��У�3�ѽ������**/
    private String kchstate;

    /**���ݿ�������:String,���ݿ���ע��:�γ�����**/
    private String kchtype;

    /**���ݿ�������:String,���ݿ���ע��:�����**/
    private String opemid;

    /**���ݿ�������:String,���ݿ���ע��:���������**/
    private String opemname;

    /**���ݿ�������:Date,���ݿ���ע��:���ʱ��**/
    private String opdate;

    /**���ݿ�������:String,���ݿ���ע��:���**/
    private String year;

    /**���ݿ�������:String,���ݿ���ע��:������**/
    private String glbm;

    /**���ݿ�������:BigDecimal,���ݿ���ע��:�꼶**/
    private String nj;

    /**���ݿ�������:String,���ݿ���ע��:������ʦID**/
    private String fzlsid;

    /**���ݿ�������:String,���ݿ���ע��:������ʦ����**/
    private String fzlsname;

    /**���ݿ�������:String,���ݿ���ע��:������ʦְ��**/
    private String fzlszc;

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

    /**���ݿ�������:String,���ݿ���ע��:ʵ����ѧʱ**/
    private String sjzxs;

    /**���ݿ�������:String,���ݿ���ע��:�Ƿ�������� 0���������� 1��ֻ�������۽�ѧ 2��ֻ����ʵ����ѧ 3��������**/
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