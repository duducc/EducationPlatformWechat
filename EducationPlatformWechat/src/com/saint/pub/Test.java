package com.saint.pub;

public class Test {
public static void main(String[] args) {
	String rootText="D:\\DzDocUPFilePath\\20130510";
	System.err.println(rootText);
	rootText=rootText.replaceAll("\\\\", "/");
	System.err.println("++"+rootText);
}
}
