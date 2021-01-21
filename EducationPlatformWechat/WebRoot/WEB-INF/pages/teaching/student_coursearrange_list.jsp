<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="GBK"%>
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
    <title>我的课程</title>
    <meta charset="GBK">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/example.css">  
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
    <link rel="stylesheet" type="text/css" href="css/loading.css"/>
    <script src="js/jquery.1.7.2.min.js"></script>
    <script src="js/jweixin-1.0.0.js"></script>
    <script src="layui/layui.all.js" charset="utf-8"></script>
    <style type="text/css">
		.weui_tab{
			 position:absolute; z-index:1;
		}
		.layui-form-radio {
		    margin: 0 0 0 0;
		    padding-right: 0px;
		}
    </style>
</head>
<body>
<form class="layui-form layui-form-pane" action=""  id="mainform" method="post">
	<input type="hidden" id="openid" name="openid" value="${openid }"/>
	<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
	<input type="hidden" id = "yhdh" value="${yhdh}">
	<div class="weui_tab" style="width: 100%;">
    	<div class="weui_tab_bd">
		    <div style="width: 100%;height: 13%;border-bottom:  1px solid #D2D2D2;padding: 3px;">
		    	<div class="layui-form-item">
		    		<label class="layui-form-label" style="width: 30%;float: left;">课程：</label>
				    <input id="coursename" type="text" placeholder="请输入" autocomplete="off" class="layui-input" style="height:38px;width: 68%;float: left;">
				</div>
				<div class="layui-form-item" style="margin-top: -15px;">
					<label class="layui-form-label" style="width: 30%;float: left;">日期：</label>
				    <input readonly="readonly" id="skdate" type="text" placeholder="请选择" autocomplete="off" class="layui-input" style="height:38px;width: 35%;float: left;">
			    	<button type="button" class="btn btn-primary disabled" id="findBtn" style="float:right;height:38px;margin-top: 0px;margin-right:10px; width: 30%; " onclick="getDataList();">查询</button>  
				</div>
		    </div>
   			<!-- 内容展现 -->
		   	<div style="overflow-y:auto;height: 87%;padding:1px;" id="task_div">
		     	
		    </div>
		    <div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
		    	<div style="margin-top: 5px;width: 100%;text-align: center;">
			     	<button name="bindingBtn" type="button" class="layui-btn" onclick="close_windos();"><i class="layui-icon">&#xe65c;</i>返回</button>
			     	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1006;</i>关闭</button>
		     	</div>
		  	</div>
		</div>
	</div>
</form>
<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script>
	function close_windos(){
		WeixinJSBridge.call('closeWindow');
	}
	
	layui.use(['form', 'layedit', 'laydate'], function(){
	  	var form = layui.form,
	  	layer = layui.layer,
	  	layedit = layui.layedit,
	  	laydate = layui.laydate;
	  	form.render();
	  	laydate.render({elem: '#skdate',type:'date',theme: 'molv'});
	});
	
	$(function(){
		getDataList();
	});
	
	function getDataList(){
		   $("#task_div").html("");
		   var skdate = $("#skdate").val();
		   var coursename = $("#coursename").val();
		   var yhdh = $("#yhdh").val();
		   var applyinfos = {};
       		applyinfos['skdate']=skdate;
       		applyinfos['coursename']=coursename;
       		applyinfos['rkjshid']=yhdh;
			var applyInfo = JSON.stringify(applyinfos);
			$.ajax({
				url:"JxCourseArrange.do?method=getLoginMessage&applyInfo="+encodeURI(applyInfo),
			  	cache: false,
			  	async: true,  
			  	type:'post',
			  	dataType:'json',
			  	contentType : "application/x-www-form-urlencoded; charset=utf-8", 
			  	success: function(data){
			  	  if(data.length>0){ 
			  		for(var i=0;i<data.length;i++){
			  			var html="<div class='weui_cells weui_cells_access'  onclick='toStudentView("+data[i].xh+","+data[i].coursenum+")'>";
			  				html+="<a class='weui_cell' href='javascript:;'>";
			  				html+="<div class='weui_cell_bd weui_cell_primary'>";
			  				html+="<p style='width: 70%;font-size:0.8em;'><i class='layui-icon' style='color: #ef5268'></i>"+data[i].coursename+"<span>【"+data[i].skdate.substring(0,10)+"</span>"+"】</p>";
			  				html+="</div>";
				  			html+="	<div class='weui_cell_ft' style='font-size:0.8em;'><span style='color:green'>查看详情</span><i class='layui-icon' style='color:green'>&nbsp;&nbsp;&#xe60a;</i></div>";
				  			html+="</a>";
				  			html+="</div>";
			  				$("#task_div").append(html);
			  		}
			  	  }else{
			  		var html="<div style='width:100%;height:100px;margin-top: 15px;text-align: center;line-height:100px; '>";
	  				html += "<span style='color:red;'>";
	  				html += "暂无数据";
	  				html += "</span>";
		  			html += "</div>";	
		  		$("#task_div").append(html);
			  	  }	
			    },
			}); 
		}
	   
	   var to_Search_message;
	   function toStudentView(xh,num){
		    var url="JxCourseArrange.do?method=getTeacherXxMessage&xh="+xh+"&num="+num;
	  		var width=$("body").width();
			var height=$("body").height();
			 to_Search_message = layer.open({
			    type: 2,
			    title: '课程信息',
		        area: [width/1.05+'px', height/1.05+'px'],
			    shade: 0.8,
			    maxmin: false,
			    offset: 'auto',
			    move:false,
			    content: url,
			    zIndex: layer.zIndex ,
			    success: function(layero){
			    	layer.setTop(layero)
			    }
		    });
	   }
</script>
</body>
</html>
