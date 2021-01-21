package com.saint.teaching.ctrl;

import java.io.PrintWriter;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.saint.systemManager.bean.FrmCodeEntity;
import com.saint.systemManager.bean.FrmCodeKey;
import com.saint.systemManager.bean.FrmSysparaTypeEntity;
import com.saint.systemManager.bean.FrmSysparaTypeKey;
import com.saint.systemManager.services.IFrmCodeService;
import com.saint.systemManager.services.IFrmSysparaTypeService;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.teaching.bean.JxCourseArrangeEntity;
import com.saint.teaching.bean.JxStudentsLeaveCheckEntity;
import com.saint.teaching.bean.JxStudentsLeaveEntity;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.services.IJxCourseArrangeService;
import com.saint.teaching.services.IJxStudentsLeaveCheckService;
import com.saint.teaching.services.IJxStudentsLeaveService;
import com.saint.teaching.services.IJxStudentsService;
import com.saint.teaching.sqlWhere.JxStudentsLeaveCheckSqlWhere;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatSysparamEntity;
import com.saint.wechat.manager.bean.WechatSysparamKey;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.services.IWechatSysparamService;
import com.saint.wechat.manager.sqlWhere.WechatBindSqlWhere;

/**
*��ע����Ϣ
*����JX_STUDENTS_LEAVE_CHECK
*��˵���������
  */
public class JxStudentsLeaveCheckAction extends MultiActionController {
	private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxStudentsLeaveCheckService jxStudentsLeaveCheckService;
    
    private IJxStudentsLeaveService jxStudentsLeaveService;
    
    private IWechatBindService wechatBindService;
    
    private IWechatSysparamService wechatSysparamService;
    
    private IFrmSysparaTypeService frmSysparaTypeService;
    
    private IJxStudentsService jxStudentsService;
    
    private IFrmCodeService frmCodeService;
    
    private IJxCourseArrangeService jxCourseArrangeService;
    
    public static String clientsxh="6201001002";

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_STUDENT_LEAVE_CHECK
    *��˵��ѧ��������
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public void getListPageJxStudentsLeaveCheck(HttpServletRequest request, HttpServletResponse response, JxStudentsLeaveCheckSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//���ܲ���page��rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<JxStudentsLeaveCheckEntity> entitylist=jxStudentsLeaveCheckService.selectListPageJxStudentsLeaveCheckBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//����map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total�� ����ܼ�¼���������   
            jsonMap.put("rows", entitylist);//rows�� ���ÿҳ��¼ list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxStudentsLeaveCheck.toString(),Tools.getException(e));
        }
    }

    /**
     * ѧ��������(ywq)
     * @param request
     * @param response
     * @param entity
     */
    public void insertJxStudentsLeaveCheck(HttpServletRequest request, HttpServletResponse response, JxStudentsLeaveCheckEntity entity) {
    	response.setContentType("text/html;charset=UTF-8");
    	PrintWriter out = null;
    	ExcuteResult result;
    	ExcuteResult result2;
    	Map<String,Object> resultMap = new HashMap();
        try {
            out = response.getWriter();
            String openId = request.getParameter("openId");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openId,clientsxh);//��õ�ǰ�����˰���Ϣ
            String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            //---------------------------------------���������Ϣ--------------------------------------------
            String stuid = request.getParameter("stuid");
            String Info = request.getParameter("Info");
            Info = URLDecoder.decode(Info, "utf-8"); 
        	entity = JsonUtil.json2Object(Info, JxStudentsLeaveCheckEntity.class);
        	entity.setCheckperid(bindinfo.getYitongCard());
        	entity.setCheckperdepart(bindinfo.getDeptId());
        	entity.setCreatedate(time);
        	entity.setUptime(time);
        	JxStudentsEntity student = jxStudentsService.selectJxStudentsByPrimaryKey(stuid);
        	//----------------------------------------���������Ϣ-------------------------------------------
        	result = jxStudentsLeaveCheckService.insertJxStudentsLeaveCheck(entity);
        	//----------------------------------------��ȡ΢��������Ϣ----------------------------------------
        	WechatSysparamKey key = new WechatSysparamKey();
        	key.setGjz("RES_PATH");
        	key.setClientsxh(clientsxh);
        	WechatSysparamEntity sys = wechatSysparamService.selectWechatSysparamByPrimaryKey(key);
        	//----------------------------------------������������Ϣ---------------------------------------------------
        	JxStudentsLeaveEntity sleave = jxStudentsLeaveService.selectJxStudentsLeaveByPrimaryKey(entity.getStulevid());
        	String remark = sleave.getCause();//�������
        	
        	if(result.getReturnCode().equals("1")){
        		String s1 = entity.getCheckorder();//�����˼���1��������ˣ�2���ƽ̿���ˣ�3��ѧУ���
        		String s2 = entity.getState();//������״̬��1��ͨ����2����ͨ����
        		//---------------------------------------������ѧ���İ���Ϣ----------------------------------------------------------
        		WechatBindSqlWhere bindsqlWhere = new WechatBindSqlWhere();
    			bindsqlWhere.setYitongCard(sleave.getStuid());
    			bindsqlWhere.setClientsxh(clientsxh);
    			List<WechatBindEntity> bindList = wechatBindService.selectListWechatBindBySqlWhere(bindsqlWhere);
        		String template_id="";//ģ��ID
        		String mtype = "";//1�����յ��µ�������룬�뼰ʱ������ 2���������������������ɣ��뼰ʱ�鿴��
        		String sptype = "";//ҳ���жϱ�ʶ�������������ʾ��1��2��4������˰�ť�Ĳ�ͬ��1��������ˣ�2���ƽ̿���ˣ�4��ѧУ��ˣ�sptype!=1&&sptype!=3&&sptype!=2���������߰죩
        		String kjkopenid = "";//�����openid
        		//---------------------------------------����ǿ������---------------------------------------------------
        		if(s1.equals("1")){
        			String leavedatestart = request.getParameter("leavedatestart");
            		String leavedateend = request.getParameter("leavedateend");
                	long statedate = getMillils(leavedatestart);
                	long enddate = getMillils(leavedateend);
                	long shc = enddate-statedate;//���㿪ʼ�����ʱ�����������
        			//-------------------------����������ͨ�������ж��Ƿ�С�����죬С������ֱ�������ɼ���---------------------------
        			if(s2.equals("1")){//����ǿ������
        				if(shc<86400000*3){//����������С������
        					s1="2";
        					mtype = "2";
        					template_id = getssysTypeMrz("qjsqjgmid");//��ٽ��ģ��ID
        					kjkopenid = bindList.size()>0?bindList.get(0).getOpenId():"";//����˵�OPID
        					sptype = "5";
        				}else{
        					mtype = "1";
                			template_id = getssysTypeMrz("qjsqmid");//�������ģ��
                			kjkopenid = getssysTypeMrz("kjksp");  //�ƽ̿������openid
                			sptype = "2";
        				}
        			}else{//���������˲�ͨ�� ����ֱ�����͸�������
        				mtype = "2";
        				template_id = getssysTypeMrz("qjsqjgmid");//��ٽ��ģ��ID
        				kjkopenid = bindList.size()>0?bindList.get(0).getOpenId():"";//����˵�OPID
            			remark = "����������ͨ����";
            			sptype = "3";
        			}
        		}
        		//------------------------------------------�����ѧУ���-------------------------------------------
        		/*if(s1.equals("3")){
        			if(s2.equals("1")){//������ͨ��
        				mtype = "1";
            			template_id = getssysTypeMrz("qjsqmid");//�������ģ��
            			kjkopenid = getssysTypeMrz("kjksp");  //�ƽ̿������openid
            			sptype = "2";
        			}else{//�����˲�ͨ�� ����ֱ�����͸�������
        				mtype = "2";
        				template_id = getssysTypeMrz("qjsqjgmid");//��ٽ��ģ��ID
        				kjkopenid = bindList.size()>0?bindList.get(0).getOpenId():"";//����˵�OPID
            			remark = "ѧУ������ͨ����";
            			sptype = "3";
        			}
        		}*/
        		if(s1.equals("2")){
        			mtype = "2";
        			template_id = getssysTypeMrz("qjsqjgmid");
        			kjkopenid = bindList.size()>0?bindList.get(0).getOpenId():"";//����˵�OPID
        			remark = entity.getState().equals("2")?"���������ͨ����":"�������ͨ����";
        			sptype = "3";
        		}
        		String url = sys.getDmz()+"/jxstuleave.do?method=toMineLeavePage&xh="+entity.getStulevid()+"&sptype="+sptype+"&openId="+kjkopenid;
        		JxStudentsLeaveEntity record = new JxStudentsLeaveEntity();
        		record.setXh(entity.getStulevid());
        		String leavestate = s1+"-"+s2;
        		record.setState(leavestate);
        		result2 = jxStudentsLeaveService.updateJxStudentsLeaveByPrimaryKeySelective(record);
        		if(result2.getReturnCode().equals("1")){
        			resultMap.put("errorMsg", "success");
        			//-------------------------------------΢����Ϣ����--------------------------------------
        			JxCommonAction.WechatTemplateSend(mtype,kjkopenid,url,sleave.getStuname(),time,remark,template_id);
        		}
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
     * ѧ��������(ywq)
     * @param request
     * @param response
     * @param entity
     */
    public void insertJxStudentsLeaveCheckorllk(HttpServletRequest request, HttpServletResponse response, JxStudentsLeaveCheckEntity entity) {
    	response.setContentType("text/html;charset=UTF-8");
    	PrintWriter out = null;
    	ExcuteResult result;
    	ExcuteResult result2;
    	Map<String,Object> resultMap = new HashMap();
        try {
            out = response.getWriter();
            String openId = request.getParameter("openId");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openId,clientsxh);//��õ�ǰ�����˰���Ϣ
            String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            //---------------------------------------���������Ϣ--------------------------------------------
            String stuid = request.getParameter("stuid");
            String Info = request.getParameter("Info");
            Info = URLDecoder.decode(Info, "utf-8"); 
        	entity = JsonUtil.json2Object(Info, JxStudentsLeaveCheckEntity.class);
        	entity.setCheckperid(bindinfo.getYitongCard());
        	entity.setCheckperdepart(bindinfo.getDeptId());
        	entity.setCreatedate(time);
        	entity.setUptime(time);
        	JxStudentsEntity student = jxStudentsService.selectJxStudentsByPrimaryKey(stuid);
        	//----------------------------------------���������Ϣ-------------------------------------------
        	result = jxStudentsLeaveCheckService.insertJxStudentsLeaveCheck(entity);
        	//----------------------------------------��ȡ΢��������Ϣ----------------------------------------
        	WechatSysparamKey key = new WechatSysparamKey();
        	key.setGjz("RES_PATH");
        	key.setClientsxh(clientsxh);
        	WechatSysparamEntity sys = wechatSysparamService.selectWechatSysparamByPrimaryKey(key);
        	//----------------------------------------������������Ϣ---------------------------------------------------
        	JxStudentsLeaveEntity sleave = jxStudentsLeaveService.selectJxStudentsLeaveByPrimaryKey(entity.getStulevid());
        	String remark = sleave.getCause();//�������
        	
        	if(result.getReturnCode().equals("1")){
        		String s1 = entity.getCheckorder();//�����˼���1��������ˣ�2���ƽ̿���ˣ�3��ѧУ���
        		String s2 = entity.getState();//������״̬��1��ͨ����2����ͨ����
        		//---------------------------------------������ѧ���İ���Ϣ----------------------------------------------------------
        		WechatBindSqlWhere bindsqlWhere = new WechatBindSqlWhere();
    			bindsqlWhere.setYitongCard(sleave.getStuid());
    			bindsqlWhere.setClientsxh(clientsxh);
    			List<WechatBindEntity> bindList = wechatBindService.selectListWechatBindBySqlWhere(bindsqlWhere);
        		String template_id=getssysTypeMrz("qjsqjgmid");;//ģ��ID
        		String mtype = "2";//1�����յ��µ�������룬�뼰ʱ������ 2���������������������ɣ��뼰ʱ�鿴��
        		String sptype = "3";//ҳ���жϱ�ʶ�������������ʾ��1��2��4������˰�ť�Ĳ�ͬ��1��������ˣ�2���ƽ̿���ˣ�4��ѧУ��ˣ�sptype!=1&&sptype!=3&&sptype!=2���������߰죩
        		String kjkopenid = bindList.size()>0?bindList.get(0).getOpenId():"";//�����openid
        		//---------------------------------------����ǿ������---------------------------------------------------
    			String shjg = entity.getState().equals("2")?"���������ͨ����":"�������ͨ����";
        		String url = sys.getDmz()+"/jxstuleave.do?method=toMineLeavePageorLlk&xh="+entity.getStulevid()+"&sptype="+sptype+"&openId="+kjkopenid;
        		JxStudentsLeaveEntity record = new JxStudentsLeaveEntity();
        		record.setXh(entity.getStulevid());
        		String leavestate = s1+"-"+s2;
        		record.setState(leavestate);
        		result2 = jxStudentsLeaveService.updateJxStudentsLeaveByPrimaryKeySelective(record);
        		if(result2.getReturnCode().equals("1")){
        			resultMap.put("errorMsg", "success");
        			//-------------------------------------΢����Ϣ����--------------------------------------
        			JxCommonAction.WechatTemplateSend(mtype,kjkopenid,url,sleave.getStuname(),time,remark,template_id);
        			if(entity.getState().equals("1")){//�����˳ɹ���ͬʱ���͸����ν�ʦ
        				/**
        				 * String openId,String url,String name,String coursename,String shdate,String teachername,String count,String templateid
        				 */
        				JxCourseArrangeEntity arrange = jxCourseArrangeService.selectJxCourseArrangeByPrimaryKey(sleave.getArrangexh());
        				WechatBindSqlWhere wbsql = new WechatBindSqlWhere();
            			wbsql.setYitongCard(arrange.getRkjshid());
            			List<WechatBindEntity> wblist = wechatBindService.selectListWechatBindBySqlWhere(wbsql);
            			String opid = "";
            			if(wblist.size()>0){
            				opid = wblist.get(0).getOpenId();
            			}
                    	String teacheropenId = opid;
        				String templateid=getssysTypeMrz("llkstuleavetz");;//ģ��ID
        				String lsname = sleave.getStuname();
        				String ascname = arrange.getCoursename();
        				String lsdate = arrange.getSkdate().substring(0,10)+" "+arrange.getShtime().split("~")[0];
        				String lstname = arrange.getRkjshname();
        				String count = sleave.getCause();
        				
        				JxCommonAction.WechatTemplateSendllkteacher(teacheropenId,url,lsname,ascname,lsdate,lstname,count,templateid);
        			}
        		}
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
    *JX_STUDENT_LEAVE_CHECK,ѧ�������˱�,�޸�
      */
    public void updateJxStudentsLeaveCheck(HttpServletRequest request, HttpServletResponse response, JxStudentsLeaveCheckEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxStudentsLeaveCheckService.updateJxStudentsLeaveCheckByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get����+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateJxStudentsLeaveCheck, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateJxStudentsLeaveCheck.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_STUDENT_LEAVE_CHECK,ѧ�������˱�,ɾ��
      */
    public void deleteJxStudentsLeaveCheck(HttpServletRequest request, HttpServletResponse response, JxStudentsLeaveCheckEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String xh=entity.getXh();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxStudentsLeaveCheckService.deleteJxStudentsLeaveCheckByPrimaryKey(xh);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteJxStudentsLeaveCheck, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteJxStudentsLeaveCheck.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }
    /**
     * ����ʱ���ú�����
     * @param time
     * @return
     */
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
    /**
    *����ע����Ϣ
    *JX_STUDENT_LEAVE_CHECK,ѧ�������˱�
    *��ת������ҳ��
      */
    public ModelAndView toCreateAddPageJxStudentsLeaveCheck(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //����ҳ��
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "add");
        return view;
    }

    /**
    *����ע����Ϣ
    *JX_STUDENT_LEAVE_CHECK,ѧ�������˱�
    *��ת���޸�ҳ��
      */
    public ModelAndView toCreateUpdatePageJxStudentsLeaveCheck(HttpServletRequest request, HttpServletResponse response, JxStudentsLeaveCheckEntity entity) {
        String xh=entity.getXh();
        //�޸�ҳ��
        JxStudentsLeaveCheckEntity entityJxStudentsLeaveCheckEntity=jxStudentsLeaveCheckService.selectJxStudentsLeaveCheckByPrimaryKey(xh);
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxStudentsLeaveCheckEntity);
        return view;
    }
    
    public String getssysTypeMrz(String gjz){
    	FrmSysparaTypeEntity entity = null;
    	try {
    		FrmSysparaTypeKey key = new FrmSysparaTypeKey(); 
    		key.setXtlb("00");
    		key.setGjz(gjz);
        	entity = frmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(key);//��������ɣ����͸�ѧ��ģ��
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return entity.getMrz(); 
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

    

	public IJxStudentsLeaveCheckService getJxStudentsLeaveCheckService() {
		return jxStudentsLeaveCheckService;
	}

	public void setJxStudentsLeaveCheckService(
			IJxStudentsLeaveCheckService jxStudentsLeaveCheckService) {
		this.jxStudentsLeaveCheckService = jxStudentsLeaveCheckService;
	}

	public IJxStudentsLeaveService getJxStudentsLeaveService() {
		return jxStudentsLeaveService;
	}

	public void setJxStudentsLeaveService(
			IJxStudentsLeaveService jxStudentsLeaveService) {
		this.jxStudentsLeaveService = jxStudentsLeaveService;
	}

	public IWechatBindService getWechatBindService() {
		return wechatBindService;
	}

	public void setWechatBindService(IWechatBindService wechatBindService) {
		this.wechatBindService = wechatBindService;
	}

	public IWechatSysparamService getWechatSysparamService() {
		return wechatSysparamService;
	}

	public void setWechatSysparamService(
			IWechatSysparamService wechatSysparamService) {
		this.wechatSysparamService = wechatSysparamService;
	}

	public IFrmSysparaTypeService getFrmSysparaTypeService() {
		return frmSysparaTypeService;
	}

	public void setFrmSysparaTypeService(
			IFrmSysparaTypeService frmSysparaTypeService) {
		this.frmSysparaTypeService = frmSysparaTypeService;
	}

	public IJxStudentsService getJxStudentsService() {
		return jxStudentsService;
	}

	public void setJxStudentsService(IJxStudentsService jxStudentsService) {
		this.jxStudentsService = jxStudentsService;
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