package com.saint.wechat.pojo;


public class SendMessage {
	public SendMessage(String touser,String msgtype,SendMessageContent text){
		this.touser = touser;
		this.msgtype = msgtype;
		this.text = text;
	}
	private String touser;
	private String msgtype;// ��Ϣ���ͣ�event  
	private SendMessageContent text;
	public String getTouser() {
		return touser;
	}
	public void setTouser(String touser) {
		this.touser = touser;
	}
	public String getMsgtype() {
		return msgtype;
	}
	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}
	public SendMessageContent getText() {
		return text;
	}
	public void setText(SendMessageContent text) {
		this.text = text;
	}
}
