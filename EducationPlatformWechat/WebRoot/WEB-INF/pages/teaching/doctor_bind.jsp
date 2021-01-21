<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>医务绑定</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script src="js/jquery.1.7.2.min.js"></script>
	<link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/layui.css" media="all">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
	<style type="text/css">
		*{
			margin:0;
			padding:0;
		}
	</style>

  </head>
  
  <body>
    <input type="hidden" id="openid" name="openid" value="${openid }"/>
	<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
    <form class="layui-form layui-form-pane" action="" style="width:93%; margin-left:3%; padding-top:20px;">
    	<div class="layui-form-item">
		    <label class="layui-form-label" >工号</label>
		    <div class="layui-input-inline">
		      <input type="text" name="yitongCard" lay-verify="yitongCard" id="yitongCard" placeholder="请输入" autocomplete="off" class="layui-input">
		    </div>
	    </div>
	    <div class="layui-form-item">
		    <label class="layui-form-label" >姓名</label>
		    <div class="layui-input-inline">
		      <input type="text" name="xm" lay-verify="xm" id="xm" placeholder="请输入" autocomplete="off" class="layui-input">
		    </div>
	    </div>
	    <div class="layui-form-item">
	    	<input type="hidden" id="teachtype" name = "teachtype"/>
		    <input type="checkbox" value="1" lay-filter="teachtype" title="实习生">
		    <input type="checkbox" value="2" lay-filter="teachtype" title="本科生">
		    <input type="checkbox" value="3" lay-filter="teachtype" title="研究生">
		</div>
	    
		<div class="layui-form-item">
	      <button class="weui_btn weui_btn_primary" lay-submit="submit_baseinfo" lay-filter="submit_baseinfo">立即提交</button>
	    </div>
	    
    </form>
    <script src="layui/layui.all.js" charset="utf-8"></script>
    <script type="text/javascript">
    layui.use(['form', 'layer','layedit'], function(){
		  var form = layui.form
		  ,layer = layui.layer
		  ,layedit = layui.layedit;
		  
		  //监听提交
		  form.on('submit(submit_baseinfo)', function(data){
		  	 	var taskinfo = JSON.stringify(data.field);
			  	var openid = $("#openid").val();
			  	var clientsxh = $("#clientsxh").val();
			  	var teachtype = $("#teachtype").val();
			  	var url ="wechatBind.do?method=bindDoctor";
			  	$.post(url,{taskinfo:encodeURI(taskinfo),openid:openid,clientsxh:clientsxh,teachtype:teachtype},function (data, status) {
		                  if( status=="success" ){
		                      var json = eval(data);
		                      switch (json.errorMsg) {
		                          case "success":		//成功
			                          layer.msg("绑定成功！", {icon: '1'}, function(index){
			                        	  WeixinJSBridge.call('closeWindow');
			                          });
		                          	  //window.location.href="wechatBind.do?method=toBindFinshPage";	
			                          break;
		                          case "noExist":		//修改失败
		                        	  layer.alert("您输入的信息不存在或不匹配！", {title: '提示信息'});
		                              break;
		                          case "error":		//服务器异常
		                              layer.alert("服务器异常，稍后再试！", {title: '警告'});
		                              break;
		                      }
		                  }else{
		                      layer.alert("操作失败！", {title: '警告'});
		                  }
		            },"json");
			    /* layer.alert(JSON.stringify(data.field), {
			      title: '最终的提交信息'
			    }) */
			    return false;
		  });
		  //自定义验证规则
		  form.verify({
		    yitongCard: function(value){
		      if(value.length == 0){
		        return '工号为必填项！';
		      }
		    }
		    ,xm: function(value){
		      if(value.length == 0){
		        return '姓名为必填项！';
		      }
		    }
		  });
		  form.render();
		  form.on('checkbox(teachtype)', function(data){
				$('#teachtype').val($('input[type=checkbox]:checked').map(function(){return this.value}).get().join(',')) ;
		  });
		});
    </script>
  </body>
</html>
