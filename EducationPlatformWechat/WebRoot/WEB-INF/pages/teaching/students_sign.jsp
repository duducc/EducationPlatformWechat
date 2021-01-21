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
    <title>打卡记录页面</title>
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
		.weui_btn_default_xg {
		  	background-color: #22A4F9; /* 圈的颜色 */
		}
		.weui_btn_default_xg:not(.weui_btn_disabled):active {
		  	color: #A1A1A1;
		  	background-color: #DEDEDE;
		}
		td{
			height: 35px;
		}
		.weui_tabbar_item.weui_bar_item_on .weui_tabbar_label{
			color:#538AE4;
		}
		.in_but{
			width: 100%;
		}
		option{
			font-size: 15px;
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
	<!-- -----------------------------------------等待页面--------------------------------------------- -->
	<div id="up_div_p" class="up_div">
		<div style="width: 100%;" id="bet_ondiv"></div>
		<div class="bet_div" id="bet_div">
			<div style="width: 100%;height: 10px;"></div>
			<div style="height: 70px;width: 60%;margin-left:20%;">
				<img src="images/loadingwx.gif" style="width: 100%;">
			</div>
			<div style="width: 100%;text-align: center;">
				<span style="font-size: 13px;">位置获取中</span>
			</div>
		</div>
	</div>
	<div id="up_div" class="up_div">
		<div style="width: 100%;" id="bet_ondiv"></div>
		<div class="bet_div" id="bet_div">
			<div style="width: 100%;height: 10px;"></div>
			<div style="height: 70px;width: 60%;margin-left:20%;">
				<img src="images/loadingwx.gif" style="width: 100%;">
			</div>
			<div style="width: 100%;height: 5px;"></div>
			<div style="width: 100%;text-align: center;">
				<span style="font-size: 13px;">正在签到</span>
			</div>
		</div>
	</div>
	<!-- ---------------------------------------------------------------------------------------------- -->
	<input type="hidden" id="appId" name="appId"  value="${appId }"/>
    <input type="hidden" id="timestamp" name="timestamp" value="${timestamp }"/>
    <input type="hidden" id="nonceStr" name="nonceStr" value="${nonceStr }"/>
    <input type="hidden" id="signature" name="signature" value="${signature }"/>
    <input type="hidden" id="Longitude" name="Longitude" value="${Longitude }"/>
    <input type="hidden" id="Latitude" name="Latitude" value="${Latitude }"/>
	
	<input type="hidden" id="dakastate" name="dakastate"/>
	<input type="hidden" id="nowtime" name="nowtime" value="${date }"/>
	<input type="hidden" id="stuid" name="stuid" value="${bindinfo.yitongCard }"/>
	<input type="hidden" id="stuname" name="stuname" value="${bindinfo.xm}"/>
	<input type="hidden" id="openid" name="openid" value="${bindinfo.openId }"/>
	<input type="hidden" id="signcishu" name="signcishu" value="${signcishu}"/>
	
	<input type="hidden" id="scope" name="scope" value="${scope}"/>
	<input type="hidden" id="wd" name="wd" value="${wd}"/>
	<input type="hidden" id="jd" name="jd" value="${jd}"/>
	<input type="hidden" id="marking" name="marking" value="${marking}"/>
	<input type="hidden" id="distance" name="distance"/>
	<input type="hidden" id="jxposition" name="jxposition"/>
	<div class="weui_tab">
  		<div class="weui_tab_bd">
    		<div id="tab1" class="weui_tab_bd_item  weui_tab_bd_item_active" style="background-color: #ffffff;">
    			<div style="width: 100%;height: 60px;border-bottom: 1px solid #cccccc;background-color: #ffffff">
	  				<div style="width: 20%;height: 60px;float: left;">
	  					<button style="width: 50px;height: 50px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;" >
	  						<img src="images/txwsc1.png" style="width: 46px;height: 45px;" onclick="MillisecondToDate('-661000');">
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
		  					<span style="color: #989C9C;font-size: 15px;float: right;margin-right: 10px;">${time }</span>
	  					</div>
	  				</div>
	  			</div>
     			<div class="weui_cells weui_cells_form" style="margin-top: 0px;">
     				<div style="width: 100%;; height: 50px;border-bottom: 1px solid #cccccc;background-color:#DCDDC0; ">
	     				<span style="color: red;font-size: 14px;margin-left: 15px;">1.请同意【地理位置授权】！</span><br>
	     				<span style="color: red;font-size: 14px;margin-left: 15px;">2.请尽量打开您的GPS，以提高精确度！</span>
     				</div>
	        		<div id="count_div" style="width: 100%;height:70%; ">
	        			<div id="locationInfo" style="width: 96%;height:85%; margin-left:2%;margin-top:1%; border:1px solid #ccc;text-align: center;line-height: 300px;display: none;">
							<span style="color: red;font-size: 15px;">没有获取到位置信息，请关闭该页面后重新进入。</span>
						</div>
	        		</div>
	     		</div>
    		</div>
  		</div>
  		<!---------------------------------------------------------- 底部菜单-------------------------------------------------------->
		<!---------------------------------------------------底部菜单 ----------------------------------------------------- -->
	</div>
</body>
	<script type="text/javascript" src="http://res.wx.qq.com/open/js/jweixin-1.4.0.js"></script>
	<script type="text/javascript">
	var lat = "";
	var lng = "";
	var POS = "";
	var width=$("body").width();
	var height=$("body").height();
	$(function(){
		//由于微信在地址上乱加参数，这个地方重新赋予地址
		var urlss = location.href.split('#')[0].split('&');
		var urlsss =urlss[0]+"&"+urlss[1]+"&"+urlss[2];
		history.pushState(null, null, urlsss)
		if(location.href.indexOf("sessionid")==-1){
			start();
			return;
		}	
	});
	
	function start(){
		document.getElementById('up_div_p').style.display ='block';
		wx.config({
			beta: true,// 必须这么写，否则wx.invoke调用形式的jsapi会有问题
		    debug: false, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
		    appId: $("#appId").val(), // 必填，公众号的唯一标识
		    timestamp: $("#timestamp").val(), // 必填，生成签名的时间戳
		    nonceStr: $("#nonceStr").val(), // 必填，生成签名的随机串
		    signature: $("#signature").val(),// 必填，签名
		    jsApiList: ['getLocation'] // 必填，需要使用的JS接口列表
		});
		
		wx.ready(function(res){  //签名校验成功之后回调
			wx.getLocation({
				type: 'gcj02', // 默认为wgs84的gps坐标，如果要返回直接给openLocation用的火星坐标，可传入'gcj02'
				success: function (res) {
					lat = res.latitude; // 纬度，浮点数，范围为90 ~ -90
					lng = res.longitude; // 经度，浮点数，范围为180 ~ -180。
					var speed = res.speed; // 速度，以米/每秒计
					var accuracy = res.accuracy; // 位置精度
					var distance = getDisance(lat,lng);
					$("#distance").val(distance);
					getposition(lat,lng); //地址反解析
					mainmother();//主函数
					getdate();
					document.getElementById('up_div_p').style.display ='none';
				}
			});
		});
		wx.error(function(res){  //签名校验失败回调
			var Latitude = $("#Latitude").val();
			var Longitude = $("#Longitude").val();
			document.getElementById('up_div_p').style.display ='none';
			if(Latitude!=""&&Latitude!=null&&Latitude!="null"){
				lat = Latitude;
				lng = Longitude;
				var distance = getDisance(lat,lng);
				$("#distance").val(distance);
				getposition(lat,lng); //地址反解析
				mainmother();//主函数
				getdate();
				document.getElementById('up_div_p').style.display ='none';
			}else{
				alert("获取位置失败！");
			    var url = "Jxsignerror.do?method=insertJxSignError";
			    var errorinfos = {};
			    errorinfos['stuid'] = $("#stuid").val();
			    errorinfos['stuname'] = $("#stuname").val();
			    errorinfos['cause'] = res.errMsg+">>无效的签名";
			    errorinfos['openid'] = $("#openid").val();
			    errorinfos['type'] = "1";
	            var errorinfo = JSON.stringify(errorinfos);
		        $.post(url,{errorinfo:encodeURI(errorinfo)},function (data, status) {
		            if( status=="success" ){
		                var json = eval(data);
		                switch (json.errorMsg) {
		                    case "success":		//成功
		                    	document.getElementById('locationInfo').style.display ='block';
		                        break;
		                    case "failed":		//失败
		                    	document.getElementById('locationInfo').style.display ='block';
		                        break;
		                    case "error":		//服务器异常
		                        $.alert( "服务器异常，稍后再试！","警告");
		                        break;
		                }
		            }else{
		            	$.alert("操作失败！","提示信息");
		            }
		        },"json");
			}
		}); 
	}
	

	/* ----------------------------------------------签到页面显示主要方法--------------------------------------------------- */	
	function mainmother(){
		$("#count_div").html("");
		document.getElementById('up_div').style.display ='block';
		var marking = $("#marking").val();
		$.ajax({  //获取平台保存的签到信息
			 url:'jxSignInfo.do?method=getListJxSignInfo&marking='+marking,
			 cache:false,
			 type:'post',
			 async: true,  
			 dataType:'json',
			 success:function(data){
				 var signlist = data;
				 if(signlist.length==0){
					 alert("您还没有分配考勤组，请联系管理员");
					 return false;
				 }
				 if(signlist.length==3){
				 	showsignpage3(signlist);
				 }
				 if(signlist.length==2){
				 	showsignpage2(signlist);
				 }
				 if(signlist.length==1){
				 	showsignpage1(signlist);
				 }
			 }
		}); 
		document.getElementById('up_div').style.display ='none';
	}
	/* ------------------------------------------------------显示js------------------------------------------------------ */
	function showsignpage3(list){
		var y = "0";
		var w = "1";
		var time1 = list[0].statetime;
		var jd1 = list[0].endtime;
		var time2 = list[1].statetime;
		var jd2 = list[1].endtime;
		var time3 = list[2].statetime;
		var jd3 = list[2].endtime;
		var nowtime = $("#nowtime").val();
		var distance = $("#distance").val();
		var scope = $("#scope").val();
		var polision = "";
		if(parseInt(distance)>parseInt(scope)){
			polision = "1";
		}else{
			polision = "0";
		}
		if(nowtime<time1){
			$("#dakastate").val("1");
			var html = "";
			var html1 = htmlquan(time1,jd1,y,'1',polision);
			var html2 = htmlsjd(time2,jd2,y);
			var html3 = htmlsjd(time3,jd3,w);
			html += html1+html2+html3;
			$("#count_div").append(html);
		}
		if(nowtime>time1&&nowtime<time2){
			var entity = getentity('1');
			if(entity==null){
				$("#dakastate").val("0");
				var html = "";
				var html1 = htmlquan(time1,jd1,y,'1',polision);
				var html2 = htmlsjd(time2,jd2,y);
				var html3 = htmlsjd(time3,jd3,w);
				html += html1+ html2 + html3;
				$("#count_div").append(html);
			}
			if(entity!=null){
				$("#dakastate").val("1");
				var html = "";
				var html1 = htmldakainfo(time1,jd1,y,entity);
				var html2 = htmlquan(time2,jd2,y,'2',polision);
				var html3 = htmlsjd(time3,jd3,w);
				html += html1 + html2 + html3;
				$("#count_div").append(html);
			}
		}
		if(nowtime>time2&&nowtime<time3){
			var entity1 = getentity('1');
			var entity2 = getentity('2');
			if(entity2==null){
				$("#dakastate").val("0");
				var html = "";
				var html1 = "";
				if(entity1==null){
					html1 = htmldakainfoqk(time1,jd1,y);
				}else{
					html1 = htmldakainfo(time1,jd1,y,entity1);
				}
				var html2 = htmlquan(time2,jd2,y,'2',polision);
				var html3 = htmlsjd(time3,jd3,w);
				html += html1+ html2 + html3;
				$("#count_div").append(html);
			}
			if(entity2!=null){
				$("#dakastate").val("1");
				var html = "";
				if(entity1==null){
					html1 = htmldakainfoqk(time1,jd1,y);
				}else{
					html1 = htmldakainfo(time1,jd1,y,entity1);
				}
				var html2 = htmldakainfo(time2,jd2,y,entity2);
				var html3 = htmlquan(time3,jd3,w,'3',polision);
				html += html1 + html2 + html3;
				$("#count_div").append(html);
			}
		}
		if(nowtime>time3&&nowtime<jd3){
			var entity1 = getentity('1');
			var entity2 = getentity('2');
			var entity3 = getentity('3');
			if(entity3==null){
				$("#dakastate").val("0");
				var html = "";
				if(entity1==null){
					html1 = htmldakainfoqk(time1,jd1,y);
				}else{
					html1 = htmldakainfo(time1,jd1,y,entity1);
				}
				var html2 = "";
				if(entity2==null){
					html2 = htmldakainfoqk(time2,jd2,y);
				}else{
					html2 = htmldakainfo(time2,jd2,y,entity2);
				}
				var html3 = htmlquan(time3,jd3,w,'3',polision);
				html += html1+ html2 + html3;
				$("#count_div").append(html);
			}
			if(entity3!=null){
				$("#dakastate").val("0");
				var html = "";
				if(entity1==null){
					html1 = htmldakainfoqk(time1,jd1,y);
				}else{
					html1 = htmldakainfo(time1,jd1,y,entity1);
				}
				var html2 = "";
				if(entity2==null){
					html2 = htmldakainfoqk(time2,jd2,y);
				}else{
					html2 = htmldakainfo(time2,jd2,y,entity2);
				}
				var html3 = htmldakainfo(time3,jd3,w,entity3);
				html += html1 + html2 + html3;
				$("#count_div").append(html);
			}
		}
		if(nowtime>jd3){
			var entity1 = getentity('1');
			var entity2 = getentity('2');
			var entity3 = getentity('3');
			if(entity3==null){
				$("#dakastate").val("1");
				var html = "";
				if(entity1==null){
					html1 = htmldakainfoqk(time1,jd1,y);
				}else{
					html1 = htmldakainfo(time1,jd1,y,entity1);
				}
				var html2 = "";
				if(entity2==null){
					html2 = htmldakainfoqk(time2,jd2,y);
				}else{
					html2 = htmldakainfo(time2,jd2,y,entity2);
				}
				var html3 = htmldakainfoqk(time3,jd3,w);
				html += html1+ html2 + html3;
				$("#count_div").append(html);
			}
			if(entity3!=null){
				$("#dakastate").val("1");
				var html = "";
				if(entity1==null){
					html1 = htmldakainfoqk(time1,jd1,y);
				}else{
					html1 = htmldakainfo(time1,jd1,y,entity1);
				}
				var html2 = "";
				if(entity2==null){
					html2 = htmldakainfoqk(time2,jd2,y);
				}else{
					html2 = htmldakainfo(time2,jd2,y,entity2);
				}
				var html3 = htmldakainfoqk(time3,jd3,w);
				html += html1 + html2 + html3;
				$("#count_div").append(html);
			}
		}
	}
	
	function showsignpage2(list){
		var y = "0";
		var w = "1";
		var time1 = list[0].statetime;
		var jd1 = list[0].endtime;
		var time2 = list[1].statetime;
		var jd2 = list[1].endtime;
		var nowtime = $("#nowtime").val();
		var distance = $("#distance").val();
		var scope = $("#scope").val();
		var polision = "";
		if(parseInt(distance)>parseInt(scope)){
			polision = "1";
		}else{
			polision = "0";
		}
		if(nowtime<time1){
			$("#dakastate").val("1");
			var html = "";
			var html1 = htmlquan(time1,jd1,y,'1',polision);
			var html2 = htmlsjd(time2,jd2,w);
			html += html1+html2;
			$("#count_div").append(html);
		}
		if(nowtime>time1&&nowtime<time2){
			var entity = getentity('1');
			if(entity==null){
				$("#dakastate").val("0");
				var html = "";
				var html1 = htmlquan(time1,jd1,y,'1',polision);
				var html2 = htmlsjd(time2,jd2,w);
				html += html1+ html2;
				$("#count_div").append(html);
			}
			if(entity!=null){
				$("#dakastate").val("1");
				var html = "";
				var html1 = htmldakainfo(time1,jd1,y,entity);
				var html2 = htmlquan(time2,jd2,w,'2',polision);
				html += html1 + html2;
				$("#count_div").append(html);
			}
		}
		if(nowtime>time2&&nowtime<jd2){
			var entity1 = getentity('1');
			var entity2 = getentity('2');
			if(entity2==null){
				$("#dakastate").val("0");
				var html = "";
				if(entity1==null){
					html1 = htmldakainfoqk(time1,jd1,y);
				}else{
					html1 = htmldakainfo(time1,jd1,y,entity1);
				}
				var html2 = htmlquan(time2,jd2,w,'2',polision);
				html += html1+ html2;
				$("#count_div").append(html);
			}
			if(entity2!=null){
				$("#dakastate").val("0");
				var html = "";
				if(entity1==null){
					html1 = htmldakainfoqk(time1,jd1,y);
				}else{
					html1 = htmldakainfo(time1,jd1,y,entity1);
				}
				var html2 = htmldakainfo(time2,jd2,w,entity2);
				html += html1 + html2;
				$("#count_div").append(html);
			}
		}
		if(nowtime>jd2){
			var entity1 = getentity('1');
			var entity2 = getentity('2');
			if(entity2==null){
				$("#dakastate").val("1");
				var html = "";
				if(entity1==null){
					html1 = htmldakainfoqk(time1,jd1,y);
				}else{
					html1 = htmldakainfo(time1,jd1,y,entity1);
				}
				var html2 = htmldakainfoqk(time2,jd2,w);
				html += html1+ html2;
				$("#count_div").append(html);
			}
			if(entity2!=null){
				$("#dakastate").val("1");
				var html = "";
				if(entity1==null){
					html1 = htmldakainfoqk(time1,jd1,y);
				}else{
					html1 = htmldakainfo(time1,jd1,y,entity1);
				}
				var html2 = htmldakainfo(time2,jd2,w,entity2);
				html += html1 + html2;
				$("#count_div").append(html);
			}
		}
	}
	
	function showsignpage1(list){
		var distance = $("#distance").val();
		var scope = $("#scope").val();
		var polision = "";
		if(parseInt(distance)>parseInt(scope)){
			polision = "1";
		}else{
			polision = "0";
		}
		var y = "0";
		var w = "1";
		var time1 = list[0].statetime;
		var jd1 = list[0].endtime;
		var nowtime = $("#nowtime").val();
		if(nowtime<time1){
			$("#dakastate").val("1");
			var html  = htmlquan(time1,jd1,w,'1',polision);
			$("#count_div").append(html);
		}
		if(nowtime>time1&&nowtime<jd1){
			var entity1 = getentity('1');
			if(entity1==null){
				$("#dakastate").val("0");
				var html = htmlquan(time1,jd1,w,'1',polision);
				$("#count_div").append(html);
			}
			if(entity1!=null){
				$("#dakastate").val("1");
				var html = htmldakainfo(time1,jd1,w,entity1);
				$("#count_div").append(html);
			}
		}
		if(nowtime>jd1){
			var entity1 = getentity('1');
			if(entity1==null){
				$("#dakastate").val("1");
				var html = htmldakainfoqk(time1,jd1,w);
				$("#count_div").append(html);
			}
			if(entity1!=null){
				$("#dakastate").val("1");
				var html = htmldakainfo(time1,jd1,w,entity1);
				$("#count_div").append(html);
			}
		}
	}
	
	/*------------------------------------ 显示圈圈------------- -------------------*/
	function htmlquan(time,jd,type,signcs,polision){
		var html = "";
		html += "<div style='width: 90%;margin-left: 5%;height: 220px;'>";
		html += "<table style='width: 100%;' border='0'>";
		html += "<tr>";
		html += "<td width='10%;' style='text-align: center;'>";
		html += "<img src='images/service/quan2.png' style='width: 20px;height: 20px;'>";
		html += "</td>";
		html += "<td width='89%;'>";
		html += "<span style='margin-top: 5px;color: #989C9C;font-size: 14px;'>规定打卡时间段&nbsp;&nbsp;"+time+"-"+jd+"</span>";
		html += "</td>";
		html += "<td width='1%;'></td>";
		html += "</tr>";
		html += "<tr>";
		html += "<td width='10%;' rowspan='4' style='text-align: center;'>";
		if(type==0){
			html += "<div style='height: 206px;border-left: 2px solid #A0A0A0;margin-left: 50%;margin-top: -11px;'></div>";
		}
		html += "</td>";
		html += "<td width='90%;' rowspan='4' style='text-align: left;'>";
		if(type==0){
			html += "<div style='width: 100%;height: 120px;margin-top: -15px;margin-left:-30px;'>";
		}
		if(type==1){
			html += "<div style='width: 100%;height: 120px;margin-top: -5px;margin-left:-30px;'>";
		}
		if(polision==0){
			html += "<button id='dktj' type='button' onclick='csign("+signcs+");' class='weui_btn weui_btn_default_xg' style='width: 140px;height: 140px;border-radius: 50%;border: none;color: #ffffff;' >";
		}else{
			html += "<button id='dktj' type='button' onclick='csign("+signcs+");' class='weui_btn weui_btn_default_xg' style='width: 140px;height: 140px;border-radius: 50%;border: none;color: #ffffff;background-color: #6685B1;' >";
		}
		html += "<div id='by' style='width: 100%;height: 35px;margin-top: 10px;'></div>";
		html += "<div id='sj' style='width: 80%;height: 20px;margin-left: 10%;'></div>";
		html += "</button>";
		html += "</div>";
		if(polision==0){
			html += "<div style='width:80%;height:30px;margin-top: 25px;text-align: center;'>";
			html += "<img src='images/finash.png' style='width: 15px;height: 15px;'>&nbsp;&nbsp;<span style='font-size: 13px;color: #989C9C;'>已进入打卡位置！</span>"
			html += "</div>";
		}else{
			html += "<div style='width:80%;height:30px;margin-top: 25px;text-align: center;'>";
			html += "<img src='images/fail.png' style='width: 15px;height: 15px;'>&nbsp;&nbsp;<span style='font-size: 13px;color: #989C9C;'>不在位置范围内!</span>"
			html += "</div>";
		}
		html += "</td>";
		html += "<td width='1%;'></td>";
		html += "</tr>";
		html += "<tr><td width='1%;'></td></tr>";
		html += "<tr><td width='1%;'></td></tr>";
		html += "<tr><td width='1%;'></td></tr>";
		html += "</table>";
		html += "</div>";
		return html;
	}
	/* -----------------------------------若已经打卡，显示打卡信息------------------------- */
	function htmldakainfo(time,jd,type,entity){
		var jdjd = "";
		var jdwd = "";
		if(entity.remark1!=null||entity.remark1!=""){
			jdjd = entity.remark1.split("/")[0];
			jdwd = entity.remark1.split("/")[1];
		}
		var html = "";
		html += "<div style='width: 90%;margin-left: 5%;height: 150px;'>";
		html += "<table style='width: 100%;' border='0'>";
		html += "<tr>";
		html += "<td width='10%;' style='text-align: center;'>";
		html += "<img src='images/service/quan2.png' style='width: 20px;height: 20px;'>";
		html += "</td>";
		html += "<td width='89%;'>";
		html += "<span style='margin-top: 5px;color: #989C9C;font-size: 14px;'>规定打卡时间段&nbsp;&nbsp;"+time+"-"+jd+"</span>";
		html += "</td>";
		html += "<td width='1%;'></td>";
		html += "</tr>";
		html += "<tr>";
		html += "<td width='10%;' rowspan='4' style='text-align: center;'>";
		if(type==0){
			html += "<div style='height: 135px;border-left: 2px solid #A0A0A0;margin-left: 50%;margin-top: -20px;'></div>";
		}
		html += "</td>";
		html += "<td width='90%;' rowspan='4'>";
		html += "<div style='width: 100%;height: 120px;margin-top: -20px;'>";
		html += "<span style='margin-top: 5px;color: #1D2426;font-size: 16px;'><b>实际打卡时间&nbsp;&nbsp;"+entity.signtime.substring(10,19)+"</b></span>";
		if(entity.type==1){//外勤
			if(entity.signstate==1){//迟到
				html += "<span style='border: 2px solid #FD9338;color:#FD9338;font-size: 14px;'>迟到</span>&nbsp;&nbsp;";
				html += "<span style='border: 2px solid #6685B1;color:#6685B1;font-size: 14px;'>外勤</span><br>";
			}else{//正常
				html += "<span style='border: 2px solid #22A4F9;color:#22A4F9;font-size: 14px;'>正常</span>&nbsp;&nbsp;";
				html += "<span style='border: 2px solid #6685B1;color:#6685B1;font-size: 14px;'>外勤</span><br>";
			}
		}else{//正常，非外勤
			if(entity.signstate==1){
				html += "<span style='border: 2px solid #FD9338;color:#FD9338;font-size: 14px;'>迟到</span><br>";
			}else{
				html += "<span style='border: 2px solid #22A4F9;color:#22A4F9;font-size: 14px;'>正常</span><br>";
			}
		}
		html += "<span style='margin-top: 5px;color: #989C9C;font-size: 14px;'>打卡位置："+entity.remark2+"</span><br>";
		html += "<a href='#' style='color: blue;font-size: 14px;' id='"+entity.xh+","+entity.signcs+"' onclick='updatedaka(this.id);'>更新打卡></a>";
		html += "</div>";
		html += "</td>";
		html += "<td width='1%;'></td>";
		html += "</tr>";
		html += "<tr><td width='1%;'></td></tr>";
		html += "<tr><td width='1%;'></td></tr>";
		html += "<tr><td width='1%;'></td></tr>";
		html += "</table>";
		html += "</div>";
		return html ;
	}
	/* ------------------------若超出时间段，显示打卡信息(缺卡)------------------------- */
	function htmldakainfoqk(time,jd,type){
		var html = "";
		html += "<div style='width: 90%;margin-left: 5%;height: 150px;'>";
		html += "<table style='width: 100%;' border='0'>";
		html += "<tr>";
		html += "<td width='10%;' style='text-align: center;'>";
		html += "<img src='images/service/quan2.png' style='width: 20px;height: 20px;'>";
		html += "</td>";
		html += "<td width='89%;'>";
		html += "<span style='margin-top: 5px;color: #989C9C;font-size: 14px;'>规定打卡时间段&nbsp;&nbsp;"+time+"-"+jd+"</span>";
		html += "</td>";
		html += "<td width='1%;'></td>";
		html += "</tr>";
		html += "<tr>";
		html += "<td width='10%;' rowspan='4' style='text-align: center;'>";
		if(type==0){
			html += "<div style='height: 135px;border-left: 2px solid #A0A0A0;margin-left: 50%;margin-top: -20px;'></div>";
		}
		html += "</td>";
		html += "<td width='90%;' rowspan='4'>";
		html += "<div style='width: 100%;height: 120px;margin-top: -20px;'>";
		html += "<span style='margin-top: 5px;color: #1D2426;font-size: 18px;'><b>实际打卡时间&nbsp;&nbsp;</b></span>";
		html += "<span style='border: 2px solid red;color:red;font-size: 14px;'>缺卡</span><br>";
		html += "<span style='margin-top: 5px;color: #989C9C;font-size: 14px;'>打卡位置：无</span><br>";
		html += "<a href='#' style='color: #cccccc;font-size: 14px;'>更新打卡></a>";
		html += "</div>";
		html += "</td>";
		html += "<td width='1%;'></td>";
		html += "</tr>";
		html += "<tr><td width='1%;'></td></tr>";
		html += "<tr><td width='1%;'></td></tr>";
		html += "<tr><td width='1%;'></td></tr>";
		html += "</table>";
		html += "</div>";
		return html ;
	}
	//-------------------------------------若还未到打卡时间，显示节点-----------------------------
	function htmlsjd(time,jd,type){
		var html = "";
		html += "<div style='width: 90%;margin-left: 5%;height: 50px;'>";
		html += "<table style='width: 100%;' border='0'>";
		html += "<tr>";
		html += "<td width='10%;' style='text-align: center;'>";
		html += "<img src='images/service/quan2.png' style='width: 20px;height: 20px;'>";
		html += "</td>";
		html += "<td width='89%;'>";
		html += "<span style='margin-top: 5px;color: #989C9C;font-size: 14px;'>规定打卡时间段&nbsp;&nbsp;"+time+"-"+jd+"</span>";
		html += "</td>";
		html += "<td width='1%;'></td>";
		html += "</tr>";
		html += "<tr>";
		html += "<td width='10%;' rowspan='4' style='text-align: center;'>";
		if(type==0){
			html += "<div style='height: 35px;border-left: 2px solid #A0A0A0;margin-left: 50%;margin-top: -16px;'></div>";
		}
		html += "</td>";
		html += "<td width='90%;' rowspan='4' style='text-align: left;'></td>";
		html += "<td width='1%;'></td>";
		html += "</tr>";
		html += "</table>";
		html += "</div>";
		return html;
	}
	
	function csign(value){
		var dakastate = $("#dakastate").val();
		if(dakastate==1){
			$.alert("请在时间段内打卡","提示");
			return;
		}
		var distance = $("#distance").val();
		var scope = $("#scope").val();
		if(parseInt(distance)>parseInt(scope)){
			if (confirm("您不在规定位置内，是否进行外勤打卡？")) { 
				clicksign(value,"1");
			}
		}else{
			clicksign(value,"0");
		}
	}
	//---------------------------------------------------点击签到-----------------------------------------------------
	function clicksign(value,ztype){
		document.getElementById('up_div').style.display ='block';
		var remark1 = lat+"/"+lng;
		var remark2 = $("#jxposition").val();
		var remark3 = $("#marking").val();
		var applyinfos = {};
      	applyinfos['stuid']=$("#stuid").val();
      	applyinfos['stuname']=$("#stuname").val();
      	applyinfos['signcs']=value;
      	applyinfos['openid']=$("#openid").val();
      	applyinfos['bz']=$("#signcishu").val();
      	applyinfos['remark1']=remark1;
      	applyinfos['remark2']=remark2;
      	applyinfos['remark3']=remark3;
		var applyInfo = JSON.stringify(applyinfos);
        //ajax请求数据
        var url = "jxstusign.do?method=insertJxStudentsSign";
        $.post(url,{applyInfo:encodeURI(applyInfo),type:ztype},function (data, status) {
              if( status=="success" ){
                  var json = eval(data);
                  switch (json.errorMsg) {
                      case "success":		//成功
                          $.toast("签到成功！");
                          mainmother();
                          document.getElementById('up_div').style.display ='none';
                          break;
                      case "failed":		//失败
                          $.alert("签到失败！", "提示");
                          document.getElementById('up_div').style.display ='none';
                          break;
                      case "error":		//服务器异常
                          $.alert("服务器异常，稍后再试！", "警告！");
                          document.getElementById('up_div').style.display ='none';
                          break;
                  }
              }else{
                  $.alert("操作失败！", "提示");
              }
          },"json");
	}
	//--------------------------------------------------更新打卡-----------------------------------------------
	function updatedaka(value){
		var strs= new Array(); //定义一数组
		strs=value.split(","); //字符分割
		var xh = strs[0];
		var signcs = strs[1];
		if (confirm("是否更新打卡？")) { 
			document.getElementById('up_div').style.display ='block';
			var url = "jxstusign.do?method=updateJxStudentsSign";
        	$.post(url,{xh:xh,signcs:signcs},function (data, status) {
              if( status=="success" ){
                  var json = eval(data);
                  switch (json.errorMsg) {
                      case "success":		//成功
                          $.toast("更新签到成功！");
                          mainmother();
                          document.getElementById('up_div').style.display ='none';
                          break;
                      case "failed":		//失败
                          $.alert("签到失败！", "提示");
                          document.getElementById('up_div').style.display ='none';
                          break;
                      case "error":		//服务器异常
                          $.alert("服务器异常，稍后再试！", "警告！");
                          document.getElementById('up_div').style.display ='none';
                          break;
                  }
              }else{
                  $.alert("操作失败！", "提示");
              }
          },"json");
		} 
	}
	
	function MillisecondToDate(msd) {
		if(msd<0){
			msd = msd*-1;
		}
    	var time = parseFloat(msd) / 1000;
    	if (null != time && "" != time) {
        	if (time > 60 && time < 60 * 60) {
            	time = parseInt(time / 60.0) + "分钟" + parseInt((parseFloat(time / 60.0) -
                parseInt(time / 60.0)) * 60) + "秒";
        	}else if (time >= 60 * 60 && time < 60 * 60 * 24) {
            	time = parseInt(time / 3600.0) + "小时" + parseInt((parseFloat(time / 3600.0) -
                parseInt(time / 3600.0)) * 60) + "分钟" +
                parseInt((parseFloat((parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60) -
                parseInt((parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60)) * 60) + "秒";
        	}else {
            	time = parseInt(time) + "秒";
        	}
    	}
    	return time;
	}
	//--------------------------------------获取已保存的签到信息-----------------------------------------------
	function getentity(signcs){
		var entity = ""
		$.ajax({  //获取平台保存的签到信息
			 url:'jxstusign.do?method=getSignEntityById&signcs='+signcs+'&stuid='+$("#stuid").val(),
			 cache:false,
			 type:'post',
			 async: false,  
			 dataType:'json',
			 success:function(data){
				entity = data;
			 }
		}); 
		return entity;
	}
	
	//-------------------------------------------动态获取签到统计下拉框的月份------------------------------------------------
	/* function getTodayDate() {
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
    } */
	
	//----------------------------------------------统计个人签到数据--------------------------------------------------------
	//-------------------------------------------根据金纬度计算两个点之间的距离------------------------------------------------------
    function getDisance(lat1,lng1) { //lat为纬度, lng为经度, 一定不要弄错
    	var lat2 = $("#jd").val();
    	var lng2 = $("#wd").val();
        var dis = 0;
        var radLat1 = toRad(lat1);
        var radLat2 = toRad(lat2);
        var deltaLat = radLat1 - radLat2;
        var deltaLng = toRad(lng1) - toRad(lng2);
        var dis = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(deltaLat / 2), 2) + Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(deltaLng / 2), 2)));
        return dis * 6378137;
    }
    function toRad(d) {
    	return d * Math.PI / 180; 
    }
	/* --------------------------------------------------地址反解析----------------------------------------------- */
	function getposition(wd,jd){
		var data = {
			location:wd+","+jd,
			key:"OAXBZ-X56CP-C5EDA-LG5DE-A2XAS-ZSBAS",
			get_poi:0
		};
    	data.output="jsonp";  
        $.ajax({
        	 url:"http://apis.map.qq.com/ws/geocoder/v1/?",
        	 dataType:'jsonp',
			 cache:false,
			 type:'post',
			 async: false,  
        	 data:data,
        	 jsonp:"callback",
        	 jsonpCallback:"QQmap",
			 success:function(json){
				POS = json.result.address+"-"+json.result.formatted_addresses.recommend;
				$("#jxposition").val(POS);
			 }
		}); 
	}
	
	/* ------------------------------------------------获取圆圈时间----------------------------------------- */
	function getdate(){
		window.setInterval('buttonfz()', 1000);
	}
		
	function buttonfz(){
		var nowtime = "";
		var myDate = new Date();
		var hour = myDate.getHours();       //获取当前小时数(0-23)
		var min = myDate.getMinutes();     //获取当前分钟数(0-59)
		var sec = myDate.getSeconds();
		nowtime = hour+":"+min+":"+sec;
		document.getElementById("by").innerHTML="<span style='font-size:20px;'>签 到 打 卡</span>";
		document.getElementById("sj").innerHTML="<span style='margin-top:-10px;font-size:15px;'>"+nowtime+"</span>";
	}
</script>
</html>
