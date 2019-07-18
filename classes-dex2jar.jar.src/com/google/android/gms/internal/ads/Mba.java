package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class mba
{
  private final Map<String, String> a = new HashMap();
  private Map<String, String> b;
  
  public final Map<String, String> a()
  {
    try
    {
      if (this.b == null)
      {
        localObject1 = new java/util/HashMap;
        ((HashMap)localObject1).<init>(this.a);
        this.b = Collections.unmodifiableMap((Map)localObject1);
      }
      Object localObject1 = this.b;
      return (Map<String, String>)localObject1;
    }
    finally {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */