package com.saint.teaching.ctrl;

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
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.teaching.bean.JxCoursePlanEntity;
import com.saint.teaching.services.IJxCoursePlanService;
import com.saint.teaching.sqlWhere.JxCoursePlanSqlWhere;

/**
*类注释信息
*表名JX_COURSEPLAN
*表说明理论课教学进度
  */
public class JxCoursePlanAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxCoursePlanService jxCoursePlanService;

    /**
    *方法注释信息
    *分页查询表JX_COURSEPLAN
    *表说明理论课教学进度
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public void getListPageJxCoursePlan(HttpServletRequest request, HttpServletResponse response, JxCoursePlanSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//接受参数page和rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<JxCoursePlanEntity> entitylist=jxCoursePlanService.selectListPageJxCoursePlanBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("rows", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxCoursePlan.toString(),Tools.getException(e));
        }
    }

    /**
    *方法注释信息
    *页面跳转方法
      */
    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, JxCoursePlanEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertJxCoursePlan(request,response,entity);
        }else if(option.equals("edit")){
            updateJxCoursePlan(request,response,entity);
        }else if(option.equals("delete")){
            deleteJxCoursePlan(request,response,entity);
        }
    }

    /**
    *方法注释信息
    *JX_COURSEPLAN,理论课教学进度表,插入信息
      */
    public void insertJxCoursePlan(HttpServletRequest request, HttpServletResponse response, JxCoursePlanEntity entity) {
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxCoursePlanService.insertJxCoursePlan(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.主键()+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.insertJxCoursePlan, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.insertJxCoursePlan.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *JX_COURSEPLAN,理论课教学进度表,修改
      */
    public void updateJxCoursePlan(HttpServletRequest request, HttpServletResponse response, JxCoursePlanEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxCoursePlanService.updateJxCoursePlanByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get主键+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateJxCoursePlan, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateJxCoursePlan.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *JX_COURSEPLAN,理论课教学进度表,删除
      */
    public void deleteJxCoursePlan(HttpServletRequest request, HttpServletResponse response, JxCoursePlanEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String xh=entity.getXh();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxCoursePlanService.deleteJxCoursePlanByPrimaryKey(xh);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteJxCoursePlan, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteJxCoursePlan.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *JX_COURSEPLAN,理论课教学进度表
    *跳转到新增页面
      */
    public ModelAndView toCreateAddPageJxCoursePlan(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //新增页面
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "add");
        return view;
    }

    /**
    *方法注释信息
    *JX_COURSEPLAN,理论课教学进度表
    *跳转到修改页面
      */
    public ModelAndView toCreateUpdatePageJxCoursePlan(HttpServletRequest request, HttpServletResponse response, JxCoursePlanEntity entity) {
        String xh=entity.getXh();
        //修改页面
        JxCoursePlanEntity entityJxCoursePlanEntity=jxCoursePlanService.selectJxCoursePlanByPrimaryKey(xh);
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxCoursePlanEntity);
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

    public void setJxCoursePlanService(IJxCoursePlanService jxCoursePlanService) {
        this.jxCoursePlanService = jxCoursePlanService;
    }

    public IJxCoursePlanService getJxCoursePlanService() {
        return jxCoursePlanService;
    }
}