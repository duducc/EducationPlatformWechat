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
    
    <title>学校负责人注册</title>
    
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
    	<!------------------------------------------------------开头 --------------------------------------------------------->
    	<div style="width: 100%;height: 80px;border-bottom: 0px solid #cccccc;background-color: #65B39D;">
			<div style="width: 25%;height: 80px;float: left;">
				<button style="width: 70px;height: 70px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;background-color: #65B39D" >
					<img src="images/boolean/qt.png" style="width: 70px;height: 70px;margin-left: 3px;" onclick="MillisecondToDate('-661000');">
				</button>
			</div>
			<div style="width: 45%;height: 80px;float: left;">
				<div style="width: 100%;margin-top: 26px;">
					<span style="color: #fff;font-size: 18px;"><b>班主任注册</b></span><br>
					<span style="color: #fff;font-size: 15px;">红色选项为必填项</span>
				</div>
			</div>
		</div>
		<div style="overflow-y:auto;height: 85%;background-color: #fff;" id="mainCount_div">
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">人员基本信息</h2>
  					<div class="layui-colla-content layui-show">
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >姓名</label>
						    <div class="layui-input-inline">
						      <input value="${entity.username }" type="text" name="username" id="username" lay-verify="username" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >联系电话</label>
						    <div class="layui-input-inline">
						      <input value="${entity.usertel }" type="text" name="usertel" id="usertel" lay-verify="usertel" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >性别</label>
						    <div class="layui-input-inline">
								<select name="sex" id="sex" lay-verify="sex">
								 	<code:printCode dmjc="XB" defaultValue="${entity.sex}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >身份证号</label>
						    <div class="layui-input-inline">
						      <input  value="${entity.idcard }" type="text" name="idcard" id="idcard" lay-verify="idcard" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
 					</div>
				</div>
			</div>
			<!--------------------------------------------------------学校信息 -------------------------------------------------------->
			<div class="layui-collapse" style="margin-top: 10px;margin-bottom: 20px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">学校/班级信息</h2>
  					<div class="layui-colla-content layui-show">
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >学校名称</label>
						    <div class="layui-input-inline">
						    	<select name="yiyuan" id="yiyuan" lay-verify="yiyuan" lay-filter="yiyuan">
								 	<code:printCode dmjc="SHXSCH" defaultValue="${entity.yiyuan}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div>
					    <div class="layui-form-item">
					    	<label class="layui-form-label" style="color: red;">学院：</label>
						    <div class="layui-input-inline">
						      	<select id="depart" name="depart" lay-verify="depart" lay-filter="depart">
								 	<code:printCode bShowDmz="false" dmjc="COLLEGE" defaultValue="${entity.depart }" type="1"/>
								</select>
						    </div>
						</div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >负责专业</label>
						    <div class="layui-input-inline">
						      	<select name="zhuanye" id="zhuanye" lay-verify="zhuanye" lay-filter="zhuanye">
								 	<code:printCode dmjc="ZY" defaultValue="${entity.zhuanye}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div> 
						<div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;">负责年级</label>
						    <div class="layui-input-inline">
								<input style="width: 50%;float: left;" value="${entity.useremail}" type="text" name="useremail" id="useremail" lay-verify="useremail" placeholder="YYYY" autocomplete="off" class="layui-input" readonly="readonly">
								<label class="layui-form-label" style="width: 49%;float: left;" >级</label>
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;">班级</label>
						    <div class="layui-input-inline">
								<select id="userZyid" name="userZyid" lay-verify="lay-verify">
									
								</select>
						    </div>
					    </div>
 					</div>
				</div>
			</div>
		    <!--------------------------------------------------------其他信息 -------------------------------------------------------->
		</div>
    	<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;margin-bottom: -5px;">
	    	<div style="margin-top: 5px;width: 100%;text-align: center;">
		     	<button name="bindingBtn" type="button" class="layui-btn" lay-submit="submit_baseinfo" lay-filter="submit_baseinfo"><i class="layui-icon">&#x1005;</i>立即提交</button>
		     	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>关闭</button>
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
		//日期
		laydate.render({elem: '#useremail',theme: 'molv',type: 'year',done: function(value, date, endDate){
			var yiyuan = $("#yiyuan").val();
			var zhuanye = $("#zhuanye").val();
		    getClass(yiyuan,zhuanye,value);
		}});
		form.render();
		//自定义验证规则
		form.verify({
			username: function(value){if(value==""||value==null){return '姓名不能为空！'}},
			usertel: function(value){if(value==""||value==null){return '请填写联系方式！'}},
			sex: function(value){if(value==""||value==null){return '请选择性别！'}},
			idcard: function(value){if(value==""||value==null){return '请输入身份证号！'}},
			yiyuan: function(value){if(value==""||value==null){return '请选择学校！'}},
			depart: function(value){if(value==""||value==null){return '请选择所在学院！'}},
			zhuanye: function(value){if(value==""||value==null){return '请选择负责班级专业！'}},
			useremail: function(value){if(value==""||value==null){return '请选择负责班级年级！'}},
			userZyid: function(value){if(value==""||value==null){return '请选择所负责的班级！'}},
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
		            	case "idcarderror":		//成功
			               layer.msg("身份证错误，请填写正确的身份证！", {icon: 5});
			               break;
			            case "idcardchongfu":		//成功
			               layer.msg("该身份证号已注册账号！", {icon: 5});
			               break;
		                case "success":		//成功
			               layer.msg("注册成功", {icon: 1});
			               close_windos();
			               break;
			            case "updetesuccess":		//修改成功
			               layer.msg("修改成功", {icon: 1});
			               break;
		                case "failed":		//失败
		                   layer.msg("注册失败", {icon: 2});
		                   break;
		                case "updatefailed":		//修改失败
		                   layer.msg("修改失败", {icon: 2});
		                   break;
		                case "error":		//服务器异常
		                   layer.msg("服务器异常，稍后再试！", {icon: 2}, {title: '警告',offset: '100px'});
		                   break;
		            }
		        }else{
		            layer.msg("操作失败！", {icon: 2}, {title: '警告'});
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
		  		html +="<option value=''>请选择</option>";
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
