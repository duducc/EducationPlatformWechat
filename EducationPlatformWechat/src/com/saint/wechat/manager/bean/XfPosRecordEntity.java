package com.saint.wechat.manager.bean;

public class XfPosRecordEntity {
	private String id;
	private String course_id;
	private String emp_number;
	private String dept_id;
	private String daka_time;
	private String add_year;
	private String add_time;
	private String isvalid;
	private String isgrant;
	public XfPosRecordEntity(){
		
	}
	public XfPosRecordEntity(String id, String course_id, String emp_number,
			String dept_id, String daka_time, String add_year, String add_time,
			String isvalid, String isgrant) {
		super();
		this.id = id;
		this.course_id = course_id;
		this.emp_number = emp_number;
		this.dept_id = dept_id;
		this.daka_time = daka_time;
		this.add_year = add_year;
		this.add_time = add_time;
		this.isvalid = isvalid;
		this.isgrant = isgrant;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getEmp_number() {
		return emp_number;
	}
	public void setEmp_number(String emp_number) {
		this.emp_number = emp_number;
	}
	public String getDept_id() {
		return dept_id;
	}
	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}
	public String getDaka_time() {
		return daka_time;
	}
	public void setDaka_time(String daka_time) {
		this.daka_time = daka_time;
	}
	public String getAdd_year() {
		return add_year;
	}
	public void setAdd_year(String add_year) {
		this.add_year = add_year;
	}
	public String getAdd_time() {
		return add_time;
	}
	public void setAdd_time(String add_time) {
		this.add_time = add_time;
	}
	public String getIsvalid() {
		return isvalid;
	}
	public void setIsvalid(String isvalid) {
		this.isvalid = isvalid;
	}
	public String getIsgrant() {
		return isgrant;
	}
	public void setIsgrant(String isgrant) {
		this.isgrant = isgrant;
	}
	
}
