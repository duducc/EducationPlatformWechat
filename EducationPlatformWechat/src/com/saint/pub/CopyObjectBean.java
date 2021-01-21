package com.saint.pub;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 * ��������ʵ����
 * @author gongsensheng
 * @ʱ�� 2014��9��13��17:47:43
 * @version B1.0
 * ���ã�����JAVA���� �Ѷ���A��ֵ������B
 */
public class CopyObjectBean {
	/**
	 * ����
	 * @param source  Դ����
	 * @param dest    Ŀ����� ���ǵ���Ҫnew 
	 * @throws Exception
	 */
	public static void Copy(Object source, Object dest)throws Exception {
		//��ȡ����
		BeanInfo sourceBean = Introspector.getBeanInfo(source.getClass(), java.lang.Object.class);
		PropertyDescriptor[] sourceProperty = sourceBean.getPropertyDescriptors();
		
		BeanInfo destBean = Introspector.getBeanInfo(dest.getClass(), java.lang.Object.class);
		PropertyDescriptor[] destProperty = destBean.getPropertyDescriptors();
		
		try{
			for(int i=0;i<sourceProperty.length;i++){
				
				for(int j=0;j<destProperty.length;j++){
					
					if(sourceProperty[i].getName().equals(destProperty[j].getName())){
						//����source��getter������dest��setter����
						destProperty[j].getWriteMethod().invoke(dest, sourceProperty[i].getReadMethod().invoke(source));
						break;					
					}
				}
			}
		}catch(Exception e){
			throw new Exception("���Ը���ʧ��:"+e.getMessage());
		}
	}
}
