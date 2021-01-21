package com.saint.pub.util.json;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

/**
 * ���������������ض������л���json���� 
 * �����ˣ�Chole 
 * ����ʱ�䣺2015-4-21����8:09:18 
 * �޸ı�ע��
 */
public class ObjectJsonValueProcessor implements JsonValueProcessor {

	/**
	 * ��Ҫ���µ��ֶ�����
	 */
	private String[] properties;

	/**
	 * ��Ҫ������ĸ�����������
	 */
	private Class<?> clazz;

	/**
	 * ���췽��,��������
	 * 
	 * @param properties
	 * @param clazz
	 */
	public ObjectJsonValueProcessor(String[] properties, Class<?> clazz) {
		this.properties = properties;
		this.clazz = clazz;
	}

	@Override
	public Object processArrayValue(Object value, JsonConfig jsonConfig) {
		return "";
	}

	@Override
	public Object processObjectValue(String key, Object value,
			JsonConfig jsonConfig) {
		PropertyDescriptor pd = null;
		Method method = null;
		StringBuffer json = new StringBuffer("{");
		if (value != null) {
			try {
				for (int i = 0; i < properties.length; i++) {
					pd = new PropertyDescriptor(properties[i], clazz);
					method = pd.getReadMethod();
					if (method.invoke(value) != null) {
						String v = String.valueOf(method.invoke(value));
						json.append("'" + properties[i] + "':'" + v + "'");
					} else {
						json.append("'" + properties[i] + "':''");
					}
					json.append(i != properties.length - 1 ? "," : "");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		json.append("}");
		return JSONObject.fromObject(json.toString());
	}
}
