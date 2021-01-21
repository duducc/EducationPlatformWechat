package com.saint.research.bean;

import com.saint.pub.plugin.PageEntity;

public class KyBonusEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:序号 主键**/
    private String xh;

    /**数据库列类型:String,数据库列注释:标题摘要**/
    private String title;

    /**数据库列类型:String,数据库列注释:奖金类型**/
    private String bonustype;

    /**数据库列类型:BigDecimal,数据库列注释:奖金金额**/
    private String amount;

    /**数据库列类型:Date,数据库列注释:奖金发放日期**/
    private String bonusdate;

    /**数据库列类型:String,数据库列注释:关联成果ID**/
    private String resultid;

    /**数据库列类型:String,数据库列注释:备注**/
    private String mark;

    /**数据库列类型:String,数据库列注释:创建者ID**/
    private String createuserid;

    /**数据库列类型:String,数据库列注释:创建者姓名**/
    private String createusername;

    /**数据库列类型:Date,数据库列注释:创建日期**/
    private String createdate;

    /**数据库列类型:String,数据库列注释:操作者ID**/
    private String operateuserid;

    /**数据库列类型:String,数据库列注释:操作者姓名**/
    private String operateusername;

    /**数据库列类型:Date,数据库列注释:操作日期**/
    private String operatedate;

    /**数据库列类型:String,数据库列注释:获得者Id**/
    private String obtainid;

    /**数据库列类型:String,数据库列注释:获得者姓名**/
    private String obtainname;

    /**数据库列类型:String,数据库列注释:获得者类型**/
    private String obtaintype;
    
    // 关联字段
    private String resname ; 
    
    
    public String getResname() {
		return resname;
	}

	public void setResname(String resname) {
		this.resname = resname;
	}

	public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getBonustype() {
        return bonustype;
    }

    public void setBonustype(String bonustype) {
        this.bonustype = bonustype == null ? null : bonustype.trim();
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBonusdate() {
        return bonusdate;
    }

    public void setBonusdate(String bonusdate) {
        this.bonusdate = bonusdate;
    }

    public String getResultid() {
        return resultid;
    }

    public void setResultid(String resultid) {
        this.resultid = resultid == null ? null : resultid.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    public String getCreateusername() {
        return createusername;
    }

    public void setCreateusername(String createusername) {
        this.createusername = createusername == null ? null : createusername.trim();
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getOperateuserid() {
        return operateuserid;
    }

    public void setOperateuserid(String operateuserid) {
        this.operateuserid = operateuserid == null ? null : operateuserid.trim();
    }

    public String getOperateusername() {
        return operateusername;
    }

    public void setOperateusername(String operateusername) {
        this.operateusername = operateusername == null ? null : operateusername.trim();
    }

    public String getOperatedate() {
        return operatedate;
    }

    public void setOperatedate(String operatedate) {
        this.operatedate = operatedate;
    }

    public String getObtainid() {
        return obtainid;
    }

    public void setObtainid(String obtainid) {
        this.obtainid = obtainid == null ? null : obtainid.trim();
    }

    public String getObtainname() {
        return obtainname;
    }

    public void setObtainname(String obtainname) {
        this.obtainname = obtainname == null ? null : obtainname.trim();
    }

    public String getObtaintype() {
        return obtaintype;
    }

    public void setObtaintype(String obtaintype) {
        this.obtaintype = obtaintype == null ? null : obtaintype.trim();
    }
}