<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>带教手册菜单</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/layui.css" media="all">
	<link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/demos.css">
    <link rel="stylesheet" type="text/css" href="layuis/css/common_main.css"/>
    <style type="text/css">
    /* 
    	background-image: url('images/common_background1.png');
    	background-repeat:no-repeat; 
    	background-size:100% 100%;
    	-moz-background-size:100% 100%;
     */
    	.menudiv{
    		width: 100%;
    		height: 85px;
    		border-bottom: 1px solid #E0E0E0;
    		background-color: #F8F8F8;
    		/* background-image: url('images/appbackgrond.jpg'); */
    	}
    	.imagediv,.textdiv{
    		width: 20%;
    		margin-left:2%;
    		height: 75px;
    		margin-top:5px;
    		float: left;
    	}
    	.imagediv{
    		text-align: center;
    	}
    	.ondiv{
    		width: 98%;
    		height: 30px;
    		margin-top: 15px;
    	}
    	.updiv{
    		width: 98%;
    		height: 20px;
    	}
    	/* .weui_tab_bd{
    		background-image: url('images/appbackgrond.jpg');
	    	background-repeat:no-repeat; 
	    	background-size:100% 100%;
	    	-moz-background-size:100% 100%;
	    	
	    	6216618300013799170
	    	
    	} */
    </style>
  </head>
  <body>
  	<input type="hidden" id="openid" name="openid" value="${openid }"/>
	<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
	<input type="hidden" id="deptid" name="deptid" value="${deptid }"/>
	<input type="hidden" id="lxxh" name="lxxh" value="${lxxh }"/>
	<div class="weui_tab_bd">
        <!-- 内容展现 -->
        <c:forEach items="${list }" var="list">
        	<div class="menudiv" id="">
	        	<div class="imagediv" style="width: 16%;">
	        		<img  src="${list.manuImg }" style="width:80%;margin-top: 15%;">
	        	</div>
	        	<div class="textdiv" style="width: 44%;margin-left: 3px;">
	        		<div class="ondiv">
	        			<span style="font-size: 16px;color: #666;height: 30px;line-height: 30px;">
	        				<b>${list.manuName }</b>
	        			</span>
	        			<c:if test="${list.remark1>=list.manuShl}">
        					<img  src="images/finash.png" style="width:20px;">
        				</c:if>
        				<c:if test="${list.remark1<list.manuShl}">
        					<img  src="images/fail.png" style="width:20px;">
        				</c:if>
	        		</div>
	        		<div class="updiv">
	        			<span style="font-size: 13px;color: #747474;height: 20px;line-height: 20px;">
	        				应完成：${list.manuShl }&nbsp;&nbsp;&nbsp;
	        				已完成：${list.remark1}
	        			</span>
	        		</div>
	        	</div>
	        	<div class="textdiv" style="width: 33%;float: right;">
	        		<c:if test="${(list.manuDm!=1&&list.manuDm!=2)&&(rkjy==0||djzrs==0) }">
	        			<button type="button" class="layui-btn layui-btn-disabled" style="width: 44%;margin-top: 20px;">添加</button>
	        			<button type="button" class="layui-btn layui-btn-disabled" style="width: 44%;margin-top: 20px;">查看</button>
	        		</c:if>
	        		<c:if test="${(list.manuDm==1||list.manuDm==2)||(rkjy!=0&&djzrs!=0) }">
	        			<button name="bindingBtn" type="button" class="layui-btn btn-query" id="${list.manuDm },0" onclick="addteachingmanus(this.id);" style="width: 44%;margin-top: 20px;">添加</button>
	        			<button name="bindingBtn" type="button" class="layui-btn btn-newadd" id="${list.manuDm },1" onclick="addteachingmanus(this.id);" style="width: 44%;margin-top: 20px;">查看</button>
	        		</c:if>
	        	</div>
	        </div>
       	</c:forEach>
	</div>
    <script src="layui/layui.all.js" charset="utf-8"></script>
    <script src="js/jquery-2.1.4.js"></script>
  </body>
  <script type="text/javascript">
  	function addteachingmanus(value){
  		var strs= new Array(); //定义一数组
		strs=value.split(","); //字符分割
		var t = strs[1];
  		var openid = $("#openid").val();
  		var clientsxh = $("#clientsxh").val();
  		var deptid = $("#deptid").val();
  		var lxxh = $("#lxxh").val();
  		var url = "Jxteacherman.do?method=addrkjyPage";
		var spath = url+"&openid="+openid+"&clientsxh="+clientsxh+"&deptid="+deptid+"&lxxh="+lxxh+"&type="+strs[0]+"&opinion="+t;
		window.open(spath,"addteachingmanus");
  	}
  </script>
</html>
