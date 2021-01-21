package com.saint.pub;

/**
 * 从是数据库 读取 二进制文件
 * @author gss
 *
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;


public class  ReadPicByBinary {
	public static OutputStream readBinary(HttpServletResponse response,byte[] bs) throws Exception {
		OutputStream outputSream = null;
		
		try {
		    outputSream = response.getOutputStream();
		    InputStream in = new ByteArrayInputStream(bs);
			int len = 0;
			byte[] buf = new byte[1024];
			while ((len = in.read(buf, 0, 1024)) != -1) {
			    outputSream.write(buf, 0, len);
			}
		} catch (IOException e) {
		    
		    e.printStackTrace();
		} finally{
		    outputSream.close();
		}
		return outputSream;

	}

	
		
	}

