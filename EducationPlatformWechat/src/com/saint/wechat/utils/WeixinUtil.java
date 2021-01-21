package com.saint.wechat.utils;

import net.sf.json.JSONObject;

import com.saint.wechat.utils.oConvertUtils;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.servlet.http.HttpServletRequest;

import java.io.*;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;


public class WeixinUtil {

    // ��ȡaccess_token�Ľӿڵ�ַ��GET�� ��200����/�죩
    public final static String access_token_url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
    // �˵�������POST�� ��100����/�죩
    public static String menu_create_url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
    //�ͷ��ӿڵ�ַ
    public static String send_message_url = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=ACCESS_TOKEN";
    //������ά��ticket����
    public static String qrcode_ticket_url = "https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token=ACCESS_TOKEN";
    //ͨ��ticket��ȡ��ά��
    public static String get_qrcode_url =  "https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket=TICKET";
    //΢����ҳ��Ȩ��ȡCODE
    public static String web_oauth_url = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE&state=STATE#wechat_redirect";
    //΢����ҳ��Ȩ��ȡ��ҳaccesstoken��OPENID
    public static String web_oauth_accesstoken_url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";
    //΢����ҳ��Ȩ��ȡ�û���Ϣ
    public static String web_oauth_userinfo_url = "https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID";
    //--��֤token�Ƿ���Ч------------------------------------------------------------------------
    //��ȡ΢�ŷ�����IP��ַ
    public static String get_callbackip_url = "https://api.weixin.qq.com/cgi-bin/getcallbackip?access_token=ACCESS_TOKEN";
    //--��֤token�Ƿ���Ч------------------------------------------------------------------------
    // jsapi���ýӿ���ʱƾ֤�Ľӿڵ�ַ��GET�� ��200����/�죩
    public final static String jsapi_ticket_url = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=ACCESS_TOKEN&type=jsapi";


    /**
     * ����https���󲢻�ȡ���
     *
     * @param requestUrl �����ַ
     * @param requestMethod ����ʽ��GET��POST��
     * @param outputStr �ύ������
     * @return JSONObject(ͨ��JSONObject.get(key)�ķ�ʽ��ȡjson���������ֵ)
     */
    public static JSONObject httpRequest(String requestUrl, String requestMethod, String outputStr) {
        JSONObject jsonObject = null;
        StringBuffer buffer = new StringBuffer();
        try {
            // ����SSLContext���󣬲�ʹ������ָ�������ι�������ʼ��
            TrustManager[] tm = { new MyX509TrustManager() };
            SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
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
                outputStream.write(outputStr.getBytes("UTF-8"));
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
            //jsonObject = JSONObject.fromObject(buffer.toString());
        } catch (ConnectException ce) {
            
        } catch (Exception e) {
            
        }
        return jsonObject;
    }

    /**
     * ����https���󲢻�ȡ���
     *
     * @param requestUrl �����ַ
     * @param requestMethod ����ʽ��GET��POST��
     * @param outputStr �ύ������
     * @return JSONObject(ͨ��JSONObject.get(key)�ķ�ʽ��ȡjson���������ֵ)
     */
    public static String httpCommonRequest(String requestUrl, String requestMethod, String outputStr) {
        StringBuffer buffer = new StringBuffer();
        try {
            // ����SSLContext���󣬲�ʹ������ָ�������ι�������ʼ��
            TrustManager[] tm = { new MyX509TrustManager() };
            SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
            sslContext.init(null, tm, new java.security.SecureRandom());
            // ������SSLContext�����еõ�SSLSocketFactory����
            SSLSocketFactory ssf = sslContext.getSocketFactory();

            URL url = new URL(requestUrl);
            HttpURLConnection httpUrlConn = (HttpURLConnection) url.openConnection();

            //HttpURLConnection�������糬ʱ
            httpUrlConn.setConnectTimeout(4500);
            httpUrlConn.setReadTimeout(4500);

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
                outputStream.write(outputStr.getBytes("UTF-8"));
                outputStream.close();
            }

            // �����ص�������ת�����ַ���
            InputStream inputStream = httpUrlConn.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                if(oConvertUtils.isNotEmpty(str) && oConvertUtils.isNotEmpty(str.trim()) && !" ".equals(str)){
                    str = str.trim() + "\n";
                    buffer.append(str);
                }
            }
            bufferedReader.close();
            inputStreamReader.close();
            // �ͷ���Դ
            inputStream.close();
            inputStream = null;
            httpUrlConn.disconnect();
            ;
            //jsonObject = JSONObject.fromObject(buffer.toString());
        } catch (ConnectException ce) {
            
        } catch (Exception e) {
            
        }
        return buffer.toString().trim();
    }

    /**
     * ����HTTP��ȡ��ͼƬ�ļ�
     * @param requestUrl http��ַ
     * @param requestMethod
     * @param outputStr
     * @param target �洢·��
     */
    public static void saveHttpImage(String requestUrl, String requestMethod, String outputStr,File target) {
        //newһ��URL����
        try {
            URL url = new URL(requestUrl);
            //������
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            //��������ʽΪ"GET"
            conn.setRequestMethod(requestMethod);
            //��ʱ��Ӧʱ��Ϊ5��
            conn.setConnectTimeout(5 * 1000);
            //ͨ����������ȡͼƬ����
            InputStream inStream = conn.getInputStream();
            //�õ�ͼƬ�Ķ��������ݣ��Զ����Ʒ�װ�õ����ݣ�����ͨ����
            byte[] data = readInputStream(inStream);
            //���������
            FileOutputStream outStream = new FileOutputStream(target);
            //д������
            outStream.write(data);
            //�ر������
            outStream.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    /**
     * ����
     * @param bstr
     * @return String
     */
    public static String encode(byte[] bstr){
        return new sun.misc.BASE64Encoder().encode(bstr);
    }

    /**
     * ����
     * @param str
     * @return string
     */
    public static byte[] decode(String str){

        byte[] bt = null;
        try {
            sun.misc.BASE64Decoder decoder = new sun.misc.BASE64Decoder();
            bt = decoder.decodeBuffer( str );
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bt;

    }



    /**
     * �ϴ���ý���ļ�
     * @param fileType
     * @param filePath
     * @param token
     * @return
     */
    public static JSONObject sendMedia(String fileType,String filePath,String token) {
        String result = null;
        JSONObject jsonobject = new JSONObject();
        jsonobject = null;
        File file = new File(filePath);
        if(!file.exists()||!file.isFile()){
            jsonobject = null;
        
        }else{
            try{
                String requestUrl="http://file.api.weixin.qq.com/cgi-bin/media/upload?access_token="+ token + "&type="+fileType;
               
                URL urlObj = new URL(requestUrl);
                HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();
                con.setRequestMethod("POST"); // ��Post��ʽ�ύ����Ĭ��get��ʽ
                con.setDoInput(true);
                con.setDoOutput(true);
                con.setUseCaches(false); // post��ʽ����ʹ�û���
                con.setRequestProperty("Connection", "Keep-Alive");// ��������ͷ��Ϣ
                con.setRequestProperty("Charset", "UTF-8");
                String BOUNDARY = "----------" + System.currentTimeMillis();// ���ñ߽�
                con.setRequestProperty("Content-Type", "multipart/form-data; boundary="+ BOUNDARY);
                // ����������Ϣ
                // ��һ���֣�
                StringBuilder sb = new StringBuilder();
                sb.append("--"); // �����������
                sb.append(BOUNDARY);
                sb.append("\r\n");
                sb.append("Content-Disposition: form-data;name=\"file\";filename=\""+ file.getName() + "\"\r\n");
                sb.append("Content-Type:application/octet-stream\r\n\r\n");
                byte[] head = sb.toString().getBytes("utf-8");
                // ��������
                OutputStream out = new DataOutputStream(con.getOutputStream());
                // �����ͷ
                out.write(head);
                // �ļ����Ĳ���
                // ���ļ������ļ��ķ�ʽ ���뵽url��
                DataInputStream in = new DataInputStream(new FileInputStream(file));
                int bytes = 0;
                byte[] bufferOut = new byte[1024];
                while ((bytes = in.read(bufferOut)) != -1) {
                    out.write(bufferOut, 0, bytes);
                }
                in.close();
                // ��β����
                byte[] foot = ("\r\n--" + BOUNDARY + "--\r\n").getBytes("utf-8");// ����������ݷָ���
                out.write(foot);
                out.flush();
                out.close();
                StringBuffer buffer = new StringBuffer();
                BufferedReader reader = null;
                try {
                    // ����BufferedReader����������ȡURL����Ӧ
                    reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    String line = null;
                    while ((line = reader.readLine()) != null) {
                        buffer.append(line);
                    }
                    if(result==null){
                        result = buffer.toString();
                    }
                } catch (IOException e) {
                   
                    e.printStackTrace();
                    throw new IOException("���ݶ�ȡ�쳣");
                } finally {
                    if(reader!=null){
                        reader.close();
                    }
                }
                jsonobject = JSONObject.fromObject(result);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return jsonobject;
    }

    /**
     * �ϴ���ý���ļ�(����)
     * @param fileType
     * @param filePath
     * @param token
     * @return
     */
    public static JSONObject sendPermanentMedia(String fileType, String filePath, String token) {
        String result = null;
        JSONObject jsonobject = new JSONObject();
        jsonobject = null;
        File file = new File(filePath);
        if(!file.exists()||!file.isFile()){
            jsonobject = null;
   
        }else{
            try{
                String requestUrl="https://api.weixin.qq.com/cgi-bin/material/add_material?access_token="+ token+"&type="+fileType;
               
                URL urlObj = new URL(requestUrl);
                HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();
                con.setRequestMethod("POST"); // ��Post��ʽ�ύ����Ĭ��get��ʽ
                con.setDoInput(true);
                con.setDoOutput(true);
                con.setUseCaches(false); // post��ʽ����ʹ�û���
                con.setRequestProperty("Connection", "Keep-Alive");// ��������ͷ��Ϣ
                con.setRequestProperty("Charset", "UTF-8");
                String BOUNDARY = "----------" + System.currentTimeMillis();// ���ñ߽�
                con.setRequestProperty("Content-Type", "multipart/form-data; boundary="+ BOUNDARY);
                // ����������Ϣ
                // ��һ���֣�
                StringBuilder sb = new StringBuilder();
                sb.append("--"); // �����������
                sb.append(BOUNDARY);
                sb.append("\r\n");
                sb.append("Content-Disposition: form-data;name=\"media\";filename=\""+ file.getName() + "\"\r\n");
                sb.append("Content-Type:application/octet-stream\r\n\r\n");
                byte[] head = sb.toString().getBytes("utf-8");
                // ��������
                OutputStream out = new DataOutputStream(con.getOutputStream());
                // �����ͷ
                out.write(head);
                // �ļ����Ĳ���
                // ���ļ������ļ��ķ�ʽ ���뵽url��
                DataInputStream in = new DataInputStream(new FileInputStream(file));
                int bytes = 0;
                byte[] bufferOut = new byte[1024];
                while ((bytes = in.read(bufferOut)) != -1) {
                    out.write(bufferOut, 0, bytes);
                }
                in.close();
                // ��β����
                byte[] foot = ("\r\n--" + BOUNDARY + "--\r\n").getBytes("utf-8");// ����������ݷָ���
                out.write(foot);
                out.flush();
                out.close();
                StringBuffer buffer = new StringBuffer();
                BufferedReader reader = null;
                try {
                    // ����BufferedReader����������ȡURL����Ӧ
                    reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    String line = null;
                    while ((line = reader.readLine()) != null) {
                        buffer.append(line);
                    }
                    if(result==null){
                        result = buffer.toString();
                    }
                } catch (IOException e) {
                   
                    e.printStackTrace();
                    throw new IOException("���ݶ�ȡ�쳣");
                } finally {
                    if(reader!=null){
                        reader.close();
                    }
                }
                jsonobject = JSONObject.fromObject(result);
                jsonobject.put("created_at", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return jsonobject;



    }

    private static byte[] readInputStream(InputStream inStream) throws Exception {
        ByteArrayOutputStream outstream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024]; // ������װ
        int len = -1;
        while ((len = inStream.read(buffer)) != -1) {
            outstream.write(buffer, 0, len);
        }
        outstream.close();
        inStream.close();
        // �ر���һ��Ҫ�ǵá�
        return outstream.toByteArray();
    }

    /**
     * ��ȡRequest�����·����Ϣ ������
     * @param request
     * @return
     */
    public static String getRequestUrlWithParams(HttpServletRequest request){
        String backurl = request.getScheme()+"://"+request.getServerName()+request.getRequestURI()+"?"+request.getQueryString();
        return backurl;
    }


}
