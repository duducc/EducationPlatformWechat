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
    <title>入科教育</title>
    <meta charset="utf-8">
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
<!-- -----------------------------------------等待页面--------------------------------------------- -->
<div id="up_div" class="up_div">
	<div style="width: 100%;" id="bet_ondiv"></div>
	<div class="bet_div" id="bet_div">
		<div style="width: 100%;height: 10px;"></div>
		<div style="height: 70px;width: 60%;margin-left:20%;">
			<img src="images/loadingwx.gif" style="width: 100%;">
		</div>
		<div style="width: 100%;height: 5px;"></div>
		<div style="width: 100%;text-align: center;">
			<span style="font-size: 13px;">请稍后</span>
		</div>
	</div>
</div>
<!-- ---------------------------------------------------------------------------------------------- -->
<form class="layui-form layui-form-pane" action=""  id="mainform" method="post">
	<input type="hidden" id="openid" name="openid" value="${openid }"/>
	<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
	<input type="hidden" id="stuId" name="stuId" lay-verify="stuId" value="${bindinfo.yitongCard }"/>
	<input type="hidden" id="stuName" name="stuName" lay-verify="stuName" value="${bindinfo.xm }"/>
	<input type="hidden" id="deptid" name="deptid" lay-verify="deptid" value="${deptid }"/>
	<input type="hidden" id="deptname" name="deptname" lay-verify="deptname" value="${deptname }"/>
	<input type="hidden" id="xh" name="xh" lay-verify="xh" value="${entity.xh }"/>
	<input type="hidden" id="classid" name="classid" lay-verify="classid" value="${lunxun.classid }"/>
	<input type="hidden" id="classname" name="classname" lay-verify="classname" value="${lunxun.classname }"/>
	<input type="hidden" id="zuid" name="zuid" lay-verify="zuid" value="${lunxun.zuid }"/>
	<input type="hidden" id="zuname" name="zuname" lay-verify="zuname" value="${lunxun.zuname }"/>
	<input type="hidden" id="type" name="type" lay-verify="type" value="${type }"/>
	<input type="hidden" id="opinion" name="opinion" value="${opinion }"/>
	
	<input type="hidden" id="lxxh" name="lxxh" value="${lxxh }"/>
	
	<div class="weui_tab" style="width: 100%;">
    	<div class="weui_tab_bd">
		    <div style="width: 100%;height: 80px;border-bottom: 0px solid #cccccc;background-color: #65B39D;">
				<div style="width: 25%;height: 80px;float: left;">
					<button style="width: 70px;height: 70px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;background-color: #65B39D" >
						<img src="images/boolean/qt.png" style="width: 70px;height: 70px;margin-left: 3px;" onclick="MillisecondToDate('-661000');">
					</button>
				</div>
				<div style="width: 45%;height: 80px;float: left;">
					<div style="width: 100%;margin-top: 16px;">
						<span style="color: #fff;font-size: 18px;"><b>${bindinfo.xm }</b></span><br>
						<span style="color: #fff;font-size: 15px;">${deptname}</span>
					</div>
				</div>
			</div>
   			<!-- 内容展现 -->
		   	<div style="overflow-y:auto;height: 89%;" id="mainCount_div">
				<div class="layui-form-item" style="margin-top: 10px;">
				    <label class="layui-form-label" style="color:red;" >日期</label>
				    <div class="layui-input-inline">
						<input value="${entity.zttime.substring(0,10)}" type="text" name="zttime" id="zttime" lay-verify="zttime" placeholder="YYYY-MM-DD" autocomplete="off" class="layui-input" readonly="readonly">
				    </div>
			    </div>
			    <div class="layui-form-item" style="margin-top: 10px;">
				    <label class="layui-form-label" style="color:red;" >地点</label>
				    <div class="layui-input-inline">
						<input value="${entity.position}" type="text" name="position" id="position" lay-verify="position" placeholder="请输入地点" autocomplete="off" class="layui-input">
				    </div>
			    </div>
			    <div class="layui-form-item layui-form-text" style="height: 90%;">
				    <label class="layui-form-label">入科教育内容</label>
				    <div class="layui-input-block">
				      <textarea onpaste="return false" placeholder="请输入内容"  name="contento" id="contento" lay-verify="contento" rows="30" class="layui-textarea">${entity.contento}</textarea>
				    </div>
				</div>	
		    </div>
		    <div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
		    	<div style="margin-top: 5px;width: 100%;text-align: center;">
			     	<button name="bindingBtn" type="button" class="layui-btn" lay-submit="submit" lay-filter="submit"><i class="layui-icon">&#x1005;</i>立即提交</button>
			     	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>关闭</button>
		     	</div>
		  	</div>
		</div>
	</div>
</form>
<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script>
	var height= $("body").height();
	var width= $("body").width();
	document.getElementById("mainCount_div").style.height=height-135;
	
	
	layui.use(['form', 'layedit', 'laydate'], function(){
	  	var form = layui.form,
	  	layer = layui.layer,
	  	layedit = layui.layedit,
	  	laydate = layui.laydate;
	  	form.render();
	  	laydate.render({elem: '#zttime',theme: 'molv'});
	  	//创建一个编辑器
		var editIndex = layedit.build('LAY_demo_editor');
		//自定义验证规则
		form.verify({
			zttime: function(value){if(value==""||value==null){return '请选择日期！'}},
			position: function(value){if(value==""||value==null){return '请输入地点！'}},
			contento: function(value){if(value==""||value==null){return '请填写内容！'}},
		});
		form.on('submit(submit)', function(data){
			var openid = $("#openid").val();
			var clientsxh = $("#clientsxh").val();
			var deptid = $("#deptid").val();
			var lxxh = $("#lxxh").val();
	        var Info = JSON.stringify(data.field);
	        document.getElementById('up_div').style.display ='block';
	        var opinion = $("#opinion").val();
	        var url = "";
	        if(opinion==0){
	        	url = "Jxteacherman.do?method=insertJxTeachingManuals";
	        }else{
	        	url = "Jxteacherman.do?method=updateJxTeachingManuals";	        	
	        }
            $.post(url,{Info:encodeURI(Info),openid:openid,clientsxh:clientsxh},function (data, status) {
                if( status=="success" ){
                    var json = eval(data);
                    switch (json.errorMsg) {
                        case "success":		//成功
                        	document.getElementById('up_div').style.display ='none';
                        	layer.msg("提交成功！",{icon:'1'},function(){
	                        	var spath = url+"&openid="+openid+"&clientsxh="+clientsxh+"&pertype=5";
	                        	window.location.href="Jxteacherman.do?method=toAddTeachingmanuals&openid="+openid+"&clientsxh="+clientsxh+"&deptid="+deptid+"&lxxh="+lxxh;
                        	});
                        	return;
                        case "failed":		//失败
                      	  	  layer.alert("提交失败", {title: '提示信息'});
                      	  	  document.getElementById('up_div').style.display ='none';
                              break;
                        case "error":		//服务器异常
                              layer.alert("服务器异常，稍后再试！", {title: '警告'});
                              document.getElementById('up_div').style.display ='none';
                              break;
                    }
                }else{
                    layer.alert("操作失败！", {title: '警告'});
                    document.getElementById('up_div').style.display ='none';
                }
          },"json");
		});
	});	
	function close_windos(){
		WeixinJSBridge.call('closeWindow');
	}
	
	
	function getlateyear(){
		var today = new Date();
		var y = today.getFullYear();
		var m = today.getMonth() + 1;
		var d = today.getDate();
		var SelTime = (y+1) + '-' + m + '-' + d;//开始时间……
		return SelTime;
	}
	
	/* =======================================获取人员信息========================================= */
	var layer_query_index ; 
	function getteacher(){
		layer_query_index = layer.open({
			type: 2,
			skin: 'demo-class',
			area: [(width-50)+'px', (height-100)+'px'],
			title: "教师信息",
			shade: 0.8,
			id: layer_query_index,
			btnAlign: 'c',
			moveType: 1,
			content: 'xfemployee.do?method=toQueryPerson',
			success: function(layero){}
		});
	}
	function closeQueryLayer(data){
		layer.close(layer_query_index);
		$("#teacherid").val(data.usernumber);
		$("#teachrename").val(data.username);
	}
	
	function graduatesc(){
		var url = "jxStudents.do?method=toGraduateSuccessPage";
 		  window.open(url,"toGraduateSuccessPage");
	}
</script>
</body>
</html>
