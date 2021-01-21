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
    <title>注册账号 </title>
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
	<input type="hidden" id="state" name="state" lay-verify="state" value="2"/>
	<input type="hidden" id="zt" name="zt" lay-verify="zt" value="1"/>
	<input type="hidden" id="birthday" name="birthday" lay-verify="birthday" value=""/>
	<input type="hidden" id="pertype" name="pertype" lay-verify="pertype" value="1"/>
	<input type="hidden" id="departid" name="departid" value="${entity.classid }"/>
	<div class="weui_tab" style="width: 100%;">
    	<div class="weui_tab_bd">
		    <div style="width: 100%;height: 80px;border-bottom: 0px solid #cccccc;background-color: #65B39D;">
				<div style="width: 25%;height: 80px;float: left;">
					<button style="width: 70px;height: 70px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;background-color: #65B39D" >
						<img src="images/boolean/qt.png" style="width: 70px;height: 70px;margin-left: 3px;" onclick="MillisecondToDate('-661000');">
					</button>
				</div>
				<div style="width: 45%;height: 80px;float: left;">
					<div style="width: 100%;margin-top: 26px;">
						<span style="color: #fff;font-size: 18px;"><b>研究生注册</b></span><br>
						<span style="color: #fff;font-size: 15px;">带*号选项为必填项</span>
					</div>
				</div>
			</div>
			<div class="weui_cells weui_cells_form" style="margin-top: 0px;">
    			<div style="width: 100%;; height: 50px;border-bottom: 1px solid #cccccc;background-color:#DCDDC0; ">
     				<span style="color: red;font-size: 14px;margin-left: 15px;">1.手机号最后将作为您的登录账户！</span><br>
     				<span style="color: red;font-size: 14px;margin-left: 15px;">2.填写手机号时，请填写真实有效的号码！</span>
    			</div>
     		</div>
   			<!-- 内容展现 -->
		   	<div style="overflow-y:auto;height: 80%;" id="mainCount_div">
		   		<div class="layui-form-item">
			    	<label class="layui-form-label" style="color: red;">手机号：</label>
				    <div class="layui-input-inline">
				      	<input id="telnumber" type="text" name="telnumber" value="${entity.telnumber }" lay-verify="telnumber" placeholder="请输入手机号码" autocomplete="off" class="layui-input" style="height:38px;">
				    </div>
				</div>
		     	<div class="layui-form-item">
			    	<label class="layui-form-label">姓名：</label>
				    <div class="layui-input-inline">
				      	<input id="name" type="text" name="name" value="${entity.name }" lay-verify="name" placeholder="请输入姓名" autocomplete="off" class="layui-input" style="height:38px;">
				    </div>
				</div>
		        <div class="layui-form-item">
			    	<label class="layui-form-label">性别：</label>
			    	<div class="layui-input-inline">
				      	<select name="sex" id="sex" lay-verify="sex">
						 	<code:printCode dmjc="XB" defaultValue="${entity.sex}" type="1" bShowDmz="false"/>
						</select>
				    </div>
				</div>
				<div class="layui-form-item">
			    	<label class="layui-form-label">身份证：</label>
				    <div class="layui-input-inline">
				      	<input id="idcard" type="text" name="idcard" value="${entity.idcard }" lay-verify="idcard" placeholder="请输入身份证号码" autocomplete="off" class="layui-input" style="height:38px;">
				    </div>
				</div>
				<div class="layui-form-item">
			    	<label class="layui-form-label">所在科室：</label>
				    <div class="layui-input-inline">
				    	<c:if test="${entity!=null&&entity.xh!=null&&entity.xh!='' }">
				    		<input type="text" value="${deptname }" autocomplete="off" class="layui-input" style="height:38px;" readonly="readonly">
				    	</c:if>
				    	<c:if test="${entity==null}">
				      	<select id="classid" name="classid" lay-verify="classid">
	                    	<option value="">请选择部门</option>
	                    	<c:forEach items="${deplist }" var="dept">
	                    		<option value="${dept.glbm }">${dept.bmmc}</option>
	                    	</c:forEach>
	                	</select>
	                	</c:if>
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
			    	<label class="layui-form-label">学号：</label>
				    <div class="layui-input-inline">
				      	<input id="schoolnum" type="text" name="schoolnum" value="${entity.schoolnum }" lay-verify="schoolnum" placeholder="请输入学号" autocomplete="off" class="layui-input" style="height:38px;">
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
			    	<label class="layui-form-label">学科方向：</label>
				    <div class="layui-input-inline">
				      	<input id="professionalguid" type="text" name="professionalguid" value="${entity.professionalguid }" lay-verify="professionalguid" placeholder="请输入学科方向" autocomplete="off" class="layui-input" style="height:38px;">
				    </div>
				</div>
				<div class="layui-form-item">
				    <label class="layui-form-label">导师：</label>
				    <div class="layui-input-inline">
				    	<input id="teacherid" type="hidden" name="teacherid" lay-verify="teacherid" value="${entity.teacherid }" >
				      	<input id="teachrename" type="text" name="teachrename" value="${entity.teachrename }" lay-verify="teachrename" placeholder="请选择教师" autocomplete="off" class="layui-input" style="height:38px;width: 60%;float: left;" readonly="readonly">
				      	<button style="float: left;height: 38px;width: 40%;" class="layui-btn layui-btn-sm" type="button" onclick="getteacher();"><i class="layui-icon">&#xe615;</i>查询</button>
				    </div>
				</div>
				<div class="layui-form-item">
			    	<label class="layui-form-label">研究生类型：</label>
				    <div class="layui-input-inline">
				    	<c:if test="${entity.zhiweitype==2||entity==null }">
					      	<input type="radio" name="zhiweitype" value="2" title="硕士" checked="">
					      	<input type="radio" name="zhiweitype" value="1" title="博士">
				    	</c:if>
				    	<c:if test="${entity.zhiweitype==1 }">
					      	<input type="radio" name="zhiweitype" value="2" title="硕士">
					      	<input type="radio" name="zhiweitype" value="1" title="博士" checked="">
				    	</c:if>
				    </div>
				</div>
				<div class="layui-form-item">
			    	<label class="layui-form-label">培养类型：</label>
				    <div class="layui-input-inline">
				    	<c:if test="${entity.cultivatetype==0||entity==null }">
					      	<input type="radio" name="cultivatetype" value="0" title="学术学位"  checked="">
				      		<input type="radio" name="cultivatetype" value="1" title="专业学位">
				    	</c:if>
				    	<c:if test="${entity.cultivatetype==1 }">
					      	<input type="radio" name="cultivatetype" value="0" title="学术学位" >
				      		<input type="radio" name="cultivatetype" value="1" title="专业学位" checked="">
				    	</c:if>
				    
				    	
				    </div>
				</div>
				<div class="layui-form-item">
			    	<label class="layui-form-label">是否规培：</label>
				    <div class="layui-input-inline">
				    	<c:if test="${entity.sfgp==0||entity==null }">
					      	<input type="radio" name="sfgp" value="0" title="是"  checked="">
				      		<input type="radio" name="sfgp" value="1" title="否">
				    	</c:if>
				    	<c:if test="${entity.sfgp==1 }">
					      	<input type="radio" name="sfgp" value="0" title="是" >
				      		<input type="radio" name="sfgp" value="1" title="否" checked="">
				    	</c:if>
				    
				    </div>
				</div>
		    </div>
		    <div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
		    	<div style="margin-top: 5px;width: 100%;text-align: center;">
		    		<c:if test="${entity==null }">
			     		<button name="bindingBtn" type="button" class="layui-btn" lay-submit="submit" lay-filter="submit"><i class="layui-icon">&#x1005;</i>立即提交</button>
				  	</c:if>
				  	<c:if test="${entity.xh!=null&&entity.xh!='' }">
			     		<button name="bindingBtn" type="button" class="layui-btn" onclick="graduatesc();"><i class="layui-icon">&#xe63c;</i>查看手册</button>
				  	</c:if>
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
	  	laydate.render({elem: '#grade',type:'year',theme: 'molv'});
	  	form.on('select(professional)', function(data){
			var name = data.elem[data.elem.selectedIndex].text;
			$("#professionalname").val(name);
		});
		form.on('select(graduateschool)', function(data){
			var name = data.elem[data.elem.selectedIndex].text;
		    $("#graduateschoolname").val(name);
		});
		form.on('select(collegeid)', function(data){
			var name = data.elem[data.elem.selectedIndex].text;
		    $("#collegename").val(name);
		});
	  	//创建一个编辑器
		var editIndex = layedit.build('LAY_demo_editor');
		//自定义验证规则
		form.verify({
			telnumber: function(value){if(value==""||value==null){
			  	  	return '请填写联系电话！';
			  	}else if(!(/^1[3|4|5|7|8][0-9]\d{4,8}$/.test(value))){
				  	return '请填写正确的电话！';
			  	}
		  	},
			name: function(value){if(value==""||value==null){return '姓名不能为空！'}},
			idcard: function(value){
				if(value==""||value==null){
					return '请填写身份证号码！';
				}else{
			  		var year = value.substring(6,10);
					var month = value.substring(10,12);
					var day = value.substring(12,14);
					var userShengri = year+"-"+month+"-"+day;
					$("#birthday").val(userShengri);
			  	}
			},
			classid: function(value){if(value==""||value==null){return '请选择科室！'}},
			xueli: function(value){if(value==""||value==null){return '请选择学历！'}},
			schoolnum: function(value){if(value==""||value==null){return '请填写学号！'}},
			graduateschool: function(value){if(value==""||value==null){return '请选择学校！'}},
			collegeid: function(value){if(value==""||value==null){return '请选择学院！'}},
			grade: function(value){if(value==""||value==null){return '请选择年级！'}},
			professional: function(value){if(value==""||value==null){return '请选择专业！'}},
			professionalguid: function(value){if(value==""||value==null){return '请填写学科方向！'}},
			teachrename: function(value){if(value==""||value==null){return '请填写导师名称！'}},
		});
		form.on('submit(submit)', function(data){
			var openid = $("#openid").val();
			var clientsxh = $("#clientsxh").val();
			var yhdh = $("#telnumber").val();
			var userinfos = {};
			userinfos['glbm']="62000001";
			userinfos['lxdh']=yhdh;
			userinfos['mmyxq']=getlateyear();
			userinfos['qxgroup']="321";
			userinfos['qxms']="321";
			userinfos['sfgly']="0";
			userinfos['sfzmhm']=$("#idcard").val();
			userinfos['xm']=$("#name").val();
			userinfos['yhdh']=yhdh;
			userinfos['yhgh']=yhdh;
			userinfos['yhjb']="6";
			userinfos['yhyxq']=getlateyear();
			userinfos['sfxz']="1";
			userinfos['zt']="0";
			var userInfo = JSON.stringify(userinfos);
	        var taskinfo = JSON.stringify(data.field);
	        document.getElementById('up_div').style.display ='block';
			var url = "jxStudents.do?method=saveGraduateInfo";
            $.post(url,{taskinfo:encodeURI(taskinfo),openid:openid,clientsxh:clientsxh,type:'g'},function (data, status) {
                if( status=="success" ){
                    var json = eval(data);
                    switch (json.errorMsg) {
	                    case "idcarderror":		//成功
	                        layer.alert("身份证号码不正确！", {title: '提示信息'});
	                        document.getElementById('up_div').style.display ='none';
	                        break;
	                    case "chongfu":		//成功
	                          layer.alert("该手机号已注册账号！", {title: '提示信息'});
	                          document.getElementById('up_div').style.display ='none';
	                          break;
	                    /* case "openidchunfu":		//成功
	                          layer.alert("该手机号已注册！", {title: '提示信息'});
	                          document.getElementById('up_div').style.display ='none';
	                          break; */
                        case "success":		//成功
                        	var url = "sysuser.do?method=addUser";
                            $.post(url,{userInfo:encodeURI(userInfo),openid:openid,clientsxh:clientsxh},function (data, status) {
                                if( status=="success" ){
                                    var json = eval(data);
                                    switch (json.errorMsg) {
                                        case "success":		//成功
                                        	  document.getElementById('up_div').style.display ='none';
                                       		  var url = "jxStudents.do?method=toGraduateSuccessPage";
                                       		  window.open(url,"toGraduateSuccessPage");
                                        	  
                	                          break;
                                        case "failed":		//失败
                                      	  	  layer.alert("注册失败", {title: '提示信息'});
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
                        case "failed":		//失败
                      	  	  /* layer.alert("添加失败3", {title: '提示信息'}); */
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
