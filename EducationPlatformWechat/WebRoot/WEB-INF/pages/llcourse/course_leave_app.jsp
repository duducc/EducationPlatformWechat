<%@ page language="java" pageEncoding="GBK"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="/codetag" prefix="code"%>
<%@ taglib uri="/printDep" prefix="dep"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>理论课请假</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script src="js/jquery.1.7.2.min.js"></script>
	<link rel="stylesheet" href="layui/css/layui.css"  media="all">
	<link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/demos.css">
    <link rel="stylesheet" type="text/css" href="css/loading.css"/>
	<style type="text/css">
		*{
			margin:0;
			padding:0;
		}
		.layui-form-switch {
		    height: 28px;
		    line-height: 28px;
		    min-width: 60px;
		    padding: 0 8px;
		    margin-top: 0px;
		    border-radius: 25px;
		}
		.layui-form-switch em {
		    font-size: 14px;
		}
		.layui-form-switch i {
		    top: 5px;
		}
		.layui-form-pane .layui-form-radio, .layui-form-pane .layui-form-switch {
		    margin-top: 0px;
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
  
    <form class="layui-form layui-form-pane" action="" style="width:100%; ">
    	<input type="hidden" id="openid" name="openid" value="${bindinfo.openId }"/>
		<input type="hidden" id="clientsxh" name="clientsxh" value="${bindinfo.clientsxh }"/>
		<input type="hidden" id="xh" name="xh" lay-verify="xh" value="${xh}"/>
		<input type="hidden" id="stuid" name="stuid" lay-verify="stuid" value="${bindinfo.yitongCard }"/>
		<input type="hidden" id="stuname" name="stuname" lay-verify="stuname" value="${bindinfo.xm }"/>
		<input type="hidden" id="arrangexh" name="arrangexh" lay-verify="arrangexh" value="${arr.xh }"/>
		<input type="hidden" id="courseid" name="courseid" lay-verify="courseid" value="${arr.coursenum }"/>
		<input type="hidden" id="coursename" name="coursename" lay-verify="coursename" value="${arr.coursename }"/>
		<input type="hidden" id="jshnr" name="jshnr" lay-verify="jshnr" value="${arr.jshnr }"/>
		<input type="hidden" id="emplx" name="emplx" lay-verify="emplx" value="${students.pertype}"/>
    	<!------------------------------------------------------开头 --------------------------------------------------------->
		<div class="weui_cells weui_cells_form" style="margin-top: 0px;">
	  		<div style="width: 100%;; height: 40px;border-bottom: 1px solid #cccccc;background-color:#DCDDC0; padding: 5px;">
   				<span style="color: red;font-size: 14px;margin-left: 15px;">请上传学校盖章的真实请假单。</span><br>
	   			<span style="color: red;font-size: 14px;margin-left: 15px;">带教老师若尚未绑定微信公众号，请通知绑定！</span>
	  		</div>
	   	</div>
	   	<div style="overflow-y:auto;height: 85%;background-color: #fff;" id="mainCount_div">
		   	<div class="layui-collapse" style="margin-top: 0px;" lay-accordion="">
				<div class="layui-colla-item">	
					<h2 class="layui-colla-title">课题信息</h2>
					<div class="layui-colla-content layui-show" style="font-size: 14px;">
					    <div class="layui-form-item">
						   <div style="width: 49%;border: 0px;float: left;" > 课程名称：${arr.coursename}</div> 
					    </div>
					    <div class="layui-form-item">
						   <div style="width: 40%;border: 0px;float: left;" > 任课教师：${arr.rkjshname}</div> 
						   <div style="width: 59%;border: 0px;float: left;" > 教师电话：${arr.lxdh}</div> 
					    </div>
					    <div class="layui-form-item">
						   <div style="width: 95%;border: 0px;float: left;" > 上课时间：${arr.skdate.substring(0,10)}&nbsp;&nbsp;${arr.shtime }</div> 
					    </div>
					    <div class="layui-form-item">
						   <div style="width: 95%;border: 0px;float: left;" > 讲授内容：${arr.jshnr}</div> 
					    </div>
					    <div class="layui-form-item">
						   <div style="width: 50%;border: 0px;float: left;" >课程状态：
						   		<c:if test="${arr.state==0 }"><span style='color:#FFAA25;'>未审核</span></c:if>
						   		<c:if test="${arr.state==1 }"><span style='color:green;'>审核通过</span></c:if>
						   		<c:if test="${arr.state==2 }"><span style='color:red;'>审核不通过</span></c:if>
						   		<c:if test="${arr.state==3 }"><span style='color:red;'>已停课</span></c:if>
						   </div> 
					    </div>
					</div>
				</div>
			</div>
			<div class="layui-form-item" style="margin-top: 10px;">
			    <label class="layui-form-label" style="color:red;">请假类型</label>
			    <div class="layui-input-inline">
			      	<select  id="type" name="type" lay-verify="type" style="width: 99%;" class="weui_input">
					 	<code:printCode dmjc="QJLX" defaultValue="${entity.type}" type="1"/>
					</select>
			    </div>
		    </div>
		    <div class="layui-form-item layui-form-text">
			 	<label class="layui-form-label" style="color:red;">请假事由</label>
			    <div class="layui-input-block">
			      <textarea placeholder="请输入内容..." class="layui-textarea" id="cause" name="cause" lay-verify="cause" style="height: 50px;">${entity.cause }</textarea>
			 	</div>
			</div>
			<div class="layui-collapse" style="margin-top: 10px;margin-bottom: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title" style="color:red;">请假单</h2>
  					<div class="layui-colla-content layui-show">
					    <div class="layui-upload">
						  <div class="layui-upload-list"<c:if test="${entity.state!=1 }"> id="upImgBut"</c:if>>
						    <c:if test="${not empty entity.picpatho}">
						    	<img class="layui-upload-img" id="upImg" style="height:200px;" src="${entity.picpath }">
						    </c:if>
						    <c:if test="${empty entity.picpatho}">
						    	<img class="layui-upload-img" id="upImg" style="height:200px;" src="images/boolean/wenshu.png">
						    </c:if>
						    <p id="demoText"></p>
						  </div>
						  <span style="color: blue;">点击上传学校盖章的请假单</span>
						</div> 
 					</div>
				</div>
			</div>
		</div>
		<input type="hidden" id="isuploding" name="isuploding" lay-verify="isuploding" value="0"/>
    	<input type="hidden" id="picpatho" name="picpatho" lay-verify="picpatho" value="${entity.picpatho}"/> <!-- 图片路径 -->
    	<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;margin-bottom: -5px;">
	    	<div style="margin-top: 5px;width: 100%;text-align: center;">
		     	<button name="bindingBtn" type="button" class="layui-btn" lay-submit="submit" lay-filter="submit"><i class="layui-icon">&#x1005;</i>立即提交</button>
		     	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>关闭</button>
	     	</div>
	  	</div>
    </form>
<script src="layui/layui.all.js" charset="utf-8"></script>
<script type="text/javascript">
	var height= $("body").height();
	var width= $("body").width();
    function close_windos(){WeixinJSBridge.call('closeWindow')}
    $(function(){
    	
    });
    layui.use(['form', 'layedit', 'laydate','upload'], function(){
		var form = layui.form,
		layer = layui.layer,
		layedit = layui.layedit,
		laydate = layui.laydate,
		upload = layui.upload;
		form.render();
		var editIndex = layedit.build('LAY_demo_editor');
		//自定义验证规则
		form.verify({
			  type: function(value){if(value==""||value==null){return '请选择请假类型！'}},
			  cause: function(value){if(value==""||value==null){return '请填写请假事由！'}},
			  //picpatho: function(value){if(value==""||value==null){return '请上传请假单！'}},
		});
		  
		form.on('submit(submit)', function(data){
			  var arrangexh = $("#arrangexh").val();
			  document.getElementById('up_div').style.display ='block';
		      var taskinfo = JSON.stringify(data.field);
			  var url = "jxstuleave.do?method=insertJxStudentsLeaveorLLk";
			  $.post(url,{taskinfo:encodeURI(taskinfo),arrangexh:arrangexh},function (data, status) {
                  if( status=="success" ){
                      var json = eval(data);
                      switch (json.errorMsg) {
                          case "success":		//成功
	                          document.getElementById('up_div').style.display ='none';
	                          layer.msg("提交成功！",{icon:'1'},function(){
		                          setTimeout(tomineleave(),1000);
	                          });
	                          break;
                          case "failed":		//失败
                        	  layer.msg("提交失败！",{icon:'5'},function(){
		                          document.getElementById('up_div').style.display ='none';
	                          });
                              break;
                          case "error":		//服务器异常
                              layer.alert("服务器异常，请稍后再试！");
                              document.getElementById('up_div').style.display ='none';
                              break;
                      }
                  }else{
                	  layer.alert("操作失败！");
                  }
          		},"json");
			});
		  
		  //普通图片上传
		  var ggindex;
		  var uploadInst = upload.render({
		      elem: '#upImgBut',
		      url: 'jxStudents.do?method=uploadImg',
		      before: function(obj){
		     	  //预读本地文件示例，不支持ie8
		      	  obj.preview(function(index, file, result){
		        	  $('#upImg').attr('src', result); //图片链接（base64）
		      	  });
		      	  $("#isuploding").val("1");  //正在上传图片
		       	  ggindex = layer.open({
		        	  type: 1,
		        	  offset: '100px',
		        	  title: false,
		        	  closeBtn: false,
		        	  area: '300px;',
		        	  shade: 0.8,
		        	  id: 'LAY_layuipro',
		        	  moveType: 1,
		        	  content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">图片正在上传，请稍后。。。</div>',
		        	  success: function(layero){}
		          });
		       },
		       done: function(res){
			       //如果上传失败
			       if(res.code > 0){
			        	return layer.msg('上传失败');
			       }
			       //上传成功
			       $("#picpatho").val(res.realPath);  //将图片路径传过来放到隐藏域中
			       $("#isuploding").val("0");  //图片上传完成
			       layer.close(ggindex);
		    	},
		    	error: function(){
			        //演示失败状态，并实现重传
			        var demoText = $('#demoText');
			        demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
			        demoText.find('.demo-reload').on('click', function(){
			        	uploadInst.upload();
			      	});
		    	}
		  });
		  form.render();
		});
    
    
    	/* ------------------------------------------------计算月数-------------------------------------------------------- */
    	function tomineleave(){
		var xh = $("#xh").val();
		window.location.href="jxstuleave.do?method=toMineLeavePageorLlk&xh="+xh;
	}
	
	/* -------------------------------------------------------打开协议页面------------------------------------------------------- */
	function openxy(){
		layer.open({
	        type: 2,
	        title: '请假注意事项',
	        area: ['90%', '90%'],
	        shade: 0,
	        maxmin: false,
	        offset: '10px',
	        skin: 'demo-class',
	        content: "jxstuleave.do?method=openAgreement",
	        zIndex: layer.zIndex, //重点1
	        success: function(layero){
	          layer.setTop(layero); //重点2
	        }
	    });
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
		$("#teachername").val(data.username);
	}
	
</script>
</body>
</html>
