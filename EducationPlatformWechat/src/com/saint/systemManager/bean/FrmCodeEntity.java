package com.saint.systemManager.bean;

import com.saint.pub.plugin.PageEntity;

public class FrmCodeEntity extends FrmCodeKey {
    /**���ݿ�������:String,���ݿ���ע��:������**/
    private String dmjc;

    /**���ݿ�������:String,���ݿ���ע��:��������**/
    private String dmmc;

    /**���ݿ�������:String,���ݿ���ע��:��������1**/
    private String dmsm1;

    /**���ݿ�������:String,���ݿ���ע��:��������2**/
    private String dmsm2;

    /**���ݿ�������:String,���ݿ���ע��:��������3**/
    private String dmsm3;

    /**���ݿ�������:String,���ݿ���ע��:��������4**/
    private String dmsm4;

    /**���ݿ�������:String,���ݿ���ע��:�������ԣ�0-�������޸� 1-�����޸ģ�**/
    private String dmsx;

    /**���ݿ�������:String,���ݿ���ע��:״̬��ǣ�0-ɾ�� 1-������**/
    private String zt;

    /**���ݿ�������:String,���ݿ���ע��:ҵ��ʹ�ö��󣨿գ�����ʹ��
ҵ��ʹ�ö����Զ��ŷָ�
��**/
    private String ywdx;

    /**���ݿ�������:Long,���ݿ���ע��:˳���**/
    private String sxh;

    public String getDmjc() {
        return dmjc;
    }

    public void setDmjc(String dmjc) {
        this.dmjc = dmjc == null ? null : dmjc.trim();
    }

    public String getDmmc() {
        return dmmc;
    }

    public void setDmmc(String dmmc) {
        this.dmmc = dmmc == null ? null : dmmc.trim();
    }

    public String getDmsm1() {
        return dmsm1;
    }

    public void setDmsm1(String dmsm1) {
        this.dmsm1 = dmsm1 == null ? null : dmsm1.trim();
    }

    public String getDmsm2() {
        return dmsm2;
    }

    public void setDmsm2(String dmsm2) {
        this.dmsm2 = dmsm2 == null ? null : dmsm2.trim();
    }

    public String getDmsm3() {
        return dmsm3;
    }

    public void setDmsm3(String dmsm3) {
        this.dmsm3 = dmsm3 == null ? null : dmsm3.trim();
    }

    public String getDmsm4() {
        return dmsm4;
    }

    public void setDmsm4(String dmsm4) {
        this.dmsm4 = dmsm4 == null ? null : dmsm4.trim();
    }

    public String getDmsx() {
        return dmsx;
    }

    public void setDmsx(String dmsx) {
        this.dmsx = dmsx == null ? null : dmsx.trim();
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt == null ? null : zt.trim();
    }

    public String getYwdx() {
        return ywdx;
    }

    public void setYwdx(String ywdx) {
        this.ywdx = ywdx == null ? null : ywdx.trim();
    }

    public String getSxh() {
        return sxh;
    }

    public void setSxh(String sxh) {
        this.sxh = sxh;
    }
}