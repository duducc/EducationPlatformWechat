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
    <title>请假信息</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <script src="js/jquery.1.7.2.min.js"></script>
    <script src="js/jquery-weui.js"></script>
	<script src="js/umgo-picker.js"></script>
	<script type="text/javascript" src="js/json2.js"></script>
	<link rel="stylesheet" href="layui/css/layui.css"  media="all">
	<link rel="stylesheet" type="text/css" href="css/loading.css"/>
	<style type="text/css">
		.up_div_r{
			width: 100%;
			height: 100px;
			margin-top: 5%;
			position: absolute;
			z-index: 2;
		}
		.weui_label,.weui_input{
			font-size: 15px;
		}
		.layui-form-item{
			margin-bottom: 0px;
		}
		.layui-timeline-item {
		    padding-bottom: 0px;
		}
		.layui-timeline-title{
			margin-bottom: 0px;
		}
	</style>
</head>
<body>
	<!-- -----------------------------------------等待页面--------------------------------------------- -->
	<div id="up_div_s" class="up_div">
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
	
	<input type="hidden" id="xh" name="xh" value="${entity.xh }"/>
	<input type="hidden" id="stuid" name="stuid" value="${entity.stuid }"/>
	<input type="hidden" id="openId" name="openId" value="${openId}"/>
	<input type="hidden" id="state" name="state" value="${entity.state}"/>
	<c:if test="${entity.state=='2-1' }">
		<div id="up_div" class="up_div_r">
			<div style="width: 150px;float: right;margin-right: 15px;">
				<img src="images/leavesptg.png" style="width: 150px;height: 150px;" onclick="MillisecondToDate('-661000');">
			</div>
		</div>
	</c:if>
	<c:if test="${entity.state=='2-2'}">
		<div id="up_div" class="up_div_r">
			<div style="width: 150px;float: right;margin-right: 15px;">
				<img src="images/leavespbtg.png" style="width: 150px;height: 150px;" onclick="MillisecondToDate('-661000');">
			</div>
		</div>
	</c:if>
	<c:if test="${entity.state=='9' }">
		<div id="up_div" class="up_div_r">
			<div style="width: 150px;float: right;margin-right: 15px;">
				<img src="images/leavecx.png" style="width: 150px;height: 150px;" onclick="MillisecondToDate('-661000');">
			</div>
		</div>
	</c:if>
	<div class="weui_tab">
  		<div class="weui_tab_bd">
    		<div id="tab1" class="weui_tab_bd_item  weui_tab_bd_item_active" style="background-color: #ffffff;">
	  				<form class="layui-form layui-form-pane" action="" style="width:100%;">
	  				<div class="layui-collapse" style="margin-top: 0px;" lay-accordion="">
						<div class="layui-colla-item">	
		  					<h2 class="layui-colla-title">审核信息</h2>
		  					<div class="layui-colla-content layui-show">
		  						<c:if test="${entity.state=='0'}">
									<ul class="layui-timeline">
										<li class="layui-timeline-item">
	    									<i class="layui-icon layui-timeline-axis">
	    									<img src="images/service/quan1.png" style="width: 20px;height: 20px;"></i>
 											<div class="layui-timeline-content layui-text">
	   											<h3 class="layui-timeline-title"><span style="font-size: 15px;">${stuentity.name}</span></h3><ul>
	   											<li>状态：<span style="color: blue;"><b>已提交</b></span></li>
										        <li>请假原因：<b>${entity.cause}</b></li></ul>
 											</div>
										</li>
									</ul>
									<ul class="layui-timeline">
 										<li class="layui-timeline-item">
		    							<i class="layui-icon layui-timeline-axis">
		    								<img src="images/service/quan2.png" style="width: 20px;height: 20px;"></i>
  											<div class="layui-timeline-content layui-text">
    											<h3 class="layui-timeline-title"><span style="font-size: 15px;">教学部</span>
    											</h3>
    											<ul>
    												<li>状态：<span style="color: #ccc;">未审核</span></li>
						    					</ul>
  											</div>
 										</li>
									</ul>
									<li class="layui-timeline-item">
									    <i class="layui-icon layui-timeline-axis" style="margin-left: 5px;">
									    	<img src="images/service/quan2.png" style="width: 20px;height: 20px;">
									    </i>
									    <div class="layui-timeline-content layui-text">
									      	<div class="layui-timeline-title">
									      		<span style="font-size: 15px;"><b>审核结束</b></span>
									      	</div>
									    </div>
							    	</li>
			            		</c:if>
						
			            		<c:if test="${entity.state=='2-1'||entity.state=='2-2' }">
									<ul class="layui-timeline">
 										<li class="layui-timeline-item">
			    							<i class="layui-icon layui-timeline-axis">
			    								<img src="images/service/quan1.png" style="width: 20px;height: 20px;">
			    							</i>
  											<div class="layui-timeline-content layui-text">
    											<h3 class="layui-timeline-title">
    												<span style="font-size: 15px;">${stuentity.name}</span>
    											</h3>
    											<ul>
    												<li>状态：<span style="color: blue;"><b>已提交</b></span></li>
										        	<li>请假原因：<b>${entity.cause}</b></li>
						    					</ul>
  											</div>
 										</li>
									</ul>
									<ul class="layui-timeline">
 										<li class="layui-timeline-item">
			    							<i class="layui-icon layui-timeline-axis">
				    							<img src="images/service/quan1.png" style="width: 20px;height: 20px;">
			    							</i>
  											<div class="layui-timeline-content layui-text">
    											<h3 class="layui-timeline-title"><span style="font-size: 15px;">教学部</span></h3>
    											<ul>
    												<li>状态：
    													<c:if test="${entity.state=='2-1'}">
						    								<span style="color:green;">审核通过</span>
					    								</c:if>
					    								<c:if test="${entity.state=='2-2'}">
						    								<span style="color:red;">审核不通过</span>
					    								</c:if>
    												</li>
										        	<li>审核意见：<span style="font-size: 15px;color: blue;">${shyj}</span></li>
						    					</ul>
  											</div>
 										</li>
									</ul>
									<li class="layui-timeline-item">
									    <i class="layui-icon layui-timeline-axis" style="margin-left: 5px;">
									    	<img src="images/service/quan1.png" style="width: 20px;height: 20px;">
									    </i>
									    <div class="layui-timeline-content layui-text">
									      	<div class="layui-timeline-title">
									      		<span style="font-size: 15px;color: green;"><b>审核结束</b></span>
									      	</div>
									    </div>
								    </li>
			            		</c:if>
		  					</div>
		  				</div>
		  			</div>
	  				
	  				<div class="layui-collapse" style="margin-top: 0px;" lay-accordion="">
						<div class="layui-colla-item">	
		  					<h2 class="layui-colla-title">基本信息</h2>
		  					<div class="layui-colla-content layui-show">
							    <div class="layui-form-item">
								   <div style="width: 30%;border: 0px;float: left;" > 姓名:${stuentity.name}</div> 
								   <div style="width: 69%;border: 0px;float: left;" > 联系电话:${stuentity.telnumber }</div>
							    </div>
							    <div class="layui-form-item">
								   <div style="width: 99%;border: 0px;float: left;" > 班级:${schoolname }-${stuentity.grade}级-${zhuanye}${stuentity.banji }班</div> 
							    </div>
							    <div style="width: 100%;border-bottom: 1px solid #1AA094;margin-bottom: 10px;margin-top: 10px;"></div>
							    <div class="layui-form-item">
								   <div style="width: 49%;border: 0px;float: left;" > 课程名称：${arrange.coursename}</div> 
							    </div>
							    <div class="layui-form-item">
								   <div style="width: 40%;border: 0px;float: left;" > 任课教师：${arrange.rkjshname}</div> 
								   <div style="width: 59%;border: 0px;float: left;" > 教师电话：${arrange.lxdh}</div> 
							    </div>
							    <div class="layui-form-item">
								   <div style="width: 95%;border: 0px;float: left;" > 上课时间：${arrange.skdate.substring(0,10)}&nbsp;&nbsp;${arrange.shtime }</div> 
							    </div>
		 					</div>
						</div>
					</div>
					<div class="layui-collapse" style="margin-top: 0px;" lay-accordion="">
						<div class="layui-colla-item">	
		  					<h2 class="layui-colla-title">请假信息</h2>
		  					<div class="layui-colla-content layui-show">
							    <div class="layui-form-item">
								    <label class="layui-form-label">请假类型</label>
								    <div class="layui-input-inline">
								      	<select  id="type" name="type" style="width: 99%;" class="weui_input" disabled="disabled">
										 	<code:printCode dmjc="QJLX" bShowDmz="false" defaultValue="${entity.type }" type="1"/>
										</select>
								    </div>
							    </div>
							    <div class="layui-form-item layui-form-text">
								 	<label class="layui-form-label" style="font-size: 15px;">请假事由</label>
								    <div class="layui-input-block">
								      <textarea placeholder="请输入内容..." class="layui-textarea"  id="cause" name="cause" lay-verify="cause" style="height: 50px;font-size: 15px;" readonly="readonly">${entity.cause }</textarea>
								 	</div>
								</div>
								<div class="layui-collapse" style="margin-top: 10px;margin-bottom: 10px;" lay-accordion="">
									<div class="layui-colla-item">	
					  					<h2 class="layui-colla-title">请假单</h2>
					  					<div class="layui-colla-content layui-show">
										    <img class="layui-upload-img" id="upImg" style="height:200px;" src="${entity.picpatho }">
					 					</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<c:if test="${sptype==2}">
					 	<div class="layui-form-item layui-form-text">
						 	<label class="layui-form-label" style="font-size: 15px;">审核意见</label>
						    <div class="layui-input-block">
						      	<textarea placeholder="情况属实，予以请假。" class="layui-textarea" id="shyj" name="shyj" lay-verify="shyj" style="height: 50px;font-size: 15px;"></textarea>
						 	</div>
						</div>
					</c:if>
		     	</form>
    		</div>
    	</div>
  		<!---------------------------------------------------------- 底部菜单-------------------------------------------------------->
  		<c:if test="${sptype==2}">
	 		<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
			    <div style="width: 49%;float: left;height: 20px;margin-top:15px; border-right: 2px solid #cccccc;text-align: center;" onclick="shengpi(${sptype},1);">
			    	<span  style="color: #46AFF8;font-size: 15px;">审批通过</span>
			    </div>
			    <div style="width: 49%;float: left;height: 20px;margin-top:15px;text-align: center;" onclick="shengpi(${sptype},2);">
			    	<span  style="color: #46AFF8;font-size: 15px;">审批不通过</span>
			    </div>
			</div>
		</c:if>
  		<c:if test="${sptype!=2&&sptype!=3}">
			<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
			    <div style="width: 49%;float: left;height: 20px;margin-top:15px; border-right: 2px solid #cccccc;text-align: center;" onclick="cuiban();">
			    	<span  style="color: #46AFF8;font-size: 15px;">催办</span>
			    </div>
			    <div style="width: 49%;float: left;height: 20px;margin-top:15px;text-align: center;" onclick="chexiao(${entity.xh });">
			    	<span  style="color: #46AFF8;font-size: 15px;">撤销</span>
			    </div>
			</div>
		</c:if>
		<!---------------------------------------------------底部菜单 ----------------------------------------------------- -->
	</div>
</body>
<script src="layui/layui.all.js" charset="utf-8"></script>
<script type="text/javascript">
	var width=$("body").width();
	var height=$("body").height();
	document.getElementById("tab3").style.height=height-150;
	layui.use(['form'], function(){
		var form = layui.form;
		form.render();
	});
	$(function(){
		layui.use(['form'], function(){
			var form = layui.form;
			form.render();
		});
	})
	function cuiban(){
		$.alert("催办成功！","提示");
	}
	function chexiao(xh){
		if (confirm("是否撤回？")) {
			var url = "jxstuleave.do?method=updateJxStudentsLeave";
            $.post(url,{xh:xh,state:'9'},function (data, status) {
                  if( status=="success" ){
                      var json = eval(data);
                      switch (json.errorMsg) {
                          case "success":		//成功
	                          $.toast("撤回成功！");
	                          location.reload();
	                          break;
                          case "failed":		//失败
                        	  $.alert("撤回失败",'提示信息');
                              break;
                          case "error":		//服务器异常
                              $.alert("服务器异常，稍后再试！",'警告');
                              break;
                      }
                  }else{
                      $.alert("操作失败！",'警告');
                  }
          	},"json");
		}
	}
	
	function shengpi(type,value){
		var xh = $("#xh").val();
		var stuid = $("#stuid").val();
		var openId = $("#openId").val();
		var state = $("#state").val();
		var shyjz = $("#shyj").val();
		var shyj = "";
		if(state==9){
			$.alert("该请假信息已经撤销！","提示");
			return;
		}
		if(shyjz==""||shyjz==null){
			shyj = "情况属实，予以请假。";
		}else{
			shyj = shyjz;
		}
		var checkorder = type;
		var infos = {};
      	infos['stulevid']=xh;
      	infos['checkorder']=checkorder;
      	infos['state']=value;
      	infos['explanation']=shyj;
      	document.getElementById('up_div_s').style.display ='block';
		var Info = JSON.stringify(infos);
		var url = "jxstuleaveCheck.do?method=insertJxStudentsLeaveCheckorllk";
        $.post(url,{Info:Info,openId:openId,stuid:stuid},function (data, status) {
              if( status=="success" ){
                  var json = eval(data);
                  switch (json.errorMsg) {
                      case "success":		//成功
                       $.toast("审批成功！");
                       document.getElementById('up_div_s').style.display ='none';
                       location.reload();
                       break;
                      case "failed":		//失败
                    	  $.alert("审批失败",'提示信息');
                    	  document.getElementById('up_div_s').style.display ='none';
                          break;
                      case "error":		//服务器异常
                          $.alert("服务器异常，稍后再试！",'警告');
                          document.getElementById('up_div_s').style.display ='none';
                          break;
                  }
              }else{
                  $.alert("操作失败！",'警告');
              }
      	},"json");
	}
	
</script>
</html>
