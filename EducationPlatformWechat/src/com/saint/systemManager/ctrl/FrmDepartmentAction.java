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
import com.saint.systemManager.bean.FrmDepartmentEntity;
import com.saint.systemManager.services.IFrmDepartmentService;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.systemManager.sqlWhere.FrmDepartmentSqlWhere;

/**
*类注释信息
*表名FRM_DEPARTMENT
*表说明部门信息
  */
public class FrmDepartmentAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IFrmDepartmentService frmDepartmentService;

    /**
    *方法注释信息
    *分页查询表FRM_DEPARTMENT
    *表说明部门信息
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public void getDeptByYiyuan(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
        	String yiyuan = request.getParameter("yiyuan");
            List<FrmDepartmentEntity> entitylist=frmDepartmentService.getListAlldeptBySqlWhere(yiyuan);
            out=response.getWriter();
            out.write(new Gson().toJson(entitylist));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageFrmDepartment.toString(),Tools.getException(e));
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

    public void setFrmDepartmentService(IFrmDepartmentService frmDepartmentService) {
        this.frmDepartmentService = frmDepartmentService;
    }

    public IFrmDepartmentService getFrmDepartmentService() {
        return frmDepartmentService;
    }
}