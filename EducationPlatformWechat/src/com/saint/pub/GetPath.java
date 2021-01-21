package com.saint.pub;
import java.io.File;
import java.net.URL;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class GetPath {
	 /**
	  * ��ȡ��Ŀ��Ŀ¼�ľ���·��
	  * 
	  * @return ��:F:\TongJianpeng\J2EEUtil
	  * */
	 public static String getAbsolutePathWithProject() {
	  return System.getProperty("user.dir");
	 }

	 /**
	  * ��ȡ��Ŀ�����̷�
	  * */
	 public static String getDriverPathWithProject() {
	  return new File("/").getAbsolutePath();
	 }

	 /**
	  * ��ȡ��Ŀ��Ŀ¼�ľ���·��
	  * 
	  * @return ��Ŀ��Ŀ.����<br/> F:\tomcat\webapps\J2EEUtil\
	  * */
	 public static String getAbsolutePathWithWebProject(
	   HttpServletRequest request) {
	  return request.getSession().getServletContext().getRealPath("/");
	 }

	 /**
	  * ��ȡ��Ŀ��Ŀ¼�µ�ָ��Ŀ¼�ľ���·��
	  * 
	  * @param ��Ŀ��Ŀ�µ�ָ��Ŀ¼
	  *            .����:/login/
	  * @return ��Ŀ��Ŀ�µ�ָ��Ŀ¼.����:<br/> F:\tomcat\webapps\J2EEUtil\login\
	  * */
	 public static String getAbsolutePathWithWebProject(
	   HttpServletRequest request, String path) {
	  return request.getSession().getServletContext().getRealPath(path);
	 }

	 /**
	  * ��ȡ��Ŀ��Ŀ¼�ľ���·��
	  * 
	  * @return ��Ŀ��Ŀ.����<br/> F:\tomcat\webapps\J2EEUtil\
	  * */
	 public static String getAbsolutePathWithWebProject(ServletContext context) {
	  return context.getRealPath("/");
	 }

	 /**
	  * ��ȡ��Ŀ��Ŀ¼�µ�ָ��Ŀ¼�ľ���·��
	  * 
	  * @param ��Ŀ��Ŀ�µ�ָ��Ŀ¼
	  *            .����:/login/
	  * @return ��Ŀ��Ŀ�µ�ָ��Ŀ¼.����:<br/> F:\tomcat\webapps\J2EEUtil\login\
	  * */
	 public static String getAbsolutePathWithWebProject(ServletContext context,
	   String path) {
	  return context.getRealPath(path);
	 }

	 /**
	  * ��ȡ��ĿclasspathĿ¼�ľ���·��
	  * 
	  * @return classesĿ¼�ľ���·��<br/>
	  *         file:/F:/tomcat/webapps/J2EEUtil/WEB-INF/classes/
	  * */
	 public static URL getAbsolutePathWithClass() {
	  return GetPath.class.getResource("/");
	 }

	 /**
	  * ��ȡ��ĿclassPathĿ¼�µ�ָ��Ŀ¼�ľ���·��
	  * 
	  * @param path
	  *            classesĿ¼�µ�ָ��Ŀ¼.����:/com/
	  * @return file:/F:/tomcat/webapps/J2EEUtil/WEB-INF/classes/com/
	  * */
	 public static URL getAbsolutePathWithClass(String path) {
	  return GetPath.class.getResource(path);
	 }
	 
	 /**
	  * ��ȡָ�����ļ�������Ŀ¼�ľ���·��
	  * 
	  * @param clazz
	  *            ��
	  * @return ���ļ��ľ���·��.����:<br/> ��com.Aries.Util.Web�µ�Main.java��.<br/>
	  *         ·��Ϊ:file:/
	  *         F:/tomcat/webapps/J2EEUtil/WEB-INF/classes/com/Aries/Util/Web/
	  * */
	 public static URL getAbsolutePathWithClass(Class clazz) {
	  return clazz.getResource("");
	 }
}
