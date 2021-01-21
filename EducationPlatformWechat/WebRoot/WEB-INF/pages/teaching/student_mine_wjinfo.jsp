<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<title>违纪信息</title>
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
</style>
</head>
<body>
	<div class="main">
		<h1>个人违纪信息</h1>
		<div class="w3l_main_grids">
		<div class="main_tabstyle" style="margin:5px 5px 5px;"> 
	   		<select class="form-control" style="margin-top: 5px;width: 63%;height: 40px;" name="year" id="year" onchange="deptchange('');">
           		<option value="2018">2018</option>
           		<option value="2017">2017</option>
           		<option value="2016">2016</option>
           		<option value="2015">2015</option>
           	</select>
	   		<button type="button" class="btn btn-primary disabled" id="findBtn" style="float:right;height:40px;margin-top: 5px;width: 34%; " onclick="findproject();">查询</button>  
   		</div>
			<div class="wthree_leave_your_comment">
				<h3>个人资料总览</h3>
				<div class="wthree_leave_your_commentl">         
                    <table width="100%">
	                <tr><td>
	                    <div style=" float:left">
                            <label class="labelA">医通卡号:</label>
                            <label class="labelB"><span id="usernumber">${entity.usernumber}</span></label>
	                    </div>
	                </td></tr>
                    <tr><td>
                        <div style=" float:left">
                            <label class="labelB">${entity.username}</label>
                            <label class="labelB">(${deptname})</label>
                        </div>
                     </td></tr>
                     <tr><td>
                         <div style=" float:left">
                             <label class="labelA">国家类学分:</label>
                             <label class="labelB"><span id="zcredit_g">0</span></label>
                         </div>
                         <div style=" float: right" >
                             <label class="labelA">省级类学分:</label>
                             <label class="labelB"><span id="zcredit_s">0</span></label>
                         </div>
                     </td></tr> 
                     <tr><td>
                         <div style=" float:left">
                             <label class="labelA">其他类学分</label>
                             <label class="labelB"><span id="zcredit_q">0</span></label>
                         </div>
                         <div style=" float: right" >
                             <label class="labelA">总学分:</label>
                             <label class="labelB"><span id="zcredit_z">0</span></label>
                         </div>
                     </td></tr>     
                     </table>			
				</div>
			</div>
			<div id="mycredit_div"></div>
		</div>
		<div class="copyright">
			<p>©2018 技术支持: 兰州盛腾信息技术有限公司 </p>
		</div>
	</div>
</body>
<script type="text/javascript">
	$(function(){
		findproject();
	});
	function findproject(){
		var usernumber = $("#usernumber").text();
		var year = $("#year").val();
		$("#mycredit_div").html("");
		var zcredit_g = 0;
		var zcredit_s = 0;
		var zcredit_q = 0;
		var zcredit_z = 0;
		$.ajax({
		 	url: 'xfCreditRecord.do?method=getMyxfInfo&usernumber='+usernumber+'&year='+year,
		  	cache: false,
		  	async: true,  
		  	type:'post',
		  	dataType:'json',
		  	success: function(data){
		  		var list = data; 
		  		for(var i=0;i<list.length;i++){
		  			if(list[i].type=='1'||list[i].type=='2'||list[i].type=='7'){
		  				zcredit_g+=parseInt(list[i].credit);
		  			}else if(list[i].type=='3'||list[i].type=='4'){
		  				zcredit_s+=parseInt(list[i].credit);
		  			}else{
		  				zcredit_q+=parseInt(list[i].credit);
		  			}
		  			zcredit_z+=parseInt(list[i].credit);
		  			var html="<div class='wthree_leave_your_comment'>";
		  				html+="<h3>"+list[i].proName+"</h3>";
		  				html+="<div class='wthree_leave_your_commentl'><table width='100%'>";
		  				
		  				html+="<tr><td>";
		  				html+="<div style=' float:left'>";
		  				html+="<label class='labelA'>"+list[i].addTime.substring(0,19)+"</label>";
		  				html+="</div></td></tr>";
		  				
		  				html+="<tr><td>";
		  				html+="<div style=' float:left'>";
		  				html+="<label class='labelA'>"+list[i].deptName+"</label>";
		  				html+="</div></td></tr>";
		  				
		  				html+="<tr><td>";
		  				html+="<div style=' float:left'>";
		  				html+="<label class='labelA'>"
		  				if(list[i].type=='1'||list[i].type=='2'||list[i].type=='7'){
		  					html+="国家类学分";
		  				}else if(list[i].type=='3'||list[i].type=='4'){
		  					html+="省类学分";
		  				}else{
		  					html+="其他类学分";
		  				}
		  				html+="</label>";
		  				html+="</div></td></tr>";
		  				
		  				html+="<tr><td>";
		  				html+="<div style=' float:left'>";
		  				html+="<label class='labelA'>学分："+list[i].credit+"分</label>";
		  				html+="</div></td></tr>";
		  				
		  				$("#mycredit_div").append(html);
		  		}
		  		$("#zcredit_g").text(zcredit_g!=""&&zcredit_g!=null?zcredit_g:'0');
		  		$("#zcredit_s").text(zcredit_s!=""&&zcredit_s!=null?zcredit_s:'0');
		  		$("#zcredit_q").text(zcredit_q!=""&&zcredit_q!=null?zcredit_q:'0');
		  		$("#zcredit_z").text(zcredit_z!=""&&zcredit_z!=null?zcredit_z:'0');
		     },
		}); 
	}
</script>
</html>