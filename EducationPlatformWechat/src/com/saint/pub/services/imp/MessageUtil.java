package com.saint.pub.services.imp;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.saint.wechat.pojo.Article;
import com.saint.wechat.pojo.ImageMessage;
import com.saint.wechat.pojo.MusicMessage;
import com.saint.wechat.pojo.NewsMessage;
import com.saint.wechat.pojo.TextMessage;
import com.saint.wechat.pojo.VoiceMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;

/**
 * 
 * @author zad
 *
 */
public class MessageUtil {
    public static final String RESP_MESSAGE_TYPE_TEXT = "text";      
    public static final String RESP_MESSAGE_TYPE_VOICE = "voice";
    public static final String RESP_MESSAGE_TYPE_MUSIC = "music";    
    public static final String RESP_MESSAGE_TYPE_NEWS = "news";       
    public static final String RESP_MESSAGE_TYPE_IMAGE = "image";      
    public static final String REQ_MESSAGE_TYPE_TEXT = "text";  
    public static final String REQ_MESSAGE_TYPE_VIDEO = "video";  
    public static final String REQ_MESSAGE_TYPE_IMAGE = "image";     
    public static final String REQ_MESSAGE_TYPE_LINK = "link";       
    public static final String REQ_MESSAGE_TYPE_LOCATION = "location"; 
    public static final String REQ_MESSAGE_TYPE_VOICE = "voice";     
    public static final String REQ_MESSAGE_TYPE_EVENT = "event";      
    public static final String EVENT_TYPE_SUBSCRIBE = "subscribe";//事件类型，subscribe 关注
    public static final String EVENT_TYPE_UNSUBSCRIBE = "unsubscribe";//取消关注
    public static final String EVENT_TYPE_LOCATION = "LOCATION";
    public static final String EVENT_TYPE_CLICK = "CLICK"; 
    public static final String EVENT_TYPE_SCAN = "SCAN"; 
  
    /** 
     *  
     * @param request 
     * @return 
     * @throws Exception 
     */  
    @SuppressWarnings("unchecked")  
    public static Map<String, String> parseXml(HttpServletRequest request) throws Exception {  
        
        Map<String, String> map = new HashMap<String, String>();   
        InputStream inputStream = request.getInputStream();   
        SAXReader reader = new SAXReader(); 
        
        Document document = reader.read(inputStream);  
        Element root = document.getRootElement();   
        List<Element> elementList = root.elements();  
  
        for (Element e : elementList)  
            map.put(e.getName(), e.getText());  
  
        inputStream.close();  
        inputStream = null;  
  
        return map;  
    }  
    /** 
         * 解析微信发来的请求（XML） 
         *  
         * @param request 
         * @return 
         * @throws Exception 
         */  
        @SuppressWarnings("unchecked")  
        public static Map<String, String> parseXml(String msg) throws Exception {  
            // 将解析结果存储在HashMap中  
        	Map<String, String> map = new HashMap<String, String>();  
            // 从request中取得输入流  
            InputStream inputStream = new ByteArrayInputStream(msg.getBytes("UTF-8"));  
            // 读取输入流  
            SAXReader reader = new SAXReader();  
            Document document = reader.read(inputStream);  
            // 得到xml根元素  
            Element root = document.getRootElement();  
            // 得到根元素的所有子节点  
            List<Element> elementList = root.elements();  
            // 遍历所有子节点  
            for (Element e : elementList) {
            	map.put(e.getName(), e.getText());  
            }
            // 释放资源  
            inputStream.close();  
            inputStream = null;  
      
            return map;  
       }  

    /** 
     *  
     * @return xml 
     */  
    public static String textMessageToXml(TextMessage textMessage) {  
        xstream.alias("xml", textMessage.getClass());  
        return xstream.toXML(textMessage);  
    }  
    public static String imageMessageToXml(ImageMessage imageMessage) {  
        xstream.alias("xml", imageMessage.getClass());  
        return xstream.toXML(imageMessage);  
    }  
    public static String voiceMessageToXml(VoiceMessage voiceMessage) {  
        xstream.alias("xml", voiceMessage.getClass());  
        return xstream.toXML(voiceMessage);  
    }  
  
    public static String musicMessageToXml(MusicMessage musicMessage) {  
        xstream.alias("xml", musicMessage.getClass());  
        return xstream.toXML(musicMessage);  
    }  
  
    public static String newsMessageToXml(NewsMessage newsMessage) {  
        xstream.alias("xml", newsMessage.getClass());  
        xstream.alias("item", new Article().getClass());  
        return xstream.toXML(newsMessage);  
    }  
  
    private static XStream xstream = new XStream(new XppDriver() {  
        public HierarchicalStreamWriter createWriter(Writer out) {  
            return new PrettyPrintWriter(out) {  
                boolean cdata = true;  
                public void startNode(String name, @SuppressWarnings("rawtypes") Class clazz) {  
                    super.startNode(name, clazz);  
                }  
                protected void writeText(QuickWriter writer, String text) {  
                    if (cdata) {  
                        writer.write("<![CDATA[");  
                        writer.write(text);  
                        writer.write("]]>"); //把全局的xml文件加上<![CDATA[]]>标志
                    } else {  
                        writer.write(text);  
                    }  
                }  
            };  
        }  
    });  
}
