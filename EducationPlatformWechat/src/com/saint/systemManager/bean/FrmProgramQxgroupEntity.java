package com.saint.systemManager.bean;

import com.saint.pub.plugin.PageEntity;

public class FrmProgramQxgroupEntity extends PageEntity {
    private String qxgroup;

    private String qxgroupmc;

    private String qxcjbm;

    private String cxdh;

    private String qxsyjb;

    private String cxlb;

    private String xsbj;

    private String sybj;

    private String gxsj;

    private String sfgly;

    public String getQxgroup() {
        return qxgroup;
    }

    public void setQxgroup(String qxgroup) {
        this.qxgroup = qxgroup == null ? null : qxgroup.trim();
    }

    public String getQxgroupmc() {
        return qxgroupmc;
    }

    public void setQxgroupmc(String qxgroupmc) {
        this.qxgroupmc = qxgroupmc == null ? null : qxgroupmc.trim();
    }

    public String getQxcjbm() {
        return qxcjbm;
    }

    public void setQxcjbm(String qxcjbm) {
        this.qxcjbm = qxcjbm == null ? null : qxcjbm.trim();
    }

    public String getCxdh() {
        return cxdh;
    }

    public void setCxdh(String cxdh) {
        this.cxdh = cxdh == null ? null : cxdh.trim();
    }

    public String getQxsyjb() {
        return qxsyjb;
    }

    public void setQxsyjb(String qxsyjb) {
        this.qxsyjb = qxsyjb == null ? null : qxsyjb.trim();
    }

    public String getCxlb() {
        return cxlb;
    }

    public void setCxlb(String cxlb) {
        this.cxlb = cxlb == null ? null : cxlb.trim();
    }

    public String getXsbj() {
        return xsbj;
    }

    public void setXsbj(String xsbj) {
        this.xsbj = xsbj == null ? null : xsbj.trim();
    }

    public String getSybj() {
        return sybj;
    }

    public void setSybj(String sybj) {
        this.sybj = sybj == null ? null : sybj.trim();
    }

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }

    public String getSfgly() {
        return sfgly;
    }

    public void setSfgly(String sfgly) {
        this.sfgly = sfgly == null ? null : sfgly.trim();
    }
}