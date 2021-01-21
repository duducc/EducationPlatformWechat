package com.saint.pub.util.json;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.apache.commons.lang.StringUtils;

/**
  * 类  描  述:
  * 创   建 人:
  * 创建日期:2015-5-2
  * 创建时间:下午12:17:18
  * 修改备注:
 */
public class JsonUtil {
	
	public static void writeJson(Object o, final Map<Object, String[]> map, HttpServletResponse response , Object... filter ) {
		
		// 因为hibernate有表关联，如果两个表之间相互存在关联则就容易引起死循环
		JsonConfig jsonConfig = new JsonConfig(); // 建立配置文件
		jsonConfig.registerJsonValueProcessor(Date.class , new JsonDateValueProcessor());// json 时间处理
		jsonConfig.setIgnoreDefaultExcludes(false); // 设置默认忽略
		// 要保留的字段
		if (map != null) {
			for (Object key : map.keySet()) {
				String[] strObj = map.get(key);
				jsonConfig.registerJsonValueProcessor(key.getClass(),
						new ObjectJsonValueProcessor(strObj, key.getClass()));
			}
		}
		if(filter !=null && filter.length != 0 ){
			jsonConfig.setJsonPropertyFilter(new IgnoreFieldProcessorImpl(true, (String[])filter));
		}
		// 将对象转化为json，并且加入相关配置
		JSONObject fromObject = JSONObject.fromObject(o, jsonConfig);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		PrintWriter writer;
		try {
			writer = response.getWriter();
			String jsonstr = fromObject.toString();
			writer.write(jsonstr);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param json
	 * @param clazz
	 * @return
	 */ 
	public static List<Object> jsonToBean(String json, Class clazz){
		json = StringUtils.replaceEach(json, new String[]{"[[","]]"}, new String[]{"[","]"});
		JSONArray array = JSONArray.fromObject(json);
		List result = new ArrayList();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);        
	        result.add(JSONObject.toBean(jsonObject, clazz));
		}
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T json2Object(String json, Class<T> clazz){
		JSONObject jsonObject = JSONObject.fromObject(json) ; 
		return (T)JSONObject.toBean(jsonObject, clazz); 
	}
	
	
	public static <T> List<T> json2ObjectList(String json, Class<T> clazz){
		json = StringUtils.replaceEach(json, new String[]{"[[","]]"}, new String[]{"[","]"});
		JSONArray array = JSONArray.fromObject(json);
		List<T> result = new ArrayList<T>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);        
	        result.add((T) JSONObject.toBean(jsonObject, clazz));
		}
		return result;
	}
	
	
}
