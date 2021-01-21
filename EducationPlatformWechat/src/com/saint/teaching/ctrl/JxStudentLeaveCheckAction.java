package com.saint.teaching.ctrl;

import java.io.PrintWriter;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.pub.util.json.JsonUtil;
import com.saint.systemManager.bean.FrmCodeEntity;
import com.saint.systemManager.bean.FrmCodeKey;
import com.saint.systemManager.bean.FrmSysparaTypeEntity;
import com.saint.systemManager.bean.FrmSysparaTypeKey;
import com.saint.systemManager.services.IFrmCodeService;
import com.saint.systemManager.services.IFrmSysparaTypeService;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.teaching.bean.JxStudentLeaveCheckEntity;
import com.saint.teaching.bean.JxStudentLeaveEntity;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.services.IJxStudentLeaveCheckService;
import com.saint.teaching.services.IJxStudentLeaveService;
import com.saint.teaching.services.IJxStudentsService;
import com.saint.teaching.sqlWhere.JxStudentLeaveCheckSqlWhere;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatSysparamEntity;
import com.saint.wechat.manager.bean.WechatSysparamKey;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.services.IWechatSysparamService;
import com.saint.wechat.manager.sqlWhere.WechatBindSqlWhere;

/**
*类注释信息
*表名JX_STUDENT_LEAVE_CHECK
*表说明学生请假审核
  */
public class JxStudentLeaveCheckAction extends MultiActionController {
	
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxStudentLeaveCheckService jxStudentLeaveCheckService;
    
    private IJxStudentLeaveService jxStudentLeaveService;
    
    private IWechatBindService wechatBindService;
    
    private IWechatSysparamService wechatSysparamService;
    
    private IFrmSysparaTypeService frmSysparaTypeService;
    
    private IJxStudentsService jxStudentsService;
    
    private IFrmCodeService frmCodeService;
    
    public static String clientsxh="6201001002";

    /**
    *方法注释信息
    *分页查询表JX_STUDENT_LEAVE_CHECK
    *表说明学生请假审核
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public void getListPageJxStudentLeaveCheck(HttpServletRequest request, HttpServletResponse response, JxStudentLeaveCheckSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//接受参数page和rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<JxStudentLeaveCheckEntity> entitylist=jxStudentLeaveCheckService.selectListPageJxStudentLeaveCheckBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("rows", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxStudentLeaveCheck.toString(),Tools.getException(e));
        }
    }

    /**
     * 学生请假审核(ywq)
     * @param request
     * @param response
     * @param entity
     */
    public void insertJxStudentLeaveCheck(HttpServletRequest request, HttpServletResponse response, JxStudentLeaveCheckEntity entity) {
    	response.setContentType("text/html;charset=UTF-8");
    	PrintWriter out = null;
    	ExcuteResult result;
    	ExcuteResult result2;
    	Map<String,Object> resultMap = new HashMap();
        try {
            out = response.getWriter();
            String openId = request.getParameter("openId");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openId,clientsxh);//获得当前审批人绑定信息
            String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            //---------------------------------------请假内容信息--------------------------------------------
            String Info = request.getParameter("Info");
            Info = URLDecoder.decode(Info, "utf-8"); 
        	entity = JsonUtil.json2Object(Info, JxStudentLeaveCheckEntity.class);
        	entity.setCheckperid(bindinfo.getYitongCard());
        	entity.setCheckperdepart(bindinfo.getDeptId());
        	entity.setCreatedate(time);
        	entity.setUptime(time);
        	JxStudentsEntity student = jxStudentsService.selectJxStudentsByPrimaryKey(bindinfo.getYitongCard());
        	//----------------------------------------插入审核信息-------------------------------------------
        	JxStudentLeaveCheckSqlWhere jslcsqlWhere = new JxStudentLeaveCheckSqlWhere();
        	jslcsqlWhere.setStulevid(entity.getStulevid());
        	jslcsqlWhere.setCheckorder(entity.getCheckorder());
        	List<JxStudentLeaveCheckEntity> jslist = jxStudentLeaveCheckService.selectListJxStudentLeaveCheckBySqlWhere(jslcsqlWhere);
        	if(jslist.size()>0){
        		entity.setXh(jslist.get(0).getXh());
        		result = jxStudentLeaveCheckService.updateJxStudentLeaveCheckByPrimaryKeySelective(entity);
        	}else{
        		result = jxStudentLeaveCheckService.insertJxStudentLeaveCheck(entity);
        	}
        	//----------------------------------------获取微信配置信息----------------------------------------
        	WechatSysparamKey key = new WechatSysparamKey();
        	key.setGjz("RES_PATH");
        	key.setClientsxh(clientsxh);
        	WechatSysparamEntity sys = wechatSysparamService.selectWechatSysparamByPrimaryKey(key);
        	//----------------------------------------获得请假内容信息---------------------------------------------------
        	JxStudentLeaveEntity sleave = jxStudentLeaveService.selectJxStudentLeaveByPrimaryKey(entity.getStulevid());
        	String remark = sleave.getCause();//请假事由
        	
        	if(result.getReturnCode().equals("1")){
        		String s1 = entity.getCheckorder();//请假审核级别；1：科室审核；2：科教科审核；3：学校审核
        		String s2 = entity.getState();//请假审核状态；1：通过；2：不通过；
        		//---------------------------------------获得请假学生的绑定信息----------------------------------------------------------
        		WechatBindSqlWhere bindsqlWhere = new WechatBindSqlWhere();
    			bindsqlWhere.setYitongCard(sleave.getStuid());
    			bindsqlWhere.setClientsxh(clientsxh);
    			List<WechatBindEntity> bindList = wechatBindService.selectListWechatBindBySqlWhere(bindsqlWhere);
        		String template_id="";//模板ID
        		String mtype = "";//1：您收到新的请假申请，请及时审批。 2：您的请假申请已审批完成，请及时查看。
        		String sptype = "";//页面判断标识：审核意见框的显示（1，2，4）；审核按钮的不同（1：科室审核；2：科教科审核；4：学校审核；sptype!=1&&sptype!=3&&sptype!=2：撤销、催办）
        		String kjkopenid = "";//审核人openid
        		//---------------------------------------如果是科室审核---------------------------------------------------
        		if(s1.equals("1")){
        			String leavedatestart = request.getParameter("leavedatestart");
            		String leavedateend = request.getParameter("leavedateend");
                	long statedate = getMillils(leavedatestart);
                	long enddate = getMillils(leavedateend);
                	long shc = enddate-statedate;//计算开始与结束时间段相差毫秒数
        			//-------------------------如果科室审核通过，则判断是否小于三天，小于三天直接审核完成即可---------------------------
        			if(s2.equals("1")){//如果是科室审核
        				if(shc<86400000*3){//如果请假天数小于三天
        					s1="2";
        					mtype = "2";
        					template_id = getssysTypeMrz("qjsqjgmid");//请假结果模板ID
        					kjkopenid = bindList.size()>0?bindList.get(0).getOpenId():"";//请假人的OPID
        					sptype = "5";
        				}else{
        					mtype = "1";
        					template_id = getssysTypeMrz("qjsqmid");//请假申请模板
        					FrmCodeKey codekey = new FrmCodeKey();
        					codekey.setXtlb("00");
        					codekey.setDmlb("1676");
        					codekey.setDmz(student.getGraduateschool());
        					FrmCodeEntity schcode = frmCodeService.selectFrmCodeByPrimaryKey(codekey);
        					//kjkopenid = getssysTypeMrz("schoolfzropid");  //学校审核人openid
        					kjkopenid = schcode.getDmsm3();
        					sptype = "4";
        				}
        			}else{//如果科室审核不通过 ，则直接推送给当事人
        				mtype = "2";
        				template_id = getssysTypeMrz("qjsqjgmid");//请假结果模板ID
        				kjkopenid = bindList.size()>0?bindList.get(0).getOpenId():"";//请假人的OPID
            			remark = "科室审批不通过！";
            			sptype = "3";
        			}
        		}
        		//------------------------------------------如果是学校审核-------------------------------------------
        		if(s1.equals("3")){
        			if(s2.equals("1")){//如果审核通过
        				mtype = "1";
            			template_id = getssysTypeMrz("qjsqmid");//请假申请模板
            			kjkopenid = getssysTypeMrz("kjksp");  //科教科审核人openid
            			sptype = "2";
        			}else{//如果审核不通过 ，则直接推送给当事人
        				mtype = "2";
        				template_id = getssysTypeMrz("qjsqjgmid");//请假结果模板ID
        				kjkopenid = bindList.size()>0?bindList.get(0).getOpenId():"";//请假人的OPID
            			remark = "学校审批不通过！";
            			sptype = "3";
        			}
        		}
        		if(s1.equals("2")){
        			mtype = "2";
        			template_id = getssysTypeMrz("qjsqjgmid");
        			kjkopenid = bindList.size()>0?bindList.get(0).getOpenId():"";//请假人的OPID
        			remark = entity.getState().equals("2")?"请假审批不通过！":"请假审批通过！";
        			sptype = "3";
        		}
        		String url = sys.getDmz()+"/jxstuleave.do?method=toMineLeavePage&xh="+entity.getStulevid()+"&sptype="+sptype+"&openId="+kjkopenid;
        		JxStudentLeaveEntity record = new JxStudentLeaveEntity();
        		record.setXh(entity.getStulevid());
        		String leavestate = s1+"-"+s2;
        		record.setState(leavestate);
        		result2 = jxStudentLeaveService.updateJxStudentLeaveByPrimaryKeySelective(record);
        		if(result2.getReturnCode().equals("1")){
        			resultMap.put("errorMsg", "success");
        			//-------------------------------------微信消息推送--------------------------------------
        			JxCommonAction.WechatTemplateSend(mtype,kjkopenid,url,sleave.getStuname(),time,remark,template_id);
        		}
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
    /**
    *方法注释信息
    *JX_STUDENT_LEAVE_CHECK,学生请假审核表,修改
      */
    public void updateJxStudentLeaveCheck(HttpServletRequest request, HttpServletResponse response, JxStudentLeaveCheckEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxStudentLeaveCheckService.updateJxStudentLeaveCheckByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get主键+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateJxStudentLeaveCheck, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateJxStudentLeaveCheck.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *JX_STUDENT_LEAVE_CHECK,学生请假审核表,删除
      */
    public void deleteJxStudentLeaveCheck(HttpServletRequest request, HttpServletResponse response, JxStudentLeaveCheckEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String xh=entity.getXh();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxStudentLeaveCheckService.deleteJxStudentLeaveCheckByPrimaryKey(xh);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteJxStudentLeaveCheck, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteJxStudentLeaveCheck.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }
    /**
     * 根据时间获得毫秒数
     * @param time
     * @return
     */
    public long getMillils(String time){
    	long millils = 0;
    	try {
             Calendar c = Calendar.getInstance();
             c.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(time));
             millils = c.getTimeInMillis();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return millils;
    }
    /**
    *方法注释信息
    *JX_STUDENT_LEAVE_CHECK,学生请假审核表
    *跳转到新增页面
      */
    public ModelAndView toCreateAddPageJxStudentLeaveCheck(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //新增页面
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "add");
        return view;
    }

    /**
    *方法注释信息
    *JX_STUDENT_LEAVE_CHECK,学生请假审核表
    *跳转到修改页面
      */
    public ModelAndView toCreateUpdatePageJxStudentLeaveCheck(HttpServletRequest request, HttpServletResponse response, JxStudentLeaveCheckEntity entity) {
        String xh=entity.getXh();
        //修改页面
        JxStudentLeaveCheckEntity entityJxStudentLeaveCheckEntity=jxStudentLeaveCheckService.selectJxStudentLeaveCheckByPrimaryKey(xh);
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxStudentLeaveCheckEntity);
        return view;
    }
    
    public String getssysTypeMrz(String gjz){
    	FrmSysparaTypeEntity entity = null;
    	try {
    		FrmSysparaTypeKey key = new FrmSysparaTypeKey(); 
    		key.setXtlb("00");
    		key.setGjz(gjz);
        	entity = frmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(key);//请假审核完成，推送给学生模板
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return entity.getMrz(); 
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

    public void setJxStudentLeaveCheckService(IJxStudentLeaveCheckService jxStudentLeaveCheckService) {
        this.jxStudentLeaveCheckService = jxStudentLeaveCheckService;
    }

    public IJxStudentLeaveCheckService getJxStudentLeaveCheckService() {
        return jxStudentLeaveCheckService;
    }

	public IJxStudentLeaveService getJxStudentLeaveService() {
		return jxStudentLeaveService;
	}

	public void setJxStudentLeaveService(
			IJxStudentLeaveService jxStudentLeaveService) {
		this.jxStudentLeaveService = jxStudentLeaveService;
	}

	public IWechatBindService getWechatBindService() {
		return wechatBindService;
	}

	public void setWechatBindService(IWechatBindService wechatBindService) {
		this.wechatBindService = wechatBindService;
	}

	public IWechatSysparamService getWechatSysparamService() {
		return wechatSysparamService;
	}

	public void setWechatSysparamService(
			IWechatSysparamService wechatSysparamService) {
		this.wechatSysparamService = wechatSysparamService;
	}

	public IFrmSysparaTypeService getFrmSysparaTypeService() {
		return frmSysparaTypeService;
	}

	public void setFrmSysparaTypeService(
			IFrmSysparaTypeService frmSysparaTypeService) {
		this.frmSysparaTypeService = frmSysparaTypeService;
	}

	public IJxStudentsService getJxStudentsService() {
		return jxStudentsService;
	}

	public void setJxStudentsService(IJxStudentsService jxStudentsService) {
		this.jxStudentsService = jxStudentsService;
	}

	public IFrmCodeService getFrmCodeService() {
		return frmCodeService;
	}

	public void setFrmCodeService(IFrmCodeService frmCodeService) {
		this.frmCodeService = frmCodeService;
	}
    
	
    
}