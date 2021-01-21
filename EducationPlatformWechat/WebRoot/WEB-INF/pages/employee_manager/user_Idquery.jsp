<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK"%>
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
    <title>账号查询</title>
    <meta charset="GBK">
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
	<link rel="stylesheet" type="text/css" href="css/loading.css"/>
	<script src="js/mobiscroll.js" type="text/javascript"></script>
	<script src="js/mobiscroll_003.js" type="text/javascript"></script>
	<script src="js/mobiscroll_005.js" type="text/javascript"></script>
	<link href="css/mobiscroll_003.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="js/date.js" ></script>
	<script type="text/javascript" src="js/iscroll.js" ></script>
	<style type="text/css">
		.weui_cell {
			padding:15px 5px;
			margin-top: 0;
			float: left;
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
		#yhkzzy{
			height:50px;
			border: 1px solid #cccccc;
			width: 96%;
			margin-left: 2%;
			background-color: #4FC4F0;
		}
		.countdiv{
			margin-top:10px;
			height:200px;
			padding:20px; 
			border: 2px solid #cccccc;
			width: 96%;
			margin-left: 2%;
			background-color: #4FC4F0;
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
	<div class="weui_tab">
        <div class="main_tabstyle" style="margin:5px 5px 5px;"> 
	   		<input placeholder="请输入身份证号码" class="form-control" name="idcard" id="idcard" type="text" style="width: 100%;margin-top: 5px;">
	   		<input placeholder="请输入姓名" class="form-control" name="username" id="username" type="text" style="width: 60%;margin-top: 5px;">
	   		<button type="button" class="btn btn-primary disabled" id="findBtn" style="float:right;height:40px;margin-top: 5px;width: 39%; " onclick="findproject();">查询</button>  
   		</div>
        <div style="width: 96%;margin-left:2%; border: 1px solid #cccccc;background-color:#DCDDC0;padding:5px; ">
			<span style="color: red;font-size: 15px;">
				请输入身份证号或姓名全称查询！
			</span><br>
		</div>
		<div class='countdiv' style="display: none;height: 150px;text-align: center;font-size: 17px;color: #fff;" id="yhkzzy">
   			
   		</div>
        <div style="width: 100%;overflow-y:auto;height:420px;" id="countdivout">
        </div>
	</div>
</form>
<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
</body>
 <script type="text/javascript">
 	function findproject(){
		var idcard = $("#idcard").val();
		var username = $("#username").val();
		if(idcard==""&&username==""){
			$.alert("请输入检索条件！","提示");
			return;
		}
		document.getElementById("up_div").style.display = "block";
		 $.ajax({
		 	url: 'xfemployee.do?method=getuserInfoByidcard&idcard='+idcard+'&username='+username,
		  	cache: false,
		  	async: true,  
		  	type:'post',
		  	dataType:'json',
		  	success: function(data){
		  		$("#countdivout").html("");
		  		var list = data;
		  		if(list.length==0){
		  			document.getElementById("up_div").style.display = "none";
		  			document.getElementById("yhkzzy").style.display = "block";
		  			document.getElementById("yhkzzy").style.background="#FFAA25";
		  			document.getElementById("yhkzzy").innerHTML = "没有查到您的信息！";
		  		}else{
		  			document.getElementById("yhkzzy").style.display = "none";
		  			for(var i=0;i<list.length;i++){
			  			var html="<div class='countdiv'>";
			  				html+="<span style='font-size:18px; color: #fff;width: 80%;'>个人信息资料</span><br>";
			  				html+="<span style='font-size:15px; color: #fff'>医通卡号：</span><span style='font-size:15px; color: #fff'>"+list[i].usernumber+"</span><br>";
			  				html+="<span style='font-size:15px; color: #fff'>姓名：</span><span style='font-size:15px; color: #fff'>"+list[i].username+"</span><br>";
			  				html+="<span style='font-size:15px; color: #fff'>身份证号：</span><span style='font-size:15px; color: #fff'>"+list[i].idcard+"</span><br>";
			  				html+="<span style='font-size:15px; color: #fff'>联系电话：</span><span style='font-size:15px; color: #fff'>";
			  				if(list[i].usertel==""||list[i].usertel==undefined){
			  					html+="无"
			  				}else{
			  					html+=list[i].usertel;
			  				}
			  				html+="</span><br>";
			  				html+="<span style='font-size:15px; color: #fff'>所属医院：</span><span style='font-size:15px; color: #fff'>"+list[i].yiyuan+"</span><br>";
			  				$("#countdivout").append(html);
			  		}
		  			document.getElementById("up_div").style.display = "none";
		  		}
		    },
		}); 
	}
 </script>
</html>
