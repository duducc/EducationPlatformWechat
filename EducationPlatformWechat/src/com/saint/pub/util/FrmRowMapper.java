package com.saint.pub.util;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.ConvertUtilsBean;
import org.apache.commons.beanutils.PropertyUtilsBean;
import org.springframework.core.CollectionFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.JdbcUtils;

public class FrmRowMapper
implements RowMapper
{
private Class requiredType;

public FrmRowMapper()
{
}

public FrmRowMapper(Class requiredType)
{
  this.requiredType = requiredType;
}

public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
  Object objIns = null;
  try {
    objIns = this.requiredType.newInstance();
    ResultSetMetaData rsmd = rs.getMetaData();
    int columnCount = rsmd.getColumnCount();
    Map mapOfColValues = createColumnMap(columnCount);
    for (int i = 1; i <= columnCount; ++i) {
      String key = getColumnKey(rsmd.getColumnName(i));
      Object obj = getColumnValue(rs, i);
      mapOfColValues.put(key, obj);
    }
    ConvertUtilsBean convertUtils = new ConvertUtilsBean();
    DoubleConverter doubleConverter = new DoubleConverter();
    LongConverter longConverter = new LongConverter();
    StringConverter stringConverter = new StringConverter();
    DatetimeConverter datetimeConverter = new DatetimeConverter();

    convertUtils.register(doubleConverter, Double.class);
    convertUtils.register(longConverter, Long.class);
    convertUtils.register(stringConverter, String.class);
    BeanUtilsBean beanUtils = new BeanUtilsBean(convertUtils, new PropertyUtilsBean());
    beanUtils.populate(objIns, mapOfColValues);
  } catch (Exception ex) {
    ex.printStackTrace();
  }
  return objIns;
}

protected Map createColumnMap(int columnCount)
{
  return CollectionFactory.createLinkedCaseInsensitiveMapIfPossible(columnCount);
}

protected String getColumnKey(String columnName) {
  return columnName.toLowerCase();
}

protected Object getColumnValue(ResultSet rs, int index) throws SQLException {
  return JdbcUtils.getResultSetValue(rs, index);
}
}