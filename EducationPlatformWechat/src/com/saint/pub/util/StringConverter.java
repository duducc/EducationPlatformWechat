package com.saint.pub.util;

import org.apache.commons.beanutils.Converter;

public class StringConverter
implements Converter
{
public Object convert(Class type, Object value)
{
  if (value == null)
    return "";
  if (value.equals("null")) {
    return "";
  }
  return value;
}
}