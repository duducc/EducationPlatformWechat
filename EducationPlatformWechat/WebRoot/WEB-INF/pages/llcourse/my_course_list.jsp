<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>我的课程</title>
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
		<input type="hidden" id="usernumber" name="usernumber" value="${usernumber }"/>
		<input type="hidden" id="type" name="type" value="${type }"/>
		<input type="hidden" id="openId" name="openId" value="${openId }"/>
		<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
		<input type="hidden" id="remarks3" name="remarks3"/>
   		<div class="main_tabstyle" style="margin:5px 5px 5px;"> 
	   		<input value="" placeholder="请输入课程名称" class="form-control" name="courseName" id="courseName" type="text">
	   		<select class="form-control" style="margin-top: 5px;width: 50%;" name="year" id="year">
           	</select>
	   		<button type="button" class="btn btn-primary disabled" id="findBtn" style="float:right;height:40px;margin-top: 5px;width: 48%; " onclick="getDataList();">查询</button>  
   		</div>
    	<div style="margin:10px 10px 10px;height: 80%;overflow-y:auto;" id="task_div"></div>
	</div>
	<!---------------------------------------------------------- 底部菜单-------------------------------------------------------->
	<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
		<div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 80%;margin-left: 10%;">
	      	<a onclick="closeBtn();" href="javascript:;" class="weui_btn weui_btn_warn">关闭</a>
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
 		//------------------------------设置年份的选择------------------------------------- 
		var myDate= new Date(); 
		var startYear=myDate.getFullYear();//起始年份 
		var endYear=myDate.getFullYear()-10;//结束年份 
		var obj=document.getElementById('year') 
		for (var i=endYear;i<=startYear;i++) { 
			obj.options.add(new Option(i,startYear-i)); 
		} 
		obj[obj.options.length-1].selected=true; 
		//----------------------------------结束--------------------------------------------
		getDataList();
 	});
 	
 	function getDataList(){
 		$("#task_div").html("");
 		var type = $("#type").val();
 		var courseName = $("#courseName").val();
 		var year = $('#year option:selected').text();//获取选择框年份
 		var usernumber = $("#usernumber").val();
 		$.ajax({
			url:"jxStudyregistra.do?method=getMycourseLictInfo&year="+year+"&courseName="+courseName+"&usernumber="+usernumber,
		  	cache: false,
		  	async: true,  
		  	type:'post',
		  	dataType:'json',
		  	success: function(data){
		  		var list = eval(data);
				for(var i=0;i<list.length;i++){
		  			var html="<div class='weui_cells weui_cells_access' id='"+list[i].courseId+","+list[i].isgrant+","+list[i].awardstate+","+list[i].remarks3+","+type+","+list[i].xh+"' onclick='editxwqs(this.id);'>";
		  				html+="<a class='weui_cell' href='javascript:;'>";
		  				html+="<div class='weui_cell_bd weui_cell_primary'>";
		  				html+="<p style='width: 85%'>"+list[i].courseName+"</p>";
		  				html+="</div>";
		  				if(type==0){
		  					if(list[i].isgrant==1){
			  					html+="<div class='weui_cell_ft' style='font-size:0.8em;'>已授分</div>";
			  				}else{
			  					if(list[i].remarks3==0){
			  						html+="<div class='weui_cell_ft' style='font-size:0.8em;'>未上报</div>";
			  					}else if(list[i].remarks3==1){
			  						html+="<div class='weui_cell_ft' style='font-size:0.8em;'>已上报</div>";
			  					}else{
			  						html+="<div class='weui_cell_ft' style='font-size:0.8em;'>未知状态</div>";
			  					}
			  				}
		  				}else{
		  					if(list[i].remarks3==0||list[i].remarks3==null||list[i].remarks3==""){
		  						html+="<div class='weui_cell_ft' style='font-size:0.8em;'>点击进行登记反馈</div>";
		  					}else if(list[i].remarks3==1){
		  						html+="<div class='weui_cell_ft' style='font-size:0.8em;'>已反馈</div>";
		  					}
		  				}
		  				
		  				html+="</a></div>";
		  				$("#task_div").append(html);
		  		}
		    },
		}); 
 	}
 	
 	function editxwqs(value){
 		var openId = $("#openId").val();
 		var clientsxh = $("#clientsxh").val();
 		var strs = new Array(); //定义一数组 
 		strs = value.split(","); //字符分割 
 		var courseId = strs[0];
 		var isgrant = strs[1];
 		var awardstate = strs[2];
 		var remarks3 = strs[3];
 		var type = strs[4];
 		var xh = strs[5];
 	    var usernumber = $("#usernumber").val(); 
 	    if(type=="0"){
		    window.location.href="jxStudyregistra.do?method=selectXfCourseByPrimaryKey&courseId="+courseId+"&isgrant="+isgrant+"&awardstate="+awardstate+"&remarks3="+remarks3+"&openId="+openId+"&clientsxh="+clientsxh+"&xh="+xh; 
 	    }else if(type=="1"){
 	    	if(remarks3=="1"){
 	    		$.alert("该课题已反馈！","提示");
 	    		return;
 	    	}else{
	 	    	window.location.href="jxQuestionnaireTest.do?method=toSogumpSurvey&courseId="+courseId+"&usernumber="+usernumber+"&xh="+xh+"&openId="+openId+"&clientsxh="+clientsxh;
 	    	}
 	    }
	}
 	
 	function closeBtn(){
 		WeixinJSBridge.call('closeWindow');
 	}
 </script>
</html>
