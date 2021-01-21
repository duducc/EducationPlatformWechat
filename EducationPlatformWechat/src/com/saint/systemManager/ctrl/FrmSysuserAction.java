package com.saint.systemManager.ctrl;

import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.pub.util.json.JsonUtil;
import com.saint.systemManager.bean.FrmProgramQxgroupEntity;
import com.saint.systemManager.bean.FrmSysuserEntity;
import com.saint.systemManager.services.IFrmSysuserService;
import com.saint.systemManager.services.IFrmZlExlogService;

public class FrmSysuserAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IFrmSysuserService frmSysuserService;
    
	
	/**
	 * 新增用户
	 * @param request
	 * @param response
	 * @param user
	 */
	public void addUser(HttpServletRequest request,HttpServletResponse response, FrmSysuserEntity user){
		PrintWriter out = null;
		ExcuteResult result;
		Map<String,Object> resultMap = new HashMap<String,Object>();
		try {
			out = response.getWriter();
			String userInfo = request.getParameter("userInfo") ;
			userInfo = URLDecoder.decode(userInfo, "utf-8"); 
            user = JsonUtil.json2Object(userInfo, FrmSysuserEntity.class);
			FrmProgramQxgroupEntity groupEntity = frmSysuserService.selectFrmProgramQxgroupByPrimaryKey(user.getQxgroup());
			user.setCxdh(groupEntity.getCxdh());
			result = frmSysuserService.insertFrmSysuser(user);
			if(result.getReturnCode().equals("1")){
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
	 * 修改密码
	 * @param request
	 * @param response
	 * @param sysuser
	 */
	public void updatePwd(HttpServletRequest request,HttpServletResponse response,FrmSysuserEntity sysuser){
		response.setContentType("text/html; charset=GBK");
		PrintWriter out = null;
		ExcuteResult result;
		try {
			result = frmSysuserService.updateUserMM(sysuser);
		    out = response.getWriter();
		    processResultImpl.processResult(request, result, FrmGnid.updateFrmSysuser, out);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(out!=null)out.close();
		}  
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

    public void setFrmSysuserService(IFrmSysuserService frmSysuserService) {
        this.frmSysuserService = frmSysuserService;
    }

    public IFrmSysuserService getFrmSysuserService() {
        return frmSysuserService;
    }

}