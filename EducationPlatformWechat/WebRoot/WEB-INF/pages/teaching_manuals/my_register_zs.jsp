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
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
    <link rel="stylesheet" type="text/css" href="css/loading.css"/>
    <script src="layui/layui.all.js" charset="utf-8"></script>
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
<body ontouchstart>
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
<input type="hidden" id="openId" name="openId" value="${bindinfo.openId }"/>
<input type="hidden" id="clientsxh" name="clientsxh" value="${bindinfo.clientsxh }"/>
<div class="weui_tab">
    <!-- 内容 -->
        <!-- 标题 -->
        <div class="main_tabstyle" style="margin:5px 5px 5px;"> 
	   		<input value="" placeholder="请输入带班教师名称" class="form-control" name="teacherName" id="teacherName" type="text" style="width: 40%;float: left;">
	   		<select class="form-control" style="margin-left:5px;width: 58%;" name="type" id="type">
           		<option value="">请选择类型</option>
           		<option value="1">教学查房登记</option>
           		<option value="2">操作记录登记</option>
           		<option value="3">病例讲解登记</option>
           		<option value="4">病例讨论登记</option>
           		<option value="5">讲座记录登记</option>
           	</select>
	   		<select class="form-control" style="margin-top: 5px;width: 40%;" name="deptid" id="deptid" onchange="deptchange('');">
           		<option value="">请选择科室</option>
           		<c:forEach items="${deptList }" var="yylist">
           			<option value="${yylist.glbm }">${yylist.bmmc }</option>
           		</c:forEach>
           	</select>
           	<input id="zttime" type="text" name="zttime" placeholder="请选择时间" autocomplete="off" class="form-control" style="width:30%;" readonly="readonly">
	   		<button type="button" class="btn btn-primary disabled" id="findBtn" style="float:right;height:40px;margin-top: 5px;width: 26%; " onclick="findproject();">查询</button>  
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
 	layui.use([ 'laydate'], function(){
		  laydate = layui.laydate;
		  laydate.render({elem: '#zttime',type: 'month',theme: 'molv'});
	});
	$(function(){
		findproject();
	});
 	function editxwqs(value){
 		var strs= new Array(); //定义一数组
		strs=value.split(","); //字符分割
		var xh = strs[0];
		var type = strs[1];
 		var openId = $("#openId").val();
 		var clientsxh = $("#clientsxh").val();
	    window.location.href="Jxteacherman.do?method=toMinuteTeachingManualsPage&xh="+xh+"&openId="+openId+"&clientsxh="+clientsxh+"&type="+type; 
	};
	function findproject(){
		$("#task_div").html("");
		var type = $("#type").val();
		var teacherName = $("#teacherName").val();
		var deptid = $("#deptid").val(); 
		var zttime = $("#zttime").val();
		var openId = $("#openId").val();
 		var clientsxh = $("#clientsxh").val();
		$.ajax({
			url:"Jxteacherman.do?method=getListJxTeachingManuals&teacherName="+teacherName+"&deptid="+deptid+"&zttime="+zttime+"&openId="+openId+"&clientsxh="+clientsxh+"&type="+type,
		  	cache: false,
		  	async: true,  
		  	type:'post',
		  	dataType:'json',
		  	success: function(data){
		  		var list = eval(data);
				for(var i=0;i<list.length;i++){
					var name = "";
					if(list[i].type=='1'){
						name = "教学查房 ";
					}else if(list[i].type=='2'){
						name = "操作记录";
					}else if(list[i].type=='3'){
						name = "病例讲解 ";
					}else if(list[i].type=='4'){
						name = "病例讨论 ";
					}else if(list[i].type=='5'){
						name = "讲座记录 ";
					}
		  			var html="<div class='weui_cells weui_cells_access' id='"+list[i].xh+","+list[i].type+"' onclick='editxwqs(this.id);'>";
		  				html+="<a class='weui_cell' href='javascript:;'>";
		  				html+="<div class='weui_cell_bd weui_cell_primary'>";
		  				html+="<p style='width: 85%'>"+list[i].jzCourse+"</p>";
		  				html+="</div>";
			  			html+="<div class='weui_cell_ft' style='font-size:0.8em;'>"+list[i].opemdate.substring(0,10)+"</div>";
		  				html+="</a></div>";
		  				$("#task_div").append(html);
		  		}
		    },
		}); 
	}
 </script>
</html>
