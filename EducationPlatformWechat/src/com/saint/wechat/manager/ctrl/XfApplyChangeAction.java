package com.saint.wechat.manager.ctrl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.saint.constant.FrmGnid;
import com.saint.pub.DateManager;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.pub.util.json.JsonUtil;
import com.saint.systemManager.bean.FrmDepartmentEntity;
import com.saint.systemManager.bean.FrmSysparaTypeEntity;
import com.saint.systemManager.bean.FrmSysparaTypeKey;
import com.saint.systemManager.services.IFrmDepartmentService;
import com.saint.systemManager.services.IFrmSysparaTypeService;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.systemManager.sqlWhere.FrmDepartmentSqlWhere;
import com.saint.wechat.manager.bean.TbDictdataEntity;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatBindKey;
import com.saint.wechat.manager.bean.XfApplyChangeEntity;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.services.IXfApplyChangeService;
import com.saint.wechat.manager.services.IXfEmployeeService;
import com.saint.wechat.manager.sqlWhere.XfApplyChangeSqlWhere;
import com.saint.wechat.manager.sqlWhere.XfEmployeeSqlWhere;
import com.saint.wechat.utils.ChineseCharToEn;

public class XfApplyChangeAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IXfApplyChangeService xfApplyChangeService;
    
    private IWechatBindService wechatBindService;
    
    private IXfEmployeeService xfEmployeeService;
    
    private IFrmDepartmentService frmDepartmentService;
    
    private IFrmSysparaTypeService frmSysparaTypeService;
    

	/**
	 * �ļ��ϴ�����
	 * @param request
	 * @param response
	 * @throws UnsupportedEncodingException 
	 */
    public String toTextOutputStream(@RequestParam("file") CommonsMultipartFile[] files,HttpServletRequest request,HttpServletResponse response){
		System.out.println("-----------------------�����ϴ��ļ�����-------------------------------");
		for(int i = 0;i<files.length;i++){
			System.out.println("fileName---------->" + files[i].getOriginalFilename());
		
			if(!files[i].isEmpty()){
				int pre = (int) System.currentTimeMillis();
				try {
					//�õ��������ͬʱ�������ϴ����ļ�
					FileOutputStream os = new FileOutputStream("H:/" + new Date().getTime() + files[i].getOriginalFilename());
					//�õ��ϴ��ļ���������
					FileInputStream in = (FileInputStream) files[i].getInputStream();
					
					//��д�ֽڵķ�ʽд�ļ�
					int b = 0;
					while((b=in.read()) != -1){
						os.write(b);
					}
					os.flush();
					os.close();
					in.close();
					int finaltime = (int) System.currentTimeMillis();
					System.out.println(finaltime - pre);
					
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("�ϴ�����");
				}
		}
		}
		return "/success";
	}
    /**
     * �ļ��ϴ�����
     * @param request
     * @param response
     * @throws IOException 
     * @throws ServletException 
     */
	public void upload(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		String userName = request.getParameter("username");
		ChineseCharToEn cte = new ChineseCharToEn();  
		String xmszm = cte.getAllFirstLetter(userName);
        //System.out.println("��ȡƴ������ĸ��"+ cte.getAllFirstLetter("������ϯ��"));  
		String yiyuan = request.getParameter("yiyuan");
		String yiyuanmc = frmDepartmentService.getDeptNamebyNumber(yiyuan);
		String yiyuanszm = cte.getAllFirstLetter(yiyuanmc);
		String ImgName = yiyuanszm+"-"+xmszm;
		System.out.println("ͼƬ���ƣ�"+ImgName);
        //����һ��ͨ�õĶಿ�ֽ�����
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        //�ж� request �Ƿ����ļ��ϴ�,���ಿ������
        if(multipartResolver.isMultipart(request)){
            //ת���ɶಿ��request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;
            //ȡ��request�е������ļ���
            Iterator<String> iter = multiRequest.getFileNames();

            while(iter.hasNext()){
                //��¼�ϴ�������ʼʱ��ʱ�䣬���������ϴ�ʱ��
//                int pre = (int) System.currentTimeMillis();
                //ȡ���ϴ��ļ�
                MultipartFile file = multiRequest.getFile(iter.next());
                if(file != null){
                    //ȡ�õ�ǰ�ϴ��ļ����ļ�����
                    String myFileName = file.getOriginalFilename();
                    //������Ʋ�Ϊ����,˵�����ļ����ڣ�����˵�����ļ�������
                    if(myFileName.trim() !=""){
                        System.out.println(myFileName);
                        //�������ϴ�����ļ���
                        String dirPath = request.getSession().getServletContext().getRealPath("photos") ;
                        //�ļ���·��
                        String temp = "photos"+ "/"+ file.getOriginalFilename() ;
                        System.out.println("ͼƬ��·����"+temp);
                        File dir = new File(dirPath) ;
                        if( !dir.exists() ){
                            dir.mkdirs() ;
                        }
                        //���ļ�������
                        //String fileName = dir.getAbsolutePath() + "/"+ file.getOriginalFilename();
                        String fileName1 =  "E:/worksprace_2015/EducationPlatformWechat/WebRoot/photos/"+ ImgName+".jpg";
                        
                        //�����ϴ�·��
                        File localFile = new File(fileName1);
                        if( !localFile.exists() ){
                            try {
                                localFile.createNewFile() ;
                                file.transferTo(localFile);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
						
						// �����ļ����ļ����ݱ� �����ļ�ID
                        String ID = UUID.randomUUID().toString() ; 
                        System.out.println("---------------"+ID+"---------------");
                    }
                }
                //��¼�ϴ����ļ����ʱ��
//                int finaltime = (int) System.currentTimeMillis();
//                System.out.println(finaltime - pre);
            }
        }
        //request.getRequestDispatcher("WEB-INF/pages/tool/pay_newcode.jsp").forward(request, response);
		//response.sendRedirect("WEB-INF/pages/tool/pay_newcode.jsp");
       
    }
	/**
	 * ����������Ϣ���ҳ��
	 * @param request
	 * @param response
	 * @param entity
	 * @return
	 */
	public ModelAndView toApplyinfoChange(HttpServletRequest request, HttpServletResponse response, WechatBindEntity entity) {
	    ModelAndView view = null;
	    try {
	    	String openId = request.getParameter("openid");
	    	String clientsxh = request.getParameter("clientsxh");
	        WechatBindEntity bindinfo = wechatBindService.getBindInfo(openId, clientsxh);
	        
	        if(bindinfo==null){
	        	request.getRequestDispatcher("WEB-INF/pages/tool/hint_bind1.jsp").forward(request, response);
	        }else{
	        	XfEmployeeEntity empEntity = xfEmployeeService.selectXfEmployeeByPrimaryKey(bindinfo.getYitongCard());
	        	if(empEntity==null||bindinfo.getState()==null||bindinfo.getState().equals("1")||bindinfo.getState().equals("3")){
	        		request.getRequestDispatcher("WEB-INF/pages/tool/hint_bind1.jsp").forward(request, response);
	        	}else{
	        		FrmDepartmentEntity yiyuanentity = frmDepartmentService.selectFrmDepartmentByPrimaryKey(empEntity.getYiyuan());
	        		List<FrmDepartmentEntity> deptList = null;
	        		String ishaveyiyuan = "none";
	        		if(empEntity.getYiyuan()!=null&&!"".equals(empEntity.getYiyuan())){
	        			ishaveyiyuan = "yes";
	        			deptList = frmDepartmentService.getListAlldeptBySqlWhere(empEntity.getYiyuan());
	        		}
	        		view=new ModelAndView("apply_info/applyinfo_change");
	        		view.addObject("openId", openId);
	        		view.addObject("clientsxh",clientsxh);
	        		view.addObject("bindinfo",bindinfo);
	        		if(yiyuanentity!=null&&yiyuanentity.getBmmc()!=null)
	        			view.addObject("yiyuan", yiyuanentity.getBmmc());
	        		view.addObject("deptList", deptList);
	        		view.addObject("empEntity", empEntity);
	        		view.addObject("ishaveyiyuan", ishaveyiyuan);
	        	}
	        }
	    } catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }
	/**
	 * ����������Ϣ
	 * @param request
	 * @param response
	 * @param entity
	 * @throws UnsupportedEncodingException
	 */
	public void SaveApplyinfo(HttpServletRequest request,HttpServletResponse response,XfApplyChangeEntity entity) throws UnsupportedEncodingException{
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = null;
	    ExcuteResult result=null;
	    Map<String, Object> resultMap = new HashMap<String, Object>();
	    try {
	    	out = response.getWriter();
	    	String clientsxh = request.getParameter("clientsxh");
	    	String applyInfo = request.getParameter("applyInfo");
	    	applyInfo = URLDecoder.decode(applyInfo, "utf-8"); 
        	entity = JsonUtil.json2Object(applyInfo, XfApplyChangeEntity.class);
        	String gxsj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        	entity.setGxsj(gxsj);
        	entity.setSqsj(gxsj);
        	FrmSysparaTypeKey dakatimekey = new FrmSysparaTypeKey();
			dakatimekey.setXtlb("00");
			dakatimekey.setGjz("register");
			FrmSysparaTypeEntity dakatimeentity = frmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(dakatimekey);
			String sfsh = dakatimeentity.getMrz();
			if(sfsh.equals("0")){//�������
				XfEmployeeEntity emp = new XfEmployeeEntity();
				emp.setUsernumber(entity.getYitongcode());
				emp.setUsername(entity.getUserxm());
				emp.setSex(entity.getUsersex());
				emp.setIdcard(entity.getSfzhm());
				emp.setUsertel(entity.getZkrlxfs());
				emp.setDepart(entity.getDept());
				emp.setZhicheng(entity.getZhicheng());
				emp.setZhichenglv(entity.getYhlb());
				emp.setZhuanye(entity.getRemark1());
				emp.setXueli(entity.getRemark2());
				emp.setMinzu(entity.getRemark3());
				xfEmployeeService.updateXfEmployeeByPrimaryKeySelective(emp);
				WechatBindEntity record = new WechatBindEntity();
		    	record.setOpenId(entity.getOpenid());
		    	record.setClientsxh(clientsxh);
		    	record.setDeptId(entity.getDept());
		    	record.setSfzmhm(entity.getSfzhm());
		    	record.setXm(entity.getUserxm());
		    	record.setRemark1(entity.getYiyuan());
		    	record.setRemark2(entity.getZhicheng());
		    	record.setRemark3(entity.getUsersex());
		    	result = wechatBindService.updateWechatBindByPrimaryKeySelective(record);
		    	if(result.getReturnCode().equals("1")){
					resultMap.put("errorMsg", "success");
				}else{
					resultMap.put("errorMsg", "failed");
				}
				
			}else{
				result = xfApplyChangeService.insertXfApplyChange(entity);
				if(result.getReturnCode().equals("1")){
					resultMap.put("errorMsg", "success");
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
	 * �������벹��ҳ��
	 * @param args
	 */
	public ModelAndView toApplyReplaceCode(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html;charset=utf-8");
		ModelAndView view = null;
		try {
			String openId = request.getParameter("openid");
			String clientsxh = request.getParameter("clientsxh");
			WechatBindEntity bindinfo = wechatBindService.getBindInfo(openId,clientsxh);
			if(bindinfo==null){
				request.getRequestDispatcher("WEB-INF/pages/tool/hint_bind1.jsp").forward(request, response);
			}else{
				if(bindinfo.getState().equals("1")||bindinfo.getState().equals("3")){
					view = new ModelAndView("tool/hint_bind1");
				}else{
					view=new ModelAndView("apply_info/apply_replacecode");
					view.addObject("openId", openId);
					view.addObject("clientsxh", clientsxh);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return view;
	}
	/**
	 * �������벹����Ϣ
	 * @param request
	 * @param response
	 */
	public void applyreplacecode(HttpServletRequest request, HttpServletResponse response,XfApplyChangeEntity entity){
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = null;
	    ExcuteResult result;
	    Map<String, Object> resultMap = new HashMap<String, Object>();
	    try {
	    	out = response.getWriter();
	    	String applyInfo = request.getParameter("applyInfo");
	    	applyInfo = URLDecoder.decode(applyInfo, "utf-8"); 
        	entity = JsonUtil.json2Object(applyInfo, XfApplyChangeEntity.class);
        	String gxsj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	    	XfEmployeeEntity employeeEntity = xfEmployeeService.selectXfEmployeeByPrimaryKey(entity.getYitongcode());
	    	if(employeeEntity != null){
	    		String dept_id = employeeEntity.getDepart();
	            String sfzhm = employeeEntity.getIdcard();
	            String yiyuan = employeeEntity.getYiyuan();
	            String zhicheng = employeeEntity.getZhicheng();
	            String usersex = employeeEntity.getSex();
	    		entity.setSfzhm(sfzhm);
	    		entity.setUsersex(usersex);
	    		entity.setYiyuan(yiyuan);
	    		entity.setDept(dept_id);
	    		entity.setZhicheng(zhicheng);
	    		entity.setGxsj(gxsj);
	    		entity.setSqsj(gxsj);
	    		entity.setYhlb("1");
	    		result = xfApplyChangeService.insertXfApplyChange(entity);
	    		if(result.getReturnCode().equals("1")){
	    			resultMap.put("errorMsg", "success");
	    		}else{
	    			resultMap.put("errorMsg", "failed");
	    		}
	    	}else{
	    		resultMap.put("errorMsg", "infoerror");
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
	 * �����°쿨ҳ��
	 * @param request
	 * @param response
	 * @return
	 */
	public ModelAndView toApplyManageNewcode(HttpServletRequest request, HttpServletResponse response){
		String clientsxh = request.getParameter("clientsxh");
		String openId = request.getParameter("openid");
    	List<FrmDepartmentEntity> yiyuanList = frmDepartmentService.getListAllyiyuanBySqlWhere();
		ModelAndView view=new ModelAndView("apply_info/apply_manageNewcode");
		view.addObject("yiyuanList", yiyuanList);
		view.addObject("openId", openId);
		view.addObject("clientsxh", clientsxh);
		return view;
	}
	/**
	 * �����°쿨��Ա��Ϣ
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public void SaveNewcodeInfo(HttpServletRequest request, HttpServletResponse response,XfApplyChangeEntity entity) throws UnsupportedEncodingException{
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = null;
	    ExcuteResult result;
	    Map<String, Object> resultMap = new HashMap<String, Object>();
	    try {
	    	out = response.getWriter();
	    	String applyInfo = request.getParameter("applyInfo");
	    	applyInfo = URLDecoder.decode(applyInfo, "utf-8"); 
	    	entity = JsonUtil.json2Object(applyInfo, XfApplyChangeEntity.class);
	    	XfApplyChangeSqlWhere sqlWhere = new XfApplyChangeSqlWhere();
			sqlWhere.setSfzhm(entity.getSfzhm());
			sqlWhere.setBltype("3");
			List<XfApplyChangeEntity> applyNewCardlist = xfApplyChangeService.selectListXfApplyChangeBySqlWhere(sqlWhere);
        	String gxsj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        	entity.setGxsj(gxsj);
        	entity.setSqsj(gxsj);
        	XfEmployeeSqlWhere empsqlWhere = new XfEmployeeSqlWhere();
        	empsqlWhere.setUsername(entity.getUserxm());
        	empsqlWhere.setIdcard(entity.getSfzhm());
        	//empsqlWhere.setYiyuan(entity.getYiyuan());
        	List<XfEmployeeEntity> emplist = xfEmployeeService.selectListXfEmployeeBySqlWhere(empsqlWhere);
        	if(emplist.size()<=0){
        		resultMap.put("errorMsg", "noemp");
        	}else{
	        	 if(applyNewCardlist.size()>0){
		    		resultMap.put("errorMsg", "exsit");
		    	 }else{
		    		entity.setYitongcode(emplist.get(0).getUsernumber());
			    	result = xfApplyChangeService.insertXfApplyChange(entity);
			    	if(result.getReturnCode().equals("1")){
		        		resultMap.put("errorMsg", "success");
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
	 * �����°쿨֧��ҳ��
	 * @param request
	 * @param response
	 * @return
	 */
	public ModelAndView toPayNewcardPage(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html; charset=utf-8");
		XfApplyChangeEntity entity = new XfApplyChangeEntity();
		ModelAndView view = null;
		try {
			String username = new String(request.getParameter("username").getBytes("ISO-8859-1"), "UTF-8");
			String sfzhm = request.getParameter("sfzhm");
			entity.setUserxm(username);
			entity.setSfzhm(sfzhm);
			entity.setUsersex(request.getParameter("usersex"));
			entity.setYiyuan(request.getParameter("yiyuan"));
			String yiyuantext = new String(request.getParameter("yiyuantext").getBytes("ISO-8859-1"), "UTF-8");
			entity.setYiyuanmc(yiyuantext);
			entity.setDept(request.getParameter("dept"));
			String depttext = new String(request.getParameter("depttext").getBytes("ISO-8859-1"), "UTF-8");
			entity.setDeptmc(depttext);
			entity.setZhicheng(request.getParameter("zhicheng"));
			String zhichengtext = new String(request.getParameter("zhichengtext").getBytes("ISO-8859-1"), "UTF-8");
			entity.setZhichengmc(zhichengtext);
			entity.setYhlb(request.getParameter("yhlb"));
			entity.setRemark5(request.getParameter("userImage"));
			view = new ModelAndView("tool/pay_newcode");
			view.addObject("entity", entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return view;
	}
	
	//---------------------------------------����쿨��Ϣ------------------------------------------
	public ModelAndView toInfo_ApplyNewCard(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html; charset=utf-8");
		ModelAndView view = null;
		try {
			String openId = request.getParameter("openid");
			String clientsxh = request.getParameter("clientsxh");
			WechatBindEntity bidinfo = wechatBindService.getBindInfo(openId,clientsxh);
			XfApplyChangeSqlWhere changeSqlWhere = new XfApplyChangeSqlWhere();
			changeSqlWhere.setYiyuan(bidinfo.getRemark1());
			changeSqlWhere.setBltype("3");
			changeSqlWhere.setState("1");
			List<XfApplyChangeEntity> list = xfApplyChangeService.selectListXfApplyChangeBySqlWhere(changeSqlWhere);
			view = new ModelAndView("apply_info/newcard_infozs");
			view.addObject("type", "3");
			view.addObject("list", list);
			view.addObject("openId", openId);
			view.addObject("clientsxh", clientsxh);
			view.addObject("yiyuan", bidinfo.getRemark1());
			view.addObject("size", list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return view;
	}
	/**
	 * ����������Ϣ�����ϸҳ��
	 * @param request
	 * @param response
	 * @return
	 */
	public ModelAndView tonewcard_infoxx(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html; charset=utf-8");
		ModelAndView view = null;
		String id = request.getParameter("id");
		String type = request.getParameter("type");
		String yiyuan = request.getParameter("yiyuan");
		String openId = request.getParameter("openId");
		String clientsxh = request.getParameter("clientsxh");
		XfApplyChangeEntity entity = xfApplyChangeService.selectXfApplyChangeByPrimaryKey(id);
		String changeyiyuanname = frmDepartmentService.getDeptNamebyNumber(entity.getYiyuan());
		String changedeptname = frmDepartmentService.getDeptNamebyNumber(entity.getDept());
		String yitongcode = entity.getYitongcode();
		XfEmployeeEntity employeeEntity = xfEmployeeService.selectXfEmployeeByPrimaryKey(yitongcode);
		String yiyuanname = frmDepartmentService.getDeptNamebyNumber(employeeEntity.getYiyuan());
		String deptname = frmDepartmentService.getDeptNamebyNumber(employeeEntity.getDepart());
		try {
			if(type.equals("1")){
				view = new ModelAndView("apply_info/applychange_infoxx");
				view.addObject("employeeEntity", employeeEntity);
				view.addObject("changeyiyuanname", changeyiyuanname);
				view.addObject("changedeptname", changedeptname);
			}else{
				view = new ModelAndView("apply_info/newcard_infoxx");
			}
			view.addObject("id", id);
			view.addObject("entity", entity);
			view.addObject("type", type);
			view.addObject("openId", openId);
			view.addObject("clientsxh", clientsxh);
			view.addObject("yiyuan", yiyuan);
			view.addObject("yiyuanname", yiyuanname);
			view.addObject("deptname", deptname);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return view;
	}
	//--------------------------------------------���벹����Ϣ--------------------------------------------
	public ModelAndView toInfo_ApplyReplaceCard(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html; charset=utf-8");
		ModelAndView view = null;
		String yiyuan = request.getParameter("yiyuan");
		String openId = request.getParameter("openid");
		String clientsxh = request.getParameter("clientsxh");
		try {
			XfApplyChangeSqlWhere changeSqlWhere = new XfApplyChangeSqlWhere();
			changeSqlWhere.setDept(yiyuan);
			changeSqlWhere.setBltype("2");
			changeSqlWhere.setState("1");
			List<XfApplyChangeEntity> list = xfApplyChangeService.selectListXfApplyChangeBySqlWhere(changeSqlWhere);
			view = new ModelAndView("apply_info/newcard_infozs");
			view.addObject("list", list);
			view.addObject("type", "2");
			view.addObject("openId", openId);
			view.addObject("clientsxh", clientsxh);
			view.addObject("yiyuan", yiyuan);
			view.addObject("size", list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return view;
	}
	//--------------------------------------------������Ϣ���------------------------------------------
	public ModelAndView toInfo_ApplyInfoChange(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html; charset=utf-8");
		ModelAndView view = null;
		String openId = request.getParameter("openid");
		String clientsxh = request.getParameter("clientsxh");
		WechatBindEntity bindinfo = wechatBindService.getBindInfo(openId,clientsxh);
		String yiyuan = bindinfo.getRemark1();
		try {
			XfApplyChangeSqlWhere changeSqlWhere = new XfApplyChangeSqlWhere();
			changeSqlWhere.setYiyuan(yiyuan);
			changeSqlWhere.setBltype("1");
			changeSqlWhere.setState("0");
			List<XfApplyChangeEntity> list = xfApplyChangeService.selectListXfApplyChangeBySqlWhere(changeSqlWhere);
			view = new ModelAndView("apply_info/newcard_infozs");
			view.addObject("openId", openId);
			view.addObject("clientsxh", clientsxh);
			view.addObject("yiyuan", yiyuan);
			view.addObject("list", list);
			view.addObject("type", "1");
			view.addObject("size", list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return view;
	}
	/**
	 * ������Ϣ���
	 * @param request
	 * @param response
	 */
	public void updateApplyInfo(HttpServletRequest request, HttpServletResponse response,XfEmployeeEntity entity){
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = null;
	    ExcuteResult result;
	    Map<String, Object> resultMap = new HashMap<String, Object>();
	    try {
	    	out = response.getWriter();
	    	String openId = request.getParameter("openId");
	    	String clientsxh = request.getParameter("clientsxh");
	    	String id = request.getParameter("id");
	    	String changeInfo = request.getParameter("changeInfo");
	    	changeInfo = URLDecoder.decode(changeInfo, "utf-8"); 
	    	entity = JsonUtil.json2Object(changeInfo, XfEmployeeEntity.class);
	    	String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	    	int s = 0;
	    	WechatBindEntity record = new WechatBindEntity();
	    	record.setOpenId(openId);
	    	record.setClientsxh(clientsxh);
	    	record.setDeptId(entity.getDepart());
	    	record.setSfzmhm(entity.getIdcard());
	    	record.setXm(entity.getUsername());
	    	record.setRemark1(entity.getYiyuan());
	    	record.setRemark2(entity.getZhicheng());
	    	record.setRemark3(entity.getSex());
	    	result = wechatBindService.updateWechatBindByPrimaryKeySelective(record);
	    	if(result.getReturnCode().equals("1")){
	    		s++;
	    	}
	    	result = xfEmployeeService.updateXfEmployeeByPrimaryKeySelective(entity);
	    	if(result.getReturnCode().equals("1")){
	    		s++;
	    	}
	    	XfApplyChangeEntity changeEntity = new XfApplyChangeEntity();
	    	changeEntity.setXh(id);
	    	changeEntity.setState("1");
	    	changeEntity.setGxsj(date);
	    	result = xfApplyChangeService.updateXfApplyChangeByPrimaryKeySelective(changeEntity);
	    	if(result.getReturnCode().equals("1")){
	    		s++;
	    	}
	    	if(s==3){
	    		resultMap.put("errorMsg", "success");
	    	}else{
	    		resultMap.put("errorMsg", "faild");
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
	 * ����죨���������Ȳ鿴ҳ��
	 * @param request
	 * @param response
	 * @return
	 */
	public ModelAndView toInfo_MakeCardplan(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html;charset=utf-8");
		ModelAndView view = null;
		try {
			String openId = request.getParameter("openid");
			String clientsxh = request.getParameter("clientsxh");
			WechatBindEntity bindinfo = wechatBindService.getBindInfo(openId, clientsxh);
			if(bindinfo==null){
        		request.getRequestDispatcher("WEB-INF/pages/tool/hint_bind1.jsp").forward(request, response);
        	}else{
        		if(bindinfo.getState().equals("1")||bindinfo.getState().equals("3")){
        			request.getRequestDispatcher("WEB-INF/pages/tool/hint_bind1.jsp").forward(request, response);
        		}else{
		    		String yitongcode = bindinfo.getYitongCard();
		    		XfApplyChangeSqlWhere sqlWhere = new XfApplyChangeSqlWhere();
		    		sqlWhere.setYitongcode(yitongcode);
		    		sqlWhere.setBltype("1");
					List<XfApplyChangeEntity> list = xfApplyChangeService.selectListXfApplyChangeBySqlWhere_jd(sqlWhere);
					view = new ModelAndView("apply_info/make_card_infozs");
					view.addObject("list", list);
					view.addObject("bindinfo", bindinfo);
					view.addObject("size", list.size());
        		}
        	}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return view;
	}
	/**
	 * �죨������������ϸ��Ϣ�鿴
	 * @param request
	 * @param response
	 * @return
	 */
	public ModelAndView toInfo_MakeCardplanxx(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html; charset=utf-8");
		ModelAndView view = null;
		try {
			String id = request.getParameter("id");
			String openId = request.getParameter("openId");
			String clientsxh = request.getParameter("clientsxh");
			XfApplyChangeEntity entity = xfApplyChangeService.selectXfApplyChangeByPrimaryKey(id);
			String yiyuanname = frmDepartmentService.getDeptNamebyNumber(entity.getYiyuan());
			view = new ModelAndView("apply_info/make_card_infoxx");
			view.addObject("entity", entity);
			view.addObject("openId", openId);
			view.addObject("clientsxh", clientsxh);
			view.addObject("yiyuanname", yiyuanname);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return view;
	}
	/**
	 * �������֤�����ѯ������Ϣ
	 * @param request
	 * @param response
	 */
	public void getBKInfoBySfzhm(HttpServletRequest request,HttpServletResponse response){
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = null;
		try {	
			out=response.getWriter();
			String sfzhm = request.getParameter("sfzhm");
			String yitongcode = request.getParameter("yitongCard");
//			XfApplyChangeSqlWhere sqlWhere = new XfApplyChangeSqlWhere();
//			sqlWhere.setSfzhm(sfzhm);
//			sqlWhere.setYitongcode(yitongcode);
//			List<XfApplyChangeEntity> list = xfApplyChangeService.selectListXfApplyChangeBySqlWhere(sqlWhere);
			XfApplyChangeEntity entity = new XfApplyChangeEntity();
			XfEmployeeSqlWhere employeeSqlWhere = new XfEmployeeSqlWhere();
			employeeSqlWhere.setIdcard(sfzhm);
			employeeSqlWhere.setUsernumber(yitongcode);
			List<XfEmployeeEntity> employeeList = xfEmployeeService.selectListXfEmployeeBySqlWhere(employeeSqlWhere);
			if(employeeList != null && employeeList.size()>0){
				XfEmployeeEntity emp = employeeList.get(0);
				entity.setSfzhm(emp.getIdcard());
				entity.setYitongcode(emp.getUsernumber());
				entity.setUsersex(emp.getSex());
				entity.setUserxm(emp.getUsername());
				entity.setYiyuan(emp.getYiyuan());
				entity.setZhicheng(emp.getZhicheng());
				entity.setDept(emp.getDepart());
			}
//			String filepath = "";
//			if(list.size() > 0){//���������ȡ����
//				filepath = list.get(0).getZhichengmc();
//			}else{//δ�����������Ա��ȡ��Ϣ
//				filepath = "";
//			}
//			if(filepath!=null&&!filepath.equals("")){
//				filepath  = filepath.substring(filepath.indexOf("photos")+1);
//			}
//			entity.setZhichengmc(filepath);
			out.write(new Gson().toJson(entity));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * �ɷѼ�¼
	 * @param request
	 * @param response
	 * @return
	 */
	public ModelAndView paymanager(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html; charset=utf-8");
		ModelAndView view = null;
		try {
			String xh = request.getParameter("xh");
			String openid = request.getParameter("openid");
			String clientsxh = request.getParameter("clientsxh");
			XfApplyChangeEntity entity = xfApplyChangeService.selectXfApplyChangeByPrimaryKey(xh);
			//String deptname = frmDepartmentService.getDeptNamebyNumber(entity.getDept());
			view = new ModelAndView("payment_manage/my_payment_info");
			view.addObject("openid", openid);
			view.addObject("clientsxh", clientsxh);
			view.addObject("entity", entity);
			//view.addObject("deptname", deptname);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return view;
	}

	/**
	 * ɾ��һ���ɷ���Ϣ
	 * @param request
	 * @param response
	 */
	public void deleteApplyinfoByxh(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = null;
	    ExcuteResult result;
	    Map<String, Object> resultMap = new HashMap<String, Object>();
	    try {
	    	out = response.getWriter();
	    	String xh = request.getParameter("xh");
	    	result = xfApplyChangeService.deleteXfApplyChangeByPrimaryKey(xh);
	    	if(result.getReturnCode().equals("1")){
	    		resultMap.put("errorMsg", "success");
	    	}else{
	    		resultMap.put("errorMsg", "faild");
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

    public void setXfApplyChangeService(IXfApplyChangeService xfApplyChangeService) {
        this.xfApplyChangeService = xfApplyChangeService;
    }

    public IXfApplyChangeService getXfApplyChangeService() {
        return xfApplyChangeService;
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
    
	
}