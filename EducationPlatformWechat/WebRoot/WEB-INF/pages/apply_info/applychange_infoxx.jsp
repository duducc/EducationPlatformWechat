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
    <title></title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery.1.7.2.min.js"></script>
    <style type="text/css">
    	.imfg{
    		width: 15%;
    	}
    	.imfgs{
    		width: 10%;
    	}
    </style>
</head>
<body ontouchstart>
<form method="get" id="from1">
<input type="hidden" id="openId" name="openId" value="${openId }"/>
<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
<input type="hidden" id="id" name="id" value="${id }"/>
<input type="hidden" id="yiyuan" name="yiyuan" value="${yiyuan }"/>
<input type="hidden" id="yitongcode" name="yitongcode" value="${entity.yitongcode }"/>
<div class="weui_tab">
    <!-- 内容 -->
    <div class="weui_tab_bd">
        <!-- 内容展现 -->
        <!-- 标题 -->
        <header class='demos-header'>
            <h1 class="demos-title">申请信息变更</h1>
        </header>
		<span style="margin-left: 15px;color: #3cc51f;font-size: 18px;">${employeeEntity.username}:${yiyuanname }</span><br>
		<span style="margin-left: 15px;color: #3cc51f;font-size: 18px;">医通号：${entity.yitongcode }</span>
        <div class="weui_cells weui_cells_form">
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">姓名：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<c:if test="${employeeEntity.username==entity.userxm }">
                    	<input class="weui_input" id="qName" name="qName"  type="text" value="${employeeEntity.username }" readonly="readonly">
                    </c:if>
                	<input class="weui_input" id="hName" name="hName"  type="hidden" value="${entity.userxm }" readonly="readonly">
                	<c:if test="${employeeEntity.username!=entity.userxm }">
	                	<span>${employeeEntity.username}</span><img class="imfg" src="images/service/change-1.png" style="margin-left: 10px;margin-right: 10px;"><span>${entity.userxm }</span>
                	</c:if>
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">性别：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<c:if test="${employeeEntity.sex==entity.usersex }">
                		<c:if test="${employeeEntity.sex==1 }">
                    		<input class="weui_input" id="qSex" name="qSex"  type="text" value="男" readonly="readonly">
                    	</c:if>
                    	<c:if test="${employeeEntity.sex==0 }">
                    		<input class="weui_input" id="qSex" name="qSex"  type="text" value="女" readonly="readonly">
                    	</c:if>
                    </c:if>
                	<input class="weui_input" id="hSex" name="hSex"  type="hidden" value="${entity.usersex }" readonly="readonly">
                	<c:if test="${employeeEntity.sex!=entity.usersex }">
                		<c:if test="${employeeEntity.sex==0 }">
	                		<span>男</span><img class="imfg"  src="images/service/change-1.png" style="margin-left: 10px;margin-right: 10px;"><span>女</span>
                		</c:if>
                		<c:if test="${employeeEntity.sex==1 }">
	                		<span>女</span><img class="imfg"  src="images/service/change-1.png" style="margin-left: 10px;margin-right: 10px;"><span>男</span>
                		</c:if>
                	</c:if>
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">身份证号：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <c:if test="${employeeEntity.idcard==entity.sfzhm }">
                    	<input class="weui_input" id="qsfzhm" name="qsfzhm"  type="text" value="${employeeEntity.idcard }" readonly="readonly">
                    </c:if>
                	<input class="weui_input" id="hsfzhm" name="hsfzhm"  type="hidden" value="${entity.sfzhm }" readonly="readonly">
                	<c:if test="${employeeEntity.idcard!=entity.sfzhm }">
	                	<span>${employeeEntity.idcard}</span><img class="imfg"  src="images/service/change-3.png" style="margin-left: 10px;margin-right: 10px;margin-top: 20px;"><span>${entity.sfzhm }</span>
                	</c:if>
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">电话：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <c:if test="${employeeEntity.usertel==entity.zkrlxfs }">
                    	<input class="weui_input" id="qusertel" name="qusertel"  type="text" value="${employeeEntity.usertel }" readonly="readonly">
                    </c:if>
                	<input class="weui_input" id="husertel" name="husertel"  type="hidden" value="${entity.zkrlxfs }" readonly="readonly">
                	<c:if test="${employeeEntity.usertel!=entity.zkrlxfs }">
	                	<span>${employeeEntity.usertel}</span><img class="imfg"  src="images/service/change-3.png" style="margin-left: 10px;margin-right: 10px;margin-top: 20px;"><span>${entity.zkrlxfs }</span>
                	</c:if>
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">科室：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<c:if test="${employeeEntity.depart==entity.dept }">
                    	<input class="weui_input" id="qdeptmc" name="qdeptmc"  type="text" value="${deptname }" readonly="readonly">
                    </c:if>
                	<input class="weui_input" id="hdept" name="hdept"  type="hidden" value="${entity.dept }" readonly="readonly">
                	<c:if test="${employeeEntity.depart!=entity.dept }">
                		<span>${deptname }</span><img class="imfg"  src="images/service/change-1.png" style="margin-left: 10px;margin-right: 10px;"><span>${changedeptname}</span>
                	</c:if>
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">职称：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<c:if test="${employeeEntity.zhicheng==entity.zhicheng }">
                    	<select class="form-control"  id="qzhichengmc" name="qzhichengmc" class="select_wx" disabled="disabled">
						 	<code:printCode dmjc="ZC" defaultValue="${entity.zhicheng }" type="1"/>
						</select>
                    </c:if>
                	<input class="weui_input" id="hzhicheng" name="hzhicheng"  type="hidden" value="${entity.zhicheng }" readonly="readonly">
                	<c:if test="${employeeEntity.zhicheng!=entity.zhicheng }">
                		<span>
	                		<select class="form-control"  id="qzhichengmc" name="qzhichengmc" class="select_wx" disabled="disabled">
							 	<code:printCode dmjc="ZC" defaultValue="${employeeEntity.zhicheng}" type="1"/>
							</select>
                		</span>
                		<img  class="imfgs" src="images/service/change-2.png" style="margin-left: 10px;margin-right: 10px;">
                		<span>
                			<select class="form-control"  id="qzhichengmc" name="qzhichengmc" class="select_wx" disabled="disabled">
							 	<code:printCode dmjc="ZC" defaultValue="${entity.zhicheng}" type="1"/>
							</select>
                		</span>
                	</c:if>
                </div>
            </div> 
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">职称级别：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<c:if test="${employeeEntity.zhichenglv==entity.yhlb }">
                    	<select class="form-control"  id="qzhichenglv" name="qzhichenglv" class="select_wx" disabled="disabled">
						 	<code:printCode dmjc="ZCJB" defaultValue="${entity.yhlb }" type="1"/>
						</select>
                    </c:if>
                	<input class="weui_input" id="hzhichenglv" name="hzhichenglv"  type="hidden" value="${entity.yhlb }" readonly="readonly">
                	<c:if test="${employeeEntity.zhichenglv!=entity.yhlb }">
                		<span>
	                		<select class="form-control"  id="qzhichengmc" name="qzhichengmc" class="select_wx" disabled="disabled">
							 	<code:printCode dmjc="ZCJB" defaultValue="${employeeEntity.zhichenglv}" type="1"/>
							</select>
                		</span>
                		<img  class="imfgs" src="images/service/change-2.png" style="margin-left: 10px;margin-right: 10px;">
                		<span>
                			<select class="form-control"  id="qzhichengmc" name="qzhichengmc" class="select_wx" disabled="disabled">
							 	<code:printCode dmjc="ZCJB" defaultValue="${entity.yhlb}" type="1"/>
							</select>
                		</span>
                	</c:if>
                </div>
            </div> 
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">专业：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<c:if test="${employeeEntity.zhuanye==entity.remark1 }">
                    	<select class="form-control" class="select_wx" disabled="disabled">
						 	<code:printCode dmjc="ZY" defaultValue="${entity.remark1 }" type="1"/>
						</select>
                    </c:if>
                	<input class="weui_input" id="hzhuanye" name="hzhuanye"  type="hidden" value="${entity.remark1 }" readonly="readonly">
                	<c:if test="${employeeEntity.zhuanye!=entity.remark1 }">
                		<span>
	                		<select class="form-control" class="select_wx" disabled="disabled">
							 	<code:printCode dmjc="ZY" defaultValue="${employeeEntity.zhuanye}" type="1"/>
							</select>
                		</span>
                		<img  class="imfgs" src="images/service/change-2.png" style="margin-left: 10px;margin-right: 10px;">
                		<span>
                			<select class="form-control" class="select_wx" disabled="disabled">
							 	<code:printCode dmjc="ZY" defaultValue="${entity.remark1}" type="1"/>
							</select>
                		</span>
                	</c:if>
                </div>
            </div> 
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">学历：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<c:if test="${employeeEntity.xueli==entity.remark2 }">
                    	<select class="form-control" class="select_wx" disabled="disabled">
						 	<code:printCode dmjc="XL" defaultValue="${entity.remark2 }" type="1"/>
						</select>
                    </c:if>
                	<input class="weui_input" id="hxueli" name="hxueli"  type="hidden" value="${entity.remark2 }" readonly="readonly">
                	<c:if test="${employeeEntity.xueli!=entity.remark2 }">
                		<span>
	                		<select class="form-control" class="select_wx" disabled="disabled">
							 	<code:printCode dmjc="XL" defaultValue="${employeeEntity.xueli}" type="1"/>
							</select>
                		</span>
                		<img  class="imfgs" src="images/service/change-2.png" style="margin-left: 10px;margin-right: 10px;">
                		<span>
                			<select class="form-control" class="select_wx" disabled="disabled">
							 	<code:printCode dmjc="XL" defaultValue="${entity.remark2}" type="1"/>
							</select>
                		</span>
                	</c:if>
                </div>
            </div> 
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">民族：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<c:if test="${employeeEntity.minzu==entity.remark3 }">
                    	<select class="form-control" class="select_wx" disabled="disabled">
						 	<code:printCode dmjc="MZ" defaultValue="${entity.remark3 }" type="1"/>
						</select>
                    </c:if>
                	<input class="weui_input" id="hminzu" name="hminzu"  type="hidden" value="${entity.remark3 }" readonly="readonly">
                	<c:if test="${employeeEntity.minzu!=entity.remark3 }">
                		<span>
	                		<select class="form-control" class="select_wx" disabled="disabled">
							 	<code:printCode dmjc="MZ" defaultValue="${employeeEntity.minzu}" type="1"/>
							</select>
                		</span>
                		<img  class="imfgs" src="images/service/change-2.png" style="margin-left: 10px;margin-right: 10px;">
                		<span>
                			<select class="form-control" class="select_wx" disabled="disabled">
							 	<code:printCode dmjc="MZ" defaultValue="${entity.remark3}" type="1"/>
							</select>
                		</span>
                	</c:if>
                </div>
            </div> 
        </div>
		<div align="center" style="clear:both;padding-top:10px;">
		     <button type="button" style="width:40%;" class="btn btn-primary disabled" onclick="savewxjb()" >通过申请</button>
		     <button type="button" style="width:40%;" class="btn btn-primary disabled" onclick="cancelwxjb()" >返回</button>
	   </div>
    </div>
</div>


</form>

<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script>
	function cancelwxjb(){
		var clientsxh = $("#clientsxh").val();
		var openId = $("#openId").val();
		var yiyuan = $("#yiyuan").val();
		var type = $("#type").val();
		window.location.href="applyInfo.do?method=toInfo_ApplyInfoChange&clientsxh="+clientsxh+"&openid="+openId+"&yiyuan="+yiyuan;										
 	}
 	
 	function savewxjb(){
 		  var clientsxh = $("#clientsxh").val();
		  var openId = $("#openId").val();
		  var id = $("#id").val();
          var yitongcode = $("#yitongcode").val();
          var Name = $("#hName").val();
          var Sex = $("#hSex").val();
          var sfzhm = $("#hsfzhm").val();
          var dept = $("#hdept").val();
          var zhicheng = $("#hzhicheng").val();
          var usertel = $("#husertel").val();
          var changeInfos = {};
          changeInfos['usernumber'] = yitongcode;
          changeInfos['username'] = Name;
          changeInfos['sex'] = Sex;
          changeInfos['idcard'] = sfzhm;
          changeInfos['depart'] = dept;
          changeInfos['zhicheng'] = zhicheng;
          changeInfos['usertel'] = usertel;
          
          changeInfos['zhichenglv']= $("#hzhichenglv").val();
          changeInfos['zhuanye']= $("#hzhuanye").val();
          changeInfos['xueli']= $("#hxueli").val();
          changeInfos['minzu']= $("#hminzu").val();
          
          var changeInfo = JSON.stringify(changeInfos);
          //ajax请求数据
          var url = "applyInfo.do?method=updateApplyInfo";
          $.post(url,{changeInfo:encodeURI(changeInfo),openId:openId,clientsxh:clientsxh,id:id},function (data, status) {
              if( status=="success" ){
                  var json = eval(data);
                  switch (json.errorMsg) {
                      case "success":		//成功
                          $.toast("审核成功！");
                          //document.getElementById("from1").submit();
                          setTimeout(window.location.href="applyInfo.do?method=toInfo_ApplyInfoChange&clientsxh="+clientsxh+"&openid="+openId+"&yiyuan="+yiyuan,2000);
                          //WeixinJSBridge.call('closeWindow');
                          break;
                      case "faild":		//失败
                          $.alert("审核失败！", "提示");
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
