package com.google.android.gms.common.api;

import com.google.android.gms.common.d;

public final class q
  extends UnsupportedOperationException
{
  private final d a;
  
  public q(d paramd)
  {
    this.a = paramd;
  }
  
  public final String getMessage()
  {
    String str = String.valueOf(this.a);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 8);
    localStringBuilder.append("Missing ");
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */