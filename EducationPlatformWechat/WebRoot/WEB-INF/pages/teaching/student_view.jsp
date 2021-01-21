<%@ page language="java" contentType="text/html; charset=gbk" pageEncoding="gbk"%>
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
    <title>���۽�ʦ</title>
    <meta charset="gbk">
    <meta http-equiv="pragma" content="no-cache">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
    <script src="js/jquery.1.7.2.min.js"></script>
    <script src="js/jquery-weui.js"></script>
	<script src="js/umgo-picker.js"></script>
	<script type="text/javascript" src="js/json2.js"></script>
	
	<style type="text/css">
	td{
			algin:center;
			border: 1px solid #7d848d;
			font-size:1.0em;
			height:30px;
			color: #a7abae;
			}
	.c{
		display:inline;
		}

	
	</style>
</head>
<body >
	<from class="layui-form">
	<input type="hidden" id = "clientsxh" value="${clientsxh}">
	<input type="hidden" id = "openid" value="${openid}">
	<input type="hidden" id = "teacherid" name = "teacherid"value="${entity.teacherid}">
	<input type="hidden" id = "teachername" name = "teachername"value="${entity.teachername}">
	<input type="hidden" id = "depid" name = "depid"value="${entity.deptid}">
	<input type="hidden" id = "depname" name = "depname"value="${entity.remark1}">
	<input type="hidden" id = "startdate" name = "startdate"value="${entity.startdate.substring(0,19)}">
	<input type="hidden" id = "enddate" name = "enddate"value="${entity.enddate.substring(0,19)}">
	<input type="hidden" id = "checkboxSize" value="${checkboxList.size()}">
	<div style="background-color: #E9D7D4;width: 100%;height: 200px;text-align: center">
	<c:if test="${sex==1}">
	<img style="width: 150px;height: 150px;margin-top: 10px"  src="images/doct2.png">
	</c:if>
	<c:if test="${sex==0}">
	<img style="width: 150px;height: 150px;margin-top: 10px"  src="images/doct.png">
	</c:if>
	<h3 style="text-align: center;color: #525454"><b>${entity.remark1 }:${entity.teachername }</b></h3>
	</div><br>
	<div style="width: 100%;height: 100px">
	<p style="font-size: 1.0em;line-height: 15px;color: red"><b style="color: #28b294">&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;</b>�����ͱ��������ʾ�������������ṩ���ı������</p>
	<br>
	<table style="width: 100%;margin: auto">
		<!-- ------------------------------------------------------��ѡ----------------------------------------------------------------- -->
		<c:forEach var="radio" items="${radioList }" varStatus="ra">
			<tr><td style="width: 60%"><i class="layui-icon" style="color: ${radio.remark5.split('@')[0] }">&nbsp;&nbsp;${radio.remark5.split('@')[1] }</i>&nbsp;&nbsp;&nbsp;&nbsp;${radio.name }</td><td style="text-align: center">
			<from class="layui-form">
			<c:forEach var="value" begin="1" end="${radio.remark1.split('@')[0] }" varStatus="va">
			<input class="c" type="radio" name="radioo${ra.index }" value="${radio.remark1.split('@')[0]-va.index+1 }" title="${radio.remark1.split('@')[va.index]}" <c:if test="${va.index==1 }"> checked=""</c:if>style="width: 25%">
			</c:forEach>
		    </from>
    		</td></tr>
		</c:forEach>
		<!-- ------------------------------------------------------��ѡ����----------------------------------------------------------------- -->
		
		<!-- ------------------------------------------------------��ѡ----------------------------------------------------------------- -->
		<c:forEach var="checkbox" items="${checkboxList }" varStatus="ch">
			<tr><td style="width: 100%" colspan="2"><i class="layui-icon" style="color: ${checkbox.remark5.split('@')[0] }">&nbsp;&nbsp;${checkbox.remark5.split('@')[1] }</i>&nbsp;&nbsp;&nbsp;&nbsp;${checkbox.name }<br> 
				<from class="layui-form">
				  	<c:forEach var="value" begin="1" end="${checkbox.remark1.split('@')[0] }" varStatus="va">
						<div <c:if test="${va.index%2==1 }">style="float:left;margin-left: 15px"</c:if><c:if test="${va.index%2==0 }">style="float:right;margin-right: 5px"</c:if>>
						<input  type="checkbox" name="checkbox${ch.index+1 }" value="${va.index+1 }" lay-skin="primary" title="${checkbox.remark1.split('@')[va.index]}" >
						</div>
					</c:forEach>
			      <textarea placeholder="����������" name="checkboxQuestion${ch.index+1 }"   lay-verify="question"class="layui-textarea"></textarea>
		      	</from>
	      	</td></tr>
		</c:forEach>
		
		<!-- ------------------------------------------------------��ѡ����----------------------------------------------------------------- -->
		
		<!-- ------------------------------------------------------�͹�����----------------------------------------------------------------- -->
		<c:forEach var="question" items="${questionList }" varStatus="qu">
			<tr><td style="width: 100%" colspan="2"><i class="layui-icon" style="color: ${question.remark5.split('@')[0]}">&nbsp;&nbsp;${question.remark5.split('@')[1]}</i>&nbsp;&nbsp;&nbsp;&nbsp;${question.name }<textarea placeholder="����������" name="question"   lay-verify="question"class="layui-textarea"></textarea></td></tr>
		</c:forEach>
		<!-- ------------------------------------------------------�����������----------------------------------------------------------------- -->
	</table>
	<p style="font-size: 1.0em;line-height: 15px;color: red;width: 100%;height: 60px">˵����Ϊʹ�����ѵ��������������������ʵ��д�����ʾ�������顣лл������</p>
	<button class="weui_btn weui_btn_primary" id="btn" style="width: 90%;margin-left: 5%" lay-submit="submit_baseinfo" lay-filter="submit_baseinfo">�����ύ</button>
	</div>
	</from>
</body>
<script src="layui/layui.all.js" charset="utf-8"></script>
<script type="text/javascript">
    	layui.use(['form', 'layedit', 'laydate','upload'], function(){
		  var form = layui.form
		  ,layer = layui.layer
		  ,layedit = layui.layedit
		  ,laydate = layui.laydate
		  ,upload = layui.upload;
		  
		  //����
		  laydate.render({
		    elem: '#graduatetime'
		  });
		   form.verify()
		  //����һ���༭��
		  var editIndex = layedit.build('LAY_demo_editor');
		 
		  /* //�Զ�����֤����
		  form.verify({
		  	  question: function(value){if(value==""||value==null){return '���������ݲ���Ϊ�գ�'}},
		  	  //question2: function(value){if(value==""||value==null){return '�����ݲ���Ϊ�գ�'}},
		  	  question: function(value){if(value==""||value==null){return '���������ݲ���Ϊ�գ�'}},
			  question: function(value){if(value==""||value==null){return '��������ݲ���Ϊ�գ�'}},
		  }); */
          //�����ύ
		  form.on('submit(submit_baseinfo)', function(data){
		  	var falg=true; 
		 	var allAnswer=new Array();
	        $("[type=radio]:checked").each(function () {
	        	allAnswer.push($(this).val())
	        });
	        
	        var checkboxSize=$("#checkboxSize").val();
	        for(var i = 1 ;i<=checkboxSize;i++){
	        	var answer="";
	        	$("[name=checkbox"+i+"]:checked").each(function () {
	        	if($(this).val()!=""){
	        		answer+=$(this).val()+".";
	        	}
		        });
		        answer.substring(0, answer.length-2)
		        answer+="@";
		          $("[name=checkboxQuestion"+i+"]").each(function () {
		        	if($(this).val()!=""){
		        		answer+=$(this).val()
		        	}else{
		        		answer+="*";
		        	}
		        });
		        
		        if(answer=="@*"){
		        	layer.msg("��ѡ����Ϊ��");
		        	falg=false;
		        	return;
		        }
		         allAnswer.push(answer);
	        }
	        $("textarea[name='question']").each(function () {
	        	if($(this).val()==""){
	        	layer.msg("���ⲻ��Ϊ��");
	        	falg=false;
	        	return;
	        	}
	        	allAnswer.push($(this).val());
	        });
	        console.log(allAnswer)
	    
		 	var taskinfo = JSON.stringify(data.field);
		 	if(falg==true){
		 	commit(taskinfo,allAnswer);
		 	}
		  }); 
		})
		
		function commit(taskinfo,allAnswer){
	        	var openid = $("#openid").val();
			  	var clientsxh = $("#clientsxh").val();
			  	var url ="jxEvaluateTeacher.do?method=insertJxEvaluateTeacher";
			  	$.post(url,{taskinfo:encodeURI(taskinfo),openid:openid,clientsxh:clientsxh,allAnswer:allAnswer},function (data, status) {
		                  if( status=="success" ){
		                      var json = eval(data);
		                      switch (json.errorMsg) {
		                          case "success":		//�ɹ�
			                          $.toast("�ύ�ɹ�");
			                          $("#btn").attr("disabled",true);
				                      setTimeout( toDepListPage(),2000);
			                          break;
		                          case "failed":		//ʧ��
		                        	  layer.msg("�ύʧ��");
		                              break;
		                          case "error":		//�������쳣
		                              layer.msg("�������쳣���Ժ����ԣ�", {title: '����',offset: '100px'});
		                              break;
		                      }
		                  }else{
		                      layer.msg("����ʧ�ܣ�", {title: '����'});
		                  }
		            },"json");
		}
		
		function toDepListPage(){
			 var url = "jxEvaluateTeacher.do?method=toEvaluatePage"+"&clientsxh="+$("#clientsxh").val()+"&openid="+$("#openid").val();
	   		 window.open(url,"toBonusMsg");
		}
</script>
</body>
</html>
