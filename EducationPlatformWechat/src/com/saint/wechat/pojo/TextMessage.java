package com.saint.wechat.pojo;


/**
 * 
 * @author zad
 *
 */
public class TextMessage extends BaseMessage {  
   
    private String Content;   //文本消息内容  
    //private String MsgId;   //消息id，64位整型  
    public String getContent() {  
        return Content;  
    }  
  
    public void setContent(String content) {  
        Content = content;  
    } 
}
