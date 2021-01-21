<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<title>学分查询</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Easy Multiple Forms Widget Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<link rel="stylesheet" href="css/weui.css">
<link rel="stylesheet" href="css/jquery-weui.css">
<link rel="stylesheet" href="css/demos.css">
<link href="css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.9.1.js" ></script>
<script type="text/javascript" src="js/date.js" ></script>
<script type="text/javascript" src="js/iscroll.js" ></script>
<link href="css/ownCredit.css" rel="stylesheet" type="text/css" media="all" />
<style type="text/css">
	.weui_cell {
		padding:15px 5px;
		margin-top: 0;
		float: left;
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
	.wthree_leave_your_comments{
	margin:1.5em auto 0;
	padding:2em;
	background:#d0d0d0;
	border:5px solid #ACABAB;
	position: relative;
}
.wthree_leave_your_comments h3{
	color:#212121;
	font-size:1.5em;
	margin:0 0 1em;
}
.wthree_leave_your_commentls{
	float:left;
	width:48%;
}
.wthree_leave_your_commentrs{
	float:right;
	width:48%;
	
</style>
</head>
<body>
	<div class="main">
		<h1 style="color: green;">个人学分查询</h1>
		<div class="w3l_main_grids">
			<div class="wthree_leave_your_comment" style="height:50%;">
				<h3>个人资料总览</h3>
				<div class="wthree_leave_your_commentl">         
                    <table width="100%">
	                <tr><td>
	                    <div style=" float:left">
                            <label class="labelA">医通卡号：</label>
                            <label class="labelB"><span id="usernumber">&nbsp;&nbsp;${entity.xh}</span></label>
	                    </div>
	                </td></tr>
                      <tr><td>
	                    <div style=" float:left">
                            <label class="labelA">总学分：</label>
                            <label class="labelB"><span id="usernumber">&nbsp;&nbsp;&nbsp;&nbsp;100分</span></label>
	                    </div>
	                </td></tr>
	                 <tr><td>
	                    <div style=" float:left">
                            <label class="labelA">剩余学分：</label>
                            <label class="labelB"><span id="usernumber" style="color:green">&nbsp;${entity.xyfs}分</span></label>
	                    </div>
	                </td></tr>
                     </table>			
				</div>
			</div>
		  <div class="main_tabstyle" style="margin-top:5%;"> 
	   		  <select class="form-control" style="margin-top: 5px;width: 63%;height: 40px;" name="year" id="year" onchange="deptchange(this.value);">
           		    <option value = "">请选择</option>
           	  </select>
	   		  <button type="button" class="btn btn-primary disabled" id="findBtn" style="float:right;height:40px;margin-top: 5px;width: 34%; " onclick="findprojects();">查询</button>
   		  </div>
   		 <div id = "ysd_count" style="margin-top:1%;"> </div> 
			<div id="mycredit_div"></div>
		</div>
	<!-- <div class="weui_tabbar" style="position:fixed;z-index: 1000;background: #5B5B5B;">
		<div class="weui_in_tabbar">
		   <span id = "address">123</span>
		</div>
	</div> -->
	<div class="weui_tabbar" style="border-top:1px solid #cccccc; position:fixed;z-index: 1000;background: #5B5B5B;">
	    	<div style="margin-top: 5px;width: 100%;text-align: center;">
		     	<span id = "address"></span>
            </div>
	</div>
 </div>
</body>
<script type="text/javascript">
	$(function(){
		getyear();
		getMonth();
		findprojects();
	});
	
	
	function getyear(){
		var myDate = new Date();
		var year = myDate.getFullYear();
		$("#address").text("©"+year+"技术支持: 兰州盛腾信息技术有限公司");
	} 
	
	function getMonth(){
		var myDate = new Date();
		var year = myDate.getMonth()+1;
		var html = "";	
  		for(var i=1;i<13;i++){
  			if(i >=10){
  				html+="<option value="+i+">"+i+"</option>";
  			}else{
  				html+="<option value=0"+i+">0"+i+"</option>";
  			}
  		}
  		$("#year").append(html);
	}
	
	 //查询该实习生的加减分登记记录
	 function findprojects(value){
		value = $("#year").val();
		var usernumber = $("#usernumber").text();
		var html = "";
		$.ajax({
		 	url: 'xfCreditRecord.do?method=toSearchStudentGradeByStuid&usernumber='+usernumber+'&year='+value,
		  	cache: false,
		  	async: true,  
		  	type:'post',
		  	dataType:'json',
		  	success: function(data){
			  	if(data.length > 0){
			  		$("#ysd_count").text("");
			  		for(var i = 0;i<data.length;i++){
			  			html = "<div class='wthree_leave_your_comment' style='margin-top:1%;'>"+
			  			"<h3 name = 'yearmark'></h3>"+
			  			"<div class='wthree_leave_your_commentl'>"+
			  			"<table width='100%'>"+
			  			"<tr><td>"+
			  			"<div style=' float:left'>"+
			  			"<label class='labelA'>本次加减分分数：</label>"+
			  			"<label class='labelB'><span id='grade'>&nbsp;&nbsp;"+data[i].grade+"</span></label>"+
			  			"</div>"+
			  			"</td></tr>"+
			  			"<tr><td>"+
			  			"<div style='float:left'>"+
			  			"<label class='labelA'>本次加减分原因：</label>"+
			  			"<label class='labelB'><span id='jjsyy'>&nbsp;&nbsp;"+data[i].jjfyy+"</span></label>"+
			  			"</div>"+
			  			"</td></tr>"+
			  			"<tr><td>"+
			  			"<div style='float:left'>"+
			  			"<label class='labelA'>本次加减分时间：</label>"+
			  			"<label class='labelB'><span id='jjfsj'>&nbsp;&nbsp;"+data[i].jjfsj.substring(0,10)+"</span></label>"+
			  			"</div>"+
			  			"</td></tr>"+ 
			  			"</table>"+			
			  			"</div>"+
			  			"</div>";
			  			$("#ysd_count").append(html);
			  		}
			  	}else{
			  		$("#ysd_count").text("");
			  		html = "<div class='wthree_leave_your_comments' style='margin-top:1%;'>"+
		  			"<h3 style='text-align:center;color:red;line-height:70px;'>暂无加减学分记录</h3>"+
		  			"</div>";
		  			$("#ysd_count").append(html);
			  	}
			   var length = $("h3[name='yearmark']").length;
			   for(var k =0;k<length;k++){
				  if(value == null || value == ''){
					   document.getElementsByName("yearmark")[k].innerText = "第"+(k+1)+"次减分详情>>";
				  }else{
					  document.getElementsByName("yearmark")[k].innerText = value+"月第"+(k+1)+"次减分详情>>";
				  }
			   }
		     },
		});
	} 
	
	//onChange事件改变下拉选的值去查询符合年度条件的数据
	function deptchange(value){
		findprojects(value);
	}
	
	
</script>
</html>