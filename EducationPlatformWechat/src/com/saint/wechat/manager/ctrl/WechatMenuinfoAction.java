package com.saint.wechat.manager.ctrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.google.gson.Gson;
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.wechat.manager.bean.WechatMenuinfoEntity;
import com.saint.wechat.manager.services.IWechatMenuinfoService;
import com.saint.wechat.manager.sqlWhere.WechatMenugroupSqlWhere;
import com.saint.wechat.manager.sqlWhere.WechatMenuinfoSqlWhere;

public class WechatMenuinfoAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IWechatMenuinfoService wechatMenuinfoService;

    /***
	 * 微信总入口
	 * GET方法实现有效性验证
	 * POST方法实现业务逻辑处理
	 * @param request
	 * @param response
	 * @throws UnsupportedEncodingException 
	 */
	public void create(HttpServletRequest request,HttpServletResponse response,WechatMenugroupSqlWhere sqlWhere) throws UnsupportedEncodingException{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String method = request.getMethod();
		if("POST".equals(method.toUpperCase())){
			PrintWriter out = null;
			String result = wechatMenuinfoService.createMenu(sqlWhere);
        	try {
        		out = response.getWriter();
        		out.println(result);
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				IOUtils.closeQuietly(out);
			}	
		}
	}
	
    public void getListPageWechatMenuinfo(HttpServletRequest request, HttpServletResponse response, WechatMenuinfoSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//接受参数page和rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<WechatMenuinfoEntity> entitylist=wechatMenuinfoService.selectListPageWechatMenuinfoBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("rows", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageWechatMenuinfo.toString(),Tools.getException(e));
        }
    }

    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, WechatMenuinfoEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertWechatMenuinfo(request,response,entity);
        }else if(option.equals("edit")){
            updateWechatMenuinfo(request,response,entity);
        }else if(option.equals("delete")){
            deleteWechatMenuinfo(request,response,entity);
        }
    }

    public void insertWechatMenuinfo(HttpServletRequest request, HttpServletResponse response, WechatMenuinfoEntity entity) {
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = wechatMenuinfoService.insertWechatMenuinfo(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.主键()+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.insertWechatMenuinfo, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.insertWechatMenuinfo.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public void updateWechatMenuinfo(HttpServletRequest request, HttpServletResponse response, WechatMenuinfoEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = wechatMenuinfoService.updateWechatMenuinfoByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get主键+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateWechatMenuinfo, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateWechatMenuinfo.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public void deleteWechatMenuinfo(HttpServletRequest request, HttpServletResponse response, WechatMenuinfoEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String menuid=entity.getMenuid();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = wechatMenuinfoService.deleteWechatMenuinfoByPrimaryKey(menuid);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteWechatMenuinfo, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteWechatMenuinfo.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public ModelAndView toCreateAddPageWechatMenuinfo(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //新增页面
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "add");
        return view;
    }

    public ModelAndView toCreateUpdatePageWechatMenuinfo(HttpServletRequest request, HttpServletResponse response, WechatMenuinfoEntity entity) {
        String menuid=entity.getMenuid();
        //修改页面
        WechatMenuinfoEntity entityWechatMenuinfoEntity=wechatMenuinfoService.selectWechatMenuinfoByPrimaryKey(menuid);
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityWechatMenuinfoEntity);
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

    public void setWechatMenuinfoService(IWechatMenuinfoService wechatMenuinfoService) {
        this.wechatMenuinfoService = wechatMenuinfoService;
    }

    public IWechatMenuinfoService getWechatMenuinfoService() {
        return wechatMenuinfoService;
    }
}