package com.saint.teaching.ctrl;

import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.pub.util.json.JsonUtil;
import com.saint.systemManager.bean.FrmSysparaTypeEntity;
import com.saint.systemManager.bean.FrmSysparaTypeKey;
import com.saint.systemManager.services.IFrmCodeService;
import com.saint.systemManager.services.IFrmSysparaTypeService;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.teaching.bean.JxClassStudentsEntity;
import com.saint.teaching.bean.JxCourseArrangeEntity;
import com.saint.teaching.bean.JxLunxunEntity;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.bean.JxStudentsInternshipProveEntity;
import com.saint.teaching.bean.JxStudentsInternshipProveKey;
import com.saint.teaching.bean.JxStudentsLeaveCheckEntity;
import com.saint.teaching.bean.JxStudentsLeaveEntity;
import com.saint.teaching.services.IJxClassStudentsService;
import com.saint.teaching.services.IJxCourseArrangeService;
import com.saint.teaching.services.IJxLunxunService;
import com.saint.teaching.services.IJxStudentsInternshipProveService;
import com.saint.teaching.services.IJxStudentsLeaveCheckService;
import com.saint.teaching.services.IJxStudentsLeaveService;
import com.saint.teaching.services.IJxStudentsService;
import com.saint.teaching.sqlWhere.JxClassStudentsSqlWhere;
import com.saint.teaching.sqlWhere.JxLunxunSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentsLeaveCheckSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentsLeaveSqlWhere;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatSysparamEntity;
import com.saint.wechat.manager.bean.WechatSysparamKey;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.services.IWechatSysparamService;
import com.saint.wechat.manager.sqlWhere.WechatBindSqlWhere;

/**
*��ע����Ϣ
*����JX_STUDENTS_LEAVE
*��˵��ѧ�����
  */
public class JxStudentsLeaveAction extends MultiActionController {
	private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxStudentsLeaveService jxStudentsLeaveService;
    
    private IJxStudentsLeaveCheckService jxStudentsLeaveCheckService;
    
    private IWechatBindService wechatBindService;
    
    private IJxStudentsService jxStudentsService;
    
    private IJxLunxunService jxLunxunService;
    
    private IWechatSysparamService wechatSysparamService;
    
    private IJxClassStudentsService jxClassStudentsService;

    private IFrmSysparaTypeService frmSysparaTypeService;
    
    private IJxStudentsInternshipProveService jxStudentsInternshipProveService;
    
    private IFrmCodeService frmCodeService;
    
    private IJxCourseArrangeService jxCourseArrangeService;
    
    public static String clientsxh="6201001002";
    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_STUDENTS_LEAVE
    *��˵��ѧ�����
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public void getListPageJxStudentsLeave(HttpServletRequest request, HttpServletResponse response, JxStudentsLeaveSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//���ܲ���page��rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<JxStudentsLeaveEntity> entitylist=jxStudentsLeaveService.selectListPageJxStudentsLeaveBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//����map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total�� ����ܼ�¼���������   
            jsonMap.put("rows", entitylist);//rows�� ���ÿҳ��¼ list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxStudentsLeave.toString(),Tools.getException(e));
        }
    }
    /**
     * ��ȡ��ѧ������б�ywq��
     * @param request
     * @param response
     * @param sqlWhere
     */
    public void getListJxStudentsLeave(HttpServletRequest request, HttpServletResponse response, JxStudentsLeaveSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
        	String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	String stuname = request.getParameter("stuname");
        	String state = request.getParameter("state");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	String usernumber = bindinfo.getYitongCard();
        	sqlWhere.setRemark1(usernumber);
        	sqlWhere.setState(state);
        	sqlWhere.setStuname(stuname);
        	//sqlWhere.setOrderByClause("LEAVEDATESTART");
            List<JxStudentsLeaveEntity> entitylist=jxStudentsLeaveService.selectListJxStudentsLeaveBySqlWhere(sqlWhere);
            out=response.getWriter();
            out.write(new Gson().toJson(entitylist));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxStudentsLeave.toString(),Tools.getException(e));
        }
    }
    /**
     * ��ת������ύҳ��(ywq)
     * @param request
     * @param response
     * @return
     */
    public ModelAndView ToStuLeavePage(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	String gxsj = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	JxStudentsEntity students = jxStudentsService.selectJxStudentsByPrimaryKey(bindinfo.getYitongCard());
        	if(students.getPertype().equals("2")||students.getPertype().equals("5")){
        		WechatBindEntity entity = getClassTeacherId(bindinfo.getYitongCard());
	        	int seq = jxStudentsLeaveService.selectXhJxStudentLeaveBySql();
	        	String xh = String.valueOf(seq);
	        	view = new ModelAndView("teaching/student_leave");
	        	view.addObject("bindinfo", bindinfo);
	        	view.addObject("time", gxsj);
	        	view.addObject("xh", xh);
	        	view.addObject("students", students);
	        	view.addObject("teacheropenid", entity.getOpenId());
	        	view.addObject("teacherid", entity.getYitongCard());
	        	view.addObject("teachername", entity.getXm());
	        	view.addObject("deptid", entity.getDeptId());
	        	view.addObject("deptname", entity.getRemark1());
        	}else{
        		view = new ModelAndView("teaching/common_notcanpage");
        	}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    /**
     * ��ת���ҵ������Ϣҳ��(ywq)
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toMineLeavePage(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String xh = request.getParameter("xh");
    		String sptype = request.getParameter("sptype");
    		String openId = request.getParameter("openId");
        	String gxsj = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        	JxStudentsLeaveEntity entity = jxStudentsLeaveService.selectJxStudentsLeaveByPrimaryKey(xh);
        	String stuid = entity.getStuid();
        	JxStudentsEntity stuentity = jxStudentsService.selectJxStudentsByPrimaryKey(stuid);
        	if(entity.getState().equals("2-1")||entity.getState().equals("2-2")){
        		sptype = "3";
        	}
        	long statedate = getMillils(entity.getLeavedatestart());
        	long enddate = getMillils(entity.getLeavedateend());
        	String sc = formatDuring(enddate-statedate);
        	long sjch = enddate-statedate;
        	String shjz = "";
        	if(sjch<86400000*3){
        		shjz = "1";
        	}else{
        		shjz = "2";
        	}
        	view = new ModelAndView("teaching/mine_leave_xx");
        	JxStudentsLeaveCheckSqlWhere sqlWhere = new JxStudentsLeaveCheckSqlWhere();
        	sqlWhere.setStulevid(xh);
        	sqlWhere.setCheckorder("1");
        	List<JxStudentsLeaveCheckEntity> ksch = jxStudentsLeaveCheckService.selectListJxStudentsLeaveCheckBySqlWhere(sqlWhere);
        	String ksshyj = ksch.size()>0?ksch.get(0).getExplanation():"";
        	sqlWhere.setCheckorder("2");
        	List<JxStudentsLeaveCheckEntity> kjkch = jxStudentsLeaveCheckService.selectListJxStudentsLeaveCheckBySqlWhere(sqlWhere);
        	String kjkshyj = kjkch.size()>0?kjkch.get(0).getExplanation():"";
        	sqlWhere.setCheckorder("3");
        	List<JxStudentsLeaveCheckEntity> schch = jxStudentsLeaveCheckService.selectListJxStudentsLeaveCheckBySqlWhere(sqlWhere);
        	String schshyj = schch.size()>0?schch.get(0).getExplanation():"";
        	String schoolname = frmCodeService.selectFrmCodeByDmz("1676", stuentity.getGraduateschool());
        	String zhuanye = frmCodeService.selectFrmCodeByDmz("0136", stuentity.getProfessional());
        	entity.setPicpatho(getPropertiesValue("imgAccessPath")+entity.getPicpatho());
        	view.addObject("entity", entity);
        	view.addObject("time", gxsj);
        	view.addObject("sptype", sptype);
        	view.addObject("openId", openId);
        	view.addObject("sc", sc);
        	view.addObject("ksshyj", ksshyj);
        	view.addObject("kjkshyj", kjkshyj);
        	view.addObject("schshyj", schshyj);
        	view.addObject("shjz", shjz);
        	view.addObject("stuentity", stuentity);
        	view.addObject("schoolname", schoolname);
        	view.addObject("zhuanye", zhuanye);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    
    
    /**
     * ��ת���ҵ������Ϣҳ��(ywq)
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toMineLeavePageorLlk(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String xh = request.getParameter("xh");
    		String sptype = request.getParameter("sptype");
    		String openId = request.getParameter("openId");
        	String gxsj = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        	JxStudentsLeaveEntity entity = jxStudentsLeaveService.selectJxStudentsLeaveByPrimaryKey(xh);
        	JxCourseArrangeEntity arrange = jxCourseArrangeService.selectJxCourseArrangeByPrimaryKey(entity.getArrangexh());
        	String stuid = entity.getStuid();
        	JxStudentsEntity stuentity = jxStudentsService.selectJxStudentsByPrimaryKey(stuid);
        	if(entity.getState().equals("2-1")||entity.getState().equals("2-2")){
        		sptype = "3";
        	}
        	view = new ModelAndView("llcourse/course_leave_xx");
        	JxStudentsLeaveCheckSqlWhere sqlWhere = new JxStudentsLeaveCheckSqlWhere();
        	sqlWhere.setStulevid(xh);
        	List<JxStudentsLeaveCheckEntity> ksch = jxStudentsLeaveCheckService.selectListJxStudentsLeaveCheckBySqlWhere(sqlWhere);
        	String shyj = ksch.size()>0?ksch.get(0).getExplanation():"";
        	String schoolname = frmCodeService.selectFrmCodeByDmz("1676", stuentity.getGraduateschool());
        	String zhuanye = frmCodeService.selectFrmCodeByDmz("0136", stuentity.getProfessional());
        	entity.setPicpatho(getPropertiesValue("imgAccessPath")+entity.getPicpatho());
        	view.addObject("arrange", arrange);
        	view.addObject("entity", entity);
        	view.addObject("time", gxsj);
        	view.addObject("sptype", sptype);
        	view.addObject("openId", openId);
        	view.addObject("shyj", shyj);
        	view.addObject("stuentity", stuentity);
        	view.addObject("schoolname", schoolname);
        	view.addObject("zhuanye", zhuanye);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    
  //��ȡ���������ļ��е�ֵ
    public String getPropertiesValue(String key) {
    	Properties prop = new Properties();
        try {
            String value = "";
            InputStream path =Thread.currentThread().getContextClassLoader().getResourceAsStream("imagePath.properties");
            prop.clear();
            prop.load(path);
            value = prop.getProperty(key).toString();
            return value;
        } catch (Exception e) {
            return "";
        }
    } 
    /**
     * ��ת���ҵ�������Ϣҳ��(ywq)
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toLeavespInfoPage(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	String teachtype = bindinfo.getLanguage();
        	if(teachtype.indexOf("21")!=-1){
        		view = new ModelAndView("teaching/mine_leavesp_zs");
        	}else{
        		view=new ModelAndView("teaching/common_notcanpage");
        	}
        	view.addObject("clientsxh", clientsxh);
        	view.addObject("openid", openid);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    
    public long getMillils(String time){
    	long millils = 0;
    	try {
             Calendar c = Calendar.getInstance();
             c.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(time));
             millils = c.getTimeInMillis();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return millils;
    }
    
    public static String formatDuring(long mss) {  
	    long days = mss / (1000 * 60 * 60 * 24);  
	    long hours = (mss % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);  
	    long minutes = (mss % (1000 * 60 * 60)) / (1000 * 60);  
	    //long seconds = (mss % (1000 * 60)) / 1000;  
	    String s = "";
	    if(days==0){
	    	s = hours + "Сʱ" + minutes + "����";
	    }else{
	    	s = days + "��" + hours + "Сʱ" + minutes + "����" ;
	    }
	    return s ;
	}

    /**
     * ��ת���ҵ������Ϣ�б�ҳ��
     * @param request
     * @param response
     * @return
     */
    public ModelAndView MineLeaveInfoPage(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	JxStudentsLeaveSqlWhere sqlWhere = new JxStudentsLeaveSqlWhere();
        	sqlWhere.setStuid(bindinfo.getYitongCard());
        	List<JxStudentsLeaveEntity> list = jxStudentsLeaveService.selectListJxStudentsLeaveBySqlWhere(sqlWhere);
        	view = new ModelAndView("teaching/mine_leave_zs");
        	view.addObject("list", list);
        	view.addObject("size", list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    /**
    *����ע����Ϣ
    *JX_STUDENTS_LEAVE,ѧ����ٱ�,������Ϣ
      */
    public void insertJxStudentsLeave(HttpServletRequest request, HttpServletResponse response, JxStudentsLeaveEntity entity) {
    	response.setContentType("text/html;charset=UTF-8");
    	PrintWriter out = null;
    	ExcuteResult result;
    	Map<String,Object> resultMap = new HashMap();
        try {
            out = response.getWriter();
            FrmSysparaTypeKey tkey = new FrmSysparaTypeKey();
    		tkey.setXtlb("00");
    		tkey.setGjz("qjsqmid");
    		FrmSysparaTypeEntity tentity = frmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(tkey);
    		String template_id = tentity.getMrz();
            String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            String teacherid = request.getParameter("teacherid");
            String taskinfo = request.getParameter("taskinfo");
            taskinfo = URLDecoder.decode(taskinfo, "utf-8"); 
        	entity = JsonUtil.json2Object(taskinfo, JxStudentsLeaveEntity.class);
        	entity.setState("0");
        	tkey.setGjz("deptleaveid");
    		FrmSysparaTypeEntity tentityt = frmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(tkey);
    		String dltype = tentityt.getMrz();
    		String openId = "";
    		String usernumber = "";
    		if(dltype.equals("0")){
    			openId = tentityt.getCsmc();
    			usernumber = tentityt.getCssm();
    		}else{
    			WechatBindSqlWhere wbsql = new WechatBindSqlWhere();
    			wbsql.setYitongCard(teacherid);
    			List<WechatBindEntity> wblist = wechatBindService.selectListWechatBindBySqlWhere(wbsql);
    			String opid = "";
    			if(wblist.size()>0){
    				opid = wblist.get(0).getOpenId();
    			}
            	openId = opid;
            	usernumber = teacherid;
    		}
    		if(openId==""||openId==null){
    			resultMap.put("errorMsg", "openidept");
    		}else{
    			entity.setRemark1("1");
    			WechatSysparamKey key = new WechatSysparamKey();
    			key.setGjz("RES_PATH");
    			key.setClientsxh(clientsxh);
    			WechatSysparamEntity sys = wechatSysparamService.selectWechatSysparamByPrimaryKey(key);
    			String url = sys.getDmz()+"/jxstuleave.do?method=toMineLeavePage&xh="+entity.getXh()+"&sptype=1&openId="+openId;
    			result = jxStudentsLeaveService.insertJxStudentsLeave(entity);
    			if(result.getReturnCode().equals("1")){
    				resultMap.put("errorMsg", "success");
    				JxCommonAction.WechatTemplateSend("1",openId,url,entity.getStuname(),time,entity.getCause(),template_id);
    			}else{
    				resultMap.put("errorMsg", "failed");
    			}
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
     *����ע����Ϣ
     *JX_STUDENTS_LEAVE,ѧ����ٱ�,������Ϣ
       */
     public void insertJxStudentsLeaveorLLk(HttpServletRequest request, HttpServletResponse response, JxStudentsLeaveEntity entity) {
     	response.setContentType("text/html;charset=UTF-8");
     	PrintWriter out = null;
     	ExcuteResult result;
     	Map<String,Object> resultMap = new HashMap();
         try {
             out = response.getWriter();
             FrmSysparaTypeKey tkey = new FrmSysparaTypeKey();
     		 tkey.setXtlb("00");
     		 tkey.setGjz("qjsqmid");
     		 FrmSysparaTypeEntity tentity = frmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(tkey);
     		 String template_id = tentity.getMrz();
     		 tkey.setGjz("leaveyxsj");
    		 FrmSysparaTypeEntity lentity = frmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(tkey);
    		 String leaveyxsj = lentity.getMrz();
    		 long lxsj = Long.valueOf(leaveyxsj)*60*1000;
             String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
             String arrangexh = request.getParameter("arrangexh");
             JxCourseArrangeEntity arrange = jxCourseArrangeService.selectJxCourseArrangeByPrimaryKey(arrangexh);
             String uptime = arrange.getSkdate().substring(0,10)+" "+arrange.getShtime().split("~")[0];
             long dqtime = System.currentTimeMillis();
             long upts = getMillils(uptime);
             long sjc = upts - dqtime ;
             String taskinfo = request.getParameter("taskinfo");
             taskinfo = URLDecoder.decode(taskinfo, "utf-8"); 
         	 entity = JsonUtil.json2Object(taskinfo, JxStudentsLeaveEntity.class);
         	 entity.setState("0");
         	 entity.setLeavedatestart(arrange.getSkdate().substring(0,19));
         	 entity.setTeacherid(arrange.getRkjshid());
         	 entity.setTeachername(arrange.getRkjshname());
         	 tkey.setGjz("coursetxrid");
     		 FrmSysparaTypeEntity tentityt = frmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(tkey);
     		 String openId = tentityt.getMrz();
     		 entity.setRemark1("2");
     		 WechatSysparamKey key = new WechatSysparamKey();
     		 key.setGjz("RES_PATH");
     		 key.setClientsxh(clientsxh);
     		 WechatSysparamEntity sys = wechatSysparamService.selectWechatSysparamByPrimaryKey(key);
     		 String url = sys.getDmz()+"/jxstuleave.do?method=toMineLeavePageorLlk&xh="+entity.getXh()+"&sptype=2&openId="+openId;
     		 result = jxStudentsLeaveService.insertJxStudentsLeave(entity);
     		 if(result.getReturnCode().equals("1")){
     			 resultMap.put("errorMsg", "success");
     			 String remark = "��ٿγ̣�"+arrange.getZxtimename()+"��"+arrange.getCoursename()+"�������ԭ��"+entity.getCause();
     			 JxCommonAction.WechatTemplateSend("1",openId,url,entity.getStuname(),time,remark,template_id);
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
     * ����ѧ����ID�ҵ���ǰ
     * @param stuId
     * @return
     */
    public WechatBindEntity getClassTeacherId (String stuId){
    	String openId = "";
    	WechatBindEntity entity = new WechatBindEntity();
    	try {
    		JxClassStudentsSqlWhere cssqlWhere = new JxClassStudentsSqlWhere();
    		cssqlWhere.setRemark2(stuId);
			List<JxClassStudentsEntity> cslist = jxClassStudentsService.selectListJxClassStudentsBySqlWhere(cssqlWhere);
			String zuid = "";
			if(cslist.size()>0){
				zuid = cslist.get(0).getZuid();
			}
			JxLunxunSqlWhere lxsqlWhere = new JxLunxunSqlWhere();
			lxsqlWhere.setZuid(zuid);
			List<JxLunxunEntity> lxlist = jxLunxunService.selectListJxLunxunBySqlWhereandDate(lxsqlWhere);
			String deptid =  lxlist.size()>0?lxlist.get(0).getDeptid():"";
			String deptname =  lxlist.size()>0?lxlist.get(0).getRemark1():"";
			JxStudentsInternshipProveKey intkey = new JxStudentsInternshipProveKey();
			intkey.setStudentsid(stuId);
			intkey.setDepid(deptid);
			JxStudentsInternshipProveEntity intentity = jxStudentsInternshipProveService.selectJxStudentsInternshipProveByPrimaryKey(intkey);
			String userid = intentity.getZmrid();
			String username = intentity.getZmr();
			WechatBindSqlWhere sqlWhere = new WechatBindSqlWhere();
			sqlWhere.setYitongCard(userid);
			sqlWhere.setClientsxh(clientsxh);
			List<WechatBindEntity> list = wechatBindService.selectListWechatBindBySqlWhere(sqlWhere);
			if(list.size()>0){
				openId = list.get(0).getOpenId();
			}
			entity.setOpenId(openId);
			entity.setYitongCard(userid);
			entity.setXm(username);
			entity.setDeptId(deptid);
			entity.setRemark1(deptname);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return entity;
    }
    /**
    *����ע����Ϣ
    *JX_STUDENTS_LEAVE,ѧ����ٱ�,�޸�
      */
    public void updateJxStudentsLeave(HttpServletRequest request, HttpServletResponse response, JxStudentsLeaveEntity entity) {
    	response.setContentType("text/html;charset=UTF-8");
    	PrintWriter out = null;
    	ExcuteResult result;
    	Map<String,Object> resultMap = new HashMap();
        try {
            out = response.getWriter();
            String xh = request.getParameter("xh");
            String state = request.getParameter("state");
            entity.setState(state);
            entity.setXh(xh);
        	result = jxStudentsLeaveService.updateJxStudentsLeaveByPrimaryKeySelective(entity);
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
    *����ע����Ϣ
    *JX_STUDENTS_LEAVE,ѧ����ٱ�,ɾ��
      */
    public void deleteJxStudentsLeave(HttpServletRequest request, HttpServletResponse response, JxStudentsLeaveEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String xh=entity.getXh();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxStudentsLeaveService.deleteJxStudentsLeaveByPrimaryKey(xh);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteJxStudentsLeave, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteJxStudentsLeave.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_STUDENTS_LEAVE,ѧ����ٱ�
    *��ת������ҳ��
      */
    public ModelAndView openAgreement(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //����ҳ��
        ModelAndView view=new ModelAndView("teaching/students_leavexy");
        return view;
    }

    /**
    *����ע����Ϣ
    *JX_STUDENTS_LEAVE,ѧ����ٱ�
    *��ת���޸�ҳ��
      */
    public ModelAndView toCreateUpdatePageJxStudentsLeave(HttpServletRequest request, HttpServletResponse response, JxStudentsLeaveEntity entity) {
        String xh=entity.getXh();
        //�޸�ҳ��
        JxStudentsLeaveEntity entityJxStudentsLeaveEntity=jxStudentsLeaveService.selectJxStudentsLeaveByPrimaryKey(xh);
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxStudentsLeaveEntity);
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

    

	public IJxStudentsLeaveService getJxStudentsLeaveService() {
		return jxStudentsLeaveService;
	}
	public void setJxStudentsLeaveService(
			IJxStudentsLeaveService jxStudentsLeaveService) {
		this.jxStudentsLeaveService = jxStudentsLeaveService;
	}
	public IJxStudentsLeaveCheckService getJxStudentsLeaveCheckService() {
		return jxStudentsLeaveCheckService;
	}
	public void setJxStudentsLeaveCheckService(
			IJxStudentsLeaveCheckService jxStudentsLeaveCheckService) {
		this.jxStudentsLeaveCheckService = jxStudentsLeaveCheckService;
	}
	public IWechatBindService getWechatBindService() {
		return wechatBindService;
	}

	public void setWechatBindService(IWechatBindService wechatBindService) {
		this.wechatBindService = wechatBindService;
	}

	public IJxStudentsService getJxStudentsService() {
		return jxStudentsService;
	}

	public void setJxStudentsService(IJxStudentsService jxStudentsService) {
		this.jxStudentsService = jxStudentsService;
	}

	public IJxLunxunService getJxLunxunService() {
		return jxLunxunService;
	}

	public void setJxLunxunService(IJxLunxunService jxLunxunService) {
		this.jxLunxunService = jxLunxunService;
	}

	public IWechatSysparamService getWechatSysparamService() {
		return wechatSysparamService;
	}

	public void setWechatSysparamService(
			IWechatSysparamService wechatSysparamService) {
		this.wechatSysparamService = wechatSysparamService;
	}
	public IJxClassStudentsService getJxClassStudentsService() {
		return jxClassStudentsService;
	}
	public void setJxClassStudentsService(
			IJxClassStudentsService jxClassStudentsService) {
		this.jxClassStudentsService = jxClassStudentsService;
	}
	public IFrmSysparaTypeService getFrmSysparaTypeService() {
		return frmSysparaTypeService;
	}
	public void setFrmSysparaTypeService(
			IFrmSysparaTypeService frmSysparaTypeService) {
		this.frmSysparaTypeService = frmSysparaTypeService;
	}
	public IJxStudentsInternshipProveService getJxStudentsInternshipProveService() {
		return jxStudentsInternshipProveService;
	}
	public void setJxStudentsInternshipProveService(
			IJxStudentsInternshipProveService jxStudentsInternshipProveService) {
		this.jxStudentsInternshipProveService = jxStudentsInternshipProveService;
	}
	public IFrmCodeService getFrmCodeService() {
		return frmCodeService;
	}
	public void setFrmCodeService(IFrmCodeService frmCodeService) {
		this.frmCodeService = frmCodeService;
	}
	public IJxCourseArrangeService getJxCourseArrangeService() {
		return jxCourseArrangeService;
	}
	public void setJxCourseArrangeService(
			IJxCourseArrangeService jxCourseArrangeService) {
		this.jxCourseArrangeService = jxCourseArrangeService;
	}
    
    
}