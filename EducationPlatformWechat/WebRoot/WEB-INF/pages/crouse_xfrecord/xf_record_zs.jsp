<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>我的学分</title>
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
            <h1 class="demos-title">我的学分</h1>
        </header>
        <span style="margin-left: 15px;color: #8E8E8E;">共计学分：${scode }分</span>
        <span style="margin-left: 15px;color: #8E8E8E;">已授学分：${ysfscode}分</span>
    	<div>
	    	<c:if test="${size==0 }">
	    		<div style="text-align: center;border-top: 1px solid #DADADA;">
		    		<span style="font-size:25px;color: red;margin-top: 15px;">
		    			暂时没有您的记录
		    		</span>
	    		</div>
	    	</c:if>
 			<c:forEach items="${xflist }" var="p">
 				<div class="weui_cells weui_cells_access"  onclick="editxwqs('${p.courseid}')">
      				<a class="weui_cell" href="javascript:;">
          				<div class="weui_cell_bd weui_cell_primary" >
              				<p style="width: 85%">${p.coursesTask }</p>
          				</div>
          				<c:if test="${p.state==0 }">
          					<div class="weui_cell_ft" style="font-size:0.8em;">未授分</div>
          				</c:if>
         				<c:if test="${p.state==1 }">
          					<div class="weui_cell_ft" style="font-size:0.8em;">已授分</div>
          				</c:if>
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
 		
	   //window.location.href="xfCreditRecord.do?method=getMyxfInfo&courseid="+value+"&openid="+'${openid}'+"&clientsxh="+'${clientsxh}';
	   window.location.href="xfCreditRecord.do?method=getMyxfInfo&courseid="+value; 
	};
 </script>
</html>
