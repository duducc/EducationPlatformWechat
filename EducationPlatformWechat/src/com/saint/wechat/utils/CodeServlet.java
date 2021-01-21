package com.saint.wechat.utils;

import java.io.IOException;  

import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
public class CodeServlet extends HttpServlet {  
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {  
    	try {
			String text = "http://pb6ib3.natappfree.cc/EducationPlatformWechat/index.do?method=init&sxh=6300001001";
			QRCodeUtil.encode(text, "E:/worksprace_2015/EducationPlatformWechat/WebRoot/images/service/ywq_057.jpg", true,response);
    	} catch (Exception e) {
			e.printStackTrace();
		}
    }  
}
