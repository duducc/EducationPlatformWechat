<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

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
	height: 150px;
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
	height: 80px;
	margin-top: 20px;
}
.inupdiv{
	width: 100%;
	height: 40px;
}
</style>
<title>学员注册</title>
</head>
<body>
 <form action="">
	<input type="hidden" id="openid" value="${openId }"/>
	<input type="hidden" id="clientsxh" value="${clientsxh }"/>
	<input type="hidden" id="openionType" value="${openionType }"/>
	<div class="page_bd" style="width: 100%;height: 100%;" >
		<div class="outdiv">
			<div class="menudiv" style="width:50%;border-right:1px solid #009688;" onclick="toGraduateRegist();">
				<div class="inondiv"><i class="fa fa-book fa-fw fa-2x" style="margin-top: 15px;"></i></div>
				<div class="inupdiv">研究生</div>  
			</div>
			<div class="menudiv" style="width:49%;" onclick="toDoctorRegist();">
				<div class="inondiv"><i class="fa fa-money fa-fw fa-2x" style="margin-top: 15px;"></i></div>
				<div class="inupdiv">本科生</div>  
			</div>
		</div>
		<div class="outdiv" style="border-top: 0px;">
			<div class="menudiv" style="width:50%;border-right:1px solid #009688;" onclick="toTraineeRegist();">
				<div class="inondiv"><i class="fa fa-external-link fa-fw fa-2x" style="margin-top: 15px;"></i></div>
				<div class="inupdiv">实习生</div>  
			</div>
			<div class="menudiv" style="width:49%;" onclick="toJianxsRegist();">
				<div class="inondiv"><i class="fa fa-pencil-square-o fa-fw fa-2x" style="margin-top: 15px;"></i></div>
				<div class="inupdiv">见习生</div>  
			</div>
		</div>
	</div>
</form>
</body>

<script type="text/javascript">
	function toDoctorRegist(){
		var openid = $("#openid").val();
		var clientsxh = $("#clientsxh").val();
		var openionType = $("#openionType").val();
		/* window.location.href="xfemployee.do?method=toUserRegisterPageT&openid="+openid+"&clientsxh="+clientsxh+"&openionType="+openionType; */
		window.location.href="jxStudents.do?method=toundergraduatePage&openid="+openid+"&clientsxh="+clientsxh;
	}
	function toGraduateRegist(){
		var openid = $("#openid").val();
		var clientsxh = $("#clientsxh").val();
		var spath = "jxStudents.do?method=toGraduateRegistPage&openid="+openid+"&clientsxh="+clientsxh;
		window.open(spath,"toBonus");
	}
	function toSchoolManagerRegist(){
		var openid = $("#openid").val();
		var clientsxh = $("#clientsxh").val();
		var spath = "xfemployee.do?method=toSchoolManagerRegistPage&openid="+openid+"&clientsxh="+clientsxh;
		window.open(spath,"toSchoolManagerRegist");
	}
	function toTraineeRegist(){
		var openid = $("#openid").val();
		var clientsxh = $("#clientsxh").val();
		//var url = "jxStudents.do?method=toStudentRegistPage";
		var url = "jxStudents.do?method=toOperatorBooks";
		/* var spath = "jxStudents.do?method=toInternRegistPage&openid="+openid+"&clientsxh="+clientsxh; */
		var spath = url+"&openid="+openid+"&clientsxh="+clientsxh+"&pertype=2";
		window.open(spath,"toTraineeRegist");
	}
	function toJianxsRegist(){
		var openid = $("#openid").val();
		var clientsxh = $("#clientsxh").val();
		//var url = "jxStudents.do?method=toJxStudentRegistPage";
		var url = "jxStudents.do?method=toOperatorBooks";
		var spath = url+"&openid="+openid+"&clientsxh="+clientsxh+"&pertype=5";
		window.open(spath,"toJianxsRegist");
	}
</script>
</html>