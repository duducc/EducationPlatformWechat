package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxStudentsEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:主键**/
    private String xh;

    /**数据库列类型:String,数据库列注释:姓名**/
    private String name;

    /**数据库列类型:String,数据库列注释:性别**/
    private String sex;

    /**数据库列类型:String,数据库列注释:电话**/
    private String telnumber;

    /**数据库列类型:String,数据库列注释:名族**/
    private String national;

    /**数据库列类型:String,数据库列注释:身份证号码**/
    private String idcard;

    /**数据库列类型:String,数据库列注释:籍贯**/
    private String city;

    /**数据库列类型:String,数据库列注释:户口所在地**/
    private String address;

    /**数据库列类型:String,数据库列注释:生日**/
    private String birthday;

    /**数据库列类型:String,数据库列注释:婚姻状况**/
    private String marriagestate;

    /**数据库列类型:String,数据库列注释:政治面貌**/
    private String government;

    /**数据库列类型:Date,数据库列注释:入党或入团时间**/
    private String inpartytime;

    /**数据库列类型:Date,数据库列注释:入党或入团时间**/
    private String ingangtime;

    /**数据库列类型:String,数据库列注释:家庭联系人姓名**/
    private String familyname;

    /**数据库列类型:String,数据库列注释:与联系人关系**/
    private String familyreat;

    /**数据库列类型:String,数据库列注释:家庭电话**/
    private String familytel;

    /**数据库列类型:String,数据库列注释:家庭地址**/
    private String familyaddress;

    /**数据库列类型:String,数据库列注释:年度**/
    private String stuyear;

    /**数据库列类型:String,数据库列注释:来院方式**/
    private String comtype;

    /**数据库列类型:String,数据库列注释:邮编**/
    private String emial;

    /**数据库列类型:String,数据库列注释:学号**/
    private String schoolnum;

    /**数据库列类型:BigDecimal,数据库列注释:费用总金额**/
    private String fyzje;

    /**数据库列类型:String,数据库列注释:公众号openid**/
    private String openid;

    /**数据库列类型:String,数据库列注释:人员类型(1研究生 ， 2实习学生，3规培生，4本科生， 5见习生）**/
    private String pertype;

    /**数据库列类型:String,数据库列注释:职位类型（1：医师；2护士）**/
    private String zhiweitype;

    /**数据库列类型:String,数据库列注释:来源单位**/
    private String fromunit;

    /**数据库列类型:String,数据库列注释:是否毕业**/
    private String isgraduate;

    /**数据库列类型:String,数据库列注释:毕业学校**/
    private String graduateschool;

    /**数据库列类型:Date,数据库列注释:毕业时间**/
    private String graduatetime;

    /**数据库列类型:String,数据库列注释:学院ID**/
    private String collegeid;

    /**数据库列类型:String,数据库列注释:学院名称**/
    private String collegename;

    /**数据库列类型:String,数据库列注释:班级Id**/
    private String classid;

    /**数据库列类型:String,数据库列注释:班级名称**/
    private String professionalclass;

    /**数据库列类型:String,数据库列注释:学校老师id**/
    private String schoolteacherid;

    /**数据库列类型:String,数据库列注释:学校老师姓名**/
    private String schoolteachername;

    /**数据库列类型:String,数据库列注释:学校老师联系方式**/
    private String schoolteachertel;

    /**数据库列类型:String,数据库列注释:是否规培（0：是，1：否）**/
    private String sfgp;

    /**数据库列类型:BigDecimal,数据库列注释:导师ID**/
    private String teacherid;

    /**数据库列类型:String,数据库列注释:导师姓名**/
    private String teachrename;

    /**数据库列类型:String,数据库列注释:培养类型**/
    private String cultivatetype;

    /**数据库列类型:String,数据库列注释:专业**/
    private String professional;

    /**数据库列类型:String,数据库列注释:专业方向**/
    private String professionalguid;

    /**数据库列类型:String,数据库列注释:学历**/
    private String xueli;

    /**数据库列类型:Date,数据库列注释:学习开始时间**/
    private String studystarttime;

    /**数据库列类型:Date,数据库列注释:学习结束时间**/
    private String studyendtime;

    /**数据库列类型:String,数据库列注释:实习月数**/
    private String month;

    /**数据库列类型:String,数据库列注释:照片路径**/
    private String imagepath;

    /**数据库列类型:String,数据库列注释:状态（0未提交，1个人已提交，2审核通过，3审核不通过，4学校待审核，5学校审核不通过，6学校审核通过）**/
    private String state;

    /**数据库列类型:String,数据库列注释:学员注册审核内容**/
    private String checkcontent;

    /**数据库列类型:String,数据库列注释:提交类型（1：集体提交；2：个人提交）**/
    private String shzt;

    /**数据库列类型:String,数据库列注释:审核人ID**/
    private String shrid;

    /**数据库列类型:Date,数据库列注释:审核时间**/
    private String shsj;

    /**数据库列类型:String,数据库列注释:缴费标记 0：未缴费 1：已缴费**/
    private String jfbj;

    /**数据库列类型:Date,数据库列注释:缴费时间**/
    private String jfsj;

    /**数据库列类型:String,数据库列注释:状态 0：未报到 1：在院 2：已毕业 3：退学**/
    private String zt;

    /**数据库列类型:String,数据库列注释:备注**/
    private String remark;

    /**数据库列类型:Date,数据库列注释:创建时间**/
    private String createtime;

    /**数据库列类型:Date,数据库列注释:更新时间**/
    private String updatetime;

    /**数据库列类型:String,数据库列注释:考勤组标记**/
    private String signmarking;

    /**数据库列类型:String,数据库列注释:管理部门**/
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

    /**数据库列类型:String,数据库列注释:胸牌标记 0：未退 1：已退**/
    private String xpbj;

    /**数据库列类型:String,数据库列注释:实习证明标记 0：未打印 1：已打印**/
    private String sxzmbj;

    /**数据库列类型:Date,数据库列注释:实习证明打印时间**/
    private String sxzmdysj;

    /**数据库列类型:String,数据库列注释:实习证明打印人**/
    private String sxzmdyr;

    /**数据库列类型:String,数据库列注释:鉴定标记 0：未鉴定 1：已鉴定**/
    private String jdbj;

    /**数据库列类型:String,数据库列注释:信息完善标记 0：未完善 1：已完善**/
    private String xxwsbj;
    
    /**数据库列类型:String,数据库列注释:鉴定标记 0：未鉴定 1：已鉴定**/
    private String assureemp;

    /**数据库列类型:String,数据库列注释:信息完善标记 0：未完善 1：已完善**/
    private String assureempname;
    
    /**数据库列类型:String,数据库列注释:停止原因**/
    private String tzyy;
    
    /**数据库列类型:Date,数据库列注释:停止时间**/
    private String tzrq;
    
    /**数据库列类型:Date,数据库列注释:停止时间**/
    private String grade;
    
    /**数据库列类型:Date,数据库列注释:停止时间**/
    private String banji;
    
    /**数据库列类型:String,数据库列注释:服装费缴费标记 0：未缴费 1：已缴费**/
    private String fzfjfbj;
    
    /**数据库列类型:Date,数据库列注释:服装费缴费时间**/
    private String fzfjfsj;
    private String xyfs;
    
    
    
    public String getXyfs() {
		return xyfs;
	}

	public void setXyfs(String xyfs) {
		this.xyfs = xyfs;
	}

	public String getBanji() {
		return banji;
	}

	public void setBanji(String banji) {
		this.banji = banji;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getAssureemp() {
		return assureemp;
	}

	public void setAssureemp(String assureemp) {
		this.assureemp = assureemp;
	}

	public String getAssureempname() {
		return assureempname;
	}

	public void setAssureempname(String assureempname) {
		this.assureempname = assureempname;
	}

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
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber == null ? null : telnumber.trim();
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national == null ? null : national.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getMarriagestate() {
        return marriagestate;
    }

    public void setMarriagestate(String marriagestate) {
        this.marriagestate = marriagestate == null ? null : marriagestate.trim();
    }

    public String getGovernment() {
        return government;
    }

    public void setGovernment(String government) {
        this.government = government == null ? null : government.trim();
    }

    public String getInpartytime() {
        return inpartytime;
    }

    public void setInpartytime(String inpartytime) {
        this.inpartytime = inpartytime;
    }

    public String getIngangtime() {
        return ingangtime;
    }

    public void setIngangtime(String ingangtime) {
        this.ingangtime = ingangtime;
    }

    public String getFamilyname() {
        return familyname;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname == null ? null : familyname.trim();
    }

    public String getFamilyreat() {
        return familyreat;
    }

    public void setFamilyreat(String familyreat) {
        this.familyreat = familyreat == null ? null : familyreat.trim();
    }

    public String getFamilytel() {
        return familytel;
    }

    public void setFamilytel(String familytel) {
        this.familytel = familytel == null ? null : familytel.trim();
    }

    public String getFamilyaddress() {
        return familyaddress;
    }

    public void setFamilyaddress(String familyaddress) {
        this.familyaddress = familyaddress == null ? null : familyaddress.trim();
    }

    public String getStuyear() {
        return stuyear;
    }

    public void setStuyear(String stuyear) {
        this.stuyear = stuyear == null ? null : stuyear.trim();
    }

    public String getComtype() {
        return comtype;
    }

    public void setComtype(String comtype) {
        this.comtype = comtype == null ? null : comtype.trim();
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial == null ? null : emial.trim();
    }

    public String getSchoolnum() {
        return schoolnum;
    }

    public void setSchoolnum(String schoolnum) {
        this.schoolnum = schoolnum == null ? null : schoolnum.trim();
    }

    public String getFyzje() {
        return fyzje;
    }

    public void setFyzje(String fyzje) {
        this.fyzje = fyzje;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getPertype() {
        return pertype;
    }

    public void setPertype(String pertype) {
        this.pertype = pertype == null ? null : pertype.trim();
    }

    public String getZhiweitype() {
        return zhiweitype;
    }

    public void setZhiweitype(String zhiweitype) {
        this.zhiweitype = zhiweitype == null ? null : zhiweitype.trim();
    }

    public String getFromunit() {
        return fromunit;
    }

    public void setFromunit(String fromunit) {
        this.fromunit = fromunit == null ? null : fromunit.trim();
    }

    public String getIsgraduate() {
        return isgraduate;
    }

    public void setIsgraduate(String isgraduate) {
        this.isgraduate = isgraduate == null ? null : isgraduate.trim();
    }

    public String getGraduateschool() {
        return graduateschool;
    }

    public void setGraduateschool(String graduateschool) {
        this.graduateschool = graduateschool == null ? null : graduateschool.trim();
    }

    public String getGraduatetime() {
        return graduatetime;
    }

    public void setGraduatetime(String graduatetime) {
        this.graduatetime = graduatetime;
    }

    public String getCollegeid() {
        return collegeid;
    }

    public void setCollegeid(String collegeid) {
        this.collegeid = collegeid == null ? null : collegeid.trim();
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename == null ? null : collegename.trim();
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid == null ? null : classid.trim();
    }

    public String getProfessionalclass() {
        return professionalclass;
    }

    public void setProfessionalclass(String professionalclass) {
        this.professionalclass = professionalclass == null ? null : professionalclass.trim();
    }

    public String getSchoolteacherid() {
        return schoolteacherid;
    }

    public void setSchoolteacherid(String schoolteacherid) {
        this.schoolteacherid = schoolteacherid == null ? null : schoolteacherid.trim();
    }

    public String getSchoolteachername() {
        return schoolteachername;
    }

    public void setSchoolteachername(String schoolteachername) {
        this.schoolteachername = schoolteachername == null ? null : schoolteachername.trim();
    }

    public String getSchoolteachertel() {
        return schoolteachertel;
    }

    public void setSchoolteachertel(String schoolteachertel) {
        this.schoolteachertel = schoolteachertel == null ? null : schoolteachertel.trim();
    }

    public String getSfgp() {
        return sfgp;
    }

    public void setSfgp(String sfgp) {
        this.sfgp = sfgp == null ? null : sfgp.trim();
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachrename() {
        return teachrename;
    }

    public void setTeachrename(String teachrename) {
        this.teachrename = teachrename == null ? null : teachrename.trim();
    }

    public String getCultivatetype() {
        return cultivatetype;
    }

    public void setCultivatetype(String cultivatetype) {
        this.cultivatetype = cultivatetype == null ? null : cultivatetype.trim();
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional == null ? null : professional.trim();
    }

    public String getProfessionalguid() {
        return professionalguid;
    }

    public void setProfessionalguid(String professionalguid) {
        this.professionalguid = professionalguid == null ? null : professionalguid.trim();
    }

    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli == null ? null : xueli.trim();
    }

    public String getStudystarttime() {
        return studystarttime;
    }

    public void setStudystarttime(String studystarttime) {
        this.studystarttime = studystarttime;
    }

    public String getStudyendtime() {
        return studyendtime;
    }

    public void setStudyendtime(String studyendtime) {
        this.studyendtime = studyendtime;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath == null ? null : imagepath.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getCheckcontent() {
        return checkcontent;
    }

    public void setCheckcontent(String checkcontent) {
        this.checkcontent = checkcontent == null ? null : checkcontent.trim();
    }

    public String getShzt() {
        return shzt;
    }

    public void setShzt(String shzt) {
        this.shzt = shzt == null ? null : shzt.trim();
    }

    public String getShrid() {
        return shrid;
    }

    public void setShrid(String shrid) {
        this.shrid = shrid == null ? null : shrid.trim();
    }

    public String getShsj() {
        return shsj;
    }

    public void setShsj(String shsj) {
        this.shsj = shsj;
    }

    public String getJfbj() {
        return jfbj;
    }

    public void setJfbj(String jfbj) {
        this.jfbj = jfbj == null ? null : jfbj.trim();
    }

    public String getJfsj() {
        return jfsj;
    }

    public void setJfsj(String jfsj) {
        this.jfsj = jfsj;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt == null ? null : zt.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getSignmarking() {
        return signmarking;
    }

    public void setSignmarking(String signmarking) {
        this.signmarking = signmarking == null ? null : signmarking.trim();
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

    public String getXpbj() {
        return xpbj;
    }

    public void setXpbj(String xpbj) {
        this.xpbj = xpbj == null ? null : xpbj.trim();
    }

    public String getSxzmbj() {
        return sxzmbj;
    }

    public void setSxzmbj(String sxzmbj) {
        this.sxzmbj = sxzmbj == null ? null : sxzmbj.trim();
    }

    public String getSxzmdysj() {
        return sxzmdysj;
    }

    public void setSxzmdysj(String sxzmdysj) {
        this.sxzmdysj = sxzmdysj;
    }

    public String getSxzmdyr() {
        return sxzmdyr;
    }

    public void setSxzmdyr(String sxzmdyr) {
        this.sxzmdyr = sxzmdyr == null ? null : sxzmdyr.trim();
    }

    public String getJdbj() {
        return jdbj;
    }

    public void setJdbj(String jdbj) {
        this.jdbj = jdbj == null ? null : jdbj.trim();
    }

    public String getXxwsbj() {
        return xxwsbj;
    }

    public void setXxwsbj(String xxwsbj) {
        this.xxwsbj = xxwsbj == null ? null : xxwsbj.trim();
    }

	public String getTzyy() {
		return tzyy;
	}

	public void setTzyy(String tzyy) {
		this.tzyy = tzyy;
	}

	public String getTzrq() {
		return tzrq;
	}

	public void setTzrq(String tzrq) {
		this.tzrq = tzrq;
	}

	public String getFzfjfbj() {
		return fzfjfbj;
	}

	public void setFzfjfbj(String fzfjfbj) {
		this.fzfjfbj = fzfjfbj == null ? null : fzfjfbj.trim();
	}

	public String getFzfjfsj() {
		return fzfjfsj;
	}

	public void setFzfjfsj(String fzfjfsj) {
		this.fzfjfsj = fzfjfsj == null ? null : fzfjfsj.trim();
	}
    
	
}