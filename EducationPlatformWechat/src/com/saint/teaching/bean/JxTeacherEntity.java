package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxTeacherEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:教师编号**/
    private String usernumber;

    /**数据库列类型:String,数据库列注释:老师姓名**/
    private String name;

    /**数据库列类型:String,数据库列注释:所在科室编号**/
    private String deptid;

    /**数据库列类型:String,数据库列注释:科室名称**/
    private String deptname;

    /**数据库列类型:BigDecimal,数据库列注释:教师年龄**/
    private String age;

    /**数据库列类型:String,数据库列注释:性别**/
    private String sex;

    /**数据库列类型:String,数据库列注释:身份证号码**/
    private String idcard;

    /**数据库列类型:String,数据库列注释:联系电话**/
    private String usertel;

    /**数据库列类型:String,数据库列注释:办公室电话**/
    private String officetel;

    /**数据库列类型:Date,数据库列注释:出生年月**/
    private String birthday;

    /**数据库列类型:String,数据库列注释:EMIAL**/
    private String emial;

    /**数据库列类型:String,数据库列注释:教师状态**/
    private String state;

    /**数据库列类型:String,数据库列注释:教师类型**/
    private String teachtype;

    /**数据库列类型:String,数据库列注释:第一学历学历编号（字典表）**/
    private String education;

    /**数据库列类型:String,数据库列注释:第一学历学位（字典表）**/
    private String degree;

    /**数据库列类型:String,数据库列注释:第一学历就读学校**/
    private String school;
    
    /**数据库列类型:String,数据库列注释:第一学历就读学校**/
    private String getedudate;
    
    /**数据库列类型:String,数据库列注释:最高学历编号（字典表）**/
    private String besteducation;

    /**数据库列类型:String,数据库列注释:最高学历就读学校**/
    private String bestschool;

    /**数据库列类型:String,数据库列注释:最高学历学位（字典表）**/
    private String bestdegree;
    
    /**数据库列类型:String,数据库列注释:最高学历学位（字典表）**/
    private String bestedudate;

    /**数据库列类型:String,数据库列注释:老师职称**/
    private String zhicheng;

    /**数据库列类型:Date,数据库列注释:职称获得时间**/
    private String gaintime;

    /**数据库列类型:Date,数据库列注释:聘任时间**/
    private String engagetime;

    /**数据库列类型:String,数据库列注释:所在教研室编号**/
    private String placedept;

    /**数据库列类型:String,数据库列注释:所在教研室名称**/
    private String placename;

    /**数据库列类型:String,数据库列注释:承担课程对应编号**/
    private String courseid;

    /**数据库列类型:String,数据库列注释:承担课程名称**/
    private String coursename;

    /**数据库列类型:String,数据库列注释:研究方向**/
    private String direction;

    /**数据库列类型:String,数据库列注释:开户行**/
    private String openbank;

    /**数据库列类型:String,数据库列注释:银行卡号**/
    private String banknum;

    /**数据库列类型:String,数据库列注释:支付备用**/
    private String payone;

    /**数据库列类型:String,数据库列注释:支付备用**/
    private String paytwo;

    /**数据库列类型:String,数据库列注释:支付备用**/
    private String paythree;

    /**数据库列类型:String,数据库列注释:支付备用**/
    private String payfour;

    /**数据库列类型:String,数据库列注释:支付备用**/
    private String payfix;

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

    /**数据库列类型:Date,数据库列注释:添加时间**/
    private String creattime;

    /**数据库列类型:String,数据库列注释:添加人ID**/
    private String creatper;

    /**数据库列类型:String,数据库列注释:添加人姓名**/
    private String addname;

    /**数据库列类型:Date,数据库列注释:更新时间**/
    private String updatetime;

    public String getUsernumber() {
        return usernumber;
    }

    public void setUsernumber(String usernumber) {
        this.usernumber = usernumber == null ? null : usernumber.trim();
    }
    
    

    public String getGetedudate() {
		return getedudate;
	}

	public void setGetedudate(String getedudate) {
		this.getedudate = getedudate;
	}

	public String getBestedudate() {
		return bestedudate;
	}

	public void setBestedudate(String bestedudate) {
		this.bestedudate = bestedudate;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel == null ? null : usertel.trim();
    }

    public String getOfficetel() {
        return officetel;
    }

    public void setOfficetel(String officetel) {
        this.officetel = officetel == null ? null : officetel.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial == null ? null : emial.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getTeachtype() {
        return teachtype;
    }

    public void setTeachtype(String teachtype) {
        this.teachtype = teachtype == null ? null : teachtype.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getBesteducation() {
        return besteducation;
    }

    public void setBesteducation(String besteducation) {
        this.besteducation = besteducation == null ? null : besteducation.trim();
    }

    public String getBestschool() {
        return bestschool;
    }

    public void setBestschool(String bestschool) {
        this.bestschool = bestschool == null ? null : bestschool.trim();
    }

    public String getBestdegree() {
        return bestdegree;
    }

    public void setBestdegree(String bestdegree) {
        this.bestdegree = bestdegree == null ? null : bestdegree.trim();
    }

    public String getZhicheng() {
        return zhicheng;
    }

    public void setZhicheng(String zhicheng) {
        this.zhicheng = zhicheng == null ? null : zhicheng.trim();
    }

    public String getGaintime() {
        return gaintime;
    }

    public void setGaintime(String gaintime) {
        this.gaintime = gaintime;
    }

    public String getEngagetime() {
        return engagetime;
    }

    public void setEngagetime(String engagetime) {
        this.engagetime = engagetime;
    }

    public String getPlacedept() {
        return placedept;
    }

    public void setPlacedept(String placedept) {
        this.placedept = placedept == null ? null : placedept.trim();
    }

    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename == null ? null : placename.trim();
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

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction == null ? null : direction.trim();
    }

    public String getOpenbank() {
        return openbank;
    }

    public void setOpenbank(String openbank) {
        this.openbank = openbank == null ? null : openbank.trim();
    }

    public String getBanknum() {
        return banknum;
    }

    public void setBanknum(String banknum) {
        this.banknum = banknum == null ? null : banknum.trim();
    }

    public String getPayone() {
        return payone;
    }

    public void setPayone(String payone) {
        this.payone = payone == null ? null : payone.trim();
    }

    public String getPaytwo() {
        return paytwo;
    }

    public void setPaytwo(String paytwo) {
        this.paytwo = paytwo == null ? null : paytwo.trim();
    }

    public String getPaythree() {
        return paythree;
    }

    public void setPaythree(String paythree) {
        this.paythree = paythree == null ? null : paythree.trim();
    }

    public String getPayfour() {
        return payfour;
    }

    public void setPayfour(String payfour) {
        this.payfour = payfour == null ? null : payfour.trim();
    }

    public String getPayfix() {
        return payfix;
    }

    public void setPayfix(String payfix) {
        this.payfix = payfix == null ? null : payfix.trim();
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

    public String getCreattime() {
        return creattime;
    }

    public void setCreattime(String creattime) {
        this.creattime = creattime;
    }

    public String getCreatper() {
        return creatper;
    }

    public void setCreatper(String creatper) {
        this.creatper = creatper == null ? null : creatper.trim();
    }

    public String getAddname() {
        return addname;
    }

    public void setAddname(String addname) {
        this.addname = addname == null ? null : addname.trim();
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }
}