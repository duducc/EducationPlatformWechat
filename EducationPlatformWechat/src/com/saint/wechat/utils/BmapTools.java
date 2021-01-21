package com.saint.wechat.utils;

/**
 * 
 * @author Lgg
 *
 */
public class BmapTools {

	//百度API GPS转换
	public static final String PATH_GPS2BAIDUGPS="http://api.map.baidu.com/geoconv/v1/?coords={LJD},{LWD}&ak=LClj8h220jM4op2EXX6flugZ&output=json";
			
	//百度API 你地理位置解析
	public static final String PATH_GEN_BAIDUGPS="http://api.map.baidu.com/geocoder/v2/?ak=f7CQ5rnNGPl8CGMu9p1ONG3R&callback=renderReverse&location={LWD},{LJD}&output=json&pois=0";
			
}
