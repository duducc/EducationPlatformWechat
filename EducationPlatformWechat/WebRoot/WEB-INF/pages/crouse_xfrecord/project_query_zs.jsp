<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta charset="GBK">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <link href="css/common.css" rel="stylesheet" type="text/css" />
    <link href="css/bootstrap.min.css" rel="stylesheet"> 
    <link rel="stylesheet" href="css/example.css"> 
    <link rel="stylesheet" type="text/css" href="css/loading.css"/>
	<script type="text/javascript" src="js/jquery-1.9.1.js" ></script>
	<script type="text/javascript" src="js/date.js" ></script>
	<script type="text/javascript" src="js/iscroll.js" ></script>
	<script src="js/jquery-weui.js"></script>
	<script src="js/umgo-picker.js"></script>
	<style type="text/css">
		.weui_cell {
			padding:15px 5px;
			margin-top: 0;
		}
		.weui_tab{
			 position:absolute; z-index:1;
		}
		.form-control{
			display: inline;
			width:100%;
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
<body>
<!-- -----------------------------------------等待页面--------------------------------------------- -->
<div id="up_div" class="up_div">
	<div style="width: 100%;" id="bet_ondiv"></div>
	<div class="bet_div" id="bet_div">
		<div style="width: 100%;height: 10px;"></div>
		<div style="height: 70px;width: 60%;margin-left:20%;">
			<img src="images/loadingwx.gif" style="width: 100%;">
		</div>
		<div style="width: 100%;height: 5px;"></div>
		<div style="width: 100%;text-align: center;">
			<span style="font-size: 13px;">请稍后</span>
		</div>
	</div>
</div>
<!-- ---------------------------------------------------------------------------------------------- -->
<form method="post" id="uploadform" name="uploadform" action="" enctype="multipart/form-data" style="width: 100%;">
	<input type="hidden" id="openid" name="openid" value="${openid }"/>
	<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
	<div class="weui_tab">
    	<div class="weui_tab_bd" >
	        <div class="main_tabstyle" style="margin:5px 5px 5px;"> 
		   		<input value="" placeholder="请输入项目名称" class="form-control" name="proName" id="proName" type="text">
		   		<select class="form-control" style="margin-top: 5px;width: 40%;" name="yiyuan" id="yiyuan" onchange="deptchange('');">
	           		<option value="00">请选择所在医院</option>
	           		<c:forEach items="${yiyuanList }" var="yylist">
	           			<option value="${yylist.glbm }">${yylist.bmmc }</option>
	           		</c:forEach>
	           	</select>
	           	<!-- <input style="width: 35%;" placeholder="项目举办年份" class="form-control"  name="begintime" id="begintime" type="text" onchange="changeStart(this.value);"> -->
		   		<select class="form-control" style="width: 35%;" name="begintime" id="begintime">
	           	</select>
		   		<button type="button" class="btn btn-primary disabled" id="findBtn" style="float:right;height:40px;margin-top: 5px;width: 22%; " onclick="findproject();">查询</button>  
	   		</div>
        	<!-- 内容展现 -->
        	<div class="weui_cells weui_cells_form" style="border:1px solid #cccccc;height: 86%;overflow-y:auto;" id="task_div">
	            
        	</div>
	        <!---------------------------------------------------------- 底部菜单-------------------------------------------------------->
			<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
				<div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 80%;margin-left: 10%;">
			      	<a onclick="closeBtn();" href="javascript:;" class="weui_btn weui_btn_warn">关闭</a>
		    	</div>
			</div>
			<!---------------------------------------------------底部菜单 ----------------------------------------------------- -->
    	</div>
	</div>
</form>
</body>
 <script type="text/javascript">
 var height = document.documentElement.clientHeight;
	$(function(){
		//------------------------------设置年份的选择------------------------------------- 
		var myDate= new Date(); 
		var startYear=myDate.getFullYear();//起始年份 
		var endYear=myDate.getFullYear()-10;//结束年份 
		var obj=document.getElementById('begintime') 
		for (var i=endYear;i<=startYear;i++) { 
			obj.options.add(new Option(i,startYear-i)); 
		} 
		obj[obj.options.length-1].selected=true; 
		//----------------------------------结束--------------------------------------------
		findproject();
	});
	function editxwqs(value){
		
	   //window.location.href="xfCreditRecord.do?method=getMyxfInfo&courseid="+value+"&openid="+'${openid}'+"&clientsxh="+'${clientsxh}';
	   window.location.href="xfProject.do?method=toMinuteProjectPage&proId="+value; 
	};
	function findproject(){
		$("#task_div").html("");
		document.getElementById('up_div').style.display='block';
		var proName = $("#proName").val();
		var options = $("#yiyuan option:selected"); 
		var yiyuan = options.text(); 
		if(yiyuan=="请选择所在医院"){
			yiyuan="";
		}
		var begintime = $('#begintime option:selected').text();
		/* window.location.href="xfProject.do?method=findProjectbyproName&proName="+proName+"&yiyuan="+yiyuan+"&begintime="+begintime; */
		$.ajax({
			url:"xfProject.do?method=findProjectbyproName&proName="+proName+"&yiyuan="+yiyuan+"&begintime="+begintime,
		  	cache: false,
		  	async: true,  
		  	type:'post',
		  	dataType:'json',
		  	success: function(data){
		  		var list = eval(data);
				for(var i=0;i<list.length;i++){
		  			var html="<div class='weui_cells weui_cells_access' id='"+list[i].proId+"' onclick='editxwqs(this.id);'>";
		  				html+="<a class='weui_cell' href='javascript:;'>";
		  				html+="<div class='weui_cell_bd weui_cell_primary'>";
		  				html+="<p style='width: 85%'>"+list[i].proName+"</p>";
		  				html+="</div>";
			  			html+="<div class='weui_cell_ft' style='font-size:0.8em;'>查看详情</div>";
		  				html+="</a></div>";
		  				$("#task_div").append(html);
		  		}
				document.getElementById('up_div').style.display='none';
		    },
		}); 
	}
	
	function closeBtn(){
		WeixinJSBridge.call('closeWindow');
	}
 </script>
</html>
