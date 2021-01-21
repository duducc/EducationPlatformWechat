<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<c:if test="${type==3 }">
			<header class='demos-header'>
	            <h1 class="demos-title">新办卡申请信息</h1>
	        </header>
        </c:if>
        <c:if test="${type==2 }">
			<header class='demos-header'>
	            <h1 class="demos-title">申请补卡信息</h1>
	        </header>
        </c:if>
        <c:if test="${type==1 }">
			<header class='demos-header'>
	            <h1 class="demos-title">申请信息变更信息</h1>
	        </header>
        </c:if>
    <!-- 内容 -->
    	<input type="hidden" id="type" name="type" value="${type }"/>
    	<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
    	<input type="hidden" id="openId" name="openId" value="${openId }"/>
    	<input type="hidden" id="yiyuan" name="yiyuan" value="${yiyuan}"/>
    	<c:if test="${size==0 }">
    		<header class='demos-header' style="border-top: solid 1px #BDBDBD;">
	            <h1 class="demos-title" style="color: red;font-size: 20px">暂无数据</h1>
	        </header>
    	</c:if>
    	<div style="margin:10px 10px 10px;">
 			<c:forEach items="${list }" var="p">
 				<div class="weui_cells weui_cells_access"  onclick="editxwqs('${p.xh}')">
      				<a class="weui_cell" href="javascript:;">
          				<div class="weui_cell_bd weui_cell_primary" >
              				<p style="width: 85%">${p.userxm }</p>
          				</div>
          				<div class="weui_cell_ft" style="font-size:0.8em;">查看详情</div>
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
 		var type = $("#type").val();
 		var clientsxh = $("#clientsxh").val();
 		var openId = $("#openId").val();
 		var yiyuan = $("#yiyuan").val();
	   	window.location.href="applyInfo.do?method=tonewcard_infoxx&id="+value+"&type="+type+"&yiyuan="+yiyuan
	   	+"&openId="+openId+"&clientsxh="+clientsxh; 
	};
 </script>
</html>
