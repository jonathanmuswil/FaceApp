package com.bumptech.glide.load;

import java.io.IOException;

public final class e
  extends IOException
{
  private final int a;
  
  public e(int paramInt)
  {
    this(localStringBuilder.toString(), paramInt);
  }
  
  public e(String paramString)
  {
    this(paramString, -1);
  }
  
  public e(String paramString, int paramInt)
  {
    this(paramString, paramInt, null);
  }
  
  public e(String paramString, int paramInt, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
    this.a = paramInt;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/bumptech/glide/load/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */