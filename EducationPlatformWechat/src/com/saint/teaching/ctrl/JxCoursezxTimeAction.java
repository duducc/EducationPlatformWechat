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
import com.saint.teaching.bean.JxCoursezxTimeEntity;
import com.saint.teaching.services.IJxCoursezxTimeService;
import com.saint.teaching.sqlWhere.JxCoursezxTimeSqlWhere;

/**
*类注释信息
*表名JX_COURSEZXTIME
*表说明理论课上课作息时间
  */
public class JxCoursezxTimeAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxCoursezxTimeService jxCoursezxTimeService;

    /**
    *方法注释信息
    *分页查询表JX_COURSEZXTIME
    *表说明理论课上课作息时间
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public void getListPageJxCoursezxTime(HttpServletRequest request, HttpServletResponse response, JxCoursezxTimeSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//接受参数page和rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<JxCoursezxTimeEntity> entitylist=jxCoursezxTimeService.selectListPageJxCoursezxTimeBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("rows", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxCoursezxTime.toString(),Tools.getException(e));
        }
    }

    /**
    *方法注释信息
    *页面跳转方法
      */
    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, JxCoursezxTimeEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertJxCoursezxTime(request,response,entity);
        }else if(option.equals("edit")){
            updateJxCoursezxTime(request,response,entity);
        }else if(option.equals("delete")){
            deleteJxCoursezxTime(request,response,entity);
        }
    }

    /**
    *方法注释信息
    *JX_COURSEZXTIME,理论课上课作息时间表,插入信息
      */
    public void insertJxCoursezxTime(HttpServletRequest request, HttpServletResponse response, JxCoursezxTimeEntity entity) {
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxCoursezxTimeService.insertJxCoursezxTime(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.主键()+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.insertJxCoursezxTime, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.insertJxCoursezxTime.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *JX_COURSEZXTIME,理论课上课作息时间表,修改
      */
    public void updateJxCoursezxTime(HttpServletRequest request, HttpServletResponse response, JxCoursezxTimeEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxCoursezxTimeService.updateJxCoursezxTimeByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get主键+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateJxCoursezxTime, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateJxCoursezxTime.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *JX_COURSEZXTIME,理论课上课作息时间表,删除
      */
    public void deleteJxCoursezxTime(HttpServletRequest request, HttpServletResponse response, JxCoursezxTimeEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String xh=entity.getXh();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxCoursezxTimeService.deleteJxCoursezxTimeByPrimaryKey(xh);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteJxCoursezxTime, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteJxCoursezxTime.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *JX_COURSEZXTIME,理论课上课作息时间表
    *跳转到新增页面
      */
    public ModelAndView toCreateAddPageJxCoursezxTime(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //新增页面
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "add");
        return view;
    }

    /**
    *方法注释信息
    *JX_COURSEZXTIME,理论课上课作息时间表
    *跳转到修改页面
      */
    public ModelAndView toCreateUpdatePageJxCoursezxTime(HttpServletRequest request, HttpServletResponse response, JxCoursezxTimeEntity entity) {
        String xh=entity.getXh();
        //修改页面
        JxCoursezxTimeEntity entityJxCoursezxTimeEntity=jxCoursezxTimeService.selectJxCoursezxTimeByPrimaryKey(xh);
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxCoursezxTimeEntity);
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

    public void setJxCoursezxTimeService(IJxCoursezxTimeService jxCoursezxTimeService) {
        this.jxCoursezxTimeService = jxCoursezxTimeService;
    }

    public IJxCoursezxTimeService getJxCoursezxTimeService() {
        return jxCoursezxTimeService;
    }
}