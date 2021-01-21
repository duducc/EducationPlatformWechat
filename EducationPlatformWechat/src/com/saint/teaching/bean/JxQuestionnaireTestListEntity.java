package com.saint.teaching.bean;

import java.util.List;

public class JxQuestionnaireTestListEntity{
	
	private List<QueryandRecord> qrList;
    
    private JxQuestionnaireTestEntity test ; 
    
    private int totalProgress ;
    
	public JxQuestionnaireTestListEntity() {
	}

	public List<QueryandRecord> getQrList() {
		return qrList;
	}

	public void setQrList(List<QueryandRecord> qrList) {
		this.qrList = qrList;
	}

	public JxQuestionnaireTestEntity getTest() {
		return test;
	}

	public void setTest(JxQuestionnaireTestEntity test) {
		this.test = test;
	}

	public int getTotalProgress() {
		return totalProgress;
	}

	public void setTotalProgress(int totalProgress) {
		this.totalProgress = totalProgress;
	}

	
	

}