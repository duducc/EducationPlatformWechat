package com.saint.pub.util;
/**
 * 数组工具
 * @author gongsensheng
 *
 */
public class StrArrayTool {
	/**
	 * 数组排序
	 * @param arrStr
	 */
	 public  void sortStringArray(String[] arrStr) {
		  String temp;
		  for (int i = 0; i < arrStr.length; i++) {
		   for (int j = arrStr.length - 1; j > i; j--) {
		    if (arrStr[i].length() > arrStr[j].length()) {
		     temp = arrStr[i];
		     arrStr[i] = arrStr[j];
		     arrStr[j] = temp;
		    }
		   }
		  }
		 }
}
