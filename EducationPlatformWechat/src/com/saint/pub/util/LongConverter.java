package com.saint.pub.util;

import org.apache.commons.beanutils.Converter;

public class LongConverter
implements Converter
{
public Object convert(Class type, Object value)
{
  if (value == null) {
    return null;
  }
  return new Long(value.toString());
}
}