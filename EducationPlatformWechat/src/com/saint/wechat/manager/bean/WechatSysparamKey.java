package com.saint.wechat.manager.bean;

public class WechatSysparamKey {
    private String gjz;

    private String clientsxh;

    public String getGjz() {
        return gjz;
    }

    public void setGjz(String gjz) {
        this.gjz = gjz == null ? null : gjz.trim();
    }

    public String getClientsxh() {
        return clientsxh;
    }

    public void setClientsxh(String clientsxh) {
        this.clientsxh = clientsxh == null ? null : clientsxh.trim();
    }
}