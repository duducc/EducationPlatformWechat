package com.saint.wechat.utils;


import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

public class WcTool {
	public static WebApplicationContext wc=ContextLoader.getCurrentWebApplicationContext();
	
	
}
