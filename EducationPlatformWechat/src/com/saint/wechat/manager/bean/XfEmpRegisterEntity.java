package com.saint.wechat.manager.bean;

import com.saint.pub.plugin.PageEntity;

public class XfEmpRegisterEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:医通卡号**/
    private String usernumber;

    /**数据库列类型:String,数据库列注释:用户姓名**/
    private String username;

    /**数据库列类型:String,数据库列注释:性别**/
    private String sex;

    /**数据库列类型:String,数据库列注释:身份证号**/
    private String idcard;

    /**数据库列类型:String,数据库列注释:用户所在科室编号**/
    private String depart;

    /**数据库列类型:String,数据库列注释:用户所在科室名称**/
    private String deptname;

    /**数据库列类型:String,数据库列注释:用户所在医院编号**/
    private String yiyuan;

    /**数据库列类型:String,数据库列注释:用户所在医院名称**/
    private String yiyuanname;

    /**数据库列类型:String,数据库列注释:专业**/
    private String zhuanye;

    /**数据库列类型:String,数据库列注释:学历**/
    private String xueli;

    /**数据库列类型:String,数据库列注释:职称**/
    private String zhicheng;

    /**数据库列类型:String,数据库列注释:职称级别**/
    private String zhichenglv;

    /**数据库列类型:String,数据库列注释:民族**/
    private String minzu;

    /**数据库列类型:String,数据库列注释:政资**/
    private String zhengzi;

    /**数据库列类型:String,数据库列注释:职务**/
    private String zhiwu;

    /**数据库列类型:String,数据库列注释:学位**/
    private String xuewei;

    /**数据库列类型:String,数据库列注释:手机**/
    private String usertel;

    /**数据库列类型:String,数据库列注释:电话**/
    private String userphone;

    /**数据库列类型:String,数据库列注释:邮箱**/
    private String useremail;

    /**数据库列类型:Date,数据库列注释:添加时间**/
    private String addTime;

    /**数据库列类型:String,数据库列注释:用户来源（1.省级医院用户，2.市州医院用户，3.基层用户，4.其他用户）**/
    private String uresource;

    /**数据库列类型:String,数据库列注释:备注**/
    private String beizhu;

    /**数据库列类型:Date,数据库列注释:申请时间**/
    private String applytime;

    /**数据库列类型:String,数据库列注释:是否审核(1.无需审核。2.未审核。3，审核通过。4，审核不通过)**/
    private String checked;

    /**数据库列类型:String,数据库列注释:审核人ID**/
    private String checknumber;

    /**数据库列类型:Date,数据库列注释:审核时间**/
    private String checkdate;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark1;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark2;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark3;

    public String getUsernumber() {
        return usernumber;
    }

    public void setUsernumber(String usernumber) {
        this.usernumber = usernumber == null ? null : usernumber.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
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

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart == null ? null : depart.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getYiyuan() {
        return yiyuan;
    }

    public void setYiyuan(String yiyuan) {
        this.yiyuan = yiyuan == null ? null : yiyuan.trim();
    }

    public String getYiyuanname() {
        return yiyuanname;
    }

    public void setYiyuanname(String yiyuanname) {
        this.yiyuanname = yiyuanname == null ? null : yiyuanname.trim();
    }

    public String getZhuanye() {
        return zhuanye;
    }

    public void setZhuanye(String zhuanye) {
        this.zhuanye = zhuanye == null ? null : zhuanye.trim();
    }

    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli == null ? null : xueli.trim();
    }

    public String getZhicheng() {
        return zhicheng;
    }

    public void setZhicheng(String zhicheng) {
        this.zhicheng = zhicheng == null ? null : zhicheng.trim();
    }

    public String getZhichenglv() {
        return zhichenglv;
    }

    public void setZhichenglv(String zhichenglv) {
        this.zhichenglv = zhichenglv == null ? null : zhichenglv.trim();
    }

    public String getMinzu() {
        return minzu;
    }

    public void setMinzu(String minzu) {
        this.minzu = minzu == null ? null : minzu.trim();
    }

    public String getZhengzi() {
        return zhengzi;
    }

    public void setZhengzi(String zhengzi) {
        this.zhengzi = zhengzi == null ? null : zhengzi.trim();
    }

    public String getZhiwu() {
        return zhiwu;
    }

    public void setZhiwu(String zhiwu) {
        this.zhiwu = zhiwu == null ? null : zhiwu.trim();
    }

    public String getXuewei() {
        return xuewei;
    }

    public void setXuewei(String xuewei) {
        this.xuewei = xuewei == null ? null : xuewei.trim();
    }

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel == null ? null : usertel.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getUresource() {
        return uresource;
    }

    public void setUresource(String uresource) {
        this.uresource = uresource == null ? null : uresource.trim();
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public String getApplytime() {
        return applytime;
    }

    public void setApplytime(String applytime) {
        this.applytime = applytime;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked == null ? null : checked.trim();
    }

    public String getChecknumber() {
        return checknumber;
    }

    public void setChecknumber(String checknumber) {
        this.checknumber = checknumber == null ? null : checknumber.trim();
    }

    public String getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(String checkdate) {
        this.checkdate = checkdate;
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
}