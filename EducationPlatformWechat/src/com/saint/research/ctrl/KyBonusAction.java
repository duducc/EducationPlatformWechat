package com.saint.research.ctrl;

import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.google.gson.Gson;
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.pub.util.json.JsonUtil;
import com.saint.research.bean.KyBonusEntity;
import com.saint.research.services.IKyBonusService;
import com.saint.research.sqlWhere.KyBonusSqlWhere;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatBindKey;
import com.saint.wechat.manager.bean.WechatClientinfoEntity;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.services.IWechatClientinfoService;

/**
*类注释信息
*表名KY_BONUS
*表说明科研奖金管理
*/
public class KyBonusAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;
    
    private ProcessResultImpl processResultImpl;
    
    private IKyBonusService kyBonusService;
    private IWechatClientinfoService wechatClientinfoService;
    private IWechatBindService wechatBindService;
    
    /**
    *方法注释信息
    *分页查询表KY_BONUS
    *表说明科研奖金管理
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public void getListPageKyBonus(HttpServletRequest request, HttpServletResponse response, KyBonusSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
        	int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("limit"));//接受参数page和rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            
            String params = request.getParameter("params") ;
            if( !StringUtils.isEmpty(params)){
            	 params = URLDecoder.decode(params, "utf-8"); 
      		     KyBonusEntity entity = (KyBonusEntity) JsonUtil.json2Object(params, KyBonusEntity.class);
      		     sqlWhere.setBonustype(entity.getBonustype());
      		     sqlWhere.setObtainname(entity.getObtainname());
      		     sqlWhere.setTitle(entity.getTitle());
            }
            
            List<KyBonusEntity> entitylist = kyBonusService.selectListPageKyBonusBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map
            jsonMap.put("code", 0);//rows键 存放每页记录 list
            jsonMap.put("msg", "");//rows键 存放每页记录 list
            jsonMap.put("count", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("data", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageKyBonus.toString(),Tools.getException(e));
        }
    }

    public ModelAndView toBonus(HttpServletRequest request, HttpServletResponse response){
   	 response.setContentType("text/html; charset=UTF-8");
   	 try {
   		 
   		 String clientSxh = request.getParameter("clientsxh");
   		String openid = request.getParameter("openid");
   		//WechatClientinfoEntity entity = wechatClientinfoService.selectWechatClientinfoByPrimaryKey(clientSxh);
   		List<KyBonusEntity> entitylist = null;
   		KyBonusSqlWhere sqlWhere = new KyBonusSqlWhere();
   		WechatBindEntity bindEntity = new WechatBindEntity();
   		WechatBindKey bindKey = new WechatBindKey();
   		bindKey.setOpenId(openid);
   		bindKey.setClientsxh(clientSxh);
   		bindEntity = wechatBindService.selectWechatBindByPrimaryKey(bindKey);
		sqlWhere.setObtainid(bindEntity.getYitongCard());
   		 /*if(entity.getWxtype().equals("3")){
   			
   		 }else{*/
   		if(request.getParameter("name")!=null){
   			//String name = new String(request.getParameter("name").getBytes("ISO-8859-1"), "UTF-8");
   			String name = request.getParameter("name");
			 sqlWhere.setTitle(name);
   		}
   			
   		 //}
			
			 //sqlWhere.setObtainid(userId);
			entitylist = kyBonusService.selectListKyBonusBySqlWhere(sqlWhere);
			ModelAndView view = new ModelAndView("research/bonus_main") ;
			view.addObject("list", entitylist);
			view.addObject("clientsxh", clientSxh);
			view.addObject("openid", openid);
			return view ; 
		} catch (Exception e) {
			e.printStackTrace();
		}
   	 return null;
		
	}
    public ModelAndView toBonusMsg(HttpServletRequest request, HttpServletResponse response){
   	 response.setContentType("text/html; charset=UTF-8");
   	 try {
			String xh = new String(request.getParameter("id").getBytes("ISO-8859-1"), "UTF-8");
			KyBonusEntity entity = kyBonusService.selectKyBonusByPrimaryKey(xh);
			ModelAndView view = new ModelAndView("bonus/bonus_msg") ;
			view.addObject("entity", entity);//奖金信息
			return view ; 
		} catch (Exception e) {
			e.printStackTrace();
		}
   	 return null;
		
	}
 
    
    /**
    *方法注释信息
    *KY_BONUS,科研奖金管理表
    *跳转到新增页面
      */
    public ModelAndView toCreateAddPageKyBonus(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "add");
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

    public void setKyBonusService(IKyBonusService kyBonusService) {
        this.kyBonusService = kyBonusService;
    }

    public IKyBonusService getKyBonusService() {
        return kyBonusService;
    }

	public IWechatClientinfoService getWechatClientinfoService() {
		return wechatClientinfoService;
	}

	public void setWechatClientinfoService(
			IWechatClientinfoService wechatClientinfoService) {
		this.wechatClientinfoService = wechatClientinfoService;
	}

	public IWechatBindService getWechatBindService() {
		return wechatBindService;
	}

	public void setWechatBindService(IWechatBindService wechatBindService) {
		this.wechatBindService = wechatBindService;
	}
    
    
}