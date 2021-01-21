<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
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
    <title>我的违纪</title>
    <meta charset="GBK">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <link href="css/common.css" rel="stylesheet" type="text/css" />
    <link href="css/bootstrap.min.css" rel="stylesheet"> 
    <link rel="stylesheet" href="css/example.css"> 
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
    <link rel="stylesheet" type="text/css" href="css/loading.css"/>
	<script type="text/javascript" src="js/jquery-1.9.1.js" ></script>
	<script type="text/javascript" src="js/date.js" ></script>
	<script type="text/javascript" src="js/iscroll.js" ></script>
	<script src="js/jquery-weui.js"></script>
	<script src="js/umgo-picker.js"></script>
	<script src="layui/layui.all.js" charset="utf-8"></script>
	<style type="text/css">
		.weui_cell {
			padding:15px 5px;
			margin-top: 0;
		}
		.weui_tab{
			 position:absolute; z-index:1;
		}
		.form-control{
			display: inline;
			width:100%;
			padding: 6px 12px;
			font-size: 16px;
			line-height: 1.42857143;
			color: #555;
			background-color: #fff;
			background-image: none;
			border: 1px solid #ccc;
			border-radius: 4px;
		}
	</style>
</head>
<body>
<!-- -----------------------------------------等待页面--------------------------------------------- -->
<div id="up_div" class="up_div">
	<div style="width: 100%;" id="bet_ondiv"></div>
	<div class="bet_div" id="bet_div">
		<div style="width: 100%;height: 10px;"></div>
		<div style="height: 70px;width: 60%;margin-left:20%;">
			<img src="images/loadingwx.gif" style="width: 100%;">
		</div>
		<div style="width: 100%;height: 5px;"></div>
		<div style="width: 100%;text-align: center;">
			<span style="font-size: 13px;">请稍候</span>
		</div>
	</div>
</div>
<!-- ---------------------------------------------------------------------------------------------- -->
<form method="post" id="uploadform" name="uploadform" action="" enctype="multipart/form-data" style="width: 100%;">
	<input type="hidden" id="userid" name="userid" value="${yhdh}"/>
	<div class="weui_tab">
    	<div class="weui_tab_bd" >
	        <div class="main_tabstyle" style="margin:5px 5px 5px;"> 
		   		<input value="" placeholder="请选择日期" class="form-control" name="opdate" id="opdate" type="text" readonly="readonly">
	           	<select  id="state" name="state" class="form-control" style="margin-top: 5px;width: 60%;">
				 	<option value="">请选择状态</option>
				 	<option value="1">科室已登记</option>
				 	<option value="2">科室已处理</option>
				 	<option value="3">科室上报至教学部</option>
				 	<option value="4">教学部已处理</option>
				 	<option value="5">已上报学校</option>
				</select>
		   		<button type="button" class="btn btn-primary disabled" id="findBtn" style="float:right;height:40px;margin-top: 5px;width: 38%; " onclick="findmywj();">查询</button>  
	   		</div>
        	<!-- 内容展现 -->
        	<div class="weui_cells weui_cells_form" style="border:1px solid #cccccc;height: 86%;overflow-y:auto;" id="task_div">
	            
        	</div>
	        <!---------------------------------------------------------- 底部菜单-------------------------------------------------------->
			<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
				<div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 82%;margin-left: 10%;">
			      	<a onclick="closeBtn();" href="javascript:;" class="weui_btn weui_btn_warn">关闭</a>
		    	</div>
			</div>
			<!---------------------------------------------------底部菜单 ----------------------------------------------------- -->
    	</div>
	</div>
</form>
</body>
<script type="text/javascript">
 	var height = document.documentElement.clientHeight;
 	
 	layui.use(['form', 'layedit', 'laydate'], function(){
		  var form = layui.form,
		  layer = layui.layer,
		  layedit = layui.layedit,
		  laydate = layui.laydate;
		  form.render();
		  //日期
		  laydate.render({elem: '#opdate'});
	});
 	
	$(function(){
		findmywj();
	});
	
	function findmywj(){
		$("#task_div").html("");
		document.getElementById('up_div').style.display='block';
		var opdate = $("#opdate").val();
		var state = $("#state").val();
		var userid = $("#userid").val();
		$.ajax({
			url:"jxBreakSchool.do?method=selectMinejxBreakSchool&opdate="+opdate+"&state="+state+"&userid="+userid,
		  	cache: false,
		  	async: true,  
		  	type:'post',
		  	dataType:'json',
		  	success: function(data){
		  		var list = eval(data);
				for(var i=0;i<list.length;i++){
					var state = "";
					if(list[i].state==1){
						state = "科室已登记";
					}else if(list[i].state==2){
						state = "科室已处理";
					}else if(list[i].state==3){
						state = "科室上报至教学部";
					}else if(list[i].state==4){
						state = "教学部已处理";
					}else if(list[i].state==5){
						state = "已上报至学校";
					}
		  			var html="<div class='weui_cells weui_cells_access' id='"+list[i].xh+"' onclick='editxwqs(this.id);'>";
		  				html+="<a class='weui_cell' href='javascript:;'>";
		  				html+="<div class='weui_cell_bd weui_cell_primary'>";
		  				html+="<p style='width: 85%'>"+state+"</p>";
		  				html+="</div>";
			  			html+="<div class='weui_cell_ft' style='font-size:0.8em;'>查看详情</div>";
		  				html+="</a></div>";
		  				$("#task_div").append(html);
		  		}
				document.getElementById('up_div').style.display='none';
		    },
		}); 
	}
	
	function editxwqs(value){
		var userid = $("#userid").val();
	    window.location.href="jxBreakSchool.do?method=toMinuteBreakSchoolPage&xh="+value+"&userid="+userid; 
	};
	
	function closeBtn(){
		WeixinJSBridge.call('closeWindow');
	}
 </script>
</html>
