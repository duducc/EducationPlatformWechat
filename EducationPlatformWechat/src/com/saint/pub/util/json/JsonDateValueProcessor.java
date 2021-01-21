package com.saint.pub.util.json;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by 13971 on 2017/7/13.
 * Date 转换为json 时处理 将Date 转换为String
 */
public class JsonDateValueProcessor implements JsonValueProcessor {
    private String pattern = "yyyy-MM-dd HH:mm";
    public Object processArrayValue(Object value, JsonConfig jsonConfig) {
        return process(value);
    }

    public Object processObjectValue(String s, Object o, JsonConfig jsonConfig) {
        return process(o);
    }

    private Object process(Object value){
        if(value instanceof Date){
            SimpleDateFormat sdf = new SimpleDateFormat(pattern, Locale.CHINA);
            return sdf.format(value);
        }
        return value == null ? "" : value.toString();
    }

}
