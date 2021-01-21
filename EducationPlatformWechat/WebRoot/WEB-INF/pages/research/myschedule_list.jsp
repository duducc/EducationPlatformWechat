<%@ page language="java" contentType="text/html; charset=gbk" pageEncoding="gbk"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>项目个人列表</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <link href="css/common.css" rel="stylesheet" type="text/css" />
    <link href="css/bootstrap.min.css" rel="stylesheet"> 
    <link rel="stylesheet" href="css/example.css"> 
	<script type="text/javascript" src="js/jquery-1.9.1.js" ></script>
	<script type="text/javascript" src="js/date.js" ></script>
	<script type="text/javascript" src="js/iscroll.js" ></script>
	<style type="text/css">
		.weui_cell {
			padding:15px 5px;
			margin-top: 0;
		}
		.form-control{
			display: inline;
			width:70%;
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
<body ontouchstart>
	<form method="get" id="from1">
	<input type="hidden" id="userId" name="userId" value="${userId }"/>
	<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
	<input type="hidden" id="openid" name="openid" value="${openid }"/>
		<div class="weui_tab">
	   		<div class="main_tabstyle" style="margin:5px 5px 5px;"> 
		   		<input value="" placeholder="请输入项目名称" class="form-control" name="proName" id="proName" type="text">
		   		<button type="button" class="btn btn-primary disabled" id="findBtn" style="float:right;height:40px;width: 28%; " onclick="getDataList();">查询</button>  
	   		</div>
	    	<div style="margin:10px 10px 10px;" id="task_div"></div>
		</div>
	</form>
<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
</body>
<script type="text/javascript">
 	$(function(){
		getDataList();
	});
	
	function getDataList(){
		$("#task_div").html("");
		var proName = encodeURI(encodeURI($("#proName").val()));
		var clientsxh = $("#clientsxh").val();
		var openid = $("#openid").val();
		var userId = $("#userId").val();
		$.ajax({
			url:"kyProjectPlan.do?method=getMyRegistList&proname="+proName+"&clientsxh="+clientsxh+"&openid="+openid+"&userId="+userId,
		  	cache: false,
		  	async: true,  
		  	type:'post',
		  	dataType:'json',
		  	contentType : "application/x-www-form-urlencoded; charset=utf-8", 
		  	success: function(data){
		  		var list = eval(data);
				for(var i=0;i<list.length;i++){
					var regdate = list[i].regdate.substring(0,10);
		  			var html="<div class='weui_cells weui_cells_access' id='"+list[i].xh+"' onclick='toProject(this.id);'>";
		  				html+="<a class='weui_cell' href='javascript:;'>";
		  				html+="<div class='weui_cell_bd weui_cell_primary'>";
		  				html+="<nobr style='float:left;width: 55%;'>"+list[i].proname+"</nobr>";
		  				html+="<nobr style='width: 15%;'>"+regdate+"</nobr>";
		  				html+="</div>";
			  			html+="<div class='weui_cell_ft' style='font-size:0.8em;'>";
			  			html+="<span style='color:black'>查看详情</span>";
			  			html+="</div>";
		  				html+="</a></div>";
		  				$("#task_div").append(html);
		  		}
		    },
		}); 
	}
	
	function toProject(data){
		var userId = $("#userId").val();
		var spath = "kyProjectPlan.do?method=toProjectPlanMsg&prosequence="+data+"&userId="+userId;
		window.open(spath,"toProjectMsg");
	}
 </script>
</html>