package com.saint.wechat.manager.bean;

public class WechatBindKey {
    private String openId;

    private String clientsxh;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getClientsxh() {
        return clientsxh;
    }

    public void setClientsxh(String clientsxh) {
        this.clientsxh = clientsxh == null ? null : clientsxh.trim();
    }
}