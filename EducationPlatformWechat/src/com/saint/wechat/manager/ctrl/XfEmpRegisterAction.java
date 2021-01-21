package com.saint.wechat.manager.ctrl;

import java.io.PrintWriter;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.pub.util.json.JsonUtil;
import com.saint.systemManager.bean.FrmDepartmentEntity;
import com.saint.systemManager.bean.FrmSysparaTypeEntity;
import com.saint.systemManager.bean.FrmSysparaTypeKey;
import com.saint.systemManager.services.IFrmDepartmentService;
import com.saint.systemManager.services.IFrmSysparaTypeService;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.systemManager.sqlWhere.FrmDepartmentSqlWhere;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.XfEmpRegisterEntity;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.services.IXfEmpRegisterService;
import com.saint.wechat.manager.services.IXfEmployeeService;
import com.saint.wechat.manager.sqlWhere.WechatBindSqlWhere;
import com.saint.wechat.manager.sqlWhere.XfEmpRegisterSqlWhere;
import com.saint.wechat.manager.sqlWhere.XfEmployeeSqlWhere;
import com.saint.wechat.utils.IDCardUtil;

/**
*类注释信息
*表名XF_EMP_REGISTER
*表说明员工信息申请表
  */
public class XfEmpRegisterAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IXfEmpRegisterService xfEmpRegisterService;
    
    private IXfEmployeeService xfEmployeeService;
    
    private IFrmSysparaTypeService frmSysparaTypeService;
    
    private IWechatBindService wechatBindService;
    
    private IFrmDepartmentService frmDepartmentService;

    /**
    *方法注释信息
    *分页查询表XF_EMP_REGISTER
    *表说明员工信息申请表
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public void getListPageXfEmpRegister(HttpServletRequest request, HttpServletResponse response, XfEmpRegisterSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//接受参数page和rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<XfEmpRegisterEntity> entitylist=xfEmpRegisterService.selectListPageXfEmpRegisterBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("rows", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageXfEmpRegister.toString(),Tools.getException(e));
        }
    }

    /**
    *方法注释信息
    *页面跳转方法
      */
    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, XfEmpRegisterEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertXfEmpRegister(request,response,entity);
        }else if(option.equals("edit")){
            updateXfEmpRegister(request,response,entity);
        }else if(option.equals("delete")){
            deleteXfEmpRegister(request,response,entity);
        }
    }

    /**
    *方法注释信息
    *XF_EMP_REGISTER,员工信息申请表表,插入信息
      */
    public void insertXfEmpRegister(HttpServletRequest request, HttpServletResponse response, XfEmpRegisterEntity entity) {
    	response.setContentType("text/html;charset=UTF-8");
    	PrintWriter out = null;
    	ExcuteResult result;
    	Map<String,Object> resultMap = new HashMap();
    	try {
    		out = response.getWriter();
    		//---------------------------此处ID与表XF_DEPT不对应-------------------------------------------
	    	String userYiyuan = "28866000";
	    	String temp = getNumber();
			String userNumber = userYiyuan + temp;
			int count = 1;
	    	while (count!=0) {
	    		XfEmployeeSqlWhere sqlwherem = new  XfEmployeeSqlWhere();
	    		sqlwherem.setUsernumber(userNumber);
				count=xfEmployeeService.countXfEmployeeBySqlWhere(sqlwherem);
				if(count==0){
					break;
				}else{
					userNumber = userYiyuan+getNumber();
				}
			}
	    	String openId = request.getParameter("openId");
	    	String clientsxh = request.getParameter("clientsxh");
	    	String taskinfo = request.getParameter("applyInfo");
            taskinfo = URLDecoder.decode(taskinfo, "utf-8"); 
        	entity = JsonUtil.json2Object(taskinfo, XfEmpRegisterEntity.class);
        	String idcard = entity.getIdcard();
        	if(!IDCardUtil.IDCardValidate(idcard.trim())){
        		resultMap.put("errorMsg", "geshicw");
        	}else{
        		XfEmployeeEntity empentity = JsonUtil.json2Object(taskinfo, XfEmployeeEntity.class); 
            	String yiyuan = entity.getYiyuan();
            	String depart = entity.getDepart();
            	if(yiyuan==null||yiyuan.equals("")){
            		FrmDepartmentEntity deptentity = new FrmDepartmentEntity();
            		String parameter = "2886";
            		deptentity.setBmmc(entity.getYiyuanname());
            		deptentity.setBmjc(entity.getYiyuanname());
            		deptentity.setYzmc(entity.getYiyuanname());
            		deptentity.setBmjb("5");
            		deptentity.setSjbm(parameter);
            		String yiyuan_id = insertNewdept(deptentity);
            		FrmDepartmentEntity deptentitys = new FrmDepartmentEntity();
            		deptentitys.setBmmc(entity.getDeptname());
            		deptentitys.setBmjc(entity.getDeptname());
            		deptentitys.setYzmc(entity.getDeptname());
            		deptentitys.setBmjb("6");
            		deptentitys.setSjbm(yiyuan_id);
            		String dept_id = insertNewdept(deptentitys);
            		entity.setYiyuan(yiyuan_id);
            		entity.setDepart(dept_id);
            		empentity.setYiyuan(yiyuan_id);
            		empentity.setDepart(dept_id);
            	}
            	if(yiyuan!=null&&!yiyuan.equals("")&&depart==null||depart.trim().equals("")){
            		FrmDepartmentEntity dept = new FrmDepartmentEntity();
            		dept.setBmmc(entity.getDeptname());
            		dept.setBmjc(entity.getDeptname());
            		dept.setYzmc(entity.getDeptname());
            		dept.setBmjb("6");
            		dept.setSjbm(yiyuan);
            		String glbms = insertNewdept(dept);
            		entity.setDepart(glbms);
            		empentity.setDepart(glbms);
            	}
            	String shengris = idcard.substring(6,14);
            	String shengri = shengris.substring(0,4)+"-"+shengris.substring(4,6)+"-"+shengris.substring(6,8);
    			String gxsj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    			entity.setAddTime(gxsj);
    			entity.setApplytime(gxsj);
    			entity.setUsernumber(userNumber);
    			XfEmployeeSqlWhere sqlWhere = new XfEmployeeSqlWhere();
//    			sqlWhere.setUsername(entity.getUsername());
    			sqlWhere.setIdcard(entity.getIdcard());
    			List<XfEmployeeEntity> list = xfEmployeeService.selectListXfEmployeeBySqlWhere(sqlWhere);
    			FrmSysparaTypeKey key = new FrmSysparaTypeKey();
    			key.setXtlb("00");
    			key.setGjz("register");
    			FrmSysparaTypeEntity sysentity = frmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(key);
    			if(list.size()>0){
    				resultMap.put("errorMsg", "chongfu");
    			}else{
    				if(sysentity.getMrz().equals("0")){
    					entity.setChecked("1");
    					result = xfEmpRegisterService.insertXfEmpRegister(entity);
    					if(result.getReturnCode().equals("1")){
    						empentity.setCardtype("1");
    						empentity.setZt("155");
    						empentity.setDiaodongzhuangtai("3");
    						empentity.setUpdatetime(gxsj);
    						empentity.setAddTime(gxsj);
    						empentity.setUsernumber(userNumber);
    						empentity.setShengri(shengri);
    						empentity.setQq(entity.getRemark1());
    						Date date=new Date();//取时间
    						Calendar   calendar   =   new   GregorianCalendar(); 
    						calendar.add(calendar.YEAR, 1);//把日期往后增加一年.整数往后推,负数往前移动
    						date=calendar.getTime();   //这个时间就是日期往后推一天的结果 
    						String dqsj = new SimpleDateFormat("yyyy-MM-dd").format(date);
    						empentity.setDqsj(dqsj);
    						ExcuteResult result2;
    						result2 = xfEmployeeService.insertXfEmployee(empentity);
    						if(result2.getReturnCode().equals("1")){
    							resultMap.put("errorMsg", userNumber);
    							WechatBindEntity wechat = new WechatBindEntity();
    							wechat.setOpenId(openId);
    							wechat.setClientsxh(clientsxh);
    							wechat.setXm(entity.getUsername());
    							wechat.setCreateTime(gxsj);
    							wechat.setGxsj(gxsj);
    							wechat.setYitongCard(userNumber);
    							wechat.setSfzmhm(idcard);
    							wechat.setDeptId(empentity.getYiyuan());
    							wechat.setIslqxx("1");
    							wechat.setState("2");
    							wechat.setIsAdmin("0");//暂时(是否管理员)
    							wechat.setYhlb("1");//暂时（是否医院人员）
    							wechat.setRemark1(empentity.getYiyuan());
    							WechatBindEntity tempentity = wechatBindService.getBindInfo(openId,clientsxh);
    							if(tempentity==null){
    								wechatBindService.insertWechatBind(wechat);
    							}else{
    								wechatBindService.updateWechatBindByPrimaryKeySelective(wechat);
    							}
    						}else{
    							resultMap.put("errorMsg", "failed");
    						}
    					}else{
    						resultMap.put("errorMsg", "failed");
    					}
    				}else{
    					entity.setChecked("2");
    					result = xfEmpRegisterService.insertXfEmpRegister(entity);
    					if(result.getReturnCode().equals("1")){
    						resultMap.put("errorMsg", userNumber);
    					}else{
    						resultMap.put("errorMsg", "failed");
    					}
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
    
    
    public static void main(String[] args) {
    	Date date=new Date();//取时间
		Calendar   calendar   =   new   GregorianCalendar(); 
		calendar.add(calendar.YEAR, 1);//把日期往后增加一年.整数往后推,负数往前移动
		date=calendar.getTime();   //这个时间就是日期往后推一天的结果 
		String dqsj = new SimpleDateFormat("yyyy-MM-dd").format(date);
		System.out.println(dqsj);
	}
    /**
     * 添加部门(ywq)
     * @param request
     * @param response
     */
    public String insertNewdept(FrmDepartmentEntity entity){
    	String glbm = "";
    	try {
	    	String number = getNumber();
	    	String parameter = entity.getSjbm();
	    	glbm = parameter+number;
	    	int count = 1;
	    	while (count!=0) {
	    		FrmDepartmentSqlWhere sqlwherec = new FrmDepartmentSqlWhere();
	    		sqlwherec.setGlbm(glbm);
				count=frmDepartmentService.countFrmDepartmentBySqlWhere(sqlwherec);
				if(count==0){
					break;
				}else{
					long sb = Long.valueOf(glbm.trim())+1;
					glbm=String.valueOf(sb);
				}
			}
	    	entity.setGlbm(glbm);
	    	entity.setBz("0");
	    	entity.setJlzt("1");
			String gxsj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
			entity.setGxsj(gxsj);
			frmDepartmentService.insertFrmDepartment(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return glbm;
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
    /**
    *方法注释信息
    *XF_EMP_REGISTER,员工信息申请表表,修改
      */
    public void updateXfEmpRegister(HttpServletRequest request, HttpServletResponse response, XfEmpRegisterEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = xfEmpRegisterService.updateXfEmpRegisterByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get主键+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateXfEmpRegister, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateXfEmpRegister.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *XF_EMP_REGISTER,员工信息申请表表,删除
      */
    public void deleteXfEmpRegister(HttpServletRequest request, HttpServletResponse response, XfEmpRegisterEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String usernumber=entity.getUsernumber();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = xfEmpRegisterService.deleteXfEmpRegisterByPrimaryKey(usernumber);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteXfEmpRegister, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteXfEmpRegister.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *XF_EMP_REGISTER,员工信息申请表表
    *跳转到新增页面
      */
    public void toEmpNumberTishi(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        try {
        	String usernumber = request.getParameter("userNumber");
            XfEmpRegisterEntity entity = xfEmpRegisterService.selectXfEmpRegisterByPrimaryKey(usernumber);
        	request.setAttribute("entity", entity);
			request.getRequestDispatcher("WEB-INF/pages/employee_manager/user_registerInfo.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    /**
    *方法注释信息
    *XF_EMP_REGISTER,员工信息申请表表
    *跳转到修改页面
      */
    public ModelAndView toUsernumbersourch(HttpServletRequest request, HttpServletResponse response) {
        //修改页面
        ModelAndView view=new ModelAndView("employee_manager/user_numbersourch");
        return view;
    }

    /**
     * 管理员通讯录
     * @param request
     * @param response
     * @return
     */
     public ModelAndView toManageraddress(HttpServletRequest request, HttpServletResponse response) {
         response.setContentType("text/html; charset=utf-8");
         ModelAndView view=null;
         //新增页面
         try {
        	 WechatBindSqlWhere sqlWhere = new WechatBindSqlWhere();
        	 sqlWhere.setIsAdmin("1");
        	 List<WechatBindEntity> list = wechatBindService.selectListWechatBindBySqlWhere(sqlWhere);
        	 List<WechatBindEntity> arraylist = new ArrayList<WechatBindEntity>();
        	 for(int i=0;i<list.size();i++){
        		 FrmDepartmentEntity dept = frmDepartmentService.selectFrmDepartmentByPrimaryKey(list.get(i).getRemark1());
        		 WechatBindEntity entity = list.get(i);
        		 entity.setRemark1(dept.getBmmc());
        		 arraylist.add(entity);
        	 }
        	 view=new ModelAndView("employee_manager/manager_address");
        	 view.addObject("arraylist", arraylist);
        	 view.addObject("size", list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
         return view;
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

    public void setXfEmpRegisterService(IXfEmpRegisterService xfEmpRegisterService) {
        this.xfEmpRegisterService = xfEmpRegisterService;
    }

    public IXfEmpRegisterService getXfEmpRegisterService() {
        return xfEmpRegisterService;
    }

	public IXfEmployeeService getXfEmployeeService() {
		return xfEmployeeService;
	}

	public void setXfEmployeeService(IXfEmployeeService xfEmployeeService) {
		this.xfEmployeeService = xfEmployeeService;
	}


	public IFrmSysparaTypeService getFrmSysparaTypeService() {
		return frmSysparaTypeService;
	}

	public void setFrmSysparaTypeService(
			IFrmSysparaTypeService frmSysparaTypeService) {
		this.frmSysparaTypeService = frmSysparaTypeService;
	}

	public IWechatBindService getWechatBindService() {
		return wechatBindService;
	}

	public void setWechatBindService(IWechatBindService wechatBindService) {
		this.wechatBindService = wechatBindService;
	}

	public IFrmDepartmentService getFrmDepartmentService() {
		return frmDepartmentService;
	}

	public void setFrmDepartmentService(IFrmDepartmentService frmDepartmentService) {
		this.frmDepartmentService = frmDepartmentService;
	}
    
	
}