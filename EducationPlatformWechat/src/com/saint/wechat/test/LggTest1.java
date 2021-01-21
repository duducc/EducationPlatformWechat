package com.saint.wechat.test;

import com.saint.wechat.utils.HTMLHelper;

public class LggTest1 {

	public static void main(String[] args) {
		
		String url1="http://61.178.79.18/plgaWeichat/tmptmsg.do?method=sendtmsg&xh=A01&first=通知测试&keyword1=201609000001&keyword2=2016�?�?2�?2018:00&remark=这是备注&touser=o5PVJw_pEkcAXAqy1ADbyIDuibv0&url=www.baidu.com";
		String url2="http://61.178.79.18/plgaWeichat/tmptmsg.do?method=sendtmsg&xh=A01&first=通知测试&keyword1=201609000001&keyword2=2016�?�?2�?2018:00&remark=这是备注&touser=oMDGwt-Ch-Uqqo3cq1k2diCLOKAg&url=www.baidu.com";
		String url3="http://61.178.79.18/plgaWeichat/tmptmsg.do?method=sendtmsg&xh=A01&first=通知测试&keyword1=201609000001&keyword2=2016�?�?2�?2018:00&remark=这是备注&touser=oMDGwt3EAz-09Z3c5cWg_e0qlMjE&url=www.baidu.com";
		String url4="http://61.178.79.18/plgaWeichat/tmptmsg.do?method=sendtmsg&xh=A01&first=通知测试&keyword1=201609000001&keyword2=2016�?�?2�?2018:00&remark=这是备注&touser=oMDGwt7TsePszDqIh1PUcu-TrxJA&url=www.baidu.com";
		String url5="http://61.178.79.18/plgaWeichat/tmptmsg.do?method=sendtmsg&xh=A01&first=通知测试&keyword1=201609000001&keyword2=2016�?�?2�?2018:00&remark=这是备注&touser=oMDGwtxwZ8TAkJiqQr6ZE2Nt9HpE&url=www.baidu.com";
		String url6="http://61.178.79.18/plgaWeichat/tmptmsg.do?method=sendtmsg&xh=A01&first=通知测试&keyword1=201609000001&keyword2=2016�?�?2�?2018:00&remark=这是备注&touser=oMDGwt5CIxVlUhWprj3YyD3uG2_8&url=www.baidu.com";
		try {
			HTMLHelper.getOneHtml(url1, "utf-8");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
