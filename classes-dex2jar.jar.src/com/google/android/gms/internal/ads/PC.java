package com.google.android.gms.internal.ads;

import java.util.Map;

@yh
public final class pc
  implements Ic<Object>
{
  private final qc a;
  
  public pc(qc paramqc)
  {
    this.a = paramqc;
  }
  
  public final void a(Object paramObject, Map<String, String> paramMap)
  {
    paramObject = (String)paramMap.get("name");
    if (paramObject == null)
    {
      Tl.d("App event with no name parameter.");
      return;
    }
    this.a.a((String)paramObject, (String)paramMap.get("info"));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */