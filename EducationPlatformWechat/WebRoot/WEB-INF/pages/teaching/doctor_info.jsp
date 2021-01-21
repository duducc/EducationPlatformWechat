<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="GBK"%>
<jsp:directive.page import="com.saint.constant.Constant"/>
<%@ taglib uri="/codetag" prefix="code"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/printDep" prefix="dep"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>我的信息 </title>
    <meta charset="GBK">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/example.css">  
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
    <link rel="stylesheet" type="text/css" href="css/loading.css"/>
    <script src="js/jquery.1.7.2.min.js"></script>
    <script src="js/jweixin-1.0.0.js"></script>
    <script src="layui/layui.all.js" charset="utf-8"></script>
    <style type="text/css">
		.weui_tab{
			 position:absolute; z-index:1;
		}
		.layui-form-radio {
		    margin: 0 0 0 0;
		    padding-right: 0px;
		}
    </style>
</head>
<body>
<form class="layui-form layui-form-pane" action=""  id="mainform" method="post">
	<div class="weui_tab" style="width: 100%;">
    	<div class="weui_tab_bd">
   			<!-- 内容展现 -->
		   	<div style="overflow-y:auto;height: 100%;" id="mainCount_div">
		     	<div class="layui-form-item">
				    <label class="layui-form-label">工号</label>
				    <div class="layui-input-inline">
				      <input value="${entity.usernumber }" type="text" placeholder="空" readonly="readonly"  class="layui-input">
				    </div>
			    </div>
			    <div class="layui-form-item">
				    <label class="layui-form-label">姓名</label>
				    <div class="layui-input-inline">
				      <input value="${entity.username }" type="text" placeholder="空" readonly="readonly"  class="layui-input">
				    </div>
			    </div>
			    <div class="layui-form-item">
				    <label class="layui-form-label">性别</label>
				    <div class="layui-input-inline">
				        <select disabled="disabled" style="color: black;">
						 	<code:printCode bShowDmz="false" dmjc="XB" defaultValue="${entity.sex }" type="1"/>
						</select>
				    </div>
			    </div>
			    <div class="layui-form-item">
				    <label class="layui-form-label">科室</label>
				    <div class="layui-input-inline">
				      <input value="${dept}" type="text" placeholder="空" readonly="readonly"  class="layui-input">
				    </div>
			    </div>
			    <div class="layui-form-item">
				    <label class="layui-form-label">出生日期</label>
				    <div class="layui-input-inline">
				      <input value="${entity.shengri }" type="text" placeholder="空"  readonly="readonly"  class="layui-input">
				    </div>
			    </div>
			    <div class="layui-form-item">
				    <label class="layui-form-label">民族</label>
				    <div class="layui-input-inline">
				      	<select disabled="disabled" style="color: black;">
						 	<code:printCode bShowDmz="false" dmjc="MZ" defaultValue="${entity.minzu }" type="1"/>
						</select>
				    </div>
			    </div>
			    <div class="layui-form-item">
				    <label class="layui-form-label">身份证号</label>
				    <div class="layui-input-inline">
				      <input value="${entity.idcard }" type="text" placeholder="空"  readonly="readonly"  class="layui-input">
				    </div>
			    </div>
			    <div class="layui-form-item">
				    <label class="layui-form-label">专业</label>
				    <div class="layui-input-inline">
				      	<select disabled="disabled" style="color: black;">
						 	<code:printCode bShowDmz="false" dmjc="ZY" defaultValue="${entity.zhuanye }" type="1"/>
						</select>
				    </div>
			    </div>
			    <div class="layui-form-item">
				    <label class="layui-form-label">学历</label>
				    <div class="layui-input-inline">
				      	<select disabled="disabled" style="color: black;">
						 	<code:printCode bShowDmz="false" dmjc="XL" defaultValue="${entity.xueli }" type="1"/>
						</select>
				    </div>
			    </div>
			    <div class="layui-form-item">
				    <label class="layui-form-label">职称</label>
				    <div class="layui-input-inline">
				      	<select disabled="disabled" style="color: black;">
						 	<code:printCode bShowDmz="false" dmjc="ZC" defaultValue="${entity.zhicheng }" type="1"/>
						</select>
				    </div>
			    </div>
			    <div class="layui-form-item">
				    <label class="layui-form-label">职称级别</label>
				    <div class="layui-input-inline">
				      	<select disabled="disabled" style="color: red;">
						 	<code:printCode bShowDmz="false" dmjc="ZCJB" defaultValue="${entity.zhichenglv }" type="1"/>
						</select>
				    </div>
			    </div>
			    <div class="layui-form-item">
				    <label class="layui-form-label">电话</label>
				    <div class="layui-input-inline">
				      <input value="${entity.usertel }" type="text" placeholder="空"  readonly="readonly"  class="layui-input">
				    </div>
			    </div>
			    <div class="layui-form-item">
				    <label class="layui-form-label">邮箱</label>
				    <div class="layui-input-inline">
				      <input value="${entity.useremail }" type="text" placeholder="空"  readonly="readonly"  class="layui-input">
				    </div>
			    </div>
			    <div class="layui-form-item">
			    	<input type="hidden" id="temp_teachtype" value="${bindEntity.language}"/>
				    <input type="checkbox" value="21" lay-filter="teachtype" title="实习生">
				    <input type="checkbox" value="22" lay-filter="teachtype" title="本科生">
				    <input type="checkbox" value="23" lay-filter="teachtype" title="研究生">
				</div>
		    </div>
		    <div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
		    	<div style="margin-top: 5px;width: 100%;text-align: center;">
			     	<button name="bindingBtn" type="button" class="layui-btn" onclick="close_windos();"><i class="layui-icon">&#xe65c;</i>返回</button>
			     	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1006;</i>关闭</button>
		     	</div>
		  	</div>
		</div>
	</div>
</form>
<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script>
	var height= $("body").height();
	var width= $("body").width();
	document.getElementById("mainCount_div").style.height=height-40;
	function close_windos(){
		WeixinJSBridge.call('closeWindow');
	}
	
	layui.use(['form', 'layedit', 'laydate'], function(){
	  	var form = layui.form,
	  	layer = layui.layer,
	  	layedit = layui.layedit,
	  	laydate = layui.laydate;
	  	var teachtypes = $("#temp_teachtype").val();
		if( teachtypes.length > 0 ){
			var checks = teachtypes.split(',');
			var tempSelect = "input:checkbox[value='#']" ;
			for (i=0 ; i< checks.length ;i++ ) {
				$(tempSelect.replace('#',checks[i])).attr('checked','checked') ;
			}
		}
	  	form.render();
	});
</script>
</body>
</html>
