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
<body style="height: 100%;">
	<div class="frist_div">
		<form class ="layui-form" >
			<div class="search" id = "search" style="margin-top: 5px;height: 58px;">
				<div class="layui-input-inline"  style="margin-left: 10px;">
					<select class="weui_input" name="classid" id="classid">
		           		<option value="">请选择班级查询</option>
		           		<c:forEach items="${list }" var="list">
		           			<option value="${list.xh }">${list.name }</option>
		           		</c:forEach>
		           	</select>
					<div class="layui-inline" style="float: left;width:100%;height: 28px;line-height: 30px;margin-top: 5px;">
			    		<input class="layui-input" name="userName" id="userName" autocomplete="off" style="width: 65%;float: left;height: 30px;"  placeholder="输入姓名查询">
			    		<button class="layui-btn layui-btn-sm" type='button' onclick="getListData();" style="width: 35%;float: left;"><i class="layui-icon">&#xe615;</i>查询</button>
			    		<input type="hidden" id="classid" name="classid" value="${classid }"/>
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
		parent.closeQueryLayerStu(data);
	}
	function getListData(){
		//人员姓名
		var userName = $("#userName").val();
		var classid = $("#classid").val();
		// 部门编号
		var table = ""; 
		layui.use('table', function(){
			var height= $("body").height() - ($("#search").height() + 20);
			var rows =Math.floor((height-160)/30);
		    table = layui.table;
		    table.render({
		        elem: '#listdata',
		        height:height,
		        url:'jxStudents.do?method=getListPageJxStudents&name='+userName+'&classid='+classid,
		        cellMinWidth: 100,
		        page:{elem:'pages',layout: ['count','prev','page','next','limit']},
		        cols: [[
		            {field:'name', title: '用户姓名',width:'30%'},
		            {field:'professionalclass', title: '所在班级',width:'40%'},
		            {field:'obt', title: '操作', width:'30%', align:'center', toolbar: '#barDemo'}
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
