package com.saint.wechat.manager.bean;

import com.saint.pub.plugin.PageEntity;

public class XfEmpRegisterEntity extends PageEntity {
    /**���ݿ�������:String,���ݿ���ע��:ҽͨ����**/
    private String usernumber;

    /**���ݿ�������:String,���ݿ���ע��:�û�����**/
    private String username;

    /**���ݿ�������:String,���ݿ���ע��:�Ա�**/
    private String sex;

    /**���ݿ�������:String,���ݿ���ע��:���֤��**/
    private String idcard;

    /**���ݿ�������:String,���ݿ���ע��:�û����ڿ��ұ��**/
    private String depart;

    /**���ݿ�������:String,���ݿ���ע��:�û����ڿ�������**/
    private String deptname;

    /**���ݿ�������:String,���ݿ���ע��:�û�����ҽԺ���**/
    private String yiyuan;

    /**���ݿ�������:String,���ݿ���ע��:�û�����ҽԺ����**/
    private String yiyuanname;

    /**���ݿ�������:String,���ݿ���ע��:רҵ**/
    private String zhuanye;

    /**���ݿ�������:String,���ݿ���ע��:ѧ��**/
    private String xueli;

    /**���ݿ�������:String,���ݿ���ע��:ְ��**/
    private String zhicheng;

    /**���ݿ�������:String,���ݿ���ע��:ְ�Ƽ���**/
    private String zhichenglv;

    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String minzu;

    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String zhengzi;

    /**���ݿ�������:String,���ݿ���ע��:ְ��**/
    private String zhiwu;

    /**���ݿ�������:String,���ݿ���ע��:ѧλ**/
    private String xuewei;

    /**���ݿ�������:String,���ݿ���ע��:�ֻ�**/
    private String usertel;

    /**���ݿ�������:String,���ݿ���ע��:�绰**/
    private String userphone;

    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String useremail;

    /**���ݿ�������:Date,���ݿ���ע��:���ʱ��**/
    private String addTime;

    /**���ݿ�������:String,���ݿ���ע��:�û���Դ��1.ʡ��ҽԺ�û���2.����ҽԺ�û���3.�����û���4.�����û���**/
    private String uresource;

    /**���ݿ�������:String,���ݿ���ע��:��ע**/
    private String beizhu;

    /**���ݿ�������:Date,���ݿ���ע��:����ʱ��**/
    private String applytime;

    /**���ݿ�������:String,���ݿ���ע��:�Ƿ����(1.������ˡ�2.δ��ˡ�3�����ͨ����4����˲�ͨ��)**/
    private String checked;

    /**���ݿ�������:String,���ݿ���ע��:�����ID**/
    private String checknumber;

    /**���ݿ�������:Date,���ݿ���ע��:���ʱ��**/
    private String checkdate;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark1;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark2;

    /**���ݿ�������:String,���ݿ���ע��:null**/
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