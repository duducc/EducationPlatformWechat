package com.saint.wechat.manager.bean;

import com.saint.pub.plugin.PageEntity;

public class WechatMenuinfoEntity extends PageEntity {
    /**���ݿ�������:String,���ݿ���ע��:Ŀ¼id CLIENTSXH+MENUSXH+2λ˳���**/
    private String menuid;

    /**���ݿ�������:String,���ݿ���ע��:Ŀ¼����**/
    private String menuname;

    /**���ݿ�������:String,���ݿ���ע��:Ŀ¼����  click ��view**/
    private String menutype;

    /**���ݿ�������:String,���ݿ���ע��:�ؼ���**/
    private String menukey;

    /**���ݿ�������:String,���ݿ���ע��:����·��**/
    private String menuurl;

    /**���ݿ�������:String,���ݿ���ע��:ͼƬ·��**/
    private String imageurl;

    /**���ݿ�������:String,���ݿ���ע��:�¼�Ŀ¼**/
    private String menuvalue;

    /**���ݿ�������:BigDecimal,���ݿ���ע��:˳���**/
    private String sxh;

    /**���ݿ�������:Date,���ݿ���ע��:null**/
    private String gxsj;

    /**���ݿ�������:String,���ݿ���ע��:���ñ�ǣ�0ͣ�� 1����**/
    private String qybj;

    /**���ݿ�������:String,���ݿ���ע��:Ŀ¼�ȼ� 1����Ŀ¼ 2����Ŀ¼ 3��Ŀ¼**/
    private String menulevel;

    /**���ݿ�������:String,���ݿ���ע��:Ȩ�� 0����󶨾Ϳ�ʹ�� 1����󶨲���ʹ�� 2����Ա��ʹ��**/
    private String power;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark1;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark2;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark3;

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid == null ? null : menuid.trim();
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getMenutype() {
        return menutype;
    }

    public void setMenutype(String menutype) {
        this.menutype = menutype == null ? null : menutype.trim();
    }

    public String getMenukey() {
        return menukey;
    }

    public void setMenukey(String menukey) {
        this.menukey = menukey == null ? null : menukey.trim();
    }

    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl == null ? null : menuurl.trim();
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public String getMenuvalue() {
        return menuvalue;
    }

    public void setMenuvalue(String menuvalue) {
        this.menuvalue = menuvalue == null ? null : menuvalue.trim();
    }

    public String getSxh() {
        return sxh;
    }

    public void setSxh(String sxh) {
        this.sxh = sxh;
    }

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }

    public String getQybj() {
        return qybj;
    }

    public void setQybj(String qybj) {
        this.qybj = qybj == null ? null : qybj.trim();
    }

    public String getMenulevel() {
        return menulevel;
    }

    public void setMenulevel(String menulevel) {
        this.menulevel = menulevel == null ? null : menulevel.trim();
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power == null ? null : power.trim();
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