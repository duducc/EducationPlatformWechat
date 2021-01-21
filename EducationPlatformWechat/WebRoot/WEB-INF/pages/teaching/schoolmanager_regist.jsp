<%@ page language="java" pageEncoding="GBK"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="/codetag" prefix="code"%>
<%@ taglib uri="/printDep" prefix="dep"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>ѧУ������ע��</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script src="js/jquery.1.7.2.min.js"></script>
	<link rel="stylesheet" href="layui/css/layui.css"  media="all">
	<link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/demos.css">
	<style type="text/css">
		*{
			margin:0;
			padding:0;
		}
		.layui-form-switch {
		    height: 28px;
		    line-height: 28px;
		    min-width: 60px;
		    padding: 0 8px;
		    margin-top: 0px;
		    border-radius: 25px;
		}
		.layui-form-switch em {
		    font-size: 14px;
		}
		.layui-form-switch i {
		    top: 5px;
		}
		.layui-form-pane .layui-form-radio, .layui-form-pane .layui-form-switch {
		    margin-top: 0px;
		}
	</style>
  </head>
  <body>
    <form class="layui-form layui-form-pane" action="" style="width:100%; ">
    	<input type="hidden" id="openid" name="openid" value="${openid }"/>
		<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
		<input type="hidden" id="type" name="type" value="${type }"/>
		<input type="hidden" name="usernumber" id="usernumber" lay-verify="usernumber" value="${entity.usernumber}" >
		<input type="hidden" id="cardtype" name="cardtype" lay-verify="cardtype" value="9"/>
    	<!------------------------------------------------------��ͷ --------------------------------------------------------->
    	<div style="width: 100%;height: 80px;border-bottom: 0px solid #cccccc;background-color: #65B39D;">
			<div style="width: 25%;height: 80px;float: left;">
				<button style="width: 70px;height: 70px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;background-color: #65B39D" >
					<img src="images/boolean/qt.png" style="width: 70px;height: 70px;margin-left: 3px;" onclick="MillisecondToDate('-661000');">
				</button>
			</div>
			<div style="width: 45%;height: 80px;float: left;">
				<div style="width: 100%;margin-top: 26px;">
					<span style="color: #fff;font-size: 18px;"><b>������ע��</b></span><br>
					<span style="color: #fff;font-size: 15px;">��ɫѡ��Ϊ������</span>
				</div>
			</div>
		</div>
		<div style="overflow-y:auto;height: 85%;background-color: #fff;" id="mainCount_div">
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">��Ա������Ϣ</h2>
  					<div class="layui-colla-content layui-show">
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >����</label>
						    <div class="layui-input-inline">
						      <input value="${entity.username }" type="text" name="username" id="username" lay-verify="username" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >��ϵ�绰</label>
						    <div class="layui-input-inline">
						      <input value="${entity.usertel }" type="text" name="usertel" id="usertel" lay-verify="usertel" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >�Ա�</label>
						    <div class="layui-input-inline">
								<select name="sex" id="sex" lay-verify="sex">
								 	<code:printCode dmjc="XB" defaultValue="${entity.sex}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >���֤��</label>
						    <div class="layui-input-inline">
						      <input  value="${entity.idcard }" type="text" name="idcard" id="idcard" lay-verify="idcard" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
 					</div>
				</div>
			</div>
			<!--------------------------------------------------------ѧУ��Ϣ -------------------------------------------------------->
			<div class="layui-collapse" style="margin-top: 10px;margin-bottom: 20px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">ѧУ/�༶��Ϣ</h2>
  					<div class="layui-colla-content layui-show">
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >ѧУ����</label>
						    <div class="layui-input-inline">
						    	<select name="yiyuan" id="yiyuan" lay-verify="yiyuan" lay-filter="yiyuan">
								 	<code:printCode dmjc="SHXSCH" defaultValue="${entity.yiyuan}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div>
					    <div class="layui-form-item">
					    	<label class="layui-form-label" style="color: red;">ѧԺ��</label>
						    <div class="layui-input-inline">
						      	<select id="depart" name="depart" lay-verify="depart" lay-filter="depart">
								 	<code:printCode bShowDmz="false" dmjc="COLLEGE" defaultValue="${entity.depart }" type="1"/>
								</select>
						    </div>
						</div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >����רҵ</label>
						    <div class="layui-input-inline">
						      	<select name="zhuanye" id="zhuanye" lay-verify="zhuanye" lay-filter="zhuanye">
								 	<code:printCode dmjc="ZY" defaultValue="${entity.zhuanye}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div> 
						<div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;">�����꼶</label>
						    <div class="layui-input-inline">
								<input style="width: 50%;float: left;" value="${entity.useremail}" type="text" name="useremail" id="useremail" lay-verify="useremail" placeholder="YYYY" autocomplete="off" class="layui-input" readonly="readonly">
								<label class="layui-form-label" style="width: 49%;float: left;" >��</label>
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;">�༶</label>
						    <div class="layui-input-inline">
								<select id="userZyid" name="userZyid" lay-verify="lay-verify">
									
								</select>
						    </div>
					    </div>
 					</div>
				</div>
			</div>
		    <!--------------------------------------------------------������Ϣ -------------------------------------------------------->
		</div>
    	<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;margin-bottom: -5px;">
	    	<div style="margin-top: 5px;width: 100%;text-align: center;">
		     	<button name="bindingBtn" type="button" class="layui-btn" lay-submit="submit_baseinfo" lay-filter="submit_baseinfo"><i class="layui-icon">&#x1005;</i>�����ύ</button>
		     	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>�ر�</button>
	     	</div>
	  	</div>
    </form>
<script src="layui/layui.all.js" charset="utf-8"></script>
<script type="text/javascript">
	var height= $("body").height();
	var width= $("body").width();
	var form;
    function close_windos(){WeixinJSBridge.call('closeWindow')}
    $(function(){
    	getClass("","","");
    });
    layui.use(['form', 'layedit', 'laydate','upload'], function(){
		form = layui.form,
		layer = layui.layer,
		layedit = layui.layedit,
		laydate = layui.laydate,
		upload = layui.upload;
		form.on('select(yiyuan)', function(data){
			var zhuanye = $("#zhuanye").val();
			var useremail = $("#useremail").val();
			getClass(data.value,zhuanye,useremail);
		});
		form.on('select(zhuanye)', function(data){
			var yiyuan = $("#yiyuan").val();
			var useremail = $("#useremail").val();
			getClass(yiyuan,data.value,useremail);
		});
		//����
		laydate.render({elem: '#useremail',theme: 'molv',type: 'year',done: function(value, date, endDate){
			var yiyuan = $("#yiyuan").val();
			var zhuanye = $("#zhuanye").val();
		    getClass(yiyuan,zhuanye,value);
		}});
		form.render();
		//�Զ�����֤����
		form.verify({
			username: function(value){if(value==""||value==null){return '��������Ϊ�գ�'}},
			usertel: function(value){if(value==""||value==null){return '����д��ϵ��ʽ��'}},
			sex: function(value){if(value==""||value==null){return '��ѡ���Ա�'}},
			idcard: function(value){if(value==""||value==null){return '���������֤�ţ�'}},
			yiyuan: function(value){if(value==""||value==null){return '��ѡ��ѧУ��'}},
			depart: function(value){if(value==""||value==null){return '��ѡ������ѧԺ��'}},
			zhuanye: function(value){if(value==""||value==null){return '��ѡ����༶רҵ��'}},
			useremail: function(value){if(value==""||value==null){return '��ѡ����༶�꼶��'}},
			userZyid: function(value){if(value==""||value==null){return '��ѡ��������İ༶��'}},
		});
		form.on('submit(submit_baseinfo)', function(data){
	  	 	var type=$("#type").val();
	  	 	var taskinfo = JSON.stringify(data.field);
		  	var openid = $("#openid").val();
		  	var clientsxh = $("#clientsxh").val();
		  	var url ="xfemployee.do?method=insertXfEmployee";
		  	if(type==1){
		  		url = "xfemployee.do?method=updateJxStudents";
		  	}
			$.post(url,{applyInfo:encodeURI(taskinfo),openid:openid,clientsxh:clientsxh,type:'s'},function (data, status) {
		        if( status=="success" ){
		            var json = eval(data);
		            switch (json.errorMsg) {
		            	case "idcarderror":		//�ɹ�
			               layer.msg("���֤��������д��ȷ�����֤��", {icon: 5});
			               break;
			            case "idcardchongfu":		//�ɹ�
			               layer.msg("�����֤����ע���˺ţ�", {icon: 5});
			               break;
		                case "success":		//�ɹ�
			               layer.msg("ע��ɹ�", {icon: 1});
			               close_windos();
			               break;
			            case "updetesuccess":		//�޸ĳɹ�
			               layer.msg("�޸ĳɹ�", {icon: 1});
			               break;
		                case "failed":		//ʧ��
		                   layer.msg("ע��ʧ��", {icon: 2});
		                   break;
		                case "updatefailed":		//�޸�ʧ��
		                   layer.msg("�޸�ʧ��", {icon: 2});
		                   break;
		                case "error":		//�������쳣
		                   layer.msg("�������쳣���Ժ����ԣ�", {icon: 2}, {title: '����',offset: '100px'});
		                   break;
		            }
		        }else{
		            layer.msg("����ʧ�ܣ�", {icon: 2}, {title: '����'});
		        }
		    },"json");
			return false;
		});
	});
    
    function getClass(yiyuan,zhuanye,useremail){
		$("#userZyid").html("");
		$.ajax({
			url:"jxClassStudents.do?method=getListJxClass&deptid="+yiyuan+"&professtypeid="+zhuanye+"&grade="+useremail,
		  	cache: false,
		  	async: true,  
		  	type:'post',
		  	dataType:'json',
		  	success: function(data){
				var list = eval(data);
		  		var html = "";
		  		html +="<option value=''>��ѡ��</option>";
		  		for(var i=0;i<list.length;i++){
		  			html+="<option value='"+list[i].xh+"'>"+list[i].name+"</option>";
		  		}
		  		$("#userZyid").append(html);
				form.render();
		    },
		}); 
	}
</script>
</body>
</html>
