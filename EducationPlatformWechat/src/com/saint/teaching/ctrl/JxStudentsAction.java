package com.saint.teaching.ctrl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
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
import com.saint.systemManager.bean.FrmCodeEntity;
import com.saint.systemManager.bean.FrmCodeKey;
import com.saint.systemManager.bean.FrmDepartmentEntity;
import com.saint.systemManager.bean.FrmSysparaTypeEntity;
import com.saint.systemManager.bean.FrmSysparaTypeKey;
import com.saint.systemManager.services.IFrmCodeService;
import com.saint.systemManager.services.IFrmDepartmentService;
import com.saint.systemManager.services.IFrmSysparaTypeService;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.systemManager.sqlWhere.FrmCodeSqlWhere;
import com.saint.systemManager.sqlWhere.FrmDepartmentSqlWhere;
import com.saint.teaching.bean.JxClassEntity;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.services.IJxClassService;
import com.saint.teaching.services.IJxStudentsService;
import com.saint.teaching.sqlWhere.JxClassSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentsSqlWhere;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatBindKey;
import com.saint.wechat.manager.bean.WechatSysparamEntity;
import com.saint.wechat.manager.bean.WechatSysparamKey;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.services.IWechatSysparamService;
import com.saint.wechat.manager.services.IXfEmployeeService;
import com.saint.wechat.manager.sqlWhere.WechatBindSqlWhere;
import com.saint.wechat.manager.sqlWhere.XfEmployeeSqlWhere;
import com.saint.wechat.utils.IDCardUtil;

/**
*类注释信息
*表名JX_STUDENTS
*表说明学员信息
  */
public class JxStudentsAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxStudentsService jxStudentsService;
    
    private IJxClassService jxClassService;
    
    private IFrmCodeService frmCodeService;
    
    private IWechatBindService wechatBindService;
    
    private IXfEmployeeService xfEmployeeService;
    
    private IFrmDepartmentService frmDepartmentService;
    
    private IFrmSysparaTypeService frmSysparaTypeService;
    
    private IWechatSysparamService wechatSysparamService;

    /**
    *方法注释信息
    *分页查询表JX_STUDENTS
    *表说明学员信息
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public void getListPageJxStudents(HttpServletRequest request, HttpServletResponse response, JxStudentsSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
        	int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("limit"));//接受参数page和rows
            String Name = request.getParameter("name");
            String sex = request.getParameter("sex");
            String classid = request.getParameter("classid");
            Page listPage=new Page(rows,page);
            sqlWhere.setName(Name);
            sqlWhere.setSex(sex);
            sqlWhere.setClassid(classid);
            sqlWhere.setListPage(listPage); 
            List<JxStudentsEntity> entitylist=jxStudentsService.selectListPageJxStudentsBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("code", 0);//rows键 存放每页记录 list
            jsonMap.put("msg", "");//rows键 存放每页记录 list
            jsonMap.put("count", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("data", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            //frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxStudents.toString(),Tools.getException(e));
        }
    }
    
    //绑定学生信息
    public void bindStudent(HttpServletRequest request, HttpServletResponse response){
    	response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        Map<String,Object> resultMap = new HashMap();
        JxStudentsSqlWhere sqlWhere = new JxStudentsSqlWhere();
        String openid = "";
        String clientsxh = "";
        try {
        	out = response.getWriter();
            String taskinfo = request.getParameter("taskinfo");
            openid = request.getParameter("openid");
            clientsxh = request.getParameter("clientsxh");
            taskinfo = URLDecoder.decode(taskinfo, "utf-8"); 
            JxStudentsEntity entity = JsonUtil.json2Object(taskinfo, JxStudentsEntity.class);
            sqlWhere.setName(entity.getName());
			sqlWhere.setIdcard(entity.getIdcard());
			List<JxStudentsEntity> list = jxStudentsService.selectListJxStudentsBySqlWhere(sqlWhere);
			if(list.size()>0){
				JxStudentsSqlWhere sqlWhere2 = new JxStudentsSqlWhere();
				sqlWhere2.setOpenid(openid);
				sqlWhere2.setIdcard(entity.getIdcard());
				List<JxStudentsEntity> list2 = jxStudentsService.selectListJxStudentsBySqlWhere(sqlWhere2);
				if(list2.size()>0){
					WechatBindEntity bindEntity = new WechatBindEntity();
					bindEntity.setOpenId(openid);
					bindEntity.setClientsxh(clientsxh);
					bindEntity.setYhlb("1");  //用户类别1学员 2医务人员
					bindEntity.setXm(entity.getName());
					bindEntity.setYitongCard(list.get(0).getXh());
					bindEntity.setDeptId(list.get(0).getGraduateschool());
					bindEntity.setIsAdmin("0");
					bindEntity.setIslqxx("1");
					bindEntity.setSfzmhm(list.get(0).getIdcard());
					bindEntity.setState("2");
					wechatBindService.updateWechatBindByPrimaryKeySelective(bindEntity);
					resultMap.put("errorMsg", "success");
				}else{
					resultMap.put("errorMsg", "chunfubind");
				}
			}else{
				resultMap.put("errorMsg", "none");
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
    *方法注释信息
    *JX_STUDENTS,学员信息表,插入信息
      */
    public void insertJxStudents(HttpServletRequest request, HttpServletResponse response, JxStudentsEntity entity) {
    	response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        Map<String,Object> resultMap = new HashMap();
        JxStudentsSqlWhere sqlWhere = new JxStudentsSqlWhere();
        String openid = "";
        String clientsxh = "";
        try {
        	out = response.getWriter();
        	FrmSysparaTypeKey typekey = new FrmSysparaTypeKey();
        	typekey.setXtlb("00");
        	typekey.setGjz("presentdept");
        	FrmSysparaTypeEntity systype = frmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(typekey);
        	String glbm = systype.getMrz();
            String taskinfo = request.getParameter("taskinfo");
            String professionalname = request.getParameter("professionalname");
            String graduateschoolname = request.getParameter("graduateschoolname");
            String sdschoolname = request.getParameter("sdschoolname");
            openid = request.getParameter("openid");
            clientsxh = request.getParameter("clientsxh");
            String type = request.getParameter("type");
            taskinfo = URLDecoder.decode(taskinfo, "utf-8"); 
        	entity = JsonUtil.json2Object(taskinfo, JxStudentsEntity.class);
			String gxsj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
			entity.setCreatetime(gxsj);
			entity.setUpdatetime(gxsj);
			entity.setOpenid(openid);
			entity.setGlbm(glbm);
			String schoolname = "";
			if(entity.getGraduateschool().equals("01000010")){
				schoolname = sdschoolname;
			}else{
				schoolname = graduateschoolname;
			}
			entity.setRemark5(schoolname);
			String comtype = entity.getComtype();
			graduateschoolname = comtype.equals("1")?graduateschoolname:"自联";
			String classname = "";
			String classid = "";
			JxClassSqlWhere classsql = new JxClassSqlWhere();
			String openId = "";
			String frist = "";
			String shlx = "";
			String shlb = "学生注册审核";
			String remark = "【点击查看并审核】您也可以在电脑端登录jxpt-soft.cn:8088/jx  用户名：sy加工号；初始密码：111111；进行审核。";
			WechatSysparamKey key = new WechatSysparamKey();
        	key.setGjz("RES_PATH");
        	key.setClientsxh(clientsxh);
        	WechatSysparamEntity sys = wechatSysparamService.selectWechatSysparamByPrimaryKey(key);
			if(comtype.equals("1")){
				classsql.setDeptid(entity.getGraduateschool());
				String sysopenid = frmSysparaTypeService.selectFrmSysparaTypeBygjz("schoolfzropid");
				openId = sysopenid;
				shlx = "学校统一申报学生审核";
			}else{
				classsql.setDeptid("01000010");
				WechatBindSqlWhere bindsql = new WechatBindSqlWhere();
				bindsql.setYitongCard(entity.getAssureemp());
				List<WechatBindEntity> bind = wechatBindService.selectListWechatBindBySqlWhere(bindsql);
				if(bind.size()>0){
					//openId = bind.get(0).getOpenId();
					openId = "oyguEwEyUUz-A4OlvyaGDfgCCTC4";
				}
				shlx = "自联学生担保人审核";
			}
			String url = sys.getDmz()+"/jxStudents.do?method=toStudnetsInfoPage&xh="+entity.getXh()+"&shstate=1&openId="+openId+"&clientsxh="+clientsxh;
			classsql.setGrade(entity.getGrade());
			classsql.setProfesstypeid(entity.getProfessional());
			classsql.setType("1");
			classsql.setBanji(entity.getPertype());
			List<JxClassEntity> classlist = jxClassService.selectListJxClassBySqlWhere(classsql);
			if(classlist.size()>0){
				classname = classlist.get(0).getName();
				classid = classlist.get(0).getXh();
			}else{
				JxClassEntity classentity = new JxClassEntity();
				String banjixx = entity.getPertype().equals("2")?"实习生":"见习生";
				classname = graduateschoolname+entity.getGrade()+"级【"+banjixx+"】"+professionalname+"班";
				int xh = jxClassService.selectJxClassSequence();
				classid = String.valueOf(xh);
				String graduateschool = "";
				graduateschool = comtype.equals("1")?entity.getGraduateschool():"01000010";
				classentity.setDeptid(graduateschool);
				classentity.setDeptname(graduateschoolname);
				classentity.setEmpnumber("0");
				classentity.setGrade(entity.getGrade());
				classentity.setStarttime(entity.getStudystarttime());
				classentity.setEndtime(entity.getStudyendtime());
				classentity.setName(classname);
				classentity.setProfesstypeid(entity.getProfessional());
				classentity.setProfesstypename(professionalname);
				classentity.setRemark1(entity.getSchoolteachertel());
				classentity.setRemark3("0");
				classentity.setTeachername(entity.getSchoolteachername());
				classentity.setUpdatetime(gxsj);
				classentity.setXh(classid);
				classentity.setType("1");
				classentity.setBanji(entity.getPertype());
				jxClassService.insertJxClass(classentity);
			}
			entity.setClassid(classid);
			entity.setProfessionalclass(classname);
			WechatBindEntity bindEntity = new WechatBindEntity();
			bindEntity.setOpenId(openid);
			bindEntity.setClientsxh(clientsxh);
			bindEntity.setYhlb("1");  //用户类别1学员 2医务人员
			bindEntity.setXm(entity.getName());
			bindEntity.setDeptId(entity.getGraduateschool());
			bindEntity.setIsAdmin("0");
			bindEntity.setIslqxx("1");
			bindEntity.setSfzmhm(entity.getIdcard());
			bindEntity.setState("1");
			sqlWhere.setName(entity.getName());
			sqlWhere.setIdcard(entity.getIdcard());
			List<JxStudentsEntity> list = jxStudentsService.selectListJxStudentsBySqlWhere(sqlWhere);
			if(list.size()>0){
				resultMap.put("errorMsg", "chunfu");
			}
			else if(!IDCardUtil.IDCardValidate(entity.getIdcard().trim())){
				resultMap.put("errorMsg", "idcarderror");
			}
			else{
				JxStudentsSqlWhere sqlWhere2 = new JxStudentsSqlWhere();
				if(type.equals("s")){
					sqlWhere2.setRemark2(openid);
				}else{
					sqlWhere2.setTelnumber(entity.getTelnumber());
				}
				List<JxStudentsEntity> list2 = jxStudentsService.selectListJxStudentsBySqlWhere(sqlWhere2);
				if(list2.size()>0){
					resultMap.put("errorMsg", "openidchunfu");
				}else{
					bindEntity.setYitongCard(entity.getXh());
					result = jxStudentsService.insertJxStudents(entity);
					if(result.getReturnCode().equals("1")){
						resultMap.put("errorMsg", "success");
						wechatBindService.updateWechatBindByPrimaryKeySelective(bindEntity);
						String template_id = frmSysparaTypeService.selectFrmSysparaTypeBygjz("applyrecord");
						frist = "您有学生信息审核通知";
						JxCommonAction.WechatWorkApply(url,openId, template_id, frist, shlx, shlb, "", gxsj, entity.getName(), remark);
					}else{
						resultMap.put("errorMsg", "failed");
					}
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
     * 添加本科生信息
     * @param request
     * @param response
     * @param entity
     */
    public void saveUnderGraduate(HttpServletRequest request, HttpServletResponse response, JxStudentsEntity entity) {
    	response.setContentType("text/html; charset=GBK");
        PrintWriter out = null;
        ExcuteResult result;
        Map<String,Object> resultMap = new HashMap();
        JxStudentsSqlWhere sqlWhere = new JxStudentsSqlWhere();
        WechatBindEntity bind = new WechatBindEntity();
        String openid = "";
        try {
        	out = response.getWriter();
        	String glbm = frmSysparaTypeService.selectFrmSysparaTypeBygjz("presentdept");
            String taskinfo = request.getParameter("taskinfo");
            taskinfo = URLDecoder.decode(taskinfo, "utf-8"); 
            entity = JsonUtil.json2Object(taskinfo, JxStudentsEntity.class);
            String graduateschoolname = entity.getRemark1();
        	String professionalname = entity.getRemark2();
            String banji = "";
            if(entity.getBanji()!=null&&!entity.getBanji().equals("")){
            	banji = entity.getBanji();
            }else{
            	banji = "1";
            }
            String gxsj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            String nowyear = new SimpleDateFormat("yyyy").format(new Date());
			String classname = "";
			String classid = "";
			JxClassSqlWhere classsql = new JxClassSqlWhere();
			classsql.setDeptid(entity.getGraduateschool());
			classsql.setGrade(entity.getGrade());
			classsql.setProfesstypeid(entity.getProfessional());
			classsql.setType("2");
			classsql.setBanji(banji);
			List<JxClassEntity> classlist = jxClassService.selectListJxClassBySqlWhere(classsql);
			if(classlist.size()>0){
				classname = classlist.get(0).getName();
				classid = classlist.get(0).getXh();
			}else{
				JxClassEntity classentity = new JxClassEntity();
				String banjiname = banji.equals("0")?"":banji;
				classname = graduateschoolname+entity.getGrade()+"级"+professionalname+banjiname+"班";
				int xh = jxClassService.selectJxClassSequence();
				classid = String.valueOf(xh);
				String graduateschool = entity.getGraduateschool();
				classentity.setDeptid(graduateschool);
				classentity.setDeptname(graduateschoolname);
				classentity.setEmpnumber("0");
				classentity.setGrade(entity.getGrade());
				classentity.setStarttime(entity.getStudystarttime());
				classentity.setEndtime(entity.getStudyendtime());
				classentity.setName(classname);
				classentity.setProfesstypeid(entity.getProfessional());
				classentity.setProfesstypename(professionalname);
				classentity.setRemark1(entity.getSchoolteachertel());
				classentity.setRemark3("0");
				classentity.setTeachername(entity.getSchoolteachername());
				classentity.setUpdatetime(gxsj);
				classentity.setXh(classid);
				classentity.setType("2");
				classentity.setBanji(banji);
				jxClassService.insertJxClass(classentity);
			}
            String userInfo = request.getParameter("userInfo");
            userInfo = URLDecoder.decode(userInfo, "utf-8"); 
            bind = JsonUtil.json2Object(userInfo, WechatBindEntity.class);
            openid = bind.getOpenId();
			entity.setCreatetime(gxsj);
			entity.setUpdatetime(gxsj);
			entity.setOpenid(openid);
			entity.setGlbm(glbm);
			entity.setClassid(classid);
			entity.setClassid(classname);
			entity.setStuyear(nowyear);
			bind.setCreateTime(gxsj);
			bind.setGxsj(gxsj);
			sqlWhere.setPertype(entity.getPertype());
			sqlWhere.setIdcard(entity.getIdcard());
			List<JxStudentsEntity> list = jxStudentsService.selectListJxStudentsBySqlWhere(sqlWhere);
			if(list.size()>0){
				resultMap.put("errorMsg", "chongfu");
				return;
			}if(!IDCardUtil.IDCardValidate(entity.getIdcard().trim())){
				resultMap.put("errorMsg", "idcarderror");
			}else{
				result = jxStudentsService.insertJxStudents(entity);
				if(result.getReturnCode().equals("1")){
					resultMap.put("errorMsg", "success");
					wechatBindService.updateWechatBindByPrimaryKeySelective(bind);
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
     * 保存新增人员信息(ywq)
     * @param request
     * @param response
     * @param entity
     */
    public void saveGraduateInfo(HttpServletRequest request,HttpServletResponse response,JxStudentsEntity entity){
    	response.setContentType("text/html;charset=UTF-8");
    	PrintWriter out = null;
    	ExcuteResult result;
    	Map<String,Object> resultMap = new HashMap();
    	try {
    		out = response.getWriter();
    		String id = getNewId();
    		String year = new SimpleDateFormat("yyyy").format(new Date());
    		
    		//---------------------------此处ID与表XF_DEPT不对应-------------------------------------------
			String userNumber = year + id;
	    	String taskinfo = request.getParameter("taskinfo");
	    	String openid = request.getParameter("openid");
	    	String clientsxh = request.getParameter("clientsxh");
            taskinfo = URLDecoder.decode(taskinfo, "utf-8"); 
        	entity = JsonUtil.json2Object(taskinfo, JxStudentsEntity.class);
			String gxsj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
			entity.setCreatetime(gxsj);
        	String glbm = frmSysparaTypeService.selectFrmSysparaTypeBygjz("presentdept");
			entity.setGlbm(glbm);
			entity.setXh(entity.getTelnumber());
			entity.setStuyear(year);
			JxStudentsEntity stus = jxStudentsService.selectJxStudentsByPrimaryKey(entity.getTelnumber());
			String idcard = entity.getIdcard();
			if(!IDCardUtil.IDCardValidate(idcard.trim())){
				resultMap.put("errorMsg", "idcarderror");
			}else if(stus!=null){
				resultMap.put("errorMsg", "chongfu");
			}else{
				WechatBindEntity bindEntity = new WechatBindEntity();
				bindEntity.setOpenId(openid);
				bindEntity.setClientsxh(clientsxh);
				bindEntity.setYitongCard(entity.getXh());
				bindEntity.setDeptId(entity.getClassid());
				bindEntity.setIslqxx("1");
				bindEntity.setIsAdmin("0");
				bindEntity.setSfzmhm(idcard);
				bindEntity.setXm(entity.getName());
				bindEntity.setState("2");
				bindEntity.setYhlb("1");  //用户类别1学员 2医务人员
				bindEntity.setRemark1(glbm);
				result = jxStudentsService.insertJxStudents(entity);
				if(result.getReturnCode().equals("1")){
					resultMap.put("errorMsg", "success");
					wechatBindService.updateWechatBindByPrimaryKeySelective(bindEntity);
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
    
    public String getNextyear(int value){
    	String nextyear = "";
    	try {
    		String year = new SimpleDateFormat("yyyy").format(new Date());
    		String mother = new SimpleDateFormat("MM").format(new Date());
    		String day = new SimpleDateFormat("dd").format(new Date());
    		int next = Integer.valueOf(year)+value;
    		nextyear = String.valueOf(next)+"-"+mother+"-"+day; 
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return nextyear;
    }
    
    public String getNumber(){
    	String temp="";
		Random random = new Random();
		int k=random.nextInt(9999);
		if(k<10){
			temp="000"+k;
		}else if(k<100){
			temp="00"+k;
		}else if(k<1000){
			temp="0"+k;
		}else{
			temp=""+k;
		}
		return temp;
    }
    /**
    *方法注释信息
    *JX_STUDENTS,学员信息表,修改
      */
    public void updateJxStudents(HttpServletRequest request, HttpServletResponse response, JxStudentsEntity entity) {
    	response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        Map<String,Object> resultMap = new HashMap();
        String openid = "";
        String clientsxh = "";
        try {
            out = response.getWriter();
            String taskinfo = request.getParameter("taskinfo");
            String graduateschoolname = request.getParameter("graduateschoolname");
            String professionalname = request.getParameter("professionalname");
            String sdschoolname = request.getParameter("sdschoolname");
            openid = request.getParameter("openid");
            clientsxh = request.getParameter("clientsxh");
            taskinfo = URLDecoder.decode(taskinfo, "utf-8"); 
        	entity = JsonUtil.json2Object(taskinfo, JxStudentsEntity.class);
//			entity.setImagepath(entity.getImagepath().split("upload/")[1]);
        	String gxsj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
			entity.setUpdatetime(gxsj);
			String schoolname = "";
			if(entity.getGraduateschool().equals("01000010")){
				schoolname = sdschoolname;
			}else{
				schoolname = graduateschoolname;
			}
			entity.setRemark5(schoolname);
			String comtype = entity.getComtype();
			graduateschoolname = comtype.equals("1")?graduateschoolname:"自联";
			String classname = "";
			String classid = "";
			JxClassSqlWhere classsql = new JxClassSqlWhere();
			if(comtype.equals("1")){
				classsql.setDeptid(entity.getGraduateschool());
			}else{
				classsql.setDeptid("01000010");
			}
			classsql.setGrade(entity.getGrade());
			classsql.setProfesstypeid(entity.getProfessional());
			classsql.setType("1");
			classsql.setBanji(entity.getPertype());
			List<JxClassEntity> classlist = jxClassService.selectListJxClassBySqlWhere(classsql);
			if(classlist.size()>0){
				classname = classlist.get(0).getName();
				classid = classlist.get(0).getXh();
			}else{
				JxClassEntity classentity = new JxClassEntity();
				String banjixx = entity.getPertype().equals("2")?"实习生":"见习生";
				classname = graduateschoolname+entity.getGrade()+"级【"+banjixx+"】"+professionalname+"班";
				int xh = jxClassService.selectJxClassSequence();
				classid = String.valueOf(xh);
				String graduateschool = "";
				graduateschool = comtype.equals("1")?entity.getGraduateschool():"01000010";
				classentity.setDeptid(graduateschool);
				classentity.setDeptname(graduateschoolname);
				classentity.setEmpnumber("0");
				classentity.setGrade(entity.getGrade());
				classentity.setStarttime(entity.getStudystarttime());
				classentity.setEndtime(entity.getStudyendtime());
				classentity.setName(classname);
				classentity.setProfesstypeid(entity.getProfessional());
				classentity.setProfesstypename(professionalname);
				classentity.setRemark1(entity.getSchoolteachertel());
				classentity.setRemark3("0");
				classentity.setTeachername(entity.getSchoolteachername());
				classentity.setUpdatetime(gxsj);
				classentity.setXh(classid);
				classentity.setType("1");
				classentity.setBanji(entity.getPertype());
				jxClassService.insertJxClass(classentity);
			}
			entity.setClassid(classid);
			entity.setProfessionalclass(classname);
			entity.setRemark("0");
			entity.setState("4");
			result = jxStudentsService.updateJxStudentsByPrimaryKeySelective(entity);
			WechatBindEntity bindEntity = new WechatBindEntity();
			bindEntity.setOpenId(openid);
			bindEntity.setClientsxh(clientsxh);
			bindEntity.setXm(entity.getName());
			
            if(result.getReturnCode().equals("1")){
				resultMap.put("errorMsg", "updetesuccess");
				wechatBindService.updateWechatBindByPrimaryKeySelective(bindEntity);
			}else{
				resultMap.put("errorMsg", "updatefailed");
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
    *方法注释信息
    *JX_STUDENTS,学员信息表,删除
      */
    public void deleteJxStudents(HttpServletRequest request, HttpServletResponse response, JxStudentsEntity entity) {
    	response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        Map<String,Object> resultMap = new HashMap();
        try {
        	out = response.getWriter();
        	String xh = request.getParameter("xh");
            result = jxStudentsService.deleteJxStudentsByPrimaryKey(xh);
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
     * 跳转至班级新增页面(ywq)
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toCreateAddPageJxStudents(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        ModelAndView view= null;
        try {
        	String type = request.getParameter("type");
        	String id = "";
        	JxClassSqlWhere sqlWhere1 = new JxClassSqlWhere();
        	List<JxClassEntity> entitylist=jxClassService.selectListJxClassBySqlWhere(sqlWhere1);
        	String classNames="";
        	String classIds="";
        	 for(JxClassEntity entity:entitylist){
        		 classNames+=entity.getName()+",";
        		 classIds+=entity.getXh()+",";
        	 }
        	if(type.equals("0")){
        		id = jxStudentsService.selectListJxStudentsBySql("select JX_STUDENTS_SEQ.nextval from dual").get(0).get("NEXTVAL").toString();
        		int s = Integer.valueOf(id);
        		if(s<10){
        			id="0000"+s;
        		}else if(s<100){
        			id="000"+s;
        		}else if(s<1000){
        			id="00"+s;
        		}else if(s<10000){
        			id="0"+s;
        		}else{
        			id=""+s;
        		}
        	}
        	view=new ModelAndView("jx_personrecord/students_info_add");
        	if(type.equals("2")){
        		String xh = request.getParameter("xh");
        		JxStudentsEntity entity = jxStudentsService.selectJxStudentsByPrimaryKey(xh);
        		view.addObject("entity", entity);
        		view.addObject("xh", entity.getXh());
        	}else{
        		view.addObject("xh", id);
        	}
        	view.addObject("type", type);
        	view.addObject("classNames", classNames);
        	view.addObject("classIds", classIds);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }
    public ModelAndView toDetailPageJxStudents(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        ModelAndView view= null;
        try {
        	view=new ModelAndView("jx_personrecord/students_info_edit");
    		String xh = request.getParameter("xh");
    		JxStudentsEntity entity = jxStudentsService.selectJxStudentsByPrimaryKey(xh);
    		view.addObject("entity", entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }
    /**
    *方法注释信息
    *JX_STUDENTS,学员信息表
    *跳转到修改页面
      */
    public ModelAndView toQueryPerson(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=gbk");
        ModelAndView view=new ModelAndView("jx_personrecord/common_query_students");
        view.addObject("option", "add");
        return view;
    }
    /**
     * 微信推送人跳转至审批页面
     * @param request
     * @param response
     * @param entity
     * @return
     */
    public ModelAndView toStudnetsInfoPage(HttpServletRequest request, HttpServletResponse response, JxStudentsEntity entity) {
    	 ModelAndView view=null;
    	try {
    		String xh = request.getParameter("xh");
    		String clientsxh = request.getParameter("clientsxh"); 
    		String openId = request.getParameter("openId");
    		String shstate = request.getParameter("shstate");
            //修改页面
            JxStudentsEntity stuentity=jxStudentsService.selectJxStudentsByPrimaryKey(xh);
            view=new ModelAndView("teaching/stidnets_infosh");
            String xueli = frmCodeService.selectFrmCodeByDmz("0110", stuentity.getXueli());
            String familyreat = frmCodeService.selectFrmCodeByDmz("1673", stuentity.getFamilyreat());
            String graduateschool = frmCodeService.selectFrmCodeByDmz("1676", stuentity.getGraduateschool());
            String professional = frmCodeService.selectFrmCodeByDmz("0136", stuentity.getProfessional());
            stuentity.setXueli(xueli);
            stuentity.setFamilyreat(familyreat);
            stuentity.setGraduateschool(graduateschool);
            stuentity.setProfessional(professional);
            view.addObject("clientsxh", clientsxh);
            view.addObject("openId", openId);
            view.addObject("shstate", shstate);
            view.addObject("stuentity", stuentity);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }
    
    //跳转到人员类型选择界面
    public ModelAndView toTypeSelect(HttpServletRequest request, HttpServletResponse response) {
    	String openid = request.getParameter("openid");
    	String clientsxh = request.getParameter("clientsxh");
        ModelAndView view=new ModelAndView("teaching/typeSelect");
        WechatBindKey bindKey = new WechatBindKey();
		bindKey.setOpenId(openid);
		bindKey.setClientsxh(clientsxh);
		WechatBindEntity tempBind = wechatBindService.selectWechatBindByPrimaryKey(bindKey);
		if(tempBind!=null){
			if(tempBind.getYhlb()!=null&&!tempBind.getYhlb().equals("")){
				view.addObject("type", tempBind.getYhlb());
			}
		}
        view.addObject("openid", openid);
        view.addObject("clientsxh", clientsxh);
        return view;
    }
    
    /**
     * 操作文档页面
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toOperatorBooks(HttpServletRequest request, HttpServletResponse response){
    	response.setContentType("text/html; charset=utf-8");
    	String openid = request.getParameter("openid");
    	String clientsxh = request.getParameter("clientsxh");
    	ModelAndView view = null;
    	try {
    		String pertype = request.getParameter("pertype");
    		view=new ModelAndView("teaching/operator_wode");
    		view.addObject("pertype", pertype);
            view.addObject("openid", openid);
            view.addObject("clientsxh", clientsxh);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }
    //跳转到学员注册按钮
    public ModelAndView toStudentRegistPage(HttpServletRequest request, HttpServletResponse response){
    	response.setContentType("text/html; charset=utf-8");
    	String openid = request.getParameter("openid");
    	String clientsxh = request.getParameter("clientsxh");
    	ModelAndView view = null;
    	try {
    		String pertype = request.getParameter("pertype");
    		String xh = getNewId();
    		String qzh = new SimpleDateFormat("yyyy").format(new Date());
    		String stuid = qzh+"-"+xh;
    		view=new ModelAndView("teaching/student_regist");
    		String method = "0";  //0表示新增     1表示修改
        	view.addObject("type", method);
            view.addObject("openid", openid);
            view.addObject("clientsxh", clientsxh);
            view.addObject("stuid", stuid);
            view.addObject("pertype", pertype);
            view.addObject("nowyear", qzh);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }
    //跳转到学员注册按钮
    public ModelAndView toJxStudentRegistPage(HttpServletRequest request, HttpServletResponse response){
    	response.setContentType("text/html; charset=utf-8");
    	String openid = request.getParameter("openid");
    	String clientsxh = request.getParameter("clientsxh");
    	ModelAndView view = null;
    	try {
    		String pertype = request.getParameter("pertype");
    		String xh = getNewId(); 
    		String qzh = new SimpleDateFormat("yyyy").format(new Date());
    		String stuid = qzh+"-"+xh;
    		view=new ModelAndView("teaching/jxstudent_regist");
    		String method = "0";  //0表示新增     1表示修改
        	view.addObject("type", method);
            view.addObject("openid", openid);
            view.addObject("clientsxh", clientsxh);
            view.addObject("stuid", stuid);
            view.addObject("pertype", pertype);
            view.addObject("nowyear", qzh);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }
  //跳转到学员注册按钮
    public ModelAndView toundergraduatePage(HttpServletRequest request, HttpServletResponse response){
    	response.setContentType("text/html; charset=utf-8");
    	String openid = request.getParameter("openid");
    	String clientsxh = request.getParameter("clientsxh");
    	ModelAndView view = null;
    	try {
    		String id = jxStudentsService.selectListJxStudentsBySql("select JX_STUDENTS_SEQ.nextval from dual").get(0).get("NEXTVAL").toString();
    		view=new ModelAndView("teaching/undergraduate_regist");
    		String method = "0";  //0表示新增     1表示修改
    		view.addObject("id", id);
        	view.addObject("type", method);
            view.addObject("openid", openid);
            view.addObject("clientsxh", clientsxh);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }
    //跳转到学员注册按钮
    public ModelAndView toGraduateRegistPage(HttpServletRequest request, HttpServletResponse response){
    	response.setContentType("text/html; charset=utf-8");
    	String openid = request.getParameter("openid");
    	String clientsxh = request.getParameter("clientsxh");
    	ModelAndView view = null;
    	try {
    		FrmDepartmentSqlWhere sqlWhere = new FrmDepartmentSqlWhere();
    		sqlWhere.setSjbm("62000001");
    		List<FrmDepartmentEntity> deplist = frmDepartmentService.selectListFrmDepartmentBySqlWhere(sqlWhere);
    		view=new ModelAndView("teaching/graduate_regist");
    		String method = "0";  //0表示新增     1表示修改
        	view.addObject("type", method);
            view.addObject("openid", openid);
            view.addObject("clientsxh", clientsxh);
            view.addObject("deplist", deplist);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }
    
    //根据传入的参数跳转到
    public ModelAndView toSelfPage(HttpServletRequest request, HttpServletResponse response){
    	String openid = request.getParameter("openid");
    	String clientsxh = request.getParameter("clientsxh");
    	String type = request.getParameter("type");
    	ModelAndView view = null;
    	String method = "0";  //0表示新增     1表示修改
    	if(type==null){
    		view=new ModelAndView("teaching/typeSelect");
    	}
    	if(type.equals("1")){  //学员
    		WechatBindKey key = new WechatBindKey();
    		key.setClientsxh(clientsxh);
    		key.setOpenId(openid);
    		WechatBindEntity bindEntity = wechatBindService.selectWechatBindByPrimaryKey(key);
    		if(bindEntity!=null){
    			if(bindEntity.getYhlb()!=null&&bindEntity.getYhlb().equals("2")){
    				view=new ModelAndView("teaching/typeSelect");
    				method = "1";
    			}else if(bindEntity.getYitongCard()!=null&&!bindEntity.getYitongCard().equals("")){
    				JxStudentsEntity entity = jxStudentsService.selectJxStudentsByPrimaryKey(bindEntity.getYitongCard());
    				if(entity!=null){
    					if(entity.getPertype().equals("1")){
    						view=new ModelAndView("teaching/graduate_regist");
    						FrmDepartmentEntity dept = frmDepartmentService.selectFrmDepartmentByPrimaryKey(entity.getClassid());
    						view.addObject("deptname", dept!=null?dept.getBmmc():"");
    					}else if(entity.getPertype().equals("2")){
    						view=new ModelAndView("teaching/student_regist");
    					}else if(entity.getPertype().equals("4")){
    						view=new ModelAndView("teaching/undergraduate_regist");
    					}else if(entity.getPertype().equals("5")){
    						view=new ModelAndView("teaching/jxstudent_regist");
    					}
    					entity.setImagepath(getPropertiesValue("imgAccessPath")+entity.getImagepath());
    					view.addObject("entity", entity);
    					method = "1";
    				}
    			}else if(bindEntity.getYitongCard()==null||"".equals(bindEntity.getYitongCard())){
    				view=new ModelAndView("teaching/student_bind");
    			}
    		}
    	}
    	if(type.equals("2")){  //医务人员
    		view=new ModelAndView("teaching/doctor_bind");
    		WechatBindKey key = new WechatBindKey();
    		key.setClientsxh(clientsxh);
    		key.setOpenId(openid);
    		WechatBindEntity bindEntity = wechatBindService.selectWechatBindByPrimaryKey(key);
    		if(bindEntity!=null){
    			if(bindEntity.getYhlb()!=null&&bindEntity.getYhlb().equals("1")){
    				view=new ModelAndView("teaching/typeSelect");
    				method = "2";
				}else if(bindEntity.getYitongCard()!=null&&!bindEntity.getYitongCard().equals("")){
    				XfEmployeeEntity entity = xfEmployeeService.selectXfEmployeeByPrimaryKey(bindEntity.getYitongCard());
    				FrmDepartmentEntity dept = frmDepartmentService.selectFrmDepartmentByPrimaryKey(entity.getDepart());
    				if(entity!=null){
    					view=new ModelAndView("teaching/doctor_info");
    					view.addObject("entity", entity);
    					view.addObject("dept", dept.getBmmc());
    					view.addObject("bindEntity", bindEntity);
    				}
    			}
    		}
    	}
    	view.addObject("type", method);
        view.addObject("openid", openid);
        view.addObject("clientsxh", clientsxh);
        return view;
    }
    
    public ModelAndView toGraduateSuccessPage(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
			view = new ModelAndView("teaching/graduate_success");
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    //异步上传图片
    public void uploadImg(HttpServletRequest request, HttpServletResponse response){
    	PrintWriter out = null;
    	Map<String, Object> result = new HashMap<String, Object>();
    	MultipartFile mf = null;
    	String simpPath = "";
        int code = -1;
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        List<MultipartFile> multipartFiles = multipartRequest.getFiles("file");
        if (null != multipartFiles && multipartFiles.size() > 0) {
    		mf = multipartFiles.get(0);
            String originalFilename = mf.getOriginalFilename();// 图片名
            simpPath = originalFilename;
            String realPath = getPropertiesValue("imgAbsolutelyPath")+"/"+originalFilename;// 全路径
            File source = new File(realPath);
            try {
            	out = response.getWriter();
                mf.transferTo(source);
                code = 0;
            } catch (Exception e) {
            	code = 1;
            	e.printStackTrace();
            }
        }
        result.put("code", code);
        result.put("realPath", simpPath);
        String json = new Gson().toJson(result, new TypeToken<Map<String, Object>>(){}.getType());
        out.write(json);
        if(out!=null)out.close();
    }
    
    /**
     * 异步获取人员专业、班级选框内容
     * @param request
     * @param response
     */
    public void getProfessional(HttpServletRequest request, HttpServletResponse response) {
    	response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        Map<String, Object> result = new HashMap<String, Object>();
        try {
        	out = response.getWriter();
        	JxClassSqlWhere sqlWhere1 = new JxClassSqlWhere();
        	List<JxClassEntity> classlist=jxClassService.selectListJxClassBySqlWhere(sqlWhere1);
        	//纪录操作日志
            try{
            	frmZlExlogService.saveFrmZlExlog(request, "获得班级信息getProfessional", "操作执行成功,结果长度："+classlist.size());
            }catch(Exception e){
            	e.printStackTrace();
            }
            result.put("classlist", classlist);
        } catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListJxClass.toString(),Tools.getException(e));
        }finally{
        	String json = new Gson().toJson(result, new TypeToken<Map<String, Object>>(){}.getType());
            out.write(json);
            if(out!=null)out.close();
        }
    }
    
    public String getNewId(){
    	String id = "";
    	int s = jxStudentsService.selectJXStudentsSequence();
		if(s<10){
			id="0000"+s;
		}else if(s<100){
			id="000"+s;
		}else if(s<1000){
			id="00"+s;
		}else if(s<10000){
			id="0"+s;
		}else{
			id=""+s;
		}
		return id;
    }
    
    //获取属性配置文件中的值
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
     * 通用查询学员页面(ywq)
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toQueryStudents(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=gbk");
        String classid = request.getParameter("classid");
        JxClassSqlWhere sqlWhere = new JxClassSqlWhere();
        List<JxClassEntity> list = jxClassService.selectListJxClassBySqlWhere(sqlWhere);
        ModelAndView view=new ModelAndView("tool/common_query_students");
        view.addObject("classid", classid);
        view.addObject("list", list);
        view.addObject("option", "add");
        return view;
    }

    /**
     * 实习生注册页面(ywq)
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toInternRegistPage(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=gbk");
        ModelAndView view = null;
        try {
        	String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
			view = new ModelAndView("teaching/intern_regist");
			view.addObject("openid", openid);
			view.addObject("clientsxh", clientsxh);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }
    /**
     * 跳转至学生文件列表页面
     * @param request
     * @param response
     * @return
     */
    public ModelAndView getStudentsFile(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	String userid = bindinfo.getYitongCard();
        	JxStudentsEntity stu = jxStudentsService.selectJxStudentsByPrimaryKey(userid);
			view = new ModelAndView("teaching/stdent_infosave");
			view.addObject("openid", openid);
			view.addObject("userid", userid);
			view.addObject("comtype", stu.getComtype());
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    
    public ModelAndView openAgreement(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String type = request.getParameter("type");
    		String stuname = request.getParameter("stuname");
    		String graduateschool = request.getParameter("graduateschool");
    		String studystarttime = request.getParameter("studystarttime");
    		String studyendtime = request.getParameter("studyendtime");
			view = new ModelAndView("teaching/students_agreement");
			view.addObject("stuname", stuname);
			view.addObject("graduateschool", graduateschool);
			view.addObject("studystarttime", studystarttime);
			view.addObject("studyendtime", studyendtime);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    /**
     * 更具type不同，分别跳转至不同页面
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toStudentsFileInfo(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String type = request.getParameter("type");
    		String openid = request.getParameter("openid");
    		String clientsxh = request.getParameter("clientsxh");
    		String userid = request.getParameter("userid");
    		JxStudentsEntity stu = jxStudentsService.selectJxStudentsByPrimaryKey(userid);
    		stu.setImagepath(getPropertiesValue("imgAccessPath")+stu.getImagepath());
    		String nowtime = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    		String nowyear = new SimpleDateFormat("yyyy").format(new Date());
    		String nowmother = new SimpleDateFormat("MM").format(new Date());
    		String nowday = new SimpleDateFormat("dd").format(new Date());
    		String path = "";
    		FrmCodeEntity sex = null;
    		FrmCodeEntity school = null;
    		FrmCodeEntity zy = null;
    		FrmCodeEntity xl = null;
    		FrmCodeEntity comtypel = null;
    		String xxszd = "";
    		String sxmothercost = "";
    		String fzmothercost = "";
    		if(type.equals("1")){
    			path = "teaching/students_file_xp";
    		}else if(type.equals("2")){
    			FrmCodeKey key = new FrmCodeKey();
    			key.setXtlb("00");
    			key.setDmlb("0114");
    			key.setDmz(stu.getSex());
    			sex = frmCodeService.selectFrmCodeByPrimaryKey(key);
    			key.setDmlb("1676");
    			key.setDmz(stu.getGraduateschool());
    			school = frmCodeService.selectFrmCodeByPrimaryKey(key);
    			key.setDmlb("0136");
    			key.setDmz(stu.getProfessional());
    			zy = frmCodeService.selectFrmCodeByPrimaryKey(key);
    			key.setDmlb("0110");
    			key.setDmz(stu.getXueli());
    			xl = frmCodeService.selectFrmCodeByPrimaryKey(key);
    			key.setDmlb("1675");
    			key.setDmz(stu.getComtype());
    			comtypel = frmCodeService.selectFrmCodeByPrimaryKey(key);
    			if(!stu.getComtype().equals("6")){
    				xxszd = "甘肃 兰州";
    			}else{
    				xxszd = "宁夏 银川";
    			}
    			path = "teaching/students_file_bdz";
    		}else{
    			FrmCodeKey key = new FrmCodeKey();
    			key.setXtlb("00");
    			key.setDmlb("1676");
    			key.setDmz(stu.getGraduateschool());
    			school = frmCodeService.selectFrmCodeByPrimaryKey(key);
    			if(stu.getComtype().equals("1")){
    				if(stu.getProfessional().equals("13")){
    					sxmothercost = "150";
    				}else{
    					sxmothercost = "100";
    				}
    			}else{
    				if(stu.getProfessional().equals("13")){
    					sxmothercost = "200";
    				}else{
    					sxmothercost = "150";
    				}
    			}
				if(stu.getProfessional().equals("25")){
					fzmothercost = "65";
				}else{
					fzmothercost = "68";
				}
    			path = "teaching/students_file_jfd";
    		}
			view = new ModelAndView(path);
			String schoolname = stu.getRemark5()+"  "+stu.getCollegename();
			view.addObject("sex", sex!=null?sex.getDmmc():"");
			view.addObject("school", schoolname);
			view.addObject("zy", zy!=null?zy.getDmmc():"");
			view.addObject("xl", xl!=null?xl.getDmmc():"");
			view.addObject("comtypel", comtypel!=null?comtypel.getDmmc():"");
			view.addObject("xxszd", xxszd);
			view.addObject("nowtime", nowtime);
			view.addObject("stu", stu);
			view.addObject("nowyear", nowyear);
			view.addObject("nowmother", nowmother);
			view.addObject("nowday", nowday);
			view.addObject("sxmothercost", sxmothercost);
			view.addObject("fzmothercost", fzmothercost);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    
    /**
     * 去申请终止实习页面
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toStoppracticeApply(HttpServletRequest request,HttpServletResponse response){
    	response.setContentType("text/html; charset=utf-8");
        ModelAndView view= null;
		try {
			view=new ModelAndView("teaching/student_stop_practice");
			String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid, clientsxh);
        	String yitongCard = bindinfo.getYitongCard();
        	JxStudentsEntity entity = jxStudentsService.selectJxStudentsByPrimaryKey(yitongCard);
        	view.addObject("entity",entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return view;
    }
    
    
    /**
     * 终止实习提交
     * @param request
     * @param response
     * @param entity
     */
    public void reSetStudentStopPeactice(HttpServletRequest request,HttpServletResponse response,JxStudentsEntity entity){
    	response.setContentType("text/html;charset=UTF-8");
    	ExcuteResult result = null;
    	PrintWriter pw = null;
    	Map<String,Object> resultMap = new HashMap<String,Object>();
    	try{
    		pw = response.getWriter();
    		String taskinfo = request.getParameter("taskinfo");
    		taskinfo = URLDecoder.decode(taskinfo, "utf-8"); 
          	entity = JsonUtil.json2Object(taskinfo, JxStudentsEntity.class);
          	JxStudentsEntity student = jxStudentsService.selectJxStudentsByPrimaryKey(entity.getXh());
          	if(student.getTzyy() == null){
          		result = jxStudentsService.updateJxStudentsByPrimaryKeySelective(entity);
              	if(result.getReturnCode().equals("1")){
              		resultMap.put("errorMsg","success");
              	}else{
              		resultMap.put("errorMsg","failed");
              	}
          	}else{
          		resultMap.put("errorMsg","stopped");
          	}
    	}catch(Exception e){
    		e.printStackTrace();
    		resultMap.put("errorMsg","error");
    	}finally{
    		 String json = new Gson().toJson(resultMap, new TypeToken<Map<String, Object>>(){}.getType());
    		 System.out.println(json); 
    		 pw.write(json);
    	     if(pw!=null)pw.close();
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

    public void setJxStudentsService(IJxStudentsService jxStudentsService) {
        this.jxStudentsService = jxStudentsService;
    }

    public IJxStudentsService getJxStudentsService() {
        return jxStudentsService;
    }

	public IJxClassService getJxClassService() {
		return jxClassService;
	}

	public void setJxClassService(IJxClassService jxClassService) {
		this.jxClassService = jxClassService;
	}

	public IFrmCodeService getFrmCodeService() {
		return frmCodeService;
	}

	public void setFrmCodeService(IFrmCodeService frmCodeService) {
		this.frmCodeService = frmCodeService;
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

	public IFrmDepartmentService getFrmDepartmentService() {
		return frmDepartmentService;
	}

	public void setFrmDepartmentService(IFrmDepartmentService frmDepartmentService) {
		this.frmDepartmentService = frmDepartmentService;
	}

	public IFrmSysparaTypeService getFrmSysparaTypeService() {
		return frmSysparaTypeService;
	}

	public void setFrmSysparaTypeService(
			IFrmSysparaTypeService frmSysparaTypeService) {
		this.frmSysparaTypeService = frmSysparaTypeService;
	}

	public IWechatSysparamService getWechatSysparamService() {
		return wechatSysparamService;
	}

	public void setWechatSysparamService(
			IWechatSysparamService wechatSysparamService) {
		this.wechatSysparamService = wechatSysparamService;
	}
    
	
}