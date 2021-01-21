package com.saint.systemManager.ctrl;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.google.gson.Gson;
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.systemManager.bean.FrmZlExlogEntity;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.systemManager.sqlWhere.FrmZlExlogSqlWhere;

public class FrmZlExlogAction extends MultiActionController {
    private IFrmZlExlogService syslogService;

    private ProcessResultImpl processResultImpl;

    private IFrmZlExlogService frmZlExlogService;

    public void getListPageFrmZlExlog(HttpServletRequest request, HttpServletResponse response, FrmZlExlogSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//接受参数page和rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<FrmZlExlogEntity> entitylist=frmZlExlogService.selectListPageFrmZlExlogBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("rows", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            syslogService.saveFrmZlExlog(request,FrmGnid.selectListPageFrmZlExlog.toString(),Tools.getException(e));
        }
    }

    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, FrmZlExlogEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertFrmZlExlog(request,response,entity);
        }else if(option.equals("edit")){
            updateFrmZlExlog(request,response,entity);
        }else if(option.equals("delete")){
            deleteFrmZlExlog(request,response,entity);
        }
    }

    public void insertFrmZlExlog(HttpServletRequest request, HttpServletResponse response, FrmZlExlogEntity entity) {
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = frmZlExlogService.insertFrmZlExlog(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.主键()+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.insertFrmZlExlog, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            syslogService.saveFrmZlExlog(request,FrmGnid.insertFrmZlExlog.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public void updateFrmZlExlog(HttpServletRequest request, HttpServletResponse response, FrmZlExlogEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = frmZlExlogService.updateFrmZlExlogByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get主键+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateFrmZlExlog, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            syslogService.saveFrmZlExlog(request,FrmGnid.updateFrmZlExlog.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public void deleteFrmZlExlog(HttpServletRequest request, HttpServletResponse response, FrmZlExlogEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String iden=entity.getIden();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = frmZlExlogService.deleteFrmZlExlogByPrimaryKey(iden);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteFrmZlExlog, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            syslogService.saveFrmZlExlog(request,FrmGnid.deleteFrmZlExlog.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public ModelAndView toCreateAddPageFrmZlExlog(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //新增页面
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "add");
        return view;
    }

    public ModelAndView toCreateUpdatePageFrmZlExlog(HttpServletRequest request, HttpServletResponse response, FrmZlExlogEntity entity) {
        String iden=entity.getIden();
        //修改页面
        FrmZlExlogEntity entityFrmZlExlogEntity=frmZlExlogService.selectFrmZlExlogByPrimaryKey(iden);
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityFrmZlExlogEntity);
        return view;
    }

  

    public void setProcessResultImpl(ProcessResultImpl processResultImpl) {
        this.processResultImpl = processResultImpl;
    }

    public ProcessResultImpl getProcessResultImpl() {
        return processResultImpl;
    }

    public void setFrmZlExlogService(IFrmZlExlogService frmZlExlogService) {
        this.frmZlExlogService = frmZlExlogService;
    }

    public IFrmZlExlogService getFrmZlExlogService() {
        return frmZlExlogService;
    }
}