package com.saint.systemManager.bean;

import com.saint.pub.plugin.PageEntity;

public class FrmCodetypeEntity extends FrmCodetypeKey {
    private String lbsm;

    private String dmcd;

    private String lbsx;

    private String dmsx;

    private String bz;

    private String jznc;

    private String dmlx;

    public String getLbsm() {
        return lbsm;
    }

    public void setLbsm(String lbsm) {
        this.lbsm = lbsm == null ? null : lbsm.trim();
    }

    public String getDmcd() {
        return dmcd;
    }

    public void setDmcd(String dmcd) {
        this.dmcd = dmcd;
    }

    public String getLbsx() {
        return lbsx;
    }

    public void setLbsx(String lbsx) {
        this.lbsx = lbsx == null ? null : lbsx.trim();
    }

    public String getDmsx() {
        return dmsx;
    }

    public void setDmsx(String dmsx) {
        this.dmsx = dmsx;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public String getJznc() {
        return jznc;
    }

    public void setJznc(String jznc) {
        this.jznc = jznc == null ? null : jznc.trim();
    }

    public String getDmlx() {
        return dmlx;
    }

    public void setDmlx(String dmlx) {
        this.dmlx = dmlx == null ? null : dmlx.trim();
    }
}