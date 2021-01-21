package com.saint.systemManager.ctrl;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.google.gson.Gson;
import com.saint.constant.FrmGnid;
import com.saint.pub.Constant;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.systemManager.bean.FrmZlExlogEntity;
import com.saint.systemManager.bean.FrmZlLogEntity;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.systemManager.services.IFrmZlLogService;
import com.saint.systemManager.sqlWhere.FrmZlExlogSqlWhere;
import com.saint.systemManager.sqlWhere.FrmZlLogSqlWhere;

public class FrmZlLogAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IFrmZlLogService frmZlLogService;

    
  //转到日志管理页面
  	public ModelAndView tosyslog(HttpServletRequest request,HttpServletResponse response){
  		ModelAndView view=new ModelAndView();
  		String now=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
  		view.addObject("now", now);
  		return view;
  	}
  	
  	public ModelAndView sysloglist(HttpServletRequest request,HttpServletResponse response,FrmZlExlogSqlWhere sqlWhere){
  		ModelAndView view=new ModelAndView();
  		int page=1;
  		String cp=request.getParameter("page");
  		if(null!=cp && !"".equals(cp)){
  			page =Integer.parseInt(request.getParameter("page"));
  		}
  		int rows=Constant.SYSLOGLIST;//每页显示的行数
  		Page listPage=new Page(rows,page);
  		sqlWhere.setListPage(listPage);
  		List<FrmZlExlogEntity> syslogs=frmZlExlogService.selectListPageFrmZlExlogBySqlWhere(sqlWhere);
  		listPage.setPageData(syslogs);
  		view.addObject("page", listPage);
  		view.setViewName("sysManager/syslog_list");
  		return view;
  	}
    
    
    
    
    
    
    
    
    public void getListPageFrmZlLog(HttpServletRequest request, HttpServletResponse response, FrmZlLogSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//接受参数page和rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<FrmZlLogEntity> entitylist=frmZlLogService.selectListPageFrmZlLogBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("rows", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageFrmZlLog.toString(),Tools.getException(e));
        }
    }

    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, FrmZlLogEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertFrmZlLog(request,response,entity);
        }else if(option.equals("edit")){
            updateFrmZlLog(request,response,entity);
        }else if(option.equals("delete")){
            deleteFrmZlLog(request,response,entity);
        }
    }

    public void insertFrmZlLog(HttpServletRequest request, HttpServletResponse response, FrmZlLogEntity entity) {
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = frmZlLogService.insertFrmZlLog(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.主键()+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.insertFrmZlLog, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.insertFrmZlLog.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public void updateFrmZlLog(HttpServletRequest request, HttpServletResponse response, FrmZlLogEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = frmZlLogService.updateFrmZlLogByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get主键+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateFrmZlLog, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateFrmZlLog.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public void deleteFrmZlLog(HttpServletRequest request, HttpServletResponse response, FrmZlLogEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String iden=entity.getIden();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = frmZlLogService.deleteFrmZlLogByPrimaryKey(iden);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteFrmZlLog, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteFrmZlLog.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public ModelAndView toCreateAddPageFrmZlLog(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //新增页面
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "add");
        return view;
    }

    public ModelAndView toCreateUpdatePageFrmZlLog(HttpServletRequest request, HttpServletResponse response, FrmZlLogEntity entity) {
        String iden=entity.getIden();
        //修改页面
        FrmZlLogEntity entityFrmZlLogEntity=frmZlLogService.selectFrmZlLogByPrimaryKey(iden);
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityFrmZlLogEntity);
        return view;
    }




	public IFrmZlExlogService getFrmZlExlogService() {
		return frmZlExlogService;
	}

	public void setFrmZlExlogService(IFrmZlExlogService frmZlExlogService) {
		this.frmZlExlogService = frmZlExlogService;
	}

	public void setProcessResultImpl(ProcessResultImpl processResultImpl) {
        this.processResultImpl = processResultImpl;
    }

    public ProcessResultImpl getProcessResultImpl() {
        return processResultImpl;
    }

    public void setFrmZlLogService(IFrmZlLogService frmZlLogService) {
        this.frmZlLogService = frmZlLogService;
    }

    public IFrmZlLogService getFrmZlLogService() {
        return frmZlLogService;
    }
}