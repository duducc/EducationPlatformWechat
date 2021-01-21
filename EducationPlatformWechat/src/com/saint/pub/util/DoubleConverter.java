package com.saint.pub.util;

import org.apache.commons.beanutils.Converter;


public class DoubleConverter
implements Converter
{
public Object convert(Class type, Object value)
{
  if (value == null) {
    return null;
  }
  return new Double(value.toString());
}
}