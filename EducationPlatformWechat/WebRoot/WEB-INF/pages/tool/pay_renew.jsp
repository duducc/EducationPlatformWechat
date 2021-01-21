<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>确认交易</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <script src="js/jquery.1.7.2.min.js"></script>
    <script src="js/jweixin-1.0.0.js"></script>
</head>
<body ontouchstart>
<form method="get" id="from1">
<input type="hidden" id="openId" name="openId" value="${openId }"/>
<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
<input type="hidden" id="yhreceipekh" name="yhreceipekh" value=""/>
<input type="hidden" id="yhrecripexm" name="yhrecripexm" value=""/>
<div class="weui_tab">
    <!-- 内容 -->
    <div class="weui_tab_bd">
        <!-- 标题 -->
        <div style="padding: 15px 0;">
        	<div style="font-size: 20px;text-align: center;">缴费管理</div>
            <div style="font-size: 50px;text-align: center;"><b>${monery}</b></div>
        </div>

        <!-- 内容展现 -->
        <div class="weui_cells weui_cells_form">
        <input type="hidden" id="type" name="type" value="${type}"/>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label" style="color: #bebebe;">收款方</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <span>兰州盛腾科技有限公司</span>
                </div>
            </div>
            <div class="weui_cell" style="border-bottom: 1px solid #bebebe;">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label" style="color: #bebebe;">支付方式</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <select style="border:0px solid black;font-size: inherit;width: 100%" name="payfs" id="payfs" onchange="paychange(this);">
                		<option value="1" style="float: right;">微信扫码支付</option>
                		<!-- <option value="2" style="float: right;">银行卡转账</option> -->
                		<option value="3" style="float: right;">人工收费</option>
                	</select>
                </div>
            </div>
            <div class="weui_cell" style="border-bottom: 1px solid #bebebe;text-align:center;" id="wxpay">
            	<c:if test="${type==0}">
	            	<img src="images/service/pay_150.jpg" style="margin-left: 10%;margin-right: 0px;width: 80%;">
            	</c:if>
            	<c:if test="${type==11}">
	            	<img src="images/service/pay_30.jpg" style="margin-left: 10%;margin-right: 0px;width: 80%;">
            	</c:if>
            	<c:if test="${type==12}">
	            	<img src="images/service/pay_150.jpg" style="margin-left: 10%;margin-right: 0px;width: 80%;">
            	</c:if>
            	<c:if test="${type==2}">
	            	<img src="images/service/pay_120.jpg" style="margin-left: 10%;margin-right: 0px;width: 80%;">
            	</c:if>
            </div>
            <!-- <div style="display:none; border: 1px solid #bebebe; margin-top: 15px;width: 90%;margin-left: 5%;border-radius: 20px;" id="yhkzz">
	            <div class="weui_cell" id="yhkzz">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label" style="color: #bebebe;">银行名称：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <span style="float: right;">中国邮政储蓄银行</span>
	                </div>
	            </div>
	            <div class="weui_cell" id="yhkzz">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label" style="color: #bebebe;">转账卡号：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <span style="float: right;">6217 9983 8800 0117 181</span>
	                </div>
	            </div>
	            <div class="weui_cell" id="yhkzz">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label" style="color: #bebebe;">收款人姓名：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <span style="float: right;">袁文清</span>
	                </div>
	            </div>
            </div> -->
            <div  style="display:none; border: 1px solid #bebebe; margin-top: 15px;width: 90%;margin-left: 5%;border-radius: 20px;" id="rgsf">
	            <div class="weui_cell" id="yhkzz">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label" style="color: #bebebe;">收费人姓名：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <input class="weui_input" id="payname" name="payname"  type="text" placeholder="请填写真实姓名">
	                </div>
	            </div>
	            <div class="weui_cell" id="yhkzz">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label" style="color: #bebebe;">收费人电话：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <input class="weui_input" id="paytel" name="paytel"  type="text" placeholder="请填写手机号码">
	                </div>
	            </div>
	            <div class="weui_cell" id="yhkzz">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label" style="color: #bebebe;">备注：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <input class="weui_input" id="beizhu" name="beizhu"  type="text" placeholder="">
	                </div>
	            </div>
            </div>
        </div>
		
		
        <div class='demos-content-padded' id="urlwxzf" style="text-align:center;">
            <span style="font-size: 150%;">请扫描二维码进行付款</span>
        </div>
        <div class='demos-content-padded' id="urlyhzf" style="display:none;">
            <a name="closeBtn" href="javascript:;" class="weui_btn weui_btn_primary">返回</a>
        </div>
        <div class='demos-content-padded' id="urlgrzf" style="display:none;">
            <a name="payrgBtn" href="javascript:;" class="weui_btn weui_btn_primary">确认</a>
        </div>
        <div class='demos-content-padded' id="close">
            <a name="closeBtn" href="javascript:;" class="weui_btn weui_btn_primary">关闭</a>
        </div>
    </div>
</div>


</form>

<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script>
	/* wx.config({
    	debug: true, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
    	appId: '', // 必填，公众号的唯一标识
    	timestamp: '' , // 必填，生成签名的时间戳
    	nonceStr: '', // 必填，生成签名的随机串
    	signature: '',// 必填，签名，见附录1
    	jsApiList: [] // 必填，需要使用的JS接口列表，所有JS接口列表见附录2
	});
	wx.ready(function(){

    	// config信息验证后会执行ready方法，所有接口调用都必须在config接口获得结果之后，config是一个客户端的异步操作，所以如果需要在页面加载时就调用相关接口，则须把相关接口放在ready函数中调用来确保正确执行。对于用户触发时才调用的接口，则可以直接调用，不需要放在ready函数中。
	}); */
    $(document).ready(function () {
        /**
         * 点击绑定按钮
         */
         $("a[name='closeBtn']").click(function () {
         	WeixinJSBridge.call('closeWindow');
         });
        $("a[name='payrgBtn']").click(function () {
        	var openId = $("#openId").val();
            var clientsxh = $("#clientsxh").val();
            var payfs = $("#payfs").val();
        	var paymoney = "120";
        	/* var yhreceipekh = "";
        	var yhrecripexm = "";
        	if(payfs==2){
        		yhreceipekh = $("#yhreceipekh").val();
        		yhrecripexm = $("#yhrecripexm").val();
        		alert("银行卡转账");
        	} */
        	var rgreceipexm = "";
        	var rgreceipetel = "";
        	var rgbz = "";
        	if(payfs==3){
        		rgreceipexm = $("#payname").val();
        		rgreceipetel = $("#paytel").val();
        		rgbz = $("#beizhu").val();
        		if(rgreceipexm==""||rgreceipetel==""){
        			alert("姓名或电话不能为空！");
        			return false;
        		}
        	}
            //ajax请求数据
            var url = "paymentManage.do?method=savePayHistory&rgreceipexm="+rgreceipexm+"&rgbz="+rgbz;
           	$.post(url,{openId:openId,clientsxh:clientsxh,
            payfs:payfs,paymoney:paymoney,rgreceipetel:rgreceipetel,
            },function (data, status) {
                if( status=="success" ){
                    var json = eval(data);
                    switch (json.errorMsg) {
                        case "success":		//成功
                            $.toast("保存成功！");
                            //setTimeout("applyInfo.do?method=SaveNewcodeInfo&username="+username+"&yiyuantext="+yiyuantext+"&depttext="+depttext+"&zhichengtext="+zhichengtext,1000);
                            setTimeout("WeixinJSBridge.call('closeWindow')",2000);
                            break;
                        case "failed":		//失败
                            $.alert("保存失败！", "提示");
                            break;
                        case "error":		//服务器异常
                            $.alert("服务器异常，稍后再试！", "警告！");
                            break;
                    }
                }else{
                    $.alert("操作失败！", "提示");
                }
            },"json");
        });
    });
    
    function paychange(value){
    	var payfs = $("#payfs").val();
		if(payfs==2){
			$("#close").hide();
			$("#wxpay").hide();
			$("#yhkzz").show();
			$("#urlyhzf").show();
			$("#urlwxzf").hide();
			$("#urlgrzf").hide();
			$("#rgsf").hide();
		}
		if(payfs==3){
			$("#close").hide();
			$("#wxpay").hide();
			$("#yhkzz").hide();
			$("#rgsf").show();
			$("#urlgrzf").show();
			$("#urlwxzf").hide();
			$("#urlyhzf").hide();
		}
		if(payfs==1){
			$("#close").show();
			$("#wxpay").show();
			$("#yhkzz").hide();
			$("#rgsf").hide();
			$("#urlgrzf").hide();
			$("#urlyhzf").hide();
			$("#urlwxzf").show();
		}
    }
</script>
</body>
</html>
