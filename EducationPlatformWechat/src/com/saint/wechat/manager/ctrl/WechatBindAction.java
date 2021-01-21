package com.saint.wechat.manager.ctrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.saint.pub.Constant;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.services.imp.MessageUtil;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.pub.services.imp.WechatUtil;
import com.saint.pub.util.json.JsonUtil;
import com.saint.systemManager.bean.FrmSysparaTypeEntity;
import com.saint.systemManager.bean.FrmSysparaTypeKey;
import com.saint.systemManager.services.IFrmDepartmentService;
import com.saint.systemManager.services.IFrmSysparaTypeService;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatBindKey;
import com.saint.wechat.manager.bean.WechatClientinfoEntity;
import com.saint.wechat.manager.bean.XfCourseEntity;
import com.saint.wechat.manager.bean.XfCourseSignupEntity;
import com.saint.wechat.manager.bean.XfCourseSignupKey;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.bean.XfStudyRegistrationEntity;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.services.IWechatClientinfoService;
import com.saint.wechat.manager.services.IXfCourseService;
import com.saint.wechat.manager.services.IXfCourseSignupService;
import com.saint.wechat.manager.services.IXfEmployeeService;
import com.saint.wechat.manager.services.IXfStudyRegistrationService;
import com.saint.wechat.manager.sqlWhere.WechatBindSqlWhere;
import com.saint.wechat.manager.sqlWhere.XfEmployeeSqlWhere;
import com.saint.wechat.manager.sqlWhere.XfStudyRegistrationSqlWhere;
import com.saint.wechat.pojo.TextMessage;
import com.saint.wechat.service.GzyhService;
import com.saint.wechat.utils.Encryptutil;
import com.saint.wechat.utils.QRCodeUtil;
/**
 * ΢�Ű�action
 * @author Administrator
 *
 */
public class WechatBindAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;
    private ProcessResultImpl processResultImpl;
    private IWechatBindService wechatBindService;
    private GzyhService GzyhService; //΢�Ż�����Ϣ
    
    private IXfEmployeeService xfEmployeeService;
    private IFrmDepartmentService frmDepartmentService;
    
    private IWechatClientinfoService wechatClientinfoService;
    
    protected IXfCourseSignupService xfCourseSignupService;
    
    private IXfCourseService xfCourseService;
    
    private IXfStudyRegistrationService xfStudyRegistrationService;
    
    private IFrmSysparaTypeService frmSysparaTypeService;
    
    /**
     * ��ת����ҳ��
     * @param request
     * @param response
     * @return
     */
    public void toCreateAddPageWechatBind(HttpServletRequest request, HttpServletResponse response) {
    	response.setContentType("text/html; charset=utf-8");
        try {
        	String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	String state = "";
        	if(bindinfo==null){
        		state="1";
        	}else{
        		XfEmployeeEntity empEntity = xfEmployeeService.selectXfEmployeeByPrimaryKey(bindinfo.getYitongCard());
        		if(empEntity==null){
        			state="1";
        		}else{
        			state=bindinfo.getState();
        		}
        	}
        	if(state==null||state.equals("1")||state.equals("3")){
        		request.setAttribute("openid", openid);
        		request.setAttribute("clientsxh", clientsxh);
        		request.getRequestDispatcher("WEB-INF/pages/personal_information/ytcode_bind.jsp").forward(request, response);
        	}else{
        		request.setAttribute("openid", openid);
        		request.setAttribute("clientsxh", clientsxh);
        		request.getRequestDispatcher("WEB-INF/pages/tool/hint_bind.jsp").forward(request, response);
        	}
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    /**
     * ����usename��usernumber�ж��Ƿ�ƥ�䣬�����°󶨱���а�
     * ywq
     * @param openId
     * @param yitongCard
     * @param userName
     * @param response
     * @throws UnsupportedEncodingException 
     */
    
    
	public void YTcodeBind(HttpServletRequest request, HttpServletResponse response, WechatBindEntity entity) throws UnsupportedEncodingException {
        response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = null;
	    ExcuteResult result = new ExcuteResult();
	    String idcard = "";
	    String idytk = "";
	    Map<String, Object> resultMap = new HashMap<String, Object>();
	        try {
	            out = response.getWriter();
	            String wechatInfo = request.getParameter("wechatInfo");
	            wechatInfo = URLDecoder.decode(wechatInfo, "UTF-8");
	            entity = JsonUtil.json2Object(wechatInfo, WechatBindEntity.class);
	            WechatBindEntity tempentity = wechatBindService.getBindInfo(entity.getOpenId(),entity.getClientsxh());
	            WechatBindSqlWhere wbesqlWhere = new WechatBindSqlWhere();
	            wbesqlWhere.setYitongCard(entity.getYitongCard());
	            wbesqlWhere.setXm(entity.getXm());
	            List<WechatBindEntity> wbelist = wechatBindService.selectListWechatBindBySqlWhere(wbesqlWhere);
//	            WechatClientinfoEntity sysclientinfo = wechatClientinfoService.selectWechatClientinfoByPrimaryKey(entity.getClientsxh());  //��ȡ������Ϣ
//	            WechatBindKey keyentity = new WechatBindKey();
//            	keyentity.setOpenId(entity.getOpenId());
//            	keyentity.setClientsxh(entity.getClientsxh());
//            	WechatBindEntity tempentity = wechatBindService.selectWechatBindByPrimaryKey(keyentity);
//            	String accessToken = WechatUtil.getAccessToken(sysclientinfo.getAppid(), sysclientinfo.getAppsecret(), sysclientinfo.getWxtype()).getToken();
//	            String userid = WechatUtil.OpenidTouserid(entity.getOpenId(), accessToken);
//	            System.out.println(userid);
            	//״̬ 0��ȡ����ע 1���ѹ�ע 2���Ѱ� 3��ȡ����
            	if(wbelist.size()>0){
            		resultMap.put("errorMsg", "yjbind");
            	}else{
            		XfEmployeeSqlWhere xfemployeeSqlWhere = new XfEmployeeSqlWhere();
     	            xfemployeeSqlWhere.setUsername(entity.getXm());
     	            List<XfEmployeeEntity> entityList1 = null;
     	            if("1".equals(entity.getState())){  //ͨ�����֤��
     	            	idytk = entity.getYitongCard();
     	            	xfemployeeSqlWhere.setUsernumber(idytk);
 	 	            }
     	            if("2".equals(entity.getState())){  //ͨ�����֤��
  	 	            	idcard = entity.getYitongCard();
  	 	            	xfemployeeSqlWhere.setIdcard(idcard);
  	 	            }
  	            	entityList1 = xfEmployeeService.selectListXfEmployeeBySqlWhere(xfemployeeSqlWhere);
  	            	if(entityList1.size()==0){
  	            		 resultMap.put("errorMsg", "noperson"); //��Ա��û����Ա��Ϣ
  	            		 /*if(sysclientinfo.getWxtype().equals("1")){
  	            			resultMap.put("errorMsg", "noperson"); //��Ա��û����Ա��Ϣ
  	            		 }else if(sysclientinfo.getWxtype().equals("3")){
  	     	            	net.sf.json.JSONObject userinfo = WechatUtil.useridToUserInfo(userid, accessToken);
  	     	            	"name": "����",
  	     	               	"department": [1, 2],
  	     	              	"order": [1, 2],
  	     	              	"position": "��̨����ʦ",
  	     	              	"mobile": "15913215421",
  	     	              	"gender": "1",
  	     	            	System.out.println(userinfo.get("name")+","+userinfo.get("department")+","+userinfo.get("position")+","+userinfo.get("mobile")+","+userinfo.get("gender"));
  	     	            	String dateNowStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()); 
  	     	            	//������Ա��Ϣ
  	     	            	idytk = (idytk == null || idytk.equals(""))?idcard :idytk;
  	     	            	XfEmployeeEntity employeeEntity = new XfEmployeeEntity();
  	     	            	employeeEntity.setUsernumber(idytk);
  	     	            	employeeEntity.setIdcard(idcard);
  	     	            	employeeEntity.setUsername(userinfo.get("name").toString());
  	     	            	//employeeEntity.setDepart(userinfo.get("department").toString());
  	     	            	employeeEntity.setSex(userinfo.get("gender").toString());
  	     	            	employeeEntity.setUserphone(userinfo.get("mobile").toString());
  	     	            	employeeEntity.setUpdatetime(dateNowStr);
  	     	            	xfEmployeeService.insertXfEmployee(employeeEntity);
  	            			//�������Ϣ
  	     	            	//���ư�entity����
  		 	           		entity.setGxsj(dateNowStr);
  		 	           		entity.setCreateTime(dateNowStr);
  		 	           		entity.setSfzmhm(idcard);
  		 	           		entity.setYitongCard(idytk);
  		 	           		entity.setXm(userinfo.get("name").toString());
  		 	           		//entity.setDeptId();
  		 	           		entity.setIslqxx("0");
  		 	           		entity.setState("2");
  		 	           		entity.setIsAdmin("0");//��ʱ(�Ƿ����Ա)
  		 	           		entity.setYhlb("1");//��ʱ���Ƿ�ҽԺ��Ա��
  		 	           		if(tempentity == null){
  		 	           			result = wechatBindService.insertWechatBind(entity);
  		 	           		}else{
  		 	           			result = wechatBindService.updateWechatBindByPrimaryKey(entity);
  		 	           		}
   	            		 }*/
 	            	}else if(entityList1.size()>0 && !entityList1.get(0).getUsername().equals(entity.getXm())){
 	            		resultMap.put("errorMsg", "nameerror"); //��Ա������Ա��Ϣ������������ͬ
 	            	}else{
 	            		//���ư�entity����
 	            		String dateNowStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
 	            		XfEmployeeEntity employeeEntity = new XfEmployeeEntity();
 	            		employeeEntity.setUsernumber(entityList1.get(0).getUsernumber());
 	            		employeeEntity.setUpdatetime(dateNowStr);
 	            		employeeEntity.setUsertel(entity.getRemark2());
 	            		xfEmployeeService.updateXfEmployeeByPrimaryKeySelective(employeeEntity);
	 	           		entity.setGxsj(dateNowStr);
	 	           		entity.setYitongCard(entityList1.get(0).getUsernumber());
	 	           		entity.setSfzmhm(entityList1.get(0).getIdcard());
	 	           		entity.setDeptId(entityList1.get(0).getDepart());
	 	           		entity.setIslqxx("1");
	 	           		entity.setState("2");
	 	           		entity.setIsAdmin("0");//��ʱ(�Ƿ����Ա)
	 	           		entity.setYhlb("1");//��ʱ���Ƿ�ҽԺ��Ա��
	 	           		entity.setRemark1(entityList1.get(0).getYiyuan());
	 	           		if(tempentity == null){
	 	           			result = wechatBindService.insertWechatBind(entity);
	 	           		}else{
	 	           			result = wechatBindService.updateWechatBindByPrimaryKey(entity);
	 	           		}
	 	            }
  	            	if(result.getReturnCode() != null){
	  	            	if(result.getReturnCode().equals("1")){
	            			resultMap.put("errorMsg", "success");
	            		}else{
	            			resultMap.put("errorMsg", "failed");
	            		}	
  	            	}
  	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            resultMap.put("errorMsg", "error");
	        }finally{
	        	String json = new Gson().toJson(resultMap, new TypeToken<Map<String, Object>>(){}.getType());
				System.out.println(json);
				out.write(json);
	            if(out!=null)out.close();
	        }
	        
    }
	/**
	 * �鿴ҽͨ��������Ϣ
	 * @param request
	 * @param response
	 * @param key
	 * @return
	 */
    public void toBaseInfo(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //��ֵ����ҳ��
        try {
        	String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	
        	if(bindinfo==null){
        		request.getRequestDispatcher("WEB-INF/pages/tool/hint_bind1.jsp").forward(request, response);
        	}else{
        		XfEmployeeEntity empEntity = xfEmployeeService.selectXfEmployeeByPrimaryKey(bindinfo.getYitongCard());
        		if(empEntity==null||bindinfo.getState()==null||bindinfo.getState().equals("1")||bindinfo.getState().equals("3")){
        			request.getRequestDispatcher("WEB-INF/pages/tool/hint_bind1.jsp").forward(request, response);
        		}else{
        			String yiyuanName = frmDepartmentService.getDeptNamebyNumber(empEntity.getYiyuan());
        			String deptName = frmDepartmentService.getDeptNamebyNumber(empEntity.getDepart());
        			empEntity.setYiyuan(yiyuanName!=null&&!yiyuanName.equals("")?yiyuanName:empEntity.getYiyuan());
        			empEntity.setDepart(deptName!=null&&!deptName.equals("")?deptName:empEntity.getDepart());
        			request.setAttribute("openid", openid);
        			request.setAttribute("clientsxh", clientsxh);
        			request.setAttribute("bindinfo", bindinfo);
        			request.setAttribute("empEntity", empEntity);
        			request.getRequestDispatcher("WEB-INF/pages/personal_information/base_info.jsp").forward(request, response);
        		}
        	}
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    /**
     * ȡ����
     * @param args
     */
    public void CancelBind(HttpServletRequest request, HttpServletResponse response, WechatBindEntity entity) throws UnsupportedEncodingException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        Map<String, Object> resultMap = new HashMap<String, Object>();
        try {
        	out = response.getWriter();
			entity.setOpenId(request.getParameter("openId"));
			entity.setClientsxh(request.getParameter("clientsxh"));
			entity.setIslqxx("0");
			entity.setState("3");
			entity.setYhlb("9");//��ʱ���Ƿ�ҽԺ��Ա��
			entity.setIsAdmin(request.getParameter("isadmin"));
	        String dateNowStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	        entity.setGxsj(dateNowStr);
        	result = wechatBindService.updateWechatBindByPrimaryKey(entity);
        	if(result.getReturnCode().equals("1")){
        		resultMap.put("errorMsg", "success");
        	}else{
        		resultMap.put("errorMsg", "failed");
        	}
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("errorMsg", "error");
        }finally{
        	String json = new Gson().toJson(resultMap, new TypeToken<Map<String, Object>>(){}.getType());
			System.out.println(json);
			out.write(json);
            if(out!=null)out.close();
        }
    }
    //ɨ���ά���򿨺���
    public ModelAndView punchOut(HttpServletRequest request, HttpServletResponse response){
    	response.setContentType("text/html; charset=utf-8");
    	ModelAndView view = new ModelAndView("crouse_xfrecord/course_punch_result");
    	 try {
          	String openId = request.getParameter("openid");
  	    	String clientsxh = request.getParameter("clientsxh");
  	    	String courseId = request.getParameter("courseId");
  	    	String timespan = request.getParameter("timespan");
  	    	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openId, clientsxh);
  			long dktime = System.currentTimeMillis()/1000;
  			long sctime = Long.valueOf(timespan);
  			long timec = dktime-sctime;
  	    	FrmSysparaTypeKey dakatimekey = new FrmSysparaTypeKey();
			dakatimekey.setXtlb("00");
			dakatimekey.setGjz("dakatimes");
			FrmSysparaTypeEntity dakatimeentity = frmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(dakatimekey);
			String dakatimes = dakatimeentity.getMrz();
			long dakatime = Long.valueOf(dakatimes);
			if(timec>dakatime){
				view.addObject("Stste", "file");
  	    		view.addObject("Message", "������Чʱ��Σ�ǩ��ʧ�ܣ�");  //���û���Ϣ����Ϣ���Ϲ棬������Ϣ��û�а��ҵ���Ϣ��
  	    		return view;
			}
			else if(bindinfo==null){
				view.addObject("Stste", "file");
  	    		view.addObject("Message", "���ĸ�����Ϣ�����⡣�����ڡ��ҵ�ҽͨ������ȡ���󶨣�Ȼ��ȡ����ע�ù��ںţ�Ȼ�����¹�ע�ù��ںţ�");  //���û���Ϣ����Ϣ���Ϲ棬������Ϣ��û�а��ҵ���Ϣ��
  	    		return view;
        	}else if(!bindinfo.getState().equals("2")){
        		view.addObject("Stste", "file");
  	    		view.addObject("Message", Constant.JHGN_JYRZTS);  //���û���Ϣ����Ϣ���Ϲ棬������Ϣ��û�а��ҵ���Ϣ��
  	    		return view;
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
        		String signup_cs = couEntity.getRemark3();
    			DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
    			Date date = new Date();
    			Date btbegindate = sdf.parse(couEntity.getStartDate());  //��ʼʱ��
    			Date btenddate = sdf.parse(couEntity.getEndDate());  //����ʱ��
    			String nowTime = sdf.format(new Date());
    			XfStudyRegistrationEntity entity = new XfStudyRegistrationEntity();
        		if(signup_cs.equals("2") && sigentity==null){
        			view.addObject("Stste", "warning");
      	    		view.addObject("Message", "��û�жԱ�������б�����");  //���û���Ϣ����Ϣ���Ϲ棬������Ϣ��û�а��ҵ���Ϣ��
      	    		return view;
        		}
        		else if(date.getTime()<btbegindate.getTime()-30*60000||date.getTime()>btenddate.getTime()+30*60000){
        			view.addObject("Stste", "warning");
      	    		view.addObject("Message", "���ڿ���涨ʱ���ڽ���ǩ����     ���Ͽ�ʱ�䣺"+couEntity.getStartDate().substring(0,19)+"�¿�ʱ�䣺"+couEntity.getEndDate().substring(0,19));  //���û���Ϣ����Ϣ���Ϲ棬������Ϣ��û�а��ҵ���Ϣ��
      	    		return view;
        		}
        		else{
        			long time = date.getTime();
        			String xh_ = String.valueOf(time);
        			entity.setXh(xh_);
        			entity.setCourseId(courseId);
        			entity.setEmpNumber(bindinfo.getYitongCard());
        			entity.setDeptId(empEntity.getYiyuan());
        			entity.setDeptName(frmDepartmentService.getDeptNamebyNumber(empEntity.getYiyuan()));
        			entity.setCourseName(couEntity.getCourseName());
        			entity.setPlaceName("");
        			entity.setPosition("");
        			entity.setDakaTime(nowTime);
        			entity.setAddYear(nowTime.substring(0,4));
        			entity.setIsgrant("0");
        			entity.setIsvalid("1");
        			entity.setState("1");
        			entity.setAddTime(nowTime);
        			entity.setRemarks1(empEntity.getUsername());
        			entity.setGxsj(nowTime);
        			XfStudyRegistrationSqlWhere sqlWhere = new XfStudyRegistrationSqlWhere();
        			sqlWhere.setCourseId(courseId);
        			sqlWhere.setEmpNumber(bindinfo.getYitongCard());
        			List<XfStudyRegistrationEntity> list = xfStudyRegistrationService.selectListXfStudyRegistrationBySqlWhere(sqlWhere);
        			if(date.getTime()>btbegindate.getTime()){
        				entity.setAwardstate("1");
        			}else{
        				entity.setAwardstate("0");
        			}
        			if(couEntity.getCheckNumber().equals("1")){
        				if(list.size()>0){
    	    	            view.addObject("Stste", "warning");
    	      	    		view.addObject("Message", "��"+couEntity.getCourseName()+"�������Ͽ�ǩ���ɹ��������ظ�ǩ����");  //���û���Ϣ����Ϣ���Ϲ棬������Ϣ��û�а��ҵ���Ϣ��
    	      	    		return view;
        				}
        				else if(Studycount>=coursecount){
            	            view.addObject("Stste", "warning");
    	      	    		view.addObject("Message", "������ǩ������������");  //���û���Ϣ����Ϣ���Ϲ棬������Ϣ��û�а��ҵ���Ϣ��
    	      	    		return view;
            			}
        				else if(date.getTime()>btenddate.getTime()+40*60000){
            	            view.addObject("Stste", "warning");
    	      	    		view.addObject("Message", "�Բ��𣬸ÿ����ѽ�����");  //���û���Ϣ����Ϣ���Ϲ棬������Ϣ��û�а��ҵ���Ϣ��
    	      	    		return view;
                		}
        				else{
        					ExcuteResult result;
        					result = xfStudyRegistrationService.insertXfStudyRegistration(entity);
        					if(result.getReturnCode().equals("1")){
	    	    	            view.addObject("Stste", "success");
	    	      	    		view.addObject("Message", "��ϲ��"+empEntity.getUsername()+"���ڿ��⡾"+couEntity.getCourseName()+"��ǩ���ɹ���");  //���û���Ϣ����Ϣ���Ϲ棬������Ϣ��û�а��ҵ���Ϣ��
	    	      	    		return view;
        					}else{
	    	    	            view.addObject("Stste", "file");
	    	      	    		view.addObject("Message", "��"+empEntity.getUsername()+"���ڿ��⡾"+couEntity.getCourseName()+"��ǩ��ʧ�ܣ�");  //���û���Ϣ����Ϣ���Ϲ棬������Ϣ��û�а��ҵ���Ϣ��
	    	      	    		return view;
        					}
        				}
        			}else if(couEntity.getCheckNumber().equals("2")){
        				if(list.size()==1){
	        				if(date.getTime()<btenddate.getTime()){
	    	    	            view.addObject("Stste", "warning");
	    	      	    		view.addObject("Message", "���Ͽ�ǩ���ѳɹ��������¿κ����ǩ����");
	    	      	    		return view;
	        				}else{
	        					String xh = list.get(0).getXh();
	        					XfStudyRegistrationEntity entity_ = new XfStudyRegistrationEntity();
	        					entity_.setXh(xh);
	        					entity_.setIsvalid("2");
	        					entity_.setPosition(nowTime);
	        					ExcuteResult result;
	        					result = xfStudyRegistrationService.updateXfStudyRegistrationByPrimaryKeySelective(entity_);
	        					if(result.getReturnCode().equals("1")){
		    	    	            view.addObject("Stste", "success");
		    	      	    		view.addObject("Message", "��"+empEntity.getUsername()+"���ڿ��⡾"+couEntity.getCourseName()+"���¿�ǩ���ɹ���");
		    	      	    		return view;
	        					}else{
		    	    	            view.addObject("Stste", "file");
		    	      	    		view.addObject("Message","��"+empEntity.getUsername()+"���ڿ��⡾"+couEntity.getCourseName()+"���¿�ǩ��ʧ�ܣ�");
		    	      	    		return view;
	        					}
	        				}
	        			}else if(list.size()==0){
	        				if(Studycount>=coursecount){
	            	            view.addObject("Stste", "warning");
	    	      	    		view.addObject("Message", "������ǩ������������");
	    	      	    		return view;
	            			}
	        				else if(date.getTime()>btenddate.getTime()){
	            	            view.addObject("Stste", "warning");
	    	      	    		view.addObject("Message", "�Բ���û�������Ͽδ򿨼�¼�����ܽ����¿δ򿨣�");
	    	      	    		return view;
	                		}
	        				else{
	            				ExcuteResult result;
	            				result = xfStudyRegistrationService.insertXfStudyRegistration(entity);
	            				if(result.getReturnCode().equals("1")){
	            					view.addObject("Stste", "success");
	 	    	      	    		view.addObject("Message", "��"+empEntity.getUsername()+"���ڿ��⡾"+couEntity.getCourseName()+"���Ͽ�ǩ���ɹ����������¿κ����ǩ����");
	 	    	      	    		return view;
	            				}else{
	            					view.addObject("Stste", "file");
	 	    	      	    		view.addObject("Message", "��"+empEntity.getUsername()+"���ڿ��⡾"+couEntity.getCourseName()+"��ǩ��ʧ�ܣ�");
	 	    	      	    		return view;
	            				}
	            			}
	        			}
        			}
        		}
        	}
  		} catch (Exception e) {
  			e.printStackTrace();
  		}
          return view;
    }
    private static String create_timestamp() {
        return Long.toString(System.currentTimeMillis() / 1000);
    }
    /** 
     * ʱ���ת�������ڸ�ʽ�ַ��� 
     * @param seconds ��ȷ������ַ��� 
     * @param formatStr 
     * @return 
     */  
    public static String timeStamp2Date(String seconds,String format) {  
        if(seconds == null || seconds.isEmpty() || seconds.equals("null")){  
            return "";  
        }  
        if(format == null || format.isEmpty()) format = "yyyy-MM-dd HH:mm:ss";  
        SimpleDateFormat sdf = new SimpleDateFormat(format);  
        return sdf.format(new Date(Long.valueOf(seconds+"000")));  
    }  
    /**
     *���ںŲ����ֲ� 
     */
     public void toOperateDocument(HttpServletRequest request, HttpServletResponse response) {
         response.setContentType("text/html; charset=utf-8");
         try {
         	String openId = request.getParameter("openid");	
 	    	String clientsxh = request.getParameter("clientsxh");
         	request.setAttribute("openId", openId);
			request.setAttribute("clientsxh", clientsxh);
			request.getRequestDispatcher("WEB-INF/pages/manual/menu.jsp").forward(request, response);
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
     }
     public void toDifferentTextPage(HttpServletRequest request, HttpServletResponse response) {
         response.setContentType("text/html; charset=utf-8");
         try {
         	String value = request.getParameter("value");
         	String doctor = "WEB-INF/pages/manual/doctor_document.jsp";
         	String student = "WEB-INF/pages/manual/student_document.jsp";
         	String url = value.equals("1")?doctor:student;
			request.getRequestDispatcher(url).forward(request, response);
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
     }
     /**
      *���Զ�ά��
      */
      public void toTestQR(HttpServletRequest request, HttpServletResponse response) {
          response.setContentType("text/html; charset=utf-8");
          try {
          	String openId = request.getParameter("openid");
  	    	String clientsxh = request.getParameter("clientsxh");
          	request.setAttribute("openId", openId);
			request.setAttribute("clientsxh", clientsxh);
			request.getRequestDispatcher("WEB-INF/pages/manual/testQR.jsp").forward(request, response);
  		} catch (Exception e) {
  			e.printStackTrace();
  		}
      }
      
      //������ά��ķ���  ����response������Ӧ
      public void creatQRCode(HttpServletRequest request, HttpServletResponse response){
    	  String text = request.getParameter("message");
    	  text = text.replaceAll(" ", "+");
    	  String key = "9ba45bfd500642328ec03ad8ef1b6e75";// �Զ�����Կ 
    	  try {
    		  Encryptutil des = new Encryptutil(key, "utf-8");
    		  text = des.decode(text);
			QRCodeUtil.encode(text, "E:/picture/mmm.jpg", true,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  
      }
      
      //��ȡ��ʱ�����base64��ά��
      public void creatQRcodeReturnStr(HttpServletRequest request, HttpServletResponse response){
    	  String resultStr = null;
    	  String text = request.getParameter("message");
    	  text = text.replaceAll(" ", "+");
    	  String key = "9ba45bfd500642328ec03ad8ef1b6e75";// �Զ�����Կ 
    	  try {
    		  PrintWriter out=response.getWriter();
    		  Encryptutil des = new Encryptutil(key, "utf-8");
    		  text = des.decode(text);
    		  text += "&timespan="+create_timestamp();
    		  resultStr = QRCodeUtil.encode(text, "E:/worksprace3_2015/EducationPlatform/WebRoot/images/logo.png", true);
    		  resultStr = "data:image/jpg;base64,"+resultStr;
    		  out.write(resultStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
      }
      
      
     
   //�ж�Ժ΢���µ�
   public void bindDoctor(HttpServletRequest request, HttpServletResponse response, WechatBindEntity entity) {
	   response.setContentType("text/html; charset=utf-8");
       PrintWriter out = null;
       Map<String,Object> resultMap = new HashMap();
       XfEmployeeSqlWhere sqlWhere = new XfEmployeeSqlWhere();
       String openid = "";
       String clientsxh = "";
       try {
    	   out = response.getWriter();
    	   String teachtype = request.getParameter("teachtype");
    	   String[] types = teachtype.split(",");
    	   String teachtypes = "";
    	   for(int i=0;i<types.length;i++){
    		   if(types[i]!=null&&!types[i].equals("")){
    			   teachtypes += "2"+types[i]+","; 
    		   }
    	   }
           String taskinfo = request.getParameter("taskinfo");
           openid = request.getParameter("openid");
           clientsxh = request.getParameter("clientsxh");
           taskinfo = URLDecoder.decode(taskinfo, "utf-8"); 
       	   entity = JsonUtil.json2Object(taskinfo, WechatBindEntity.class);
       	   sqlWhere.setUsernumber(entity.getYitongCard());
       	   sqlWhere.setUsername(entity.getXm());
       	   List<XfEmployeeEntity> list = xfEmployeeService.selectListXfEmployeeBySqlWhere(sqlWhere);
       	   if(list==null||list.size()==0){
       		   resultMap.put("errorMsg", "noExist");  //������
       	   }else{
       		   WechatBindEntity bindEntity = new WechatBindEntity();
	       	   bindEntity.setClientsxh(clientsxh);
	       	   bindEntity.setOpenId(openid);
	       	   bindEntity.setYitongCard(entity.getYitongCard());
	       	   XfEmployeeEntity emp = xfEmployeeService.selectXfEmployeeByPrimaryKey(entity.getYitongCard());
	       	   bindEntity.setXm(entity.getXm());
	       	   bindEntity.setDeptId(emp.getDepart());
	       	   bindEntity.setYhlb("2");
	       	   bindEntity.setLanguage(teachtypes);
	       	   bindEntity.setState("2");
       		   wechatBindService.updateWechatBindByPrimaryKeySelective(bindEntity);
       		   resultMap.put("errorMsg", "success");  //������
       	   }
       	   
       } catch (Exception e) {
           e.printStackTrace();
           resultMap.put("errorMsg", "error");
       }finally{
       	String json = new Gson().toJson(resultMap, new TypeToken<Map<String, Object>>(){}.getType());
       	out.write(json);
           if(out!=null)out.close();
       }
   }
   //�ж�Ժ΢�Ű����ҳ��
   public ModelAndView toBindFinshPage(HttpServletRequest request, HttpServletResponse response) {
       ModelAndView view=new ModelAndView("teaching/doctor_bind_finish");
       return view;
   }
   
   //�ж�Ժ΢��ע�����ҳ��
   public ModelAndView toBindOverPage(HttpServletRequest request, HttpServletResponse response) {
       ModelAndView view=new ModelAndView("teaching/doctor_bind_over");
       String openid = request.getParameter("openid");
       String clientsxh = request.getParameter("clientsxh");
       WechatBindEntity bindEntity = wechatBindService.getBindInfo(openid, clientsxh);
       bindEntity.setYitongCard(null);
       bindEntity.setYhlb(null);
       bindEntity.setState("3");
       bindEntity.setCreateTime(bindEntity.getCreateTime().substring(0, 19));
       bindEntity.setGxsj(bindEntity.getGxsj().substring(0, 19));
       wechatBindService.updateWechatBindByPrimaryKey(bindEntity);
       return view;
   }
   
   public ModelAndView toConfirmOutPage(HttpServletRequest request, HttpServletResponse response) {
       response.setContentType("text/html; charset=utf-8");
       ModelAndView view=null;
       try {
	   String openid = request.getParameter("openid");
       String clientsxh = request.getParameter("clientsxh");
       	view=new ModelAndView("teaching/confirm_bind_over");
       	view.addObject("openid", openid);
       	view.addObject("clientsxh", clientsxh);
		} catch (Exception e) {
			e.printStackTrace();
		}
       return view;
   }
   
   
   
   
   /**
    * ͨ��Get��ʽ�������󣬻�ȡ����
    * @param url
    * @param returnName
    * @return
    * @throws ParseException
    * @throws IOException
    */
   public static String doGetStr(String url,String returnName) throws ParseException, IOException {
   	DefaultHttpClient client = new DefaultHttpClient();
   	HttpGet request = new HttpGet(url);
   	HttpResponse response = client.execute(request);
   	String access_token = "";
   	if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
   		String strResult = EntityUtils.toString(response.getEntity());
   		System.out.println(strResult);
   		JSONObject jsonResult = JSONObject.parseObject(strResult);
   		access_token = (String) jsonResult.get(returnName);
   	}
   	return access_token;
   }
   
   /**
    * ͨ��Post��ʽ�������󣬻�ȡ����
    * @param url   ����·��
    * @param postData   post����      ���ݸ�ʽδjson   ���磺String qrcode = "{\"expire_seconds\": 1800, \"action_name\": \"QR_SCENE\", \"action_info\": {\"scene\": {\"scene_id\":"+courseId+"}}}";
    * @param returnName  �ػ񷵻ؽ���е�����
    * @return
    * @throws ParseException
    * @throws IOException
    */
   public static String doPostStr(String url,String postData,String returnName) throws ParseException, IOException {
   	DefaultHttpClient client = new DefaultHttpClient();
   	HttpPost request = new HttpPost(url);
   	HttpEntity entity = new StringEntity(postData, "UTF-8");  
   	request.setEntity(entity);  
   	HttpResponse response = client.execute(request);
   	String ticket = "";
   	if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
   		String strResult = EntityUtils.toString(response.getEntity());
   		System.out.println(strResult);
   		JSONObject jsonResult = JSONObject.parseObject(strResult);
   		ticket = (String) jsonResult.get(returnName);
   	}
   	return ticket;
   }
   
   
   //����������
   public static void main(String[] args0){
	   String tocken_url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wxe5e611b85af09c1b&secret=1f7b366a028d34d7493a1cd7f66d1953";
	   try {
			String access_tocken = doGetStr(tocken_url,"access_token");
			//System.out.println(access_tocken);
			String send_message_url = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token="+access_tocken;
			String message = "{\"touser\":\"oyguEwAuXxFFoyQlMCnbiV9OeP9Y\","
					+ "\"template_id\":\"tPVSll0Ch0QQ9C0FjH6ojQntGC6q5Ax8OSd3LDz-0aM\","
					+ "\"url\":\"http://www.baidu.com\","
					+ "\"topcolor\":\"#0f0\","+
			"\"data\":{\"name\": {\"value\":\"��»�\",\"color\":\"#173177\"},"+
		    "\"dateTime\":{\"value\":\"08��13�� 15ʱ24��\",\"color\":\"#173177\"},"+
			"\"remark\": {\"value\":\"�����֪ͨ�Բ鿴���飡\",\"color\":\"#173177\"}}}";
			doPostStr(send_message_url,message,"errmsg");
	   }catch (IOException e) {
		   e.printStackTrace();
	   }
   }
   
    public void setFrmZlExlogService(IFrmZlExlogService frmZlExlogService) {
        this.frmZlExlogService = frmZlExlogService;
    }
    public IFrmZlExlogService getFrmZlExlogService() {
        return frmZlExlogService;
    }
    public void setProcessResultImpl(ProcessResultImpl processResultImpl) {
        this.processResultImpl = processResultImpl;
    }
    public ProcessResultImpl getProcessResultImpl() {
        return processResultImpl;
    }
    public void setWechatBindService(IWechatBindService wechatBindService) {
        this.wechatBindService = wechatBindService;
    }
    public IWechatBindService getWechatBindService() {
        return wechatBindService;
    }
	public IXfEmployeeService getXfEmployeeService() {
		return xfEmployeeService;
	}
	public void setXfEmployeeService(IXfEmployeeService xfEmployeeService) {
		this.xfEmployeeService = xfEmployeeService;
	}
	public GzyhService getGzyhService() {
		return GzyhService;
	}
	public void setGzyhService(GzyhService gzyhService) {
		GzyhService = gzyhService;
	}
	public IFrmDepartmentService getFrmDepartmentService() {
		return frmDepartmentService;
	}
	public void setFrmDepartmentService(IFrmDepartmentService frmDepartmentService) {
		this.frmDepartmentService = frmDepartmentService;
	}
	public IWechatClientinfoService getWechatClientinfoService() {
		return wechatClientinfoService;
	}
	public void setWechatClientinfoService(
			IWechatClientinfoService wechatClientinfoService) {
		this.wechatClientinfoService = wechatClientinfoService;
	}
	public IXfCourseSignupService getXfCourseSignupService() {
		return xfCourseSignupService;
	}
	public void setXfCourseSignupService(
			IXfCourseSignupService xfCourseSignupService) {
		this.xfCourseSignupService = xfCourseSignupService;
	}
	public IXfCourseService getXfCourseService() {
		return xfCourseService;
	}
	public void setXfCourseService(IXfCourseService xfCourseService) {
		this.xfCourseService = xfCourseService;
	}
	public IXfStudyRegistrationService getXfStudyRegistrationService() {
		return xfStudyRegistrationService;
	}
	public void setXfStudyRegistrationService(
			IXfStudyRegistrationService xfStudyRegistrationService) {
		this.xfStudyRegistrationService = xfStudyRegistrationService;
	}
	public IFrmSysparaTypeService getFrmSysparaTypeService() {
		return frmSysparaTypeService;
	}
	public void setFrmSysparaTypeService(
			IFrmSysparaTypeService frmSysparaTypeService) {
		this.frmSysparaTypeService = frmSysparaTypeService;
	}
	
}