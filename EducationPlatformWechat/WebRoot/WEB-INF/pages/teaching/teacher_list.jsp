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
    <title>轮训科室</title>
    <meta charset="utf-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
    <script src="js/jquery.1.7.2.min.js"></script>
    <script src="js/jquery-weui.js"></script>
	<script src="js/umgo-picker.js"></script>
	<script type="text/javascript" src="js/json2.js"></script>
	<script type="text/javascript" src="jquery/highcharts.js"></script>
	
	<style type="text/css">
	td{
			algin:center;
			border: 1px solid #7d848d;
			font-size:1.0em;
			height:30px;
			color: #a7abae;
			}
	.c{
display:inline;
}
	</style>
</head>
<body >
	<input type="hidden" id = "clientsxh" value="${clientsxh}">
	<input type="hidden" id = "openid" value="${openid}">
	<p style="font-size: 1.0em;line-height: 15px;color: red;margin-top: 10px">&nbsp;&nbsp;&nbsp;&nbsp;提示：&nbsp;&nbsp;轮训结束后可对该科室老师进行评价</p>
	<br>
	 <c:forEach var="entity"   items="${list}">
        	 <div class='weui_cells weui_cells_access'  <c:if test="${entity.remark6==2 }">onclick="toStudentView('${entity.xh}','${entity.teacherid}')</c:if>">
  				<a class='weui_cell' href='javascript:;'>
  				<div class='weui_cell_bd weui_cell_primary'>
  				<p style='width: 70%'>${entity.remark1}</p>
  				</div>
  				<c:if test="${entity.remark6==1 }">
  				<div class='weui_cell_ft' style='font-size:0.8em;'><span style='color:green'>已评价</span></div>
				</c:if>
				<c:if test="${entity.remark6==2 }">
  				<div class='weui_cell_ft' style='font-size:0.8em;'><span style='color:green'>评价教师</span></div>
				</c:if>
				</a>
			</div>
		</c:forEach>
</body>
<script type="text/javascript">
   function toStudentView(xh,teacherid){
   	if(teacherid==""||teacherid==null){
   		layer.msg("暂未安排老师");
   		return;
   	}
   		var url = "jxEvaluateTeacher.do?method=toEvaluatePage2&xh="+xh+"&clientsxh="+$("#clientsxh").val()+"&openid="+$("#openid").val();
   		window.open(url,"toBonusMsg");
   		/* var width=$("body").width();
		var height=$("body").height();
	    layer.open({
		    type: 2 ,
		    title: '评价教师',
		    area: [width+'px', height+'px'],
		    shade: 0,
		    maxmin: false,
		    offset: 'rt',
		    content: url,
		    zIndex: layer.zIndex ,
		    success: function(layero){layer.setTop(layero)}
	    }); */
   }
</script>
<script src="layui/layui.all.js" charset="utf-8"></script>
</body>
</html>
