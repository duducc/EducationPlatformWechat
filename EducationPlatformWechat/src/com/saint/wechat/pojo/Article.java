package com.saint.wechat.pojo;

public class Article {  
  
    private String Title;  // ͼ����Ϣ����  
    private String Description; // ͼ����Ϣ����   
    private String PicUrl;  // ͼƬ���ӣ�֧��JPG��PNG��ʽ���Ϻõ�Ч��Ϊ��ͼ640*320��Сͼ80*80������ͼƬ���ӵ�������Ҫ�뿪������д�Ļ��������е�Urlһ�� 
    private String Url;  // ���ͼ����Ϣ��ת����  
    //private String ticket;// ��ά���ticket����������ȡ��ά��ͼƬ  
    public String getTitle() {  
        return Title;  
    }  
  
    public void setTitle(String title) {  
        Title = title;  
    }  
  
    public String getDescription() {  
        return null == Description ? "" : Description;  
    }  
  
    public void setDescription(String description) {  
        Description = description;  
    }  
  
    public String getPicUrl() {  
        return null == PicUrl ? "" : PicUrl;  
    }  
  
    public void setPicUrl(String picUrl) {  
        PicUrl = picUrl;  
    }  
  
    public String getUrl() {  
        return null == Url ? "" : Url;  
    }  
  
    public void setUrl(String url) {  
        Url = url;  
    }  
  
}