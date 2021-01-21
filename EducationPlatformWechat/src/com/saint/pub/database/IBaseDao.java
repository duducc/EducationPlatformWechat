package com.saint.pub.database;

import java.util.List;
import java.util.Map;

public interface IBaseDao {
	public ExcuteResult excuteDataBase(Object args,ExcuteType excuteType,String excuStr) throws ExcuteException;
	public Object getObject(Object args,String excuStr) throws ExcuteException;
	public List getObjectList(Object args,String excuStr) throws ExcuteException;
    public List<Map<?, ?>> getObjectListMap(Object args, String excuStr) throws ExcuteException;
}