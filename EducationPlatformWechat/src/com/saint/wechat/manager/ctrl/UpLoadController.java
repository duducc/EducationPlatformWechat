package com.saint.wechat.manager.ctrl;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

public class UpLoadController {
	
    public void upload(HttpServletRequest request, HttpServletResponse response)  {
        //����һ��ͨ�õĶಿ�ֽ�����
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        //�ж� request �Ƿ����ļ��ϴ�,���ಿ������
        if(multipartResolver.isMultipart(request)){
            //ת���ɶಿ��request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;
            //ȡ��request�е������ļ���
            Iterator<String> iter = multiRequest.getFileNames();

            while(iter.hasNext()){
                //��¼�ϴ�������ʼʱ��ʱ�䣬���������ϴ�ʱ��
//                int pre = (int) System.currentTimeMillis();
                //ȡ���ϴ��ļ�
                MultipartFile file = multiRequest.getFile(iter.next());
                if(file != null){
                    //ȡ�õ�ǰ�ϴ��ļ����ļ�����
                    String myFileName = file.getOriginalFilename();
                    //������Ʋ�Ϊ����,˵�����ļ����ڣ�����˵�����ļ�������
                    if(myFileName.trim() !=""){
                        System.out.println(myFileName);
                        //�������ϴ�����ļ���
                        String dirPath = request.getSession().getServletContext().getRealPath("upload/voice") ;
                        String temp = "photos"+ "/"+ file.getOriginalFilename() ;
                        File dir = new File(dirPath) ;
                        if( !dir.exists() ){
                            dir.mkdirs() ;
                        }
                        
                        String fileName = dir.getAbsolutePath() + "/"+ file.getOriginalFilename();
                        //�����ϴ�·��
                        File localFile = new File(fileName);
                        if( !localFile.exists() ){
                            try {
                                localFile.createNewFile() ;
                                file.transferTo(localFile);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
						
						// �����ļ����ļ����ݱ� �����ļ�ID
                        String ID = UUID.randomUUID().toString() ; 
                        
                    }
                }
                //��¼�ϴ����ļ����ʱ��
//                int finaltime = (int) System.currentTimeMillis();
//                System.out.println(finaltime - pre);
            }
        }
       
    }
}
