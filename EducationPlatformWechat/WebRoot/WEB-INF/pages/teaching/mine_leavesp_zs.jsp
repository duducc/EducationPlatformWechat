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
    <title></title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/demos.css">
    <link href="css/common.css" rel="stylesheet" type="text/css" />
    <link href="css/bootstrap.min.css" rel="stylesheet"> 
    <link rel="stylesheet" href="css/example.css"> 
	<script type="text/javascript" src="js/jquery-1.9.1.js" ></script>
	<script src="js/jquery.1.7.2.min.js"></script>
	<script src="js/mobiscroll_002.js" type="text/javascript"></script>
	<script src="js/mobiscroll_004.js" type="text/javascript"></script>
	<link href="css/mobiscroll_002.css" rel="stylesheet" type="text/css">
	<link href="css/mobiscroll.css" rel="stylesheet" type="text/css">
	<script src="js/mobiscroll.js" type="text/javascript"></script>
	<script src="js/mobiscroll_003.js" type="text/javascript"></script>
	<script src="js/mobiscroll_005.js" type="text/javascript"></script>
	<link href="css/mobiscroll_003.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="js/date.js" ></script>
	<script type="text/javascript" src="js/iscroll.js" ></script>
	<link rel="stylesheet" type="text/css" href="css/loading.css"/>
	<style type="text/css">
		.weui_cell {
			padding:15px 5px;
			margin-top: 0;
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
				<span style="font-size: 13px;">请稍后</span>
			</div>
		</div>
	</div>
	<!-- ---------------------------------------------------------------------------------------------- -->
<form method="get" id="from1">
<input type="hidden" id="openid" name="openid" value="${openid }"/>
<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
<div class="weui_tab">
    <!-- 内容 -->
    <!-- 标题 -->
    <div class="main_tabstyle" style="margin:5px 5px 5px;"> 
		<input value="" placeholder="请输入人员姓名" class="form-control" name="stuname" id="stuname" type="text">
		<select class="form-control" style="margin-top: 5px;width: 50%;" name="state" id="state" onchange="deptchange('');">
       		<option value="0">未审核</option>
       		<option value="1-1">已审核</option>
       	</select>
		<button type="button" class="btn btn-primary disabled" id="findBtn" style="float:right;height:40px;margin-top: 5px;width: 46%; " onclick="findproject();">查询</button>  
	</div>
    <div style="margin:10px 10px 10px;" id="task_div"></div>
</div>
</form>
<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
</body>
 <script type="text/javascript">
 	var height = document.documentElement.clientHeight;
	$(function(){
		findproject();
	});
 	function editxwqs(value){
	   window.location.href="jxstuleave.do?method=toMineLeavePage&xh="+value+"&sptype=1&openId="+$("#openId").val();
	};
	function findproject(){
		$("#task_div").html("");
		document.getElementById('up_div').style.display='block';
		var stuname = $("#stuname").val();
		var state = $("#state").val();
		if(state=='0'){
			state = '0';
		}else{
			state = '1-1,1-2,2-1,2-2';
		}
		var clientsxh = $("#clientsxh").val();
		var openid = $("#openid").val();
		$.ajax({
			url:"jxstuleave.do?method=getListJxStudentsLeave&stuname="+stuname+"&state="+state+"&openid="+openid+"&clientsxh="+clientsxh,
		  	cache: false,
		  	async: true,  
		  	type:'post',
		  	dataType:'json',
		  	success: function(data){
		  		var list = eval(data);
		  		if(list.length>0){
		  			for(var i=0;i<list.length;i++){
			  			var html="<div class='weui_cells weui_cells_access' id='"+list[i].xh+"' onclick='editxwqs(this.id);'>";
			  				html+="<a class='weui_cell' href='javascript:;'>";
			  				html+="<div class='weui_cell_bd weui_cell_primary'>";
			  				html+="<p style='width: 85%'>"+list[i].stuname+"</p>";
			  				html+="</div>";
				  			html+="<div class='weui_cell_ft' style='font-size:0.8em;'>"+list[i].leavedatestart.substring(0,10)+"</div>";
			  				html+="</a></div>";
			  				$("#task_div").append(html);
			  		}
		  		}else{
		  			var html="<div style='width:100%;height:100px;margin-top: 15px;text-align: center;line-height:100px; '>";
		  				html += "<span style='color:red;'>";
		  				html += "暂无数据";
		  				html += "</span>";
			  			html += "</div>";	
			  		$("#task_div").append(html);
		  		}
				document.getElementById('up_div').style.display='none';
		    },
		}); 
	}
 </script>
</html>
