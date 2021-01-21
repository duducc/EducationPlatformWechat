package com.saint.pub.database;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ExcuteResult implements Serializable{
	private String returnCode;
	private String returnMessage;
	private String excepMessage;
	public ExcuteResult(){}
	
	public ExcuteResult(String returnCode,String returnMessage){
		this.returnCode=returnCode;
		this.returnMessage=returnMessage;
	}
	public ExcuteResult(String returnCode,String returnMessage,String excepMessage){
		this.returnCode=returnCode;
		this.returnMessage=returnMessage;
		this.excepMessage=excepMessage;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnMessage() {
		return returnMessage;
	}
	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}
	public String getExcepMessage() {
		return excepMessage;
	}
	public void setExcepMessage(String excepMessage) {
		this.excepMessage = excepMessage;
	}
}
