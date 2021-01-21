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
    font-size:16px;
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
<title>奖金详细</title>
</head>
<body  >
		<header class='demos-header'>
         <h3 class="demos-title">奖金明细</h3>
   		</header>
        <table class="altrowstable" id="alternatecolor" align="center" style="width: 100%">
        	<tr><td style="width: 120px">标题摘要：</td><td>${entity.title}</td></tr>
        	<tr><td >关联成果：</td><td>${entity.resultid}</td></tr>
        	<tr><td >奖金类型：</td><td>${entity.bonustype}</td></tr>
        	<tr><td >奖金金额(元)：</td><td>${entity.amount}</td></tr>
        </table>
                
</body>
<script type="text/javascript">

function toProject(data){
alert(data)
}
$(function(){
	var xh ;
	var value;
	$("table").each(function(){  // 获取表格table中，第几个td的文本
	xh =$(this).find('td').eq(3).text();
	value = $(this).find('td').eq(5).text();
	})
	if(value=='1')$(this).find('td').eq(5).text("课题中标奖")
	if(value=='2')$(this).find('td').eq(5).text("课题津贴")
	if(value=='3')$(this).find('td').eq(5).text("发表论文后奖励")
	if(value=='4')$(this).find('td').eq(5).text("出版学术著作后奖励")
	if(value=='5')$(this).find('td').eq(5).text("申报成果后奖励")
	if(value=='6')$(this).find('td').eq(5).text("成果获奖后奖励")
	if(value=='7')$(this).find('td').eq(5).text("获得专利后奖励")
	$.ajax({
			url:"kybonus.do?method=translate&xh="+xh,
		  	cache: false,
		  	async: true,  
		  	type:'post',
		  	dataType:'json',
		  	success: function(data){
		  		var entity = eval(data);
		  		$("table").each(function(){  // 获取表格table中，第几个td的文本
					$(this).find('td').eq(3).text(entity.data.resname);
				})
			}
		}); 
})

</script>
</html>