<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>我的带教手册</title>
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
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
	<script type="text/javascript" src="js/jquery-1.9.1.js" ></script>
	<script type="text/javascript" src="js/date.js" ></script>
	<script type="text/javascript" src="js/iscroll.js" ></script>
	<script src="layui/layui.all.js" charset="utf-8"></script>
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
	<form method="get" id="from1">
	<div class="weui_tab" style="width: 100%;">
		<input type="hidden" id="openid" name="openid" value="${openid }"/>
		<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
		<input type="hidden" id="type" name="type" value="${type }"/>
		<input type="hidden" id="deptid" name="deptid" value="${deptid }"/>
		<input type="hidden" id="stuid" name="stuid" value="${stuid }"/>
		<input type="hidden" id="manudm" name="manudm" value="${manudm }"/>
		<input type="hidden" id="lxxh" name="lxxh" value="${lxxh }"/>
		<div style="width: 100%;height: 80px;border-bottom: 0px solid #cccccc;background-color: #65B39D;">
			<div style="width: 23%;height: 80px;float: left;">
				<button style="width: 70px;height: 70px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;background-color: #65B39D;" >
					<img src="images/boolean/Viewdoc.png" style="width: 70px;height: 70px;margin-left: 3px;" onclick="MillisecondToDate('-661000');">
				</button>
			</div>
			<div style="width: 45%;height: 80px;float: left;">
				<div style="width: 100%;margin-top: 26px;">
					<span style="color: #fff;font-size: 18px;"><b>我的手册查询</b></span><br>
					<span style="color: #fff;font-size: 15px;">您可以按照月份进行查询</span>
				</div>
			</div>
			<div style="width: 30%;height: 80px;float: left;">
				<div style="width: 100%;margin-top: 30px;">
					<span style="color: #fff;font-size: 15px;float: right;margin-right: 10px;"></span>
				</div>
			</div>
		</div>
		<div class="weui_cells weui_cells_form" style="margin-top: 0px;">
			<div style="width: 100%;; height: 30px;border-bottom: 1px solid #cccccc;background-color:#DCDDC0; ">
				<span style="color: red;font-size: 14px;margin-left: 15px;"></span><br>
			</div>
	   	</div>
	    <div class="main_tabstyle" style="margin:5px 5px 5px;"> 
	   		<input placeholder="请选择日期" class="form-control" name="zttime" id="zttime" lay-verify="zttime" type="text" style="width: 60%;margin-top: 5px;" readonly="readonly">
	   		<button type="button" class="btn btn-primary disabled" id="findBtn" style="float:right;height:40px;margin-top: 5px;width: 39%; " onclick="getDataList();">查询</button>  
	  	</div>
    	<div style="margin:10px 10px 10px;height: 80%;overflow-y:auto;" id="task_div"></div>
	</div>
	<!---------------------------------------------------------- 底部菜单-------------------------------------------------------->
	<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
		<div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 80%;margin-left: 10%;">
	      	<button type="button" class="layui-btn btn-return" onclick="fanhui();"><i class="layui-icon">&#xe65c;</i>返回</button>
	      	<button type="button" class="layui-btn layui-btn-danger" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>关闭</button>
    	</div>
	</div>
	<!---------------------------------------------------底部菜单 ----------------------------------------------------- -->
	</form>
<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
</body>
 <script type="text/javascript">
 	$(function(){
		getDataList();
 	});
 	
 	layui.use(['form', 'laydate'], function(){
		  var form = layui.form,
		  laydate = layui.laydate;
		  //日期
		  laydate.render({elem: '#zttime',type: 'month',theme: 'molv'});
 	});
 	
 	function getDataList(){
 		$("#task_div").html("");
 		var openid = $("#openid").val();
  		var clientsxh = $("#clientsxh").val();
 		var type = $("#type").val();
 		var deptid = $("#deptid").val();
 		var stuid = $("#stuid").val();
 		var manudm = $("#manudm").val();
 		var zttime = $("#zttime").val();
 		var url = "";
 		if(type=='3'){
 			url = "jxTeachingDbl.do?method=getListJxTeachingManuals&type="+type+"&deptid="+deptid+"&stuid="+stuid+"&openid="+openid+"&clientsxh="+clientsxh+"&zttime="+zttime;
 		}else{
 			url = "Jxteacherman.do?method=getListJxTeachingManuals&type="+type+"&deptid="+deptid+"&stuid="+stuid+"&openid="+openid+"&clientsxh="+clientsxh+"&zttime="+zttime;
 		}
 		$.ajax({
			url:url,
		  	cache: false,
		  	async: true,  
		  	type:'post',
		  	dataType:'json',
		  	success: function(data){
		  		var list = eval(data);
		  		if(list.length==0){
		  			var html="<div style='height:200px;text-align: center;font-size: 15px;border:1px solid #D2D2D2;width:100%;color:#D2D2D2;'>";
	  				html += "无数据";
	  				html+="</div>";
	  				$("#task_div").append(html);
		  		}else{
					for(var i=0;i<list.length;i++){
			  			var html="<div class='weui_cells weui_cells_access' id='"+list[i].xh+"' onclick='editxwqs(this.id);'>";
			  				html+="<a class='weui_cell' href='javascript:;'>";
			  				html+="<div class='weui_cell_bd weui_cell_primary'>";
			  				html+="<p style='width: 85%'>"+manudm+"("+list[i].zttime.substring(0,10)+")</p>";
			  				html+="</div>";
			  				html+="<div class='weui_cell_ft' style='font-size:0.8em;'>点击查看/编辑</div>";
			  				html+="</a></div>";
			  				$("#task_div").append(html);
			  		}
		  		}
		    },
		}); 
 	}
 	
 	
 	function editxwqs(value){
 		var type = $("#type").val();
 		var deptid = $("#deptid").val();
 		var openid = $("#openid").val();
  		var clientsxh = $("#clientsxh").val();
 		var url = "Jxteacherman.do?method=addrkjyPage";
		var spath = url+"&openid="+openid+"&clientsxh="+clientsxh+"&xh="+value+"&opinion=0"+"&type="+type+"&deptid="+deptid;
		window.open(spath,"addteachingmanus");
	}
 	
 	function close_windos(){
 		WeixinJSBridge.call('closeWindow');
 	}
 	
 	function fanhui(){
  		var openid = $("#openid").val();
  		var clientsxh = $("#clientsxh").val();
  		var deptid = $("#deptid").val();
  		var lxxh = $("#lxxh").val();
  		var manudm = $("#manudm").val();
  		var url = "Jxteacherman.do?method=addrkjyPage";
		var spath = url+"&openid="+openid+"&clientsxh="+clientsxh+"&deptid="+deptid+"&lxxh="+lxxh+"&type="+manudm+"&opinion=1";
		window.open(spath,"addteachingmanuslist");
 	}
 </script>
</html>
