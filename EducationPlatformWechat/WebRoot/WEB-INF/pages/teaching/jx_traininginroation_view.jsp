<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" pageEncoding="GBK"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="/codetag" prefix="code"%>
<%@ taglib uri="/printDep" prefix="dep"%>

<jsp:directive.page import="com.saint.systemManager.bean.FrmDepartmentEntity"/>
<jsp:directive.page import="com.saint.pub.Tools"/>
<jsp:directive.page import="com.saint.constant.Constant"/>
<html>
<head>
  <meta charset="gbk">
  <title>新增班级信息</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1" />
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="layui/css/layui.css"  media="all">
  <link rel="stylesheet" type="text/css" href="layuis/css/common_main.css"/>
  <script type="text/javascript" src="jquery/jquery-1.7.2.min.js"></script>
  <script src="layui/layui.js"  charset="gbk"></script>
  <script type="text/javascript" src="js/common/<%=Constant.CODEJSNAME%>"></script><!--字段翻译  -->
  <script type="text/javascript" src="js/common/<%=Constant.GLBMJSNAME%>"></script><!--字段翻译  -->
  <script type="text/javascript" src="js/common/translation.js"></script><!--字段翻译  -->
  <style type="text/css">
  		body{
  			margin-top: -10px;
  		}
  		.layui-input{
			height:38px;
		}
		.layui-form-item .layui-input-inline {
		    margin-right: 0px;
		}
  		 table.imagetable {
          font-family: verdana,arial,sans-serif;
          font-size:11px;
          color:#333333;
          border-width: 1px;
          border-color: #999999;
          border-collapse: collapse;
       }
        table.imagetable th {
          background:#ededed url('cell-blue.jpg');
          border-width: 1px;
          padding: 8px;
          border-style: solid;
       }
        table.imagetable td {
         background:#f2f2f2 url('cell-grey.jpg');
          border-width: 1px;
          padding: 8px;
          border-style: solid;
      }
  </style>
</head>
<body>
	<table  id="dataList" class="imagetable" align="center" style="width:100%;height: 90%;margin-top: 10px">
		<tr><th align="center">轮训科室</th><th>开始时间</th><th>结束时间</th></tr>
		<c:forEach var="dept" items="${list }">
			<tr><th align="center">${dept.remark1 }</th><th>${dept.startdate.substring(0,10) }</th><th>${dept.enddate.substring(0,10) }</th></tr>
		</c:forEach>
	</table>
	<br>
</body>
<script type="text/javascript">
</script>
</html>
