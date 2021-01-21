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
import com.saint.teaching.bean.JxStudentLeaveCheckEntity;
import com.saint.teaching.bean.JxStudentLeaveEntity;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.services.IJxStudentLeaveCheckService;
import com.saint.teaching.services.IJxStudentLeaveService;
import com.saint.teaching.services.IJxStudentsService;
import com.saint.teaching.sqlWhere.JxStudentLeaveCheckSqlWhere;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatSysparamEntity;
import com.saint.wechat.manager.bean.WechatSysparamKey;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.services.IWechatSysparamService;
import com.saint.wechat.manager.sqlWhere.WechatBindSqlWhere;

/**
*��ע����Ϣ
*����JX_STUDENT_LEAVE_CHECK
*��˵��ѧ��������
  */
public class JxStudentLeaveCheckAction extends MultiActionController {
	
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxStudentLeaveCheckService jxStudentLeaveCheckService;
    
    private IJxStudentLeaveService jxStudentLeaveService;
    
    private IWechatBindService wechatBindService;
    
    private IWechatSysparamService wechatSysparamService;
    
    private IFrmSysparaTypeService frmSysparaTypeService;
    
    private IJxStudentsService jxStudentsService;
    
    private IFrmCodeService frmCodeService;
    
    public static String clientsxh="6201001002";

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_STUDENT_LEAVE_CHECK
    *��˵��ѧ��������
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public void getListPageJxStudentLeaveCheck(HttpServletRequest request, HttpServletResponse response, JxStudentLeaveCheckSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//���ܲ���page��rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<JxStudentLeaveCheckEntity> entitylist=jxStudentLeaveCheckService.selectListPageJxStudentLeaveCheckBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//����map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total�� ����ܼ�¼���������   
            jsonMap.put("rows", entitylist);//rows�� ���ÿҳ��¼ list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxStudentLeaveCheck.toString(),Tools.getException(e));
        }
    }

    /**
     * ѧ��������(ywq)
     * @param request
     * @param response
     * @param entity
     */
    public void insertJxStudentLeaveCheck(HttpServletRequest request, HttpServletResponse response, JxStudentLeaveCheckEntity entity) {
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
            String Info = request.getParameter("Info");
            Info = URLDecoder.decode(Info, "utf-8"); 
        	entity = JsonUtil.json2Object(Info, JxStudentLeaveCheckEntity.class);
        	entity.setCheckperid(bindinfo.getYitongCard());
        	entity.setCheckperdepart(bindinfo.getDeptId());
        	entity.setCreatedate(time);
        	entity.setUptime(time);
        	JxStudentsEntity student = jxStudentsService.selectJxStudentsByPrimaryKey(bindinfo.getYitongCard());
        	//----------------------------------------���������Ϣ-------------------------------------------
        	JxStudentLeaveCheckSqlWhere jslcsqlWhere = new JxStudentLeaveCheckSqlWhere();
        	jslcsqlWhere.setStulevid(entity.getStulevid());
        	jslcsqlWhere.setCheckorder(entity.getCheckorder());
        	List<JxStudentLeaveCheckEntity> jslist = jxStudentLeaveCheckService.selectListJxStudentLeaveCheckBySqlWhere(jslcsqlWhere);
        	if(jslist.size()>0){
        		entity.setXh(jslist.get(0).getXh());
        		result = jxStudentLeaveCheckService.updateJxStudentLeaveCheckByPrimaryKeySelective(entity);
        	}else{
        		result = jxStudentLeaveCheckService.insertJxStudentLeaveCheck(entity);
        	}
        	//----------------------------------------��ȡ΢��������Ϣ----------------------------------------
        	WechatSysparamKey key = new WechatSysparamKey();
        	key.setGjz("RES_PATH");
        	key.setClientsxh(clientsxh);
        	WechatSysparamEntity sys = wechatSysparamService.selectWechatSysparamByPrimaryKey(key);
        	//----------------------------------------������������Ϣ---------------------------------------------------
        	JxStudentLeaveEntity sleave = jxStudentLeaveService.selectJxStudentLeaveByPrimaryKey(entity.getStulevid());
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
        					FrmCodeKey codekey = new FrmCodeKey();
        					codekey.setXtlb("00");
        					codekey.setDmlb("1676");
        					codekey.setDmz(student.getGraduateschool());
        					FrmCodeEntity schcode = frmCodeService.selectFrmCodeByPrimaryKey(codekey);
        					//kjkopenid = getssysTypeMrz("schoolfzropid");  //ѧУ�����openid
        					kjkopenid = schcode.getDmsm3();
        					sptype = "4";
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
        		if(s1.equals("3")){
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
        		}
        		if(s1.equals("2")){
        			mtype = "2";
        			template_id = getssysTypeMrz("qjsqjgmid");
        			kjkopenid = bindList.size()>0?bindList.get(0).getOpenId():"";//����˵�OPID
        			remark = entity.getState().equals("2")?"���������ͨ����":"�������ͨ����";
        			sptype = "3";
        		}
        		String url = sys.getDmz()+"/jxstuleave.do?method=toMineLeavePage&xh="+entity.getStulevid()+"&sptype="+sptype+"&openId="+kjkopenid;
        		JxStudentLeaveEntity record = new JxStudentLeaveEntity();
        		record.setXh(entity.getStulevid());
        		String leavestate = s1+"-"+s2;
        		record.setState(leavestate);
        		result2 = jxStudentLeaveService.updateJxStudentLeaveByPrimaryKeySelective(record);
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
    *����ע����Ϣ
    *JX_STUDENT_LEAVE_CHECK,ѧ�������˱�,�޸�
      */
    public void updateJxStudentLeaveCheck(HttpServletRequest request, HttpServletResponse response, JxStudentLeaveCheckEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxStudentLeaveCheckService.updateJxStudentLeaveCheckByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get����+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateJxStudentLeaveCheck, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateJxStudentLeaveCheck.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_STUDENT_LEAVE_CHECK,ѧ�������˱�,ɾ��
      */
    public void deleteJxStudentLeaveCheck(HttpServletRequest request, HttpServletResponse response, JxStudentLeaveCheckEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String xh=entity.getXh();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxStudentLeaveCheckService.deleteJxStudentLeaveCheckByPrimaryKey(xh);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteJxStudentLeaveCheck, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteJxStudentLeaveCheck.toString(),Tools.getException(e));
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
    public ModelAndView toCreateAddPageJxStudentLeaveCheck(HttpServletRequest request, HttpServletResponse response) {
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
    public ModelAndView toCreateUpdatePageJxStudentLeaveCheck(HttpServletRequest request, HttpServletResponse response, JxStudentLeaveCheckEntity entity) {
        String xh=entity.getXh();
        //�޸�ҳ��
        JxStudentLeaveCheckEntity entityJxStudentLeaveCheckEntity=jxStudentLeaveCheckService.selectJxStudentLeaveCheckByPrimaryKey(xh);
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxStudentLeaveCheckEntity);
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

    public void setJxStudentLeaveCheckService(IJxStudentLeaveCheckService jxStudentLeaveCheckService) {
        this.jxStudentLeaveCheckService = jxStudentLeaveCheckService;
    }

    public IJxStudentLeaveCheckService getJxStudentLeaveCheckService() {
        return jxStudentLeaveCheckService;
    }

	public IJxStudentLeaveService getJxStudentLeaveService() {
		return jxStudentLeaveService;
	}

	public void setJxStudentLeaveService(
			IJxStudentLeaveService jxStudentLeaveService) {
		this.jxStudentLeaveService = jxStudentLeaveService;
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
    
	
    
}