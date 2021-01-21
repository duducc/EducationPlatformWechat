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
	<!-- 教学查房 -->
    <title></title>
    <meta charset="GBK">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
  	<link rel="stylesheet" type="text/css" href="layuis/css/common_main.css"/>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/example.css">  
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
    <script src="js/jquery.1.7.2.min.js"></script>
    <script src="js/jweixin-1.0.0.js"></script>
    <script src="layui/layui.all.js" charset="utf-8"></script>
    <script type="text/javascript" src="js/common/translation.js"></script><!--字段翻译  -->
    <script src="js/jquery-weui.js"></script>
	<script src="js/umgo-picker.js"></script>
    <style type="text/css">
		.layui-input{
			height:28px;
		}
    </style>
</head>
<body style="height: 98%;">
	<div class="frist_div">
		<form class ="layui-form" >
			<div class="search" id = "search" style="margin-top: 5px;height: 60px;">
				<div class="layui-input-inline"  style="margin-left: 10px;">
					<div style="float: left;width: 27%;"><span style="height: 30px;line-height: 30px;">科室：</span></div>
					<div class="layui-inline" style="float: left;width:70%;height: 30px;line-height: 30px;">
						<select id="depart" name="depart" style="width: 60%;float: left;height: 30px;">
	                    	<option value="">请选择部门</option>
	                    	<c:forEach items="${deplist }" var="dept">
	                    		<option value="${dept.glbm }">${dept.bmmc}</option>
	                    	</c:forEach>
	                	</select>
			  		</div>
		  		</div>
		  		<div class="layui-input-inline"  style="margin-left: 10px;margin-top: 3px;">
					<div style="float: left;width: 27%;"><span style="height: 28px;line-height: 30px;">人员姓名：</span></div>
					<div class="layui-inline" style="float: left;width:70%;height: 30px;line-height: 30px;">
			    		<input class="layui-input" name="userName" id="userName" autocomplete="off" style="width: 60%;float: left;height: 30px;">
			    		<button class="layui-btn layui-btn-sm" type='button' onclick="getListData();" style="width: 39%;float: left;"><i class="layui-icon">&#xe615;</i>查询</button>
			  		</div>
		  		</div>
			</div>
		</form>
		<div id="data-list" class="search_result">
			<table class="layui-hide" id="listdata" lay-filter="listdata"></table>
		</div>
		<div id="pages"></div>
	</div>
</body>
<!--js类库-->
<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-xs layui-btn-xs" lay-event="confirm">点击添加</a>
</script>
<script>
	$(function(){
		getListData();
	});
	
	layui.use('form', function(){
	  	var form = layui.form;
	  	form.render();
	});
	function confirm(data){
		parent.closeQueryLayer(data);
	}
	function getListData(){
		//人员姓名
		var depart = $("#depart").val();
		var userName = $("input#userName").val();
		// 部门编号
		var table = ""; 
		layui.use('table', function(){
			var height= $("body").height() - ($("#search").height() + 20);
			var rows =Math.floor((height-160)/30);
		    table = layui.table;
		    table.render({
		        elem: '#listdata',
		        height:height,
		        url:'xfemployee.do?method=getListPageToLayui&Name='+userName+'&deptid='+depart,
		        cellMinWidth: 100,
		        page:{elem:'pages',layout: ['count','prev','page','next','limit']},
		        cols: [[
		            {field:'usernumber', title: '教师工号',width:'30%'},
		            {field:'username', title: '教师姓名',width:'30%'},
		            {field:'obt', title: '操作', width:'40%', align:'center', toolbar: '#barDemo'}
		      	]],
		      	limit:rows,
			    limits:[rows,rows*2,rows*4,rows*6],
			    page: true
		  	});
		});
		
		table.on('tool(listdata)', function(obj){
	    	var data = obj.data;
	    	if(obj.event === 'confirm'){
	    		confirm(data);
	    	}
		});
	}
</script>
</html>
