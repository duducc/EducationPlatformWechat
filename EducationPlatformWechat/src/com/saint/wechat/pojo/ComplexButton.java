package com.saint.wechat.pojo;


/** 
 * ���Ӱ�ť(����ť)
 *  һ���˵����飬����ӦΪ1~3��  
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
