<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>��ͼ</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
	<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
	
	<link href="sysManager/css/admin.css" rel="stylesheet" type="text/css" />
	
	<link rel="stylesheet" href="jquery/ea-ui/themes/default/easyui.css" type="text/css"></link>
	<link href="jquery/ea-ui/themes/icon.css" type="text/css" rel="stylesheet" />
	
	<link rel="stylesheet" href="css/saveORUpdateORdelBtn.css"type="text/css"></link>	
	
	<style type="text/css">
			body, html,#allmap {width: 100%;height: 100%;overflow: hidden;margin:0;font-family:"΢���ź�";}
	</style>
	
	<script type="text/javascript" src="jquery/jquery-1.7.2.min.js"> </script>
	<script type="text/javascript" src="jquery/ea-ui/easyloader.js"> </script>
	<script type="text/javascript" src="jquery/ea-ui/jquery.easyui.min.js"> </script>
	<script type="text/javascript" src="jquery/ea-ui/locale/easyui-lang-zh_CN.js"> </script>
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=fYqilD8XhjuoIOnpiRDK5zgG"></script>

	<!--���������ƹ���-->
	<script type="text/javascript" src="http://api.map.baidu.com/library/DrawingManager/1.4/src/DrawingManager_min.js"></script>
	<link rel="stylesheet" href="http://api.map.baidu.com/library/DrawingManager/1.4/src/DrawingManager_min.css" />

  </head>
  
  <body class="easyui-layout">
       <div id="allmap" style="width: 100%;height: 80%"></div>
       
       <div id="r-result">��������:<input type="text" id="suggestId" size="20" value="�ٶ�" style="width:350px;" /></div>
	   <div id="searchResultPanel" style="border:1px solid #C0C0C0;width:150px;height:auto; display:none;"></div>
       
       <div id="btn_ContByEdit"> 
          <a href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:false,iconCls:'icon-ok'" onClick="getAttr();">ȷ��</a> 
		  <a href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:false,iconCls:'icon-cancel'" onClick="javascript: window.close();">�ر�</a> 
      </div>
  </body>
</html>
 <script type="text/javascript">
	// �ٶȵ�ͼAPI����
	
	var top_left_control = new BMap.ScaleControl({anchor: BMAP_ANCHOR_TOP_LEFT});// ���Ͻǣ���ӱ�����
	var top_left_navigation = new BMap.NavigationControl();  //���Ͻǣ����Ĭ������ƽ�ƿؼ�
	
	var map = new BMap.Map("allmap");  // ����Mapʵ��
	map.addControl(new BMap.MapTypeControl());   //��ӵ�ͼ���Ϳؼ�
	map.enableScrollWheelZoom(true);     //����������
	map.addControl(top_left_control);        
	map.addControl(top_left_navigation); 
	map.centerAndZoom("����",20);      // ��ʼ����ͼ,�ó��������õ�ͼ���ĵ�
	
    var jd="${jd}";
    var wd="${wd}";
	
	
	var marker;
	
	if(jd!=null){
		 marker = new BMap.Marker(new BMap.Point(jd, wd)); // ������
			map.addOverlay(marker);    //���ӵ�
			marker.setAnimation(BMAP_ANIMATION_BOUNCE); //�����Ķ���
	}
	
	//������ȡ����ľ�γ��
	map.addEventListener("click",function(e){
		//alert(e.point.lng + "," + e.point.lat);
		map.clearOverlays();
	    marker = new BMap.Marker(new BMap.Point(e.point.lng, e.point.lat)); // ������
		map.addOverlay(marker);    //���ӵ�
		//marker.setAnimation(BMAP_ANIMATION_BOUNCE); //�����Ķ���
	});
	
	//��ø�����
    function getAttr(){
		var p = marker.getPosition();       //��ȡmarker��λ��
		//alert("marker��λ����" + p.lng + "," + p.lat);   
		 window.opener.document.getElementById('jd').value = p.lng; // ��ֵ
		 window.opener.document.getElementById('wd').value = p.lat; // ��ֵ
         window.close(); // �رմ���
	}
	
    var ac = new BMap.Autocomplete(    //����һ���Զ���ɵĶ���
    		{"input" : "suggestId"
    		,"location" : map
    	});

    	ac.addEventListener("onhighlight", function(e) {  //�����������б��ϵ��¼�
    	var str = "";
    		var _value = e.fromitem.value;
    		var value = "";
    		if (e.fromitem.index > -1) {
    			value = _value.province +  _value.city +  _value.district +  _value.street +  _value.business;
    		}    
    		str = "FromItem<br />index = " + e.fromitem.index + "<br />value = " + value;
    		
    		value = "";
    		if (e.toitem.index > -1) {
    			_value = e.toitem.value;
    			value = _value.province +  _value.city +  _value.district +  _value.street +  _value.business;
    		}    
    		str += "<br />ToItem<br />index = " + e.toitem.index + "<br />value = " + value;
    		G("searchResultPanel").innerHTML = str;
    	});

    	var myValue;
    	ac.addEventListener("onconfirm", function(e) {    //����������б����¼�
    	var _value = e.item.value;
    		myValue = _value.province +  _value.city +  _value.district +  _value.street +  _value.business;
    		G("searchResultPanel").innerHTML ="onconfirm<br />index = " + e.item.index + "<br />myValue = " + myValue;
    		
    		setPlace();
    	});

    	function setPlace(){
    		map.clearOverlays();    //�����ͼ�����и�����
    		function myFun(){
    			var pp = local.getResults().getPoi(0).point;    //��ȡ��һ�����������Ľ��
    			map.centerAndZoom(pp, 18);
    			map.addOverlay(new BMap.Marker(pp));    //��ӱ�ע
    		}
    		var local = new BMap.LocalSearch(map, { //��������
    		  onSearchComplete: myFun
    		});
    		local.search(myValue);
    	}
    	
    	function G(id) {
    		return document.getElementById(id);
    	}


 </script>