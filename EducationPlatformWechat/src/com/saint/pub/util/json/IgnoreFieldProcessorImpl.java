package com.saint.pub.util.json;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Set;
import net.sf.json.util.PropertyFilter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * ��������JSON���˲���ʵ���в�Ҫ�ֶ� 
 * �����ˣ�Chole 
 * ����ʱ�䣺2015-4-29����9:54:03 
 * �޸ı�ע��
 */
public class IgnoreFieldProcessorImpl implements PropertyFilter {

	Log log = LogFactory.getLog(this.getClass());

	/**
	 * ���Ե���������
	 */
	private String[] fields;

	/**
	 * �Ƿ���Լ���
	 */
	private boolean ignoreColl = false;

	/**
	 * �ղι��췽��<br/>
	 * Ĭ�ϲ����Լ���
	 */
	public IgnoreFieldProcessorImpl() {
		// empty
	}

	/**
	 * ���췽��
	 * 
	 * @param fields
	 *            ����������������
	 */
	public IgnoreFieldProcessorImpl(String[] fields) {
		this.fields = fields;
	}

	/**
	 * ���췽��
	 * 
	 * @param ignoreColl
	 *            �Ƿ���Լ���
	 * @param fields
	 *            ����������������
	 */
	public IgnoreFieldProcessorImpl(boolean ignoreColl, String[] fields) {
		this.fields = fields;
		this.ignoreColl = ignoreColl;
	}

	/**
	 * ���췽��
	 * 
	 * @param ignoreColl
	 *            �Ƿ���Լ���
	 */
	public IgnoreFieldProcessorImpl(boolean ignoreColl) {
		this.ignoreColl = ignoreColl;
	}

	public boolean apply(Object source, String name, Object value) {
		Field declaredField = null;
		// ����ֵΪnull������
		if (value == null)
			return true;
		// �޳��Զ������ԣ���ȡ������������
		if (!"data".equals(name) && "data" != name && !"totalSize".equals(name)
				&& "totalSize" != name) {

			Class superClass = source.getClass().getSuperclass();
			if (superClass != null) {
				try {
					declaredField = superClass.getDeclaredField(name);
				} catch (NoSuchFieldException ex) {
					try {
						declaredField = source.getClass().getDeclaredField(name);
					} catch (NoSuchFieldException e) {
						log.equals("û���ҵ�����" + name);
						e.printStackTrace();
					}
				}
			}
		}
		// ���Լ���
		if (declaredField != null) {
			if (ignoreColl) {
				if (declaredField.getType() == Collection.class
						|| declaredField.getType() == Set.class) {
					return true;
				}
			}
		}

		// �����趨������
		if (fields != null && fields.length > 0) {
			if (juge(fields, name)) {
				return true;
			} else {
				return false;
			}
		}

		return false;
	}

	/**
	 * ���˺��Ե�����
	 * 
	 * @param s
	 * @param s2
	 * @return
	 */
	public boolean juge(String[] s, String s2) {
		boolean b = false;
		for (String sl : s) {
			if (s2.equals(sl)) {
				b = true;
			}
		}
		return b;
	}

	public String[] getFields() {
		return fields;
	}

	/**
	 * ���ú��Ե�����
	 * 
	 * @param fields
	 */
	public void setFields(String[] fields) {
		this.fields = fields;
	}

	public boolean isIgnoreColl() {
		return ignoreColl;
	}

	/**
	 * �����Ƿ���Լ�����
	 * 
	 * @param ignoreColl
	 */
	public void setIgnoreColl(boolean ignoreColl) {
		this.ignoreColl = ignoreColl;
	}
}
