package com.saint.systemManager.bean;

import com.saint.pub.plugin.PageEntity;

public class FrmZlLogEntity extends PageEntity {
    private String iden;

    private String city;

    private String glbm;

    private String yhdh;

    private String xm;

    private String logmess;

    private String logtime;

    private String ip;

    private String gxsj;

    private String cznr;

    public String getIden() {
        return iden;
    }

    public void setIden(String iden) {
        this.iden = iden == null ? null : iden.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getGlbm() {
        return glbm;
    }

    public void setGlbm(String glbm) {
        this.glbm = glbm == null ? null : glbm.trim();
    }

    public String getYhdh() {
        return yhdh;
    }

    public void setYhdh(String yhdh) {
        this.yhdh = yhdh == null ? null : yhdh.trim();
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    public String getLogmess() {
        return logmess;
    }

    public void setLogmess(String logmess) {
        this.logmess = logmess == null ? null : logmess.trim();
    }

    public String getLogtime() {
        return logtime;
    }

    public void setLogtime(String logtime) {
        this.logtime = logtime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }

    public String getCznr() {
        return cznr;
    }

    public void setCznr(String cznr) {
        this.cznr = cznr == null ? null : cznr.trim();
    }
}