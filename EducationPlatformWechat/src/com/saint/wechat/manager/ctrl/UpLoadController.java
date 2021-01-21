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
        //创建一个通用的多部分解析器
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        //判断 request 是否有文件上传,即多部分请求
        if(multipartResolver.isMultipart(request)){
            //转换成多部分request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;
            //取得request中的所有文件名
            Iterator<String> iter = multiRequest.getFileNames();

            while(iter.hasNext()){
                //记录上传过程起始时的时间，用来计算上传时间
//                int pre = (int) System.currentTimeMillis();
                //取得上传文件
                MultipartFile file = multiRequest.getFile(iter.next());
                if(file != null){
                    //取得当前上传文件的文件名称
                    String myFileName = file.getOriginalFilename();
                    //如果名称不为“”,说明该文件存在，否则说明该文件不存在
                    if(myFileName.trim() !=""){
                        System.out.println(myFileName);
                        //重命名上传后的文件名
                        String dirPath = request.getSession().getServletContext().getRealPath("upload/voice") ;
                        String temp = "photos"+ "/"+ file.getOriginalFilename() ;
                        File dir = new File(dirPath) ;
                        if( !dir.exists() ){
                            dir.mkdirs() ;
                        }
                        
                        String fileName = dir.getAbsolutePath() + "/"+ file.getOriginalFilename();
                        //定义上传路径
                        File localFile = new File(fileName);
                        if( !localFile.exists() ){
                            try {
                                localFile.createNewFile() ;
                                file.transferTo(localFile);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
						
						// 保存文件到文件数据表 返回文件ID
                        String ID = UUID.randomUUID().toString() ; 
                        
                    }
                }
                //记录上传该文件后的时间
//                int finaltime = (int) System.currentTimeMillis();
//                System.out.println(finaltime - pre);
            }
        }
       
    }
}
