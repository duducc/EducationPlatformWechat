package com.saint.wechat.utils;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saint.wechat.manager.bean.SendtMsgEntity;
import com.saint.wechat.manager.bean.SysTmptmsg;
public class Toweixin {
	//private static ProcessResultImpl processResultImpl;
	public static void sendtmsg(HttpServletRequest request, HttpServletResponse response,SendtMsgEntity entity,SysTmptmsg msg){
    	//UserSession userSession = (UserSession)request.getSession().getAttribute("userSession");
    	URL url;
    	PrintWriter printOut = null;
		try {
			printOut = response.getWriter();
			url = new URL(msg.getServer().replaceAll("&amp;","&"));
			System.out.println(url);
			//url = new URL("http://192.168.0.39/plgaWeichat/tmptmsg.do?method=sendtmsg");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();// 此时cnnection只是为一个连接对象,待连接中
	        connection.setDoOutput(true);//设置连接输出流为true,默认false (post 请求是以流的方式隐式的传递参数)
	        connection.setDoInput(true);//设置连接输入流为true
	        connection.setRequestMethod("POST");//设置请求方式为post
	        connection.setUseCaches(false);//post请求缓存设为false
	        connection.setInstanceFollowRedirects(true);// 设置该HttpURLConnection实例是否自动执行重定向
	        // 设置请求头里面的各个属性 (以下为设置内容的类型,设置为经过urlEncoded编码过的from参数)
	        // application/x-javascript text/xml->xml数据 application/x-javascript->json对象 application/x-www-form-urlencoded->表单数据
	        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
	        
	        // 建立连接 (请求未开始,直到connection.getInputStream()方法调用时才发起,以上各个参数设置需在此方法之前进行)
	        connection.connect();
	        // 创建输入输出流,用于往连接里面输出携带的参数,(输出内容为?后面的内容)
	        DataOutputStream out = new DataOutputStream(connection.getOutputStream());
	        StringBuffer parm = new StringBuffer();
	        parm.append("&xh="+URLEncoder.encode(entity.getXh(), "utf-8"));
	        parm.append("&first="+URLEncoder.encode(entity.getFirst(), "utf-8"));
	        parm.append("&keyword1="+URLEncoder.encode(entity.getKeyword1(), "utf-8"));
	        parm.append("&keyword2="+URLEncoder.encode(entity.getKeyword2(), "utf-8"));
	        parm.append("&remark="+URLEncoder.encode(entity.getRemark(), "utf-8"));
	        parm.append("&url="+URLEncoder.encode(entity.getUrl(), "utf-8"));       
	        System.out.println(entity.getKeyword2());
	        System.out.println(entity.getTouser());
	        parm.append("&touser="+URLEncoder.encode(entity.getTouser(), "utf-8"));
	        out.writeBytes(parm.toString().replaceAll("&amp;","&"));// 将参数输出到连接
	        out.flush();// 输出完成后刷新并关闭流
	        out.close(); // 重要且易忽略步骤 (关闭流,切记!) 
	        // 连接发起请求,处理服务器响应  (从连接获取到输入流并包装为bufferedReader)
	       InputStream inputStream = connection.getInputStream();
	       BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
           StringBuffer sb = new StringBuffer();
           String str = "";
           while ((str = reader.readLine()) != null)
           {
               sb.append(str).append("\n");
           }
           System.out.println(sb.toString());
          /* if(sb.toString().indexOf("errcode")>0){
        	   JSONObject jsStr = JSONObject.fromObject(sb.toString());
        	   if("0".equals(jsStr.get("errcode").toString())){
    	    	   //processResultImpl.processScript("parent.showProcessMessage('消息推送成功！','info')",printOut);
    	       }else{
    	    	   //processResultImpl.processScript("parent.showProcessMessage('消息推送失败！','info')",printOut);
    	       }
           }else{
        	   System.out.println(sb.toString());
           }*/
           
           
           /*JSONObject jsStr = JSONObject.fromObject(sb.toString());
	       System.out.println(jsStr); // {"c":"d","a":"b"}  
	       if("0".equals(jsStr.get("errcode").toString())){
	    	   //processResultImpl.processScript("parent.showProcessMessage('消息推送成功！','info')",printOut);
	       }else{
	    	   //processResultImpl.processScript("parent.showProcessMessage('消息推送失败！','info')",printOut);
	       }*/
	       inputStream.close();    // 重要且易忽略步骤 (关闭流,切记!) 
	       connection.disconnect(); // 销毁连接
		} catch (Exception e) {
			//processResultImpl.processScript("parent.showProcessMessage('消息推送异常！','error')",printOut);
			e.printStackTrace();
		}
    }

	
}
