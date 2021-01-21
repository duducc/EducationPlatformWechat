package com.saint.wechat.manager.bean;

import com.saint.pub.plugin.PageEntity;

public class WechatMenugroupEntity extends PageEntity {
    private String menusxh;

    private String clientsxh;

    private String menuname;

    private String menuvalue;

    private String gxsj;

    public String getMenusxh() {
        return menusxh;
    }

    public void setMenusxh(String menusxh) {
        this.menusxh = menusxh == null ? null : menusxh.trim();
    }

    public String getClientsxh() {
        return clientsxh;
    }

    public void setClientsxh(String clientsxh) {
        this.clientsxh = clientsxh == null ? null : clientsxh.trim();
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getMenuvalue() {
        return menuvalue;
    }

    public void setMenuvalue(String menuvalue) {
        this.menuvalue = menuvalue == null ? null : menuvalue.trim();
    }

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }
}