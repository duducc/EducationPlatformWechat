package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxStudentsSignEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:唯一主键**/
    private String xh;

    /**数据库列类型:String,数据库列注释:学生ID**/
    private String stuid;

    /**数据库列类型:String,数据库列注释:学生姓名**/
    private String stuname;

    /**数据库列类型:String,数据库列注释:签到信息表序号**/
    private String signcs;

    /**数据库列类型:String,数据库列注释:签到时间**/
    private String signtime;

    /**数据库列类型:String,数据库列注释:签到年月日**/
    private String signdate;

    /**数据库列类型:String,数据库列注释:签到状态**/
    private String signstate;

    /**数据库列类型:String,数据库列注释:签到人openID**/
    private String openid;

    /**数据库列类型:String,数据库列注释:迟到时间**/
    private String latetime;

    /**数据库列类型:String,数据库列注释:签到类型**/
    private String type;

    /**数据库列类型:String,数据库列注释:备注**/
    private String bz;

    /**数据库列类型:String,数据库列注释:更新时间**/
    private String updatetime;

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

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid == null ? null : stuid.trim();
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public String getSigncs() {
        return signcs;
    }

    public void setSigncs(String signcs) {
        this.signcs = signcs == null ? null : signcs.trim();
    }

    public String getSigntime() {
        return signtime;
    }

    public void setSigntime(String signtime) {
        this.signtime = signtime == null ? null : signtime.trim();
    }

    public String getSigndate() {
        return signdate;
    }

    public void setSigndate(String signdate) {
        this.signdate = signdate == null ? null : signdate.trim();
    }

    public String getSignstate() {
        return signstate;
    }

    public void setSignstate(String signstate) {
        this.signstate = signstate == null ? null : signstate.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getLatetime() {
        return latetime;
    }

    public void setLatetime(String latetime) {
        this.latetime = latetime == null ? null : latetime.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
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