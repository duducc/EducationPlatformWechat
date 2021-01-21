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
    
    <title>大病历</title>
    
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
    	<!------------------------------------------------------开头 --------------------------------------------------------->
    	<div style="width: 100%;height: 80px;border-bottom: 0px solid #cccccc;background-color: #65B39D;">
			<div style="width: 25%;height: 80px;float: left;">
				<button style="width: 70px;height: 70px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;background-color: #65B39D" >
					<img src="images/boolean/qt.png" style="width: 70px;height: 70px;margin-left: 3px;" onclick="MillisecondToDate('-661000');">
				</button>
			</div>
			<div style="width: 45%;height: 80px;float: left;">
				<div style="width: 100%;margin-top: 26px;">
					<span style="color: #fff;font-size: 18px;"><b>大病历</b></span><br>
					<span style="color: #fff;font-size: 15px;">${deptname}</span>
				</div>
			</div>
			<div style="width: 30%;height: 60px;float: left;">
				<div style="width: 100%;margin-top: 35px;text-align: center;">
 					<span style="color: #fff;font-size: 15px;float: right;margin-right: 20px;">${bindinfo.xm }</span>
				</div>
			</div>
		</div>
		<div style="overflow-y:auto;height: 85%;background-color: #fff;" id="mainCount_div">
			<div class="layui-form-item" style="margin-top: 10px;">
			    <label class="layui-form-label" style="color:red;" >日期</label>
			    <div class="layui-input-inline">
			      <input value="${entity.zttime.substring(0,10) }" type="text" name="zttime" id="zttime" lay-verify="zttime" placeholder="YYYY-MM-DD" autocomplete="off" class="layui-input">
			    </div>
		    </div>
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">住院病历</h2>
  					<div class="layui-colla-content layui-show">
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >姓名</label>
						    <div class="layui-input-inline">
						      <input value="${entity.brname }" type="text" name="brname" id="brname" lay-verify="brname" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >职业</label>
						    <div class="layui-input-inline">
						      <input value="${entity.brzy }" type="text" name="brzy" id="brzy" lay-verify="brzy" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >性别</label>
						    <div class="layui-input-inline">
								<select name="brsex" id="brsex" lay-verify="brsex">
								 	<code:printCode dmjc="XB" defaultValue="${entity.brsex}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div>
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >住址</label>
						    <div class="layui-input-inline">
						      <input value="${entity.brdress }" type="text" name="brdress" id="brdress" lay-verify="brdress" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >年龄</label>
						    <div class="layui-input-inline">
						      <input  value="${entity.brage }" type="text" name="brage" id="brage" lay-verify="brage" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >入院日期</label>
						    <div class="layui-input-inline">
						      <input value="${entity.brrydate.substring(0,10) }" type="text" name="brrydate" id="brrydate" lay-verify="brrydate" readonly="readonly" placeholder="YYYY-MM-DD" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >病人名族</label>
						    <div class="layui-input-inline">
						      	<select name="brmz" id="brmz" lay-verify="brmz">
								 	<code:printCode dmjc="MZ" defaultValue="${entity.brmz}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >采集日期</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.brbshcjdate.substring(0,10) }" type="text" name="brbshcjdate" id="brbshcjdate" lay-verify="brbshcjdate" readonly="readonly" placeholder="YYYY-MM-DD" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >病人籍贯</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.brjg }" type="text" name="brjg" id="brjg" lay-verify="brjg" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item" id="dbrdiv" style="display: none;" >
						    <label class="layui-form-label" style="color:red;width:150px;" >病史叙述人</label>
						    <div class="layui-input-inline">
						    	<input id="bsxhsrid" type="hidden" name="bsxhsrid" lay-verify="bsxhsrid" value="${entity.bsxhsrid }" >
						      	<input id="bsxhsrname" type="text" name="bsxhsrname" value="${entity.bsxhsrname }" lay-verify="bsxhsrname" placeholder="请选择叙述人" autocomplete="off" class="layui-input" style="height:38px;width: 60%;float: left;" readonly="readonly">
						      	<button style="float: left;height: 38px;width: 40%;" class="layui-btn layui-btn-sm" type="button" onclick="getemp();"><i class="layui-icon">&#xe615;</i>查询</button>
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >病人婚姻</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.brmarr }" type="text" name="brmarr" id="brmarr" lay-verify="brmarr" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >可靠程度</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.brkkchd }" type="text" name="brkkchd" id="brkkchd" lay-verify="brkkchd" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >主诉</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.bhusu }" type="text" name="bhusu" id="bhusu" lay-verify="bhusu" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;">现病史</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.brxbsh }" type="text" name="brxbsh" id="brxbsh" lay-verify="brxbsh" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >既往史</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.brjwsh }" type="text" name="brjwsh" id="brjwsh" lay-verify="brjwsh" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
							<div class="layui-colla-item">	
  								<h2 class="layui-colla-title">病人系统回顾</h2>
  								<div class="layui-colla-content layui-show">
  									<div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >呼吸系统</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.hxxt }" type="text" name="hxxt" id="hxxt" lay-verify="hxxt" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >消化系统</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.xhxt }" type="text" name="xhxt" id="xhxt" lay-verify="xhxt" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >泌尿系统</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.mnxt }" type="text" name="mnxt" id="mnxt" lay-verify="mnxt" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >造血系统</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.zxxt }" type="text" name="zxxt" id="zxxt" lay-verify="zxxt" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >肌肉骨骼系统</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.jrggxt }" type="text" name="jrggxt" id="jrggxt" lay-verify="jrggxt" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >神经系统</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.shjxt }" type="text" name="shjxt" id="shjxt" lay-verify="shjxt" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
  								</div>
  							</div>
  						</div>
					    <div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
							<div class="layui-colla-item">	
  								<h2 class="layui-colla-title">病人个人史</h2>
  								<div class="layui-colla-content layui-show">
  									<div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >婚姻史</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.hysh }" type="text" name="hysh" id="hysh" lay-verify="hysh" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >月经生育史</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.yjshys }" type="text" name="yjshys" id="yjshys" lay-verify="yjshys" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >家族史</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.jzush }" type="text" name="jzush" id="jzush" lay-verify="jzush" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >过敏史</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.gmsh }" type="text" name="gmsh" id="gmsh" lay-verify="gmsh" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >输血史</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.shxsh }" type="text" name="shxsh" id="shxsh" lay-verify="shxsh" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
  								</div>
  							</div>
  						</div>
 					</div>
				</div>
			</div>
			
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">体格检查</h2>
  					<div class="layui-colla-content layui-show">
  						<div class="layui-form-item" style="margin-top: 10px;">
						    T:<input value="${entity.tgjct }" type="text" name="tgjct" id="tgjct" lay-verify="tgjct" autocomplete="off" style="width: 80px;border:0px;border-bottom: 1px solid #D2D2D2;height: 30px;text-align: center;">℃&nbsp;&nbsp;&nbsp;&nbsp;
						    P:<input value="${entity.tgjcp }" type="text" name="tgjcp" id="tgjcp" lay-verify="tgjcp" autocomplete="off" style="width: 80px;border:0px;border-bottom: 1px solid #D2D2D2;height: 30px;text-align: center;">Pa<br>
						    R:<input value="${entity.tgjcr }" type="text" name="tgjcr" id="tgjcr" lay-verify="tgjcr" autocomplete="off" style="width: 80px;border:0px;border-bottom: 1px solid #D2D2D2;height: 30px;text-align: center;">/min&nbsp;&nbsp;&nbsp;&nbsp;
						    BP:<input value="${entity.tgjcbm }" type="text" name="tgjcbm" id="tgjcbm" lay-verify="tgjcbm" autocomplete="off" style="width: 80px;border:0px;border-bottom: 1px solid #D2D2D2;height: 30px;text-align: center;">mmHg
					    </div>
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >一般状况</label>
						    <div class="layui-input-inline">
						      <input value="${entity.tybzhk }" type="text" name="tybzhk" id="tybzhk" lay-verify="tybzhk" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >皮肤黏膜</label>
						    <div class="layui-input-inline">
						      <input value="${entity.tpfnm }" type="text" name="tpfnm" id="tpfnm" lay-verify="tpfnm" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >淋巴结</label>
						    <div class="layui-input-inline">
						      <input value="${entity.tlbj }" type="text" name="tlbj" id="tlbj" lay-verify="tlbj" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
							<div class="layui-colla-item">	
  								<h2 class="layui-colla-title">头部及其器官</h2>
  								<div class="layui-colla-content layui-show">
  									<div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >眼</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.tyan }" type="text" name="tyan" id="tyan" lay-verify="tyan" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >耳</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.ter }" type="text" name="ter" id="ter" lay-verify="ter" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >鼻</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.tbi }" type="text" name="tbi" id="tbi" lay-verify="tbi" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >口</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.tkou }" type="text" name="tkou" id="tkou" lay-verify="tkou" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
  								</div>
  							</div>
  						</div>
  						<div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >颈部</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.tjinb }" type="text" name="tjinb" id="tjinb" lay-verify="tjinb" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
							<div class="layui-colla-item">	
  								<h2 class="layui-colla-title">胸肺</h2>
  								<div class="layui-colla-content layui-show">
  									<div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >视</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.xfsht }" type="text" name="xfsht" id="xfsht" lay-verify="xfsht" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >触</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.xfchu }" type="text" name="xfchu" id="xfchu" lay-verify="xfchu" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >叩</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.xfkou }" type="text" name="xfkou" id="xfkou" lay-verify="xfkou" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >听</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.xfting }" type="text" name="xfting" id="xfting" lay-verify="xfting" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
  								</div>
  							</div>
  						</div>
  						<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
							<div class="layui-colla-item">	
  								<h2 class="layui-colla-title">心</h2>
  								<div class="layui-colla-content layui-show">
  									<div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >视</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.xinsht }" type="text" name="xinsht" id="xinsht" lay-verify="xinsht" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >触</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.xinfchu }" type="text" name="xinfchu" id="xinfchu" lay-verify="xinfchu" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >叩</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.xinfkou }" type="text" name="xinfkou" id="xinfkou" lay-verify="xinfkou" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >听</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.xinfting }" type="text" name="xinfting" id="xinfting" lay-verify="xinfting" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
  								</div>
  							</div>
  						</div>
  						<div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >周围血管</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.tzwxg }" type="text" name="tzwxg" id="tzwxg" lay-verify="tzwxg" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
  						<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
							<div class="layui-colla-item">	
  								<h2 class="layui-colla-title">腹部</h2>
  								<div class="layui-colla-content layui-show">
  									<div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >视</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.fbsht }" type="text" name="fbsht" id="fbsht" lay-verify="fbsht" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >触</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.fbfchu }" type="text" name="fbfchu" id="fbfchu" lay-verify="fbfchu" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >叩</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.fbfkou }" type="text" name="fbfkou" id="fbfkou" lay-verify="fbfkou" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >听</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.fbfting }" type="text" name="fbfting" id="fbfting" lay-verify="fbfting" placeholder="请输入" autocomplete="off" class="layui-input">
									    </div>
								    </div>
  								</div>
  							</div>
  						</div>
  						<div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >肛门、外生殖器</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.tgmszq }" type="text" name="tgmszq" id="tgmszq" lay-verify="tgmszq" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >脊柱四肢</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.tjzszh }" type="text" name="tjzszh" id="tjzszh" lay-verify="tjzszh" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >神经系统</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.tshjxt }" type="text" name="tshjxt" id="tshjxt" lay-verify="tshjxt" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >专科情况</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.tzkqk }" type="text" name="tzkqk" id="tzkqk" lay-verify="tzkqk" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
 					</div>
				</div>
			</div>
			<div class="layui-form-item layui-form-text">
			    <label class="layui-form-label">病 历 摘 要</label>
			    <div class="layui-input-block">
			      <textarea class="layui-textarea" name="blzhy" id="blzhy" lay-verify="blzhy" placeholder="请输入" rows="15">${entity.blzhy }</textarea>
			    </div>
			</div>
		</div>
    	<!---------------------------------------------------------- 底部菜单-------------------------------------------------------->
		<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
		    <div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 50%;">
		      	<button type="button" class="layui-btn"  lay-submit="submit" lay-filter="submit"><i class="layui-icon">&#x1005;</i>提交</button>
	    	</div>
	    	<div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 50%;">
		      	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>关闭</button>
	    	</div>
	    	<c:if test="${opinion==1 }">
		    	<div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 50%;">
			      	<button name="closeBtn" type="button" class="layui-btn layui-btn-danger" onclick="deletedata();"><i class="layui-icon">&#xe640;</i>删除</button>
		    	</div>
	    	</c:if>
		</div>
		<!---------------------------------------------------底部菜单 ----------------------------------------------------- -->
    </form>
<script src="layui/layui.all.js" charset="utf-8"></script>
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
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
    	var opinion = $("#opinion").val();
		
    	laydate.render({elem: '#zttime',theme: 'molv',type:'date'});
		laydate.render({elem: '#brrydate',theme: 'molv',type:'date'});
		laydate.render({elem: '#brbshcjdate',theme: 'molv',type: 'date',position: 'fixed' });
		//自定义验证规则
		form.verify({
			zttime: function(value){if(value==""||value==null){return '日期不能为空！'}},
			/* name: function(value){if(value==""||value==null){return '姓名不能为空！'}},
			sex: function(value){if(value==""||value==null){return '请选择性别！'}},
			idcard: function(value){if(value==""||value==null){return '请填写身份证号！'}},
			telnumber: function(value){if(value==""||value==null){return '请填写联系方式！'}},
			xueli: function(value){if(value==""||value==null){return '请选择学历！'}},
			familyname: function(value){if(value==""||value==null){return '请填写家长姓名！'}},
			familyreat: function(value){if(value==""||value==null){return '请选择与本人关系！'}},
			familytel: function(value){if(value==""||value==null){return '请填写家庭电话！'}},
			zhiweitype: function(value){if(value==""||value==null){return '请选择实习类型！'}},
			stuyear: function(value){if(value==""||value==null){return '请选择实习年度！'}},
			studystarttime: function(value){if(value==""||value==null){return '请选择开始时间！'}},
			studyendtime: function(value){if(value==""||value==null){return '请选择结束时间！'}},
			comtype: function(value){if(value==""||value==null){return '请选择来院方式！'}},
			graduateschool: function(value){if(value==""||value==null){return '请选择学校！'}},
			banji: function(value){if(value==""||value==null){return '请选择班级！'}},
			schoolteachername: function(value){if(value==""||value==null){return '请填写老师姓名！'}},
			schoolteachertel: function(value){if(value==""||value==null){return '请填写老师电话！'}},
			fyzje: function(value){if(value==""||value==null){return '请选择专业及来院方式计算费用！'}},
			isuploding: function(value){if(value=="1"){return '图片正在上传，请稍后！'}},
			//imagepath: function(value){if(value==""||value==null){return '请上传照片！'}},
			shxsxy: function(value){if(value==1){return '您还没有同意实习生协议！'}}, */
			
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
	        	  url = "jxTeachingDbl.do?method=insertJxTeachingDbl";
	          }else{
	        	  url = "jxTeachingDbl.do?method=updateJxTeachingDbl";	        	
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
			       $("#imagepath").val(res.realPath);  //将图片路径传过来放到隐藏域中
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
    
    
    	
    	/* =======================================获取人员信息========================================= */
    	var layer_query_index ; 
    	function getemp(){
    		layer_query_index = layer.open({
    			type: 2,
    			skin: 'demo-class',
    			area: [(width-50)+'px', (height-100)+'px'],
    			title: "人员信息",
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
    		$("#bsxhsrid").val(data.usernumber);
    		$("#bsxhsrname").val(data.username);
    	}
    	
    	function deletedata(){
			if (confirm("是否确定删除？")) { 
				  var xh = $("#xh").val();
				  var url = "jxTeachingDbl.do?method=deleteJxTeachingDbl";
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
		
		function evaluate(){
			var xh = $("#xh").val();
			var openid = $("#openid").val();
	 		var clientsxh = $("#clientsxh").val();
	 		window.location.href="jxQuestionnaireTest.do?method=toDjshcSurvey&xh="+xh+"&openId="+openid+"&clientsxh="+clientsxh;
		}
</script>
</body>
</html>
