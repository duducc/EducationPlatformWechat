package com.saint.wechat.utils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Blob;

public class HTMLHelper {
	public static String getOneHtml(final String htmlurl,String encode) throws Exception   
	{   
	  URL url;   
	  String temp;   
	  final StringBuffer sb = new StringBuffer();   
	  try  
	  {   
	   url = new URL(htmlurl);   
	   URLConnection con=url.openConnection();
	   int timeout=15000;
	   con.setConnectTimeout(timeout);
	   con.setReadTimeout(timeout);
	   final BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), encode));// 读取网页全部内容   
	   while ((temp = in.readLine()) != null)   
	   {   
	    sb.append(temp);
	   }   
	   in.close();   
	  }   
	  catch (final MalformedURLException me)   
	  {   
	   System.out.println("你输入的URL格式有问题！请仔细输入");   
	   me.getMessage();   
	   throw me;   
	  }   
	  catch (final IOException e)   
	  {   
		  //System.out.println("IO异常");
	   //e.printStackTrace();   
	   throw e;   
	  }  
	  catch (final Exception e)   
	  {   
		  //System.out.println("其他异常");
	   //e.printStackTrace();   
	   throw e;   
	  } 
	  return sb.toString();   
	 }
	public static String ReplaceMark(String str) {

		if (null == str || 0 == str.length()) {
			return "";
		}
		String hSymbol = "!\"#$%&'()*+,./:;<=>?@[\\]^_`{|}-~";
		String zSymbol = "！”＃＄％＆’（）＊＋，．／：；＜＝＞？＠［￥］＾＿‘｛｜｝－～";
		String tmp = str;
		for (int i = 0; i < hSymbol.length(); i++) {
			tmp = tmp.replace(hSymbol.charAt(i), zSymbol.charAt(i));
		}
		StringBuffer sb = new StringBuffer(tmp);
		return sb.toString();
	}
	public static byte[] fileToBlob(String fileurl) throws Exception{
		BufferedInputStream bis = null;
    	HttpURLConnection httpUrl = null;
    	URL url = null;
    	//建立链接
   	    url = new URL(fileurl);
    	httpUrl = (HttpURLConnection) url.openConnection();
    	httpUrl.setUseCaches(false);//不使用缓存
    	//连接指定的资源
    	httpUrl.connect();
    	//获取网络输入流
    	bis = new BufferedInputStream(httpUrl.getInputStream());
    	ByteArrayOutputStream out = new ByteArrayOutputStream(1000);  
        byte[] b = new byte[1000];  
        int n;  
        while ((n = bis.read(b)) != -1)  
            out.write(b, 0, n);  
        bis.close();  
        out.close();
        byte [] bys = out.toByteArray();
    	httpUrl.disconnect();
    	return bys;
	}
	   public static byte[] blobToBytes(Blob blob) throws IOException {
	        BufferedInputStream is = null;
	        byte[] bytes = null;
	        try {
	            is = new BufferedInputStream(blob.getBinaryStream());
	            bytes = new byte[(int) blob.length()];
	            int len = bytes.length;
	            int offset = 0;
	            int read = 0;
	            while (offset < len
	                    && (read = is.read(bytes, offset, len - offset)) >= 0) {
	                offset += read;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }finally{
	        	is.close();
	        }
	        return bytes;
	    }

}
