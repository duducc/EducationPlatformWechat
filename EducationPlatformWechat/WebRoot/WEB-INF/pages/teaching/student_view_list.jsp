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
    <title>评价列表</title>
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
</head>
<body >
	<input type="hidden" id = "clientsxh" value="${clientsxh}">
	<input type="hidden" id = "openid" value="${openid}">
	<input type="hidden" id = "xh" value="${xh}">
	<form class="layui-form" style="width: 100%;height: 45px">
			<div class="layui-inline" style="width: 50%;float: left">
	    		<select  id="classid" name="classid" lay-filter="classid" onChange="classZu()">
				 </select>
	  		</div>
			<div class="layui-inline"style="width: 50%;float: right">
	    		<select  id="zuid" name="zuid" lay-verify="zuid" lay-filter="zuid">
				 </select>
	  		</div>
	  		<input value="" placeholder="请输入学生姓名" class="layui-input" name="name" id="name" type="text" style="width: 50%;height: 40px;float: left">
  		   <button type="button" class="btn btn-primary disabled" id="findBtn" style="float:right;height:40px;margin-top: 1px;width: 48%; " onclick="getDataList();">查询</button>   
	</form>
	<%-- <div style="margin-top: 50px" id="viewList">
	 <c:forEach var="entity"   items="${entityList}">
        	 <div class='weui_cells weui_cells_access'  onclick="toStudentView('${entity.xh}')">
  				<a class='weui_cell' href='javascript:;'>
  				<div class='weui_cell_bd weui_cell_primary'>
  				<p style='width: 70%'><i class="layui-icon" style="color: #ef5268">&nbsp;&nbsp;&#xe66f;</i>&nbsp;&nbsp;${entity.studentname}</p>
  				</div>
  				<div class='weui_cell_ft' style='font-size:0.8em;'><span style='color:#ef5268'>查看详情</span><i class="layui-icon" style="color: #ef5268">&nbsp;&nbsp;&#xe60a;</i></div>
				</a>
			</div>
	</c:forEach> --%>
	<div style="margin-top: 50px" id="task_div"></div>
	</div>
</body>
<script src="layui/layui.all.js" charset="utf-8"></script>
<script type="text/javascript">
	layui.use('form' ,function(){
		 form = layui.form;
		 form.render();
		 form.on('select(classid)', function(data){
 				var url = 'jxClassStudents.do?method=getListClass&classid='+data.value;
				$.post(url,{},function(data){
					var json = eval(data);
					console.log(json);
					var zushu=json.zushu;
					  var obj=document.getElementById('zuid') 
					  obj.options.length=0; 
			    obj.options.add(new Option("请选择组名",""));
				for (var i=1;i<=zushu;i++) 
				{ 
				obj.options.add(new Option(i+"组",$("#classid").val()+""+i)); 
				} 
				layui.use('form' ,function(){
				 var form = layui.form;
				 form.render();
			})
				},"json")
		});
	})
	
	$(function(){
		var classNames;
		var classIds;
		var url = 'jxClassStudents.do?method=getListClass';
		$.post(url,{},function(data){
			var json = eval(data);
			classNames=json.classNames.split(",");
			classIds=json.classIds.split(",");
			  var obj=document.getElementById('classid') 
	    obj.options.add(new Option("请选择班级",""));
		for (var i=0;i<classNames.length-1;i++) 
		{ 
		obj.options.add(new Option(classNames[i],classIds[i])); 
		} 
		var type=$("#type").val();
		layui.use('form' ,function(){
		 var form = layui.form;
		 form.render();
	})
		},"json")
	});
   function toStudentView(xh){
   		var url = "jxEvaluateTeacher.do?method=toEvaluateViewPage&xh="+xh+"&clientsxh="+$("#clientsxh").val()+"&openid="+$("#openid").val();
   		window.open(url,"toBonusMsg");
   		/* var width=$("body").width();
		var height=$("body").height();
	    layer.open({
		    type: 2 ,
		    title: '评价教师',
		    area: [width+'px', height+'px'],
		    shade: 0,
		    maxmin: false,
		    offset: 'rt',
		    content: url,
		    zIndex: layer.zIndex ,
		    success: function(layero){layer.setTop(layero)}
	    }); */
   }
   $(function(){
		getDataList();
	});
	
	function getDataList(){
		$("#task_div").html("");
		var name = encodeURI(encodeURI($("#name").val()));
		var clientsxh = $("#clientsxh").val();
		var openid = $("#openid").val();
		var classid = $("#classid").val();
		var zuid = $("#zuid").val();
		var xh = $("#xh").val();
		$.ajax({
			url:"jxEvaluateTeacher.do?method=viewList&name="+name+"&clientsxh="+clientsxh+"&openid="+openid+"&classid="+classid+"&zuid="+zuid+"&xh="+xh,
		  	cache: false,
		  	async: true,  
		  	type:'post',
		  	dataType:'json',
		  	contentType : "application/x-www-form-urlencoded; charset=utf-8", 
		  	success: function(data){
		  	/*<div class='weui_cells weui_cells_access'  onclick="toStudentView('${entity.xh}')">
  				<a class='weui_cell' href='javascript:;'>
  				<div class='weui_cell_bd weui_cell_primary'>
  				<p style='width: 70%'><i class="layui-icon" style="color: #ef5268">&nbsp;&nbsp;&#xe66f;</i>&nbsp;&nbsp;${entity.studentname}</p>
  				</div>
  				<div class='weui_cell_ft' style='font-size:0.8em;'><span style='color:#ef5268'>查看详情</span><i class="layui-icon" style="color: #ef5268">&nbsp;&nbsp;&#xe60a;</i></div>
				</a>
			</div>  */
		  		var list = eval(data.entitylist);
		  		console.log(list)
				for(var i=0;i<list.length;i++){
		  			var html="<div class='weui_cells weui_cells_access'  onclick='toStudentView("+list[i].studentid+")'>";
		  				html+="<a class='weui_cell' href='javascript:;'>";
		  				html+="<div class='weui_cell_bd weui_cell_primary'>";
		  				html+="<p style='width: 70%'><i class='layui-icon' style='color: #ef5268'>&nbsp;&nbsp;&#xe66f;</i>&nbsp;&nbsp;"+list[i].studentname+"</p>";
		  				html+="</div>";
			  			html+="	<div class='weui_cell_ft' style='font-size:0.8em;'><span style='color:#ef5268'>查看详情</span><i class='layui-icon' style='color: #ef5268'>&nbsp;&nbsp;&#xe60a;</i></div>";
			  			html+="</a>";
			  			html+="</div>";
		  				$("#task_div").append(html);
		  		}
		    },
		}); 
	}
</script>
</body>
</html>
