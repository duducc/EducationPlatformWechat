package com.saint.pub.util;

import org.apache.commons.beanutils.Converter;

public class DatetimeConverter
implements Converter
{
public Object convert(Class type, Object value)
{
  if (value == null) {
    return null;
  }

  return new String(value.toString());
}
}