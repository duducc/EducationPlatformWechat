package com.saint.wechat.pojo;

/** 
 * �Ӱ�ť(�����˵���ť)
 *  
 * @author qindan 
 * @date 2013-11-11 
 */ 
public class CommonButton extends Button {
    private String type;
	private String key;//click������ͱ���.

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}  
}
