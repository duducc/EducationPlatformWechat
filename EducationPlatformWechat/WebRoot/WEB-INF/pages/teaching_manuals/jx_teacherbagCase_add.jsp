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
    
    <title>����</title>
    
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
  	<!-- -----------------------------------------�ȴ�ҳ��--------------------------------------------- -->
	<div id="up_div" class="up_div">
		<div style="width: 100%;" id="bet_ondiv"></div>
		<div class="bet_div" id="bet_div">
			<div style="width: 100%;height: 10px;"></div>
			<div style="height: 70px;width: 60%;margin-left:20%;">
				<img src="images/loadingwx.gif" style="width: 100%;">
			</div>
			<div style="width: 100%;height: 5px;"></div>
			<div style="width: 100%;text-align: center;">
				<span style="font-size: 13px;">���Ժ�</span>
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
    	<!------------------------------------------------------��ͷ --------------------------------------------------------->
    	<div style="width: 100%;height: 80px;border-bottom: 0px solid #cccccc;background-color: #65B39D;">
			<div style="width: 25%;height: 80px;float: left;">
				<button style="width: 70px;height: 70px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;background-color: #65B39D" >
					<img src="images/boolean/qt.png" style="width: 70px;height: 70px;margin-left: 3px;" onclick="MillisecondToDate('-661000');">
				</button>
			</div>
			<div style="width: 45%;height: 80px;float: left;">
				<div style="width: 100%;margin-top: 26px;">
					<span style="color: #fff;font-size: 18px;"><b>����</b></span><br>
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
			    <label class="layui-form-label" style="color:red;" >����</label>
			    <div class="layui-input-inline">
			      <input value="${entity.zttime.substring(0,10) }" type="text" name="zttime" id="zttime" lay-verify="zttime" placeholder="YYYY-MM-DD" autocomplete="off" class="layui-input">
			    </div>
		    </div>
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">סԺ����</h2>
  					<div class="layui-colla-content layui-show">
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >����</label>
						    <div class="layui-input-inline">
						      <input value="${entity.brname }" type="text" name="brname" id="brname" lay-verify="brname" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >ְҵ</label>
						    <div class="layui-input-inline">
						      <input value="${entity.brzy }" type="text" name="brzy" id="brzy" lay-verify="brzy" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >�Ա�</label>
						    <div class="layui-input-inline">
								<select name="brsex" id="brsex" lay-verify="brsex">
								 	<code:printCode dmjc="XB" defaultValue="${entity.brsex}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div>
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >סַ</label>
						    <div class="layui-input-inline">
						      <input value="${entity.brdress }" type="text" name="brdress" id="brdress" lay-verify="brdress" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >����</label>
						    <div class="layui-input-inline">
						      <input  value="${entity.brage }" type="text" name="brage" id="brage" lay-verify="brage" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >��Ժ����</label>
						    <div class="layui-input-inline">
						      <input value="${entity.brrydate.substring(0,10) }" type="text" name="brrydate" id="brrydate" lay-verify="brrydate" readonly="readonly" placeholder="YYYY-MM-DD" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >��������</label>
						    <div class="layui-input-inline">
						      	<select name="brmz" id="brmz" lay-verify="brmz">
								 	<code:printCode dmjc="MZ" defaultValue="${entity.brmz}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >�ɼ�����</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.brbshcjdate.substring(0,10) }" type="text" name="brbshcjdate" id="brbshcjdate" lay-verify="brbshcjdate" readonly="readonly" placeholder="YYYY-MM-DD" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >���˼���</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.brjg }" type="text" name="brjg" id="brjg" lay-verify="brjg" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item" id="dbrdiv" style="display: none;" >
						    <label class="layui-form-label" style="color:red;width:150px;" >��ʷ������</label>
						    <div class="layui-input-inline">
						    	<input id="bsxhsrid" type="hidden" name="bsxhsrid" lay-verify="bsxhsrid" value="${entity.bsxhsrid }" >
						      	<input id="bsxhsrname" type="text" name="bsxhsrname" value="${entity.bsxhsrname }" lay-verify="bsxhsrname" placeholder="��ѡ��������" autocomplete="off" class="layui-input" style="height:38px;width: 60%;float: left;" readonly="readonly">
						      	<button style="float: left;height: 38px;width: 40%;" class="layui-btn layui-btn-sm" type="button" onclick="getemp();"><i class="layui-icon">&#xe615;</i>��ѯ</button>
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >���˻���</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.brmarr }" type="text" name="brmarr" id="brmarr" lay-verify="brmarr" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >�ɿ��̶�</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.brkkchd }" type="text" name="brkkchd" id="brkkchd" lay-verify="brkkchd" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >����</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.bhusu }" type="text" name="bhusu" id="bhusu" lay-verify="bhusu" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;">�ֲ�ʷ</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.brxbsh }" type="text" name="brxbsh" id="brxbsh" lay-verify="brxbsh" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >����ʷ</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.brjwsh }" type="text" name="brjwsh" id="brjwsh" lay-verify="brjwsh" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
							<div class="layui-colla-item">	
  								<h2 class="layui-colla-title">����ϵͳ�ع�</h2>
  								<div class="layui-colla-content layui-show">
  									<div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >����ϵͳ</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.hxxt }" type="text" name="hxxt" id="hxxt" lay-verify="hxxt" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >����ϵͳ</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.xhxt }" type="text" name="xhxt" id="xhxt" lay-verify="xhxt" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >����ϵͳ</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.mnxt }" type="text" name="mnxt" id="mnxt" lay-verify="mnxt" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >��Ѫϵͳ</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.zxxt }" type="text" name="zxxt" id="zxxt" lay-verify="zxxt" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >�������ϵͳ</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.jrggxt }" type="text" name="jrggxt" id="jrggxt" lay-verify="jrggxt" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >��ϵͳ</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.shjxt }" type="text" name="shjxt" id="shjxt" lay-verify="shjxt" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
  								</div>
  							</div>
  						</div>
					    <div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
							<div class="layui-colla-item">	
  								<h2 class="layui-colla-title">���˸���ʷ</h2>
  								<div class="layui-colla-content layui-show">
  									<div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >����ʷ</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.hysh }" type="text" name="hysh" id="hysh" lay-verify="hysh" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >�¾�����ʷ</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.yjshys }" type="text" name="yjshys" id="yjshys" lay-verify="yjshys" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >����ʷ</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.jzush }" type="text" name="jzush" id="jzush" lay-verify="jzush" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >����ʷ</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.gmsh }" type="text" name="gmsh" id="gmsh" lay-verify="gmsh" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >��Ѫʷ</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.shxsh }" type="text" name="shxsh" id="shxsh" lay-verify="shxsh" placeholder="������" autocomplete="off" class="layui-input">
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
  					<h2 class="layui-colla-title">�����</h2>
  					<div class="layui-colla-content layui-show">
  						<div class="layui-form-item" style="margin-top: 10px;">
						    T:<input value="${entity.tgjct }" type="text" name="tgjct" id="tgjct" lay-verify="tgjct" autocomplete="off" style="width: 80px;border:0px;border-bottom: 1px solid #D2D2D2;height: 30px;text-align: center;">��&nbsp;&nbsp;&nbsp;&nbsp;
						    P:<input value="${entity.tgjcp }" type="text" name="tgjcp" id="tgjcp" lay-verify="tgjcp" autocomplete="off" style="width: 80px;border:0px;border-bottom: 1px solid #D2D2D2;height: 30px;text-align: center;">Pa<br>
						    R:<input value="${entity.tgjcr }" type="text" name="tgjcr" id="tgjcr" lay-verify="tgjcr" autocomplete="off" style="width: 80px;border:0px;border-bottom: 1px solid #D2D2D2;height: 30px;text-align: center;">/min&nbsp;&nbsp;&nbsp;&nbsp;
						    BP:<input value="${entity.tgjcbm }" type="text" name="tgjcbm" id="tgjcbm" lay-verify="tgjcbm" autocomplete="off" style="width: 80px;border:0px;border-bottom: 1px solid #D2D2D2;height: 30px;text-align: center;">mmHg
					    </div>
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >һ��״��</label>
						    <div class="layui-input-inline">
						      <input value="${entity.tybzhk }" type="text" name="tybzhk" id="tybzhk" lay-verify="tybzhk" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >Ƥ���Ĥ</label>
						    <div class="layui-input-inline">
						      <input value="${entity.tpfnm }" type="text" name="tpfnm" id="tpfnm" lay-verify="tpfnm" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >�ܰͽ�</label>
						    <div class="layui-input-inline">
						      <input value="${entity.tlbj }" type="text" name="tlbj" id="tlbj" lay-verify="tlbj" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
							<div class="layui-colla-item">	
  								<h2 class="layui-colla-title">ͷ����������</h2>
  								<div class="layui-colla-content layui-show">
  									<div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >��</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.tyan }" type="text" name="tyan" id="tyan" lay-verify="tyan" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >��</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.ter }" type="text" name="ter" id="ter" lay-verify="ter" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >��</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.tbi }" type="text" name="tbi" id="tbi" lay-verify="tbi" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >��</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.tkou }" type="text" name="tkou" id="tkou" lay-verify="tkou" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
  								</div>
  							</div>
  						</div>
  						<div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >����</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.tjinb }" type="text" name="tjinb" id="tjinb" lay-verify="tjinb" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
							<div class="layui-colla-item">	
  								<h2 class="layui-colla-title">�ط�</h2>
  								<div class="layui-colla-content layui-show">
  									<div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >��</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.xfsht }" type="text" name="xfsht" id="xfsht" lay-verify="xfsht" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >��</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.xfchu }" type="text" name="xfchu" id="xfchu" lay-verify="xfchu" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >ߵ</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.xfkou }" type="text" name="xfkou" id="xfkou" lay-verify="xfkou" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >��</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.xfting }" type="text" name="xfting" id="xfting" lay-verify="xfting" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
  								</div>
  							</div>
  						</div>
  						<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
							<div class="layui-colla-item">	
  								<h2 class="layui-colla-title">��</h2>
  								<div class="layui-colla-content layui-show">
  									<div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >��</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.xinsht }" type="text" name="xinsht" id="xinsht" lay-verify="xinsht" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >��</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.xinfchu }" type="text" name="xinfchu" id="xinfchu" lay-verify="xinfchu" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >ߵ</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.xinfkou }" type="text" name="xinfkou" id="xinfkou" lay-verify="xinfkou" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >��</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.xinfting }" type="text" name="xinfting" id="xinfting" lay-verify="xinfting" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
  								</div>
  							</div>
  						</div>
  						<div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >��ΧѪ��</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.tzwxg }" type="text" name="tzwxg" id="tzwxg" lay-verify="tzwxg" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
  						<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
							<div class="layui-colla-item">	
  								<h2 class="layui-colla-title">����</h2>
  								<div class="layui-colla-content layui-show">
  									<div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >��</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.fbsht }" type="text" name="fbsht" id="fbsht" lay-verify="fbsht" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >��</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.fbfchu }" type="text" name="fbfchu" id="fbfchu" lay-verify="fbfchu" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >ߵ</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.fbfkou }" type="text" name="fbfkou" id="fbfkou" lay-verify="fbfkou" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
								    <div class="layui-form-item">
									    <label class="layui-form-label" style="color:red;" >��</label>
									    <div class="layui-input-inline">
									      	<input value="${entity.fbfting }" type="text" name="fbfting" id="fbfting" lay-verify="fbfting" placeholder="������" autocomplete="off" class="layui-input">
									    </div>
								    </div>
  								</div>
  							</div>
  						</div>
  						<div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >���š�����ֳ��</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.tgmszq }" type="text" name="tgmszq" id="tgmszq" lay-verify="tgmszq" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >������֫</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.tjzszh }" type="text" name="tjzszh" id="tjzszh" lay-verify="tjzszh" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >��ϵͳ</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.tshjxt }" type="text" name="tshjxt" id="tshjxt" lay-verify="tshjxt" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >ר�����</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.tzkqk }" type="text" name="tzkqk" id="tzkqk" lay-verify="tzkqk" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
 					</div>
				</div>
			</div>
			<div class="layui-form-item layui-form-text">
			    <label class="layui-form-label">�� �� ժ Ҫ</label>
			    <div class="layui-input-block">
			      <textarea class="layui-textarea" name="blzhy" id="blzhy" lay-verify="blzhy" placeholder="������" rows="15">${entity.blzhy }</textarea>
			    </div>
			</div>
		</div>
    	<!---------------------------------------------------------- �ײ��˵�-------------------------------------------------------->
		<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
		    <div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 50%;">
		      	<button type="button" class="layui-btn"  lay-submit="submit" lay-filter="submit"><i class="layui-icon">&#x1005;</i>�ύ</button>
	    	</div>
	    	<div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 50%;">
		      	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>�ر�</button>
	    	</div>
	    	<c:if test="${opinion==1 }">
		    	<div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 50%;">
			      	<button name="closeBtn" type="button" class="layui-btn layui-btn-danger" onclick="deletedata();"><i class="layui-icon">&#xe640;</i>ɾ��</button>
		    	</div>
	    	</c:if>
		</div>
		<!---------------------------------------------------�ײ��˵� ----------------------------------------------------- -->
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
		//�Զ�����֤����
		form.verify({
			zttime: function(value){if(value==""||value==null){return '���ڲ���Ϊ�գ�'}},
			/* name: function(value){if(value==""||value==null){return '��������Ϊ�գ�'}},
			sex: function(value){if(value==""||value==null){return '��ѡ���Ա�'}},
			idcard: function(value){if(value==""||value==null){return '����д���֤�ţ�'}},
			telnumber: function(value){if(value==""||value==null){return '����д��ϵ��ʽ��'}},
			xueli: function(value){if(value==""||value==null){return '��ѡ��ѧ����'}},
			familyname: function(value){if(value==""||value==null){return '����д�ҳ�������'}},
			familyreat: function(value){if(value==""||value==null){return '��ѡ���뱾�˹�ϵ��'}},
			familytel: function(value){if(value==""||value==null){return '����д��ͥ�绰��'}},
			zhiweitype: function(value){if(value==""||value==null){return '��ѡ��ʵϰ���ͣ�'}},
			stuyear: function(value){if(value==""||value==null){return '��ѡ��ʵϰ��ȣ�'}},
			studystarttime: function(value){if(value==""||value==null){return '��ѡ��ʼʱ�䣡'}},
			studyendtime: function(value){if(value==""||value==null){return '��ѡ�����ʱ�䣡'}},
			comtype: function(value){if(value==""||value==null){return '��ѡ����Ժ��ʽ��'}},
			graduateschool: function(value){if(value==""||value==null){return '��ѡ��ѧУ��'}},
			banji: function(value){if(value==""||value==null){return '��ѡ��༶��'}},
			schoolteachername: function(value){if(value==""||value==null){return '����д��ʦ������'}},
			schoolteachertel: function(value){if(value==""||value==null){return '����д��ʦ�绰��'}},
			fyzje: function(value){if(value==""||value==null){return '��ѡ��רҵ����Ժ��ʽ������ã�'}},
			isuploding: function(value){if(value=="1"){return 'ͼƬ�����ϴ������Ժ�'}},
			//imagepath: function(value){if(value==""||value==null){return '���ϴ���Ƭ��'}},
			shxsxy: function(value){if(value==1){return '����û��ͬ��ʵϰ��Э�飡'}}, */
			
		});
		//�����ύ
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
                        case "success":		//�ɹ�
	                          $.toast("�Ǽǳɹ�");
	                          document.getElementById('up_div').style.display ='none';
                        	  setTimeout(fanhui(),1500);
	                          break;
                        case "failed":		//ʧ��
                      	  layer.alert("���ʧ��", {title: '��ʾ��Ϣ'});
                      	  document.getElementById('up_div').style.display ='none';
                            break;
                        case "error":		//�������쳣
                            layer.alert("�������쳣���Ժ����ԣ�", {title: '����'});
                            document.getElementById('up_div').style.display ='none';
                            break;
                    }
                }else{
                    layer.alert("����ʧ�ܣ�", {title: '����'});
                    document.getElementById('up_div').style.display ='none';
                }
          	},"json");
		  });
		  
		  //��ͨͼƬ�ϴ�
		  var ggindex;
		  var uploadInst = upload.render({
		      elem: '#upImgBut',
		      url: 'jxStudents.do?method=uploadImg',
		      before: function(obj){
		     	  //Ԥ�������ļ�ʾ������֧��ie8
		      	  obj.preview(function(index, file, result){
		        	  $('#upImg').attr('src', result); //ͼƬ���ӣ�base64��
		      	  });
		      	  $("#isuploding").val("1");  //�����ϴ�ͼƬ
		       	  ggindex = layer.open({
		        	  type: 1,
		        	  offset: '100px',
		        	  title: false,
		        	  closeBtn: false,
		        	  area: '300px;',
		        	  shade: 0.8,
		        	  id: 'LAY_layuipro',
		        	  moveType: 1,
		        	  content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">ͼƬ�����ϴ������Ժ󡣡���</div>',
		        	  success: function(layero){}
		          });
		       },
		       done: function(res){
			       //����ϴ�ʧ��
			       if(res.code > 0){
			        	return layer.msg('�ϴ�ʧ��');
			       }
			       //�ϴ��ɹ�
			       $("#imagepath").val(res.realPath);  //��ͼƬ·���������ŵ���������
			       $("#isuploding").val("0");  //ͼƬ�ϴ����
			       layer.close(ggindex);
		    	},
		    	error: function(){
			        //��ʾʧ��״̬����ʵ���ش�
			        var demoText = $('#demoText');
			        demoText.html('<span style="color: #FF5722;">�ϴ�ʧ��</span> <a class="layui-btn layui-btn-xs demo-reload">����</a>');
			        demoText.find('.demo-reload').on('click', function(){
			        	uploadInst.upload();
			      	});
		    	}
		  });
		  form.render();
		});
    
    
    	
    	/* =======================================��ȡ��Ա��Ϣ========================================= */
    	var layer_query_index ; 
    	function getemp(){
    		layer_query_index = layer.open({
    			type: 2,
    			skin: 'demo-class',
    			area: [(width-50)+'px', (height-100)+'px'],
    			title: "��Ա��Ϣ",
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
			if (confirm("�Ƿ�ȷ��ɾ����")) { 
				  var xh = $("#xh").val();
				  var url = "jxTeachingDbl.do?method=deleteJxTeachingDbl";
	              $.post(url,{xh:xh},function (data, status) {
	                  if( status=="success" ){
	                      var json = eval(data);
	                      switch (json.errorMsg) {
	                          case "success":		//�ɹ�
		                          $.toast("ɾ���ɹ�");
		                          setTimeout(fanhui(),1500);
		                          break;
	                          case "failed":		//ʧ��
	                        	  layer.alert("ɾ��ʧ��", {title: '��ʾ��Ϣ'});
	                              break;
	                          case "error":		//�������쳣
	                              layer.alert("�������쳣���Ժ����ԣ�", {title: '����'});
	                              break;
	                      }
	                  }else{
	                      layer.alert("����ʧ�ܣ�", {title: '����'});
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
