package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.r;

@yh
public final class ki
  extends ni
{
  private final String a;
  private final int b;
  
  public ki(String paramString, int paramInt)
  {
    this.a = paramString;
    this.b = paramInt;
  }
  
  public final int I()
  {
    return this.b;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof ki)))
    {
      paramObject = (ki)paramObject;
      if ((r.a(this.a, ((ki)paramObject).a)) && (r.a(Integer.valueOf(this.b), Integer.valueOf(((ki)paramObject).b)))) {
        return true;
      }
    }
    return false;
  }
  
  public final String getType()
  {
    return this.a;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */