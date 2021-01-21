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
import com.saint.teaching.bean.JxTeachingManusEntity;
import com.saint.teaching.services.IJxTeachingManusService;
import com.saint.teaching.sqlWhere.JxTeachingManusSqlWhere;

/**
*类注释信息
*表名JX_TEACHING_MANUS
*表说明带教手册类别
  */
public class JxTeachingManusAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxTeachingManusService jxTeachingManusService;

    /**
    *方法注释信息
    *分页查询表JX_TEACHING_MANUS
    *表说明带教手册类别
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public void getListPageJxTeachingManus(HttpServletRequest request, HttpServletResponse response, JxTeachingManusSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("limit"));//接受参数page和rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<JxTeachingManusEntity> entitylist=jxTeachingManusService.selectListPageJxTeachingManusBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("code", 0);//成功   
            jsonMap.put("msg", "查询成功");//成功   
            jsonMap.put("count", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("data", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxTeachingManus.toString(),Tools.getException(e));
        }
    }

    /**
    *方法注释信息
    *页面跳转方法
      */
    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, JxTeachingManusEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertJxTeachingManus(request,response,entity);
        }else if(option.equals("edit")){
            updateJxTeachingManus(request,response,entity);
        }else if(option.equals("delete")){
            deleteJxTeachingManus(request,response,entity);
        }
    }

    /**
    *方法注释信息
    *JX_TEACHING_MANUS,带教手册类别表,插入信息
      */
    public void insertJxTeachingManus(HttpServletRequest request, HttpServletResponse response, JxTeachingManusEntity entity) {
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxTeachingManusService.insertJxTeachingManus(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.主键()+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.insertJxTeachingManus, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.insertJxTeachingManus.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *JX_TEACHING_MANUS,带教手册类别表,修改
      */
    public void updateJxTeachingManus(HttpServletRequest request, HttpServletResponse response, JxTeachingManusEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxTeachingManusService.updateJxTeachingManusByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get主键+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateJxTeachingManus, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateJxTeachingManus.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *JX_TEACHING_MANUS,带教手册类别表,删除
      */
    public void deleteJxTeachingManus(HttpServletRequest request, HttpServletResponse response, JxTeachingManusEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String manuId=entity.getManuId();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxTeachingManusService.deleteJxTeachingManusByPrimaryKey(manuId);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteJxTeachingManus, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteJxTeachingManus.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *JX_TEACHING_MANUS,带教手册类别表
    *跳转到新增页面
      */
    public ModelAndView toCreateAddPageJxTeachingManus(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //新增页面
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "add");
        return view;
    }

    /**
    *方法注释信息
    *JX_TEACHING_MANUS,带教手册类别表
    *跳转到修改页面
      */
    public ModelAndView toCreateUpdatePageJxTeachingManus(HttpServletRequest request, HttpServletResponse response, JxTeachingManusEntity entity) {
        String manuId=entity.getManuId();
        //修改页面
        JxTeachingManusEntity entityJxTeachingManusEntity=jxTeachingManusService.selectJxTeachingManusByPrimaryKey(manuId);
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxTeachingManusEntity);
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

    public void setJxTeachingManusService(IJxTeachingManusService jxTeachingManusService) {
        this.jxTeachingManusService = jxTeachingManusService;
    }

    public IJxTeachingManusService getJxTeachingManusService() {
        return jxTeachingManusService;
    }
}