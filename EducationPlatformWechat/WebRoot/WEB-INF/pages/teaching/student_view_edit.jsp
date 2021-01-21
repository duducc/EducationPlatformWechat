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
    <title>评价详情</title>
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
	
	<style type="text/css">
	td{
			algin:center;
			border: 1px solid #7d848d;
			font-size:1.0em;
			height:30px;
			color: #a7abae;
			}
	.c{
		display:inline;
		}

	
	</style>
</head>
<body >
	<c:forEach var="checkvalue" items="${checkboxvalue }" varStatus="ra">
	<input type="hidden" id="radio5Value" value="${checkboxvalue.get(ra.index).question1 }">
	</c:forEach>
	<input type="hidden" id="checkSize" value="${checkboxvalue.size() }">
	<from class="layui-form">
	<div style="width: 100%;height: 100px">
	<br>
	<table style="width: 100%;margin: auto">
		<!-- ------------------------------------------------------单选----------------------------------------------------------------- -->
		<c:forEach var="radio" items="${radioList }" varStatus="ra">
			<tr><td style="width: 60%"><i class="layui-icon" style="color: ${radio.remark5.split('@')[0] }">&nbsp;&nbsp;${radio.remark5.split('@')[1] }</i>&nbsp;&nbsp;&nbsp;&nbsp;${radio.name }</td><td style="text-align: center">
			<from class="layui-form">
			<c:forEach var="value" begin="1" end="${radio.remark1.split('@')[0] }" varStatus="va">
			<input class="c" type="radio" name="radioo${ra.index }" value="${radio.remark1.split('@')[0]-va.index+1 }" title="${radio.remark1.split('@')[va.index]}" <c:if test="${va.index==radiovalue.get(ra.index).question1 }"> checked=""</c:if>style="width: 25%">
			</c:forEach>
		    </from>
    		</td></tr>
		</c:forEach>
		<!-- ------------------------------------------------------单选结束----------------------------------------------------------------- -->
		
		<!-- ------------------------------------------------------多选----------------------------------------------------------------- -->
		<c:forEach var="checkbox" items="${checkboxList }" varStatus="ch">
			<tr><td style="width: 100%" colspan="2"><i class="layui-icon" style="color: ${checkbox.remark5.split('@')[0] }">&nbsp;&nbsp;${checkbox.remark5.split('@')[1] }</i>&nbsp;&nbsp;&nbsp;&nbsp;${checkbox.name }<br> 
				<from class="layui-form">
				  	<c:forEach var="value" begin="1" end="${checkbox.remark1.split('@')[0] }" varStatus="va">
						<div <c:if test="${va.index%2==1 }">style="float:left;margin-left: 15px"</c:if><c:if test="${va.index%2==0 }">style="float:right;margin-right: 5px"</c:if>>
						<input  type="checkbox" name="checkbox${ch.index}" value="${va.index+1 }" lay-skin="primary"  title="${checkbox.remark1.split('@')[va.index]}" >
						</div>
					</c:forEach>
			      <textarea placeholder="请输入内容" name="checkboxQuestion${ch.index+1 }" readonly="readonly"  lay-verify="question"class="layui-textarea">${checkboxvalue.get(ch.index).question1.split('@')[1]=='*'?"":(checkboxvalue.get(ch.index).question1.split('@')[1])}</textarea>
		      	</from>
	      	</td></tr>
		</c:forEach>
		
		<!-- ------------------------------------------------------多选结束----------------------------------------------------------------- -->
		
		<!-- ------------------------------------------------------客观问题----------------------------------------------------------------- -->
		<c:forEach var="question" items="${questionList }" varStatus="qu">
			<tr><td style="width: 100%" colspan="2"><i class="layui-icon" style="color: ${question.remark5.split('@')[0]}">&nbsp;&nbsp;${question.remark5.split('@')[1]}</i>&nbsp;&nbsp;&nbsp;&nbsp;${question.name }<textarea placeholder="请输入内容" name="question"   lay-verify="question"class="layui-textarea">${questionvalue.get(qu.index).question1 }</textarea></td></tr>
		</c:forEach>
		<!-- ------------------------------------------------------主观问题结束----------------------------------------------------------------- -->
	</table>
	<br>
	</div>
	</from>
</body>
<script src="layui/layui.all.js" charset="utf-8"></script>
<script type="text/javascript">
   		$(function(){
   			$("input").attr("disabled", true); 
   			var checkSize = $("#checkSize").val();
   			for(var a = 0;a<checkSize;a++){
	   			var radio5 = $("#radio5Value").val();
	   			radio5 = radio5.split(".");
	   			console.log(radio5);
	   			var boxes = document.getElementsByName("checkbox"+a); //----根据name获取页面上的复选框
				
				//循环值，默认勾选处理
				for(i=0;i<boxes.length;i++){
					for(j=0;j<=radio5.length;j++){
						if(boxes[i].value == radio5[j]){
						boxes[i].checked = true;
						}
					}
				}
			}
			layui.use(['form', 'layedit', 'laydate','upload'], function(){
			  var form = layui.form
	   		form.render();
	   		})
   		})
</script>
</body>
</html>
