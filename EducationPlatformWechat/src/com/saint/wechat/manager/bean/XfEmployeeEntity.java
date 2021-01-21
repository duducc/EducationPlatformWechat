package com.saint.wechat.manager.bean;

import com.saint.pub.plugin.PageEntity;

public class XfEmployeeEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:用户登录名（医通卡号）**/
    private String usernumber;

    /**数据库列类型:String,数据库列注释:旧身份证号**/
    private String userOidId;

    /**数据库列类型:String,数据库列注释:用户姓名**/
    private String username;

    /**数据库列类型:String,数据库列注释:性别**/
    private String sex;

    /**数据库列类型:String,数据库列注释:身份证号**/
    private String idcard;

    /**数据库列类型:String,数据库列注释:QQ**/
    private String qq;

    /**数据库列类型:String,数据库列注释:卡号类型**/
    private String cardtype;

    /**数据库列类型:String,数据库列注释:用户所在部门编号**/
    private String depart;

    /**数据库列类型:String,数据库列注释:用户所在医院编号**/
    private String yiyuan;

    /**数据库列类型:String,数据库列注释:专业**/
    private String zhuanye;

    /**数据库列类型:String,数据库列注释:tb_dictdata表主键(155：正常156：注销)**/
    private String zt;

    /**数据库列类型:String,数据库列注释:学历**/
    private String xueli;

    /**数据库列类型:String,数据库列注释:生日**/
    private String shengri;

    /**数据库列类型:String,数据库列注释:职称**/
    private String zhicheng;

    /**数据库列类型:String,数据库列注释:null**/
    private String zhichenglv;

    /**数据库列类型:String,数据库列注释:民族**/
    private String minzu;

    /**数据库列类型:String,数据库列注释:政资**/
    private String zhengzi;

    /**数据库列类型:String,数据库列注释:职务**/
    private String zhiwu;

    /**数据库列类型:String,数据库列注释:学位**/
    private String xuewei;

    /**数据库列类型:String,数据库列注释:调动状态**/
    private String diaodongzhuangtai;

    /**数据库列类型:String,数据库列注释:null**/
    private String byyuabxiao;

    /**数据库列类型:String,数据库列注释:手机**/
    private String usertel;

    /**数据库列类型:String,数据库列注释:电话**/
    private String userphone;

    /**数据库列类型:String,数据库列注释:邮箱**/
    private String useremail;

    /**数据库列类型:String,数据库列注释:null**/
    private String pfttcNumbers;

    /**数据库列类型:String,数据库列注释:null**/
    private String userZyid;

    /**数据库列类型:String,数据库列注释:照片**/
    private String photo;

    /**数据库列类型:Date,数据库列注释:添加时间**/
    private String addTime;

    /**数据库列类型:String,数据库列注释:办卡状态**/
    private String bankaRes;

    /**数据库列类型:Long,数据库列注释:null**/
    private String xkbs;

    /**数据库列类型:String,数据库列注释:写卡日期**/
    private String xkrq;

    /**数据库列类型:String,数据库列注释:到期时间**/
    private String dqsj;

    /**数据库列类型:Long,数据库列注释:null**/
    private String uresource;

    /**数据库列类型:String,数据库列注释: 备注**/
    private String beizhu;

    /**数据库列类型:String,数据库列注释:缴费状态**/
    private String state;

    /**数据库列类型:Date,数据库列注释:修改时间**/
    private String updatetime;

    public String getUsernumber() {
        return usernumber;
    }

    public void setUsernumber(String usernumber) {
        this.usernumber = usernumber == null ? null : usernumber.trim();
    }

    public String getUserOidId() {
        return userOidId;
    }

    public void setUserOidId(String userOidId) {
        this.userOidId = userOidId == null ? null : userOidId.trim();
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

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype == null ? null : cardtype.trim();
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart == null ? null : depart.trim();
    }

    public String getYiyuan() {
        return yiyuan;
    }

    public void setYiyuan(String yiyuan) {
        this.yiyuan = yiyuan == null ? null : yiyuan.trim();
    }

    public String getZhuanye() {
        return zhuanye;
    }

    public void setZhuanye(String zhuanye) {
        this.zhuanye = zhuanye == null ? null : zhuanye.trim();
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt == null ? null : zt.trim();
    }

    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli == null ? null : xueli.trim();
    }

    public String getShengri() {
        return shengri;
    }

    public void setShengri(String shengri) {
        this.shengri = shengri == null ? null : shengri.trim();
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

    public String getDiaodongzhuangtai() {
        return diaodongzhuangtai;
    }

    public void setDiaodongzhuangtai(String diaodongzhuangtai) {
        this.diaodongzhuangtai = diaodongzhuangtai == null ? null : diaodongzhuangtai.trim();
    }

    public String getByyuabxiao() {
        return byyuabxiao;
    }

    public void setByyuabxiao(String byyuabxiao) {
        this.byyuabxiao = byyuabxiao == null ? null : byyuabxiao.trim();
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

    public String getPfttcNumbers() {
        return pfttcNumbers;
    }

    public void setPfttcNumbers(String pfttcNumbers) {
        this.pfttcNumbers = pfttcNumbers == null ? null : pfttcNumbers.trim();
    }

    public String getUserZyid() {
        return userZyid;
    }

    public void setUserZyid(String userZyid) {
        this.userZyid = userZyid == null ? null : userZyid.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getBankaRes() {
        return bankaRes;
    }

    public void setBankaRes(String bankaRes) {
        this.bankaRes = bankaRes == null ? null : bankaRes.trim();
    }

    public String getXkbs() {
        return xkbs;
    }

    public void setXkbs(String xkbs) {
        this.xkbs = xkbs;
    }

    public String getXkrq() {
        return xkrq;
    }

    public void setXkrq(String xkrq) {
        this.xkrq = xkrq == null ? null : xkrq.trim();
    }

    public String getDqsj() {
        return dqsj;
    }

    public void setDqsj(String dqsj) {
        this.dqsj = dqsj == null ? null : dqsj.trim();
    }

    public String getUresource() {
        return uresource;
    }

    public void setUresource(String uresource) {
        this.uresource = uresource;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }
}