package com.saint.wechat.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class TextServiceImpl extends BaseService {


	public String service(Map<String, String> resultmap,String clientsxh,HttpServletRequest request,String openid,String wxtype) {
		// TODO Auto-generated method stub
		String respMessage = null;
		String content = resultmap.get("Content");   // 消息内容
		String fromUserName = resultmap.get("FromUserName");//用户账号  
        String toUserName = resultmap.get("ToUserName");  // 公众帐号  
        content = null!=content.toLowerCase()?content:"";
        
       /* if(content.matches("^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$")){//警员认证
        	System.out.println("警员认证:"+content );
    		String result = getGzyhservice().JyrzInfo(content, fromUserName,clientsxh);
    		TextMessage textMessage = new TextMessage(); 
    		textMessage.setToUserName(fromUserName);  
            textMessage.setFromUserName(toUserName);  
            textMessage.setCreateTime(new Date().getTime());  
            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);
            textMessage.setContent(result);  
            respMessage =  MessageUtil.textMessageToXml(textMessage);
        	
        }else if("startgetbaseinfo".equals(content)){
        	String result = getGzyhservice().getwxuserbaseinfo();
        	TextMessage textMessage = new TextMessage(); 
    		textMessage.setToUserName(fromUserName);  
            textMessage.setFromUserName(toUserName);  
            textMessage.setCreateTime(new Date().getTime());  
            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
            textMessage.setContent("结果:"+result);  
            respMessage =  MessageUtil.textMessageToXml(textMessage);
        }else{
        	TextMessage textMessage = new TextMessage(); 
    		textMessage.setToUserName(fromUserName);  
            textMessage.setFromUserName(toUserName);  
            textMessage.setCreateTime(new Date().getTime());  
            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
            textMessage.setContent("输入了："+content);  
            respMessage =  MessageUtil.textMessageToXml(textMessage);
        }*/
		return respMessage;
	}

}
