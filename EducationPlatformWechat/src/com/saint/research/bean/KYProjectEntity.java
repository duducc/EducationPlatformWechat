package com.saint.research.bean;

import com.saint.pub.plugin.PageEntity;

public class KYProjectEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:项目编号（唯一主键）**/
    private String prosequence;

    /**数据库列类型:String,数据库列注释:项目名称**/
    private String proname;

    /**数据库列类型:String,数据库列注释:项目级别编号**/
    private String prograde;

    /**数据库列类型:String,数据库列注释:项目性质编号**/
    private String pronature;

    /**数据库列类型:String,数据库列注释:项目类别编号**/
    private String protypeid;

    /**数据库列类型:String,数据库列注释:项目子类别编号**/
    private String protypesubid;

    /**数据库列类型:String,数据库列注释:单位编码**/
    private String hospitalid;

    /**数据库列类型:String,数据库列注释:单位名称（参考学分系统）**/
    private String hospitalname;

    /**数据库列类型:String,数据库列注释:申报科室编号**/
    private String depid;

    /**数据库列类型:Date,数据库列注释:项目开始研究时间**/
    private String startdate;

    /**数据库列类型:Date,数据库列注释:项目实际结束研究时间**/
    private String plandate;

    /**数据库列类型:Date,数据库列注释:项目计划结束研究时间**/
    private String realdate;

    /**数据库列类型:String,数据库列注释:项目负责人编号**/
    private String pmid;

    /**数据库列类型:String,数据库列注释:项目负责人姓名**/
    private String pmname;

    /**数据库列类型:String,数据库列注释:项目负责人联系电话**/
    private String pmtel;

    /**数据库列类型:String,数据库列注释:项目负责人电子邮件**/
    private String pmemail;

    /**数据库列类型:String,数据库列注释:项目标识（0新建.1修改.2删除）**/
    private String promark;

    /**数据库列类型:String,数据库列注释:项目状态（0未提交、1已提交、2已立项、3不予立项、9完成验收）**/
    private String prostate;

    /**数据库列类型:String,数据库列注释:提交申请说明**/
    private String submitremark;

    /**数据库列类型:String,数据库列注释:立项说明**/
    private String setremark;

    /**数据库列类型:Date,数据库列注释:提交时间**/
    private String submitdate;

    /**数据库列类型:Date,数据库列注释:立项时间**/
    private String setdate;

    /**数据库列类型:Date,数据库列注释:验收时间**/
    private String checkdate;

    /**数据库列类型:String,数据库列注释:创建者编码**/
    private String createuserid;

    /**数据库列类型:String,数据库列注释:创建者姓名**/
    private String createusername;

    /**数据库列类型:Date,数据库列注释:创建时间**/
    private String createdate;

    /**数据库列类型:String,数据库列注释:成果形式（论文/模型）**/
    private String resulttype;

    /**数据库列类型:BigDecimal,数据库列注释:合同经费**/
    private String contractfunds;

    /**数据库列类型:BigDecimal,数据库列注释:配套经费**/
    private String companionfunds;

    /**数据库列类型:String,数据库列注释:学科门类**/
    private String subjecttype;

    /**数据库列类型:String,数据库列注释:研究类别**/
    private String exploretype;

    /**数据库列类型:String,数据库列注释:合同形式**/
    private String contracttype;

    /**数据库列类型:String,数据库列注释:项目设计专业**/
    private String designmajor;

    /**数据库列类型:String,数据库列注释:开发领域**/
    private String devfiled;

    /**数据库列类型:String,数据库列注释:技术来源**/
    private String techniquesource;

    /**数据库列类型:String,数据库列注释:有无知识产权**/
    private String intellectualproperty;

    /**数据库列类型:BigDecimal,数据库列注释:预期效益新增产值**/
    private String planincreasevalue;

    /**数据库列类型:BigDecimal,数据库列注释:预期效益创收总额**/
    private String plantotalvalue;

    /**数据库列类型:String,数据库列注释:项目主要内容、技术指标摘要**/
    private String protechniquedetail;

    /**数据库列类型:String,数据库列注释:过去承担国家、省、市政府项目及完成情况说明：**/
    private String historicalachievements;

    /**数据库列类型:String,数据库列注释:审核状态（0 未审批 1正在审批2 审批完成 3 审批不通过 9 无需审批）**/
    private String checkstate;

    /**数据库列类型:String,数据库列注释:审批对象编号（可以为部门编号，可以为人员编号）**/
    private String checkobjectid;

    /**数据库列类型:String,数据库列注释:是否是人员编号（0为人员，1为部门）**/
    private String isusercheck;

    /**数据库列类型:String,数据库列注释:审批序号**/
    private String checkorder;

    /**数据库列类型:String,数据库列注释:审批流程组号**/
    private String checkgroupid;

    /**数据库列类型:String,数据库列注释:备注**/
    private String remarks1;

    /**数据库列类型:String,数据库列注释:备注**/
    private String remarks2;

    /**数据库列类型:String,数据库列注释:备注**/
    private String remarks3;

    /**数据库列类型:String,数据库列注释:备注**/
    private String remarks4;

    /**数据库列类型:String,数据库列注释:备注**/
    private String remarks5;

    /**数据库列类型:String,数据库列注释:操作者编码**/
    private String operateuserid;

    /**数据库列类型:String,数据库列注释:操作者姓名**/
    private String operateusername;

    /**数据库列类型:Date,数据库列注释:操作时间**/
    private String operatedate;

    /**数据库列类型:Date,数据库列注释:保存时间**/
    private String savedate;
    
    // 项目参与人员
    private String userNames ; 

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

    public String getPrograde() {
        return prograde;
    }

    public void setPrograde(String prograde) {
        this.prograde = prograde == null ? null : prograde.trim();
    }

    public String getPronature() {
        return pronature;
    }

    public void setPronature(String pronature) {
        this.pronature = pronature == null ? null : pronature.trim();
    }

    public String getProtypeid() {
        return protypeid;
    }

    public void setProtypeid(String protypeid) {
        this.protypeid = protypeid == null ? null : protypeid.trim();
    }

    public String getProtypesubid() {
        return protypesubid;
    }

    public void setProtypesubid(String protypesubid) {
        this.protypesubid = protypesubid == null ? null : protypesubid.trim();
    }

    public String getHospitalid() {
        return hospitalid;
    }

    public void setHospitalid(String hospitalid) {
        this.hospitalid = hospitalid == null ? null : hospitalid.trim();
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname == null ? null : hospitalname.trim();
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid == null ? null : depid.trim();
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getPlandate() {
        return plandate;
    }

    public void setPlandate(String plandate) {
        this.plandate = plandate;
    }

    public String getRealdate() {
        return realdate;
    }

    public void setRealdate(String realdate) {
        this.realdate = realdate;
    }

    public String getPmid() {
        return pmid;
    }

    public void setPmid(String pmid) {
        this.pmid = pmid == null ? null : pmid.trim();
    }

    public String getPmname() {
        return pmname;
    }

    public void setPmname(String pmname) {
        this.pmname = pmname == null ? null : pmname.trim();
    }

    public String getPmtel() {
        return pmtel;
    }

    public void setPmtel(String pmtel) {
        this.pmtel = pmtel == null ? null : pmtel.trim();
    }

    public String getPmemail() {
        return pmemail;
    }

    public void setPmemail(String pmemail) {
        this.pmemail = pmemail == null ? null : pmemail.trim();
    }

    public String getPromark() {
        return promark;
    }

    public void setPromark(String promark) {
        this.promark = promark == null ? null : promark.trim();
    }

    public String getProstate() {
        return prostate;
    }

    public void setProstate(String prostate) {
        this.prostate = prostate == null ? null : prostate.trim();
    }

    public String getSubmitremark() {
        return submitremark;
    }

    public void setSubmitremark(String submitremark) {
        this.submitremark = submitremark == null ? null : submitremark.trim();
    }

    public String getSetremark() {
        return setremark;
    }

    public void setSetremark(String setremark) {
        this.setremark = setremark == null ? null : setremark.trim();
    }

    public String getSubmitdate() {
        return submitdate;
    }

    public void setSubmitdate(String submitdate) {
        this.submitdate = submitdate;
    }

    public String getSetdate() {
        return setdate;
    }

    public void setSetdate(String setdate) {
        this.setdate = setdate;
    }

    public String getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(String checkdate) {
        this.checkdate = checkdate;
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

    public String getResulttype() {
        return resulttype;
    }

    public void setResulttype(String resulttype) {
        this.resulttype = resulttype == null ? null : resulttype.trim();
    }

    public String getContractfunds() {
        return contractfunds;
    }

    public void setContractfunds(String contractfunds) {
        this.contractfunds = contractfunds;
    }

    public String getCompanionfunds() {
        return companionfunds;
    }

    public void setCompanionfunds(String companionfunds) {
        this.companionfunds = companionfunds;
    }

    public String getSubjecttype() {
        return subjecttype;
    }

    public void setSubjecttype(String subjecttype) {
        this.subjecttype = subjecttype == null ? null : subjecttype.trim();
    }

    public String getExploretype() {
        return exploretype;
    }

    public void setExploretype(String exploretype) {
        this.exploretype = exploretype == null ? null : exploretype.trim();
    }

    public String getContracttype() {
        return contracttype;
    }

    public void setContracttype(String contracttype) {
        this.contracttype = contracttype == null ? null : contracttype.trim();
    }

    public String getDesignmajor() {
        return designmajor;
    }

    public void setDesignmajor(String designmajor) {
        this.designmajor = designmajor == null ? null : designmajor.trim();
    }

    public String getDevfiled() {
        return devfiled;
    }

    public void setDevfiled(String devfiled) {
        this.devfiled = devfiled == null ? null : devfiled.trim();
    }

    public String getTechniquesource() {
        return techniquesource;
    }

    public void setTechniquesource(String techniquesource) {
        this.techniquesource = techniquesource == null ? null : techniquesource.trim();
    }

    public String getIntellectualproperty() {
        return intellectualproperty;
    }

    public void setIntellectualproperty(String intellectualproperty) {
        this.intellectualproperty = intellectualproperty == null ? null : intellectualproperty.trim();
    }

    public String getPlanincreasevalue() {
        return planincreasevalue;
    }

    public void setPlanincreasevalue(String planincreasevalue) {
        this.planincreasevalue = planincreasevalue;
    }

    public String getPlantotalvalue() {
        return plantotalvalue;
    }

    public void setPlantotalvalue(String plantotalvalue) {
        this.plantotalvalue = plantotalvalue;
    }

    public String getProtechniquedetail() {
        return protechniquedetail;
    }

    public void setProtechniquedetail(String protechniquedetail) {
        this.protechniquedetail = protechniquedetail == null ? null : protechniquedetail.trim();
    }

    public String getHistoricalachievements() {
        return historicalachievements;
    }

    public void setHistoricalachievements(String historicalachievements) {
        this.historicalachievements = historicalachievements == null ? null : historicalachievements.trim();
    }

    public String getCheckstate() {
        return checkstate;
    }

    public void setCheckstate(String checkstate) {
        this.checkstate = checkstate == null ? null : checkstate.trim();
    }

    public String getCheckobjectid() {
        return checkobjectid;
    }

    public void setCheckobjectid(String checkobjectid) {
        this.checkobjectid = checkobjectid == null ? null : checkobjectid.trim();
    }

    public String getIsusercheck() {
        return isusercheck;
    }

    public void setIsusercheck(String isusercheck) {
        this.isusercheck = isusercheck == null ? null : isusercheck.trim();
    }

    public String getCheckorder() {
        return checkorder;
    }

    public void setCheckorder(String checkorder) {
        this.checkorder = checkorder == null ? null : checkorder.trim();
    }

    public String getCheckgroupid() {
        return checkgroupid;
    }

    public void setCheckgroupid(String checkgroupid) {
        this.checkgroupid = checkgroupid == null ? null : checkgroupid.trim();
    }

    public String getRemarks1() {
        return remarks1;
    }

    public void setRemarks1(String remarks1) {
        this.remarks1 = remarks1 == null ? null : remarks1.trim();
    }

    public String getRemarks2() {
        return remarks2;
    }

    public void setRemarks2(String remarks2) {
        this.remarks2 = remarks2 == null ? null : remarks2.trim();
    }

    public String getRemarks3() {
        return remarks3;
    }

    public void setRemarks3(String remarks3) {
        this.remarks3 = remarks3 == null ? null : remarks3.trim();
    }

    public String getRemarks4() {
        return remarks4;
    }

    public void setRemarks4(String remarks4) {
        this.remarks4 = remarks4 == null ? null : remarks4.trim();
    }

    public String getRemarks5() {
        return remarks5;
    }

    public void setRemarks5(String remarks5) {
        this.remarks5 = remarks5 == null ? null : remarks5.trim();
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

    public String getSavedate() {
        return savedate;
    }

    public void setSavedate(String savedate) {
        this.savedate = savedate;
    }

	public String getUserNames() {
		return userNames;
	}

	public void setUserNames(String userNames) {
		this.userNames = userNames;
	}
    
    
    
}