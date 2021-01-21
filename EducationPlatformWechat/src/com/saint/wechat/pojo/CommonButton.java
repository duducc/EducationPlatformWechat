package com.saint.wechat.pojo;

/** 
 * 子按钮(二级菜单按钮)
 *  
 * @author qindan 
 * @date 2013-11-11 
 */ 
public class CommonButton extends Button {
    private String type;
	private String key;//click点击类型必须.

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
