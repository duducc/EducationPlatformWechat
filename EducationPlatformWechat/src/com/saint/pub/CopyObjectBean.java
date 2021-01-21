package com.saint.pub;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 * 复制两个实体类
 * @author gongsensheng
 * @时间 2014年9月13日17:47:43
 * @version B1.0
 * 作用，利用JAVA反射 把对象A赋值到对象B
 */
public class CopyObjectBean {
	/**
	 * 复制
	 * @param source  源对象
	 * @param dest    目标对象 ，记得先要new 
	 * @throws Exception
	 */
	public static void Copy(Object source, Object dest)throws Exception {
		//获取属性
		BeanInfo sourceBean = Introspector.getBeanInfo(source.getClass(), java.lang.Object.class);
		PropertyDescriptor[] sourceProperty = sourceBean.getPropertyDescriptors();
		
		BeanInfo destBean = Introspector.getBeanInfo(dest.getClass(), java.lang.Object.class);
		PropertyDescriptor[] destProperty = destBean.getPropertyDescriptors();
		
		try{
			for(int i=0;i<sourceProperty.length;i++){
				
				for(int j=0;j<destProperty.length;j++){
					
					if(sourceProperty[i].getName().equals(destProperty[j].getName())){
						//调用source的getter方法和dest的setter方法
						destProperty[j].getWriteMethod().invoke(dest, sourceProperty[i].getReadMethod().invoke(source));
						break;					
					}
				}
			}
		}catch(Exception e){
			throw new Exception("属性复制失败:"+e.getMessage());
		}
	}
}
