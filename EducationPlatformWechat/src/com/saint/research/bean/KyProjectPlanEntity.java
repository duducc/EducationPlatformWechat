package com.saint.research.bean;


import com.saint.pub.plugin.PageEntity;

public class KyProjectPlanEntity extends PageEntity {
    /**���ݿ�������:String,���ݿ���ע��:Ψһ����**/
    private String xh;

    /**���ݿ�������:String,���ݿ���ע��:��Ŀ���**/
    private String prosequence;

    /**���ݿ�������:BigDecimal,���ݿ���ע��:�������**/
    private String tasknum;

    /**���ݿ�������:Date,���ݿ���ע��:����ʼʱ��**/
    private String taskstartdate;

    /**���ݿ�������:Date,���ݿ���ע��:�������ʱ��**/
    private String taskenddate;

    /**���ݿ�������:String,���ݿ���ע��:��������**/
    private String taskgoal;

    /**���ݿ�������:String,���ݿ���ע��:��������**/
    private String taskcon;

    /**���ݿ�������:BigDecimal,���ݿ���ע��:����ռ��**/
    private String proportion;

    /**���ݿ�������:String,���ݿ���ע��:�����߱��**/
    private String createuserid;

    /**���ݿ�������:String,���ݿ���ע��:����������**/
    private String createusername;

    /**���ݿ�������:Date,���ݿ���ע��:����ʱ��**/
    private String createdate;

    /**���ݿ�������:String,���ݿ���ע��:ִ���߱��**/
    private String excuteuserid;

    /**���ݿ�������:String,���ݿ���ע��:ִ��������**/
    private String excuteusername;

    /**���ݿ�������:String,���ݿ���ע��:�����˱��**/
    private String operateuserid;

    /**���ݿ�������:String,���ݿ���ע��:����������**/
    private String operateusername;

    /**���ݿ�������:Date,���ݿ���ע��:����ʱ��**/
    private String operatedate;

    /**���ݿ�������:String,���ݿ���ע��:�Ƿ����**/
    private String isfinishtask;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark1;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark2;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark3;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark4;

    /**���ݿ�������:String,���ݿ���ע��:null**/
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

    public String getTasknum() {
        return tasknum;
    }

    public void setTasknum(String tasknum) {
        this.tasknum = tasknum;
    }

    public String getTaskstartdate() {
        return taskstartdate;
    }

    public void setTaskstartdate(String taskstartdate) {
        this.taskstartdate = taskstartdate;
    }

    public String getTaskenddate() {
        return taskenddate;
    }

    public void setTaskenddate(String taskenddate) {
        this.taskenddate = taskenddate;
    }

    public String getTaskgoal() {
        return taskgoal;
    }

    public void setTaskgoal(String taskgoal) {
        this.taskgoal = taskgoal == null ? null : taskgoal.trim();
    }

    public String getTaskcon() {
        return taskcon;
    }

    public void setTaskcon(String taskcon) {
        this.taskcon = taskcon == null ? null : taskcon.trim();
    }

    public String getProportion() {
        return proportion;
    }

    public void setProportion(String proportion) {
        this.proportion = proportion;
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

    public String getExcuteuserid() {
        return excuteuserid;
    }

    public void setExcuteuserid(String excuteuserid) {
        this.excuteuserid = excuteuserid == null ? null : excuteuserid.trim();
    }

    public String getExcuteusername() {
        return excuteusername;
    }

    public void setExcuteusername(String excuteusername) {
        this.excuteusername = excuteusername == null ? null : excuteusername.trim();
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

    public String getIsfinishtask() {
        return isfinishtask;
    }

    public void setIsfinishtask(String isfinishtask) {
        this.isfinishtask = isfinishtask == null ? null : isfinishtask.trim();
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