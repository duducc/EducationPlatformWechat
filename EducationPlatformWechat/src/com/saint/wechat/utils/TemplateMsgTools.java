package com.saint.wechat.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import net.sf.json.JSONObject;

import com.saint.wechat.pojo.Template;
import com.saint.wechat.pojo.TemplateItem;

class MyX509TrustManager implements X509TrustManager {
    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {    }
    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {    }
    public X509Certificate[] getAcceptedIssuers() {        return new X509Certificate[]{};    }} 
 	class AnyHostnameVerifier implements HostnameVerifier {
    public boolean verify(String hostname, SSLSession session) {
        return true;
    }
} 

public class TemplateMsgTools {

	
	
	public static JSONObject httpRequest(String requestUrl, String requestMethod, String outputStr) {
		JSONObject jsonObject = null;
		StringBuffer buffer = new StringBuffer();
		try {
			// ����SSLContext���󣬲�ʹ������ָ�������ι�������ʼ��
			TrustManager[] tm = { new MyX509TrustManager() };
			SSLContext sslContext = SSLContext.getInstance("TLS");
			sslContext.init(null, tm, new java.security.SecureRandom());
			// ������SSLContext�����еõ�SSLSocketFactory����
			SSLSocketFactory ssf = sslContext.getSocketFactory();

			URL url = new URL(requestUrl);
			HttpsURLConnection httpUrlConn = (HttpsURLConnection) url.openConnection();
			httpUrlConn.setSSLSocketFactory(ssf);

			httpUrlConn.setDoOutput(true);
			httpUrlConn.setDoInput(true);
			httpUrlConn.setUseCaches(false);
			// ��������ʽ��GET/POST��
			httpUrlConn.setRequestMethod(requestMethod);

			if ("GET".equalsIgnoreCase(requestMethod))
				httpUrlConn.connect();

			// ����������Ҫ�ύʱ
			if (null != outputStr) {
				OutputStream outputStream = httpUrlConn.getOutputStream();
				// ע������ʽ����ֹ��������
				outputStream.write(outputStr.getBytes("utf-8"));
				outputStream.close();
			}

			// �����ص�������ת�����ַ���
			InputStream inputStream = httpUrlConn.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				buffer.append(str);
			}
			bufferedReader.close();
			inputStreamReader.close();
			// �ͷ���Դ
			inputStream.close();
			inputStream = null;
			httpUrlConn.disconnect();
			jsonObject = JSONObject.fromObject(buffer.toString());
		} catch (ConnectException ce) {
			ce.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonObject;
	}
	
	/**
	 * @author Lgg
	 * ģ����Ϣ����
	 * @param toUser
	 * @param url
	 * @param tempid
	 * @param topcolor
	 * @param map
	 * @param token
	 * @return
	 */
	public static String sendTmptMsg(String toUser,String url,String tempid,String topcolor,Map<String,TemplateItem> map,String token) {
		Template t=new Template();
		t.setTouser(toUser);
		t.setUrl(url);
		t.setTemplate_id(tempid);
		t.setTopcolor(topcolor);
		t.setData(map);
		String requestUrl=WxAPIUtils.PATH_TEMPLATEMSG.replace("{ACCESS_TOKEN}", token);		
		System.out.println(JSONObject.fromObject(t).toString());
		JSONObject jsonObject=TemplateMsgTools.httpRequest(requestUrl, "POST", JSONObject.fromObject(t).toString());
		System.out.println(jsonObject.toString());
		return jsonObject.toString();
	}
}
