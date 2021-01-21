package com.saint.wechat.manager.bean;

public class XfDeptEntity {
	private String id;
	private String name;
	private String code;
	private String pid;
	private String addres;
	private String zipcode;
	private String type;
	private String grade;
	private String seq;
	private String status;
	private String remark;
	
	public XfDeptEntity(){
		
	}
	public XfDeptEntity(String id, String name, String code, String pid,
			String addres, String zipcode, String type, String grade,
			String seq, String status, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.pid = pid;
		this.addres = addres;
		this.zipcode = zipcode;
		this.type = type;
		this.grade = grade;
		this.seq = seq;
		this.status = status;
		this.remark = remark;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
