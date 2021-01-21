package com.saint.wechat.test;

import com.saint.pub.Constant;
import com.saint.wechat.pojo.Button;
import com.saint.wechat.pojo.CommonButton;
import com.saint.wechat.pojo.ComplexButton;
import com.saint.wechat.pojo.Menu;
import com.saint.wechat.pojo.ViewButton;
import com.saint.wechat.utils.WxAPIUtils;

public class PlgaMenu {
	
	public static void main(String[] args) {
		String appid=Constant.APPID;
		String appsecret=Constant.APPSECRET;
		String token=WxAPIUtils.getAccess_token(appid, appsecret);
		if(null!=token){
			System.out.println(token);
			int note=WxAPIUtils.createMenu(getMent(), token);
			System.out.println(note);
			if(note==0){
				System.out.println("�����˵��ɹ�!");
			}else{
				System.out.println("�����˵�ʧ��!");
			}
		}
	}

	private static Menu getMent() {
		//�����˵�����Ʋ˵�
		CommonButton firstButton=new CommonButton();
		firstButton.setKey("");//key
		firstButton.setName("��Ŀһ");
		firstButton.setType("click");//click���ڵ�����¼�.view������תURL�¼�.
		//�����˵�view�˵�
		ViewButton view1=new ViewButton();
		view1.setName("΢���ռ�");
		view1.setType("view");
		view1.setUrl("http://www.weibo.com");
		//һ���˵�
		ComplexButton  button1=new ComplexButton();
		button1.setName("����ָ��");
		button1.setSub_button(new Button[]{firstButton,view1});
		//һ���˵�
		ComplexButton  button2=new ComplexButton();
		button2.setName("ҵ����");
		button2.setSub_button(new Button[]{firstButton,view1});
		//һ���˵�
		ComplexButton  button3=new ComplexButton();
		button3.setName("�ۺϰ���");
		button3.setSub_button(new Button[]{firstButton,view1});
		return null;
	}

}
