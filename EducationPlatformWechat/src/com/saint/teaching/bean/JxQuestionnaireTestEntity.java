package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxQuestionnaireTestEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:null**/
    private String questionid;

    /**数据库列类型:BigDecimal,数据库列注释:顺序号**/
    private String sxh;

    /**数据库列类型:String,数据库列注释:题型 1：简答题 2：单选题 3：多选 4：判断**/
    private String tx;

    /**数据库列类型:String,数据库列注释:问卷类别 1：本科生理论课**/
    private String wjlb;

    /**数据库列类型:String,数据库列注释:难度 1：低 2：中 3：高**/
    private String nd;

    /**数据库列类型:String,数据库列注释:是否有效 0：无效 1：有效**/
    private String sfyx;

    /**数据库列类型:String,数据库列注释:问题**/
    private String wt;

    /**数据库列类型:String,数据库列注释:问题答案属性 1：标准答案**/
    private String wtdasx;

    /**数据库列类型:String,数据库列注释:问题的所有答案 列 A@满意,B@非常满意**/
    private String wtda;

    /**数据库列类型:String,数据库列注释:标准答案**/
    private String bzda;

    /**数据库列类型:String,数据库列注释:科室代码**/
    private String depid;

    /**数据库列类型:String,数据库列注释:科室名称**/
    private String depname;

    /**数据库列类型:String,数据库列注释:创建人id**/
    private String ctrid;

    /**数据库列类型:String,数据库列注释:创建人姓名**/
    private String ctrname;

    /**数据库列类型:Date,数据库列注释:创建时间**/
    private String createtime;

    /**数据库列类型:Date,数据库列注释:更新时间**/
    private String updatetime;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark1;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark2;

    /**数据库列类型:String,数据库列注释:null**/
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