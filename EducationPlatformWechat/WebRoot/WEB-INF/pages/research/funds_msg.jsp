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
</style>
<title>经费查询</title>
</head>
<body >
	<table cellspacing="10">
    	<tr><td style="width: 30%;font-size: 17px;">项目名称：</td>
    		<td style="font-size: 17px;">${name}</td>
    	</tr>
     </table>
     <input id="name" type="hidden" value="${name}">
	  <div class="page">
       <div class="page__bd" >
          <div class="weui-tab">
            <div class="weui-navbar">
                <div class="weui-navbar__item weui-bar__item_on" style="border: 0px;border-bottom: 2px solid #B4F0C6;"> 经费支出</div>
                <div class="weui-navbar__item" style="border: 0px;border-bottom: 2px solid #B4F0C6;">经费预算</div>
            </div>
            <div class="weui-tab__panel">
				<div class="weui-tab__content page_feedback">
				<table cellspacing="10">
			    	<tr><td style="width: 70%;font-size: 17px;height: 20px;">项目名称：</td>
			    		<td style="font-size: 17px;">
			    			<a style="float: left;margin-right: 5px;width:99%;" href="javascript:toRegistration('${id}');" class="weui-btn weui-btn_mini weui-btn_primary">支出登记</a>
			    		</td>
			    	</tr>
			    </table>
				<c:forEach var="project" items="${list}">
						<HR style="FILTER: alpha(opacity=100,finishopacity=0,style=3)" width="100%" color=#BCBCBC SIZE=1>
	                    <table class="altrowstable" id="alternatecolor" align="center" style="width: 100%">
	                    	<tr><td style="width: 100px">支出金额(元)：</td><td>${project.amount}</td></tr>
	                    	<tr ><td >支出人：</td><td>${project.expendusername}</td></tr>
	                    	<tr><td >经费科目名称：</td><td>${project.buditemname}</td></tr>
	                    	<tr><td >支出时间：</td><td>${project.expenddate.substring(0,10)}</td></tr>
	                    	<tr><td >支出详细说明：</td><td id="dept">${project.expendremark}</td></tr>
	                    </table>
	                    <HR style="FILTER: alpha(opacity=100,finishopacity=0,style=3)" width="100%" color=#BCBCBC SIZE=8>
	            </c:forEach>
	            <c:if test="${list.size()==0}">
	            	<div style="padding-top:20px; text-align:center; width: 98%;margin-left:1%;height: 60px;border:1px solid #cccccc;border-radius:5px;margin-top: 5px;">
						<span style="color: red;font-size: 18px;">暂无数据</span>
					</div>
	            </c:if>
                </div>
                <div class="weui-tab__content hide">
                	<%-- <br/>
                	<h4 style="color: #1AAD19">&nbsp;&nbsp;| 立项总经费：${amount}</h4>
                	<br/> --%>
                	 <c:if test="${list2.size()==0}">
			            <br/>
			            <h2 style="height: 50%;color: red" align="center">暂无数据 !</h2>
		            </c:if>
                  	<table class="altrowstable" id="alternatecolor" align="center" style="width: 100%">
                  		<c:forEach var="entity" items="${list2 }" >
                    	<tr><td style="width: 120px">${entity.buditemname}:</td><td>${entity.amount}</td></tr>
                    	</c:forEach>
                    </table>
                    <HR style="FILTER: alpha(opacity=100,finishopacity=0,style=3)" width="100%" color=#BCBCBC SIZE=1>
                </div>
            </div>
        </div>
    </div>
   </div>
</body>
<script type="text/javascript">
 $(function(){
	$('.weui-tab__panel div').eq(0).show()

})  

    //tab切换    
$(function(){
  var aLi = $('.weui-navbar__item');
    aLi.on('click', function () {
        $(this).addClass('weui-bar__item_on').siblings('.weui-bar__item_on').removeClass('weui-bar__item_on');
        var index = $(this).index();
        $('.weui-tab__panel div').eq(index).show().siblings().hide();
    });
});
function toRegistration(data){
var spath = "kyProject.do?method=toRegistration&id="+data+"&name="+$("#name").val();
	window.open(spath,"toRegistration");
}
</script>
</html>