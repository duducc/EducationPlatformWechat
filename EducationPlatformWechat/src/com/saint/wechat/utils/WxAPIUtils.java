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
	 * ��ȡaccess_token
	 * @return
	 */
	public static String getAccess_token(String APPID,String APPSECRET){
		String url=access_token_url.replace("APPID", APPID).replace("APPSECRET",APPSECRET);		
    	JSONObject jsonObject = httpRequest(url, "GET", null);
		return jsonObject.getString("access_token");
    }
	
	/**
	 * @author Lgg
	 * ��ȡJsapi_ticket
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
	
	//�÷���������Ϊ��ȡ����
	public static JSONObject httpRequest(String requestUrl, String requestMethod, String outputStr) {
		JSONObject jsonObject = null;  
        StringBuffer buffer = new StringBuffer();  
        try { 
        	// �˽ӿڵ�ʵ������ʹ����һ�� X509 ֤������֤Զ�˵İ�ȫ�׽��֡�
        	//����һ��֤��
            TrustManager[] tm = { new TrustAnyTrustManager() };  
            //SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE"); 
            SSLContext sslContext = SSLContext.getInstance("TLS");//��TLS���д��� 
            /*
             * ��ʼ��SSL�������ڶ��������Ǹ���JSSEʹ�õĿ�����֤�����Դ��
             * ����Ϊnull�Ǵ�javax.net.ssl.trustStore�л��֤�顣
             * ������������JSSE���ɵ�����������������Ӱ��ϵͳ�İ�ȫ�ԣ�
             * ����Ϊnull�Ǹ���ѡ�񣬿��Ա�֤JSSE�İ�ȫ�ԡ�
             */
            sslContext.init(null, tm, new java.security.SecureRandom()); 
            // ������SSLContext�����еõ�SSLSocketFactory����
            SSLSocketFactory ssf = sslContext.getSocketFactory();  
            //��Ҫ���ӵ�url��ַ 
            URL url = new URL(requestUrl); 
            //Ҫ���͵�post�������ʽ
            HttpsURLConnection httpUrlConn = (HttpsURLConnection) url.openConnection();  
            //�����׽ӹ��� 
            httpUrlConn.setSSLSocketFactory(ssf);  
            //�������
            httpUrlConn.setDoOutput(true);  
            httpUrlConn.setDoInput(true);  
            httpUrlConn.setUseCaches(false);  
            httpUrlConn.setRequestMethod(requestMethod);  
  
            if ("GET".equalsIgnoreCase(requestMethod))  
                httpUrlConn.connect(); //�����get����ʽ,ֱ������ 
  
            if (null != outputStr) {
            	//��ȡ����� 
                OutputStream outputStream = httpUrlConn.getOutputStream();
                //д��
                outputStream.write(outputStr.getBytes("UTF-8"));  
                outputStream.close();  
            }  
            //��ȡ������
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

        //ע���������������ȫ��Сд���ұ�������
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
