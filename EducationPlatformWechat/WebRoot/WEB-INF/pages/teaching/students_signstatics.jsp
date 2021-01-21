<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:directive.page import="com.saint.constant.Constant"/>
<%@ taglib uri="/codetag" prefix="code"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/printDep" prefix="dep"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>签到统计页面</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/layui.css" media="all">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <link rel="stylesheet" type="text/css" href="css/loading.css"/>
    <script src="js/jquery.1.7.2.min.js"></script>
    <script src="js/layui.js" charset="utf-8"></script>
    <script src="js/jquery-weui.js"></script>
	<script src="js/umgo-picker.js"></script>
	<script type="text/javascript" src="js/json2.js"></script>
	<!-- <script type="text/javascript" src="https://3gimg.qq.com/lightmap/components/geolocation/geolocation.min.js"></script> -->
	
	<style type="text/css">
		td{
			height: 35px;
		}
		.ths_con{
			border:1px solid #fff;
		}
		.tds_con{
			border:1px solid #fff;
	  		font-size: 14px;
	  		height: 30px;
	  		background-color: #b8d8ef;
	  	}
	  	.span_title{
	  		font-size: 16px;
	  		color: #898ABB;
	  	}
	</style>
</head>
<body>
	<div id="up_div_p" class="up_div">
		<div style="width: 100%;" id="bet_ondiv"></div>
		<div class="bet_div" id="bet_div">
			<div style="width: 100%;height: 10px;"></div>
			<div style="height: 70px;width: 60%;margin-left:20%;">
				<img src="images/loadingwx.gif" style="width: 100%;">
			</div>
			<div style="width: 100%;text-align: center;">
				<span style="font-size: 13px;">请稍后</span>
			</div>
		</div>
	</div>
	<!-- ---------------------------------------------------------------------------------------------- -->
	<input type="hidden" id="stuid" name="stuid" value="${bindinfo.yitongCard }"/>
	<div class="weui_cells weui_cells_form" style="margin-top: 0px;">
        <div id="tab31" style="width: 100%;height: 60px;border-bottom: 1px solid #cccccc;background-color: #ffffff">
        	<div style="width: 20%;height: 60px;float: left;">
 					<button style="width: 50px;height: 50px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;" >
 						<img src="images/txwsc1.png" style="width: 46px;height: 45px;">
 					</button>
 				</div>
 				<div style="width: 50%;height: 60px;float: left;">
 					<div style="width: 100%;margin-top: 10px;">
  					<span style="color: #1D2426;font-size: 18px;"><b>${bindinfo.xm }</b></span><br>
  					<span style="color: #989C9C;font-size: 15px;">轮训科室：考勤</span>
 					</div>
 				</div>
 				<div style="width: 30%;height: 60px;float: left;">
 					<div style="width: 100%;margin-top: 20px;">
  					<select id="signdates" style="border: 0px;background-color: #ffffff;color: #989C9C;font-size: 15px;float: right;margin-right: 10px;" onchange="signstatisics();">
  						
  					</select>
 					</div>
 				</div>
        </div>
        <div style="width: 100%;background-color: #EDF2F8;">
        	<table width="100%" align="center" border="0" cellspacing="0" cellpadding="0" style="margin-top: 5px;">
 				<thead>
					<tr style="background-color: #b0d9f7;height: 40px;border: 1px;">
						<th class="ths_con" align="center" width="10%"><span class="span_title">日期</span></th>
					 	<th class="ths_con" align="center" width="50%"><span class="span_title">签到时间</span></th>
					 	<th class="ths_con" align="center" width="40%"><span class="span_title">签到状态</span></th>
					</tr>
				</thead>
			</table>
			<div id="mainCount_div" style="width: 99%;overflow-y:auto;">
				<table width="100%">
					<tbody id="yslb_tbody">
					</tbody>
				</table>
			</div>
        </div>
    </div>
</body>
	<script type="text/javascript">
	var width=$("body").width();
	var height=$("body").height();
	document.getElementById("mainCount_div").style.height=height-150;
	$(function(){
		getTodayDate();
		signstatisics();
	});
	
	function getTodayDate() {
		var html = "";
		for(var i=0;i<12;i++){
			var nowDate = new Date(),
			year = nowDate.getFullYear(),
			month = nowDate.getMonth() + 1;
			month = month-i;
			if(month<=0){
				year = year-1;
				month = 12+month;
			}
			month = month < 10 ? '0' + month : month;
			var date = year+"-"+month;
			html+="<option value="+date+">"+date+"</option>";
		}
		$("#signdates").append(html);
    }
	//----------------------------------------------统计个人签到数据--------------------------------------------------------
	function signstatisics(){
		document.getElementById('up_div_p').style.display ='block';
		$("#yslb_tbody").html("");
		var signdates = $("#signdates").val();
		var stuid = $("#stuid").val();
		$.ajax({  //获取平台保存的签到信息
			 url:'jxstusign.do?method=getStuSignInfo&signdates='+signdates+'&stuid='+stuid,
			 cache:false,
			 type:'post',
			 async: true,  
			 dataType:'json',
			 success:function(data){
				var arraylist = data;
				var html = "";
				var bzs=[];
				for(var i=0;i<arraylist.length;i++){
					var elist = arraylist[i].List;
					var row = elist[0].bz;
					for(var k=1;k<=row;k++){
						bzs.push(k)
					}
					var a=0;
					 for(var j=0;j<row;j++){
						html += "<tr>";
						if(j==0){
							html += "<td class='tds_con' align='center' width='10%' rowspan='"+row+"' style='background-color:#b0d9f7'>"+arraylist[i].totalProgress+"</td>";
						}
						if(elist[a]&&elist[a].signcs==bzs[j]){
							html += "<td class='tds_con' align='center' width='50%'>【第"+elist[a].signcs+"次】"+elist[a].signtime.substring(10,19)+"</td>";
						}else{
							html += "<td class='tds_con' align='center' width='50%'>【第"+(j*1+1)+"次】&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;无&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>";
						}
						if(elist[a]&&elist[a].signcs==bzs[j]){
							if(elist[a].type==0){
								if(elist[a].signstate==0){
									html += "<td class='tds_con' align='center' width='50%'><span style='color: green;'>正常</span></td>";
								}else{
									html += "<td class='tds_con' align='center' width='50%'><span style='color: #FD9338;'>迟到("+MillisecondToDate(elist[a].latetime)+")</span></td>";
								}
							}else{
								if(elist[a].signstate==0){
									html += "<td class='tds_con' align='center' width='50%'><span style='color: green;'>正常</span><span style='color: #6685B1;'>(外勤)</span></td>";
								}else{
									html += "<td class='tds_con' align='center' width='50%'><span style='color: #FD9338;'>迟到("+MillisecondToDate(elist[a].latetime)+")</span><span style='color: #6685B1;'>(外勤)</span></td>";
								}
							}
							a++;
						}else{
							html += "<td class='tds_con' align='center' width='50%'><span style='color: red;'>未打卡</span></td>";
						}
					} 
					bzs=[];
				}
				document.getElementById('up_div_p').style.display ='none';
				$("#yslb_tbody").append(html);
			 }
		}); 
	}
	
	
</script>
</html>
