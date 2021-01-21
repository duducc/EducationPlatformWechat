<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>班长查询该班级下的课程</title>
    <meta charset="GBK">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
    <link rel="stylesheet" href="css/common.css">
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
		h2{
		    margin-top: 0px;
		    margin-bottom: 0px;
		}
		.ldiv{
			height: 35px;
			line-height:35px;
			text-align:center; 
			border: 1px solid #ccc;
			float: left;
			margin-top: 5px;
		}
		.idiv{
			height: 35px;
			border: 1px solid #ccc;
			border-left:0px;
			float: left;
			margin-top: 5px;
		}
		.indiv{
			height: 33px;width: 100%;border: 0px;
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
<form class="layui-form layui-form-pane" style="width: 100%;">
	<input type="hidden" id="openid" name="openid" value="${openid }"/>
	<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
	<input type="hidden" id="stuxh" name="stuxh" value="${stu.xh}"/>
	<div class="weui_tab" style="width: 100%;">
		<div style="width: 100%;height: 100px;border:1px solid #ccc;">
			<div style="width: 98%;margin-left: 0.5%;height: 50px;">
				<div style="width: 14%;" class="ldiv">学校</div>
				<div style="width: 35%;" class="idiv">
					<input type="text" class="indiv" value="${schoolname }" disabled="disabled"/>
				</div>
				<div style="width: 14%;margin-left: 5px;" class="ldiv">年级</div>
				<div style="width: 34%;" class="idiv">
					<input type="text" class="indiv" value="${stu.grade  }" disabled="disabled"/>
				</div>
			</div>
			<div style="width: 98%;margin-left: 0.5%;height: 50px;">
				<div style="width: 14%;" class="ldiv">专业</div>
				<div style="width: 84%;" class="idiv">
					<input type="text" class="indiv" value="${zhuanyename }" disabled="disabled"/>
				</div>
			</div>
		</div>
    	<div class="weui_tab_bd" >
	        <div class="main_tabstyle" style="margin:5px 5px 5px;"> 
		   		<input placeholder="请选择日期" value="${nowdate }" class="form-control" name="shkdate" id="shkdate" lay-verify="shkdate" type="text" style="width: 60%;" readonly="readonly">
		   		<button type="button" class="btn btn-primary disabled" id="findBtn" style="float:right;height:40px;width: 38%; " onclick="findproject();">查询</button>  
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
<script src="layui/layui.all.js" charset="utf-8"></script>
<script type="text/javascript">
    var height = document.documentElement.clientHeight;
	$(function(){
		findproject();
	});
	
	layui.use(['form', 'layedit', 'laydate','upload'], function(){
		var form = layui.form,
		layer = layui.layer,
		layedit = layui.layedit,
		laydate = layui.laydate,
		upload = layui.upload;
		laydate.render({elem: '#shkdate',theme: 'molv'});
		form.render();
	});
	
	function editxwqs(value){
		var openid = $("#openid").val();
		var clientsxh = $("#clientsxh").val();
	   //window.location.href="xfCreditRecord.do?method=getMyxfInfo&courseid="+value+"&openid="+'${openid}'+"&clientsxh="+'${clientsxh}';
	   window.location.href="JxCourseArrange.do?method=toJxCourseArrangeInfo&xh="+value+"&openid="+openid+"&clientsxh="+clientsxh; 
	};
	function findproject(){
		$("#task_div").html("");
		var shkdate = $("#shkdate").val();
		var stuxh = $("#stuxh").val();
		document.getElementById('up_div').style.display='block';
		$.ajax({
			url:"JxCourseArrange.do?method=findProjectbyBj&stuxh="+stuxh+"&shkdate="+shkdate,
		  	cache: false,
		  	async: true,  
		  	type:'post',
		  	dataType:'json',
		  	success: function(data){
		  		var list = eval(data);
				for(var i=0;i<list.length;i++){
		  			var html="<div class='weui_cells weui_cells_access' id='"+list[i].xh+"' onclick='editxwqs(this.id);'>";
		  				html+="<a class='weui_cell' href='javascript:;'>";
		  				html+="<div class='weui_cell_bd weui_cell_primary'>";
		  				html+="<p style='width: 85%'>"+list[i].rkjshname+"（"+list[i].skdate.substring(0,10)+"）</p>";
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
