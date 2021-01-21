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
    <title>轮转信息</title>
    <meta charset="utf-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
    <script src="js/jquery.1.7.2.min.js"></script>
    <script src="js/jquery-weui.js"></script>
	<script src="js/umgo-picker.js"></script>
	<script type="text/javascript" src="js/json2.js"></script>
	<script type="text/javascript" src="jquery/highcharts.js"></script>
	
	<style type="text/css">
	.vw {
        width: 110px;
        height: 110px;
        background: #ece0e8;
    	margin: auto;
    	}
    	.vw1 {
        width: 100px;
        height: 100px;
        background: #ece0e8#E9D7Df;
    	margin: auto;
    	}
		td{
			algin:center;
			border: 1px solid #f9f9f9;
			font-size:1.2em;
			height:30px;
			color: #a7abae;
			}
			
	</style>
</head>
<body >
	<input hidden="hidden" id="classid" value="${entity.classid }">
	<input hidden="hidden" id="zuid" value="${entity.zuid }">
	<input hidden="hidden" id="dept" value="${entity.deptid }">
	<input hidden="hidden" id="num" value="${entity.num }">
	<input hidden="hidden" id="total" value="${entity.total-entity.num }">
	<div style="height: 100%">
	<div style="background-color: #E9D7D4;width: 100%;height:200 ">
	<div style="border-radius:10px;width:25%;height:30px;background-color:#525454;float: right;margin-top: 20px" onclick="lunzhuanList()"><p style="color: white;text-align: center;line-height: 30px;">我的轮转表</p></div>
	<div style="height: 10%"></div>
		<div class="vw" >
			<div style="height: 5px"></div>
			<div class="vw1" >
			<h2 style="text-align: center;line-height: 100px; width:100px; height:100px; background-color:#ffffff; border-radius:50%;">${bindinfo.xm}</h2>
		</div>
		</div>
		
	</div>
	<div style="height: 12%">
	<br>
	<div style="width: 50%;height:12% ;float: left">
	<h3 style="color: #a7abae;text-align: center" ><i class="layui-icon">&#xe60e;</i>&nbsp;当前轮转科室</h3>
	<h2 style="color: #525454;text-align: center"  >${nowDept }</h2>
	</div>
	<div style="width: 50%;height:12%;float: right">
	<h3 style="color: #a7abae;text-align: center"><i class="layui-icon">&#xe601;</i>&nbsp;下一轮转科室</h3>
	<h2 style="color: #525454;text-align: center"  >${nextDept}</h2>
	</div>
	</div>
	<div style="background-color:#F9F9F9;height: 10px "></div>
	<br>
	<p style="font-size: 1.2em;line-height: 5px"><b style="color: #28b294">&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;</b>轮转科室信息</p>
	<br>
	<table style="width: 90%;margin: auto">
		<tr><td><i class="layui-icon" style="color: #ef5268">&#xe68e;</i>&nbsp;&nbsp;&nbsp;&nbsp;科室名称</td><td style="text-align: center">${nowDept }</td></tr>
		<tr><td><i class="layui-icon" style="color: #f5a756">&#xe612;</i>&nbsp;&nbsp;&nbsp;&nbsp;带教老师</td><td style="text-align: center">${entity.teachername }</td></tr>
		<tr><td><i class="layui-icon" style="color: #4a8ee9">&#xe637;</i>&nbsp;&nbsp;&nbsp;&nbsp;已入科（天）</td><td style="text-align: center">${nowDays}</td></tr>
	</table>
	<br>
	<p style="font-size: 1.2em;color: #525454;text-align: center"  >距离出科还剩${surplusDays}天</p>
	<br>
	<div style="margin:auto; width:70%">
	  <div class="layui-progress" >
	    <div class="layui-progress-bar"  lay-percent="${proportion}"></div>
	  </div>
	</div>
	<br>
	<div style="width: 80%;height:20px; margin: auto"><p style="float: left">${entity.startdate.substring(0,10) }</p><p style="float:  right">${entity.enddate.substring(0,10) }</p></div>
	<div style="background-color:#F9F9F9;height: 10px "></div>
	<br>
	<p style="font-size: 1.2em;line-height: 5px;height: 10px"><b style="color: #28b294">&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;</b>轮转状态</p>
	<br>
	<div id="container" style="width:80%;height:20%;margin: auto"></div>
	<h3 style="color: #a7abae;text-align: center" >已轮转科室：${entity.num }&nbsp;&nbsp;&nbsp;&nbsp;未轮转科室：${entity.total-entity.num }</h3>
	<br>
	</div>
</body>
<script type="text/javascript">
   function bingtu(series) {
  	 $('#container').highcharts({
            chart: {
            type: 'pie',
            options3d: {
                enabled: true,
                alpha: 45,
                beta: 0
            }
        },
        colors:[
                 '#cc99ff',
                 '#ff9999', 
                 '#00ccff', 
                 '#ffcc99', 
                 '#cc6666' 
                      ],
        title: {
            text: ''
        },
         credits: {
              enabled: false // 清除logo 
             },
        plotOptions: {
            pie: {
                allowPointSelect: true,
                cursor: 'pointer',
                depth: 35,
                dataLabels: {
                    enabled: true,
                    format: '{point.name}'
                }
            }
        },       
        // 把字符串解析为json
        series: [{
            name: '数量',
            data: eval('(' + series + ')')
        }]

  });
   } 
   function data2222(){
    		var str="";
                 str+="['已轮转科室',"+$("#num").val()+"]"+","+"['未轮转科室',"+$("#total").val()+"]"+",";
             str = str.substring(0, str.length - 1);
             console.log(str)
             var allstr = "[" + str + "]";
             bingtu(allstr);  
}
$(function(){
data2222()
})
function lunzhuanList(){
		var width=$("body").width();
		var height=$("body").height();
	    layer.open({
		    type: 2 ,
		    title: '我的轮转表',
		    area: [width+'px', height/2+'px'],
		    shade: 0,
		    maxmin: false,
		    offset: 'rt',
		    content: 'jxLunxun.do?method=toCreateViewPageJxLunxun&classid='+$("#classid").val()+'&zuid='+$("#zuid").val(),
		    zIndex: layer.zIndex ,
		    success: function(layero){layer.setTop(layero)}
	    });
}
</script>
<script src="layui/layui.all.js" charset="utf-8"></script>
</body>
</html>
