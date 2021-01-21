package com.saint.teaching.ctrl;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.teaching.services.IJxTeacherService;

/**
*类注释信息
*表名JX_TEACHER
*表说明教学教师信息
  */
public class JxTeacherAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxTeacherService jxTeacherService;
    

    
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

    public void setJxTeacherService(IJxTeacherService jxTeacherService) {
        this.jxTeacherService = jxTeacherService;
    }

    public IJxTeacherService getJxTeacherService() {
        return jxTeacherService;
    }
	
    
}