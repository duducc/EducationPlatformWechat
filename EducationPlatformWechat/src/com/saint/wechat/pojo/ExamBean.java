package com.saint.wechat.pojo;

import java.util.List;
/**
 * 
 * @author zad
 *???????
 */
public class ExamBean {
	private String ques;
	private String ans;
	private List<String> ansSel;
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public List<String> getAnsSel() {
		return ansSel;
	}
	public void setAnsSel(List<String> ansSel) {
		this.ansSel = ansSel;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
}
