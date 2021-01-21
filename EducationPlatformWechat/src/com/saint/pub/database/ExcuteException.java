package com.saint.pub.database;


@SuppressWarnings("serial")
public class ExcuteException extends RuntimeException{
	private ExcuteResult excuteResult;
	public ExcuteException(String expMsg){
		super(expMsg);
		this.excuteResult=new ExcuteResult("-1","操作执行异常。",expMsg);
	}
	public ExcuteException(int code,String expMsg){
		super(expMsg);
		this.excuteResult=new ExcuteResult(String.valueOf(code),"操作执行异常。",expMsg);
    }
	public ExcuteResult getExcuteResult() {
		return excuteResult;
	}
	public void setExcuteResult(ExcuteResult excuteResult) {
		this.excuteResult = excuteResult;
	}  
}