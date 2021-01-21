package com.saint.wechat.manager.ctrl;

import com.google.gson.Gson;
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.wechat.manager.bean.WechatClientinfoEntity;
import com.saint.wechat.manager.services.IWechatClientinfoService;
import com.saint.wechat.manager.sqlWhere.WechatClientinfoSqlWhere;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class WechatClientinfoAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IWechatClientinfoService wechatClientinfoService;

    public void getListPageWechatClientinfo(HttpServletRequest request, HttpServletResponse response, WechatClientinfoSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//接受参数page和rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<WechatClientinfoEntity> entitylist=wechatClientinfoService.selectListPageWechatClientinfoBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("rows", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageWechatClientinfo.toString(),Tools.getException(e));
        }
    }

    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, WechatClientinfoEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertWechatClientinfo(request,response,entity);
        }else if(option.equals("edit")){
            updateWechatClientinfo(request,response,entity);
        }else if(option.equals("delete")){
            deleteWechatClientinfo(request,response,entity);
        }
    }

    public void insertWechatClientinfo(HttpServletRequest request, HttpServletResponse response, WechatClientinfoEntity entity) {
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = wechatClientinfoService.insertWechatClientinfo(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.主键()+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.insertWechatClientinfo, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.insertWechatClientinfo.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public void updateWechatClientinfo(HttpServletRequest request, HttpServletResponse response, WechatClientinfoEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = wechatClientinfoService.updateWechatClientinfoByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get主键+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateWechatClientinfo, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateWechatClientinfo.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public void deleteWechatClientinfo(HttpServletRequest request, HttpServletResponse response, WechatClientinfoEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String clientsxh=entity.getClientsxh();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = wechatClientinfoService.deleteWechatClientinfoByPrimaryKey(clientsxh);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteWechatClientinfo, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteWechatClientinfo.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public ModelAndView toCreateAddPageWechatClientinfo(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //新增页面
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "add");
        return view;
    }

    public ModelAndView toCreateUpdatePageWechatClientinfo(HttpServletRequest request, HttpServletResponse response, WechatClientinfoEntity entity) {
        String clientsxh=entity.getClientsxh();
        //修改页面
        WechatClientinfoEntity entityWechatClientinfoEntity=wechatClientinfoService.selectWechatClientinfoByPrimaryKey(clientsxh);
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityWechatClientinfoEntity);
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

    public void setWechatClientinfoService(IWechatClientinfoService wechatClientinfoService) {
        this.wechatClientinfoService = wechatClientinfoService;
    }

    public IWechatClientinfoService getWechatClientinfoService() {
        return wechatClientinfoService;
    }
}