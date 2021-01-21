package com.saint.teaching.bean;

import java.util.List;

public class JxStudentsSignListEntity {
	
	private List<JxStudentsSignEntity> List;
    
    private JxStudentsSignEntity entity ; 
    
    private int totalProgress ;
    
    private String xh;
    
	public JxStudentsSignListEntity() {
	}

	public List<JxStudentsSignEntity> getList() {
		return List;
	}

	public void setList(List<JxStudentsSignEntity> list) {
		List = list;
	}

	public JxStudentsSignEntity getEntity() {
		return entity;
	}

	public void setEntity(JxStudentsSignEntity entity) {
		this.entity = entity;
	}

	public int getTotalProgress() {
		return totalProgress;
	}

	public void setTotalProgress(int totalProgress) {
		this.totalProgress = totalProgress;
	}

	public String getXh() {
		return xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	
}
