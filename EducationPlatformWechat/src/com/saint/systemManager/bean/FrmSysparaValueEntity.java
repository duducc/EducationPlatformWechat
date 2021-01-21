package com.saint.systemManager.bean;

import com.saint.pub.plugin.PageEntity;

public class FrmSysparaValueEntity extends FrmSysparaValueKey {
    private String csz;

    private String jyw;

    private String gxsj;

    public String getCsz() {
        return csz;
    }

    public void setCsz(String csz) {
        this.csz = csz == null ? null : csz.trim();
    }

    public String getJyw() {
        return jyw;
    }

    public void setJyw(String jyw) {
        this.jyw = jyw == null ? null : jyw.trim();
    }

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }
}