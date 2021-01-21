package com.saint.wechat.pojo;


/** 
 * 复杂按钮(父按钮)
 *  一级菜单数组，个数应为1~3个  
 * @author qindan 
 * @date 2013-11-11
 */ 
public class ComplexButton extends Button {
	private Button[] sub_button;  
	private String name; 
    public Button[] getSub_button() {  
        return sub_button;  
    }  
    public void setSub_button(Button[] sub_button) {  
        this.sub_button = sub_button;  
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
    
}
