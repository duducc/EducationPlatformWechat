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
 * 微信绑定action
 * @author Administrator
 *
 */
public class WechatBindAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;
    private ProcessResultImpl processResultImpl;
    private IWechatBindService wechatBindService;
    private GzyhService GzyhService; //微信基本信息
    
    private IXfEmployeeService xfEmployeeService;
    private IFrmDepartmentService frmDepartmentService;
    
    private IWechatClientinfoService wechatClientinfoService;
    
    protected IXfCourseSignupService xfCourseSignupService;
    
    private IXfCourseService xfCourseService;
    
    private IXfStudyRegistrationService xfStudyRegistrationService;
    
    private IFrmSysparaTypeService frmSysparaTypeService;
    
    /**
     * 跳转到绑定页面
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
     * 根据usename和usernumber判断是否匹配，并更新绑定表进行绑定
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
//	            WechatClientinfoEntity sysclientinfo = wechatClientinfoService.selectWechatClientinfoByPrimaryKey(entity.getClientsxh());  //获取配置信息
//	            WechatBindKey keyentity = new WechatBindKey();
//            	keyentity.setOpenId(entity.getOpenId());
//            	keyentity.setClientsxh(entity.getClientsxh());
//            	WechatBindEntity tempentity = wechatBindService.selectWechatBindByPrimaryKey(keyentity);
//            	String accessToken = WechatUtil.getAccessToken(sysclientinfo.getAppid(), sysclientinfo.getAppsecret(), sysclientinfo.getWxtype()).getToken();
//	            String userid = WechatUtil.OpenidTouserid(entity.getOpenId(), accessToken);
//	            System.out.println(userid);
            	//状态 0：取消关注 1：已关注 2：已绑定 3：取消绑定
            	if(wbelist.size()>0){
            		resultMap.put("errorMsg", "yjbind");
            	}else{
            		XfEmployeeSqlWhere xfemployeeSqlWhere = new XfEmployeeSqlWhere();
     	            xfemployeeSqlWhere.setUsername(entity.getXm());
     	            List<XfEmployeeEntity> entityList1 = null;
     	            if("1".equals(entity.getState())){  //通过身份证绑定
     	            	idytk = entity.getYitongCard();
     	            	xfemployeeSqlWhere.setUsernumber(idytk);
 	 	            }
     	            if("2".equals(entity.getState())){  //通过身份证绑定
  	 	            	idcard = entity.getYitongCard();
  	 	            	xfemployeeSqlWhere.setIdcard(idcard);
  	 	            }
  	            	entityList1 = xfEmployeeService.selectListXfEmployeeBySqlWhere(xfemployeeSqlWhere);
  	            	if(entityList1.size()==0){
  	            		 resultMap.put("errorMsg", "noperson"); //人员表没有人员信息
  	            		 /*if(sysclientinfo.getWxtype().equals("1")){
  	            			resultMap.put("errorMsg", "noperson"); //人员表没有人员信息
  	            		 }else if(sysclientinfo.getWxtype().equals("3")){
  	     	            	net.sf.json.JSONObject userinfo = WechatUtil.useridToUserInfo(userid, accessToken);
  	     	            	"name": "李四",
  	     	               	"department": [1, 2],
  	     	              	"order": [1, 2],
  	     	              	"position": "后台工程师",
  	     	              	"mobile": "15913215421",
  	     	              	"gender": "1",
  	     	            	System.out.println(userinfo.get("name")+","+userinfo.get("department")+","+userinfo.get("position")+","+userinfo.get("mobile")+","+userinfo.get("gender"));
  	     	            	String dateNowStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()); 
  	     	            	//插入人员信息
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
  	            			//插入绑定信息
  	     	            	//完善绑定entity内容
  		 	           		entity.setGxsj(dateNowStr);
  		 	           		entity.setCreateTime(dateNowStr);
  		 	           		entity.setSfzmhm(idcard);
  		 	           		entity.setYitongCard(idytk);
  		 	           		entity.setXm(userinfo.get("name").toString());
  		 	           		//entity.setDeptId();
  		 	           		entity.setIslqxx("0");
  		 	           		entity.setState("2");
  		 	           		entity.setIsAdmin("0");//暂时(是否管理员)
  		 	           		entity.setYhlb("1");//暂时（是否医院人员）
  		 	           		if(tempentity == null){
  		 	           			result = wechatBindService.insertWechatBind(entity);
  		 	           		}else{
  		 	           			result = wechatBindService.updateWechatBindByPrimaryKey(entity);
  		 	           		}
   	            		 }*/
 	            	}else if(entityList1.size()>0 && !entityList1.get(0).getUsername().equals(entity.getXm())){
 	            		resultMap.put("errorMsg", "nameerror"); //人员表有人员信息，但是姓名不同
 	            	}else{
 	            		//完善绑定entity内容
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
	 	           		entity.setIsAdmin("0");//暂时(是否管理员)
	 	           		entity.setYhlb("1");//暂时（是否医院人员）
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
	 * 查看医通卡基础信息
	 * @param request
	 * @param response
	 * @param key
	 * @return
	 */
    public void toBaseInfo(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //将值传入页面
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
     * 取消绑定
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
			entity.setYhlb("9");//暂时（是否医院人员）
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
    //扫完二维码后打卡函数
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
  	    		view.addObject("Message", "超出有效时间段，签到失败！");  //无用户信息或信息不合规，完善信息（没有绑定我的信息）
  	    		return view;
			}
			else if(bindinfo==null){
				view.addObject("Stste", "file");
  	    		view.addObject("Message", "您的个人信息有问题。请您在【我的医通卡】中取消绑定，然后取消关注该公众号，然后重新关注该公众号！");  //无用户信息或信息不合规，完善信息（没有绑定我的信息）
  	    		return view;
        	}else if(!bindinfo.getState().equals("2")){
        		view.addObject("Stste", "file");
  	    		view.addObject("Message", Constant.JHGN_JYRZTS);  //无用户信息或信息不合规，完善信息（没有绑定我的信息）
  	    		return view;
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
        		String signup_cs = couEntity.getRemark3();
    			DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
    			Date date = new Date();
    			Date btbegindate = sdf.parse(couEntity.getStartDate());  //开始时间
    			Date btenddate = sdf.parse(couEntity.getEndDate());  //结束时间
    			String nowTime = sdf.format(new Date());
    			XfStudyRegistrationEntity entity = new XfStudyRegistrationEntity();
        		if(signup_cs.equals("2") && sigentity==null){
        			view.addObject("Stste", "warning");
      	    		view.addObject("Message", "您没有对本课题进行报名！");  //无用户信息或信息不合规，完善信息（没有绑定我的信息）
      	    		return view;
        		}
        		else if(date.getTime()<btbegindate.getTime()-30*60000||date.getTime()>btenddate.getTime()+30*60000){
        			view.addObject("Stste", "warning");
      	    		view.addObject("Message", "请在课题规定时间内进行签到！     （上课时间："+couEntity.getStartDate().substring(0,19)+"下课时间："+couEntity.getEndDate().substring(0,19));  //无用户信息或信息不合规，完善信息（没有绑定我的信息）
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
    	      	    		view.addObject("Message", "【"+couEntity.getCourseName()+"】您已上课签到成功，请勿重复签到！");  //无用户信息或信息不合规，完善信息（没有绑定我的信息）
    	      	    		return view;
        				}
        				else if(Studycount>=coursecount){
            	            view.addObject("Stste", "warning");
    	      	    		view.addObject("Message", "本课题签到人数已满！");  //无用户信息或信息不合规，完善信息（没有绑定我的信息）
    	      	    		return view;
            			}
        				else if(date.getTime()>btenddate.getTime()+40*60000){
            	            view.addObject("Stste", "warning");
    	      	    		view.addObject("Message", "对不起，该课题已结束！");  //无用户信息或信息不合规，完善信息（没有绑定我的信息）
    	      	    		return view;
                		}
        				else{
        					ExcuteResult result;
        					result = xfStudyRegistrationService.insertXfStudyRegistration(entity);
        					if(result.getReturnCode().equals("1")){
	    	    	            view.addObject("Stste", "success");
	    	      	    		view.addObject("Message", "恭喜【"+empEntity.getUsername()+"】于课题【"+couEntity.getCourseName()+"】签到成功！");  //无用户信息或信息不合规，完善信息（没有绑定我的信息）
	    	      	    		return view;
        					}else{
	    	    	            view.addObject("Stste", "file");
	    	      	    		view.addObject("Message", "【"+empEntity.getUsername()+"】于课题【"+couEntity.getCourseName()+"】签到失败！");  //无用户信息或信息不合规，完善信息（没有绑定我的信息）
	    	      	    		return view;
        					}
        				}
        			}else if(couEntity.getCheckNumber().equals("2")){
        				if(list.size()==1){
	        				if(date.getTime()<btenddate.getTime()){
	    	    	            view.addObject("Stste", "warning");
	    	      	    		view.addObject("Message", "您上课签到已成功！请在下课后进行签到！");
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
		    	      	    		view.addObject("Message", "【"+empEntity.getUsername()+"】于课题【"+couEntity.getCourseName()+"】下课签到成功！");
		    	      	    		return view;
	        					}else{
		    	    	            view.addObject("Stste", "file");
		    	      	    		view.addObject("Message","【"+empEntity.getUsername()+"】于课题【"+couEntity.getCourseName()+"】下课签到失败！");
		    	      	    		return view;
	        					}
	        				}
	        			}else if(list.size()==0){
	        				if(Studycount>=coursecount){
	            	            view.addObject("Stste", "warning");
	    	      	    		view.addObject("Message", "本课题签到人数已满！");
	    	      	    		return view;
	            			}
	        				else if(date.getTime()>btenddate.getTime()){
	            	            view.addObject("Stste", "warning");
	    	      	    		view.addObject("Message", "对不起，没有您的上课打卡记录，不能进行下课打卡！");
	    	      	    		return view;
	                		}
	        				else{
	            				ExcuteResult result;
	            				result = xfStudyRegistrationService.insertXfStudyRegistration(entity);
	            				if(result.getReturnCode().equals("1")){
	            					view.addObject("Stste", "success");
	 	    	      	    		view.addObject("Message", "【"+empEntity.getUsername()+"】于课题【"+couEntity.getCourseName()+"】上课签到成功。请您在下课后进行签到！");
	 	    	      	    		return view;
	            				}else{
	            					view.addObject("Stste", "file");
	 	    	      	    		view.addObject("Message", "【"+empEntity.getUsername()+"】于课题【"+couEntity.getCourseName()+"】签到失败！");
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
     * 时间戳转换成日期格式字符串 
     * @param seconds 精确到秒的字符串 
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
     *公众号操作手册 
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
      *测试二维码
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
      
      //产生二维码的方法  并在response里面响应
      public void creatQRCode(HttpServletRequest request, HttpServletResponse response){
    	  String text = request.getParameter("message");
    	  text = text.replaceAll(" ", "+");
    	  String key = "9ba45bfd500642328ec03ad8ef1b6e75";// 自定义密钥 
    	  try {
    		  Encryptutil des = new Encryptutil(key, "utf-8");
    		  text = des.decode(text);
			QRCodeUtil.encode(text, "E:/picture/mmm.jpg", true,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  
      }
      
      //获取带时间戳的base64二维码
      public void creatQRcodeReturnStr(HttpServletRequest request, HttpServletResponse response){
    	  String resultStr = null;
    	  String text = request.getParameter("message");
    	  text = text.replaceAll(" ", "+");
    	  String key = "9ba45bfd500642328ec03ad8ef1b6e75";// 自定义密钥 
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
      
      
     
   //市二院微信新的
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
       		   resultMap.put("errorMsg", "noExist");  //不存在
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
       		   resultMap.put("errorMsg", "success");  //不存在
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
   //市二院微信绑定完成页面
   public ModelAndView toBindFinshPage(HttpServletRequest request, HttpServletResponse response) {
       ModelAndView view=new ModelAndView("teaching/doctor_bind_finish");
       return view;
   }
   
   //市二院微信注销完成页面
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
    * 通过Get方式发起请求，获取数据
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
    * 通过Post方式发起请求，获取数据
    * @param url   请求路径
    * @param postData   post数据      数据格式未json   例如：String qrcode = "{\"expire_seconds\": 1800, \"action_name\": \"QR_SCENE\", \"action_info\": {\"scene\": {\"scene_id\":"+courseId+"}}}";
    * @param returnName  截获返回结果中的数据
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
   
   
   //测试主函数
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
			"\"data\":{\"name\": {\"value\":\"李德辉\",\"color\":\"#173177\"},"+
		    "\"dateTime\":{\"value\":\"08月13日 15时24分\",\"color\":\"#173177\"},"+
			"\"remark\": {\"value\":\"点击此通知以查看详情！\",\"color\":\"#173177\"}}}";
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