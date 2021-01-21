package com.saint.constant;

import java.util.HashMap;
import java.util.Map;

public class FWConstants {
	
	public static final String TITLE="科学教育平台";
	 /**
     * 登录用户信息的sessionId
     */
    public static final String LOGIN = "userinfo";
    
    public static final String LOGIN_METHOD = "login";
    
    public static final String PAGE_SIZE = "page_size";

    /**
     * 初始化方法
     */
    public static String INIT_METHOD = "init";

    
    public static Map<String, String> ACTION_DB_LOG = new HashMap<String, String>();
    
    static{
        ACTION_DB_LOG.put("abc0.do", "abc0 operation");
        ACTION_DB_LOG.put("abc1.do", "abc1 operation");
        ACTION_DB_LOG.put("abc2.do", "abc2 operation");
        ACTION_DB_LOG.put("abc3.do", "abc3 operation");
        ACTION_DB_LOG.put("abc4.do", "abc4 operation");
        ACTION_DB_LOG.put("faultPhenomenonList", "abc4 operation");
    }
}
