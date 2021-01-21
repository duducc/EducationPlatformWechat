package com.saint.research.bean;

import com.saint.pub.plugin.PageEntity;

public class KyProjectGressEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:唯一标识**/
    private String xh;

    /**数据库列类型:String,数据库列注释:项目编号**/
    private String prosequence;

    /**数据库列类型:String,数据库列注释:项目名称**/
    private String proname;

    /**数据库列类型:String,数据库列注释:进度描述**/
    private String progressdesc;

    /**数据库列类型:String,数据库列注释:所属任务编号**/
    private String tasknum;

    /**数据库列类型:String,数据库列注释:所属任务名称**/
    private String taskname;

    /**数据库列类型:Date,数据库列注释:登记日期**/
    private String regdate;

    /**数据库列类型:String,数据库列注释:登记人编号**/
    private String regperid;

    /**数据库列类型:String,数据库列注释:登记人姓名**/
    private String regpername;

    /**数据库列类型:BigDecimal,数据库列注释:所占项目总比**/
    private String proproion;

    /**数据库列类型:BigDecimal,数据库列注释:任务完成比例**/
    private String subproportion;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark1;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark2;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark3;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark4;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark5;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getProsequence() {
        return prosequence;
    }

    public void setProsequence(String prosequence) {
        this.prosequence = prosequence == null ? null : prosequence.trim();
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public String getProgressdesc() {
        return progressdesc;
    }

    public void setProgressdesc(String progressdesc) {
        this.progressdesc = progressdesc == null ? null : progressdesc.trim();
    }

    public String getTasknum() {
        return tasknum;
    }

    public void setTasknum(String tasknum) {
        this.tasknum = tasknum == null ? null : tasknum.trim();
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname == null ? null : taskname.trim();
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public String getRegperid() {
        return regperid;
    }

    public void setRegperid(String regperid) {
        this.regperid = regperid == null ? null : regperid.trim();
    }

    public String getRegpername() {
        return regpername;
    }

    public void setRegpername(String regpername) {
        this.regpername = regpername == null ? null : regpername.trim();
    }

    public String getProproion() {
        return proproion;
    }

    public void setProproion(String proproion) {
        this.proproion = proproion;
    }

    public String getSubproportion() {
        return subproportion;
    }

    public void setSubproportion(String subproportion) {
        this.subproportion = subproportion;
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

    public String getRemark4() {
        return remark4;
    }

    public void setRemark4(String remark4) {
        this.remark4 = remark4 == null ? null : remark4.trim();
    }

    public String getRemark5() {
        return remark5;
    }

    public void setRemark5(String remark5) {
        this.remark5 = remark5 == null ? null : remark5.trim();
    }
}