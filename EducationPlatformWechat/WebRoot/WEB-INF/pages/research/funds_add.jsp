<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/codetag" prefix="code"%>
<%@ taglib uri="/printDep" prefix="dep"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
<link rel="stylesheet" type="text/css" href="weiui/dist/style/weui.css" />
<link rel="stylesheet" type="text/css" href="weiui/dist/style/weui.min.css" />
<link rel="stylesheet" href="css/weui.css">
<link rel="stylesheet" href="css/jquery-weui.css">
<link rel="stylesheet" href="css/demos.css">
 <script src="js/jquery.1.7.2.min.js"></script>
<script type="text/javascript" src="weiui/dist/example/zepto.min.js"></script>
<script type="text/javascript" src="js/iscroll.js"></script>
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="js/jquery-weui.js"></script>
<script type="text/javascript" src="weiui/js/common.js"></script>
<script type="text/javascript" src="js/translation.js"></script><!--字段翻译  -->
<style type="text/css">
table.altrowstable td {
     border-width: px;
     padding: 6px;
     border-color: #a9c6c9;
     height: 50px;
 }
.tr1{
 	border-bottom: 1px solid #DDDDDD;
 }
 .td1{
 	width: 30%;
 }
 .td2{
 	width: 69%
 }
 .textarea{
 	width: 96%;
 	border-radius:5px;
 	background-color: #F0EFF5;
 	font-size: 16px;
 	padding:5px;
 	border: 1px solid #cccccc;
</style>
<jsp:directive.page import="com.saint.systemManager.bean.FrmDepartmentEntity"/>

<jsp:directive.page import="com.saint.pub.Tools"/>
<jsp:directive.page import="com.saint.constant.Constant"/>
<%
	/* UserSession userSession = (UserSession)session.getAttribute("userSession");
	//System.err.println(userSession.getUserMenuStr());
	FrmDepartmentEntity tempDep=userSession.getDep();
	FrmSysuserEntity userObj = (FrmSysuserEntity)request.getAttribute("userobj");
	String sjbm = tempDep.getSjbm() ; 
	String bj=userObj==null?"0":"1";//0 新增 1 修改
	//String glbm=userObj!=null?userObj.getGlbm():tempDep.getGlbm();//
	String glbm=Tools.replaceNull(request.getAttribute("glbm"));
	String bmjb=Tools.replaceNull(request.getAttribute("bmjb"));
	userObj=userObj==null?new FrmSysuserEntity():userObj; */
%>
<title>支出登记</title>
<style type="text/css">
	.td1,.td2{
		border-top:1px solid #cccccc;
		height: 40px;
	}
	.td11,.td21{
		border-top:1px solid #cccccc;
		border-bottom:1px solid #cccccc;
		height: 40px;
	}
	.select_wx{
		border:0px solid black;font-size: inherit;width: 100%;
	}
</style>
</head>
<body  ontouchstart>
       <form method="get" id="from1">
			<div class="weui_tab">
		    <!-- 内容 -->
		    	<div class="weui_tab_bd">
			        <!-- 标题 -->
			        <header class='demos-header' style="text-align: center;color: ">
			            <h1 class="demos-title">支出登记</h1>
			        </header>
			        <!-- 内容展现 -->
			        <div class="weui_cells weui_cells_form">
			             <div class="weui_cell">
			                <div class="weui_cell_hd"><label for="home-city" class="weui_label">支出金额：</label></div>
			                <div class="weui_cell_bd weui_cell_primary">
			                    <input style="width: 59%;" class="weui_input" id="funds" name="funds" placeholder="请输入金额" type="text" value="">
			                    <div style="width: 40%;float: right;">元</div>
			                </div>
			            </div>
			            <div class="weui_cell">
			                <div class="weui_cell_hd"><label for="home-city" class="weui_label">经费类型：</label></div>
			                <div class="weui_cell_bd weui_cell_primary">
						  		<select class="select_wx" id="buditemid" name="buditemid" onChange="gb(this);" required="required">
								 	<code:printCode dmjc="KYYSKM" type="1"/>
								</select>
						  		<input id="buditemname" type="hidden" name="buditemname"  >
						  		<input id="name" type="hidden" name="name"  value="${name }">
								<input id="id" type="hidden" name="id"  value="${id }">
			                </div>
			            </div>
			            <div class="weui_cell">
			                <div class="weui_cell_hd"><label for="home-city" class="weui_label">支出时间：</label></div>
			                <div class="weui_cell_bd weui_cell_primary">
			                    <input class="weui-input" id="time" type="date" value=""style="width: 100%" required="required" placeholder="请选择时间"/>
			                </div>
			            </div>
			            <div class="weui_cell">
			                <div class="weui_cell_hd"><label for="home-city" class="weui_label">支出说明：</label></div>
			                <div class="weui_cell_bd weui_cell_primary">
			                    <textarea class="textarea" rows="3"  id="expendremark" placeholder="请输入文本"  required="required"></textarea>
			                </div>
			            </div>
			        </div>
			        <div class='demos-content-padded'>
			            <a href="javascript:;" class="weui_btn weui_btn_primary"  type="submit" onclick="toRegistration();" >保存</a>
			        </div>
		    	</div>
			</div>
		</form>
</body>
<script type="text/javascript">
function toRegistration(){
    var data=$("#id").val();
     var funds=$("#funds").val();
	var buditemid=$("#buditemid").val();
	var buditemname=$("#buditemname").val();
	 var time=$("#time").val();
	  var name=$("#name").val();
	 if(funds==""){$.alert("请输入金额！");return}
	 if(time==""){$.alert("请选择时间！");return}
	  if(expendremark==""){$.alert("请输入支出说明！");return}
    var spath = "kyProject.do?method=toSaveFunds&id="+data+"&buditemid="+buditemid+"&buditemname="+buditemname+"&funds="+funds+"&time="+time+"&expendremark="+expendremark+"&name="+name;
	$.post(spath,{},function(data2){
    	var json = JSON.parse(data2);
    	 switch (json.errorMsg) {
                   case "success":		//成功
                       $.alert("登记成功！", "提示", function() {
							  var spath = "kyProject.do?method=toFundsMsg&id="+data+"&name="+name;
  								window.open(spath,"toFundsMsg");
							});
                       break;
                      case "failed":		
                        $.alert("登记失败！", "提示", function() {
							  var spath = "kyProject.do?method=toFundsMsg&id="+data+"&name="+name;
  								window.open(spath,"toFundsMsg");
							});
                       break;
                  }
   });
 }
function gb(){
		var select = document.getElementById("buditemid");
	    var index = select.selectedIndex;
	    var buditemname = select.options[index].text;
	    var buditemid = select.options[index].value;
	    document.getElementById("buditemname").value=buditemname;
	}
</script>
</html>