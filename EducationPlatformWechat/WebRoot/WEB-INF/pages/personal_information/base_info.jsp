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
    <title>基础信息查看</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/layui.css" media="all">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <script src="js/jquery.1.7.2.min.js"></script>
    <style type="text/css">
    	.weui_tab{
			 position:absolute; z-index:1;
		}
    </style>
</head>
<body ontouchstart>
<form method="get" id="from1">
<input type="hidden" id="openId" name="openId" value="${openid }"/>
<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
<input type="hidden" id="shgly" name="shgly" value="${bindinfo.isAdmin }"/>
<div class="weui_tab" style="width: 100%;">
    <!-- 内容 -->
    <div class="weui_tab_bd">
        <!-- 标题 -->
        <header class='demos-header' style="background-color:#65B39D;">
            <h1 class="demos-title" style="color: #fff;">基础信息</h1>
        </header>
        <!-- 内容展现 -->
        <div class="weui_cells weui_cells_form">
            <%-- <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">医通卡号：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="yitongCard" name="yitongCard"  type="text" value="${bindinfo.yitongCard }" readonly="readonly">
                </div>
            </div> --%>
             <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">姓名：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="xm" name="xm"  type="text" value="${bindinfo.xm }" readonly="readonly">
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">电话：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="remark2" name="remark2"  type="text" value="${empEntity.usertel }" readonly="readonly">
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">所在医院：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input"  type="text" id = "yiyuan" name="yiyuan" value="${empEntity.yiyuan }" readonly="readonly"/>
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">所属部门：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="dept" name="dept"  type="text" value="${empEntity.depart }" readonly="readonly">
                    <%-- <select name="dept" id="dept" class="weui_input" disabled="disabled">
						<dep:printDep defaultValue="${bindinfo.deptId }" type="1" />
					</select> --%>
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">身份证号：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="sfzmhm" name="sfzmhm"  type="text" value="${bindinfo.sfzmhm }" readonly="readonly">
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">用户类别：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<c:if test="${bindinfo.yhlb==1 }">
                    	<input class="weui_input" id="yhlb" name="yhlb"  type="text" value="医院用户" readonly="readonly">
                	</c:if>
                	<c:if test="${bindinfo.yhlb==2 }">
                    	<input class="weui_input" id="yhlb" name="yhlb"  type="text" value="其他群众" readonly="readonly">
                	</c:if>
                </div>
            </div>
        </div>
		<!---------------------------------------------------------- 底部菜单-------------------------------------------------------->
		<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
			<div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 50%;">
		      	<button name="bindingBtn" type="button" class="layui-btn" onclick="cancelbind();" style="width: 80%;">取消绑定</button>
	    	</div>
	    	<div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 50%;">
		      	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();" style="width: 80%;">关闭</button>
	    	</div>
		</div>
		<!---------------------------------------------------底部菜单 ----------------------------------------------------- -->
		<!-- 
        <div class='demos-content-padded'>
            <a name="bindingBtn" href="javascript:;" class="weui_btn weui_btn_primary">取消绑定</a>
        	<a name="closeBtn" href="javascript:;" class="weui_btn weui_btn_primary">关闭</a>
        </div> -->
        
    </div>
</div>


</form>

<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script>
	function cancelbind(){
		if (confirm("是否确定取消绑定？")) {  
            var openId = $("#openId").val();
            var clientsxh = $("#clientsxh").val();
            var tel = $("#remark2").val();
            //ajax请求数据
            var url = "wechatBind.do?method=CancelBind";
            $.post(url,{openId:$("input[name='openId'][type='hidden']").val(),clientsxh:$("input[name='clientsxh'][type='hidden']").val(),tel:tel,isadmin:$("#shgly").val()},function (data, status) {
                if( status=="success" ){
                    var json = eval(data);
                    switch (json.errorMsg) {
                        case "success":		//成功
                            $.toast("取消绑定成功");
                            setTimeout("WeixinJSBridge.call('closeWindow')",1000);
                            break;
                        case "failed":		//失败
                            $.alert("取消失败！", "提示");
                            break;
                        case "error":		//服务器异常
                            $.alert("服务器异常，稍后再试！", "警告！");
                            break;
                    }
                }else{
                    $.alert("操作失败！", "提示");
                }
            },"json");
         }else{
         	
         }
	}
	
	function close_windos(){
		WeixinJSBridge.call('closeWindow');
	}
    /* $(document).ready(function () {
        $("a[name='closeBtn']").click(function(){});
        $("a[name='bindingBtn']").click(function(){});
    }); */
</script>
</body>
</html>
