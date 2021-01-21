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
    <title>申请信息变更页面</title>
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
	<input type="hidden" id="openId" name="openId" value="${openId }"/>
	<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
	<input type="hidden" id="yitongcode" name="yitongcode" value="${empEntity.usernumber }">
	<input type="hidden" id="qyiyuan" name="qyiyuan" value="${empEntity.yiyuan }"/>
	<input type="hidden" id="qname" name="qname" value="${empEntity.username }"/>
	<input type="hidden" id="qusersex" name="qusersex" value="${empEntity.sex }"/>
	<input type="hidden" id="qsfzhm" name="qsfzhm" value="${empEntity.idcard }">
	<input type="hidden" id="qdept" name="qdept" value="${empEntity.depart }"/>
	<input type="hidden" id="qzhicheng" name="qzhicheng" value="${empEntity.zhicheng }">
	<input type="hidden" id="qzhichenglv" name="qzhichenglv" value="${empEntity.zhichenglv }">
	<input type="hidden" id="ishaveyiyuan" name="ishaveyiyuan" value="${ishaveyiyuan }">
	
	<input type="hidden" id="qzhuanye" name="qzhuanye" value="${empEntity.zhuanye}"/>
	<input type="hidden" id="qxueli" name="qxueli" value="${empEntity.xueli}">
	<input type="hidden" id="qminzu" name="qminzu" value="${empEntity.minzu }">
	<input type="hidden" id="qusertel" name="qusertel" value="${empEntity.usertel }">
	
	<div class="weui_tab" style="width: 100%;">
    	<div class="weui_tab_bd">
	        <div style="width: 100%;height: 80px;border-bottom: 0px solid #cccccc;background-color: #65B39D;">
  				<div style="width: 25%;height: 80px;float: left;">
  					<button style="width: 70px;height: 70px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;background-color: #65B39D;" >
  						<img src="images/boolean/xgmm.png" style="width: 70px;height: 70px;margin-left: 3px;" onclick="MillisecondToDate('-661000');">
  					</button>
  				</div>
  				<div style="width: 45%;height: 80px;float: left;">
  					<div style="width: 100%;margin-top: 20px;">
	  					<span style="color: #fff;font-size: 18px;"><b>申请信息变更</b></span><br>
	  					<span style="color: #fff;font-size: 15px;">医通号:
	  						${empEntity.usernumber }
	  					</span>
  					</div>
  				</div>
  				<div style="width: 30%;height: 80px;float: left;">
  					<div style="width: 100%;margin-top: 30px;">
	  					<span style="color: #fff;font-size: 15px;float: right;margin-right: 10px;">2018-09-28</span>
  					</div>
  				</div>
  			</div>
        	<!-- 内容展现 -->
       		<div style="width: 100%;; height: 30px;border: 1px solid #cccccc;background-color:#DCDDC0;padding:5px; ">
  				<span style="color: red;font-size: 15px;">
  					医院：【${yiyuan}】
  				</span><br>
 			</div>
       		<div style="padding: 3px;overflow-y:auto;height: 84%;margin-bottom: 5px;">
	        	<div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">姓名：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <input class="weui_input" id="username" name="username"  type="text" value="${empEntity.username }">
	                </div>
	            </div>
	             <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">性别：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <c:if test="${empEntity.sex==1 }">
	                    	<input type="radio" name="usersex" id="usersex" value="1" checked="checked">男&nbsp;&nbsp;
	                    	<input type="radio" name="usersex" id="usersex" value="0">女
	                    </c:if>
	                    <c:if test="${empEntity.sex==0 }">
	                    	<input type="radio" name="usersex" id="usersex" value="1">男&nbsp;&nbsp;
	                    	<input type="radio" name="usersex" id="usersex" checked="checked" value="0">女
	                    </c:if>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">身份证号：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <input class="weui_input" id="sfzhm" name="sfzhm"  type="text" value="${empEntity.idcard }">
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">电话：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <input class="weui_input" id="usertel" name="usertel"  type="text" value="${empEntity.usertel }">
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">所属部门：</label></div>
	                <div class="weui_cell_bd weui_cell_primary" id="deptId">
					    <select id="dept" name="dept" class="weui_input">
	                		<c:forEach items="${deptList }" var="deptList">
	                			<c:if test="${empEntity.depart==deptList.glbm }">
	                				<option value="${deptList.glbm }" selected>${deptList.bmmc }</option>
	                			</c:if>
	                			<c:if test="${empEntity.depart!=deptList.glbm }">
	                				<option value="${deptList.glbm }">${deptList.bmmc }</option>
	                			</c:if>
	                		</c:forEach>
						</select>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">职称：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                	<select  id="zhicheng" name="zhicheng" style="width: 99%;" class="weui_input">
						 	<code:printCode dmjc="ZC" defaultValue="${empEntity.zhicheng }" type="1"/>
						</select>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">职称级别：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                	<select  id="zhichenglv" name="zhichenglv" style="width: 99%;" class="weui_input">
						 	<code:printCode dmjc="ZCJB" defaultValue="${empEntity.zhichenglv }" type="1"/>
						</select>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">专业：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                	<select  id="zhuanye" name="zhuanye" style="width: 99%;" class="weui_input">
						 	<code:printCode dmjc="ZY" defaultValue="${empEntity.zhuanye }" type="1"/>
						</select>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">学历：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                	<select  id="xueli" name="xueli" style="width: 99%;" class="weui_input">
						 	<code:printCode dmjc="XL" defaultValue="${empEntity.xueli }" type="1"/>
						</select>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">名族：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                	<select  id="minzu" name="minzu" style="width: 99%;" class="weui_input">
						 	<code:printCode dmjc="MZ" defaultValue="${empEntity.minzu }" type="1"/>
						</select>
	                </div>
	            </div>
			</div>
			<!---------------------------------------------------------- 底部菜单-------------------------------------------------------->
			<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
			    <div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 50%;">
			      	<button type="button" onclick="submitInfo();" class="layui-btn"><i class="layui-icon">&#x1005;</i>立即提交</button>
		    	</div>
		    	<div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 50%;">
			      	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>关闭</button>
		    	</div>
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
	layui.use(['form','laydate'], function(){
		  var form = layui.form;
		  form.render();
	});
		
	function submitInfo(){
		var yitongcode = $("#yitongcode").val();
    	var openid = $("#openId").val();
    	var clientsxh = $("#clientsxh").val();
    	
    	var username = $("#username").val();
    	var usersex = $("input[name='usersex']:checked").val();
    	var sfzhm = $("#sfzhm").val();
    	var dept = $("#dept").val();
    	var zhicheng = $("#zhicheng").val();
    	var zhichenglv = $("#zhichenglv").val();
    	var zhuanye = $("#zhuanye").val();
    	var xueli = $("#xueli").val();
    	var minzu = $("#minzu").val();
		var usertel = $("#usertel").val();
    	
    	var yiyuan = $("#qyiyuan").val();
    	var qusername = $("#qname").val();
    	var qusersex = $("#qusersex").val();
    	var qsfzhm = $("#qsfzhm").val();
    	var qdept = $("#qdept").val();
    	var qzhicheng = $("#qzhicheng").val();
    	var qzhichenglv = $("#qzhichenglv").val();
    	var qzhuanye = $("#qzhuanye").val();
    	var qxueli = $("#qxueli").val();
    	var qminzu = $("#qminzu").val();
    	var qusertel = $("#qusertel").val();
    	if(usertel==""||usertel==null){
    		$.alert("请完善您的联系方式！","提示");
    		return;
    	}
    	if(username==qusername&&usersex==qusersex&&sfzhm==qsfzhm&&
    	   dept==qdept&&zhicheng==qzhicheng&&zhichenglv==qzhichenglv&&zhuanye==qzhuanye&&xueli==qxueli&&minzu==qminzu&&usertel==qusertel){
    		$.alert("您还未更改任何信息！","提示");
    		return false;
    	}
    	var applyinfos = {};
    	applyinfos['openid']=openid;
    	applyinfos['yitongcode']=yitongcode;
    	applyinfos['yiyuan']=yiyuan;
    	applyinfos['userxm']=username;
    	applyinfos['sfzhm']=sfzhm;
    	applyinfos['usersex']=usersex;
    	applyinfos['dept']=dept;
    	applyinfos['zhicheng']=zhicheng;
    	applyinfos['yhlb']=zhichenglv;
    	applyinfos['remark1']=zhuanye;
    	applyinfos['remark2']=xueli;
    	applyinfos['remark3']=minzu;
    	applyinfos['zkrlxfs']=usertel;
    	applyinfos['state']='0';
    	applyinfos['bltype']='1';
    	applyinfos['spbj']='0';
		var applyInfo = JSON.stringify(applyinfos);
        //ajax请求数据
        var url = "applyInfo.do?method=SaveApplyinfo";
        $.post(url,{applyInfo:encodeURI(applyInfo),clientsxh:clientsxh},function (data, status) {
            if( status=="success" ){
                var json = eval(data);
                switch (json.errorMsg) {
                    case "success":		//成功
                        $.toast("提交申请成功");
                        setTimeout("WeixinJSBridge.call('closeWindow')",1000);
                        break;
                    case "failed":		//失败
                        $.alert("申请失败！", "提示");
                        break;
                    case "error":		//服务器异常
                        $.alert("服务器异常，稍后再试！", "警告！");
                        break;
                }
            }else{
                $.alert("操作失败！", "提示");
            }
        },"json");
	}
</script>
</body>
</html>
