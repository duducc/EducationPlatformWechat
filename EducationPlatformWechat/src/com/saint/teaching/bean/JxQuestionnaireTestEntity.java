package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxQuestionnaireTestEntity extends PageEntity {
    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String questionid;

    /**���ݿ�������:BigDecimal,���ݿ���ע��:˳���**/
    private String sxh;

    /**���ݿ�������:String,���ݿ���ע��:���� 1������� 2����ѡ�� 3����ѡ 4���ж�**/
    private String tx;

    /**���ݿ�������:String,���ݿ���ע��:�ʾ���� 1�����������ۿ�**/
    private String wjlb;

    /**���ݿ�������:String,���ݿ���ע��:�Ѷ� 1���� 2���� 3����**/
    private String nd;

    /**���ݿ�������:String,���ݿ���ע��:�Ƿ���Ч 0����Ч 1����Ч**/
    private String sfyx;

    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String wt;

    /**���ݿ�������:String,���ݿ���ע��:��������� 1����׼��**/
    private String wtdasx;

    /**���ݿ�������:String,���ݿ���ע��:��������д� �� A@����,B@�ǳ�����**/
    private String wtda;

    /**���ݿ�������:String,���ݿ���ע��:��׼��**/
    private String bzda;

    /**���ݿ�������:String,���ݿ���ע��:���Ҵ���**/
    private String depid;

    /**���ݿ�������:String,���ݿ���ע��:��������**/
    private String depname;

    /**���ݿ�������:String,���ݿ���ע��:������id**/
    private String ctrid;

    /**���ݿ�������:String,���ݿ���ע��:����������**/
    private String ctrname;

    /**���ݿ�������:Date,���ݿ���ע��:����ʱ��**/
    private String createtime;

    /**���ݿ�������:Date,���ݿ���ע��:����ʱ��**/
    private String updatetime;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark1;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark2;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark3;

    public String getQuestionid() {
        return questionid;
    }

    public void setQuestionid(String questionid) {
        this.questionid = questionid == null ? null : questionid.trim();
    }

    public String getSxh() {
        return sxh;
    }

    public void setSxh(String sxh) {
        this.sxh = sxh;
    }

    public String getTx() {
        return tx;
    }

    public void setTx(String tx) {
        this.tx = tx == null ? null : tx.trim();
    }

    public String getWjlb() {
        return wjlb;
    }

    public void setWjlb(String wjlb) {
        this.wjlb = wjlb == null ? null : wjlb.trim();
    }

    public String getNd() {
        return nd;
    }

    public void setNd(String nd) {
        this.nd = nd == null ? null : nd.trim();
    }

    public String getSfyx() {
        return sfyx;
    }

    public void setSfyx(String sfyx) {
        this.sfyx = sfyx == null ? null : sfyx.trim();
    }

    public String getWt() {
        return wt;
    }

    public void setWt(String wt) {
        this.wt = wt == null ? null : wt.trim();
    }

    public String getWtdasx() {
        return wtdasx;
    }

    public void setWtdasx(String wtdasx) {
        this.wtdasx = wtdasx == null ? null : wtdasx.trim();
    }

    public String getWtda() {
        return wtda;
    }

    public void setWtda(String wtda) {
        this.wtda = wtda == null ? null : wtda.trim();
    }

    public String getBzda() {
        return bzda;
    }

    public void setBzda(String bzda) {
        this.bzda = bzda == null ? null : bzda.trim();
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid == null ? null : depid.trim();
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname == null ? null : depname.trim();
    }

    public String getCtrid() {
        return ctrid;
    }

    public void setCtrid(String ctrid) {
        this.ctrid = ctrid == null ? null : ctrid.trim();
    }

    public String getCtrname() {
        return ctrname;
    }

    public void setCtrname(String ctrname) {
        this.ctrname = ctrname == null ? null : ctrname.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }
}