<%@ page language="java" contentType="text/html; charset=gbk" pageEncoding="gbk"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>进度登记</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
	<script type="text/javascript" src="js/jquery-1.9.1.js" ></script>
	<style type="text/css">
		.title{width:35%; margin-top:5px; margin-bottom:0px; line-height:35px; text-align:right; float:left; border:1px #E6E6E6 solid; font-size:17px;}
		.conect{width:64%; margin-top:5px; margin-bottom:0px; line-height:35px; text-align:left; float:left; border:1px #E6E6E6 solid; border-left:none; font-size:17px;}
	</style>
</head>
<body style="margin:0;padding:0;">
	<%-- <input type="hidden" id="userId" name="userId" value="${userId }"/>
	<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
	<input type="hidden" id="openid" name="openid" value="${openid }"/> --%>
	<input type="hidden" id="proportion" name="proportion" value="${entity.proportion }"/>
	<input type="hidden" id="suball" name="suball" value="${entity.excuteusername }"/>
	<input type="hidden" id="suball" name="suball" value="${entity.excuteuserid }"/>
	<input type="hidden" id="suball" name="suball" value="${entity.prosequence }"/>
	<input type="hidden" id="suball" name="suball" value="${entity.xh }"/>
	<input type="hidden" id="suball" name="suball" value="${entity.taskgoal }"/>
	<input type="hidden" id="suball" name="suball" value="${suball }"/>
	
	<div style="float:left; width:90%; margin-left:5%;">
		<p class="title">人员姓名：</p><p class="conect">&nbsp;${entity.excuteusername }</p>
		<p class="title">人员编码：</p><p class="conect">&nbsp;${entity.excuteuserid }</p>
		<p class="title">项目编号：</p><p class="conect">&nbsp;${entity.prosequence }</p>
		<p class="title">任务序号：</p><p class="conect">&nbsp;${entity.xh }号</p>
		<p class="title">任务名称：</p><p class="conect">&nbsp;${entity.taskgoal }</p>
		<p class="title">项目占比：</p><p id="xmzbi" class="conect"><nobr id="jindt" style="position:absolute; z-index:-1; height:35px; float:left;background-color:#1AA094;"></nobr><nobr>&nbsp;${entity.proportion }%</nobr></p>
		<p class="title">开始时间：</p><p class="conect">&nbsp;${entity.taskstartdate.substring(0,10) }</p>
		<p class="title">结束时间：</p><p class="conect">&nbsp;${entity.taskenddate.substring(0,10) }</p>
		
		<p class="title" style="margin-top:15px; border-right:none;">完成比例：</p>
		<input id="wanchengbl" placeholder="请在此输入比例" style="width:50%; float:left; line-height:35px; padding:0; margin:0; font-size:17px; height:35px; margin-top:15px; border:1px #f00 solid;-webkit-appearance: none; border-radius:0;">
		<p class="conect" style="width:13%;margin-top:15px;">&nbsp;%</p>
		
		<p class="title" style="border-right:none;">任务描述：</p><p class="conect">&nbsp;</p>
		<textarea id="textedit" rows="" cols="" placeholder="请在此输入任务描述......" style="width:99%; margin-top:5px; height:80px; border:1px #f00 solid; -webkit-appearance: none; border-radius:0; line-height:30px; font-size:16px;"></textarea>
		
		<p class="title" onClick="submit_baseinfo();" style="text-align:center; background-color:#1AA094; color:#fff; border:none;">提交</p>
		<p class="title" style="text-align:center; float:right; background-color:#1AA094; color:#fff; border:none;">重置</p>
	</div>
	
</body>
<script type="text/javascript">
 	$(function(){
 		var pwidth =$("#xmzbi").width();
		$("#jindt").css("width",pwidth*$("#proportion").val()/100+"px");
		//getDataList();
	});
	var r = /^\+?[1-9][0-9]*$/;　　//判断是否为正整数 
	function submit_baseinfo(){
		if(!r.test($("#wanchengbl").val())){
			alert("比例不是数字！");
			return;
		}
		if(parseInt($("#suball").val())+parseInt($("#wanchengbl").val())>100){
			alert("比例已超过100%！");
			return;
		}
		if($("#textedit").val()==null||$("#textedit").val()==""){
			alert("任务描述不能为空！");
			return;
		}
		
		$.ajax({
		    type: 'post',
		    url: 'aaa/bbb.do',
		    contentType: 'application/json;charset=utf-8',
		    data: '{"progressdesc": , "proname": , "proproion": ,"prosequence": ,"regdate": ,"regperid": ,"regpername": ,"remark1": ,"subproportion": , "taskname": ,"tasknum": }',
		    success: function (data) { //返回json结果
		        alert(data);
		    }
		});
	}
	
	function getDataList(){
		$("#task_div").html("");
		var proName = encodeURI(encodeURI($("#proName").val()));
		var clientsxh = $("#clientsxh").val();
		var openid = $("#openid").val();
		var userId = $("#userId").val();
		$.ajax({
			url:"kyProjectPlan.do?method=getMyRegistList&proname="+proName+"&clientsxh="+clientsxh+"&openid="+openid+"&userId="+userId,
		  	cache: false,
		  	async: true,  
		  	type:'post',
		  	dataType:'json',
		  	contentType : "application/x-www-form-urlencoded; charset=utf-8", 
		  	success: function(data){
		  		var list = eval(data);
				for(var i=0;i<list.length;i++){
					var regdate = list[i].regdate.substring(0,10);
		  			var html="<div class='weui_cells weui_cells_access' id='"+list[i].xh+"' onclick='toProject(this.id);'>";
		  				html+="<a class='weui_cell' href='javascript:;'>";
		  				html+="<div class='weui_cell_bd weui_cell_primary'>";
		  				html+="<nobr style='float:left;width: 55%;'>"+list[i].proname+"</nobr>";
		  				html+="<nobr style='width: 15%;'>"+regdate+"</nobr>";
		  				html+="</div>";
			  			html+="<div class='weui_cell_ft' style='font-size:0.8em;'>";
			  			html+="<span style='color:black'>查看详情</span>";
			  			html+="</div>";
		  				html+="</a></div>";
		  				$("#task_div").append(html);
		  		}
		    },
		}); 
	}
	
	function toProject(data){
		var userId = $("#userId").val();
		var spath = "kyProjectPlan.do?method=toProjectPlanMsg&prosequence="+data+"&userId="+userId;
		window.open(spath,"toProjectMsg");
	}
 </script>
</html>