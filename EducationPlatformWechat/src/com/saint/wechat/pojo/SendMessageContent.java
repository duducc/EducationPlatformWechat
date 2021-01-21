package com.saint.wechat.pojo;

public class SendMessageContent {
	public SendMessageContent(String content){
		this.content = content;
	}
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
