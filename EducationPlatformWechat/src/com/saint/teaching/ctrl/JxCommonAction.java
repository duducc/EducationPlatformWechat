package com.saint.teaching.ctrl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.alibaba.fastjson.JSONObject;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.systemManager.bean.FrmSysparaTypeEntity;
import com.saint.systemManager.bean.FrmSysparaTypeKey;
import com.saint.systemManager.services.IFrmSysparaTypeService;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.teaching.bean.JxClassStudentsEntity;
import com.saint.teaching.bean.JxLunxunEntity;
import com.saint.teaching.services.IJxClassStudentsService;
import com.saint.teaching.services.IJxLunxunService;
import com.saint.teaching.sqlWhere.JxClassStudentsSqlWhere;
import com.saint.teaching.sqlWhere.JxLunxunSqlWhere;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatBindKey;

public class JxCommonAction{
	
	private IFrmZlExlogService frmZlExlogService;
	
    private ProcessResultImpl processResultImpl;
    
    private static IJxLunxunService jxLunxunService;
	
	private static IJxClassStudentsService jxClassStudentsService;
	
	private static IFrmSysparaTypeService frmSysparaTypeService;
   /**
    * 微信模板消息推送
    * @param openId
    * @param url
    * @param name
    * @param time
    * @param remark
    */
   public static void WechatTemplateSend(String type,String openId,String url,String name,String time,String remark,String template_id){
	   String first = "";
	   String _remark = "";
	   String keyword3 = "";
	   if(type.equals("1")){
		   first = "您收到新的请假申请，请及时审批。";
		   _remark = remark;
	   }else{
		   first = "您的请假申请已审批完成，请及时查看。";
		   keyword3 = remark;
//			   _remark = "审核意见";
	   }
	   
	   		String appid = "wx6569605b7500fc29";
	   		String secret = "3538956863daffa7ca4bc79c0cf8e71b";
//		   String appid = "wxe5e611b85af09c1b";
//		   String secret = "1f7b366a028d34d7493a1cd7f66d1953";
		   String tocken_url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+appid+"&secret="+secret+"";
	   try {
			String access_tocken = doGetStr(tocken_url,"access_token");
			String send_message_url = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token="+access_tocken;
			String message = "";
			if(type.equals("1")){
				message = "{\"touser\":\""+openId+"\","
						+ "\"template_id\":\""+template_id+"\","
						+ "\"url\":\""+url+"\","
						+ "\"topcolor\":\"#0f0\","
						+"\"data\":{\"first\": {\"value\":\""+first+"\",\"color\":\"#173177\"},"
								  +"\"keyword1\":{\"value\":\""+name+"\",\"color\":\"#173177\"},"
								  +"\"keyword2\":{\"value\":\""+time+"\",\"color\":\"#173177\"},"
								  +"\"remark\": {\"value\":\""+_remark+"\",\"color\":\"#173177\"}}}";
			}else{
				message = "{\"touser\":\""+openId+"\","
						+ "\"template_id\":\""+template_id+"\","
						+ "\"url\":\""+url+"\","
						+ "\"topcolor\":\"#0f0\","
						+"\"data\":{\"first\": {\"value\":\""+first+"\",\"color\":\"#173177\"},"
								  +"\"keyword1\":{\"value\":\""+name+"\",\"color\":\"#173177\"},"
								  +"\"keyword2\":{\"value\":\""+time+"\",\"color\":\"#173177\"},"
								  +"\"keyword3\":{\"value\":\""+keyword3+"\",\"color\":\"#173177\"},"
								  +"\"remark\": {\"value\":\""+_remark+"\",\"color\":\"#173177\"}}}";
			}
			doPostStr(send_message_url,message,"errmsg");
		}catch (IOException e) {
			e.printStackTrace();
		}
   }
   /**
    * 微信模板消息推送,学生注册审核通知
    * @param openId
    * @param url
    * @param name
    * @param time
    * @param remark
    */

   public static void WechatTemplateSendhf(String openId,String url,String name,String coursename,String shdate,String count,String template_id){
	   String appid = "wx6569605b7500fc29";
	   String secret = "3538956863daffa7ca4bc79c0cf8e71b";
	   String tocken_url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+appid+"&secret="+secret+"";
	   String first = "【"+name+"】老师对课程进行了回复，请查看";
	   count = "回复内容【"+count+"】";
	   try {
			String access_tocken = doGetStr(tocken_url,"access_token");
			String send_message_url = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token="+access_tocken;
			String message = "{\"touser\":\""+openId+"\","
					+ "\"template_id\":\""+template_id+"\","
					+ "\"url\":\""+url+"\","
					+ "\"topcolor\":\"#0f0\","
					+"\"data\":{\"first\": {\"value\":\""+first+"\",\"color\":\"#173177\"},"
							  +"\"keyword1\":{\"value\":\""+coursename+"\",\"color\":\"#173177\"},"
							  +"\"keyword2\":{\"value\":\""+shdate+"\",\"color\":\"#173177\"},"
							  +"\"remark\": {\"value\":\""+count+"\",\"color\":\"#173177\"}}}";
			doPostStr(send_message_url,message,"errmsg");
		}catch (IOException e) {
			e.printStackTrace();
		}
   }
   /**
    * 理论课老师收到学生提醒通知
    * @param openId
    * @param url
    * @param name
    * @param time
    * @param remark
    */

   public static void WechatTemplateSendllkteacher(String openId,String url,String name,String coursename,String shdate,String teachername,String count,String templateid){
	   String appid = "wx6569605b7500fc29";
	   String secret = "3538956863daffa7ca4bc79c0cf8e71b";
//	   String appid = "wxe5e611b85af09c1b";
//	   String secret = "1f7b366a028d34d7493a1cd7f66d1953";
	   String tocken_url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+appid+"&secret="+secret+"";
	   String first = shdate.substring(0,10)+"【"+coursename+"】课程有学生请假，请查看！";
	   try {
			String access_tocken = doGetStr(tocken_url,"access_token");
			String send_message_url = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token="+access_tocken;
			String message = "{\"touser\":\""+openId+"\","
					+ "\"template_id\":\""+templateid+"\","
					+ "\"url\":\""+url+"\","
					+ "\"topcolor\":\"#0f0\","
					+"\"data\":{\"first\": {\"value\":\""+first+"\",\"color\":\"#173177\"},"
							  +"\"keyword1\":{\"value\":\""+name+"\",\"color\":\"#173177\"},"
							  +"\"keyword2\":{\"value\":\""+"【"+coursename+"】"+"\",\"color\":\"#173177\"},"
							  +"\"keyword3\":{\"value\":\""+shdate+"\",\"color\":\"#173177\"},"
							  +"\"keyword4\":{\"value\":\""+teachername+"\",\"color\":\"#173177\"},"
							  +"\"remark\": {\"value\":\""+"请假原因："+count+"\",\"color\":\"#173177\"}}}";
			doPostStr(send_message_url,message,"errmsg");
		}catch (IOException e) {
			e.printStackTrace();
		}
   }
   /**
    * 工作审核通知(手动)
    * @author ywq
    */
   public static String WechatWorkApply(String url,String openId,String template_id,String frist, String shlx, String shlb,String shnr,String date,String xm,String remark){
	   String appid = "wx6569605b7500fc29";
	   String secret = "3538956863daffa7ca4bc79c0cf8e71b";
//	   String appid = "wxe5e611b85af09c1b";
//	   String secret = "1f7b366a028d34d7493a1cd7f66d1953";
	   String tocken_url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+appid+"&secret="+secret+"";  
       String ticket="";
	   try {
    	   String access_tocken = doGetStr(tocken_url,"access_token");
    	   String send_message_url = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token="+access_tocken;
    	   String message="{\"touser\":\""+openId+"\","
					+ "\"template_id\":\""+template_id+"\","
					+ "\"url\":\""+url+"\","
					+ "\"topcolor\":\"#0f0\","
					+"\"data\":{\"first\": {\"value\":\""+frist+"\",\"color\":\"#173177\"},"
							  +"\"keyword1\":{\"value\":\""+shlx+"\",\"color\":\"#173177\"},"
							  +"\"keyword2\":{\"value\":\""+shlb+"\",\"color\":\"#173177\"},"
							  +"\"keyword3\":{\"value\":\""+shnr+"\",\"color\":\"#173177\"},"
							  +"\"keyword4\":{\"value\":\""+date+"\",\"color\":\"#173177\"},"
							  +"\"keyword5\":{\"value\":\""+xm+"\",\"color\":\"#173177\"},"
							  +"\"remark\": {\"value\":\""+remark+"\",\"color\":\"#173177\"}}}";
    	   
    	   
    	  ticket = doPostStr(send_message_url,message,"errmsg");	    	 
	   } catch (Exception e) {
			e.printStackTrace();
	   }
	   return ticket;
   }
   
   /**
    * 通过Get方式发起请求，获取数据
    * @param url
    * @param returnName
    * @return token
    * @throws ParseException
    * @throws IOException
    */
   public static String doGetStr(String url,String returnName) throws ParseException, IOException {
   	DefaultHttpClient client = new DefaultHttpClient();
   	HttpGet request = new HttpGet(url);
   	HttpResponse response = client.execute(request);
   	String access_token = "";
   	if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
   		String strResult = EntityUtils.toString(response.getEntity());
   		System.out.println(strResult);
   		JSONObject jsonResult = JSONObject.parseObject(strResult);
   		access_token = (String) jsonResult.get(returnName);
   	}
   	return access_token;
   }
   
   /**
    * 通过Post方式发起请求，获取数据
    * @param url   请求路径
    * @param postData   post数据      数据格式未json   例如：String qrcode = "{\"expire_seconds\": 1800, \"action_name\": \"QR_SCENE\", \"action_info\": {\"scene\": {\"scene_id\":"+courseId+"}}}";
    * @param returnName  截获返回结果中的数据
    * @return ticket
    * @throws ParseException
    * @throws IOException
    */
   public static String doPostStr(String url,String postData,String returnName) throws ParseException, IOException {
   	DefaultHttpClient client = new DefaultHttpClient();
   	HttpPost request = new HttpPost(url);
   	HttpEntity entity = new StringEntity(postData, "UTF-8");  
   	request.setEntity(entity);  
   	HttpResponse response = client.execute(request);
   	String ticket = "";
   	if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
   		String strResult = EntityUtils.toString(response.getEntity());
   		System.out.println(strResult);
   		JSONObject jsonResult = JSONObject.parseObject(strResult);
   		ticket = (String) jsonResult.get(returnName);
   	}
   	return ticket;
   }
	   
	   
   /**
     * 根据学生id查询轮训科室和所在小组
     * @param openid
     * @param clientsxh
     * @return
     */
    public static JxLunxunEntity getStudentsLunxunInfo(String usernumber,String time){
    	JxLunxunEntity entity = null;
    	try {
    		JxClassStudentsSqlWhere cssqlWhere = new JxClassStudentsSqlWhere();
    		cssqlWhere.setRemark2(usernumber);
    		List<JxClassStudentsEntity> classlist = jxClassStudentsService.selectListJxClassStudentsBySqlWhere(cssqlWhere);
    		String zuid = classlist.size()>0?classlist.get(0).getZuid():"9999999";
    		JxLunxunSqlWhere lxsqlwhere  = new JxLunxunSqlWhere();
    		lxsqlwhere.setZuid(zuid);;
    		lxsqlwhere.setOperatedate(time);
    		List<JxLunxunEntity> lxlist = jxLunxunService.selectListJxLunxunBySqlWhere(lxsqlwhere);
    		entity = lxlist.size()>0?lxlist.get(0):null;
		} catch (Exception e) {
			e.printStackTrace();
		}
        return entity;
    }
    
    public static String getFrmsysTypeGjz(String gjz){
    	String value = "";
    	try {
    		FrmSysparaTypeKey key = new FrmSysparaTypeKey();
    		key.setXtlb("00");
    		key.setGjz(gjz);
			FrmSysparaTypeEntity entity = frmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(key);
			value = entity.getMrz();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return value;
    }

	public IJxLunxunService getJxLunxunService() {
		return jxLunxunService;
	}

	public void setJxLunxunService(IJxLunxunService jxLunxunService) {
		this.jxLunxunService = jxLunxunService;
	}

	public IJxClassStudentsService getJxClassStudentsService() {
		return jxClassStudentsService;
	}

	public void setJxClassStudentsService(
			IJxClassStudentsService jxClassStudentsService) {
		this.jxClassStudentsService = jxClassStudentsService;
	}

	public IFrmZlExlogService getFrmZlExlogService() {
		return frmZlExlogService;
	}

	public void setFrmZlExlogService(IFrmZlExlogService frmZlExlogService) {
		this.frmZlExlogService = frmZlExlogService;
	}

	public ProcessResultImpl getProcessResultImpl() {
		return processResultImpl;
	}

	public void setProcessResultImpl(ProcessResultImpl processResultImpl) {
		this.processResultImpl = processResultImpl;
	}

	public IFrmSysparaTypeService getFrmSysparaTypeService() {
		return frmSysparaTypeService;
	}

	public void setFrmSysparaTypeService(
			IFrmSysparaTypeService frmSysparaTypeService) {
		this.frmSysparaTypeService = frmSysparaTypeService;
	}
	
	
}
