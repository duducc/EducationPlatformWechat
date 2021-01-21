package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxStudentLeaveCheckEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:唯一主键**/
    private String xh;

    /**数据库列类型:String,数据库列注释:请假表id**/
    private String stulevid;

    /**数据库列类型:String,数据库列注释:审核顺序**/
    private String checkorder;

    /**数据库列类型:String,数据库列注释:审核人id**/
    private String checkperid;

    /**数据库列类型:String,数据库列注释:审核状态（1.通过；2.不通过）**/
    private String state;

    /**数据库列类型:String,数据库列注释:说明**/
    private String explanation;

    /**数据库列类型:Date,数据库列注释:创建日期**/
    private String createdate;

    /**数据库列类型:Date,数据库列注释:null**/
    private String uptime;

    /**数据库列类型:String,数据库列注释:审核人科室**/
    private String checkperdepart;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark1;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark2;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark3;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getStulevid() {
        return stulevid;
    }

    public void setStulevid(String stulevid) {
        this.stulevid = stulevid == null ? null : stulevid.trim();
    }

    public String getCheckorder() {
        return checkorder;
    }

    public void setCheckorder(String checkorder) {
        this.checkorder = checkorder == null ? null : checkorder.trim();
    }

    public String getCheckperid() {
        return checkperid;
    }

    public void setCheckperid(String checkperid) {
        this.checkperid = checkperid == null ? null : checkperid.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation == null ? null : explanation.trim();
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public String getCheckperdepart() {
        return checkperdepart;
    }

    public void setCheckperdepart(String checkperdepart) {
        this.checkperdepart = checkperdepart == null ? null : checkperdepart.trim();
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