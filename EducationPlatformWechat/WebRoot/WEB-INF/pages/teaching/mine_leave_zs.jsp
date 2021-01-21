<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>我的请假信息</title>
    <meta charset="utf-8">
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
			width:80%;
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
	<div class="weui_tab">
		<header class='demos-header'>
	         <h1 class="demos-title">请假信息</h1>
	    </header>
    	<!-- 内容 -->
    	<input type="hidden" id="openId" name="openId" value="${bindinfo.openId }"/>
    	<input type="hidden" id="clientsxh" name="clientsxh" value="${bindinfo.clientsxh }"/>
    	<input type="hidden" id="yitongcode" name="yitongcode" value="${bindinfo.yitongCard }"/>
    	<c:if test="${size==0 }">
    		<header class='demos-header' style="border-top: solid 1px #BDBDBD;">
	            <h1 class="demos-title" style="color: red;font-size: 20px">暂无数据</h1>
	        </header>
    	</c:if>
    	<div style="margin:10px 10px 10px;">
 			<c:forEach items="${list }" var="p">
 				<div class="weui_cells weui_cells_access"  onclick="editxwqs('${p.xh},${p.remark1 }')">
      				<a class="weui_cell" href="javascript:;">
          				<div class="weui_cell_bd weui_cell_primary" >
              				<p style="width: 85%">${p.leavedatestart.substring(0,10) }
              					<c:if test="${p.remark1==1 }"><span style="font-size: 14px;">【考勤请假】</span></c:if>
              					<c:if test="${p.remark1==2 }"><span style="font-size: 14px;">【理论课请假】</span></c:if>
              				</p>
          				</div>
          				<div class="weui_cell_ft" style="font-size:0.8em;">
          					<c:if test="${p.state=='0' }">已提交申请</c:if>
          					<c:if test="${p.state=='9' }">已撤回</c:if>
          					<c:if test="${p.state=='1-1' }">科室审批通过</c:if>
          					<c:if test="${p.state=='1-2' }">科室审批不通过</c:if>
          					<c:if test="${p.state=='2-1' }">审批通过</c:if>
          					<c:if test="${p.state=='2-2' }">审批不通过</c:if>
          				</div>
     				</a>
  				</div>
 			</c:forEach>
 		</div>
	</div>
</form>
<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
</body>
 <script type="text/javascript">
 	function editxwqs(value){
 		var strs= new Array(); //定义一数组
 		strs=value.split(","); //字符分割
 		var xh = strs[0];
 		var type = strs[1];
 		if(type==1){
		   	window.location.href="jxstuleave.do?method=toMineLeavePage&xh="+xh; 
 		}else{
 			window.location.href="jxstuleave.do?method=toMineLeavePageorLlk&xh="+xh;
 		}
	};
 </script>
</html>
