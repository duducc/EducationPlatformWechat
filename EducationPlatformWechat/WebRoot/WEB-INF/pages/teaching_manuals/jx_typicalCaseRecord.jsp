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
	<!-- 病例讲解登记 -->
    <title>座谈</title>
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
 		.in_but{
			width: 100%;
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
<form class="layui-form layui-form-pane" action=""  id="baseform" method="post">
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
        		<div style="padding: 3px;overflow-y:auto;height: 89%;">	
        			<div class="layui-form-item" style="margin-top: -3px;">
					    <label class="layui-form-label">座谈时间：</label>
					    <div class="layui-input-inline">
					      <input id="zttime" type="text" name="zttime" value="${entity.zttime.substring(0,19) }" lay-verify="zttime" placeholder="YYYY-MM-dd" autocomplete="off" class="layui-input" style="height:38px;" readonly="readonly">
					    </div>
					</div>	    
					<%-- <div class="layui-form-item">
					    <label class="layui-form-label">病人姓名：</label>
					    <div class="layui-input-inline">
					      <input id="patient" type="text" name="patient" value="${entity.patient }"  lay-verify="patient" placeholder="请输入姓名" autocomplete="off" class="layui-input" style="height:38px;">
					    </div>
					</div>
					<div class="layui-form-item">
					    <label class="layui-form-label">性   别：</label>
					    <div class="layui-input-inline">
				      	<select  id="patientSex" name="patientSex" lay-verify="patientSex" style="width: 99%;" class="weui_input">
						 	<code:printCode dmjc="XB" defaultValue="${entity.patientSex}" type="1"/>
						</select>
				    </div>
					</div>
					<div class="layui-form-item">
					    <label class="layui-form-label">年    龄：</label>
					    <div class="layui-input-inline">
					      <input id="patientAge" type="text" name="patientAge" value="${entity.patientAge }"  lay-verify="patientAge" placeholder="请输入年龄" autocomplete="off" class="layui-input" style="height:38px;">
					    </div>
					</div>
					<div class="layui-form-item">
					    <label class="layui-form-label">病历号：</label>
					    <div class="layui-input-inline">
					      <input id="patientBlh" type="text" name="patientBlh" lay-verify="patientBlh" value="${entity.patientBlh }"  placeholder="请输入病历号" autocomplete="off" class="layui-input" style="height:38px;">
					    </div>
					</div>
					<div class="layui-form-item">
					    <label class="layui-form-label">诊断：</label>
					    <div class="layui-input-inline">
					      <input id="cfDiagnose" type="text" name="cfDiagnose" value="${entity.cfDiagnose }" lay-verify="cfDiagnose" placeholder="请输入..." autocomplete="off" class="layui-input" style="height:38px;">
					    </div>
					</div>
					<div class="layui-form-item">
					    <label class="layui-form-label">讲授教师：</label>
					    <div class="layui-input-inline">
					    	<input id="teacherId" type="hidden" name="teacherId" lay-verify="teacherId" value="${entity.teacherId }" >
					      	<input id="teacherName" type="text" name="teacherName" value="${entity.teacherName }" lay-verify="teacherName" placeholder="请选择教师" autocomplete="off" class="layui-input" style="height:38px;width: 60%;float: left;" readonly="readonly">
					      	<button style="float: left;height: 38px;width: 40%;" class="layui-btn layui-btn-sm" type="button" onclick="getteacher();"><i class="layui-icon">&#xe615;</i>查询</button>
					    </div>
					</div> --%>
					<div class="layui-form-item layui-form-text">
					 	<label class="layui-form-label">座谈地点</label>
					    <div class="layui-input-block" style="margin-top: -5px;">
					      <textarea placeholder="请输入内容" class="layui-textarea" id="position" name="position" lay-verify="position" style="height: 50px;">${entity.position }</textarea>
					 	</div>
					</div>
					<div class="layui-form-item layui-form-text">
					 	<label class="layui-form-label">
					 	参加学生
					 	<button type="button" class="layui-btn" style="margin-top: -9px;float: right;margin-right: -15px;" onclick="getStu();"><i class="layui-icon">&#xe654;</i>添加学员</button>
					 	<button type="button" class="layui-btn" style="margin-top: -9px;float: right;margin-right: -15px;" onclick="returnStu();"><i class="layui-icon">&#xe669;</i>重选</button>
					 	</label>
					    <div class="layui-input-block" style="margin-top: -5px;">
					    	<input id="otherstudentid" type="hidden" name="otherstudentid" lay-verify="otherstudentid" value="${entity.otherstudentid }" >
					      	<textarea placeholder="请选择参加学生" class="layui-textarea" id="otherstudentname" name="otherstudentname" readonly="readonly" lay-verify="otherstudentname" style="height: 80px;">${entity.otherstudentname }</textarea>
					 	</div>
					</div>
					<div class="layui-form-item layui-form-text">
					 	<label class="layui-form-label">
					 	参加教师
					 	<button type="button" class="layui-btn" style="margin-top: -9px;float: right;margin-right: -15px;" onclick="getEmp();"><i class="layui-icon">&#xe654;</i>添加教师</button>
					 	<button type="button" class="layui-btn" style="margin-top: -9px;float: right;margin-right: -15px;" onclick="returnEmp();"><i class="layui-icon">&#xe669;</i>重选</button>
					 	</label>
					    <div class="layui-input-block" style="margin-top: -5px;">
					    	<input id="jzPersonid" type="hidden" name="jzPersonid" lay-verify="jzPersonid" value="${entity.jzPersonid }" >
					      	<textarea placeholder="请选择参加人员" class="layui-textarea" id="jzPersonname" name="jzPersonname" readonly="readonly" lay-verify="jzPersonname" style="height: 50px;">${entity.jzPersonname }</textarea>
					 	</div>
					</div>
					<div class="layui-form-item layui-form-text">
					 	<label class="layui-form-label">座谈内容</label>
					    <div class="layui-input-block" style="margin-top: -5px;">
					      <textarea placeholder="请输入内容" class="layui-textarea" id="contento" name="contento" lay-verify="contento" rows="15">${entity.contento }</textarea>
					 	</div>
					</div>
				</div>
				<!---------------------------------------------------------- 底部菜单-------------------------------------------------------->
				<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;text-align: center;">
				    <div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 50%;">
				      	<button type="button" class="layui-btn"  lay-submit="submit" lay-filter="submit"><i class="layui-icon">&#x1005;</i>立即提交</button>
			    	</div>
			    	<div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 50%;">
				      		<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>关闭</button>
			    	</div>
				    <c:if test="${opinion ==1 }">
				    	<div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 50%;">
					      	<button name="closeBtn" type="button" class="layui-btn layui-btn-danger" onclick="deletedata();"><i class="layui-icon">&#xe640;</i>删除</button>
				    	</div>
				    </c:if>
				</div>
				<!---------------------------------------------------底部菜单 ----------------------------------------------------- -->
    	</div>
	</div>
</form>
<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script>

function close_windos(){WeixinJSBridge.call('closeWindow')}
layui.use(['form', 'layedit', 'laydate','element'], function(){
	  var $ = layui.jquery,element = layui.element;
	  var opinion = $("#opinion").val();
	  var form = layui.form,
	  layer = layui.layer,
	  layedit = layui.layedit,
	  laydate = layui.laydate;
	  //日期
	  laydate.render({elem: '#zttime',type: 'datetime',theme: 'molv'});
	  form.render();
	  //laydate.render({elem: '#endDate',type: 'datetime'});
	  //创建一个编辑器
	  var editIndex = layedit.build('LAY_demo_editor');
	  //自定义验证规则
	  form.verify({
		  zttime: function(value){if(value==""||value==null){return '请选择时间！'}},
		  patient: function(value){if(value==""||value==null){return '请输入病人姓名！'}},
		  blh: function(value){if(value==""||value==null){return '请输入病历号！'}},
		  cfDiagnose: function(value){if(value==""||value==null){return '请输入诊断内容！'}},
		  contento: function(value){if(value==""||value==null){return '请填写病例特点！'}},
		  contentt: function(value){if(value==""||value==null){return '请填写讲授内容！'}},
	  });
	  //监听提交
	  form.on('submit(submit)', function(data){
	  	  var openid = $("#openid").val();
	  	  var clientsxh = $("#clientsxh").val();
	      var deptid = $("#deptid").val();
		  var lxxh = $("#lxxh").val();
          var taskinfo = JSON.stringify(data.field);
          var url = "";
          if(opinion==0){
        	  url = "Jxteacherman.do?method=insertJxTeachingManuals";
          }else{
        	  url = "Jxteacherman.do?method=updateJxTeachingManuals";	        	
          }
	  	  document.getElementById('up_div').style.display ='block';
          $.post(url,{Info:encodeURI(taskinfo),openid:openid,clientsxh:clientsxh},function (data, status) {
              if( status=="success" ){
                  var json = eval(data);
                  switch (json.errorMsg) {
                      case "success":		//成功
                          $.toast("登记成功");
                          document.getElementById('up_div').style.display ='none';
                      	  setTimeout(fanhui(),1500);
                          break;
                      case "failed":		//失败
                    	  layer.alert("添加失败", {title: '提示信息'});
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
		
		/* =======================================获取人员信息========================================= */
		var height= $("body").height();
		var width= $("body").width();
		var layer_query_index_stu;
		function getStu(){
			layer_query_index_stu = layer.open({
				type: 2,
				skin: 'demo-class',
				area: [(width-50)+'px', (height-100)+'px'],
				title: "学员信息",
				shade: 0.8,
				id: layer_query_index_stu,
				btnAlign: 'c',
				moveType: 1,
				content: 'jxStudents.do?method=toQueryStudents',
				success: function(layero){}
			});
		}
		function closeQueryLayerStu(data){
			/*  */
			var otherstudentid = $("#otherstudentid").val();
			var otherstudentname = $("#otherstudentname").val();
			if(otherstudentid.indexOf(data.xh) == -1){
				if(otherstudentid!=""){
					$("#otherstudentid").val(otherstudentid+','+data.xh);
					$("#otherstudentname").val(otherstudentname+','+data.name);
				}else{
					$("#otherstudentid").val(data.xh);
					$("#otherstudentname").val(data.name);
				}
			}else{
				layer.close(layer_query_index_stu);
				$.alert("已经有该人员！");
			}
		}
		function returnStu(){
			$("#otherstudentid").val("");
			$("#otherstudentname").val("");
		}
		
		//-------------------------------------------------添加教师--------------------------------------------
		var layer_query_index_emp;
		function getEmp(){
			layer_query_index_emp = layer.open({
				type: 2,
				skin: 'demo-class',
				area: [(width-50)+'px', (height-100)+'px'],
				title: "教师信息",
				shade: 0.8,
				id: layer_query_index_emp,
				btnAlign: 'c',
				moveType: 1,
				content: 'xfemployee.do?method=toQueryPerson',
				success: function(layero){}
			});
		}
		function closeQueryLayer(data){
			/*  */
			var jzPersonid = $("#jzPersonid").val();
			var jzPersonname = $("#jzPersonname").val();
			if(jzPersonid.indexOf(data.usernumber) == -1){
				if(jzPersonid!=""){
					$("#jzPersonid").val(jzPersonid+','+data.usernumber);
					$("#jzPersonname").val(jzPersonname+','+data.username);
				}else{
					$("#jzPersonid").val(data.usernumber);
					$("#jzPersonname").val(data.username);
				}
			}else{
				layer.close(layer_query_index_emp);
				$.alert("已经有该人员！");
			}
		}
		function returnEmp(){
			$("#jzPersonid").val("");
			$("#jzPersonname").val("");
		}
		
		function deletedata(){
			if (confirm("是否确定删除？")) { 
				  var xh = $("#xh").val();
				  var url = "Jxteacherman.do?method=deleteJxTeachingManuals";
	              $.post(url,{xh:xh},function (data, status) {
	                  if( status=="success" ){
	                      var json = eval(data);
	                      switch (json.errorMsg) {
	                          case "success":		//成功
		                          $.toast("删除成功");
		                          setTimeout(fanhui(),1500);
		                          break;
	                          case "failed":		//失败
	                        	  layer.alert("删除失败", {title: '提示信息'});
	                              break;
	                          case "error":		//服务器异常
	                              layer.alert("服务器异常，稍后再试！", {title: '警告'});
	                              break;
	                      }
	                  }else{
	                      layer.alert("操作失败！", {title: '警告'});
	                  }
	            },"json");
			}
		}
		
		function fanhui(){
	 		var openid = $("#openid").val();
	 		var clientsxh = $("#clientsxh").val();
	 		var deptid = $("#deptid").val();
			var lxxh = $("#lxxh").val();
	 		window.location.href="Jxteacherman.do?method=toAddTeachingmanuals&openid="+openid+"&clientsxh="+clientsxh+"&deptid="+deptid+"&lxxh="+lxxh;
		};
</script>
</body>
</html>
