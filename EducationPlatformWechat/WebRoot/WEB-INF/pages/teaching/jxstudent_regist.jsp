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
    
    <title>��ϰѧԱ��Ϣ</title>
    
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
    <form class="layui-form layui-form-pane" action="" style="width:100%; ">
    	<input type="hidden" id="openid" name="openid" value="${openid }"/>
		<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
		<input type="hidden" id="type" name="type" value="${type }"/>
		<input type="hidden" id="pertype" name="pertype" lay-verify="pertype" value="${pertype}"/><!-- ��Ա���ͣ�5:��ϰ���� -->
		<input type="hidden" id="state" name="state" lay-verify="state" value="${entity.state!=null&&entity.state!=''?entity.state:1 }"/><!-- ״̬0��δ��� -->
		<input type="hidden" id="fyzje" name="fyzje" lay-verify="fyzje" autocomplete="off" value="${entity.fyzje }"><!-- �ܷ��� -->
		<input type="hidden" id="jfbj" name="jfbj" lay-verify="jfbj" value="${entity.jfbj!=null&&entity.jfbj!=''?entity.jfbj:0}"><!-- �ܷ��� -->
		<input type="hidden" id="zt" name="zt" lay-verify="zt" value="${entity.zt!=null&&entity.zt!=''?entity.zt:0}"><!-- ״̬ -->
		<input type="hidden" id="shzt" name="shzt" lay-verify="shzt" value="${entity.shzt!=null&&entity.shzt!=''?entity.shzt:2}"><!-- �Լ��ύ����ѧУ�ύ -->
		<input type="hidden" id="sxzmbj" name="sxzmbj" lay-verify="sxzmbj" value="${entity.sxzmbj!=null&&entity.sxzmbj!=''?entity.sxzmbj:0}"/>
    	<!------------------------------------------------------��ͷ --------------------------------------------------------->
    	<div style="width: 100%;height: 80px;border-bottom: 0px solid #cccccc;background-color: #65B39D;">
			<div style="width: 25%;height: 80px;float: left;">
				<button style="width: 70px;height: 70px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;background-color: #65B39D" >
					<img src="images/boolean/qt.png" style="width: 70px;height: 70px;margin-left: 3px;" onclick="MillisecondToDate('-661000');">
				</button>
			</div>
			<div style="width: 45%;height: 80px;float: left;">
				<div style="width: 100%;margin-top: 26px;">
					<span style="color: #fff;font-size: 18px;"><b>ѧԱע��</b></span><br>
					<span style="color: #fff;font-size: 15px;">��ɫѡ��Ϊ������</span>
				</div>
			</div>
		</div>
		<div style="overflow-y:auto;height: 85%;background-color: #fff;" id="mainCount_div">
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">ѧԱ������Ϣ</h2>
  					<div class="layui-colla-content layui-show">
						<div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;">ѧԱ���</label>
						    <div class="layui-input-inline">
						      	<input value="${stuid==null||stuid==''?entity.xh:stuid }" type="text" name="xh" id="xh" lay-verify="xh" autocomplete="off" class="layui-input" readonly="readonly">
						      	<input value="${stuid==null||stuid==''?entity.xh:stuid }" type="hidden" name="schoolnum" id="schoolnum" lay-verify="schoolnum" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >����</label>
						    <div class="layui-input-inline">
						      <input value="${entity.name }" type="text" name="name" id="name" lay-verify="name" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >�Ա�</label>
						    <div class="layui-input-inline">
								<select name="sex" id="sex" lay-verify="sex">
								 	<code:printCode dmjc="XB" defaultValue="${entity.sex}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >���֤��</label>
						    <div class="layui-input-inline">
						      <input  value="${entity.idcard }" type="text" name="idcard" id="idcard" lay-verify="idcard" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >��ϵ�绰</label>
						    <div class="layui-input-inline">
						      <input value="${entity.telnumber }" type="text" name="telnumber" id="telnumber" lay-verify="telnumber" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >ѧ��</label>
						    <div class="layui-input-inline">
						      	<select name="xueli" id="xueli" lay-verify="xueli">
								 	<code:printCode dmjc="XL" defaultValue="${entity.xueli}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" >������ò</label>
						    <div class="layui-input-inline">
						      	<select name="government" id="government" lay-verify="government">
								 	<code:printCode dmjc="ZZMM" defaultValue="${entity.government}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label"  >����</label>
						    <div class="layui-input-inline">
						      	<select name="national" id="national" lay-verify="national">
								 	<code:printCode dmjc="MZ" defaultValue="${entity.national}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div>
 					</div>
				</div>
			</div>
			<!---------------------------------------------------------��ͥ��Ϣ -------------------------------------------------->
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">��ͥ��ϵ����Ϣ</h2>
  					<div class="layui-colla-content layui-show">
						<div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;">�ҳ�����</label>
						    <div class="layui-input-inline">
						      <input value="${entity.familyname }" type="text" name="familyname" id="familyname" lay-verify="familyname" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div> 
					    <div class="layui-form-item">
						    <label class="layui-form-label"  style="color:red;">�뱾�˹�ϵ</label>
						    <div class="layui-input-inline">
						      	<select name="familyreat" id="familyreat" lay-verify="familyreat">
								 	<code:printCode dmjc="STUGX" defaultValue="${entity.familyreat}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div> 
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >��ͥ�绰</label>
						    <div class="layui-input-inline">
						      <input value="${entity.familytel }" type="text" name="familytel" id="familytel" lay-verify="familytel" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div> 
					    <div class="layui-form-item">
						    <label class="layui-form-label" >������ַ</label>
						    <div class="layui-input-inline">
						      <input value="${entity.familyaddress }" type="text" name="familyaddress" id="familyaddress" lay-verify="familyaddress" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div>
 					</div>
				</div>
			</div>
			<!--------------------------------------------------------ʵϰ��Ϣ -------------------------------------------------------->
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">��ϰ��Ϣ</h2>
  					<div class="layui-colla-content layui-show">
  						<div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >��ϰ����</label>
						    <div class="layui-input-inline">
						      	<select name="zhiweitype" id="zhiweitype" lay-verify="zhiweitype">
								 	<code:printCode dmjc="SHXTYPE" defaultValue="${entity.zhiweitype}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div>
						<div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >��ϰ���</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.stuyear==''||entity.stuyear==null?nowyear:entity.stuyear}" type="text" name="stuyear" id="stuyear" lay-verify="stuyear" placeholder="YYYY" autocomplete="off" class="layui-input" readonly="readonly">
						    </div>
					    </div> 
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >��ʼʱ��</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.studystarttime.substring(0,19) }" type="text" name="studystarttime" id="studystarttime" lay-verify="studystarttime" placeholder="YYYY-mm-dd" autocomplete="off" class="layui-input" readonly="readonly">
						    </div>
					    </div> 
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >����ʱ��</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.studyendtime.substring(0,19) }" type="text" name="studyendtime" id="studyendtime" lay-verify="studyendtime" placeholder="YYYY-mm-dd" autocomplete="off" class="layui-input" readonly="readonly">
						    </div>
					    </div> 
					    <div class="layui-form-item">
						    <label class="layui-form-label" >��ϰ����</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.month }" type="text" style="width: 60%;float: left;" name="month" id="month" lay-verify="month" autocomplete="off" class="layui-input" readonly="readonly">
						      	<label class="layui-form-label" style="width: 40%;float: left;border-left: 0px;">��</label>
						    </div>
					    </div> 
 					</div>
				</div>
			</div>
			<!--------------------------------------------------------ѧУ��Ϣ -------------------------------------------------------->
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">ѧУ/ѧ����Ϣ</h2>
  					<div class="layui-colla-content layui-show">
						<div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >��Ժ��ʽ</label>
						    <div class="layui-input-inline">
						      	<select name="comtype" id="comtype" lay-verify="comtype" lay-filter="comtype">
								 	<code:printCode dmjc="SHXLYFS" defaultValue="${entity.comtype}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >ѧУ����</label>
						    <div class="layui-input-inline">
						    	<input type="hidden" id="graduateschoolname"/>
						    	<select name="graduateschool" id="graduateschool" lay-verify="graduateschool" lay-filter="graduateschool">
								 	<code:printCode dmjc="SHXSCH" defaultValue="${entity.graduateschool}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div>
					    <div class="layui-form-item">
					    	<label class="layui-form-label" style="color: red;">ѧԺ��</label>
						    <div class="layui-input-inline">
						    	<input type="hidden" id="collegename" name="collegename" lay-verify="collegename"/>
						      	<select id="collegeid" name="collegeid" lay-verify="collegeid" lay-filter="collegeid">
								 	<code:printCode bShowDmz="false" dmjc="COLLEGE" defaultValue="${entity.collegeid }" type="1"/>
								</select>
						    </div>
						</div>
						<div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >�꼶</label>
						    <div class="layui-input-inline">
								<input style="width: 50%;float: left;" value="${entity.grade}" type="text" name="grade" id="grade" lay-verify="grade" placeholder="YYYY" autocomplete="off" class="layui-input" readonly="readonly">
								<label class="layui-form-label" style="width: 49%;float: left;" >��</label>
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >רҵ</label>
						    <div class="layui-input-inline">
						    	<input type="hidden" id="professionalname"/>
						      	<select name="professional" id="professional" lay-verify="professional" lay-filter="professional">
								 	<code:printCode dmjc="ZY" defaultValue="${entity.professional}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div> 
					    <div class="layui-form-item">
					    	<label class="layui-form-label" style="color: red;">�༶��</label>
						    <div class="layui-input-inline">
						      	<select id="banji" name="banji" lay-verify="banji" lay-filter="banji">
								 	<code:printCode bShowDmz="false" dmjc="BANJI" defaultValue="${entity.banji }" type="1"/>
								</select>
						    </div>
						</div>
					    <div class="layui-form-item" id="dbrdiv" style="display: none;" >
						    <label class="layui-form-label" style="color:red;" >������</label>
						    <div class="layui-input-inline">
						    	<input id="assureemp" type="hidden" name="assureemp" lay-verify="assureemp" value="${entity.assureemp }" >
						      	<input id="assureempname" type="text" name="assureempname" value="${entity.assureempname }" lay-verify="assureempname" placeholder="��ѡ�񵣱���" autocomplete="off" class="layui-input" style="height:38px;width: 60%;float: left;" readonly="readonly">
						      	<button style="float: left;height: 38px;width: 40%;" class="layui-btn layui-btn-sm" type="button" onclick="getemp();"><i class="layui-icon">&#xe615;</i>��ѯ</button>
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >ѧУ��ʦ</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.schoolteachername }" type="text" name="schoolteachername" id="schoolteachername" lay-verify="schoolteachername" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div> 
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >��ʦ�绰</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.schoolteachertel }" type="text" name="schoolteachertel" id="schoolteachertel" lay-verify="schoolteachertel" placeholder="������" autocomplete="off" class="layui-input">
						    </div>
					    </div> 
 					</div>
				</div>
			</div>
		    <!--------------------------------------------------------������Ϣ -------------------------------------------------------->
			<div class="layui-collapse" style="margin-top: 10px;margin-bottom: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">������Ϣ</h2>
  					<div class="layui-colla-content layui-show">
					    <div class="layui-upload">
						  <div class="layui-upload-list"<c:if test="${entity.state!=1 }"> id="upImgBut"</c:if>>
						    <c:if test="${not empty entity.imagepath}">
						    	<img class="layui-upload-img" id="upImg" style="height:200px;" src="${entity.imagepath }">
						    </c:if>
						    <c:if test="${empty entity.imagepath}">
						    	<img class="layui-upload-img" id="upImg" style="height:200px;" src="images/service/headimage.jpg">
						    </c:if>
						    <p id="demoText"></p>
						  </div>
						  <span style="color: blue;">��һ�����������Ƭ��</span>
						</div> 
					    <c:if test="${type==1 }">
						    <div class="layui-form-item">
							    <label class="layui-form-label" >���״̬</label>
							    <div class="layui-input-inline">
							      	<input value="${entity.state==0?'δ���':(entity.state==2?'���ͨ��':'���δͨ��') }" type="text" readonly="readonly"  autocomplete="off" class="layui-input">
							    </div>
						    </div>
						    <c:if test="${entity.state==1||entity.state==2 }">
							    <div class="layui-form-item layui-form-text">
								    <label class="layui-form-label">�����Ϣ</label>
								    <div class="layui-input-block">
								      <textarea class="layui-textarea" readonly="readonly" >${entity.checkcontent }</textarea>
								    </div>
								</div>
							</c:if>
					    </c:if>
 					</div>
				</div>
			</div>
			<div style="width: 100%;height: 50px;margin-bottom: 20px;padding: 5px;">
				<c:if test="${entity!=null}">
					<input type="checkbox" lay-skin="switch" lay-filter="switchTest" checked="" lay-text="ͬ��|��ͬ��">
					<input type="hidden" name="shxsxy" id="shxsxy" lay-verify="shxsxy" value="2"/>
				</c:if>
				<c:if test="${entity==null }">
					<input type="checkbox" lay-skin="switch" lay-filter="switchTest" lay-text="ͬ��|��ͬ��">
					<input type="hidden" name="shxsxy" id="shxsxy" lay-verify="shxsxy" value="1"/>
				</c:if>
				<span style="font-size: 14px;">�����Ķ���ͬ���ϰ��Э��</span><a onclick="openxy();" style="font-size: 14px;margin-left: 15px;color: blue;">��ʵϰ��Э�顷</a>
			</div>
		</div>
		<input type="hidden" id="isuploding" name="isuploding" lay-verify="isuploding" value="0"/>
    	<input type="hidden" id="imagepath" name="imagepath" lay-verify="imagepath" value="${entity.imagepath}"/> <!-- ͼƬ·�� -->
		<%-- <c:if test="${entity.state!=1 }"> --%>
		<c:if test="${type==0 }">
	    	<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;margin-bottom: -5px;">
		    	<div style="margin-top: 5px;width: 100%;text-align: center;">
			     	<button name="bindingBtn" type="button" class="layui-btn" lay-submit="submit_baseinfo" lay-filter="submit_baseinfo"><i class="layui-icon">&#x1005;</i>�����ύ</button>
			     	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>�ر�</button>
		     	</div>
		  	</div>
	    </c:if>
    </form>
<script src="layui/layui.all.js" charset="utf-8"></script>
<script type="text/javascript">
	var height= $("body").height();
	var width= $("body").width();
    function close_windos(){WeixinJSBridge.call('closeWindow')}
    $(function(){
    	var comtype = $("#comtype").val();
    	if(comtype!=null&&comtype!=""&&comtype=='2'){
    		document.getElementById('dbrdiv').style.display ='block';
    	}
    });
    
    layui.use(['form', 'layedit', 'laydate','upload'], function(){
		var form = layui.form,
		layer = layui.layer,
		layedit = layui.layedit,
		laydate = layui.laydate,
		upload = layui.upload;
		form.on('select(comtype)', function(data){
			if(data.value==1){
				$("#state").val(4);
				$("#shzt").val(1);
				document.getElementById('dbrdiv').style.display ='none';
				$("#assureemp").val("");
	    		$("#assureempname").val("");
			}else{
				$("#state").val(4);
				$("#shzt").val(2);
				document.getElementById('dbrdiv').style.display ='block';
			}
			var money = getMoney();
		    $("#fyzje").val(money);
		    
		    //-----------------------------
		    
		});
		form.on('select(professional)', function(data){
			var name = data.elem[data.elem.selectedIndex].text;
			$("#professionalname").val(name);
			var money = getMoney();
		    $("#fyzje").val(money);
		});
		form.on('select(graduateschool)', function(data){
			var name = data.elem[data.elem.selectedIndex].text;
		    $("#graduateschoolname").val(name);
		});
		form.on('select(collegeid)', function(data){
			var name = data.elem[data.elem.selectedIndex].text;
			$("#collegename").val(name);
		});
		laydate.render({elem: '#stuyear',theme: 'molv',type:'year'});
		//����
		laydate.render({elem: '#studystarttime',theme: 'molv',position: 'fixed' ,done: function(value, date, endDate){
		    var end = $("#studyendtime").val();
		    if(end!=null&&end!=""){
		    	var starttime = new Date(Date.parse(value));
		    	var endtime = new Date(Date.parse(end));
		    	if(starttime>endtime){
		    		layer.msg("��ʼʱ�䲻�ܴ��ڽ���ʱ��");
		    		$("#studystarttime").val("");
		    	}
		    }
		    var day = getMonth();
		    $("#month").val(day);
		    var money = getMoney();
		    $("#fyzje").val(money);
		}});
		laydate.render({elem: '#studyendtime',theme: 'molv',position: 'fixed',done: function(value, date, endDate){
		    var start = $("#studystarttime").val();
		    if(start!=null&&start!=""){
		    	var starttime = new Date(Date.parse(start));
		    	var endtime = new Date(Date.parse(value));
		    	if(endtime<starttime){
		    		layer.msg("��ʼʱ�䲻�ܴ��ڽ���ʱ��");
		    		$("#studyendtime").val("");
		    	}
		    }
		    var day = getMonth();
		    $("#month").val(day);
		    var money = getMoney();
		    $("#fyzje").val(money);
		}});
		laydate.render({elem: '#grade',theme: 'molv',type: 'year',position: 'fixed' });
        //��ʼ���༶
       /* 
        *msg������1����ɫ�Ժ�
        		 2����ɫ���
        		 3����ɫ�ʺ�
        		 4����ɫ����
        		 5����ɫ�ѹ�
        		 6����ɫ΢Ц
        		 7����ɫ��̾��
        */
        form.on('switch(switchTest)', function(data){
			if(this.checked==true){
				$("#shxsxy").val(2);
			}else{
				$("#shxsxy").val(1);
			}
		});
		//�Զ�����֤����
		form.verify({
			name: function(value){if(value==""||value==null){return '��������Ϊ�գ�'}},
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
			shxsxy: function(value){if(value==1){return '����û��ͬ��ʵϰ��Э�飡'}},
			assureemp: function(value){
				var comtype = $("#comtype").val();
				if(comtype==2){
					if(value==""||value==null){
						return '��ά����������Ϣ��'
					}
				}
			},
			
		});
		form.on('submit(submit_baseinfo)', function(data){
	  	 	var type=$("#type").val();
	  	 	var taskinfo = JSON.stringify(data.field);
		  	var openid = $("#openid").val();
		  	var clientsxh = $("#clientsxh").val();
		  	var professionalname = $("#professionalname").val();
		  	var graduateschoolname = $("#graduateschoolname").val();
		  	var url ="jxStudents.do?method=insertJxStudents";
		  	if(type==1){
		  		url = "jxStudents.do?method=updateJxStudents";
		  	}
			$.post(url,{taskinfo:encodeURI(taskinfo),openid:openid,clientsxh:clientsxh,type:'s',professionalname:professionalname,graduateschoolname:graduateschoolname},function (data, status) {
		        if( status=="success" ){
		            var json = eval(data);
		            switch (json.errorMsg) {
		            	case "idcarderror":		//�ɹ�
			               layer.msg("���֤���벻��ȷ��", {icon: 5});
			               break;
			            case "chunfu":		//�ɹ�
			               layer.msg("�Ѿ��и���Ա��Ϣ�������ظ���ӣ�", {icon: 5});
			               break;
			            case "openidchunfu":
			               layer.alert("���ֻ����Ѿ�ע���˺ţ������ظ�ע�ᣡ", {icon: 5});
			               break;
		                case "success":		//�ɹ�
			               layer.msg("ע��ɹ�", {icon: 1});
		                   $("#type").val("1");
			               break;
			            case "updetesuccess":		//�޸ĳɹ�
			               layer.msg("�޸ĳɹ�", {icon: 1});
		                   $("#type").val("1");
			               break;
		                case "failed":		//ʧ��
		                   layer.msg("ע��ʧ��", {icon: 2});
		                   break;
		                case "updatefailed":		//�޸�ʧ��
		                   layer.msg("�޸�ʧ��", {icon: 2});
		                   break;
		                case "error":		//�������쳣
		                   layer.msg("�������쳣���Ժ����ԣ�", {icon: 2}, {title: '����',offset: '100px'});
		                   break;
		            }
		        }else{
		            layer.msg("����ʧ�ܣ�", {icon: 2}, {title: '����'});
		        }
		    },"json");
			return false;
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
    
    
    	/* ------------------------------------------------��������-------------------------------------------------------- */
    	function getMonth(){
    		var start = $("#studystarttime").val();
    		var end = $("#studyendtime").val();
    		var iDays = 0;
    		var iYear = 0;
    		if(start!=null&&start!=""&&end!=null&&end!=""){
    			var syear = start.substring(0,4);
    			var eyear = end.substring(0,4);
    			iYear = (eyear*1)-(syear*1); 
	    		start = Date.parse(start);
	    		end = Date.parse(end);
	        	var dateSpan = Math.abs(end-start);
	        	iDays = Math.floor(dateSpan/(24*3600*1000));
    		}
    		var month = Math.ceil(iDays/30)/* +(iYear*12) */;
        	return month;
    	}

    	/* ------------------------------------------------�������-------------------------------------------------------- */
    	function getMoney(){
    		var comtype = $("#comtype").val();
    		var professional = $("#professional").val();
    		var month = $("#month").val();
    		var sxmoney,szmoney,money;
    		if(comtype!=null&&comtype!=""&&professional!=null&&professional!=""&&month!=null&&month!=""){
    			if(professional=='02'){
    				szmoney = 65;	
    			}else{
    				szmoney = 68;
    			}
	    		if(comtype==1){
	    			if(professional=='01'){
	    				sxmoney = 150*month;
	    			}else{
	    				sxmoney = 100*month;
	    			}
	    		}
	    		if(comtype==2){
	    			if(professional=='01'){
	    				sxmoney = 200*month;
	    			}else{
	    				sxmoney = 150*month;
	    			}
	    		}
	    		money = (szmoney*1)+(sxmoney*1);
    		}else{
    			money = 0;
    		}
        	return money;
    	}
    	
    	/* -------------------------------------------------------��Э��ҳ��------------------------------------------------------- */
    	function openxy(){
    		var stuname = $("#name").val();
    		var options=$("#graduateschool option:selected"); 
    		var graduateschool = options.text();
    		var studystarttime = $("#studystarttime").val();
    		var studyendtime = $("#studyendtime").val();
    		layer.open({
    	        type: 2,
    	        title: 'ʵϰ��Э��',
    	        area: ['90%', '90%'],
    	        shade: 0,
    	        maxmin: false,
    	        offset: '10px',
    	        skin: 'demo-class',
    	        content: "jxStudents.do?method=openAgreement&type=1&stuname="+stuname+"&graduateschool="+graduateschool+"&studystarttime="+studystarttime+"&studyendtime="+studyendtime,
    	        zIndex: layer.zIndex, //�ص�1
    	        success: function(layero){
    	          layer.setTop(layero); //�ص�2
    	        }
    	    });
    	}
    	
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
    		$("#assureemp").val(data.usernumber);
    		$("#assureempname").val(data.username);
    	}
</script>
</body>
</html>
