package com.saint.wechat.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import net.sf.json.JSONObject;

import com.saint.wechat.pojo.Menu;
class TrustAnyTrustManager implements X509TrustManager {
    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {    }
    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {    }
    public X509Certificate[] getAcceptedIssuers() {        return new X509Certificate[]{};    }} 
 class TrustAnyHostnameVerifier implements HostnameVerifier {
    public boolean verify(String hostname, SSLSession session) {
        return true;
    }
}   
public class WxAPIUtils {
	
	
	private final static String access_token_url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
	private final static String jsapi_ticket_url = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=ACCESS_TOKEN&type=jsapi";
	private final static String auth_url="https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=APPSECRET&code=CODE&grant_type=authorization_code";
	private final static String menu_create_url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
	public static final String PATH_TEMPLATEMSG="https://api.weixin.qq.com/cgi-bin/message/template/send?access_token={ACCESS_TOKEN}";
	public static int createMenu(Menu menu,String token){
		int result=0;
		String url=menu_create_url.replace("ACCESS_TOKEN",token);
		String jsonmenu=JSONObject.fromObject(menu).toString();
		JSONObject jsonObject=httpRequest(url,"POST",jsonmenu);
		if(null!=jsonObject){
			if(0!=jsonObject.getInt("errcode")){
				result=jsonObject.getInt("errcode");
			}
		}
		return result;
	}
	
	
	
	/**
	 * @author Lgg
	 * 获取access_token
	 * @return
	 */
	public static String getAccess_token(String APPID,String APPSECRET){
		String url=access_token_url.replace("APPID", APPID).replace("APPSECRET",APPSECRET);		
    	JSONObject jsonObject = httpRequest(url, "GET", null);
		return jsonObject.getString("access_token");
    }
	
	/**
	 * @author Lgg
	 * 获取Jsapi_ticket
	 * @return
	 */
	public static String getJsapi_ticket(String access_token){		
		String url=jsapi_ticket_url.replace("ACCESS_TOKEN",access_token);		
		JSONObject jsonObject = httpRequest(url, "GET", null);
		return jsonObject.getString("ticket");
    }
	
	
	
	public static String getAuthOPenid(String APPID,String APPSECRET,String code){		
		String url=auth_url.replace("APPID", APPID).replace("APPSECRET",APPSECRET).replace("CODE", code);
		JSONObject jsonObject = httpRequest(url, "GET", null);
		return jsonObject.getString("openid");
    }
	
	//该方法的作用为获取连接
	public static JSONObject httpRequest(String requestUrl, String requestMethod, String outputStr) {
		JSONObject jsonObject = null;  
        StringBuffer buffer = new StringBuffer();  
        try { 
        	// 此接口的实例管理使用哪一个 X509 证书来验证远端的安全套接字。
        	//生成一个证书
            TrustManager[] tm = { new TrustAnyTrustManager() };  
            //SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE"); 
            SSLContext sslContext = SSLContext.getInstance("TLS");//以TLS进行传输 
            /*
             * 初始化SSL环境。第二个参数是告诉JSSE使用的可信任证书的来源，
             * 设置为null是从javax.net.ssl.trustStore中获得证书。
             * 第三个参数是JSSE生成的随机数，这个参数将影响系统的安全性，
             * 设置为null是个好选择，可以保证JSSE的安全性。
             */
            sslContext.init(null, tm, new java.security.SecureRandom()); 
            // 从上述SSLContext对象中得到SSLSocketFactory对象
            SSLSocketFactory ssf = sslContext.getSocketFactory();  
            //需要连接的url地址 
            URL url = new URL(requestUrl); 
            //要发送的post请求的形式
            HttpsURLConnection httpUrlConn = (HttpsURLConnection) url.openConnection();  
            //设置套接工厂 
            httpUrlConn.setSSLSocketFactory(ssf);  
            //添加数据
            httpUrlConn.setDoOutput(true);  
            httpUrlConn.setDoInput(true);  
            httpUrlConn.setUseCaches(false);  
            httpUrlConn.setRequestMethod(requestMethod);  
  
            if ("GET".equalsIgnoreCase(requestMethod))  
                httpUrlConn.connect(); //如果是get请求方式,直接连接 
  
            if (null != outputStr) {
            	//获取输出流 
                OutputStream outputStream = httpUrlConn.getOutputStream();
                //写出
                outputStream.write(outputStr.getBytes("UTF-8"));  
                outputStream.close();  
            }  
            //获取输入流
            InputStream inputStream = httpUrlConn.getInputStream();  
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");  
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  
  
            String str = null;  
            while ((str = bufferedReader.readLine()) != null) {  
                buffer.append(str);  
            }  
            bufferedReader.close();  
            inputStreamReader.close();  
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
	 * @param jsapi_ticket
	 * @return
	 */
	public static Map<String, String> sign(String jsapi_ticket, String url,String appId) {
        Map<String, String> ret = new HashMap<String, String>();
        String nonce_str = create_nonce_str();
        String timestamp = create_timestamp();
        String string1;
        String signature = "";

        //注意这里参数名必须全部小写，且必须有序
        string1 = "jsapi_ticket=" + jsapi_ticket +
                  "&noncestr=" + nonce_str +
                  "&timestamp=" + timestamp +
                  "&url=" + url;
        System.out.println(string1);

        try
        {
            MessageDigest crypt = MessageDigest.getInstance("SHA-1");
            crypt.reset();
            crypt.update(string1.getBytes("UTF-8"));
            signature = byteToHex(crypt.digest());
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }

        ret.put("url", url);
        ret.put("jsapi_ticket", jsapi_ticket);
        ret.put("nonceStr", nonce_str);
        ret.put("timestamp", timestamp);
        ret.put("signature", signature);
        ret.put("appId",appId);
        return ret;
    }

    private static String byteToHex(final byte[] hash) {
        Formatter formatter = new Formatter();
        for (byte b : hash)
        {
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }

    private static String create_nonce_str() {
        return UUID.randomUUID().toString();
    }

    private static String create_timestamp() {
        return Long.toString(System.currentTimeMillis() / 1000);
    }
	
	public static void main(String[] args) {
	
	}
	
}
