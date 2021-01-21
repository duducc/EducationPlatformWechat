package com.saint.pub.plugin;

import java.util.List;


public class Page {
	private int rows;//PageNumber.BASESIZE;//每页显示记录数
	private int totalPage;		//总页数
	private int totalResult;	//总记录数
	private int currentPage;	//当前页
	private int currentResult;	//当前记录起始索引
	private boolean entityOrField;	//true:需要分页的地方，传入的参数就是Page实体；false:需要分页的地方，传入的参数所代表的实体拥有Page属性
	private List pageData;
	private int before;
	private int next;
	private int first;
	private int last;
	
	public int getFirst() {
		return 1;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getLast() {
		return getTotalPage();
	}
	public void setLast(int last) {
		this.last = last;
	}
	
	
	public Page(){}
	public Page(int rows)
	{
		this.rows=rows;
	}
	public Page(int rows,int page){
		this.rows=rows;
		this.currentPage=page;
	}
	public int getTotalPage() {
		if(rows!=0){
			if(totalResult%rows==0)
				totalPage = totalResult/rows;
			else
				totalPage = totalResult/rows+1;
		}
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalResult() {
		return totalResult;
	}
	public void setTotalResult(int totalResult) {
		this.totalResult = totalResult;
	}
	public int getCurrentPage() {
		if(currentPage<=0)
			currentPage = 1;
		if(currentPage>getTotalPage())
			currentPage = getTotalPage();
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getCurrentResult() {
		currentResult = (getCurrentPage()-1)*getRows();
		if(currentResult<0)
			currentResult = 0;
		return currentResult;
	}
	public void setCurrentResult(int currentResult) {
		this.currentResult = currentResult;
	}
	public boolean isEntityOrField() {
		return entityOrField;
	}
	public void setEntityOrField(boolean entityOrField) {
		this.entityOrField = entityOrField;
	}
	public List getPageData() {
		return pageData;
	}
	public void setPageData(List pageData) {
		this.pageData = pageData;
	}
	public int getBefore() {
		int num=0;
		if(this.getCurrentPage()==1){
			return num=1;
		}
		if(this.currentPage>1){
			return num=this.getCurrentPage()-1;
		}
		if(this.getCurrentPage()<1){
			return num=1;
		}
		return num;
	}
	public void setBefore(int before) {
		this.before = before;
	}
	public int getNext() {
		int num=0;
		if(this.getCurrentPage()==this.getTotalPage()){
			return num=this.getTotalPage();
		}
		if(this.getCurrentPage()<this.getTotalPage()){
			return num=this.getCurrentPage()+1;
		}
		if(this.getCurrentPage()>this.getTotalPage()){
			return	num=this.getTotalPage();
		} 
		return num;
	}
	public void setNext(int next) {
		this.next = next;
	}
	
	
}
