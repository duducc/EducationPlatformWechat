<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" pageEncoding="GBK"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<html>
<head>
  <meta charset="gbk">
  <title>ʵϰ��Э��</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1" />
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="layui/css/layui.css"  media="all">
  <script type="text/javascript" src="jquery/jquery-1.7.2.min.js"></script>
  <script src="layui/layui.js"  charset="gbk"></script>
</head>
<body>
	<div style="width: 96%;margin-left: 2%;height: 96%;margin-top: 10px;padding: 10px;">
		<h2 style="text-align: center;">����ʡ����ҽԺ</h2>
		<h2 style="text-align: center;">ʵϰЭ����</h2>
		&nbsp;&nbsp;&nbsp;&nbsp;<p><b>�׷�: ����ʡ����ҽԺ �ٴ���ѧ��</b></p>
		&nbsp;&nbsp;&nbsp;&nbsp;<p><b>�ҷ�:${graduateschool }</b></p>
		&nbsp;&nbsp;&nbsp;&nbsp;<p><b>������ʵϰ������${stuname }</b></p>              
		&nbsp;&nbsp;&nbsp;&nbsp;Ϊ��ǿʵϰ���ٴ���ѧ����,��ȷ�������κ�����,��֤ʵϰ����������չ�����ס��ҡ�������Э�̣��ⶨ�����ڼ׷�����ʵϰ������������¡�<br>
		&nbsp;&nbsp;&nbsp;&nbsp;<p><b>һ���׷���Ȩ��������</b></p> 
		&nbsp;&nbsp;&nbsp;&nbsp;1.����Э�̵�������רҵ,ƾ�ҷ�����������Ž���ʵϰ��,�������ҷ��ṩ���ٴ�ʵϰ��ѧ��ٺ�ʵϰ�ƻ�������Ӧ���ٴ�ʵϰ��ѧ������ÿ����ʵϰ�����󰴹涨���п��ˣ�ʵϰ�������ɼ׷�����ʵϰ������ <br>
		&nbsp;&nbsp;&nbsp;&nbsp;2.���������ڱ���λ�ڸ��ڼ�İ�ȫ���Ͷ����ϴ�ʩ����ʵά������ʵϰ������Ȩ�档<br>
		&nbsp;&nbsp;&nbsp;&nbsp;3.�׷�Ϊ�����ṩ�ٴ�ʵ����������������ʩ��������������ѧ֪ʶ������ʵ�ʹ������ڼ䲻�ṩʳ�ޣ��Ա�����ʵϰ��λ���������ס�޼���ȫ���е��κι������Ρ�<br>
		&nbsp;&nbsp;&nbsp;&nbsp;4.��Э�����й����У��׷�����Ա������н�ѧ�ƻ����ڵĴ��̹�������������Ȩ���ձ���λ���йع����ƶȶԱ������и��������<br>
		&nbsp;&nbsp;&nbsp;&nbsp;5.�׷�������Υ������λ�����ƶ��й������ʵϰ������Ȩ��ֹ���ڱ�Ժ�ļ���ʵϰ������ֱ��ת�����ҷ�������<br>
		&nbsp;&nbsp;&nbsp;&nbsp;6.�����������ԭ�����ڹ����г���ҽ�Ʋ������ҽ���豸��ҩƷ������ҽ�����׵�������׷���ȨҪ������е���Ӧ���Σ��ҷ��е������⳥���Ρ�<br>
		&nbsp;&nbsp;&nbsp;&nbsp;7.�������ۺ���ԭ����;ֹͣʵϰ���������˷�������<br>
		&nbsp;&nbsp;&nbsp;&nbsp;<p><b>�����ҷ���Ȩ��������</b></p>
		&nbsp;&nbsp;&nbsp;&nbsp;1.��ǰ��׷�����ȷ��ʵϰרҵ��ʵϰ��������ʵϰ�ƻ���ʵϰ��ٺ�ʵϰѧ�������ṩ���׷�������׷��ṩѧ�����й���Ϣ���ϣ�ʵϰ�Ƽ�����ʵϰ�����ձ�����ӡ���ȣ����ҷ�Ӧȷ��ʵϰ����صı��տ���У��ʹ�á�<br>
		&nbsp;&nbsp;&nbsp;&nbsp;2.������ȷ���������μ�ʵϰ������������ʵϰ��λҪע�����о�ֹ���ϸ����ء�ʵϰ�������ƶȡ�������ҽԺ���������ӿ��Ұ��š� <br>
		&nbsp;&nbsp;&nbsp;&nbsp;3. �����������ҷ�������ҷ�Ϊ����ʵϰ�ڼ䰲ȫ�ĵ�һ���η����ҷ�Ӧָ��ר�˵���ʵϰ������ʦ��������ʵϰ�鳤���㳤����ʵϰ��λ��ʦ��ϵ���˽�ѧ��ʵϰ�����Э���׷�����ʵϰ���Ĺ���������<br>
		&nbsp;&nbsp;&nbsp;&nbsp;4.ѧ����ʵϰ�����У�����ѧ�����˵�����ԭ�����ڹ����г���ҽ�Ʋ������ҽ���豸��ҩƷ������ҽ�����׵�������ҷ�Ӧ�����ռ׷���ع����ƶȻ�׷������Ϸ����о������������ʵϰ�����˳е���Ӧ���Σ�ͬʱ�ҷ�������Э���׷�����������ˣ�ֱ��������������<br>
		&nbsp;&nbsp;&nbsp;&nbsp;<p><b>����������Ȩ��������</b></p>
    	&nbsp;&nbsp;&nbsp;&nbsp;1.������ɸ�ǰ��ѵ���ɽ����ٴ�ʵϰ����ʵϰ�ڼ�����ϸ����ء�����ʡ����ҽԺʵϰ�������ƶȡ�������ҽԺ���������ӿ��Ұ��š�<br>
		&nbsp;&nbsp;&nbsp;&nbsp;2.������ʵϰ�����У�����Υ�²������³���ҽ�Ʋ������ҽ���豸��ҩƷ������ҽ�����׵������Ӧ���ռ׷���ع����ƶȻ�׷������Ϸ����о����������е���Ӧ���Σ�ֱ��������������<br>
		&nbsp;&nbsp;&nbsp;&nbsp;3. �����ڹ�����λ�ϣ��粻���涨���в�����Υ���׷�����ƶ�������ʹ���������ܵ��˺��ģ��类��Ⱦ�����������ˡ�Ƥ��ճĤ�Ӵ�����ѪҺ����Һ��ˤ�ˡ������ȣ�������Ը����׷��Դ˲��е��κ��⳥���Ρ�<br>
		&nbsp;&nbsp;&nbsp;&nbsp;4.�����ԭ��μӷ�ʵϰ��λ��֯�Ļ����������ģ������Ը���<br>
		&nbsp;&nbsp;&nbsp;&nbsp;5.���������Ӽ׷���ʵϰ���ţ�����ʵϰ�ڼ�Υ���Ͷ����ɣ�Υ��������̡���ȫ���ɣ��Բ����ء�����ʡ����ҽԺʵϰ�������ƶȡ��ߣ��ɴ���ɵĺ���Ը���ҽԺ��Ȩ��ֹЭ�飬֪ͨ�ҷ������������ֹʵϰ��<br>
		&nbsp;&nbsp;&nbsp;&nbsp;6.ҽԺ���ڸ������ṩһ��ѧϰ��ʵ���Ļ��ᣬ��ǩ���Ͷ���ͬ���������ʵ���Ͷ���ϵ��������Ը��ҽԺʵϰ���ڴ�ʵϰ�ڼ�����������ξ���׷��޹أ���������ʧ����ͨ�¹��˺���Υ�����ҷ��ɷ��汻���������Ʋá���ɱ�����봫�������������ԭ�����������������˺��¼�������˻��еļ��������彡������ĸ���ͻ���Լ������±��������ܵ��˺��������������������Σ����־��׼�����δԼ�������Σ�����ȫ���ɱ��˳е�����ҽԺ�޹ء�<br>
		&nbsp;&nbsp;&nbsp;&nbsp;7.�����谴��ʵϰ�ƻ����ʵϰ���ݣ���ǰ��ֹʵϰ�ߣ����ҷ���������֤���������ϸ��չ涨��ʱ�����ʵϰ���ۼ���ٴ�5���ߣ��貹��ʵϰ���ɽ���ʵϰ��������ǰ��ֹʵϰ��ʵϰʱ��7�������Ϸ��ɽ���ʵϰ������<br>
		&nbsp;&nbsp;&nbsp;&nbsp;8.�ϸ������롢�����ƶȡ�Υ���ߣ������ա�����ʡ����ҽԺʵϰ�������ƶȡ����д�����ѧ���ݼ��ڼ�����������Ʋ���ȫ�Ը�����ҽԺ�޹ء�<br>
		&nbsp;&nbsp;&nbsp;&nbsp;<p><b>�ġ���Э����ǩ�ָ���֮������Ч��</b></p>
		<div style="width: 50%;float: left;">
			�׷������£�<br>
			ί�д����ˣ�����ʡ����ҽԺ �ٴ���ѧ�� <br>
			_____��_____��_____��
		</div>
		<div style="width: 50%;float: left;">
			�ҷ������£�<br>
		            ί�д����ˣ�${graduateschool }<br>
			______��_____��_____��
		</div>
		����ǩ�֣�${stuname }<br>
		ʵϰʱ�䣺�� _____��___��___�ա�_____��___��___�գ�
		
	</div>
</body>
<script type="text/javascript">
	
</script>
</html>