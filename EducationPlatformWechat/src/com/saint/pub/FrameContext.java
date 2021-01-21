package com.saint.pub;


import java.util.*;

public class FrameContext
{

	private static FrameContext applicationContext = null;
	private static Hashtable tab;
	private static Hashtable _cachServiceList;

	private FrameContext()
	{
		tab = new Hashtable();
		_cachServiceList = new Hashtable();
	}

	public static FrameContext getInstance()
	{
		if (applicationContext == null)
			applicationContext = new FrameContext();
		return applicationContext;
	}

	public void refresh()
	{
		tab.clear();
	}

	public void remove(Object key)
	{
		tab.remove(key);
	}

	public Object getValue(Object key)
	{
		return tab.get(key);
	}

	public boolean repreg(Object key, Object value)
	{
		tab.put(key, value);
		return true;
	}

	public boolean reg(Object key, Object value)
	{
		if (tab.containsKey(key))
			return false;
		if (value != null)
			tab.put(key, value);
		return true;
	}

	public boolean contains(Object key)
	{
		return tab.containsKey(key);
	}

	public String dumpContext()
	{
		StringBuffer buffer = new StringBuffer();
		for (Enumeration e = tab.keys(); e.hasMoreElements();)
		{
			Object key = e.nextElement();
			buffer.append(key);
			buffer.append("\n");
			Map map = (Map)tab.get(key);
			Set set = map.keySet();
			for (Iterator i = set.iterator(); i.hasNext(); buffer.append("\n"))
			{
				Object dmz = i.next();
				Object object = map.get(dmz);
				buffer.append(dmz);
				buffer.append(object);
			}

		}

		return buffer.toString();
	}

	public void reg()
	{
//		String key = pService.getKey();
//		if (_cachServiceList.containsKey(key))
//		{
//			_cachServiceList.remove(key);
//			_cachServiceList.put(key, pService);
//		} else
//		{
//			_cachServiceList.put(key, pService);
//		}
//		Object val = pService.refresh();
//		if (tab.containsKey(key))
//			tab.remove(key);
//		else
//			tab.put(key, val);
	}

	public void refesh(String name)
	{
		if (_cachServiceList.containsKey(name))
		{
//			CachParamServiceImpl service = (CachParamServiceImpl)_cachServiceList.get(name);
//			Object val = service.refresh();
//			if (tab.containsKey(name))
//				tab.remove(name);
//			tab.put(name, val);
		}
	}

	public List getCachServiceList()
	{
		List resultList = new Vector();
		String key;
		for (Iterator itr = _cachServiceList.keySet().iterator(); itr.hasNext(); resultList.add(key))
			key = (String)itr.next();

		return resultList;
	}

}
