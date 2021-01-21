package com.saint.pub.util;
import org.springframework.jdbc.core.PreparedStatementCallback;

public abstract class PreparedStatementCallbackImpl
  implements PreparedStatementCallback
{
  private Object parameterObject;

  public Object getParameterObject()
  {
    return this.parameterObject;
  }
  public void setParameterObject(Object parameterObject) {
    this.parameterObject = parameterObject;
  }
}