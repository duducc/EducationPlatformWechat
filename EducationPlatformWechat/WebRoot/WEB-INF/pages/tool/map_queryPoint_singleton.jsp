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
    <meta http-equiv="X-UA-Compatible"content="IE=9; IE=8; IE=7; IE=EDGE">
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

	<script type="text/javascript">
		
	</script>
  </head>
  
  <body>
   
  <input type="hidden" id="winInfo" value='${winInfo }'>
       <div id="allmap" style="width: 100%;height: 90%"></div>
       <div id="btn_ContByEdit"> 
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
	
	var jd="${jd}";
	var wd="${wd}";
	var thisPoint="${thisBean}";
	map.centerAndZoom(new BMap.Point(jd,wd), 7);
	
	
	
	
	var myIcon = new BMap.Icon("http://api.map.baidu.com/img/markers.png", new BMap.Size(23, 25), {  
        offset: new BMap.Size(10, 25), // ָ����λλ��  
        imageOffset: new BMap.Size(0, 0 - 10 * 25) // ����ͼƬƫ��  
    });  
	
	
	var marker = new BMap.Marker(new BMap.Point(jd,wd),{icon:myIcon});  // ������ע
	map.addOverlay(marker); 

	var thisinfoWindow = new BMap.InfoWindow(thisPoint, opts);  // ������Ϣ���ڶ���
	marker.addEventListener("click", function(){          
		map.openInfoWindow(thisinfoWindow,new BMap.Point(jd,wd)); //������Ϣ����
	});
	var opts_2 = {
			  position : new BMap.Point(jd,wd),    // ָ���ı���ע���ڵĵ���λ��
			  offset   : new BMap.Size(30, -30)    //�����ı�ƫ����
			}
	var thisBeanTitle="${thisBeanTitle}";
			var label = new BMap.Label(thisBeanTitle, opts_2);  // �����ı���ע����
			label.setStyle({
				 color : "red",
				 fontSize : "12px",
				 height : "20px",
				 lineHeight : "20px",
				 fontFamily:"΢���ź�"
			 });
			map.addOverlay(label);   
	
//
	var opts = {
			width : 250,     // ��Ϣ���ڿ��
			height: 120,     // ��Ϣ���ڸ߶�
			title : "��������վ����Ϣ" , // ��Ϣ���ڱ���
			enableMessage:true//����������Ϣ�����Ͷ�Ϣ
		   };
var data_info=$("#winInfo").val();
data_info=eval(data_info);

for(var i=0;i<data_info.length;i++){
	
	var marker = new BMap.Marker(new BMap.Point(data_info[i][0],data_info[i][1]));  // ������ע
	var content = data_info[i][2];
	map.addOverlay(marker);               // ����ע��ӵ���ͼ��
	marker.addEventListener("click",openInfo.bind(null,content));
	//
	var opts_1 = {
	  position : new BMap.Point(data_info[i][0],data_info[i][1]),    // ָ���ı���ע���ڵĵ���λ��
	  offset   : new BMap.Size(30, -30)    //�����ı�ƫ����
	}
	var label = new BMap.Label(data_info[i][3], opts_1);  // �����ı���ע����
	label.setStyle({
		 color : "black",
		 fontSize : "12px",
		 height : "20px",
		 lineHeight : "20px",
		 fontFamily:"΢���ź�"
	 });
	map.addOverlay(label);   
}
function openInfo(content,e){
	var p = e.target;
	var point = new BMap.Point(p.getPosition().lng, p.getPosition().lat);
	var infoWindow = new BMap.InfoWindow(content,opts);  // ������Ϣ���ڶ��� 
	map.openInfoWindow(infoWindow,point); //������Ϣ����
}
	
	

 </script>