package com.saint.wechat.servicefactory;

import com.saint.wechat.service.BaseService;
import com.saint.wechat.service.EventServiceImpl;
import com.saint.wechat.service.ImageServiceImpl;
import com.saint.wechat.service.TextServiceImpl;
import com.saint.wechat.service.VideoServiceImpl;
import com.saint.wechat.service.VoiceServiceImpl;


public class WeichatServiceFactory {
	
	public BaseService createNewInstance(char arg){
		BaseService service = null;
		switch (arg) {
			case '1':
				service = new TextServiceImpl();
				break;
			case '2':
				service = new ImageServiceImpl();
				break;
			case '3':
				service = new EventServiceImpl();
				break;
			case '4':
				service = new VideoServiceImpl();
				break;
			case '5':
				service = new VoiceServiceImpl();
				break;
		}
		return service;
    }
}
