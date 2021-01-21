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
			fromUserName = resultmap.get("FromUserName");//�û��˺�  
		}else if(wxtype.equals("3")){
			fromUserName = openid;//�û��˺�  
		}
		String Longitude = resultmap.get("Longitude");//����
		String Latitude = resultmap.get("Latitude");//ά��
		System.out.println("-------------------------------����="+Longitude+"ά��="+Latitude+"-------------------------------------");
		ServletContext application = request.getSession().getServletContext();
		application.setAttribute(fromUserName, Longitude+"/"+Latitude);
        String toUserName = resultmap.get("ToUserName");  // �����ʺ�  
        int conuntuser = 0;
        System.out.println("*******************************"+!eventType.toUpperCase().equals(MessageUtil.EVENT_TYPE_SCAN));
        if(clientsxh.equals("6201001002")&&!eventType.toUpperCase().equals(MessageUtil.EVENT_TYPE_SCAN)){
			return newService(resultmap,clientsxh, request, openid, wxtype);
		}
        /*******************************��ȡ��Դ·����ʼ*********************************************/
        String RES_PATH= "";
    	WechatSysparamSqlWhere _p=new WechatSysparamSqlWhere();
    	_p.setClientsxh(clientsxh);
    	_p.setGjz("RES_PATH");
    	WechatSysparamEntity p=wechatSysparamService.selectWechatSysparamByPrimaryKey(_p);
    	if(p != null){//�жϲ������Ƿ���ֵ
    		 RES_PATH=p.getDmz();
    	}
    	/*******************************��ȡ��Դ·������*********************************************/
    	System.out.println("---------------------------------openid="+fromUserName+"-----------------------------------------------clientsxh="+clientsxh);
        if(eventType.toUpperCase().equals(MessageUtil.EVENT_TYPE_SCAN)){//�����ʺ�ǩ��
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
        	//��ע
        	WechatBindKey key =new WechatBindKey();
    		key.setOpenId(fromUserName);
    		key.setClientsxh(clientsxh);
    		WechatBindEntity bind = wechatBindService.selectWechatBindByPrimaryKey(key);
    		if(bind == null){
    			System.out.println("--------------------------------------------------���뷽��һ");
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
	    			System.out.println("û����ɹ���"+resultbing.getExcepMessage());
	    		}
    		}else if(bind != null && bind.getYitongCard()==null){
    			System.out.println("--------------------------------------------------���뷽����");
    			WechatBindEntity entity1 = new WechatBindEntity();
            	entity1.setOpenId(fromUserName);
        		entity1.setClientsxh(clientsxh);
        		entity1.setState("1");
            	wechatBindService.updateWechatBindByPrimaryKeySelective(entity1);
    		}else{
    			System.out.println("--------------------------------------------------���뷽����");
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
        //ȡ����ע
        	WechatBindEntity entity1 = new WechatBindEntity();
        	entity1.setOpenId(fromUserName);
    		entity1.setClientsxh(clientsxh);
    		entity1.setState("0");
        	wechatBindService.updateWechatBindByPrimaryKeySelective(entity1);
        }else if (eventType.toUpperCase().equals(MessageUtil.EVENT_TYPE_CLICK)){
        //����click��ť�¼�
        	String eventKey = resultmap.get("EventKey");
        	/***********��ȡ�󶨱�ʼ***************/
        	WechatBindKey key =new WechatBindKey();
    		key.setOpenId(fromUserName);
    		key.setClientsxh(clientsxh);
    		WechatBindEntity gzyh=wechatBindService.selectWechatBindByPrimaryKey(key);
    		/***********��ȡ�󶨱����***************/
    		
    		//״̬ 0��ȡ����ע 1���ѹ�ע 2���Ѱ� 3��ȡ����
        	List<WechatMenuinfoEntity> nenulist = Constant.WECHAT_MENULIST;
        	if(nenulist != null && nenulist.size() > 0){
        		for(WechatMenuinfoEntity w:nenulist){
        			if(w.getMenuid().subSequence(0, 10).equals(clientsxh)){
	        			if(eventKey.equalsIgnoreCase(w.getMenukey())){//�ж��ǵ�ǰ��Ҫ���͵���Ϣ
	        				//״̬ 0��ȡ����ע 1���ѹ�ע 2���Ѱ� 3��ȡ����
	    					//Ȩ�� 0����󶨾Ϳ�ʹ�� 1����󶨲���ʹ�� 2����Ա��ʹ��
	    					if((gzyh == null ||gzyh.getState()==null||!gzyh.getState().equals("2")) && w.getPower()!=null&&(w.getPower().equals("1") ||w.getPower().equals("2"))){//��ʾ�Ȱ�ҽͨ��
	    						TextMessage textMessage = new TextMessage(); 
	    			    		textMessage.setToUserName(fromUserName);  
	    			            textMessage.setFromUserName(toUserName);  
	    			            textMessage.setCreateTime(new Date().getTime());  
	    			            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	    			            textMessage.setContent(Constant.JHGN_JYRZTS);  
	    			            respMessage =  MessageUtil.textMessageToXml(textMessage);
	    					}else if(gzyh != null && (gzyh.getIsAdmin()==null||!gzyh.getIsAdmin().equals("1")) &&w.getPower()!=null&& w.getPower().equals("2") ){//��ʾֻ�й���Ա�ſ���ʹ�ø�Ȩ��
	    						TextMessage textMessage = new TextMessage(); 
	            				textMessage.setToUserName(fromUserName);  
	            				textMessage.setFromUserName(toUserName);  
	            				textMessage.setCreateTime(new Date().getTime());  
	            				textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	            				textMessage.setContent(Constant.JHGN_GLYQX);  
	            				respMessage =  MessageUtil.textMessageToXml(textMessage);
	    					}else{//���������Ƴ�������Ϣ
		    					NewsMessage newmsg=new NewsMessage();
		                		List<Article> _list = new ArrayList<Article>();
		        				//if(w.getMenuvalue()!=null){//��Ŀ¼����Ŀ¼
		            				//��Ŀ¼ͼƬ
		            				Article _art = new Article();
		            				_art.setTitle(w.getMenuname());
		            				_art.setDescription("");
		            				_art.setPicUrl(RES_PATH+w.getImageurl());
		            				if(w.getMenuurl()!=null&&!w.getMenuurl().trim().equals("")){
		            					_art.setUrl(RES_PATH+w.getMenuurl()+"&clientsxh="+clientsxh+"&openid="+fromUserName+"&menuid="+w.getMenuid());
		            				}
		            				_list.add(_art);
		        					String allmenu = w.getMenuvalue();//ȡ��Ŀ¼
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
                textMessage.setContent("�ù�������ά���У��޷�ʹ�á���");  
                respMessage =  MessageUtil.textMessageToXml(textMessage);
        	}
        	}
		return respMessage;
	}
	
	//�ж�Ժ΢���õ�
	public String newService(Map<String, String> resultmap,String clientsxh,HttpServletRequest request,String openid,String wxtype){
		String eventType = resultmap.get("Event");     //΢�������¼�����
		String EventKey = resultmap.get("EventKey");   //�¼��ؼ���
		String fromUserName = resultmap.get("FromUserName"); //�����ԣ��û��˺�  ;
		String toUserName = resultmap.get("ToUserName");  // ��Ŀ�ģ����ں��˺�  
		String respMessage = null; //��������
		String yhlb = null;  //�û����  1ҽԺ�û�  2�����û���ѧԱ��
		/*******************************��ȡ��Դ·����ʼ*********************************************/
        String RES_PATH= "";
    	WechatSysparamKey param=new WechatSysparamKey();
    	param.setClientsxh(clientsxh);
    	System.out.println("clientsxh"+clientsxh+"-----------------------------------------------------");
    	param.setGjz("RES_PATH");
    	WechatSysparamEntity p=wechatSysparamService.selectWechatSysparamByPrimaryKey(param);
    	if(p != null){//�жϲ������Ƿ���ֵ
    		 RES_PATH=p.getDmz();
    	}
    	System.out.println("RES_PATH="+RES_PATH+"-------------------------------------------------------");
    	/*******************************��ȡ��Դ·������*********************************************/
    	
    	/***********��ȡ�󶨱�ʼ***************/
    	WechatBindKey key =new WechatBindKey();
		key.setOpenId(fromUserName);
		key.setClientsxh(clientsxh);
		WechatBindEntity bind=wechatBindService.selectWechatBindByPrimaryKey(key);
		/***********��ȡ�󶨱����***************/
		//===========================================��ע΢�Ź��ں��¼�(��ע�󣬵����󶨿�)==================================================
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
    		/****************************************����ע���󶨿�ʼ***********************************************/
    		return creatNewsMessage(clientsxh,fromUserName,toUserName,RES_PATH,p,"ע���","ѧԱ��ע�ᣬҽ����Ա�����Ϣ��");
			/****************************************����ע���󶨽���***********************************************/
    	}
    	//=================================================����󶨱�Ϊ�գ����������°�=============================================================
    	if(bind==null){
    		return creatTextMessage(fromUserName, toUserName,"��Ǹ����ע��Ϣ��ʧ�ˣ���ȡ����ע�����¹�ע��");
    	}
    	/*******************************************************����ע���󶨽���***********************************************/
    	//======================================================ȡ����ע�¼�==============================================================
    	if(eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)){
    		wechatBindService.deleteWechatBindByPrimaryKey(key);  //ɾ���󶨱��¼
    		return null;
    	}
    	/***************************************************ȡ���󶨽���***********************************************/
    	//=====================================================�����¼���click��==============================================
    	if (eventType.toUpperCase().equals(MessageUtil.EVENT_TYPE_CLICK)){
    		if(bind.getYhlb()==null||"".equals(bind.getYhlb())){ //��ȡ�û�������Ϊ�գ�û�а���Ϣ��⣩
    			return creatNewsMessage(clientsxh,fromUserName,toUserName,RES_PATH,p,"ע���","ѧԱ��ע�ᣬҽ����Ա�����Ϣ����");
    		}else{
    			if(bind.getYhlb().equals("1")){   //�����ѧ��
    				if(bind.getYitongCard()!=null&&!bind.getYitongCard().equals("")){
    					JxStudentsEntity student = jxStudentsService.selectJxStudentsByPrimaryKey(bind.getYitongCard());
    					if(student.getState()!=null&&!student.getState().equals("2")){ //δ��˻���˲�ͨ��
    						return creatNewsMessage(clientsxh,fromUserName,toUserName,RES_PATH,p,"ע��δ���","ѧԱע����Ϣδ��˻���˲�ͨ����");
    					}
    				}else{ //����ѧ������Ϊ��
    					return creatNewsMessage(clientsxh,fromUserName,toUserName,RES_PATH,p,"ע���","ѧԱ��ע�ᣬҽ����Ա�����Ϣ������");
    				}
    			}else if(bind.getYhlb().equals("2")){  //�������ʦ
    				
    			}
    			yhlb = bind.getYhlb();
    		}
//    		List<WechatMenuinfoEntity> menulist = Constant.WECHAT_MENULIST;
    		WechatMenuinfoSqlWhere menusqlWhere = new WechatMenuinfoSqlWhere();
    		menusqlWhere.setMenuid(clientsxh);
    		List<WechatMenuinfoEntity> menulist = wechatMenuinfoService.selectListWechatMenuinfoBySqlWhere(menusqlWhere);
    		if(menulist != null && menulist.size() > 0){
        		for(WechatMenuinfoEntity currentMenu:menulist){
        			if(EventKey.equalsIgnoreCase(currentMenu.getMenukey())){//�ж��ǵ�ǰ��Ҫ���͵���Ϣ
        				if(yhlb.equals("1")){  //ѧԱʹ����ҽ����Ա����ذ�ť
        					if(!bind.getIsAdmin().equals("1")&&"3".equals(currentMenu.getPower())){
        						return creatTextMessage(fromUserName, toUserName,"�ù��ܽ��ް೤ʹ�ã�");
        					}
        					if("2".equals(currentMenu.getPower())){
        						return creatTextMessage(fromUserName, toUserName,"��Ǹ��������ҽ�������Ա��");
        					}
        				}
        				if(yhlb.equals("2")&&!"2".equals(currentMenu.getPower())){
        					return creatTextMessage(fromUserName, toUserName,"��Ǹ��������ѧԱ��");
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
    					String allmenu = currentMenu.getMenuvalue();//ȡ��Ŀ¼
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
    	/**********************************************************�����¼�����**********************************************************/
		return null;
	}
	
	//��������ע��Ͱ���Ϣ
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
	
	//��������������
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
	 * ɨ��ǩ��-�̽�(ywq)
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
	            textMessage.setContent("���ѳ�����ά����Чʱ�䣬��ʧ�ܡ�");  
	            respMessage =  MessageUtil.textMessageToXml(textMessage);
			}
			else if(bindinfo==null){
        		TextMessage textMessage = new TextMessage(); 
	    		textMessage.setToUserName(fromUserName);  
	            textMessage.setFromUserName(toUserName);  
	            textMessage.setCreateTime(new Date().getTime());  
	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	            textMessage.setContent("���ĸ�����Ϣ�����⡣�����ڡ��ҵ�ҽͨ������ȡ���󶨣�Ȼ��ȡ����ע�ù��ںţ�Ȼ�����¹�ע�ù��ںţ�");  
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
        		int coursecount = Integer.valueOf(couEntity.getEduObjCount());//��������
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
    			Date btbegindate = sdf.parse(couEntity.getStartDate());  //��ʼʱ��
    			Date btenddate = sdf.parse(couEntity.getEndDate());  //����ʱ��
    			String nowTime = sdf.format(new Date());
    			XfStudyRegistrationEntity entity = new XfStudyRegistrationEntity();
        		if(signup_cs.equals("2") && sigentity==null){
        			TextMessage textMessage = new TextMessage(); 
    	    		textMessage.setToUserName(fromUserName);  
    	            textMessage.setFromUserName(toUserName);  
    	            textMessage.setCreateTime(new Date().getTime());  
    	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
    	            textMessage.setContent("��û�жԱ�������б�����");  
    	            respMessage =  MessageUtil.textMessageToXml(textMessage);
        		}
        		else if(date.getTime()<btbegindate.getTime()-30*60000||date.getTime()>btenddate.getTime()+30*60000){
        			TextMessage textMessage = new TextMessage(); 
    	    		textMessage.setToUserName(fromUserName);  
    	            textMessage.setFromUserName(toUserName);  
    	            textMessage.setCreateTime(new Date().getTime());  
    	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
    	            textMessage.setContent("���ڻ�涨ʱ���ڽ���ǩ����     ���Ͽ�ʱ�䣺"+couEntity.getStartDate().substring(0,19)+"�¿�ʱ�䣺"+couEntity.getEndDate().substring(0,19));  
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
    	    	            textMessage.setContent("��"+couEntity.getCourseName()+"�������Ͽ�ǩ���ɹ��������ظ�ǩ����");  
    	    	            respMessage =  MessageUtil.textMessageToXml(textMessage);
        				}
//        				else if(Studycount>=coursecount){
//            				TextMessage textMessage = new TextMessage(); 
//            	    		textMessage.setToUserName(fromUserName);  
//            	            textMessage.setFromUserName(toUserName);  
//            	            textMessage.setCreateTime(new Date().getTime());  
//            	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
//            	            textMessage.setContent("���ǩ������������");  
//            	            respMessage =  MessageUtil.textMessageToXml(textMessage);
//            			}
        				else if(date.getTime()>btenddate.getTime()+40*60000){
                			TextMessage textMessage = new TextMessage(); 
            	    		textMessage.setToUserName(fromUserName);  
            	            textMessage.setFromUserName(toUserName);  
            	            textMessage.setCreateTime(new Date().getTime());  
            	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
            	            textMessage.setContent("�Բ��𣬸û�ѽ�����");  
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
	    	    	            textMessage.setContent("��ϲ��"+username+"���ڡ�"+couEntity.getCourseName()+"�����ǩ���ɹ���");  
	    	    	            respMessage =  MessageUtil.textMessageToXml(textMessage);
        					}else{
        						TextMessage textMessage = new TextMessage(); 
	    	    	    		textMessage.setToUserName(fromUserName);  
	    	    	            textMessage.setFromUserName(toUserName);  
	    	    	            textMessage.setCreateTime(new Date().getTime());  
	    	    	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	    	    	            textMessage.setContent("��"+username+"���ڡ�"+couEntity.getCourseName()+"�����ǩ��ʧ�ܣ�");  
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
	    	    	            textMessage.setContent("���Ͽ�ǩ���ѳɹ��������¿κ����ǩ����");  
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
		    	    	            textMessage.setContent("��ϲ��"+couEntity.getCourseName()+"���ڡ�"+username+"������¿�ǩ���ɹ���"); 
		    	    	            respMessage =  MessageUtil.textMessageToXml(textMessage);
	        					}else{
	        						TextMessage textMessage = new TextMessage(); 
		    	    	    		textMessage.setToUserName(fromUserName);  
		    	    	            textMessage.setFromUserName(toUserName);  
		    	    	            textMessage.setCreateTime(new Date().getTime());  
		    	    	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
		    	    	            textMessage.setContent("��"+username+"���ڡ�"+couEntity.getCourseName()+"������¿�ǩ��ʧ�ܣ�");  
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
//	            	            textMessage.setContent("���ǩ������������");  
//	            	            respMessage =  MessageUtil.textMessageToXml(textMessage);
//	            			}
//	        				else 
	        				if(date.getTime()>btenddate.getTime()){
	                			TextMessage textMessage = new TextMessage(); 
	            	    		textMessage.setToUserName(fromUserName);  
	            	            textMessage.setFromUserName(toUserName);  
	            	            textMessage.setCreateTime(new Date().getTime());  
	            	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	            	            textMessage.setContent("�Բ���û�������Ͽδ򿨼�¼�����ܽ����¿δ򿨣�");  
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
	            					textMessage.setContent("��"+username+"���ڡ�"+couEntity.getCourseName()+"������Ͽ�ǩ���ɹ����������¿κ����ǩ����");  
	            					respMessage =  MessageUtil.textMessageToXml(textMessage);
	            				}else{
	            					TextMessage textMessage = new TextMessage(); 
	            					textMessage.setToUserName(fromUserName);  
	            					textMessage.setFromUserName(toUserName);  
	            					textMessage.setCreateTime(new Date().getTime());  
	            					textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	            					textMessage.setContent("��"+username+"���ڡ�"+couEntity.getCourseName()+"�����ǩ��ʧ�ܣ�");  
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
	 * ɨ��ǩ��-���ۿ�(ywq)
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
	            textMessage.setContent("���ѳ�����ά����Чʱ�䣬��ʧ�ܡ�");  
	            respMessage =  MessageUtil.textMessageToXml(textMessage);
			}else if(bindinfo==null){
        		TextMessage textMessage = new TextMessage(); 
	    		textMessage.setToUserName(fromUserName);  
	            textMessage.setFromUserName(toUserName);  
	            textMessage.setCreateTime(new Date().getTime());  
	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	            textMessage.setContent("���ĸ�����Ϣ�����⡣�����ڡ��ҵ�ҽͨ������ȡ���󶨣�Ȼ��ȡ����ע�ù��ںţ�Ȼ�����¹�ע�ù��ںţ�");  
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
    			Date btbegindate = sdf.parse(couEntity.getSkdate().substring(0,10)+" "+couEntity.getShtime().split("~")[0]);  //��ʼʱ��
    			Date btenddate = sdf.parse(couEntity.getSkdate().substring(0,10)+" "+couEntity.getShtime().split("~")[1]);  //����ʱ��
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
    	            textMessage.setContent("���ڻ�涨ʱ���ڽ���ǩ����     ���Ͽ�ʱ�䣺"+sksj+"�¿�ʱ�䣺"+xksj);  
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
    	    	            textMessage.setContent("��"+couEntity.getCoursename()+"�������Ͽ�ǩ���ɹ��������ظ�ǩ����");  
    	    	            respMessage =  MessageUtil.textMessageToXml(textMessage);
        				}else if(date.getTime()>btenddate.getTime()+40*60000){
                			TextMessage textMessage = new TextMessage(); 
            	    		textMessage.setToUserName(fromUserName);  
            	            textMessage.setFromUserName(toUserName);  
            	            textMessage.setCreateTime(new Date().getTime());  
            	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
            	            textMessage.setContent("�Բ��𣬱��ογ��ѽ�����");  
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
	    	    	            textMessage.setContent("��ϲ��"+username+"���ڡ�"+couEntity.getCoursename()+"�����ǩ���ɹ���");  
	    	    	            respMessage =  MessageUtil.textMessageToXml(textMessage);
        					}else{
        						TextMessage textMessage = new TextMessage(); 
	    	    	    		textMessage.setToUserName(fromUserName);  
	    	    	            textMessage.setFromUserName(toUserName);  
	    	    	            textMessage.setCreateTime(new Date().getTime());  
	    	    	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	    	    	            textMessage.setContent("��"+username+"���ڡ�"+couEntity.getCoursename()+"�����ǩ��ʧ�ܣ�����ϵ����Ա��");  
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
	    	    	            textMessage.setContent("�����Ͽ�ǩ���ѳɹ��������¿κ����ǩ����");  
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
		    	    	            textMessage.setContent("��ϲ��"+couEntity.getCoursename()+"���ڡ�"+username+"������¿�ǩ���ɹ���"); 
		    	    	            respMessage =  MessageUtil.textMessageToXml(textMessage);
	        					}else{
	        						TextMessage textMessage = new TextMessage(); 
		    	    	    		textMessage.setToUserName(fromUserName);  
		    	    	            textMessage.setFromUserName(toUserName);  
		    	    	            textMessage.setCreateTime(new Date().getTime());  
		    	    	            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
		    	    	            textMessage.setContent("��"+username+"���ڡ�"+couEntity.getCoursename()+"������¿�ǩ��ʧ�ܣ�");  
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
	            	            textMessage.setContent("�Բ���û�������Ͽδ򿨼�¼�����ܽ����¿δ򿨣�");  
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
	            					textMessage.setContent("��ϲ��"+username+"���ڡ�"+couEntity.getCoursename()+"������Ͽ�ǩ���ɹ���������Ҫ�������¿κ����ǩ����");  
	            					respMessage =  MessageUtil.textMessageToXml(textMessage);
	            				}else{
	            					TextMessage textMessage = new TextMessage(); 
	            					textMessage.setToUserName(fromUserName);  
	            					textMessage.setFromUserName(toUserName);  
	            					textMessage.setCreateTime(new Date().getTime());  
	            					textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
	            					textMessage.setContent("��"+username+"���ڡ�"+couEntity.getCoursename()+"�����ǩ��ʧ�ܣ�");  
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
