package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

public class om
  extends CT
  implements Closeable
{
  private static LT j = LT.a(om.class);
  
  public om(ET paramET, Ol paramOl)
    throws IOException
  {
    a(paramET, paramET.size(), paramOl);
  }
  
  public void close()
    throws IOException
  {
    this.d.close();
  }
  
  public String toString()
  {
    String str = this.d.toString();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 7);
    localStringBuilder.append("model(");
    localStringBuilder.append(str);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/om.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */