package com.saint.wechat.manager.services.impl;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.saint.pub.services.imp.MessageUtil;
import com.saint.wechat.manager.services.IWeichatService;
import com.saint.wechat.service.BaseService;

public class WeichatServiceImpl implements IWeichatService{
	 
	private BaseService textservice;
	
	private BaseService imageservice;
	
	private BaseService videoservice;
	
	private BaseService voiceservice;
	
	private BaseService eventservice;
	
	public void setEventservice(BaseService eventservice) {
		this.eventservice = eventservice;
	}

	public void setTextservice(BaseService textservice) {
		this.textservice = textservice;
	}

	public void setImageservice(BaseService imageservice) {
		this.imageservice = imageservice;
	}

	public void setVideoservice(BaseService videoservice) {
		this.videoservice = videoservice;
	}

	public void setVoiceservice(BaseService voiceservice) {
		this.voiceservice = voiceservice;
	}

	public String processRequest(Map<String, String> requestmap,String clientsxh,HttpServletRequest request,String openid,String wxtype){
		 String respMessage = null;  
         String msgType = requestmap.get("MsgType");   // 消息类型 msgtype
         if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) 
        	 respMessage = textservice.service(requestmap,clientsxh,request,openid,wxtype);
         else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT))
        	 respMessage = eventservice.service(requestmap,clientsxh,request,openid,wxtype);
         else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE))
        	 respMessage = imageservice.service(requestmap,clientsxh,request,openid,wxtype);
         else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VIDEO))
        	 respMessage = videoservice.service(requestmap,clientsxh,request,openid,wxtype);
         else if(msgType.equals(MessageUtil.RESP_MESSAGE_TYPE_VOICE))
        	 respMessage = voiceservice.service(requestmap,clientsxh,request,openid,wxtype);
		 return respMessage;
	 }

}
