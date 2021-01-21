package com.saint.wechat.service;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import com.saint.pub.Constant;
import com.saint.pub.DateManager;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.services.imp.MessageUtil;
import com.saint.systemManager.bean.FrmCodeEntity;
import com.saint.systemManager.bean.FrmCodeKey;
import com.saint.systemManager.bean.FrmSysparaTypeEntity;
import com.saint.systemManager.bean.FrmSysparaTypeKey;
import com.saint.teaching.bean.JxCourseArrangeEntity;
import com.saint.teaching.bean.JxCoursePlanEntity;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.bean.JxStudyRegistrationEntity;
import com.saint.teaching.sqlWhere.JxStudyRegistrationSqlWhere;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatBindKey;
import com.saint.wechat.manager.bean.WechatMenuinfoEntity;
import com.saint.wechat.manager.bean.WechatSysparamEntity;
import com.saint.wechat.manager.bean.WechatSysparamKey;
import com.saint.wechat.manager.bean.XfCourseEntity;
import com.saint.wechat.manager.bean.XfCourseSignupEntity;
import com.saint.wechat.manager.bean.XfCourseSignupKey;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.bean.XfStudyRegistrationEntity;
import com.saint.wechat.manager.sqlWhere.WechatMenuinfoSqlWhere;
import com.saint.wechat.manager.sqlWhere.WechatSysparamSqlWhere;
import com.saint.wechat.manager.sqlWhere.XfStudyRegistrationSqlWhere;
import com.saint.wechat.pojo.Article;
import com.saint.wechat.pojo.NewsMessage;
import com.saint.wechat.pojo.TextMessage;

public class EventServiceImpl extends BaseService{
	public GzyhService gzyhservice;

	public String service(Map<String, String> resultmap,String clientsxh,HttpServletRequest request,String openid,String wxtype){
		String eventType = resultmap.get("Event"); 
		String EventKey = resultmap.get("EventKey");
		String type = "";
		String courseId = "";
		String times = "";
		String respMessage = null;
		String fromUserName = "";
		if(wxtype.equals("1")){
			fromUserName = resultmap.get("FromUserName");//用户账号  
		}else if(wxtype.equals("3")){
			fromUserName = openid;//用户账号  
		}
		String Longitude = resultmap.get("Longitude");//经度
		String Latitude = resultmap.get("Latitude");//维度
		System.out.println("-------------------------------经度="+Longitude+"维度="+Latitude+"-------------------------------------");
		ServletContext application = request.getSession().getServletContext();
		application.setAttribute(fromUserName, Longitude+"/"+Latitude);
        String toUserName = resultmap.get("ToUserName");  // 公众帐号  
        int conuntuser = 0;
        System.out.println("*******************************"+!eventType.toUpperCase().equals(MessageUtil.EVENT_TYPE_SCAN));
        if(clientsxh.equals("6201001002")&&!eventType.toUpperCase().equals(MessageUtil.EVENT_TYPE_SCAN)){
			return newService(resultmap,clientsxh, request, openid, wxtype);
		}
        /*******************************获取资源路径开始*********************************************/
        String RES_PATH= "";
    	WechatSysparamSqlWhere _p=new WechatSysparamSqlWhere();
    	_p.setClientsxh(clientsxh);
    	_p.setGjz("RES_PATH");
    	WechatSysparamEntity p=wechatSysparamService.selectWechatSysparamByPrimaryKey(_p);
    	if(p != null){//判断参数表是否有值
    		 RES_PATH=p.getDmz();
    	}
    	/*******************************获取资源路径结束*********************************************/
    	System.out.println("---------------------------------openid="+fromUserName+"-----------------------------------------------clientsxh="+clientsxh);
        if(eventType.toUpperCase().equals(MessageUtil.EVENT_TYPE_SCAN)){//公众帐号签到
        	if(EventKey!=null&&!EventKey.equals("")&&EventKey.length()>8){
        		type = EventKey.substring(0,1);
    			courseId = EventKey.substring(1, 8);
    			times = EventKey.substring(8);
    		}
        	if(type.equals("1")){
        		respMessage = Tasksignin(times,courseId,fromUserName,clientsxh,toUserName,request);
        	}else if(type.equals("2")){
        		respMessage = Coursesignin(times,courseId,fromUserName,clientsxh,toUserName,request);
        	}
        }else if (eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) {
        	//关注
        	WechatBindKey key =new WechatBindKey();
    		key.setOpenId(fromUserName);
    		key.setClientsxh(clientsxh);
    		WechatBindEntity bind = wechatBindService.selectWechatBindByPrimaryKey(key);
    		if(bind == null){
    			System.out.println("--------------------------------------------------进入方法一");
	    		WechatBindEntity entity = new WechatBindEntity();
	    		entity.setOpenId(fromUserName);
	    		entity.setClientsxh(clientsxh);
	    		entity.setIslqxx("0");
	    		entity.setYhlb("9");
	    		entity.setState("1");
	    		entity.setIsAdmin("0");
	    		entity.setCreateTime(DateManager.getNowDate());
	    		entity.setGxsj(DateManager.getNowDate());
	    		ExcuteResult resultbing = wechatBindService.insertWechatBind(entity);
	    		if(!resultbing.getReturnCode().equals("1")){
	    			System.out.println("没保存成功："+resultbing.getExcepMessage());
	    		}
    		}else if(bind != null && bind.getYitongCard()==null){
    			System.out.println("--------------------------------------------------进入方法二");
    			WechatBindEntity entity1 = new WechatBindEntity();
            	entity1.setOpenId(fromUserName);
        		entity1.setClientsxh(clientsxh);
        		entity1.setState("1");
            	wechatBindService.updateWechatBindByPrimaryKeySelective(entity1);
    		}else{
    			System.out.println("--------------------------------------------------进入方法三");
    			WechatBindEntity entity2 = new WechatBindEntity();
            	entity2.setOpenId(fromUserName);
        		entity2.setClientsxh(clientsxh);
        		entity2.setState("2");
            	wechatBindService.updateWechatBindByPrimaryKeySelective(entity2);
    		}
    		TextMessage textMessage = new TextMessage(); 
    		textMessage.setToUserName(fromUserName);  
            textMessage.setFromUserName(toUserName);  
            textMessage.setCreateTime(new Date().getTime());  
            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
            textMessage.setContent(Constant.GET_WELCOME().get(clientsxh));
            respMessage =  MessageUtil.textMessageToXml(textMessage);
        }else if (eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)) {  
        //取消关注
        	WechatBindEntity entity1 = new WechatBindEntity();
        	entity1.setOpenId(fromUserName);
    		entity1.setClientsxh(clientsxh);
    		entity1.setState("0");
        	wechatBindService.updateWechatBindByPrimaryKeySelective(entity1);
        }else if (eventType.toUpperCase().equals(MessageUtil.EVENT_TYPE_CLICK)){
        //单击click按钮事件
        	String eventKey = resultmap.get("EventKey");
        	/***********获取绑定表开始***************/
        	WechatBindKey key =new WechatBindKey();
    		key.setOpenId(fromUserName);
    		key.setClientsxh(clientsxh);
    		WechatBindEntity gzyh=wechatBindService.selectWechatBindByPrimaryKey(key);
    		/***********获取绑定表结束***************/
    		
    		//状态 0：取消关注 1：已关注 2：已绑定 3：取消绑定
        	List<WechatMenuinfoEntity> nenulist = Constant.WECHAT_MENULIST;
        	if(nenulist != null && nenulist.size() > 0){
        		for(WechatMenuinfoEntity w:nenulist){
        			if(w.getMenuid().subSequence(0, 10).equals(clientsxh)){
	        			if(eventKey.equalsIgnoreCase(w.getMenukey())){//判断是当前需要推送的信息
	        				//状态 0：取消关注 1：已关注 2：已绑定 3：取消绑定
	    					//权限 0无需绑定就可使用 1必须绑定才能使用 2管理员能使用
	    					if((gzyh == null ||gzyh.getState()==null||!gzyh.getState().equals("2")) && w.getPower()!=null&&(w.getPower().equals("1") ||w.getPower().equals("2"))){//提示先绑定医通卡
	    						TextMessage textMessage = new TextMessage(); 
	    			    		textMessage.setToUserName(fromUserName);  
	    			            textMessage.setFromUserName(toUserName);  
	    			            textMessage.setCreateTime(new Date().getTime());  
	    			            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	    			            textMessage.setContent(Constant.JHGN_JYRZTS);  
	    			            respMessage =  MessageUtil.textMessageToXml(textMessage);
	    					}else if(gzyh != null && (gzyh.getIsAdmin()==null||!gzyh.getIsAdmin().equals("1")) &&w.getPower()!=null&& w.getPower().equals("2") ){//提示只有管理员才可以使用该权限
	    						TextMessage textMessage = new TextMessage(); 
	            				textMessage.setToUserName(fromUserName);  
	            				textMessage.setFromUserName(toUserName);  
	            				textMessage.setCreateTime(new Date().getTime());  
	            				textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	            				textMessage.setContent(Constant.JHGN_GLYQX);  
	            				respMessage =  MessageUtil.textMessageToXml(textMessage);
	    					}else{//满足条件推出推送消息
		    					NewsMessage newmsg=new NewsMessage();
		                		List<Article> _list = new ArrayList<Article>();
		        				//if(w.getMenuvalue()!=null){//大目录有子目录
		            				//大目录图片
		            				Article _art = new Article();
		            				_art.setTitle(w.getMenuname());
		            				_art.setDescription("");
		            				_art.setPicUrl(RES_PATH+w.getImageurl());
		            				if(w.getMenuurl()!=null&&!w.getMenuurl().trim().equals("")){
		            					_art.setUrl(RES_PATH+w.getMenuurl()+"&clientsxh="+clientsxh+"&openid="+fromUserName+"&menuid="+w.getMenuid());
		            				}
		            				_list.add(_art);
		        					String allmenu = w.getMenuvalue();//取子目录
		        					if(allmenu != null){
		        						String[] menuarray = allmenu.split(",");
		        						if(menuarray != null && menuarray.length > 0){
		        							for(int i=0;i<menuarray.length;i++){
		        								WechatMenuinfoEntity menuentity = Constant.WECHAT_MENUENTITY.get(menuarray[i]);
		        								Article _art1 = new Article();
		        		        				_art1.setTitle(menuentity.getMenuname());
		        		        				_art1.setDescription("");
		        		        				_art1.setPicUrl(RES_PATH+"/"+menuentity.getImageurl());
		        		        				_art1.setUrl(RES_PATH+menuentity.getMenuurl()+"&clientsxh="+clientsxh+"&openid="+fromUserName);
		        		        				_list.add(_art1);
		        							}
		        						}
		        					}
		        					newmsg.setArticleCount(_list.size());
			        				newmsg.setArticles(_list);
			        				newmsg.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_NEWS);
			        				newmsg.setFromUserName(toUserName);
			        				newmsg.setToUserName(fromUserName);
			        				newmsg.setCreateTime(new Date().getTime());
			        				respMessage =  MessageUtil.newsMessageToXml(newmsg);
		        				/*}else{
		                			Article _art1 = new Article();
		            				_art1.setTitle(w.getMenuname());
		            				_art1.setDescription("");
		            				_art1.setPicUrl(RES_PATH+w.getImageurl());
		            				_art1.setUrl(RES_PATH+w.getMenuurl()+"&clientsxh="+clientsxh+"&openid="+fromUserName);
		            				_list.add(_art1);  
		            				newmsg.setArticleCount(_list.size());
		            				newmsg.setArticles(_list);
		            				newmsg.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_NEWS);
		            				newmsg.setFromUserName(toUserName);
		            				newmsg.setToUserName(fromUserName);
		            				newmsg.setCreateTime(new Date().getTime());
		            				respMessage =  MessageUtil.newsMessageToXml(newmsg);
		        				}*/
	    					}
	        				return respMessage;
	        			}        			
        			}
        		}
        	}else{
        		TextMessage textMessage = new TextMessage(); 
        		textMessage.setToUserName(fromUserName);  
                textMessage.setFromUserName(toUserName);  
                textMessage.setCreateTime(new Date().getTime());  
                textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
                textMessage.setContent("该功能正在维护中，无法使用……");  
                respMessage =  MessageUtil.textMessageToXml(textMessage);
        	}
        	}
		return respMessage;
	}
	
	//市二院微信用的
	public String newService(Map<String, String> resultmap,String clientsxh,HttpServletRequest request,String openid,String wxtype){
		String eventType = resultmap.get("Event");     //微信推送事件类型
		String EventKey = resultmap.get("EventKey");   //事件关键字
		String fromUserName = resultmap.get("FromUserName"); //（来自）用户账号  ;
		String toUserName = resultmap.get("ToUserName");  // （目的）公众号账号  
		String respMessage = null; //推送文章
		String yhlb = null;  //用户类别  1医院用户  2其他用户（学员）
		/*******************************获取资源路径开始*********************************************/
        String RES_PATH= "";
    	WechatSysparamKey param=new WechatSysparamKey();
    	param.setClientsxh(clientsxh);
    	System.out.println("clientsxh"+clientsxh+"-----------------------------------------------------");
    	param.setGjz("RES_PATH");
    	WechatSysparamEntity p=wechatSysparamService.selectWechatSysparamByPrimaryKey(param);
    	if(p != null){//判断参数表是否有值
    		 RES_PATH=p.getDmz();
    	}
    	System.out.println("RES_PATH="+RES_PATH+"-------------------------------------------------------");
    	/*******************************获取资源路径结束*********************************************/
    	
    	/***********获取绑定表开始***************/
    	WechatBindKey key =new WechatBindKey();
		key.setOpenId(fromUserName);
		key.setClientsxh(clientsxh);
		WechatBindEntity bind=wechatBindService.selectWechatBindByPrimaryKey(key);
		/***********获取绑定表结束***************/
		//===========================================关注微信公众号事件(关注后，弹出绑定框)==================================================
    	if (eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) {
    		WechatBindEntity entity = new WechatBindEntity();
    		entity.setOpenId(fromUserName);
    		entity.setRemark5(toUserName);
    		entity.setClientsxh(clientsxh);
    		entity.setState("1");
    		entity.setIslqxx("0");
    		entity.setGxsj(DateManager.getNowDate());
    		if(bind == null){
	    		entity.setCreateTime(DateManager.getNowDate());
	    		wechatBindService.insertWechatBind(entity);
    		}else{
    			wechatBindService.updateWechatBindByPrimaryKeySelective(entity);
    		}
    		/****************************************推送注册或绑定开始***********************************************/
    		return creatNewsMessage(clientsxh,fromUserName,toUserName,RES_PATH,p,"注册绑定","学员请注册，医务人员请绑定信息。");
			/****************************************推送注册或绑定结束***********************************************/
    	}
    	//=================================================如果绑定表为空，则推送重新绑定=============================================================
    	if(bind==null){
    		return creatTextMessage(fromUserName, toUserName,"抱歉！关注信息丢失了，请取消关注后重新关注！");
    	}
    	/*******************************************************推送注册或绑定结束***********************************************/
    	//======================================================取消关注事件==============================================================
    	if(eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)){
    		wechatBindService.deleteWechatBindByPrimaryKey(key);  //删除绑定表记录
    		return null;
    	}
    	/***************************************************取消绑定结束***********************************************/
    	//=====================================================单击事件（click）==============================================
    	if (eventType.toUpperCase().equals(MessageUtil.EVENT_TYPE_CLICK)){
    		if(bind.getYhlb()==null||"".equals(bind.getYhlb())){ //获取用户类别，如果为空（没有绑定信息入库）
    			return creatNewsMessage(clientsxh,fromUserName,toUserName,RES_PATH,p,"注册绑定","学员请注册，医务人员请绑定信息。。");
    		}else{
    			if(bind.getYhlb().equals("1")){   //如果是学生
    				if(bind.getYitongCard()!=null&&!bind.getYitongCard().equals("")){
    					JxStudentsEntity student = jxStudentsService.selectJxStudentsByPrimaryKey(bind.getYitongCard());
    					if(student.getState()!=null&&!student.getState().equals("2")){ //未审核或审核不通过
    						return creatNewsMessage(clientsxh,fromUserName,toUserName,RES_PATH,p,"注册未审核","学员注册信息未审核或审核不通过！");
    					}
    				}else{ //关联学生主键为空
    					return creatNewsMessage(clientsxh,fromUserName,toUserName,RES_PATH,p,"注册绑定","学员请注册，医务人员请绑定信息。。。");
    				}
    			}else if(bind.getYhlb().equals("2")){  //如果是老师
    				
    			}
    			yhlb = bind.getYhlb();
    		}
//    		List<WechatMenuinfoEntity> menulist = Constant.WECHAT_MENULIST;
    		WechatMenuinfoSqlWhere menusqlWhere = new WechatMenuinfoSqlWhere();
    		menusqlWhere.setMenuid(clientsxh);
    		List<WechatMenuinfoEntity> menulist = wechatMenuinfoService.selectListWechatMenuinfoBySqlWhere(menusqlWhere);
    		if(menulist != null && menulist.size() > 0){
        		for(WechatMenuinfoEntity currentMenu:menulist){
        			if(EventKey.equalsIgnoreCase(currentMenu.getMenukey())){//判断是当前需要推送的信息
        				if(yhlb.equals("1")){  //学员使用了医务人员的相关按钮
        					if(!bind.getIsAdmin().equals("1")&&"3".equals(currentMenu.getPower())){
        						return creatTextMessage(fromUserName, toUserName,"该功能仅限班长使用！");
        					}
        					if("2".equals(currentMenu.getPower())){
        						return creatTextMessage(fromUserName, toUserName,"抱歉！您不是医务管理人员！");
        					}
        				}
        				if(yhlb.equals("2")&&!"2".equals(currentMenu.getPower())){
        					return creatTextMessage(fromUserName, toUserName,"抱歉！您不是学员！");
        				}
        				NewsMessage newmsg=new NewsMessage();
                		List<Article> _list = new ArrayList<Article>();
                		Article _art = new Article();
        				_art.setTitle(currentMenu.getMenuname());
        				_art.setDescription("");
        				_art.setPicUrl(RES_PATH+currentMenu.getImageurl());
        				if(currentMenu.getMenuurl()!=null&&!currentMenu.getMenuurl().trim().equals("")){
        					_art.setUrl(RES_PATH+currentMenu.getMenuurl()+"&clientsxh="+clientsxh+"&openid="+fromUserName+"&menuid="+currentMenu.getMenuid());
        				}
        				_list.add(_art);
    					String allmenu = currentMenu.getMenuvalue();//取子目录
    					if(allmenu != null){
    						String[] menuarray = allmenu.split(",");
    						if(menuarray != null && menuarray.length > 0){
    							for(int i=0;i<menuarray.length;i++){
    								WechatMenuinfoEntity menuentity = Constant.WECHAT_MENUENTITY.get(menuarray[i]);
    								Article _art1 = new Article();
    		        				_art1.setTitle(menuentity.getMenuname());
    		        				_art1.setDescription("");
    		        				_art1.setPicUrl(RES_PATH+"/"+menuentity.getImageurl());
    		        				_art1.setUrl(RES_PATH+menuentity.getMenuurl()+"&clientsxh="+clientsxh+"&openid="+fromUserName);
    		        				_list.add(_art1);
    							}
    						}
    					}
    					newmsg.setArticleCount(_list.size());
        				newmsg.setArticles(_list);
        				newmsg.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_NEWS);
        				newmsg.setFromUserName(toUserName);
        				newmsg.setToUserName(fromUserName);
        				newmsg.setCreateTime(new Date().getTime());
        				respMessage =  MessageUtil.newsMessageToXml(newmsg);
        				return respMessage;
        			}
        		}
    		}
    	}
    	/**********************************************************单击事件结束**********************************************************/
		return null;
	}
	
	//推送提醒注册和绑定消息
	public String creatNewsMessage(String clientsxh,String fromUserName,String toUserName,String RES_PATH,WechatSysparamEntity p,String title,String descrip){
		String respMessage = null;
		NewsMessage myNewsMes=new NewsMessage();
		List<Article> art_list = new ArrayList<Article>();
		Article _art1 = new Article();
		_art1.setTitle(title);
		_art1.setDescription(descrip);
		_art1.setPicUrl(RES_PATH+p.getDmsm());
		_art1.setUrl(RES_PATH+p.getSfxg()+"&clientsxh="+clientsxh+"&openid="+fromUserName);
		art_list.add(_art1);  
		myNewsMes.setArticleCount(art_list.size());
		myNewsMes.setArticles(art_list);
		myNewsMes.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_NEWS);
		myNewsMes.setFromUserName(toUserName);
		myNewsMes.setToUserName(fromUserName);
		myNewsMes.setCreateTime(new Date().getTime());
		respMessage =  MessageUtil.newsMessageToXml(myNewsMes);
		return respMessage;
	}
	
	//推送文字性内容
	public String creatTextMessage(String fromUserName,String toUserName,String concent){
		String respMessage = null;
		TextMessage textMessage = new TextMessage(); 
		textMessage.setToUserName(fromUserName);  
        textMessage.setFromUserName(toUserName);  
        textMessage.setCreateTime(new Date().getTime());  
        textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
        textMessage.setContent(concent);
        respMessage =  MessageUtil.textMessageToXml(textMessage);
        return respMessage;
	}
	
	/**
	 * 扫码签到-继教(ywq)
	 * @param fromUserName
	 * @param EventKey
	 * @param clientsxh
	 * @param toUserName
	 * @param empjd
	 * @param empwd
	 * @param request
	 * @return
	 */
	public String Tasksignin(String times, String courseId,String fromUserName,String clientsxh,String toUserName,HttpServletRequest request){
		String respMessage = null;
		String openId = fromUserName;
		WechatBindEntity bindinfo = wechatBindService.getBindInfo(openId, clientsxh);
		long dktime = System.currentTimeMillis()/1000;
		long sctime = Long.valueOf(times);
		long timec = dktime-sctime;
		try {
			FrmSysparaTypeKey dakatimekey = new FrmSysparaTypeKey();
			dakatimekey.setXtlb("00");
			dakatimekey.setGjz("dakatimes");
			FrmSysparaTypeEntity dakatimeentity = FrmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(dakatimekey);
			String dakatimes = dakatimeentity.getMrz();
			long dakatime = Long.valueOf(dakatimes);
			System.out.println("==================================timec="+timec+"------------------dakatime="+dakatime+"======================");
			if(timec>dakatime){
				TextMessage textMessage = new TextMessage(); 
	    		textMessage.setToUserName(fromUserName);  
	            textMessage.setFromUserName(toUserName);  
	            textMessage.setCreateTime(new Date().getTime());  
	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	            textMessage.setContent("您已超出二维码有效时间，打卡失败。");  
	            respMessage =  MessageUtil.textMessageToXml(textMessage);
			}
			else if(bindinfo==null){
        		TextMessage textMessage = new TextMessage(); 
	    		textMessage.setToUserName(fromUserName);  
	            textMessage.setFromUserName(toUserName);  
	            textMessage.setCreateTime(new Date().getTime());  
	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	            textMessage.setContent("您的个人信息有问题。请您在【我的医通卡】中取消绑定，然后取消关注该公众号，然后重新关注该公众号！");  
	            respMessage =  MessageUtil.textMessageToXml(textMessage);
        	}else if(!bindinfo.getState().equals("2")){
        		TextMessage textMessage = new TextMessage(); 
	    		textMessage.setToUserName(fromUserName);  
	            textMessage.setFromUserName(toUserName);  
	            textMessage.setCreateTime(new Date().getTime());  
	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	            textMessage.setContent(Constant.JHGN_JYRZTS);  
	            respMessage =  MessageUtil.textMessageToXml(textMessage);
        	}else{
        		XfCourseSignupKey sigkey = new XfCourseSignupKey();
        		sigkey.setYitongCard(bindinfo.getYitongCard());
        		sigkey.setCourseId(courseId);
        		XfCourseSignupEntity sigentity = xfCourseSignupService.selectXfCourseSignupByPrimaryKey(sigkey);
        		XfCourseEntity couEntity = xfCourseService.selectXfCourseByPrimaryKey(courseId);
        		int coursecount = Integer.valueOf(couEntity.getEduObjCount());//课题人数
        		XfStudyRegistrationSqlWhere StudysqlWhere = new XfStudyRegistrationSqlWhere();
        		StudysqlWhere.setCourseId(courseId);
        		int Studycount = xfStudyRegistrationService.countXfStudyRegistrationBySqlWhere(StudysqlWhere);
        		XfEmployeeEntity empEntity = xfEmployeeService.selectXfEmployeeByPrimaryKey(bindinfo.getYitongCard());
        		JxStudentsEntity stuEntity = jxStudentsService.selectJxStudentsByPrimaryKey(bindinfo.getYitongCard());
        		String dept = "";
        		String deptname = "";
        		String username = "";
        		String pertype = "";
        		if(empEntity!=null){
        			dept = empEntity.getYiyuan();
        			deptname = frmDepartmentService.getDeptNamebyNumber(empEntity.getYiyuan());
        			username = empEntity.getUsername();
        			pertype = "1";
        		}else {
        			if(stuEntity!=null){
            			dept = stuEntity.getGraduateschool();
            			deptname = frmCodeService.selectFrmCodeByDmz("1676", dept);
            			username = stuEntity.getName();
            			pertype = "2";
            		}
        		}
        		String signup_cs = couEntity.getRemark3();
    			DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
    			Date date = new Date();
    			Date btbegindate = sdf.parse(couEntity.getStartDate());  //开始时间
    			Date btenddate = sdf.parse(couEntity.getEndDate());  //结束时间
    			String nowTime = sdf.format(new Date());
    			XfStudyRegistrationEntity entity = new XfStudyRegistrationEntity();
        		if(signup_cs.equals("2") && sigentity==null){
        			TextMessage textMessage = new TextMessage(); 
    	    		textMessage.setToUserName(fromUserName);  
    	            textMessage.setFromUserName(toUserName);  
    	            textMessage.setCreateTime(new Date().getTime());  
    	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
    	            textMessage.setContent("您没有对本课题进行报名！");  
    	            respMessage =  MessageUtil.textMessageToXml(textMessage);
        		}
        		else if(date.getTime()<btbegindate.getTime()-30*60000||date.getTime()>btenddate.getTime()+30*60000){
        			TextMessage textMessage = new TextMessage(); 
    	    		textMessage.setToUserName(fromUserName);  
    	            textMessage.setFromUserName(toUserName);  
    	            textMessage.setCreateTime(new Date().getTime());  
    	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
    	            textMessage.setContent("请在活动规定时间内进行签到！     （上课时间："+couEntity.getStartDate().substring(0,19)+"下课时间："+couEntity.getEndDate().substring(0,19));  
    	            respMessage =  MessageUtil.textMessageToXml(textMessage);
        		}
        		else{
        			entity.setXh(courseId+"-"+bindinfo.getYitongCard());
        			entity.setCourseId(courseId);
        			entity.setEmpNumber(bindinfo.getYitongCard());
        			entity.setDeptId(dept);
        			entity.setDeptName(deptname);
        			entity.setCourseName(couEntity.getCourseName());
        			entity.setPlaceName("");
        			entity.setPosition("");
        			entity.setDakaTime(nowTime);
        			entity.setAddYear(nowTime.substring(0,4));
        			entity.setIsgrant("1");
        			entity.setIsvalid("1");
        			entity.setState("1");
        			entity.setAddTime(nowTime);
        			entity.setRemarks1(username);
        			entity.setGxsj(nowTime);
        			entity.setRemarks2(pertype);
        			XfStudyRegistrationSqlWhere sqlWhere = new XfStudyRegistrationSqlWhere();
        			sqlWhere.setCourseId(courseId);
        			sqlWhere.setEmpNumber(bindinfo.getYitongCard());
        			sqlWhere.setDakaTime(nowTime);
        			List<XfStudyRegistrationEntity> list = xfStudyRegistrationService.selectListXfStudyRegistrationBySqlWhere(sqlWhere);
        			if(date.getTime()>btbegindate.getTime()){
        				entity.setAwardstate("1");
        			}else{
        				entity.setAwardstate("0");
        			}
        			if(couEntity.getCheckNumber().equals("1")){
        				if(list.size()>0){
        					TextMessage textMessage = new TextMessage(); 
    	    	    		textMessage.setToUserName(fromUserName);  
    	    	            textMessage.setFromUserName(toUserName);  
    	    	            textMessage.setCreateTime(new Date().getTime());  
    	    	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
    	    	            textMessage.setContent("【"+couEntity.getCourseName()+"】您已上课签到成功，请勿重复签到！");  
    	    	            respMessage =  MessageUtil.textMessageToXml(textMessage);
        				}
//        				else if(Studycount>=coursecount){
//            				TextMessage textMessage = new TextMessage(); 
//            	    		textMessage.setToUserName(fromUserName);  
//            	            textMessage.setFromUserName(toUserName);  
//            	            textMessage.setCreateTime(new Date().getTime());  
//            	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
//            	            textMessage.setContent("本活动签到人数已满！");  
//            	            respMessage =  MessageUtil.textMessageToXml(textMessage);
//            			}
        				else if(date.getTime()>btenddate.getTime()+40*60000){
                			TextMessage textMessage = new TextMessage(); 
            	    		textMessage.setToUserName(fromUserName);  
            	            textMessage.setFromUserName(toUserName);  
            	            textMessage.setCreateTime(new Date().getTime());  
            	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
            	            textMessage.setContent("对不起，该活动已结束！");  
            	            respMessage =  MessageUtil.textMessageToXml(textMessage);
                		}
        				else{
        					ExcuteResult result;
        					XfStudyRegistrationEntity studyentity = xfStudyRegistrationService.selectXfStudyRegistrationByPrimaryKey(courseId+"-"+bindinfo.getYitongCard());
        					if(studyentity==null){
        						result = xfStudyRegistrationService.insertXfStudyRegistration(entity);
        					}else{
        						studyentity.setDakaTime(nowTime);
        						studyentity.setAddYear(nowTime.substring(0,4));
        						studyentity.setIsvalid("1");
        						studyentity.setAddTime(studyentity.getAddTime().substring(0,10));
        						studyentity.setIsgrant("1");
        						if(date.getTime()>btbegindate.getTime()){
        							studyentity.setAwardstate("1");
        	        			}else{
        	        				studyentity.setAwardstate("0");
        	        			}
        						result = xfStudyRegistrationService.updateXfStudyRegistrationByPrimaryKeySelective(studyentity);
        					}
        					if(result.getReturnCode().equals("1")){
        						TextMessage textMessage = new TextMessage(); 
	    	    	    		textMessage.setToUserName(fromUserName);  
	    	    	            textMessage.setFromUserName(toUserName);  
	    	    	            textMessage.setCreateTime(new Date().getTime());  
	    	    	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	    	    	            textMessage.setContent("恭喜【"+username+"】在【"+couEntity.getCourseName()+"】活动中签到成功！");  
	    	    	            respMessage =  MessageUtil.textMessageToXml(textMessage);
        					}else{
        						TextMessage textMessage = new TextMessage(); 
	    	    	    		textMessage.setToUserName(fromUserName);  
	    	    	            textMessage.setFromUserName(toUserName);  
	    	    	            textMessage.setCreateTime(new Date().getTime());  
	    	    	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	    	    	            textMessage.setContent("【"+username+"】在【"+couEntity.getCourseName()+"】活动中签到失败！");  
	    	    	            respMessage =  MessageUtil.textMessageToXml(textMessage);
        					}
        				}
        			}else if(couEntity.getCheckNumber().equals("2")){
        				if(list.size()==1){
	        				if(date.getTime()<btenddate.getTime()){
	        					TextMessage textMessage = new TextMessage(); 
	    	    	    		textMessage.setToUserName(fromUserName);  
	    	    	            textMessage.setFromUserName(toUserName);  
	    	    	            textMessage.setCreateTime(new Date().getTime());  
	    	    	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	    	    	            textMessage.setContent("您上课签到已成功！请在下课后进行签到！");  
	    	    	            respMessage =  MessageUtil.textMessageToXml(textMessage);
	        				}else{
	        					String xh = list.get(0).getXh();
	        					XfStudyRegistrationEntity entity_ = new XfStudyRegistrationEntity();
	        					entity_.setXh(xh);
	        					entity_.setIsvalid("2");
	        					entity_.setPosition(nowTime);
	        					ExcuteResult result;
	        					result = xfStudyRegistrationService.updateXfStudyRegistrationByPrimaryKeySelective(entity_);
	        					if(result.getReturnCode().equals("1")){
	        						TextMessage textMessage = new TextMessage(); 
		    	    	    		textMessage.setToUserName(fromUserName);  
		    	    	            textMessage.setFromUserName(toUserName);  
		    	    	            textMessage.setCreateTime(new Date().getTime());  
		    	    	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
		    	    	            textMessage.setContent("恭喜【"+couEntity.getCourseName()+"】在【"+username+"】活动中下课签到成功！"); 
		    	    	            respMessage =  MessageUtil.textMessageToXml(textMessage);
	        					}else{
	        						TextMessage textMessage = new TextMessage(); 
		    	    	    		textMessage.setToUserName(fromUserName);  
		    	    	            textMessage.setFromUserName(toUserName);  
		    	    	            textMessage.setCreateTime(new Date().getTime());  
		    	    	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
		    	    	            textMessage.setContent("【"+username+"】于【"+couEntity.getCourseName()+"】活动中下课签到失败！");  
		    	    	            respMessage =  MessageUtil.textMessageToXml(textMessage);
	        					}
	        				}
	        			}else if(list.size()==0){
//	        				if(Studycount>=coursecount){
//	            				TextMessage textMessage = new TextMessage(); 
//	            	    		textMessage.setToUserName(fromUserName);  
//	            	            textMessage.setFromUserName(toUserName);  
//	            	            textMessage.setCreateTime(new Date().getTime());  
//	            	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
//	            	            textMessage.setContent("本活动签到人数已满！");  
//	            	            respMessage =  MessageUtil.textMessageToXml(textMessage);
//	            			}
//	        				else 
	        				if(date.getTime()>btenddate.getTime()){
	                			TextMessage textMessage = new TextMessage(); 
	            	    		textMessage.setToUserName(fromUserName);  
	            	            textMessage.setFromUserName(toUserName);  
	            	            textMessage.setCreateTime(new Date().getTime());  
	            	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	            	            textMessage.setContent("对不起，没有您的上课打卡记录，不能进行下课打卡！");  
	            	            respMessage =  MessageUtil.textMessageToXml(textMessage);
	                		}
	        				else{
	            				ExcuteResult result;
	            				XfStudyRegistrationEntity studyentity = xfStudyRegistrationService.selectXfStudyRegistrationByPrimaryKey(courseId+"-"+bindinfo.getYitongCard());
	        					if(studyentity==null){
	        						result = xfStudyRegistrationService.insertXfStudyRegistration(entity);
	        					}else{
	        						studyentity.setDakaTime(nowTime);
	        						studyentity.setAddYear(nowTime.substring(0,4));
	        						studyentity.setIsvalid("1");
	        						studyentity.setAddTime(studyentity.getAddTime().substring(0,10));
	        						studyentity.setIsgrant("1");
	        						if(date.getTime()>btbegindate.getTime()){
	        							studyentity.setAwardstate("1");
	        	        			}else{
	        	        				studyentity.setAwardstate("0");
	        	        			}
	        						result = xfStudyRegistrationService.updateXfStudyRegistrationByPrimaryKeySelective(studyentity);
	        					}
	            				if(result.getReturnCode().equals("1")){
	            					TextMessage textMessage = new TextMessage(); 
	            					textMessage.setToUserName(fromUserName);  
	            					textMessage.setFromUserName(toUserName);  
	            					textMessage.setCreateTime(new Date().getTime());  
	            					textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	            					textMessage.setContent("【"+username+"】在【"+couEntity.getCourseName()+"】活动中上课签到成功。请您在下课后进行签到！");  
	            					respMessage =  MessageUtil.textMessageToXml(textMessage);
	            				}else{
	            					TextMessage textMessage = new TextMessage(); 
	            					textMessage.setToUserName(fromUserName);  
	            					textMessage.setFromUserName(toUserName);  
	            					textMessage.setCreateTime(new Date().getTime());  
	            					textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	            					textMessage.setContent("【"+username+"】在【"+couEntity.getCourseName()+"】活动中签到失败！");  
	            					respMessage =  MessageUtil.textMessageToXml(textMessage);
	            				}
	            			}
	        			}
        			}
        		}
        	}
    	} catch (Exception e) {
			e.printStackTrace();
		}
		return respMessage;
	}
	/**
	 * 扫码签到-理论课(ywq)
	 * @param fromUserName
	 * @param EventKey
	 * @param clientsxh
	 * @param toUserName
	 * @param empjd
	 * @param empwd
	 * @param request
	 * @return
	 */
	public String Coursesignin(String times, String courseId,String fromUserName,String clientsxh,String toUserName,HttpServletRequest request){
		String respMessage = null;
		String openId = fromUserName;
		WechatBindEntity bindinfo = wechatBindService.getBindInfo(openId, clientsxh);
		long dktime = System.currentTimeMillis()/1000;
		long sctime = Long.valueOf(times);
		long timec = dktime-sctime;
		try {
			FrmSysparaTypeKey dakatimekey = new FrmSysparaTypeKey();
			dakatimekey.setXtlb("00");
			dakatimekey.setGjz("dakatimes");
			FrmSysparaTypeEntity dakatimeentity = FrmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(dakatimekey);
			String dakatimes = dakatimeentity.getMrz();
			long dakatime = Long.valueOf(dakatimes);
			System.out.println("==================================timec="+timec+"------------------dakatime="+dakatime+"======================");
			if(timec>dakatime){
				TextMessage textMessage = new TextMessage(); 
	    		textMessage.setToUserName(fromUserName);  
	            textMessage.setFromUserName(toUserName);  
	            textMessage.setCreateTime(new Date().getTime());  
	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	            textMessage.setContent("您已超出二维码有效时间，打卡失败。");  
	            respMessage =  MessageUtil.textMessageToXml(textMessage);
			}else if(bindinfo==null){
        		TextMessage textMessage = new TextMessage(); 
	    		textMessage.setToUserName(fromUserName);  
	            textMessage.setFromUserName(toUserName);  
	            textMessage.setCreateTime(new Date().getTime());  
	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	            textMessage.setContent("您的个人信息有问题。请您在【我的医通卡】中取消绑定，然后取消关注该公众号，然后重新关注该公众号！");  
	            respMessage =  MessageUtil.textMessageToXml(textMessage);
        	}else if(!bindinfo.getState().equals("2")){
        		TextMessage textMessage = new TextMessage(); 
	    		textMessage.setToUserName(fromUserName);  
	            textMessage.setFromUserName(toUserName);  
	            textMessage.setCreateTime(new Date().getTime());  
	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	            textMessage.setContent(Constant.JHGN_JYRZTS);  
	            respMessage =  MessageUtil.textMessageToXml(textMessage);
        	}else{
        		JxCourseArrangeEntity couEntity = jxCourseArrangeService.selectJxCourseArrangeByPrimaryKey(courseId);
        		JxCoursePlanEntity plan = jxCoursePlanService.selectJxCoursePlanByPrimaryKey(couEntity.getCoursenum());
        		JxStudentsEntity stuEntity = jxStudentsService.selectJxStudentsByPrimaryKey(bindinfo.getYitongCard());
        		String username = stuEntity.getName();
    			DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
    			Date date = new Date();
    			Date btbegindate = sdf.parse(couEntity.getSkdate().substring(0,10)+" "+couEntity.getShtime().split("~")[0]);  //开始时间
    			Date btenddate = sdf.parse(couEntity.getSkdate().substring(0,10)+" "+couEntity.getShtime().split("~")[1]);  //结束时间
    			String sksj = couEntity.getSkdate().substring(0,10)+" "+couEntity.getShtime().split("~")[0];
    			String xksj = couEntity.getSkdate().substring(0,10)+" "+couEntity.getShtime().split("~")[1];
    			String nowTime = sdf.format(new Date());
    			JxStudyRegistrationEntity entity = new JxStudyRegistrationEntity();
        		if(date.getTime()<btbegindate.getTime()-30*60000||date.getTime()>btenddate.getTime()+30*60000){
        			TextMessage textMessage = new TextMessage(); 
    	    		textMessage.setToUserName(fromUserName);  
    	            textMessage.setFromUserName(toUserName);  
    	            textMessage.setCreateTime(new Date().getTime());  
    	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
    	            textMessage.setContent("请在活动规定时间内进行签到！     （上课时间："+sksj+"下课时间："+xksj);  
    	            respMessage =  MessageUtil.textMessageToXml(textMessage);
        		}else{
        			String xh_ = UUID.randomUUID().toString().replaceAll("-", "");
        			entity.setXh(xh_);
        			entity.setCourseId(courseId);
        			entity.setStuid(bindinfo.getYitongCard());
        			entity.setStuname(stuEntity.getName());
        			entity.setDeptId(stuEntity.getGraduateschool());
        			FrmCodeKey codekey = new FrmCodeKey();
        			codekey.setXtlb("00");
        			codekey.setDmlb("1676");
        			codekey.setDmz(stuEntity.getGraduateschool());
        			FrmCodeEntity code = frmCodeService.selectFrmCodeByPrimaryKey(codekey);
        			entity.setDeptName(code.getDmmc());
        			entity.setCourseName(couEntity.getCoursename());
        			entity.setPlaceName(plan.getJxshkdid());
        			entity.setPosition("");
        			entity.setUptime(nowTime);
        			entity.setAddYear(nowTime.substring(0,4));
        			entity.setIsgrant("0");
        			entity.setIsvalid("1");
        			entity.setState("0");
        			entity.setAddTime(nowTime);
        			entity.setGxsj(nowTime);
        			JxStudyRegistrationSqlWhere sqlWhere = new JxStudyRegistrationSqlWhere();
        			sqlWhere.setCourseId(courseId);
        			sqlWhere.setStuid(bindinfo.getYitongCard());
        			List<JxStudyRegistrationEntity> list = jxStudyRegistrationService.selectListJxStudyRegistrationBySqlWhere(sqlWhere);
        			if(date.getTime()>btbegindate.getTime()){
        				entity.setAwardstate("1");
        			}else{
        				entity.setAwardstate("0");
        			}
        			FrmSysparaTypeKey systypekey = new FrmSysparaTypeKey();
        			systypekey.setXtlb("00");
        			systypekey.setGjz("llkchecknumber");
        			FrmSysparaTypeEntity systype = FrmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(systypekey);
        			String checknumber = systype.getMrz();
        			if(checknumber.equals("1")){
        				if(list.size()>0){
        					TextMessage textMessage = new TextMessage(); 
    	    	    		textMessage.setToUserName(fromUserName);  
    	    	            textMessage.setFromUserName(toUserName);  
    	    	            textMessage.setCreateTime(new Date().getTime());  
    	    	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
    	    	            textMessage.setContent("【"+couEntity.getCoursename()+"】您已上课签到成功，请勿重复签到！");  
    	    	            respMessage =  MessageUtil.textMessageToXml(textMessage);
        				}else if(date.getTime()>btenddate.getTime()+40*60000){
                			TextMessage textMessage = new TextMessage(); 
            	    		textMessage.setToUserName(fromUserName);  
            	            textMessage.setFromUserName(toUserName);  
            	            textMessage.setCreateTime(new Date().getTime());  
            	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
            	            textMessage.setContent("对不起，本次课程已结束！");  
            	            respMessage =  MessageUtil.textMessageToXml(textMessage);
                		}else{
        					ExcuteResult result;
        					result = jxStudyRegistrationService.insertJxStudyRegistration(entity);
        					if(result.getReturnCode().equals("1")){
        						TextMessage textMessage = new TextMessage(); 
	    	    	    		textMessage.setToUserName(fromUserName);  
	    	    	            textMessage.setFromUserName(toUserName);  
	    	    	            textMessage.setCreateTime(new Date().getTime());  
	    	    	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	    	    	            textMessage.setContent("恭喜【"+username+"】在【"+couEntity.getCoursename()+"】活动中签到成功！");  
	    	    	            respMessage =  MessageUtil.textMessageToXml(textMessage);
        					}else{
        						TextMessage textMessage = new TextMessage(); 
	    	    	    		textMessage.setToUserName(fromUserName);  
	    	    	            textMessage.setFromUserName(toUserName);  
	    	    	            textMessage.setCreateTime(new Date().getTime());  
	    	    	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	    	    	            textMessage.setContent("【"+username+"】在【"+couEntity.getCoursename()+"】活动中签到失败，请联系管理员！");  
	    	    	            respMessage =  MessageUtil.textMessageToXml(textMessage);
        					}
        				}
        			}else if(checknumber.equals("2")){
        				if(list.size()==1){
	        				if(date.getTime()<btenddate.getTime()){
	        					TextMessage textMessage = new TextMessage(); 
	    	    	    		textMessage.setToUserName(fromUserName);  
	    	    	            textMessage.setFromUserName(toUserName);  
	    	    	            textMessage.setCreateTime(new Date().getTime());  
	    	    	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	    	    	            textMessage.setContent("您的上课签到已成功！请在下课后进行签到！");  
	    	    	            respMessage =  MessageUtil.textMessageToXml(textMessage);
	        				}else{
	        					String xh = list.get(0).getXh();
	        					JxStudyRegistrationEntity entity_ = new JxStudyRegistrationEntity();
	        					entity_.setXh(xh);
	        					entity_.setIsvalid("2");
	        					entity_.setDowntime(nowTime);
	        					ExcuteResult result;
	        					result = jxStudyRegistrationService.updateJxStudyRegistrationByPrimaryKeySelective(entity_);
	        					if(result.getReturnCode().equals("1")){
	        						TextMessage textMessage = new TextMessage(); 
		    	    	    		textMessage.setToUserName(fromUserName);  
		    	    	            textMessage.setFromUserName(toUserName);  
		    	    	            textMessage.setCreateTime(new Date().getTime());  
		    	    	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
		    	    	            textMessage.setContent("恭喜【"+couEntity.getCoursename()+"】在【"+username+"】活动中下课签到成功！"); 
		    	    	            respMessage =  MessageUtil.textMessageToXml(textMessage);
	        					}else{
	        						TextMessage textMessage = new TextMessage(); 
		    	    	    		textMessage.setToUserName(fromUserName);  
		    	    	            textMessage.setFromUserName(toUserName);  
		    	    	            textMessage.setCreateTime(new Date().getTime());  
		    	    	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
		    	    	            textMessage.setContent("【"+username+"】于【"+couEntity.getCoursename()+"】活动中下课签到失败！");  
		    	    	            respMessage =  MessageUtil.textMessageToXml(textMessage);
	        					}
	        				}
	        			}else if(list.size()==0){
	        				if(date.getTime()>btenddate.getTime()){
	                			TextMessage textMessage = new TextMessage(); 
	            	    		textMessage.setToUserName(fromUserName);  
	            	            textMessage.setFromUserName(toUserName);  
	            	            textMessage.setCreateTime(new Date().getTime());  
	            	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	            	            textMessage.setContent("对不起，没有您的上课打卡记录，不能进行下课打卡！");  
	            	            respMessage =  MessageUtil.textMessageToXml(textMessage);
	                		}else{
	            				ExcuteResult result;
	            				result = jxStudyRegistrationService.insertJxStudyRegistration(entity);
	            				if(result.getReturnCode().equals("1")){
	            					TextMessage textMessage = new TextMessage(); 
	            					textMessage.setToUserName(fromUserName);  
	            					textMessage.setFromUserName(toUserName);  
	            					textMessage.setCreateTime(new Date().getTime());  
	            					textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	            					textMessage.setContent("恭喜【"+username+"】在【"+couEntity.getCoursename()+"】活动中上课签到成功。请您不要忘记在下课后进行签到！");  
	            					respMessage =  MessageUtil.textMessageToXml(textMessage);
	            				}else{
	            					TextMessage textMessage = new TextMessage(); 
	            					textMessage.setToUserName(fromUserName);  
	            					textMessage.setFromUserName(toUserName);  
	            					textMessage.setCreateTime(new Date().getTime());  
	            					textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	            					textMessage.setContent("【"+username+"】在【"+couEntity.getCoursename()+"】活动中签到失败！");  
	            					respMessage =  MessageUtil.textMessageToXml(textMessage);
	            				}
	            			}
	        			}
        			}
        		}
        	}
    	} catch (Exception e) {
			e.printStackTrace();
		}
		return respMessage;
	}
}
