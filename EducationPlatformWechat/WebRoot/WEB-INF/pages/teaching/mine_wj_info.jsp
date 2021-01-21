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
    
    <title>Υ����Ϣ</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script src="js/jquery.1.7.2.min.js"></script>
	<script src="js/jquery-weui.js"></script>
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
    	<input type="hidden" id="userid" name="userid" value="${userid}"/>
    	<!------------------------------------------------------��ͷ --------------------------------------------------------->
		<div style="overflow-y:auto;height: 95%;background-color: #fff;margin-bottom: 10px;" id="mainCount_div">
			<div class="layui-collapse" style="margin-top: 10px;width: 98%;margin-left: 1%;">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">�Ǽ���Ϣ</h2>
  					<div class="layui-colla-content layui-show">
						<div class="layui-form-item">
						    <label class="layui-form-label">�Ǽǿ���</label>
						    <div class="layui-input-inline">
						      	<input value="${entity.deptname }" type="text" autocomplete="off" class="layui-input" readonly="readonly">
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label">Υ������</label>
						    <div class="layui-input-inline">
						      	<select class="select_wx" disabled="disabled">
								 	<code:printCode dmjc="WJLX" defaultValue="${entity.breaktype }" dmz="1" type="1"/>
								</select>
						    </div>
					    </div>
				        <div class="layui-form-item">
						    <label class="layui-form-label">����ѧУ</label>
						    <div class="layui-input-inline">
						      	<input class="layui-input" value="${entity.stuschoolname }" type="text" readonly="readonly">
						    </div>
					    </div>
					    <div class="layui-form-item layui-form-text">
						 	<label class="layui-form-label">Υ������</label>
						    <div class="layui-input-block">
						      	<textarea class="layui-textarea" readonly="readonly">${entity.content}</textarea>
						 	</div>
						</div>	
					    <div class="layui-form-item">
						    <label class="layui-form-label">����״̬</label>
						    <div class="layui-input-inline">
						      	<input class="layui-input" value="${entity.state }" type="text" readonly="readonly">
						    </div>
					    </div>
 					</div>
				</div>
			</div>
			<!--------------------------------------------------------������Ϣ ----------------------------------------------------->
			<c:if test="${entity.state==2||entity.state==3}">
				<div class="layui-collapse"  style="margin-top: 10px;width: 98%;margin-left: 1%;">
					<div class="layui-colla-item">	
	  					<h2 class="layui-colla-title">���Ҵ�����Ϣ</h2>
	  					<div class="layui-colla-content">
	  						<c:if test="${entity.depdisposemod!=null||entity.depdisposemod!='' }">
					            <div class="layui-form-item">
								    <label class="layui-form-label">����ʽ</label>
								    <div class="layui-input-inline">
								      	<input class="layui-input" value="${entity.depdisposemod }" type="text" readonly="readonly">
								    </div>
							    </div>
							    <div class="layui-form-item">
								    <label class="layui-form-label">������</label>
								    <div class="layui-input-inline">
								      	<input class="layui-input" value="${entity.depdisposeresult }" type="text" readonly="readonly">
								    </div>
							    </div>
					            <div class="layui-form-item layui-form-text">
								 	<label class="layui-form-label">�������</label>
								    <div class="layui-input-block">
								      	<textarea class="layui-textarea" readonly="readonly">${entity.depdisposeyj}</textarea>
								 	</div>
								</div>	
					         </c:if>
					         <c:if test="${entity.depdisposemod==null||entity.depdisposemod=='' }">
					            <div class="layui-form-item">
								    <label class="layui-form-label">������</label>
								    <div class="layui-input-inline">
								      	<input class="layui-input" value="����δ����" type="text" readonly="readonly">
								    </div>
							    </div>
					         </c:if>
	 					</div>
					</div>
				</div>
			</c:if>
			<!----------------------------------------------------��ѧ�������� --------------------------------------------------->
			<c:if test="${entity.state==4||entity.state==5}">
				<div class="layui-collapse"  style="margin-top: 10px;width: 98%;margin-left: 1%;">
					<div class="layui-colla-item">	
	  					<h2 class="layui-colla-title">���Ҵ�����Ϣ</h2>
	  					<div class="layui-colla-content">
							<c:if test="${entity.depdisposemod!=null||entity.depdisposemod!='' }">
					            <div class="layui-form-item">
								    <label class="layui-form-label">����ʽ</label>
								    <div class="layui-input-inline">
								      	<input class="layui-input" value="${entity.depdisposemod }" type="text" readonly="readonly">
								    </div>
							    </div>
					            <div class="layui-form-item">
								    <label class="layui-form-label">������</label>
								    <div class="layui-input-inline">
								      	<input class="layui-input" value="${entity.depdisposeresult }" type="text" readonly="readonly">
								    </div>
							    </div>
					            <div class="layui-form-item layui-form-text">
								 	<label class="layui-form-label">�������</label>
								    <div class="layui-input-block">
								      	<textarea class="layui-textarea" readonly="readonly">${entity.depdisposeyj}</textarea>
								 	</div>
								</div>	
					         </c:if>
					         <c:if test="${entity.depdisposemod==null||entity.depdisposemod=='' }">
					         	<div class="layui-form-item">
								    <label class="layui-form-label">������</label>
								    <div class="layui-input-inline">
								      	<input class="layui-input" value="����δ����" type="text" readonly="readonly">
								    </div>
							    </div>
					         </c:if>
	 					</div>
					</div>
				</div>
				<div class="layui-collapse"  style="margin-top: 10px;width: 98%;margin-left: 1%;">
					<div class="layui-colla-item">	
	  					<h2 class="layui-colla-title">��ѧ��������Ϣ</h2>
	  					<div class="layui-colla-content">
	  						<div class="layui-form-item">
							    <label class="layui-form-label">����ʽ</label>
							    <div class="layui-input-inline">
							      	<input class="layui-input" value="${entity.jxbdisposemod }" type="text" readonly="readonly">
							    </div>
						    </div>
				            <div class="layui-form-item">
							    <label class="layui-form-label">������</label>
							    <div class="layui-input-inline">
							      	<input class="layui-input" value="${entity.jxbdisposeresult }" type="text" readonly="readonly">
							    </div>
						    </div>
				            <div class="layui-form-item layui-form-text">
							 	<label class="layui-form-label">�������</label>
							    <div class="layui-input-block">
							      	<textarea class="layui-textarea" readonly="readonly">${entity.jxbdisposeyj}</textarea>
							 	</div>
							</div>	
	 					</div>
					</div>
				</div>
			</c:if>
		</div>
    	<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;margin-bottom: -5px;">
	    	<div style="margin-top: 5px;width: 100%;text-align: center;">
		     	<button name="bindingBtn" type="button" class="layui-btn" onclick="javascript :history.back(-1);"><i class="layui-icon">&#x1005;</i>����</button>
		     	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>�ر�</button>
	     	</div>
	  	</div>
    </form>
<script src="layui/layui.all.js" charset="utf-8"></script>
<script type="text/javascript">
	function close_windos(){
		alert("�ر�");
		WeixinJSBridge.call('closeWindow');
	}

	layui.use(['form', 'layedit', 'laydate','upload'], function(){
		var form = layui.form,
		layer = layui.layer,
		layedit = layui.layedit,
		laydate = layui.laydate,
	  	form.render();
	});
	
</script>
</body>
</html>
