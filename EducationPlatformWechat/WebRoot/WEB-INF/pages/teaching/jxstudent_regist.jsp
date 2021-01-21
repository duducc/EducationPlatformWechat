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
    
    <title>见习学员信息</title>
    
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
		<input type="hidden" id="pertype" name="pertype" lay-verify="pertype" value="${pertype}"/><!-- 人员类型（5:见习生） -->
		<input type="hidden" id="state" name="state" lay-verify="state" value="${entity.state!=null&&entity.state!=''?entity.state:1 }"/><!-- 状态0，未审核 -->
		<input type="hidden" id="fyzje" name="fyzje" lay-verify="fyzje" autocomplete="off" value="${entity.fyzje }"><!-- 总费用 -->
		<input type="hidden" id="jfbj" name="jfbj" lay-verify="jfbj" value="${entity.jfbj!=null&&entity.jfbj!=''?entity.jfbj:0}"><!-- 总费用 -->
		<input type="hidden" id="zt" name="zt" lay-verify="zt" value="${entity.zt!=null&&entity.zt!=''?entity.zt:0}"><!-- 状态 -->
		<input type="hidden" id="shzt" name="shzt" lay-verify="shzt" value="${entity.shzt!=null&&entity.shzt!=''?entity.shzt:2}"><!-- 自己提交还是学校提交 -->
		<input type="hidden" id="sxzmbj" name="sxzmbj" lay-verify="sxzmbj" value="${entity.sxzmbj!=null&&entity.sxzmbj!=''?entity.sxzmbj:0}"/>
    	<!------------------------------------------------------开头 --------------------------------------------------------->
    	<div style="width: 100%;height: 80px;border-bottom: 0px solid #cccccc;background-color: #65B39D;">
			<div style="width: 25%;height: 80px;float: left;">
				<button style="width: 70px;height: 70px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;background-color: #65B39D" >
					<img src="images/boolean/qt.png" style="width: 70px;height: 70px;margin-left: 3px;" onclick="MillisecondToDate('-661000');">
				</button>
			</div>
			<div style="width: 45%;height: 80px;float: left;">
				<div style="width: 100%;margin-top: 26px;">
					<span style="color: #fff;font-size: 18px;"><b>学员注册</b></span><br>
					<span style="color: #fff;font-size: 15px;">红色选项为必填项</span>
				</div>
			</div>
		</div>
		<div style="overflow-y:auto;height: 85%;background-color: #fff;" id="mainCount_div">
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">学员基本信息</h2>
  					<div class="layui-colla-content layui-show">
						<div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;">学员编号</label>
						    <div class="layui-input-inline">
						      	<input value="${stuid==null||stuid==''?entity.xh:stuid }" type="text" name="xh" id="xh" lay-verify="xh" autocomplete="off" class="layui-input" readonly="readonly">
						      	<input value="${stuid==null||stuid==''?entity.xh:stuid }" type="hidden" name="schoolnum" id="schoolnum" lay-verify="schoolnum" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >姓名</label>
						    <div class="layui-input-inline">
						      <input value="${entity.name }" type="text" name="name" id="name" lay-verify="name" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >性别</label>
						    <div class="layui-input-inline">
								<select name="sex" id="sex" lay-verify="sex">
								 	<code:printCode dmjc="XB" defaultValue="${entity.sex}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >身份证号</label>
						    <div class="layui-input-inline">
						      <input  value="${entity.idcard }" type="text" name="idcard" id="idcard" lay-verify="idcard" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >联系电话</label>
						    <div class="layui-input-inline">
						      <input value="${entity.telnumber }" type="text" name="telnumber" id="telnumber" lay-verify="telnumber" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >学历</label>
						    <div class="layui-input-inline">
						      	<select name="xueli" id="xueli" lay-verify="xueli">
								 	<code:printCode dmjc="XL" defaultValue="${entity.xueli}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" >政治面貌</label>
						    <div class="layui-input-inline">
						      	<select name="government" id="government" lay-verify="government">
								 	<code:printCode dmjc="ZZMM" defaultValue="${entity.government}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label"  >民族</label>
						    <div class="layui-input-inline">
						      	<select name="national" id="national" lay-verify="national">
								 	<code:printCode dmjc="MZ" defaultValue="${entity.national}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div>
 					</div>
				</div>
			</div>
			<!---------------------------------------------------------家庭信息 -------------------------------------------------->
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">家庭联系人信息</h2>
  					<div class="layui-colla-content layui-show">
						<div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;">家长姓名</label>
						    <div class="layui-input-inline">
						      <input value="${entity.familyname }" type="text" name="familyname" id="familyname" lay-verify="familyname" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div> 
					    <div class="layui-form-item">
						    <label class="layui-form-label"  style="color:red;">与本人关系</label>
						    <div class="layui-input-inline">
						      	<select name="familyreat" id="familyreat" lay-verify="familyreat">
								 	<code:printCode dmjc="STUGX" defaultValue="${entity.familyreat}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div> 
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >家庭电话</label>
						    <div class="layui-input-inline">
						      <input value="${entity.familytel }" type="text" name="familytel" id="familytel" lay-verify="familytel" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div> 
					    <div class="layui-form-item">
						    <label class="layui-form-label" >户籍地址</label>
						    <div class="layui-input-inline">
						      <input value="${entity.familyaddress }" type="text" name="familyaddress" id="familyaddress" lay-verify="familyaddress" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div>
 					</div>
				</div>
			</div>
			<!--------------------------------------------------------实习信息 -------------------------------------------------------->
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">见习信息</h2>
  					<div class="layui-colla-content layui-show">
  						<div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >见习类型</label>
						    <div class="layui-input-inline">
						      	<select name="zhiweitype" id="zhiweitype" lay-verify="zhiweitype">
								 	<code:printCode dmjc="SHXTYPE" defaultValue="${entity.zhiweitype}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div>
						<div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >见习年度</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.stuyear==''||entity.stuyear==null?nowyear:entity.stuyear}" type="text" name="stuyear" id="stuyear" lay-verify="stuyear" placeholder="YYYY" autocomplete="off" class="layui-input" readonly="readonly">
						    </div>
					    </div> 
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >开始时间</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.studystarttime.substring(0,19) }" type="text" name="studystarttime" id="studystarttime" lay-verify="studystarttime" placeholder="YYYY-mm-dd" autocomplete="off" class="layui-input" readonly="readonly">
						    </div>
					    </div> 
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >结束时间</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.studyendtime.substring(0,19) }" type="text" name="studyendtime" id="studyendtime" lay-verify="studyendtime" placeholder="YYYY-mm-dd" autocomplete="off" class="layui-input" readonly="readonly">
						    </div>
					    </div> 
					    <div class="layui-form-item">
						    <label class="layui-form-label" >见习月数</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.month }" type="text" style="width: 60%;float: left;" name="month" id="month" lay-verify="month" autocomplete="off" class="layui-input" readonly="readonly">
						      	<label class="layui-form-label" style="width: 40%;float: left;border-left: 0px;">月</label>
						    </div>
					    </div> 
 					</div>
				</div>
			</div>
			<!--------------------------------------------------------学校信息 -------------------------------------------------------->
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">学校/学生信息</h2>
  					<div class="layui-colla-content layui-show">
						<div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >来院方式</label>
						    <div class="layui-input-inline">
						      	<select name="comtype" id="comtype" lay-verify="comtype" lay-filter="comtype">
								 	<code:printCode dmjc="SHXLYFS" defaultValue="${entity.comtype}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >学校名称</label>
						    <div class="layui-input-inline">
						    	<input type="hidden" id="graduateschoolname"/>
						    	<select name="graduateschool" id="graduateschool" lay-verify="graduateschool" lay-filter="graduateschool">
								 	<code:printCode dmjc="SHXSCH" defaultValue="${entity.graduateschool}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div>
					    <div class="layui-form-item">
					    	<label class="layui-form-label" style="color: red;">学院：</label>
						    <div class="layui-input-inline">
						    	<input type="hidden" id="collegename" name="collegename" lay-verify="collegename"/>
						      	<select id="collegeid" name="collegeid" lay-verify="collegeid" lay-filter="collegeid">
								 	<code:printCode bShowDmz="false" dmjc="COLLEGE" defaultValue="${entity.collegeid }" type="1"/>
								</select>
						    </div>
						</div>
						<div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >年级</label>
						    <div class="layui-input-inline">
								<input style="width: 50%;float: left;" value="${entity.grade}" type="text" name="grade" id="grade" lay-verify="grade" placeholder="YYYY" autocomplete="off" class="layui-input" readonly="readonly">
								<label class="layui-form-label" style="width: 49%;float: left;" >级</label>
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >专业</label>
						    <div class="layui-input-inline">
						    	<input type="hidden" id="professionalname"/>
						      	<select name="professional" id="professional" lay-verify="professional" lay-filter="professional">
								 	<code:printCode dmjc="ZY" defaultValue="${entity.professional}" type="1" bShowDmz="false"/>
								</select>
						    </div>
					    </div> 
					    <div class="layui-form-item">
					    	<label class="layui-form-label" style="color: red;">班级：</label>
						    <div class="layui-input-inline">
						      	<select id="banji" name="banji" lay-verify="banji" lay-filter="banji">
								 	<code:printCode bShowDmz="false" dmjc="BANJI" defaultValue="${entity.banji }" type="1"/>
								</select>
						    </div>
						</div>
					    <div class="layui-form-item" id="dbrdiv" style="display: none;" >
						    <label class="layui-form-label" style="color:red;" >担保人</label>
						    <div class="layui-input-inline">
						    	<input id="assureemp" type="hidden" name="assureemp" lay-verify="assureemp" value="${entity.assureemp }" >
						      	<input id="assureempname" type="text" name="assureempname" value="${entity.assureempname }" lay-verify="assureempname" placeholder="请选择担保人" autocomplete="off" class="layui-input" style="height:38px;width: 60%;float: left;" readonly="readonly">
						      	<button style="float: left;height: 38px;width: 40%;" class="layui-btn layui-btn-sm" type="button" onclick="getemp();"><i class="layui-icon">&#xe615;</i>查询</button>
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >学校老师</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.schoolteachername }" type="text" name="schoolteachername" id="schoolteachername" lay-verify="schoolteachername" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div> 
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >老师电话</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.schoolteachertel }" type="text" name="schoolteachertel" id="schoolteachertel" lay-verify="schoolteachertel" placeholder="请输入" autocomplete="off" class="layui-input">
						    </div>
					    </div> 
 					</div>
				</div>
			</div>
		    <!--------------------------------------------------------其他信息 -------------------------------------------------------->
			<div class="layui-collapse" style="margin-top: 10px;margin-bottom: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">其他信息</h2>
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
						  <span style="color: blue;">《一寸蓝底免冠照片》</span>
						</div> 
					    <c:if test="${type==1 }">
						    <div class="layui-form-item">
							    <label class="layui-form-label" >审核状态</label>
							    <div class="layui-input-inline">
							      	<input value="${entity.state==0?'未审核':(entity.state==2?'审核通过':'审核未通过') }" type="text" readonly="readonly"  autocomplete="off" class="layui-input">
							    </div>
						    </div>
						    <c:if test="${entity.state==1||entity.state==2 }">
							    <div class="layui-form-item layui-form-text">
								    <label class="layui-form-label">审核信息</label>
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
					<input type="checkbox" lay-skin="switch" lay-filter="switchTest" checked="" lay-text="同意|不同意">
					<input type="hidden" name="shxsxy" id="shxsxy" lay-verify="shxsxy" value="2"/>
				</c:if>
				<c:if test="${entity==null }">
					<input type="checkbox" lay-skin="switch" lay-filter="switchTest" lay-text="同意|不同意">
					<input type="hidden" name="shxsxy" id="shxsxy" lay-verify="shxsxy" value="1"/>
				</c:if>
				<span style="font-size: 14px;">我已阅读并同意见习生协议</span><a onclick="openxy();" style="font-size: 14px;margin-left: 15px;color: blue;">《实习生协议》</a>
			</div>
		</div>
		<input type="hidden" id="isuploding" name="isuploding" lay-verify="isuploding" value="0"/>
    	<input type="hidden" id="imagepath" name="imagepath" lay-verify="imagepath" value="${entity.imagepath}"/> <!-- 图片路径 -->
		<%-- <c:if test="${entity.state!=1 }"> --%>
		<c:if test="${type==0 }">
	    	<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;margin-bottom: -5px;">
		    	<div style="margin-top: 5px;width: 100%;text-align: center;">
			     	<button name="bindingBtn" type="button" class="layui-btn" lay-submit="submit_baseinfo" lay-filter="submit_baseinfo"><i class="layui-icon">&#x1005;</i>立即提交</button>
			     	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>关闭</button>
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
		//日期
		laydate.render({elem: '#studystarttime',theme: 'molv',position: 'fixed' ,done: function(value, date, endDate){
		    var end = $("#studyendtime").val();
		    if(end!=null&&end!=""){
		    	var starttime = new Date(Date.parse(value));
		    	var endtime = new Date(Date.parse(end));
		    	if(starttime>endtime){
		    		layer.msg("开始时间不能大于结束时间");
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
		    		layer.msg("开始时间不能大于结束时间");
		    		$("#studyendtime").val("");
		    	}
		    }
		    var day = getMonth();
		    $("#month").val(day);
		    var money = getMoney();
		    $("#fyzje").val(money);
		}});
		laydate.render({elem: '#grade',theme: 'molv',type: 'year',position: 'fixed' });
        //初始化班级
       /* 
        *msg弹出框：1、绿色对号
        		 2、红色错号
        		 3、换色问号
        		 4、灰色锁子
        		 5、红色难过
        		 6、绿色微笑
        		 7、橘色感叹号
        */
        form.on('switch(switchTest)', function(data){
			if(this.checked==true){
				$("#shxsxy").val(2);
			}else{
				$("#shxsxy").val(1);
			}
		});
		//自定义验证规则
		form.verify({
			name: function(value){if(value==""||value==null){return '姓名不能为空！'}},
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
			shxsxy: function(value){if(value==1){return '您还没有同意实习生协议！'}},
			assureemp: function(value){
				var comtype = $("#comtype").val();
				if(comtype==2){
					if(value==""||value==null){
						return '请维护担保人信息！'
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
		            	case "idcarderror":		//成功
			               layer.msg("身份证号码不正确！", {icon: 5});
			               break;
			            case "chunfu":		//成功
			               layer.msg("已经有该人员信息，请勿重复添加！", {icon: 5});
			               break;
			            case "openidchunfu":
			               layer.alert("该手机号已经注册账号，不能重复注册！", {icon: 5});
			               break;
		                case "success":		//成功
			               layer.msg("注册成功", {icon: 1});
		                   $("#type").val("1");
			               break;
			            case "updetesuccess":		//修改成功
			               layer.msg("修改成功", {icon: 1});
		                   $("#type").val("1");
			               break;
		                case "failed":		//失败
		                   layer.msg("注册失败", {icon: 2});
		                   break;
		                case "updatefailed":		//修改失败
		                   layer.msg("修改失败", {icon: 2});
		                   break;
		                case "error":		//服务器异常
		                   layer.msg("服务器异常，稍后再试！", {icon: 2}, {title: '警告',offset: '100px'});
		                   break;
		            }
		        }else{
		            layer.msg("操作失败！", {icon: 2}, {title: '警告'});
		        }
		    },"json");
			return false;
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
    
    
    	/* ------------------------------------------------计算月数-------------------------------------------------------- */
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

    	/* ------------------------------------------------计算费用-------------------------------------------------------- */
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
    	
    	/* -------------------------------------------------------打开协议页面------------------------------------------------------- */
    	function openxy(){
    		var stuname = $("#name").val();
    		var options=$("#graduateschool option:selected"); 
    		var graduateschool = options.text();
    		var studystarttime = $("#studystarttime").val();
    		var studyendtime = $("#studyendtime").val();
    		layer.open({
    	        type: 2,
    	        title: '实习生协议',
    	        area: ['90%', '90%'],
    	        shade: 0,
    	        maxmin: false,
    	        offset: '10px',
    	        skin: 'demo-class',
    	        content: "jxStudents.do?method=openAgreement&type=1&stuname="+stuname+"&graduateschool="+graduateschool+"&studystarttime="+studystarttime+"&studyendtime="+studyendtime,
    	        zIndex: layer.zIndex, //重点1
    	        success: function(layero){
    	          layer.setTop(layero); //重点2
    	        }
    	    });
    	}
    	
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
    		$("#assureemp").val(data.usernumber);
    		$("#assureempname").val(data.username);
    	}
</script>
</body>
</html>
