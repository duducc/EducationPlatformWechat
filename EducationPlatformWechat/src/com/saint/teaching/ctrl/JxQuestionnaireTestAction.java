package com.saint.teaching.ctrl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.teaching.bean.JxCourseArrangeEntity;
import com.saint.teaching.bean.JxQuestionnaireTestEntity;
import com.saint.teaching.bean.JxQuestionnaireTestListEntity;
import com.saint.teaching.bean.QueryandRecord;
import com.saint.teaching.services.IJxCourseArrangeService;
import com.saint.teaching.services.IJxCoursePlanService;
import com.saint.teaching.services.IJxQuestionnaireTestService;
import com.saint.teaching.sqlWhere.JxQuestionnaireTestSqlWhere;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.services.IWechatBindService;

/**
*类注释信息
*表名JX_QUESTIONNAIRE_TEST
*表说明学员分数明细
  */
public class JxQuestionnaireTestAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxQuestionnaireTestService jxQuestionnaireTestService;
    
    private IJxCourseArrangeService jxCourseArrangeService;
    
    private IWechatBindService wechatBindService;
    
    private IJxCoursePlanService jxCoursePlanService;
    
    /**
    *方法注释信息
    *JX_QUESTIONNAIRE_TEST,学员分数明细表
    *跳转到新增页面
      */
    public ModelAndView toSogumpSurvey(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        ModelAndView view=null;
        try {
        	String xh = request.getParameter("xh");
        	String openId = request.getParameter("openId");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openId,clientsxh);
        	String courseId = request.getParameter("courseId");
        	JxCourseArrangeEntity arrange = jxCourseArrangeService.selectJxCourseArrangeByPrimaryKey(courseId);
        	String skdarte = arrange.getSkdate().substring(0,10)+" "+arrange.getShtime();
        	List<JxQuestionnaireTestListEntity> erreylist = QuestgetListCommon("llkwjtm");
        	view=new ModelAndView("llcourse/sogump_survey");
        	view.addObject("erreylist", erreylist);
        	view.addObject("openId", openId);
        	view.addObject("clientsxh", clientsxh);
        	view.addObject("wjlb", "llkwjtm");
        	view.addObject("listsize", erreylist.size());
        	view.addObject("studentid", bindinfo.getYitongCard());
        	view.addObject("studentname", bindinfo.getXm());
        	view.addObject("courseid", arrange.getCoursenum());
        	view.addObject("coursename", arrange.getCoursename());
        	view.addObject("arrangexh", courseId);
        	view.addObject("jshnr", arrange.getJshnr());
        	view.addObject("rkjshid", arrange.getRkjshid());
        	view.addObject("rkjshname", arrange.getRkjshname());
        	view.addObject("skdarte",skdarte);
        	view.addObject("xh",xh);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }
    /**
     *方法注释信息
     *JX_QUESTIONNAIRE_TEST,学员分数明细表
     *跳转到新增页面
       */
    /**
     * &xh="+xh+"&openid="+openid+"&clientsxh="+clientsxh
	 		+"&teacherId="+teacherId+"&teacherName="+teacherName+"&type="+type
     * @param request
     * @param response
     * @return
     */
     public ModelAndView toDjshcSurvey(HttpServletRequest request, HttpServletResponse response) {
         response.setContentType("text/html; charset=utf-8");
         ModelAndView view=null;
         try {
         	String xh = request.getParameter("xh");
         	String openid = request.getParameter("openid");
         	String clientsxh = request.getParameter("clientsxh");
         	String teacherId = request.getParameter("teacherId");
         	String teacherName = request.getParameter("teacherName");
         	String type = request.getParameter("type");
         	String zttime = request.getParameter("zttime");
         	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
         	List<JxQuestionnaireTestListEntity> erreylist = QuestgetListCommon("djscwqx");
         	view=new ModelAndView("llcourse/sogump_survey");
         	view.addObject("erreylist", erreylist);
         	view.addObject("openId", openid);
         	view.addObject("clientsxh", clientsxh);
         	view.addObject("wjlb", "llkwjtm");
         	view.addObject("listsize", erreylist.size());
         	view.addObject("studentid", bindinfo.getYitongCard());
         	view.addObject("studentname", bindinfo.getXm());
         	view.addObject("jshnr", type);
         	view.addObject("rkjshid", teacherId);
         	view.addObject("rkjshname", teacherName);
         	view.addObject("skdarte",zttime);
         	view.addObject("xh",xh);
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
         return view;
     }
    /**
     * 问卷星获取list公共方法（ywq）
     * @param wjlb
     * @return
     */
    public List<JxQuestionnaireTestListEntity> QuestgetListCommon(String wjlb){
    	List<JxQuestionnaireTestListEntity> erreylist = new ArrayList<JxQuestionnaireTestListEntity>();
    	try {
    		JxQuestionnaireTestSqlWhere sqlWhere = new JxQuestionnaireTestSqlWhere();
    		sqlWhere.setWjlb(wjlb);
    		List<JxQuestionnaireTestEntity> list = jxQuestionnaireTestService.selectListJxQuestionnaireTestBySqlWhere(sqlWhere);
    		for(int i=0;i<list.size();i++){
        		JxQuestionnaireTestListEntity listentity = new JxQuestionnaireTestListEntity();
        		JxQuestionnaireTestEntity entity = list.get(i);
        		listentity.setTest(entity);
        		String[] wt = entity.getWtda().split("/");
        		String[] fsh = entity.getBzda().split("/");
        		List<QueryandRecord> qlist = new ArrayList<QueryandRecord>();
        		for(int j=0;j<wt.length;j++){
        			QueryandRecord qr = new QueryandRecord();
        			qr.setXh(j+1);
        			qr.setWt(wt[j]);
        			qr.setFsh(fsh[j]);
        			qlist.add(qr);
        		}
        		listentity.setQrList(qlist);
        		listentity.setTotalProgress(i+1);
        		erreylist.add(listentity);
        	}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return erreylist;
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

    public void setJxQuestionnaireTestService(IJxQuestionnaireTestService jxQuestionnaireTestService) {
        this.jxQuestionnaireTestService = jxQuestionnaireTestService;
    }

    public IJxQuestionnaireTestService getJxQuestionnaireTestService() {
        return jxQuestionnaireTestService;
    }
	public IWechatBindService getWechatBindService() {
		return wechatBindService;
	}
	public void setWechatBindService(IWechatBindService wechatBindService) {
		this.wechatBindService = wechatBindService;
	}
	public IJxCourseArrangeService getJxCourseArrangeService() {
		return jxCourseArrangeService;
	}
	public void setJxCourseArrangeService(
			IJxCourseArrangeService jxCourseArrangeService) {
		this.jxCourseArrangeService = jxCourseArrangeService;
	}
	public IJxCoursePlanService getJxCoursePlanService() {
		return jxCoursePlanService;
	}
	public void setJxCoursePlanService(IJxCoursePlanService jxCoursePlanService) {
		this.jxCoursePlanService = jxCoursePlanService;
	}
    
    
}