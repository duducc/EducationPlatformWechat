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
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();// ��ʱcnnectionֻ��Ϊһ�����Ӷ���,��������
	        connection.setDoOutput(true);//�������������Ϊtrue,Ĭ��false (post �����������ķ�ʽ��ʽ�Ĵ��ݲ���)
	        connection.setDoInput(true);//��������������Ϊtrue
	        connection.setRequestMethod("POST");//��������ʽΪpost
	        connection.setUseCaches(false);//post���󻺴���Ϊfalse
	        connection.setInstanceFollowRedirects(true);// ���ø�HttpURLConnectionʵ���Ƿ��Զ�ִ���ض���
	        // ��������ͷ����ĸ������� (����Ϊ�������ݵ�����,����Ϊ����urlEncoded�������from����)
	        // application/x-javascript text/xml->xml���� application/x-javascript->json���� application/x-www-form-urlencoded->������
	        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
	        
	        // �������� (����δ��ʼ,ֱ��connection.getInputStream()��������ʱ�ŷ���,���ϸ��������������ڴ˷���֮ǰ����)
	        connection.connect();
	        // �������������,�����������������Я���Ĳ���,(�������Ϊ?���������)
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
	        out.writeBytes(parm.toString().replaceAll("&amp;","&"));// ���������������
	        out.flush();// �����ɺ�ˢ�²��ر���
	        out.close(); // ��Ҫ���׺��Բ��� (�ر���,�м�!) 
	        // ���ӷ�������,�����������Ӧ  (�����ӻ�ȡ������������װΪbufferedReader)
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
    	    	   //processResultImpl.processScript("parent.showProcessMessage('��Ϣ���ͳɹ���','info')",printOut);
    	       }else{
    	    	   //processResultImpl.processScript("parent.showProcessMessage('��Ϣ����ʧ�ܣ�','info')",printOut);
    	       }
           }else{
        	   System.out.println(sb.toString());
           }*/
           
           
           /*JSONObject jsStr = JSONObject.fromObject(sb.toString());
	       System.out.println(jsStr); // {"c":"d","a":"b"}  
	       if("0".equals(jsStr.get("errcode").toString())){
	    	   //processResultImpl.processScript("parent.showProcessMessage('��Ϣ���ͳɹ���','info')",printOut);
	       }else{
	    	   //processResultImpl.processScript("parent.showProcessMessage('��Ϣ����ʧ�ܣ�','info')",printOut);
	       }*/
	       inputStream.close();    // ��Ҫ���׺��Բ��� (�ر���,�м�!) 
	       connection.disconnect(); // ��������
		} catch (Exception e) {
			//processResultImpl.processScript("parent.showProcessMessage('��Ϣ�����쳣��','error')",printOut);
			e.printStackTrace();
		}
    }

	
}
