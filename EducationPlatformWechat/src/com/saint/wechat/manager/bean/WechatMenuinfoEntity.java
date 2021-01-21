package com.saint.wechat.manager.bean;

import com.saint.pub.plugin.PageEntity;

public class WechatMenuinfoEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:目录id CLIENTSXH+MENUSXH+2位顺序号**/
    private String menuid;

    /**数据库列类型:String,数据库列注释:目录名称**/
    private String menuname;

    /**数据库列类型:String,数据库列注释:目录类型  click ，view**/
    private String menutype;

    /**数据库列类型:String,数据库列注释:关键字**/
    private String menukey;

    /**数据库列类型:String,数据库列注释:访问路径**/
    private String menuurl;

    /**数据库列类型:String,数据库列注释:图片路径**/
    private String imageurl;

    /**数据库列类型:String,数据库列注释:下级目录**/
    private String menuvalue;

    /**数据库列类型:BigDecimal,数据库列注释:顺序号**/
    private String sxh;

    /**数据库列类型:Date,数据库列注释:null**/
    private String gxsj;

    /**数据库列类型:String,数据库列注释:启用标记，0停用 1启用**/
    private String qybj;

    /**数据库列类型:String,数据库列注释:目录等级 1有子目录 2无子目录 3子目录**/
    private String menulevel;

    /**数据库列类型:String,数据库列注释:权限 0无需绑定就可使用 1必须绑定才能使用 2管理员能使用**/
    private String power;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark1;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark2;

    /**数据库列类型:String,数据库列注释:null**/
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