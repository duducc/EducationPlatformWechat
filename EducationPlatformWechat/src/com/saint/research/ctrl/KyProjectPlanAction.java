package com.saint.research.ctrl;

import java.io.PrintWriter;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.pub.util.json.JsonUtil;
import com.saint.research.bean.KYProjectEntity;
import com.saint.research.bean.KyProjectGressEntity;
import com.saint.research.bean.KyProjectPlanEntity;
import com.saint.research.services.IKYProjectService;
import com.saint.research.services.IKyProjectGressService;
import com.saint.research.services.IKyProjectPlanService;
import com.saint.research.sqlWhere.KYProjectSqlWhere;
import com.saint.research.sqlWhere.KyProjectGressSqlWhere;
import com.saint.research.sqlWhere.KyProjectPlanSqlWhere;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatBindKey;
import com.saint.wechat.manager.services.IWechatBindService;

/**
*类注释信息
*表名KY_PROJECTPLAN
*表说明任务进度计划
  */
public class KyProjectPlanAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IKyProjectPlanService kyProjectPlanService;
    
    
    private IKYProjectService kYProjectService;
    
    private IWechatBindService wechatBindService;
    
    private IKyProjectGressService kyProjectGressService;
    
    
    /**
     * 获得个人参与项目list
     * @param request
     * @param response
     */
    public void getProjectPlanList(HttpServletRequest request, HttpServletResponse response, KyProjectPlanSqlWhere sqlWhere){
    	response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
   	 	try {
   	 	String clientsxh = request.getParameter("clientsxh");
    	String openid = request.getParameter("openid");
    	String userId = request.getParameter("userId");
    	String proname = request.getParameter("proname");
    	
        sqlWhere.setRemark1(proname);
        sqlWhere.setExcuteuserid(userId);
        
        List<KyProjectPlanEntity> entitylist = kyProjectPlanService.selectListKyProjectPlanBySqlWhere(sqlWhere);
        
        out=response.getWriter();
        out.write(new Gson().toJson(entitylist));
   	 	} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
    //我的登记列表
    public void getMyRegistList(HttpServletRequest request, HttpServletResponse response, KyProjectGressSqlWhere sqlWhere){
    	PrintWriter out=null; 
   	 	try {
   	 	String clientsxh = request.getParameter("clientsxh");
    	String openid = request.getParameter("openid");
    	String userId = request.getParameter("userId");
    	String proname = URLDecoder.decode(request.getParameter("proname"),"UTF-8");
    	
    	sqlWhere.setProname(proname);
        sqlWhere.setRegperid(userId);
        
        List<KyProjectGressEntity> entitylist=kyProjectGressService.selectListKyProjectGressBySqlWhere(sqlWhere);
        
        out=response.getWriter();
        out.write(new Gson().toJson(entitylist));
   	 	} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    //进行进度登记
    public ModelAndView toscheduleRegisterPage(HttpServletRequest request, HttpServletResponse response) {
    	response.setContentType("text/html; charset=utf-8");
    	KyProjectPlanEntity entity = new KyProjectPlanEntity();
  	    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String gxsj = df.format(date);
		ModelAndView view=null;
		try {
			
       	    String userId = request.getParameter("userId");
			String xh = request.getParameter("xh");
			KyProjectGressSqlWhere sqlWhere = new KyProjectGressSqlWhere();
			sqlWhere.setTasknum(xh);
			sqlWhere.setRegperid(userId);
			List<KyProjectGressEntity> gresslist = kyProjectGressService.selectListKyProjectGressBySqlWhere(sqlWhere);
			int suball = 0;
			for(int i=0;i<gresslist.size();i++){
				String sub = gresslist.get(i).getSubproportion();
				int subs = Integer.valueOf(sub);
				suball+=subs;
			}
			entity = kyProjectPlanService.selectKyProjectPlanByPrimaryKey(xh);
			//新增页面
			view=new ModelAndView("research/teskRegist");
			view.addObject("option", "add");
			view.addObject("entity", entity);
			view.addObject("gxsj", gxsj);
			view.addObject("suball", suball);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }
    //提交进度登记
    public void insertKyProjectGress(HttpServletRequest request,HttpServletResponse response, KyProjectGressEntity entity){
    	response.setContentType("text/html;charset=UTF-8");
    	PrintWriter out = null;
    	ExcuteResult result;
    	Map<String,Object> resultMap = new HashMap();
    	KYProjectEntity Proentity = new KYProjectEntity();
    	try {
    		out = response.getWriter();
    		//String register = request.getParameter("register");
    		String progressdesc=      request.getParameter("progressdesc");
	    	String 	proname =         request.getParameter("proname");
	    	String 	proproion =       request.getParameter("proproion");
	    	String 	prosequence =     request.getParameter("prosequence");
	    	String 	regdate =         request.getParameter("regdate");
	    	String 	regperid =        request.getParameter("regperid");
	    	String 	regpername =      request.getParameter("regpername");
	    	String 	remark1 =         request.getParameter("remark1");
	    	String 	subproportion =   request.getParameter("subproportion");
	    	String 	taskname =        request.getParameter("taskname");
	    	String 	tasknum = 	      request.getParameter("tasknum");
    		//register = URLDecoder.decode(register, "utf-8"); 
        	//entity = JsonUtil.json2Object(register, KyProjectGressEntity.class);
    		//-------------------------------------判断是否超过100-------------------------------
    		KyProjectGressSqlWhere sqlwhere = new KyProjectGressSqlWhere();
			sqlwhere.setTasknum(entity.getTasknum());
			List<KyProjectGressEntity> planlist = kyProjectGressService.selectListKyProjectGressBySqlWhere(sqlwhere);
			//int proproion = 0;
			String subpro = entity.getSubproportion();
			int subproproion = Integer.valueOf(subpro);
			for(int i=0;i<planlist.size();i++){
				String s = planlist.get(i).getSubproportion();
				int m = Integer.valueOf(s);
				proproion+=m;
			}
			//int zpro = subproproion+proproion;
			/*if(zpro>100){
				resultMap.put("errorMsg", "exceedproproion");
			}else{
				result = kyProjectGressService.insertKyProjectGress(entity);
				if(result.getReturnCode().equals("1")){
					resultMap.put("errorMsg", "success");
				}else{
					resultMap.put("errorMsg", "failed");
				}
			}*/
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
     * 跳转至任务查看页面
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toProjectPlan(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	String clientsxh = request.getParameter("clientsxh");
    	String openid = request.getParameter("openid");
    	WechatBindKey bindKey = new WechatBindKey();
    	bindKey.setClientsxh(clientsxh);
    	bindKey.setOpenId(openid);
    	WechatBindEntity bindEntity = wechatBindService.selectWechatBindByPrimaryKey(bindKey);
    	if(bindEntity==null||bindEntity.getYitongCard()==null||"".equals(bindEntity.getYitongCard())){
    		view = new ModelAndView("tool/hint_bind1");  //提示去绑定
    		return view; 
    	}
   	 	try {
   	 		view = new ModelAndView("research/schedule_main") ;
   	 	} catch (Exception e) {
			e.printStackTrace();
		}
   	 	view.addObject("clientsxh", clientsxh);
   	 	view.addObject("openid", openid);
   	 	view.addObject("userId", bindEntity.getYitongCard());
   	 	return view ; 
	}
    
    
    /**
     * 我的登记
     */
    public ModelAndView myProjectPlan(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	String clientsxh = request.getParameter("clientsxh");
    	String openid = request.getParameter("openid");
    	WechatBindKey bindKey = new WechatBindKey();
    	bindKey.setClientsxh(clientsxh);
    	bindKey.setOpenId(openid);
    	WechatBindEntity bindEntity = wechatBindService.selectWechatBindByPrimaryKey(bindKey);
    	if(bindEntity==null||bindEntity.getYitongCard()==null||"".equals(bindEntity.getYitongCard())){
    		view = new ModelAndView("tool/hint_bind1");  //提示去绑定
    		return view; 
    	}
   	 	try {
   	 		view = new ModelAndView("research/myschedule_list") ;
   	 	} catch (Exception e) {
			e.printStackTrace();
		}
   	 	view.addObject("clientsxh", clientsxh);
   	 	view.addObject("openid", openid);
   	 	view.addObject("userId", bindEntity.getYitongCard());
   	 	return view ; 
	}
    
    /**
     * 进度登记
     */
    public ModelAndView toScheduleDJ(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
   	 	try {
   	 		String prosequence = request.getParameter("prosequence");
   	 		String tasknum = request.getParameter("tasknum");
   	 		KYProjectEntity proentity = kYProjectService.selectKYProjectByPrimaryKey(prosequence);
   	 		KyProjectPlanEntity planentity = kyProjectPlanService.selectKyProjectPlanByPrimaryKey(tasknum);
   	 		view = new ModelAndView("schedule/schedule_add") ;
   	 		view.addObject("proentity", proentity);
   	 		view.addObject("planentity", planentity);
   	 	} catch (Exception e) {
			e.printStackTrace();
		}
   	 	return view ; 
	}

    public void queryTaskDetail(HttpServletRequest request, HttpServletResponse response){
    	
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

    public void setKyProjectPlanService(IKyProjectPlanService kyProjectPlanService) {
        this.kyProjectPlanService = kyProjectPlanService;
    }

    public IKyProjectPlanService getKyProjectPlanService() {
        return kyProjectPlanService;
    }

	public IKYProjectService getkYProjectService() {
		return kYProjectService;
	}

	public void setkYProjectService(IKYProjectService kYProjectService) {
		this.kYProjectService = kYProjectService;
	}
	public IWechatBindService getWechatBindService() {
		return wechatBindService;
	}
	public void setWechatBindService(IWechatBindService wechatBindService) {
		this.wechatBindService = wechatBindService;
	}

	public IKyProjectGressService getKyProjectGressService() {
		return kyProjectGressService;
	}

	public void setKyProjectGressService(
			IKyProjectGressService kyProjectGressService) {
		this.kyProjectGressService = kyProjectGressService;
	}
    
    
}