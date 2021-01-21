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
    
    <title>ѧԱ���</title>
    
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
    	<input type="hidden" id="openid" name="openid" value="${bindinfo.openId }"/>
		<input type="hidden" id="clientsxh" name="clientsxh" value="${bindinfo.clientsxh }"/>
		<input type="hidden" id="xh" name="xh" lay-verify="xh" value="${xh}"/>
		<input type="hidden" id="stuid" name="stuid" lay-verify="stuid" value="${bindinfo.yitongCard }"/>
		<input type="hidden" id="stuname" name="stuname" lay-verify="stuname" value="${bindinfo.xm }"/>
		<input type="hidden" id="emplx" name="emplx" lay-verify="emplx" value="${students.pertype}"/>
    	<!------------------------------------------------------��ͷ --------------------------------------------------------->
    	<div style="width: 100%;height: 60px;border-bottom: 1px solid #cccccc;background-color: #ffffff">
			<div style="width: 20%;height: 60px;float: left;">
				<img src="images/student_leave.png" style="width: 46px;height: 46px;margin-left: 15px;margin-top: 5px;" onclick="MillisecondToDate('-661000');">
			</div>
			<div style="width: 50%;height: 60px;float: left;">
				<div style="width: 100%;margin-top: 10px;">
					<span style="color: #1D2426;font-size: 18px;"><b>${bindinfo.xm }</b></span><br>
			  		<span style="color: #989C9C;font-size: 14px;">��ѵ���ң�${deptname==''||deptname==null?'��':deptname}</span>
				</div>
			</div>
			<div style="width: 30%;height: 60px;float: left;">
				<div style="width: 100%;margin-top: 20px;">
					<span style="color: #989C9C;font-size: 15px;float: right;margin-right: 10px;">${time }</span>
				</div>
			</div>
		</div>
		
		<div class="weui_cells weui_cells_form" style="margin-top: 0px;">
	  		<div style="width: 100%;; height: 40px;border-bottom: 1px solid #cccccc;background-color:#DCDDC0; padding: 5px;">
	   			<c:if test="${teacherid==null||teacherid=='' }">
	   				<span style="color: red;font-size: 14px;margin-left: 15px;">-û�д��̽�ʦ��Ϣ�����ڡ��ҵ���Ϣ��-����ѵ��ʦ����ά��</span><br>
	   			</c:if>
	   			<c:if test="${teacheropenid==null||teacheropenid=='' }">
		   			<span style="color: red;font-size: 14px;margin-left: 15px;">-������ʦ��δ��΢�Ź��ںţ���֪ͨ�󶨣�</span>
	   			</c:if>
	  		</div>
	   	</div>
		<div style="overflow-y:auto;height: 85%;background-color: #fff;" id="mainCount_div">
			<div class="layui-form-item" style="margin-top: 10px;">
			    <label class="layui-form-label">�������</label>
			    <div class="layui-input-inline">
			      	<select  id="type" name="type" lay-verify="type" style="width: 99%;" class="weui_input">
					 	<code:printCode dmjc="QJLX" defaultValue="${entity.type}" type="1"/>
					</select>
			    </div>
		    </div>
		    <div class="layui-form-item">
			    <label class="layui-form-label">��ʼʱ��</label>
			    <div class="layui-input-inline">
			      	<input  value="${entity.leavedatestart }" type="text" name="leavedatestart" id="leavedatestart" lay-verify="leavedatestart" placeholder="YYYY-MM-DD" autocomplete="off" class="layui-input" readonly="readonly">
			    </div>
		    </div>
		    <div class="layui-form-item">
			    <label class="layui-form-label">����ʱ��</label>
			    <div class="layui-input-inline">
			      	<input  value="${entity.leavedateend }" type="text" name="leavedateend" id="leavedateend" lay-verify="leavedateend" placeholder="YYYY-MM-DD" autocomplete="off" class="layui-input" readonly="readonly">
			    </div>
		    </div>
		    <div class="layui-form-item">
			    <label class="layui-form-label">������ʦ</label>
			    <div class="layui-input-inline">
			    	<input  value="${teacherid}" type="hidden" name="teacherid" id="teacherid" lay-verify="teacherid">
			      	<input  value="${teachername}" type="text" name="teachername" id="teachername" lay-verify="teachername" placeholder="��ѡ���ʦ" autocomplete="off" class="layui-input" style="height:38px;width: 60%;float: left;" readonly="readonly">
			      	<button style="float: left;height: 38px;width: 40%;" class="layui-btn layui-btn-sm" type="button" onclick="getteacher();"><i class="layui-icon">&#xe615;</i>��ѯ</button>
			    </div>
			</div>
		    <div class="layui-form-item layui-form-text">
			 	<label class="layui-form-label">�������</label>
			    <div class="layui-input-block">
			      <textarea placeholder="����������..." class="layui-textarea" id="cause" name="cause" lay-verify="cause" style="height: 50px;">${entity.cause }</textarea>
			 	</div>
			</div>
			
			<div class="layui-collapse" style="margin-top: 10px;margin-bottom: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">��ٵ�</h2>
  					<div class="layui-colla-content layui-show">
					    <div class="layui-upload">
						  <div class="layui-upload-list"<c:if test="${entity.state!=1 }"> id="upImgBut"</c:if>>
						    <c:if test="${not empty entity.picpatho}">
						    	<img class="layui-upload-img" id="upImg" style="height:200px;" src="${entity.picpath }">
						    </c:if>
						    <c:if test="${empty entity.picpatho}">
						    	<img class="layui-upload-img" id="upImg" style="height:200px;" src="images/boolean/wenshu.png">
						    </c:if>
						    <p id="demoText"></p>
						  </div>
						  <span style="color: blue;">����ϴ�ѧУ���µ���ٵ�</span>
						</div> 
 					</div>
				</div>
			</div>
			<div style="width: 100%;height: 50px;margin-bottom: 40px;">
				<input type="hidden" name="shxsxy" id="shxsxy" lay-verify="shxsxy" value="1"/>
				<input type="checkbox" lay-skin="switch" lay-filter="switchTest" lay-text="���Ķ�|δ�Ķ�">
				<span style="font-size: 14px;">���Ķ�</span><a onclick="openxy();" style="font-size: 14px;margin-left: 15px;color: blue;">�����ע�����</a>
			</div>
		</div>
		<input type="hidden" id="isuploding" name="isuploding" lay-verify="isuploding" value="0"/>
    	<input type="hidden" id="picpatho" name="picpatho" lay-verify="picpatho" value="${entity.picpatho}"/> <!-- ͼƬ·�� -->
    	<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;margin-bottom: -5px;">
	    	<div style="margin-top: 5px;width: 100%;text-align: center;">
		     	<button name="bindingBtn" type="button" class="layui-btn" lay-submit="submit" lay-filter="submit"><i class="layui-icon">&#x1005;</i>�����ύ</button>
		     	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>�ر�</button>
	     	</div>
	  	</div>
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
		form.render();
		laydate.render({elem: '#leavedatestart', type: 'datetime',done: function(time){
			  var enddate = $("#leavedateend").val();
		      if(enddate!=""&&enddate!=null){
			      if(time>enddate){
			    	  $.alert("��ʼʱ�䲻�ܴ��ڽ���ʱ�䣡","��ʾ");
			    	  $("#leavedatestart").datebox('setValue','');
			      }
			  }
		  }});
		  laydate.render({elem: '#leavedateend',type: 'datetime',done: function(time){
			    var startdate = $("#leavedatestart").val();
			    if(startdate!=""&&startdate!=null){
			    	if(time<startdate){
			    		$.alert("��ʼʱ�䲻�ܴ��ڽ���ʱ�䣡","��ʾ");
			    		$("#leavedateend").datebox('setValue','');
			    	}
			    }
		  }});
		  var editIndex = layedit.build('LAY_demo_editor');
		  form.on('switch(switchTest)', function(data){
				if(this.checked==true){
					$("#shxsxy").val(2);
				}else{
					$("#shxsxy").val(1);
				}
		  });
		  //�Զ�����֤����
		  form.verify({
			  type: function(value){if(value==""||value==null){return '��ѡ��������ͣ�'}},
			  leavedatestart: function(value){if(value==""||value==null){return '��ѡ��ʼʱ�䣡'}},
			  leavedateend: function(value){if(value==""||value==null){return '��ѡ�����ʱ�䣡'}},
			  cause: function(value){if(value==""||value==null){return '����д������ɣ�'}},
			  shxsxy: function(value){if(value==1){return '����û���Ķ�ע�����'}},
			  picpatho: function(value){if(value==""||value==null){return '���ϴ���ٵ���'}},
			  teacherid: function(value){if(value==""||value==null){return '��ѡ�������ʦ��'}},
		  });
		  
		form.on('submit(submit)', function(data){
			  var teacherid = $("#teacherid").val();
			  var teacheropenid = $("#teacheropenid").val();
			  /* if(teacherid==""||teacherid==null){
				  layer.alert("����û��ά��������ʦ������ά����");
				  return false;
			  } */
			  /* if(teacheropenid==""||teacheropenid==null){
				  layer.alert("���Ĵ�����ʦ��δ��΢�Ź��ںţ���֪ͨ��󶨡�");
			  } */
			  document.getElementById('up_div').style.display ='block';
		      var taskinfo = JSON.stringify(data.field);
			  var url = "jxstuleave.do?method=insertJxStudentsLeave";
			  $.post(url,{taskinfo:encodeURI(taskinfo),teacherid:teacherid,teacheropenid:teacheropenid},function (data, status) {
                  if( status=="success" ){
                      var json = eval(data);
                      switch (json.errorMsg) {
	                      case "openidept":		//�ɹ�
	                          layer.alert("������ʦδ�󶨣���֪ͨ�󶨹��ںţ�",{icon:'1'});
	                          document.getElementById('up_div').style.display ='none';
	                          break;
                          case "success":		//�ɹ�
	                          document.getElementById('up_div').style.display ='none';
	                          layer.msg("�ύ�ɹ���",{icon:'1'},function(){
		                          setTimeout(tomineleave(),1000);
	                          });
	                          break;
                          case "failed":		//ʧ��
                        	  layer.msg("�ύʧ�ܣ�",{icon:'5'},function(){
		                          document.getElementById('up_div').style.display ='none';
	                          });
                              break;
                          case "error":		//�������쳣
                              layer.alert("�������쳣�����Ժ����ԣ�");
                              document.getElementById('up_div').style.display ='none';
                              break;
                      }
                  }else{
                	  layer.alert("����ʧ�ܣ�");
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
			       $("#picpatho").val(res.realPath);  //��ͼƬ·���������ŵ���������
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
    	function tomineleave(){
		var xh = $("#xh").val();
		window.location.href="jxstuleave.do?method=toMineLeavePage&xh="+xh;
	}
	
	/* -------------------------------------------------------��Э��ҳ��------------------------------------------------------- */
	function openxy(){
		layer.open({
	        type: 2,
	        title: '���ע������',
	        area: ['90%', '90%'],
	        shade: 0,
	        maxmin: false,
	        offset: '10px',
	        skin: 'demo-class',
	        content: "jxstuleave.do?method=openAgreement",
	        zIndex: layer.zIndex, //�ص�1
	        success: function(layero){
	          layer.setTop(layero); //�ص�2
	        }
	    });
	}
	
	/* =======================================��ȡ��Ա��Ϣ========================================= */
	var layer_query_index ; 
	function getteacher(){
		layer_query_index = layer.open({
			type: 2,
			skin: 'demo-class',
			area: [(width-50)+'px', (height-100)+'px'],
			title: "��ʦ��Ϣ",
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
		$("#teachername").val(data.username);
	}
	
</script>
</body>
</html>
