<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>缴费记录</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <link href="css/common.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="js/jquery-1.9.1.js" ></script>
	<script type="text/javascript" src="js/date.js" ></script>
	<script type="text/javascript" src="js/iscroll.js" ></script>
	<style type="text/css">
		.weui_cell {
			padding:15px 5px;
			margin-top: 0;
		}
	</style>
</head>
<body ontouchstart>
<form method="get" id="from1">
<input type="hidden" id="openId" name="openId" value="${openid }"/>
<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
<div class="weui_tab">
    <!-- 内容 -->
        <!-- 标题 -->
        <header class='demos-header'>
            <h1 class="demos-title">缴费历史记录</h1>
        </header>
    	<div>
	    	<c:if test="${size==0 }">
	    		<div style="text-align: center;border-top: 1px solid #DADADA;">
		    		<span style="font-size:25px;color: red;margin-top: 15px;">
		    			暂时没有您的记录
		    		</span>
	    		</div>
	    	</c:if>
 			<div style="margin:10px 10px 10px;">
	 			<c:forEach items="${list }" var="p">
	 				<div class="weui_cells weui_cells_access"  onclick="editxwqs('${p.xh}')">
	      				<a class="weui_cell" href="javascript:;">
	          				<div class="weui_cell_bd weui_cell_primary" >
	              				<p style="width: 85%">
	              					<c:if test="${p.paymethod==1}">办卡缴费(金额：${p.paymoney })</c:if>
	              					<c:if test="${p.paymethod==2}">补卡缴费(金额：${p.paymoney })</c:if>
	              					<c:if test="${p.paymethod==3}">续费缴费(金额：${p.paymoney })</c:if>
	              				</p>
	          				</div>
	          				<div class="weui_cell_ft" >
	          					${p.paytime}
	          				</div>
	     				</a>
	  				</div>
	 			</c:forEach>			
 			</div>
 		</div>
</div>
</form>
<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
</body>
 <script type="text/javascript">
 	function editxwqs(value){
	   window.location.href="paymentManage.do?method=toPayHistoryPagexx&id="+value; 
	};
 </script>
</html>
