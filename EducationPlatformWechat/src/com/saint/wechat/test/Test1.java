package com.saint.wechat.test;

public class Test1 {
	public static void main(String[] args) {
		String[] a={"1","2","3"};
		int i=0;
		for(String b : a){
			i++;
			if(i<=5){
				System.out.println(b);
			}
		}
	}
}
