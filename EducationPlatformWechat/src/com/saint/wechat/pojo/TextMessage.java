package com.saint.wechat.pojo;


/**
 * 
 * @author zad
 *
 */
public class TextMessage extends BaseMessage {  
   
    private String Content;   //�ı���Ϣ����  
    //private String MsgId;   //��Ϣid��64λ����  
    public String getContent() {  
        return Content;  
    }  
  
    public void setContent(String content) {  
        Content = content;  
    } 
}
