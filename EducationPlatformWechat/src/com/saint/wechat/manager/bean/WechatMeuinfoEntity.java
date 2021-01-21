package com.saint.wechat.manager.bean;

import com.saint.pub.plugin.PageEntity;

public class WechatMeuinfoEntity extends PageEntity {
    private String menuid;

    private String menuname;

    private String menutype;

    private String menukey;

    private String menuurl;

    private String gxsj;

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

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }
}