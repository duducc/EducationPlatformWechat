package com.saint.wechat.manager.ctrl;

import java.io.PrintWriter;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.MessageUtil;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.pub.util.json.JsonUtil;
import com.saint.systemManager.bean.FrmDepartmentEntity;
import com.saint.systemManager.services.IFrmDepartmentService;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.systemManager.sqlWhere.FrmDepartmentSqlWhere;
import com.saint.teaching.bean.JxClassEntity;
import com.saint.teaching.bean.JxQuestionnaireAnswerEntity;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.sqlWhere.JxClassSqlWhere;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatBindKey;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.services.IXfEmployeeService;
import com.saint.wechat.manager.sqlWhere.XfEmployeeSqlWhere;
import com.saint.wechat.pojo.TextMessage;
import com.saint.wechat.utils.IDCardUtil;

/**
*类注释信息
*表名XF_EMPLOYEE
*表说明人员信息
  */
public class XfEmployeeAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IXfEmployeeService xfEmployeeService;
    
    private IFrmDepartmentService frmDepartmentService;
    
    private IWechatBindService wechatBindService;

    /**
    *方法注释信息
    *分页查询表XF_EMPLOYEE
    *表说明人员信息
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public void getuserInfoByidcard(HttpServletRequest request, HttpServletResponse response, XfEmployeeSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
        	String idcard = request.getParameter("idcard");
        	String username = request.getParameter("username");
        	sqlWhere.setIdcard(idcard);
        	sqlWhere.setUsername(username);
            List<XfEmployeeEntity> entitylist=xfEmployeeService.selectListXfEmployeeBySqlWhere(sqlWhere);
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"+entitylist.size());
            List<XfEmployeeEntity> list=new ArrayList<XfEmployeeEntity>();
            for(int i=0;i<entitylist.size();i++){
            	XfEmployeeEntity emp = new XfEmployeeEntity();
            	FrmDepartmentEntity yiyuanentity = frmDepartmentService.selectFrmDepartmentByPrimaryKey(entitylist.get(i).getYiyuan());
            	emp = entitylist.get(i);
            	emp.setYiyuan(yiyuanentity==null?"无":yiyuanentity.getBmmc());
            	list.add(emp);
            }
            System.out.println("-------------------------------------------------"+list.size());
//            XfEmployeeEntity entity = entitylist.get(0);
            out=response.getWriter();
            out.write(new Gson().toJson(list));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageXfEmployee.toString(),Tools.getException(e));
        }
    }

    /**
    *方法注释信息
    *XF_EMPLOYEE,人员信息表,插入信息
      */
    public void insertXfEmployee(HttpServletRequest request, HttpServletResponse response, XfEmployeeEntity entity) {
    	response.setContentType("text/html;charset=UTF-8");
    	PrintWriter out = null;
    	ExcuteResult result;
    	Map<String,Object> resultMap = new HashMap();
    	try {
    		out = response.getWriter();
    		int xh = xfEmployeeService.selectJxschoolmanager();
	    	String applyInfo = request.getParameter("applyInfo");
	    	String openid = request.getParameter("openid");
	    	String clientsxh = request.getParameter("clientsxh");
	    	applyInfo = URLDecoder.decode(applyInfo, "utf-8"); 
        	entity = JsonUtil.json2Object(applyInfo, XfEmployeeEntity.class);
        	String usernumber = entity.getYiyuan()+String.valueOf(xh);
        	entity.setUsernumber(usernumber);
        	entity.setZt("155");
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date();
			String gxsj = df.format(date);
			entity.setAddTime(gxsj);
			entity.setDiaodongzhuangtai("3");
			XfEmployeeSqlWhere sqlWhere = new XfEmployeeSqlWhere();
			//sqlWhere.setUserName(entity.getUserName());
			sqlWhere.setIdcard(entity.getIdcard());
			List<XfEmployeeEntity> list = xfEmployeeService.selectListXfEmployeeBySqlWhere(sqlWhere);
			XfEmployeeEntity entitypd = xfEmployeeService.selectXfEmployeeByPrimaryKey(entity.getUsernumber());
			String idcard = entity.getIdcard();
			if(!IDCardUtil.IDCardValidate(idcard.trim())){
				resultMap.put("errorMsg", "idcarderror");
			}else if(list.size()>0){
				resultMap.put("errorMsg", "idcardchongfu");
			}else{
				WechatBindEntity bindEntity = new WechatBindEntity();
				bindEntity.setOpenId(openid);
				bindEntity.setClientsxh(clientsxh);
				bindEntity.setYitongCard(entity.getUsernumber());
				bindEntity.setDeptId(entity.getDepart());
				bindEntity.setIslqxx("1");
				bindEntity.setSfzmhm(idcard);
				bindEntity.setXm(entity.getUsername());
				bindEntity.setState("2");
				bindEntity.setYhlb("2");  //用户类别1学员 2医务人员
				bindEntity.setIsAdmin("0");
				result = xfEmployeeService.insertXfEmployee(entity);
				if(result.getReturnCode().equals("1")){
					resultMap.put("errorMsg", "success");
					wechatBindService.updateWechatBindByPrimaryKeySelective(bindEntity);
				}else{
					resultMap.put("errorMsg", "failed");
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
    
    public ModelAndView toSchoolManagerRegistPage(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String openid = request.getParameter("openid");
	    	String clientsxh = request.getParameter("clientsxh");
			view = new ModelAndView("teaching/schoolmanager_regist");
			view.addObject("openid", openid);
			view.addObject("clientsxh", clientsxh);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    /**
     *方法注释信息
     *XF_EMPLOYEE,人员信息表,插入信息
       */
     public void saveSchoolManagerRegistinfo(HttpServletRequest request, HttpServletResponse response, XfEmployeeEntity entity) {
     	response.setContentType("text/html;charset=UTF-8");
     	PrintWriter out = null;
     	ExcuteResult result;
     	Map<String,Object> resultMap = new HashMap();
     	try {
     		out = response.getWriter();
 	    	String applyInfo = request.getParameter("applyInfo");
 	    	String openid = request.getParameter("openid");
 	    	String clientsxh = request.getParameter("clientsxh");
 	    	applyInfo = URLDecoder.decode(applyInfo, "utf-8"); 
         	entity = JsonUtil.json2Object(applyInfo, XfEmployeeEntity.class);
         	entity.setZt("155");
 			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 			Date date = new Date();
 			String gxsj = df.format(date);
 			entity.setAddTime(gxsj);
 			entity.setDiaodongzhuangtai("3");
 			XfEmployeeSqlWhere sqlWhere = new XfEmployeeSqlWhere();
 			//sqlWhere.setUserName(entity.getUserName());
 			sqlWhere.setIdcard(entity.getIdcard());
 			List<XfEmployeeEntity> list = xfEmployeeService.selectListXfEmployeeBySqlWhere(sqlWhere);
 			XfEmployeeEntity entitypd = xfEmployeeService.selectXfEmployeeByPrimaryKey(entity.getUsernumber());
 			String idcard = entity.getIdcard();
 			if(!IDCardUtil.IDCardValidate(idcard.trim())){
 				resultMap.put("errorMsg", "idcarderror");
 			}else if(list.size()>0){
 				resultMap.put("errorMsg", "idcardchongfu");
 			}else if(entitypd!=null){
 				resultMap.put("errorMsg", "usernumberchongfu");
 			}else{
 				WechatBindEntity bindEntity = new WechatBindEntity();
 				bindEntity.setOpenId(openid);
 				bindEntity.setClientsxh(clientsxh);
 				bindEntity.setYitongCard(entity.getUsernumber());
 				bindEntity.setDeptId(entity.getDepart());
 				bindEntity.setIslqxx("1");
 				bindEntity.setSfzmhm(idcard);
 				bindEntity.setXm(entity.getUsername());
 				bindEntity.setState("2");
 				bindEntity.setYhlb("1");  //用户类别1学员 2医务人员
 				result = xfEmployeeService.insertXfEmployee(entity);
 				if(result.getReturnCode().equals("1")){
 					resultMap.put("errorMsg", "success");
 					wechatBindService.updateWechatBindByPrimaryKeySelective(bindEntity);
 				}else{
 					resultMap.put("errorMsg", "failed");
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
    *方法注释信息
    *XF_EMPLOYEE,人员信息表,修改
      */
    public void updateXfEmployee(HttpServletRequest request, HttpServletResponse response, XfEmployeeEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = xfEmployeeService.updateXfEmployeeByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get主键+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateXfEmployee, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateXfEmployee.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

   /**
    *方法注释信息
    *XF_EMPLOYEE,人员信息表,删除
    */
    public void deleteXfEmployee(HttpServletRequest request, HttpServletResponse response, XfEmployeeEntity entity) {
        response.setContentType("text/html; charset=utf-8");

        String usernumber=entity.getUsernumber();

        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = xfEmployeeService.deleteXfEmployeeByPrimaryKey(usernumber);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteXfEmployee, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteXfEmployee.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *XF_EMPLOYEE,人员信息表
    *跳转到新增页面
      */
    public ModelAndView toUserRegisterPage(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        ModelAndView view = null;
        try {
        	String time = new SimpleDateFormat("yyyy-MM-dd").format(new Date()) ;
        	String openId = request.getParameter("openid");
	    	String clientsxh = request.getParameter("clientsxh");
	    	String type = request.getParameter("type");
	    	if(type.equals("1")){
	    		view = new ModelAndView("employee_manager/user_register");
	    		view.addObject("openId", openId);
	    		view.addObject("clientsxh", clientsxh);
	    		view.addObject("time", time);
	    		view.addObject("openionType", type);
//	    		request.setAttribute("openId", openId);
//	    		request.setAttribute("clientsxh", clientsxh);
//	    		request.setAttribute("time", time);
//	    		request.getRequestDispatcher("WEB-INF/pages/employee_manager/user_register.jsp").forward(request, response);
	    	}else{
	    		view = new ModelAndView("teaching/user_registType");
	    		view.addObject("openId", openId);
	    		view.addObject("clientsxh", clientsxh);
	    		view.addObject("openionType", type);
	    	}
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }
    public ModelAndView toUserRegisterPageT(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        ModelAndView view = null;
        try {
        	String time = new SimpleDateFormat("yyyy-MM-dd").format(new Date()) ;
        	String openId = request.getParameter("openid");
	    	String clientsxh = request.getParameter("clientsxh");
	    	String openionType = request.getParameter("openionType");
	    		view = new ModelAndView("teaching/user_register");
	    		view.addObject("openId", openId);
	    		view.addObject("clientsxh", clientsxh);
	    		view.addObject("time", time);
	    		view.addObject("openionType", openionType);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }
    /**
     *方法注释信息
     *XF_EMPLOYEE,人员信息表
     *跳转到新增页面
       */
     public void toUserIdquery(HttpServletRequest request, HttpServletResponse response) {
         response.setContentType("text/html; charset=utf-8");
         try {
         	String time = new SimpleDateFormat("yyyy-MM-dd").format(new Date()) ;
         	String openId = request.getParameter("openid");
 	    	String clientsxh = request.getParameter("clientsxh");
         	request.setAttribute("openId", openId);
 			request.setAttribute("clientsxh", clientsxh);
 			request.getRequestDispatcher("WEB-INF/pages/employee_manager/user_Idquery.jsp").forward(request, response);
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
     }
    /**
     *方法注释信息
     *分页查询表XF_EMPLOYEE
     *表说明人员信息
     * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
     * @param sqlWhere
     * @return
     */
     public void getYiyuanBySource(HttpServletRequest request, HttpServletResponse response) {
         response.setContentType("text/html; charset=GBK");
         PrintWriter out=null; 
         try{
             out=response.getWriter();
             String uresource = request.getParameter("uresource");
             FrmDepartmentSqlWhere sqlWhere = new FrmDepartmentSqlWhere();
         	 sqlWhere.setBmjb("5");
         	 sqlWhere.setSjbm("62");
         	 List<FrmDepartmentEntity> yiyuanList = new ArrayList<FrmDepartmentEntity>();
         	 if(uresource.equals("1")||uresource==""||uresource==null){
         		 yiyuanList = frmDepartmentService.selectListFrmDepartmentBySqlWhere(sqlWhere);
         	 }else{
         		 yiyuanList = frmDepartmentService.selectListFrmDepartmentBySqlWherejc(sqlWhere);
         	 }
             out.write(new Gson().toJson(yiyuanList));
         }catch (Exception e) {
             e.printStackTrace();
             frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageXfEmployee.toString(),Tools.getException(e));
         }
     }
     
     /**
      *方法注释信息
      *XF_EMPLOYEE,医护人员信息
      *跳转到新增页面
        */
      public ModelAndView toUserInfoPage(HttpServletRequest request, HttpServletResponse response) {
          response.setContentType("text/html; charset=utf-8");
          ModelAndView view=null;
          try {
        	String openid = request.getParameter("openid");
          	String clientsxh = request.getParameter("clientsxh");
          	WechatBindKey key = new WechatBindKey();
          	key.setClientsxh(clientsxh);
          	key.setOpenId(openid);
          	WechatBindEntity bindEntity = wechatBindService.selectWechatBindByPrimaryKey(key);
          	if(bindEntity.getYitongCard()==null||bindEntity.getYitongCard().equals("")){
          		view=new ModelAndView("teaching/doctor_bind_over");
          		return view;
          	}
          	XfEmployeeEntity entity = xfEmployeeService.selectXfEmployeeByPrimaryKey(bindEntity.getYitongCard());
          	List<HashMap<String,Object>> list = null;
          	if(entity.getYiyuan()!=null&&!entity.getYiyuan().equals("")){
          		list = wechatBindService.selectListWechatBindBySql("SELECT BMMC FROM FRM_DEPARTMENT WHERE GLBM = '"+entity.getYiyuan()+"'");
              	entity.setYiyuan((list!=null&&list.size()>0)?list.get(0).get("BMMC").toString():null);
          	}else{
          		entity.setYiyuan(null);
          	}
          	
          	if(entity.getDepart()!=null&&!entity.getDepart().equals("")){
          		list=wechatBindService.selectListWechatBindBySql("SELECT BMMC FROM FRM_DEPARTMENT WHERE GLBM = '"+entity.getDepart()+"'");
              	entity.setDepart((list!=null&&list.size()>0)?list.get(0).get("BMMC").toString():null);
          	}else{
          		entity.setDepart(null);
          	}
          	
          	entity.setSex((entity.getSex()!=null&&entity.getSex().equals("1"))?"男":"女");
          	
          	if(entity.getMinzu()!=null&&!entity.getMinzu().equals("")){
          		list=wechatBindService.selectListWechatBindBySql("SELECT DMMC FROM FRM_CODE WHERE DMJC = 'MZ' AND DMZ = '"+entity.getMinzu()+"'");
              	entity.setMinzu((list!=null&&list.size()>0)?list.get(0).get("DMMC").toString():null);
          	}else{
          		entity.setMinzu(null);
          	}
          	
          	if(entity.getZhuanye()!=null&&!entity.getZhuanye().equals("")){
          		list=wechatBindService.selectListWechatBindBySql("SELECT DMMC FROM FRM_CODE WHERE DMJC = 'ZY' AND DMZ = '"+entity.getZhuanye()+"'");
              	entity.setZhuanye((list!=null&&list.size()>0)?list.get(0).get("DMMC").toString():null);
          	}else{
          		entity.setZhuanye(null);
          	}
          	
          	if(entity.getXueli()!=null&&!entity.getXueli().equals("")){
          		list=wechatBindService.selectListWechatBindBySql("SELECT DMMC FROM FRM_CODE WHERE DMJC = 'XL' AND DMZ = '"+entity.getXueli()+"'");
              	entity.setXueli((list!=null&&list.size()>0)?list.get(0).get("DMMC").toString():null);
          	}else{
          		entity.setXueli(null);
          	}
          	
          	if(entity.getZhicheng()!=null&&!entity.getZhicheng().equals("")){
          		list=wechatBindService.selectListWechatBindBySql("SELECT DMMC FROM FRM_CODE WHERE DMJC = 'ZC' AND DMZ = '"+entity.getZhicheng()+"'");
              	entity.setZhicheng((list!=null&&list.size()>0)?list.get(0).get("DMMC").toString():null);
          	}else{
          		entity.setZhicheng(null);
          	}
          	
          	if(entity.getZhichenglv()!=null&&!entity.getZhichenglv().equals("")){
          		list=wechatBindService.selectListWechatBindBySql("SELECT DMMC FROM FRM_CODE WHERE DMJC = 'ZCJB' AND DMZ = '"+entity.getZhichenglv()+"'");
              	entity.setZhichenglv((list!=null&&list.size()>0)?list.get(0).get("DMMC").toString():null);
          	}else{
          		entity.setZhichenglv(null);
          	}
          	
          	view=new ModelAndView("teaching/doctor_info");
          	view.addObject("entity", entity);
          	view.addObject("openid", openid);
          	view.addObject("clientsxh", clientsxh);
  		} catch (Exception e) {
  			e.printStackTrace();
  		}
          return view;
      }
    
      /**
       * 通用查询教师页面
       * @param request
       * @param response
       * @return
       */
      public ModelAndView toQueryPerson(HttpServletRequest request, HttpServletResponse response) {
          response.setContentType("text/html; charset=gbk");
          FrmDepartmentSqlWhere sqlWhere = new FrmDepartmentSqlWhere();
  		  sqlWhere.setSjbm("62000001");
  		  List<FrmDepartmentEntity> deplist = frmDepartmentService.selectListFrmDepartmentBySqlWhere(sqlWhere);
          ModelAndView view=new ModelAndView("tool/common_query_person");
          view.addObject("option", "add");
          view.addObject("deplist", deplist);
          return view;
      }
      
      public void getListPageToLayui(HttpServletRequest request, HttpServletResponse response, XfEmployeeSqlWhere sqlWhere) {
          response.setContentType("text/html; charset=GBK");
          PrintWriter out=null; 
          try{
              int page =Integer.parseInt(request.getParameter("page"));
              int rows = Integer.parseInt(request.getParameter("limit"));//接受参数page和rows
              Page listPage=new Page(rows,page);
              sqlWhere.setListPage(listPage); 
              String Name = request.getParameter("Name");
              String deptid = request.getParameter("deptid");
          	  sqlWhere.setUsername(Name);
          	  sqlWhere.setDepart(deptid);
              List<XfEmployeeEntity> entitylist=xfEmployeeService.selectListPageXfEmployeeBySqlWhere(sqlWhere);
              System.out.println("----------------------------------------------"+entitylist.size()+"-----------------------------------------");
              /*List<XfEmployeeEntity> list = new ArrayList<XfEmployeeEntity>();
              for(int i=0;i<entitylist.size();i++){
            	  XfEmployeeEntity emp = new XfEmployeeEntity();
            	  emp = entitylist.get(i);
            	  FrmDepartmentEntity dept = frmDepartmentService.selectFrmDepartmentByPrimaryKey(entitylist.get(i).getDepart());
            	  emp.setDepart(dept.getBmmc());
            	  list.add(emp);
              }*/
              Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
              jsonMap.put("code", 0);//rows键 存放每页记录 list
              jsonMap.put("msg", "");//rows键 存放每页记录 list
              jsonMap.put("count", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
              jsonMap.put("data", entitylist);//rows键 存放每页记录 list
              out=response.getWriter();
              out.write(new Gson().toJson(jsonMap));
          }catch (Exception e) {
              e.printStackTrace();
              frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageXfProject.toString(),Tools.getException(e));
          }
      }
      
       /**
        * 实习人员注册保存(ywq)
        * @param request
        * @param response
        * @param entity
        */
   public void saveInternInfo(HttpServletRequest request,HttpServletResponse response,XfEmployeeEntity entity){
    	response.setContentType("text/html;charset=UTF-8");
    	PrintWriter out = null;
    	ExcuteResult result;
    	Map<String,Object> resultMap = new HashMap();
    	try {
    		out = response.getWriter();
    		String userYiyuan = "62000001";
    		//---------------------------此处ID与表XF_DEPT不对应-------------------------------------------
	    	String temp = getNumber();
			String userNumber = "62000001" + temp;
			int count = 1;
	    	while (count!=0) {
	    		XfEmployeeSqlWhere sqlwherem = new XfEmployeeSqlWhere();
	    		sqlwherem.setUsernumber(userNumber);
				count=xfEmployeeService.countXfEmployeeBySqlWhere(sqlwherem);
				if(count==0){
					break;
				}else{
					userNumber = userYiyuan+getNumber();
				}
			}
	    	String taskinfo = request.getParameter("taskinfo");
	    	String openid = request.getParameter("openid");
	    	String clientsxh = request.getParameter("clientsxh");
            taskinfo = URLDecoder.decode(taskinfo, "utf-8"); 
        	entity = JsonUtil.json2Object(taskinfo, XfEmployeeEntity.class);
        	entity.setZt("155");
			String gxsj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
			entity.setAddTime(gxsj);
			entity.setDiaodongzhuangtai("3");
			entity.setYiyuan(userYiyuan);
			entity.setUsernumber(userNumber);
			entity.setDqsj(getNextyear(2));
			XfEmployeeSqlWhere sqlWhere = new XfEmployeeSqlWhere();
//    				sqlWhere.setUserName(entity.getUserName());
			sqlWhere.setIdcard(entity.getIdcard());
			List<XfEmployeeEntity> list = xfEmployeeService.selectListXfEmployeeBySqlWhere(sqlWhere);
			String idcard = entity.getIdcard();
			if(!IDCardUtil.IDCardValidate(idcard.trim())){
				resultMap.put("errorMsg", "idcarderror");
			}else if(list.size()>0){
				resultMap.put("errorMsg", "chongfu");
			}else{
				WechatBindEntity bindEntity = new WechatBindEntity();
				bindEntity.setOpenId(openid);
				bindEntity.setClientsxh(clientsxh);
				bindEntity.setYitongCard(userNumber);
				bindEntity.setDeptId(entity.getDepart());
				bindEntity.setIslqxx("1");
				bindEntity.setSfzmhm(idcard);
				bindEntity.setXm(entity.getUsername());
				bindEntity.setState("2");
				bindEntity.setYhlb("1");  //用户类别1学员 2医务人员
				bindEntity.setRemark1(entity.getYiyuan());
				bindEntity.setRemark2(entity.getDepart());
				bindEntity.setIsAdmin("0");
				bindEntity.setSex(entity.getSex());
				result = xfEmployeeService.insertXfEmployee(entity);
				if(result.getReturnCode().equals("1")){
					resultMap.put("errorMsg", "success");
					wechatBindService.updateWechatBindByPrimaryKeySelective(bindEntity);
				}else{
					resultMap.put("errorMsg", "failed");
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
    
    public String getNextyear(int value){
   		String nextyear = "";
	   	try {
	   		String year = new SimpleDateFormat("yyyy").format(new Date());
	   		String mother = new SimpleDateFormat("MM").format(new Date());
	   		String day = new SimpleDateFormat("dd").format(new Date());
	   		int next = Integer.valueOf(year)+value;
	   		nextyear = String.valueOf(next)+"-"+mother+"-"+day; 
			} catch (Exception e) {
				e.printStackTrace();
			}
   		return nextyear;
    }
    public String getNumber(){
   		String temp="";
		Random random = new Random();
		int k=random.nextInt(9999);
		if(k<10){
			temp="000"+k;
		}else if(k<100){
			temp="00"+k;
		}else if(k<1000){
			temp="0"+k;
		}else{
			temp=""+k;
		}
		return temp;
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

    public void setXfEmployeeService(IXfEmployeeService xfEmployeeService) {
        this.xfEmployeeService = xfEmployeeService;
    }

    public IXfEmployeeService getXfEmployeeService() {
        return xfEmployeeService;
    }

	public IFrmDepartmentService getFrmDepartmentService() {
		return frmDepartmentService;
	}

	public void setFrmDepartmentService(IFrmDepartmentService frmDepartmentService) {
		this.frmDepartmentService = frmDepartmentService;
	}

	public IWechatBindService getWechatBindService() {
		return wechatBindService;
	}

	public void setWechatBindService(IWechatBindService wechatBindService) {
		this.wechatBindService = wechatBindService;
	}
    
}