package com.saint.research.bean;

import com.saint.pub.plugin.PageEntity;

public class KyBonusEntity extends PageEntity {
    /**���ݿ�������:String,���ݿ���ע��:��� ����**/
    private String xh;

    /**���ݿ�������:String,���ݿ���ע��:����ժҪ**/
    private String title;

    /**���ݿ�������:String,���ݿ���ע��:��������**/
    private String bonustype;

    /**���ݿ�������:BigDecimal,���ݿ���ע��:������**/
    private String amount;

    /**���ݿ�������:Date,���ݿ���ע��:���𷢷�����**/
    private String bonusdate;

    /**���ݿ�������:String,���ݿ���ע��:�����ɹ�ID**/
    private String resultid;

    /**���ݿ�������:String,���ݿ���ע��:��ע**/
    private String mark;

    /**���ݿ�������:String,���ݿ���ע��:������ID**/
    private String createuserid;

    /**���ݿ�������:String,���ݿ���ע��:����������**/
    private String createusername;

    /**���ݿ�������:Date,���ݿ���ע��:��������**/
    private String createdate;

    /**���ݿ�������:String,���ݿ���ע��:������ID**/
    private String operateuserid;

    /**���ݿ�������:String,���ݿ���ע��:����������**/
    private String operateusername;

    /**���ݿ�������:Date,���ݿ���ע��:��������**/
    private String operatedate;

    /**���ݿ�������:String,���ݿ���ע��:�����Id**/
    private String obtainid;

    /**���ݿ�������:String,���ݿ���ע��:���������**/
    private String obtainname;

    /**���ݿ�������:String,���ݿ���ע��:���������**/
    private String obtaintype;
    
    // �����ֶ�
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