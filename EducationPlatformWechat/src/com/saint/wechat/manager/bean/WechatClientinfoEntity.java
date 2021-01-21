package com.saint.wechat.manager.bean;

import com.saint.pub.plugin.PageEntity;

public class WechatClientinfoEntity extends PageEntity {
    private String clientsxh;

    private String clientname;

    private String clientid;

    private String appid;

    private String appsecret;

    private String token;

    private String encodingaeskey;

    private String isaeskey;

    private String wxtype;

    private String rzinfo;

    private String xzqh;

    private String syjb;

    private String gxsj;
    
    private String apiurl; //  APIURL

    public String getClientsxh() {
        return clientsxh;
    }

    public void setClientsxh(String clientsxh) {
        this.clientsxh = clientsxh == null ? null : clientsxh.trim();
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname == null ? null : clientname.trim();
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid == null ? null : clientid.trim();
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret == null ? null : appsecret.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getEncodingaeskey() {
        return encodingaeskey;
    }

    public void setEncodingaeskey(String encodingaeskey) {
        this.encodingaeskey = encodingaeskey == null ? null : encodingaeskey.trim();
    }

    public String getIsaeskey() {
        return isaeskey;
    }

    public void setIsaeskey(String isaeskey) {
        this.isaeskey = isaeskey == null ? null : isaeskey.trim();
    }

    public String getWxtype() {
        return wxtype;
    }

    public void setWxtype(String wxtype) {
        this.wxtype = wxtype == null ? null : wxtype.trim();
    }

    public String getRzinfo() {
        return rzinfo;
    }

    public void setRzinfo(String rzinfo) {
        this.rzinfo = rzinfo == null ? null : rzinfo.trim();
    }

    public String getXzqh() {
        return xzqh;
    }

    public void setXzqh(String xzqh) {
        this.xzqh = xzqh == null ? null : xzqh.trim();
    }

    public String getSyjb() {
        return syjb;
    }

    public void setSyjb(String syjb) {
        this.syjb = syjb == null ? null : syjb.trim();
    }

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }


	public String getApiurl() {
		return apiurl;
	}

	public void setApiurl(String apiurl) {
		this.apiurl = apiurl;
	}
    
}