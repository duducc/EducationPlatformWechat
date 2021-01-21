<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" pageEncoding="GBK"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<html>
<head>
  <meta charset="gbk">
  <title>实习生协议</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1" />
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="layui/css/layui.css"  media="all">
  <script type="text/javascript" src="jquery/jquery-1.7.2.min.js"></script>
  <script src="layui/layui.js"  charset="gbk"></script>
</head>
<body>
	<div style="width: 96%;margin-left: 2%;height: 96%;margin-top: 10px;padding: 10px;">
		<h2 style="text-align: center;">甘肃省人民医院</h2>
		<h2 style="text-align: center;">实习协议书</h2>
		&nbsp;&nbsp;&nbsp;&nbsp;<p><b>甲方: 甘肃省人民医院 临床教学部</b></p>
		&nbsp;&nbsp;&nbsp;&nbsp;<p><b>乙方:${graduateschool }</b></p>
		&nbsp;&nbsp;&nbsp;&nbsp;<p><b>丙方（实习生）：${stuname }</b></p>              
		&nbsp;&nbsp;&nbsp;&nbsp;为加强实习生临床教学管理,明确各方责任和义务,保证实习工作正常开展，经甲、乙、丙三方协商，拟定丙方在甲方进行实习，相关事宜如下。<br>
		&nbsp;&nbsp;&nbsp;&nbsp;<p><b>一、甲方的权利和义务</b></p> 
		&nbsp;&nbsp;&nbsp;&nbsp;1.根据协商的人数和专业,凭乙方的书面介绍信接收实习生,并根据乙方提供的临床实习教学大纲和实习计划安排相应的临床实习教学工作。每科室实习结束后按规定进行考核，实习期满后，由甲方做出实习鉴定。 <br>
		&nbsp;&nbsp;&nbsp;&nbsp;2.保护丙方在本单位在岗期间的安全及劳动保障措施，切实维护丙方实习的正当权益。<br>
		&nbsp;&nbsp;&nbsp;&nbsp;3.甲方为丙方提供临床实践场所、技术与设施，帮助丙方将所学知识运用于实际工作，期间不提供食宿，对丙方在实习岗位工作以外的住宿及安全不承担任何管理责任。<br>
		&nbsp;&nbsp;&nbsp;&nbsp;4.本协议履行过程中，甲方负责对丙方进行教学计划以内的带教管理工作，并有权依照本单位的有关规章制度对丙方进行各项管理。<br>
		&nbsp;&nbsp;&nbsp;&nbsp;5.甲方对严重违反本单位管理制度有关条款的实习生，有权终止其在本院的继续实习，并可直接转交给乙方处理。<br>
		&nbsp;&nbsp;&nbsp;&nbsp;6.因丙方单方面原因导致在工作中出现医疗差错、损坏医疗设备或药品、引起医患纠纷等情况，甲方有权要求丙方承担相应责任，乙方承担连带赔偿责任。<br>
		&nbsp;&nbsp;&nbsp;&nbsp;7.丙方无论何种原因中途停止实习均不办理退费手续。<br>
		&nbsp;&nbsp;&nbsp;&nbsp;<p><b>二、乙方的权利和义务</b></p>
		&nbsp;&nbsp;&nbsp;&nbsp;1.提前与甲方商议确定实习专业和实习人数，将实习计划、实习大纲和实习学生名单提供给甲方。并向甲方提供学生的有关信息材料（实习推荐表、实习生保险保单复印件等），乙方应确保实习生相关的保险可在校外使用。<br>
		&nbsp;&nbsp;&nbsp;&nbsp;2.负责正确引导丙方参加实习，教育丙方在实习单位要注意言行举止，严格遵守《实习生管理制度》，服从医院管理，服从科室安排。 <br>
		&nbsp;&nbsp;&nbsp;&nbsp;3. 丙方隶属于乙方，因此乙方为丙方实习期间安全的第一责任方，乙方应指派专人担任实习管理老师。定期与实习组长（点长）、实习单位老师联系，了解学生实习情况，协调甲方做好实习生的管理工作。<br>
		&nbsp;&nbsp;&nbsp;&nbsp;4.学生在实习过程中，如因学生本人单方面原因导致在工作中出现医疗差错、损坏医疗设备或药品、引起医患纠纷等情况，乙方应负责按照甲方相关规章制度或甲方合理合法的研究处理方案责成实习生本人承担相应责任，同时乙方有责任协助甲方处理相关事宜，直到问题的最后解决。<br>
		&nbsp;&nbsp;&nbsp;&nbsp;<p><b>三、丙方的权利和义务</b></p>
    	&nbsp;&nbsp;&nbsp;&nbsp;1.丙方完成岗前培训方可进入临床实习，在实习期间必须严格遵守《甘肃省人民医院实习生管理制度》，服从医院管理，服从科室安排。<br>
		&nbsp;&nbsp;&nbsp;&nbsp;2.丙方在实习过程中，如因违章操作导致出现医疗差错、损坏医疗设备或药品、引起医患纠纷等情况，应按照甲方相关规章制度或甲方合理合法的研究处理方案承担相应责任，直到问题的最后解决。<br>
		&nbsp;&nbsp;&nbsp;&nbsp;3. 丙方在工作岗位上，如不按规定进行操作或违反甲方相关制度条例而使自身身体受到伤害的（如被感染、被锐器刺伤、皮肤粘膜接触病人血液、体液、摔伤、滑倒等），后果自负，甲方对此不承担任何赔偿责任。<br>
		&nbsp;&nbsp;&nbsp;&nbsp;4.因个人原因参加非实习单位组织的活动而发生意外的，责任自负。<br>
		&nbsp;&nbsp;&nbsp;&nbsp;5.丙方不服从甲方的实习安排，或在实习期间违反劳动纪律，违反操作规程、安全纪律，对不遵守《甘肃省人民医院实习生管理制度》者，由此造成的后果自负，医院有权终止协议，通知乙方后，责令丙方终止实习。<br>
		&nbsp;&nbsp;&nbsp;&nbsp;6.医院意在给丙方提供一个学习、实践的机会，不签订劳动合同，与丙方无实际劳动关系。丙方自愿到医院实习，在此实习期间出现下列情形均与甲方无关，包括：走失、交通事故伤害、违反国家法律法规被公安机关制裁、自杀、误入传销等其他因个人原因引发的人身意外伤害事件；因个人患有的疾病等身体健康引起的各种突发性疾病导致本人身体受到伤害，甚至意外身亡等情形；出现纠纷及其他未约定的情形，责任全部由本人承担，与医院无关。<br>
		&nbsp;&nbsp;&nbsp;&nbsp;7.丙方需按照实习计划完成实习内容，提前终止实习者，需乙方出具书面证明，否则严格按照规定的时间完成实习，累计请假达5天者，需补齐实习方可进行实习鉴定，提前终止实习者实习时间7个月以上方可进行实习鉴定。<br>
		&nbsp;&nbsp;&nbsp;&nbsp;8.严格遵守请、销假制度。违反者，将按照《甘肃省人民医院实习生管理制度》进行处理。学生休假期间个人人身、财产安全自负，与医院无关。<br>
		&nbsp;&nbsp;&nbsp;&nbsp;<p><b>四、本协议自签字盖章之日起生效。</b></p>
		<div style="width: 50%;float: left;">
			甲方（盖章）<br>
			委托代理人：甘肃省人民医院 临床教学部 <br>
			_____年_____月_____日
		</div>
		<div style="width: 50%;float: left;">
			乙方（盖章）<br>
		            委托代理人：${graduateschool }<br>
			______年_____月_____日
		</div>
		丙方签字：${stuname }<br>
		实习时间：（ _____年___月___日—_____年___月___日）
		
	</div>
</body>
<script type="text/javascript">
	
</script>
</html>
