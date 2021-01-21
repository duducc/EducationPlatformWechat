<%@ page language="java" pageEncoding="GBK"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="/codetag" prefix="code"%>
<%@ taglib uri="/printDep" prefix="dep"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>带教手册科室</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
<link rel="stylesheet" type="text/css" href="weiui/dist/style/weui.css" />
<link rel="stylesheet" type="text/css" href="weiui/dist/style/weui.min.css" />
<link rel="stylesheet" href="font-awesome-4.7.0/css/font-awesome.min.css">
<script type="text/javascript" src="weiui/dist/example/zepto.min.js"></script>
<script type="text/javascript" src="weiui/js/common.js"></script>
<script src="js/jquery.1.7.2.min.js"></script>
<style type="text/css">
	html, body{  
	    padding: 0;  
	    margin: 0;  
	    height: 100%;  
	    overflow:hidden;  
	}  
	a{
		text-decoration : none;
	}
	.outdiv{
		width:100%;
		border:1px solid #009688;
	}
	.menudiv{
		height:100%;
		float:left;
		text-align:center;
	}
	.fa-2x{
		font-size:4em;
	}
	.inondiv{
		width: 100%;
		height: 60px;
		margin-top: 20px;
	}
	.inupdiv{
		width: 100%;
		height: 60px;
	}
</style>
</head>
<body>
 <form action="">
	<input type="hidden" id="openid" value="${openid }"/>
	<input type="hidden" id="clientsxh" value="${clientsxh }"/>
	<div class="page_bd" style="width: 100%;height: 100%;" >
		<div class="outdiv">
			<c:forEach items="${erreylist }" var="s">
				<c:if test="${s.remark6==0 }">
					<div class="menudiv" style="width:32.5%;border:1px solid #009688;" id="${s.deptid },${s.xh },0,${s.num},${s.zuid}" onclick="toAddTeachingmanuals(this.id);">
						<div class="inondiv">
							<img src="images/menu/bmqx.png" style="width: 60px;">
						</div>
						<div class="inupdiv" style="color: #CCC;">
							${s.remark1 }<br>
							(${s.startdate.substring(0,10) })
						</div>  
					</div>
				</c:if>
				<c:if test="${s.remark6==1 }">
					<div class="menudiv" style="width:32.5%;border:1px solid #009688;" id="${s.deptid },${s.xh },1,${s.num},${s.zuid}" onclick="toAddTeachingmanuals(this.id);">
						<div class="inondiv">
							<img src="images/menu/kchbm.png" style="width: 60px;">
						</div>
						<div class="inupdiv" style="color: #84C1ff;">
							${s.remark1 }<br>
							(${s.startdate.substring(0,10) })
						</div>  
					</div>
				</c:if>
			</c:forEach>
		</div>
	</div>
</form>
</body>

<script type="text/javascript">
	function toAddTeachingmanuals(value){
		var strs= new Array(); //定义一数组
		strs=value.split(","); //字符分割
		if(strs[2]==0){
			alert("该科室还未开始轮训");
			return;
		}
		var openid = $("#openid").val();
		var clientsxh = $("#clientsxh").val();
		var deptid = strs[0];
		var lxxh = strs[1];
		var num = strs[3];
		var zuid = strs[4];
		var state = "0";
		$.ajax({  //获取使用的微信类别
			url:"Jxteacherman.do?method=getupdeptState&openid="+openid+"&clientsxh="+clientsxh+"&lxxh="+lxxh+"&num="+num+"&deptid="+deptid+"&zuid="+zuid,
			cache:false,
			type:'post',
			async: false,  
			dataType:'json',
			success:function(data){
				state = data;
			}
	    }); 
		if(state=="1"){
			alert("之前科室有未完成带教手册，请先完成！");
			return;
		}
		window.location.href="Jxteacherman.do?method=toAddTeachingmanuals&openid="+openid+"&clientsxh="+clientsxh+"&deptid="+deptid+"&lxxh="+lxxh;
		/* window.location.href="xfemployee.do?method=toUserRegisterPageT&openid="+openid+"&clientsxh="+clientsxh+"&openionType="+openionType; */
	}
	
</script>
</html>