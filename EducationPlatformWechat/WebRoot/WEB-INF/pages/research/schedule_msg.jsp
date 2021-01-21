<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
<link rel="stylesheet" type="text/css" href="weiui/dist/style/weui.css" />
<link rel="stylesheet" type="text/css" href="weiui/dist/style/weui.min.css" />
<link rel="stylesheet" href="css/weui.css">
<link rel="stylesheet" href="css/jquery-weui.css">
<link rel="stylesheet" href="css/demos.css">
<link rel="stylesheet" href="css/progressbar.css">
<script type="text/javascript" src="weiui/dist/example/zepto.min.js"></script>
<script type="text/javascript" src="js/iscroll.js"></script>
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="js/jquery-weui.js"></script>
<script type="text/javascript" src="weiui/js/common.js"></script>
<script type="text/javascript" src="js/translation.js"></script><!--字段翻译  -->
<style type="text/css">
table.altrowstable {
     font-family: verdana,arial,sans-serif;
     font-size:14px;
     color:#333333;
     border-width: 1px;
     border-color: #a9c6c9;
     border-collapse: collapse;
 }
 table.altrowstable th {
     border-width: 1px;
     padding: 8px;
     border-color: #BCBCBC;
     border-style:solid;
 }
 table.altrowstable td {
     border-width: 1px;
     padding: 8px;
     border-color: #BCBCBC;
     text-align:center; 
     border-style:solid;
 }
 .oddrowcolor{
     background-color:#d4e3e5;
 }
 .evenrowcolor{
     background-color:#c3dde0;
 }  
 .container{
		width:200px;
	}
</style>
<title>项目信息</title>
</head>
<body>
         	<table  cellspacing="10">
         		<tr>
         			<td style="width: 30%;font-size: 17px;">项目名称：</td>
         			<td style="font-size: 17px;">${entity.proname}</td>
         		</tr>
         		<tr>
         			<td style="width: 30%;font-size: 17px;">项目进度：</td>
         			<td>
         				<section class="container">
						    <div class="progress">
						      	<span class="blue" style="width:${proion*2}px"><span>${proion }%</span></span>
						    </div>
						</section>
         			</td>
         		</tr>
         	</table>
	 <div class="page">
       <div class="page__bd" style="height: 100%;">
          <div class="weui-tab">
            <div class="weui-navbar">
                <div class="weui-navbar__item weui-bar__item_on" style="border: 0px;border-bottom: 2px solid #B4F0C6;">我的任务</div>
                <div class="weui-navbar__item" style="border: 0px;border-bottom: 2px solid #B4F0C6;">我的登记</div>
            </div>
            <div class="weui-tab__panel">
				<div class="weui-tab__content page_feedback">
					<c:if test="${plansize==0 }">
						<div style="padding-top:20px; text-align:center; width: 98%;margin-left:1%;height: 60px;border:1px solid #cccccc;border-radius:5px;">
							<span style="color: red;font-size: 18px;">没有您的任务信息</span>
						</div>
					</c:if>
					<c:if test="${plansize!=0 }">
					<c:forEach items="${planList}" var="p">
	                    <table class="altrowstable" id="project" style="width: 100%;margin-top: 10px;">
	                    	<tr>
	                    		<td colspan="2" style="text-align: left;border-left: 3px solid #1AAD19;" height="25px">
									<b style="font-size: 16px;text-align: left;">&nbsp;&nbsp;任务名称：${p.taskgoal}</b>
								</td>
							</tr>
	                    	<tr><td style="width: 100px">开始时间：</td><td>${p.taskstartdate.substring(0,10)}</td></tr>
	                    	<tr><td >结束时间：</td><td>${p.taskenddate.substring(0,10)}</td></tr>
	                    	<tr><td >任务占比：</td><td>${p.proportion}%</td></tr>
	                    	<tr><td >任务描述：</td><td id="dept">${p.taskcon}</td></tr>
							<tr><td >操&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;作：</td><td><a href="javascript:toScheduleDJ('${p.prosequence}','${p.xh}');";" class="weui-btn weui-btn_mini weui-btn_primary" >进度登记</a></td></tr>
	                    </table>
					</c:forEach>
					</c:if>
                </div>
                <div class="weui-tab__content hide" >
                	<c:forEach var="entity" items="${gressList }">
	                  	<table class="altrowstable" id="alternatecolor" style="width: 100%;margin-top: 10px;">
	                    	<tr>
	                    		<td colspan="2" style="text-align: left;border-left: 3px solid #1AAD19;" height="25px">
									<b style="font-size: 16px;text-align: left;">&nbsp;&nbsp;任务名称：${entity.taskname}</b>
								</td>
							</tr>
	                    	<tr><td style="width: 120px">占项目总比：</td><td>${entity.proproion}%</td></tr>
	                    	<tr><td style="width: 120px">完成比例：</td><td>${entity.subproportion}%</td></tr>
	                    	<tr><td style="width: 120px">任务描述：</td><td>${entity.progressdesc}</td></tr>
	                    </table>
	                    <HR style="FILTER: alpha(opacity=100,finishopacity=0,style=3)" width="100%" color=#BCBCBC SIZE=1>
                    </c:forEach>	  
                </div>
            </div>
        </div>
    </div>
   </div>
</body>
<script type="text/javascript">
   $(function(){$('.weui-tab__panel div').eq(0).show()})  
    //tab切换    
	$(function(){
	  var aLi = $('.weui-navbar__item');
	    aLi.on('click', function () {
	        $(this).addClass('weui-bar__item_on').siblings('.weui-bar__item_on').removeClass('weui-bar__item_on');
	        var index = $(this).index();
	        $('.weui-tab__panel div').eq(index).show().siblings().hide();
	    });
	});
function toScheduleDJ(data1,data2){
	var spath = "kyProjectPlan.do?method=toScheduleDJ&prosequence="+data1+"&tasknum="+data2;
	window.open(spath,"toScheduleDJ");
}
</script>
</html>