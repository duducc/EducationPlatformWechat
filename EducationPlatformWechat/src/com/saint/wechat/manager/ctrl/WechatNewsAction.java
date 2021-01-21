package com.saint.wechat.manager.ctrl;

import com.google.gson.Gson;
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.wechat.manager.bean.WechatNewsEntity;
import com.saint.wechat.manager.services.IWechatNewsService;
import com.saint.wechat.manager.sqlWhere.WechatNewsSqlWhere;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class WechatNewsAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IWechatNewsService wechatNewsService;

    public void getListPageWechatNews(HttpServletRequest request, HttpServletResponse response, WechatNewsSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//接受参数page和rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<WechatNewsEntity> entitylist=wechatNewsService.selectListPageWechatNewsBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("rows", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageWechatNews.toString(),Tools.getException(e));
        }
    }

    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, WechatNewsEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertWechatNews(request,response,entity);
        }else if(option.equals("edit")){
            updateWechatNews(request,response,entity);
        }else if(option.equals("delete")){
            deleteWechatNews(request,response,entity);
        }
    }

    public void insertWechatNews(HttpServletRequest request, HttpServletResponse response, WechatNewsEntity entity) {
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = wechatNewsService.insertWechatNews(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.主键()+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.insertWechatNews, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.insertWechatNews.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public void updateWechatNews(HttpServletRequest request, HttpServletResponse response, WechatNewsEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = wechatNewsService.updateWechatNewsByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get主键+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateWechatNews, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateWechatNews.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public void deleteWechatNews(HttpServletRequest request, HttpServletResponse response, WechatNewsEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String ywxh=entity.getYwxh();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = wechatNewsService.deleteWechatNewsByPrimaryKey(ywxh);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteWechatNews, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteWechatNews.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public ModelAndView toCreateAddPageWechatNews(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //新增页面
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "add");
        return view;
    }

    public ModelAndView toCreateUpdatePageWechatNews(HttpServletRequest request, HttpServletResponse response, WechatNewsEntity entity) {
        String ywxh=entity.getYwxh();
        //修改页面
        WechatNewsEntity entityWechatNewsEntity=wechatNewsService.selectWechatNewsByPrimaryKey(ywxh);
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityWechatNewsEntity);
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

    public void setWechatNewsService(IWechatNewsService wechatNewsService) {
        this.wechatNewsService = wechatNewsService;
    }

    public IWechatNewsService getWechatNewsService() {
        return wechatNewsService;
    }
}