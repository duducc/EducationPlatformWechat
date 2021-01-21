<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

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
			width:70%;
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
<title>奖金列表</title>
</head>
<body  ontouchstart>
	<input type="hidden" id = "clientsxh" value="${clientsxh}">
	<input type="hidden" id = "openid" value="${openid}">
    <form method="get" id="from1">
		<div class="weui_tab">
	   		<div class="main_tabstyle" style="margin:5px 5px 5px;"> 
		   		<input value="" placeholder="请输入" class="form-control" name="proName" id="proName" type="text">
		   		<button type="button" class="btn btn-primary disabled" id="findBtn" style="float:right;height:40px;width: 28%; " onclick="getDataList();">查询</button>  
	   		</div>
	    	<div style="margin:10px 10px 10px;" id="task_div"></div>
		</div>
	</form>
            <c:forEach var="entity"   items="${list}">
        	 <div class='weui_cells weui_cells_access'  onclick="toBonus('${entity.xh}')">
  				<a class='weui_cell' href='javascript:;'>
  				<div class='weui_cell_bd weui_cell_primary'>
  				<p style='width: 70%'>${entity.title}</p>
  				</div>
  				<div class='weui_cell_ft' style='font-size:0.8em;'><span style='color:green'>查看详情</span></div>
				</a>
			</div>
		</c:forEach>
</body>
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script type="text/javascript">
	
function getDataList(){
    	var spath =  "kybonus.do?method=toBonus&name="+$("#proName").val()+"&clientsxh="+$("#clientsxh").val()+"&openid="+$("#openid").val();
		window.open(spath,"toBonus");
}
function toBonus(data){
	var spath = "kybonus.do?method=toBonusMsg&id="+data;
	window.open(spath,"toBonusMsg");
}
</script>
</html>