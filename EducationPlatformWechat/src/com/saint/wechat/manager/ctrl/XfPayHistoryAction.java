package com.saint.wechat.manager.ctrl;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.ArrayUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatBindKey;
import com.saint.wechat.manager.bean.XfApplyChangeEntity;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.bean.XfPayHistoryEntity;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.services.IXfApplyChangeService;
import com.saint.wechat.manager.services.IXfEmployeeService;
import com.saint.wechat.manager.services.IXfPayHistoryService;
import com.saint.wechat.manager.sqlWhere.XfApplyChangeSqlWhere;
import com.saint.wechat.manager.sqlWhere.XfPayHistorySqlWhere;

public class XfPayHistoryAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IXfPayHistoryService xfPayHistoryService;

    private IWechatBindService wechatBindService;
    
    private IXfEmployeeService xfEmployeeService;
    
    private IXfApplyChangeService xfApplyChangeService;
    
    public void getListPageXfPayHistory(HttpServletRequest request, HttpServletResponse response, XfPayHistorySqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//接受参数page和rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<XfPayHistoryEntity> entitylist=xfPayHistoryService.selectListPageXfPayHistoryBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("rows", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageXfPayHistory.toString(),Tools.getException(e));
        }
    }

    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, XfPayHistoryEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertXfPayHistory(request,response,entity);
        }else if(option.equals("edit")){
            updateXfPayHistory(request,response,entity);
        }else if(option.equals("delete")){
            deleteXfPayHistory(request,response,entity);
        }
    }

    public void insertXfPayHistory(HttpServletRequest request, HttpServletResponse response, XfPayHistoryEntity entity) {
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = xfPayHistoryService.insertXfPayHistory(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.主键()+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.insertXfPayHistory, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.insertXfPayHistory.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public void updateXfPayHistory(HttpServletRequest request, HttpServletResponse response, XfPayHistoryEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = xfPayHistoryService.updateXfPayHistoryByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get主键+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateXfPayHistory, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateXfPayHistory.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public void deleteXfPayHistory(HttpServletRequest request, HttpServletResponse response, XfPayHistoryEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String xh=entity.getXh();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = xfPayHistoryService.deleteXfPayHistoryByPrimaryKey(xh);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteXfPayHistory, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteXfPayHistory.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public ModelAndView toCreateAddPageXfPayHistory(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //新增页面
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "add");
        return view;
    }

    public ModelAndView toCreateUpdatePageXfPayHistory(HttpServletRequest request, HttpServletResponse response, XfPayHistoryEntity entity) {
        String xh=entity.getXh();
        //修改页面
        XfPayHistoryEntity entityXfPayHistoryEntity=xfPayHistoryService.selectXfPayHistoryByPrimaryKey(xh);
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityXfPayHistoryEntity);
        return view;
    }

    /**
	 * 费用缴纳
	 * @param args
	 */
	public ModelAndView toPaymentManage(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html; charset=utf-8");
		String openid = request.getParameter("openid");
	    String clientsxh = request.getParameter("clientsxh");
        WechatBindKey key = new WechatBindKey();
        key.setOpenId(openid);
        key.setClientsxh(clientsxh);
        WechatBindEntity bindinfo = wechatBindService.selectWechatBindByPrimaryKey(key);
        String yitongcard = bindinfo.getYitongCard();
        XfEmployeeEntity empEntity = xfEmployeeService.selectXfEmployeeByPrimaryKey(yitongcard);
        String dqsj = "";
        if(empEntity != null) {
        	 dqsj = empEntity.getDqsj();
        }
       
        ModelAndView view = null;
        try {
        	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//小写的mm表示的是分钟  
        	Date dqdate=null;
        	if(dqsj!=null&&!dqsj.equals("")){
        		dqdate=sdf.parse(dqsj); //到期时间
        	}
        	Date date = new Date();	//当前时间
        	long shc = dqdate.getTime()-date.getTime();
        	if(bindinfo.getState().equals("1")||bindinfo.getState().equals("3")){
        		view = new ModelAndView("pages/tool/hint_bind1");
        	}else{
        		view = new ModelAndView("pages/payment_manage/payment_manage");
        		view.addObject("openId", openid);
        		view.addObject("clientsxh", clientsxh);
        		view.addObject("dqsj", dqsj);
        		view.addObject("bindinfo", bindinfo);
        		view.addObject("shc", shc);
        	}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return view;
	}
	public ModelAndView toPayRenewPage(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html; charset=utf-8");
		ModelAndView view = null;
		try {
			String type = request.getParameter("type");
			String openId = request.getParameter("openId");
		    String clientsxh = request.getParameter("clientsxh");
		    view = new ModelAndView("pages/tool/pay_renew");
		    if(type.equals("0")){
		    	view.addObject("monery", "￥150.00");
		    	view.addObject("type", type);
		    }else if(type.equals("1")){
				WechatBindEntity bindinfo = wechatBindService.getBindInfo(openId,clientsxh);
				XfEmployeeEntity entity = xfEmployeeService.selectXfEmployeeByPrimaryKey(bindinfo.getYitongCard());
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    			Date date = new Date();
    			String nowTime = df.format(date);
    			String dqsj = entity.getDqsj();
    			String returnValue = "-"; 
    	    	String [] str = dqsj.split("\\/"); 
    	    	dqsj = ArrayUtils.toString(str).replace(",", "-"); 
    	    	returnValue = dqsj.substring(1, dqsj.length()-1); 
    			Date dqsjdate = df.parse(returnValue);
    			if(dqsjdate.after(date)){
    				view.addObject("monery", "￥30.00");
    		    	view.addObject("type", "11");
    			}else{
    				view.addObject("monery", "￥150.00");
    		    	view.addObject("type", "12");
    			}
		    }else{
		    	view.addObject("monery", "￥120.00");
		    	view.addObject("type", type);
		    }
		    view.addObject("openId", openId);
		    view.addObject("clientsxh", clientsxh);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return view;
	}
	public ModelAndView toMyPaymentManage(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html; charset=utf-8");
		ModelAndView view = null;
		try {
			String openId = request.getParameter("openid");
			String clientsxh = request.getParameter("clientsxh");
			WechatBindEntity bidinfo = wechatBindService.getBindInfo(openId,clientsxh);
			XfApplyChangeSqlWhere sqlWhere = new XfApplyChangeSqlWhere();
			sqlWhere.setYitongcode(bidinfo.getYitongCard());
			sqlWhere.setBltype("1");
			sqlWhere.setState("1");
			List<XfApplyChangeEntity> list = xfApplyChangeService.selectListXfApplyChangeBySqlWhere_jd(sqlWhere);
			view = new ModelAndView("pages/payment_manage/my_payment_list");
			view.addObject("list", list);
			view.addObject("size", list.size());
			view.addObject("openId", openId);
			view.addObject("clientsxh", clientsxh);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return view;
	}
	/**
	 * 保存缴费历史记录
	 * @param request
	 * @param response
	 * @param entity
	 * @throws UnsupportedEncodingException
	 */
	public void savePayHistory(HttpServletRequest request,HttpServletResponse response) {
		response.setContentType("text/html; charset=utf-8");
		String openId = request.getParameter("openId");
		String clientsxh = request.getParameter("clientsxh");
		PrintWriter out = null;
	    ExcuteResult result;
	    Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			WechatBindKey key =new WechatBindKey();
			key.setOpenId(openId);
			key.setClientsxh(clientsxh);
			WechatBindEntity gzyh=wechatBindService.selectWechatBindByPrimaryKey(key);
			String yiyuan = gzyh.getRemark1();
			String yitongcard = gzyh.getYitongCard();
			String username = gzyh.getXm();
			String paymethod = request.getParameter("payfs");
			String paymoney = request.getParameter("paymoney");
	//		String yhreceipekh = request.getParameter("yhreceipekh");
			String rgreceipetel = request.getParameter("rgreceipetel");
	//		String yhrecripexm = new String(request.getParameter("yhrecripexm").getBytes("ISO-8859-1"), "UTF-8");
			String rgreceipexm = new String(request.getParameter("rgreceipexm").getBytes("ISO-8859-1"), "UTF-8");
			String rgbz = new String(request.getParameter("rgbz").getBytes("ISO-8859-1"), "UTF-8");
			String type = "1";
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date();
			String gxsj = df.format(date);
		    XfPayHistoryEntity entity = new XfPayHistoryEntity();
		    entity.setUsername(username);
		    entity.setYitongcard(yitongcard);
		    entity.setYiyuan(yiyuan);
		    entity.setPaymethod(paymethod);
		    entity.setPaymoney(paymoney);
	//	    entity.setYhreceipekh(yhreceipekh);
	//	    entity.setYhrecripexm(yhrecripexm);
		    entity.setRgreceipexm(rgreceipexm);
		    entity.setRgreceipetel(rgreceipetel);
		    entity.setRgbz(rgbz);
		    entity.setPaytime(gxsj);
		    entity.setGxsj(gxsj);
	    	out = response.getWriter();
    		result = xfPayHistoryService.insertXfPayHistory(entity);
    		if(result.getReturnCode().equals("1")){
    			//	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.锟斤拷锟斤拷()+"');");
    			resultMap.put("errorMsg", "success");
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
	 * 缴费历史记录
	 * @param request
	 * @param response
	 * @return
	 */
	public ModelAndView toPayHistoryPage(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html; charset=utf-8");
		ModelAndView view = null;
		try {
			String openId = request.getParameter("openid");
			String clientsxh = request.getParameter("clientsxh");
			WechatBindKey key =new WechatBindKey();
			key.setOpenId(openId);
			key.setClientsxh(clientsxh);
			WechatBindEntity gzyh=wechatBindService.selectWechatBindByPrimaryKey(key);
			String yitongcard = gzyh.getYitongCard();
			XfPayHistorySqlWhere historySqlWhere = new XfPayHistorySqlWhere();
			historySqlWhere.setYitongcard(yitongcard);
			List<XfPayHistoryEntity> list = xfPayHistoryService.selectListXfPayHistoryBySqlWhere(historySqlWhere);
			view = new ModelAndView("pages/payment_manage/payment_history_zs");
			view.addObject("list", list);
			view.addObject("openId", openId);
		    view.addObject("clientsxh", clientsxh);
		    view.addObject("size", list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return view;
	}
	public ModelAndView toPayHistoryPagexx(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html; charset=utf-8");
		ModelAndView view = null;
		try {
			String Id = request.getParameter("id");
			XfPayHistoryEntity entity = xfPayHistoryService.selectXfPayHistoryByPrimaryKey(Id);
			view = new ModelAndView("pages/payment_manage/payment_history_xx");
			view.addObject("entity", entity);
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

    public void setXfPayHistoryService(IXfPayHistoryService xfPayHistoryService) {
        this.xfPayHistoryService = xfPayHistoryService;
    }

    public IXfPayHistoryService getXfPayHistoryService() {
        return xfPayHistoryService;
    }

	public IWechatBindService getWechatBindService() {
		return wechatBindService;
	}

	public void setWechatBindService(IWechatBindService wechatBindService) {
		this.wechatBindService = wechatBindService;
	}

	public IXfEmployeeService getXfEmployeeService() {
		return xfEmployeeService;
	}

	public void setXfEmployeeService(IXfEmployeeService xfEmployeeService) {
		this.xfEmployeeService = xfEmployeeService;
	}

	public IXfApplyChangeService getXfApplyChangeService() {
		return xfApplyChangeService;
	}

	public void setXfApplyChangeService(IXfApplyChangeService xfApplyChangeService) {
		this.xfApplyChangeService = xfApplyChangeService;
	}
    
    
}