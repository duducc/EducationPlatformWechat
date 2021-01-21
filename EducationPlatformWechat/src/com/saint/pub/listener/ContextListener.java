package com.saint.pub.listener;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

import com.saint.pub.Constant;
import com.saint.wechat.manager.bean.WechatMenuinfoEntity;
import com.saint.wechat.manager.services.impl.WechatMenuinfoServiceImpl;
import com.saint.wechat.manager.sqlWhere.WechatMenuinfoSqlWhere;


public class ContextListener extends ContextLoaderListener{
	private static final long serialVersionUID = 1L; 
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		super.contextInitialized(arg0);
		WebApplicationContext wc=(WebApplicationContext) arg0.getServletContext().getAttribute(WebApplicationContext.class.getName() + ".ROOT");
		WechatMenuinfoServiceImpl wechatMenuinfoService= (WechatMenuinfoServiceImpl) wc.getBean("wechatMenuinfoService");
		ServletContext sc=arg0.getServletContext();
		String rootpath=arg0.getServletContext().getRealPath("/")+"/js/common/";
		Constant.ROOTPATH = arg0.getServletContext().getRealPath("/");
		/**
		 * 微信目录key和url的map
		 */
		List<WechatMenuinfoEntity> wechatMenuinfolist=wechatMenuinfoService.selectListWechatMenuinfoBySqlWhere(new WechatMenuinfoSqlWhere());
		wechatMenuinfoListToMap(wechatMenuinfolist);
		System.out.println("初始微信目录数据成功。");
		
		System.out.println("路径："+rootpath);
		try {
			
			
		} catch (Exception e) {
			e.printStackTrace(); 
			System.out.println("初始数据加载失败。");
		}
	}
	/**
	 * 微信目录list组装成map
	 * @param WechatMenuinfoList
	 * @return
	 */
	private void wechatMenuinfoListToMap(List<WechatMenuinfoEntity> WechatMenuinfoList){
		Map<String, String> url=new HashMap<String, String>();
		Map<String, String> img=new HashMap<String, String>();
		Map<String, String> val=new HashMap<String, String>();
		Map<String, WechatMenuinfoEntity> entity=new HashMap<String, WechatMenuinfoEntity>();
		
		for(WechatMenuinfoEntity c:WechatMenuinfoList){
			entity.put(c.getMenuid(), c);
			url.put(c.getMenukey(), c.getMenuurl());
			img.put(c.getMenukey(), c.getImageurl());
			val.put(c.getMenukey(), c.getMenuvalue());
		}
		Constant.WECHAT_MENUURL=url;
		Constant.WECHAT_MENUIMGURL=img;
		Constant.WECHAT_MENUVALUE=val;
		Constant.WECHAT_MENUENTITY=entity;
		Constant.WECHAT_MENULIST = WechatMenuinfoList;
	}
	
}