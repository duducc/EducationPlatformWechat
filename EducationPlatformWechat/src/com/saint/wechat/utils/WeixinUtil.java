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

    // 获取access_token的接口地址（GET） 限200（次/天）
    public final static String access_token_url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
    // 菜单创建（POST） 限100（次/天）
    public static String menu_create_url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
    //客服接口地址
    public static String send_message_url = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=ACCESS_TOKEN";
    //创建二维码ticket请求
    public static String qrcode_ticket_url = "https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token=ACCESS_TOKEN";
    //通过ticket换取二维码
    public static String get_qrcode_url =  "https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket=TICKET";
    //微信网页授权获取CODE
    public static String web_oauth_url = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE&state=STATE#wechat_redirect";
    //微信网页授权获取网页accesstoken和OPENID
    public static String web_oauth_accesstoken_url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";
    //微信网页授权获取用户信息
    public static String web_oauth_userinfo_url = "https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID";
    //--验证token是否有效------------------------------------------------------------------------
    //获取微信服务器IP地址
    public static String get_callbackip_url = "https://api.weixin.qq.com/cgi-bin/getcallbackip?access_token=ACCESS_TOKEN";
    //--验证token是否有效------------------------------------------------------------------------
    // jsapi调用接口临时凭证的接口地址（GET） 限200（次/天）
    public final static String jsapi_ticket_url = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=ACCESS_TOKEN&type=jsapi";


    /**
     * 发起https请求并获取结果
     *
     * @param requestUrl 请求地址
     * @param requestMethod 请求方式（GET、POST）
     * @param outputStr 提交的数据
     * @return JSONObject(通过JSONObject.get(key)的方式获取json对象的属性值)
     */
    public static JSONObject httpRequest(String requestUrl, String requestMethod, String outputStr) {
        JSONObject jsonObject = null;
        StringBuffer buffer = new StringBuffer();
        try {
            // 创建SSLContext对象，并使用我们指定的信任管理器初始化
            TrustManager[] tm = { new MyX509TrustManager() };
            SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
            sslContext.init(null, tm, new java.security.SecureRandom());
            // 从上述SSLContext对象中得到SSLSocketFactory对象
            SSLSocketFactory ssf = sslContext.getSocketFactory();

            URL url = new URL(requestUrl);
            HttpsURLConnection httpUrlConn = (HttpsURLConnection) url.openConnection();
            httpUrlConn.setSSLSocketFactory(ssf);

            httpUrlConn.setDoOutput(true);
            httpUrlConn.setDoInput(true);
            httpUrlConn.setUseCaches(false);
            // 设置请求方式（GET/POST）
            httpUrlConn.setRequestMethod(requestMethod);

            if ("GET".equalsIgnoreCase(requestMethod))
                httpUrlConn.connect();

            // 当有数据需要提交时
            if (null != outputStr) {
                OutputStream outputStream = httpUrlConn.getOutputStream();
                // 注意编码格式，防止中文乱码
                outputStream.write(outputStr.getBytes("UTF-8"));
                outputStream.close();
            }

            // 将返回的输入流转换成字符串
            InputStream inputStream = httpUrlConn.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                buffer.append(str);
            }
            bufferedReader.close();
            inputStreamReader.close();
            // 释放资源
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
     * 发起https请求并获取结果
     *
     * @param requestUrl 请求地址
     * @param requestMethod 请求方式（GET、POST）
     * @param outputStr 提交的数据
     * @return JSONObject(通过JSONObject.get(key)的方式获取json对象的属性值)
     */
    public static String httpCommonRequest(String requestUrl, String requestMethod, String outputStr) {
        StringBuffer buffer = new StringBuffer();
        try {
            // 创建SSLContext对象，并使用我们指定的信任管理器初始化
            TrustManager[] tm = { new MyX509TrustManager() };
            SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
            sslContext.init(null, tm, new java.security.SecureRandom());
            // 从上述SSLContext对象中得到SSLSocketFactory对象
            SSLSocketFactory ssf = sslContext.getSocketFactory();

            URL url = new URL(requestUrl);
            HttpURLConnection httpUrlConn = (HttpURLConnection) url.openConnection();

            //HttpURLConnection设置网络超时
            httpUrlConn.setConnectTimeout(4500);
            httpUrlConn.setReadTimeout(4500);

            httpUrlConn.setDoOutput(true);
            httpUrlConn.setDoInput(true);
            httpUrlConn.setUseCaches(false);
            // 设置请求方式（GET/POST）
            httpUrlConn.setRequestMethod(requestMethod);

            if ("GET".equalsIgnoreCase(requestMethod))
                httpUrlConn.connect();

            // 当有数据需要提交时
            if (null != outputStr) {
                OutputStream outputStream = httpUrlConn.getOutputStream();
                // 注意编码格式，防止中文乱码
                outputStream.write(outputStr.getBytes("UTF-8"));
                outputStream.close();
            }

            // 将返回的输入流转换成字符串
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
            // 释放资源
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
     * 保存HTTP获取的图片文件
     * @param requestUrl http地址
     * @param requestMethod
     * @param outputStr
     * @param target 存储路径
     */
    public static void saveHttpImage(String requestUrl, String requestMethod, String outputStr,File target) {
        //new一个URL对象
        try {
            URL url = new URL(requestUrl);
            //打开链接
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            //设置请求方式为"GET"
            conn.setRequestMethod(requestMethod);
            //超时响应时间为5秒
            conn.setConnectTimeout(5 * 1000);
            //通过输入流获取图片数据
            InputStream inStream = conn.getInputStream();
            //得到图片的二进制数据，以二进制封装得到数据，具有通用性
            byte[] data = readInputStream(inStream);
            //创建输出流
            FileOutputStream outStream = new FileOutputStream(target);
            //写入数据
            outStream.write(data);
            //关闭输出流
            outStream.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    /**
     * 编码
     * @param bstr
     * @return String
     */
    public static String encode(byte[] bstr){
        return new sun.misc.BASE64Encoder().encode(bstr);
    }

    /**
     * 解码
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
     * 上传多媒体文件
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
                con.setRequestMethod("POST"); // 以Post方式提交表单，默认get方式
                con.setDoInput(true);
                con.setDoOutput(true);
                con.setUseCaches(false); // post方式不能使用缓存
                con.setRequestProperty("Connection", "Keep-Alive");// 设置请求头信息
                con.setRequestProperty("Charset", "UTF-8");
                String BOUNDARY = "----------" + System.currentTimeMillis();// 设置边界
                con.setRequestProperty("Content-Type", "multipart/form-data; boundary="+ BOUNDARY);
                // 请求正文信息
                // 第一部分：
                StringBuilder sb = new StringBuilder();
                sb.append("--"); // 必须多两道线
                sb.append(BOUNDARY);
                sb.append("\r\n");
                sb.append("Content-Disposition: form-data;name=\"file\";filename=\""+ file.getName() + "\"\r\n");
                sb.append("Content-Type:application/octet-stream\r\n\r\n");
                byte[] head = sb.toString().getBytes("utf-8");
                // 获得输出流
                OutputStream out = new DataOutputStream(con.getOutputStream());
                // 输出表头
                out.write(head);
                // 文件正文部分
                // 把文件已流文件的方式 推入到url中
                DataInputStream in = new DataInputStream(new FileInputStream(file));
                int bytes = 0;
                byte[] bufferOut = new byte[1024];
                while ((bytes = in.read(bufferOut)) != -1) {
                    out.write(bufferOut, 0, bytes);
                }
                in.close();
                // 结尾部分
                byte[] foot = ("\r\n--" + BOUNDARY + "--\r\n").getBytes("utf-8");// 定义最后数据分隔线
                out.write(foot);
                out.flush();
                out.close();
                StringBuffer buffer = new StringBuffer();
                BufferedReader reader = null;
                try {
                    // 定义BufferedReader输入流来读取URL的响应
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
                    throw new IOException("数据读取异常");
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
     * 上传多媒体文件(永久)
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
                con.setRequestMethod("POST"); // 以Post方式提交表单，默认get方式
                con.setDoInput(true);
                con.setDoOutput(true);
                con.setUseCaches(false); // post方式不能使用缓存
                con.setRequestProperty("Connection", "Keep-Alive");// 设置请求头信息
                con.setRequestProperty("Charset", "UTF-8");
                String BOUNDARY = "----------" + System.currentTimeMillis();// 设置边界
                con.setRequestProperty("Content-Type", "multipart/form-data; boundary="+ BOUNDARY);
                // 请求正文信息
                // 第一部分：
                StringBuilder sb = new StringBuilder();
                sb.append("--"); // 必须多两道线
                sb.append(BOUNDARY);
                sb.append("\r\n");
                sb.append("Content-Disposition: form-data;name=\"media\";filename=\""+ file.getName() + "\"\r\n");
                sb.append("Content-Type:application/octet-stream\r\n\r\n");
                byte[] head = sb.toString().getBytes("utf-8");
                // 获得输出流
                OutputStream out = new DataOutputStream(con.getOutputStream());
                // 输出表头
                out.write(head);
                // 文件正文部分
                // 把文件已流文件的方式 推入到url中
                DataInputStream in = new DataInputStream(new FileInputStream(file));
                int bytes = 0;
                byte[] bufferOut = new byte[1024];
                while ((bytes = in.read(bufferOut)) != -1) {
                    out.write(bufferOut, 0, bytes);
                }
                in.close();
                // 结尾部分
                byte[] foot = ("\r\n--" + BOUNDARY + "--\r\n").getBytes("utf-8");// 定义最后数据分隔线
                out.write(foot);
                out.flush();
                out.close();
                StringBuffer buffer = new StringBuffer();
                BufferedReader reader = null;
                try {
                    // 定义BufferedReader输入流来读取URL的响应
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
                    throw new IOException("数据读取异常");
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
        byte[] buffer = new byte[1024]; // 用数据装
        int len = -1;
        while ((len = inStream.read(buffer)) != -1) {
            outstream.write(buffer, 0, len);
        }
        outstream.close();
        inStream.close();
        // 关闭流一定要记得。
        return outstream.toByteArray();
    }

    /**
     * 获取Request请求的路径信息 带参数
     * @param request
     * @return
     */
    public static String getRequestUrlWithParams(HttpServletRequest request){
        String backurl = request.getScheme()+"://"+request.getServerName()+request.getRequestURI()+"?"+request.getQueryString();
        return backurl;
    }


}
