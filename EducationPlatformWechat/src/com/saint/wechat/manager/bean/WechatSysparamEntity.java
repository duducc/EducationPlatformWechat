package com.saint.wechat.manager.bean;


public class WechatSysparamEntity extends WechatSysparamKey {
    private String dmmc;

    private String dmz;

    private String dmsm;

    private String sfxg;

    private String sfxs;

    private String zt;

    private String gxsj;

    public String getDmmc() {
        return dmmc;
    }

    public void setDmmc(String dmmc) {
        this.dmmc = dmmc == null ? null : dmmc.trim();
    }

    public String getDmz() {
        return dmz;
    }

    public void setDmz(String dmz) {
        this.dmz = dmz == null ? null : dmz.trim();
    }

    public String getDmsm() {
        return dmsm;
    }

    public void setDmsm(String dmsm) {
        this.dmsm = dmsm == null ? null : dmsm.trim();
    }

    public String getSfxg() {
        return sfxg;
    }

    public void setSfxg(String sfxg) {
        this.sfxg = sfxg == null ? null : sfxg.trim();
    }

    public String getSfxs() {
        return sfxs;
    }

    public void setSfxs(String sfxs) {
        this.sfxs = sfxs == null ? null : sfxs.trim();
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt == null ? null : zt.trim();
    }

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }
}