package com.google.android.gms.internal.ads;

import java.util.Map;

public final class ol
  extends Iaa<HZ>
{
  private final Hm<HZ> p;
  private final Map<String, String> q = null;
  private final Ll r;
  
  public ol(String paramString, Hm<HZ> paramHm)
  {
    this(paramString, null, paramHm);
  }
  
  private ol(String paramString, Map<String, String> paramMap, Hm<HZ> paramHm)
  {
    super(0, paramString, new pl(paramHm));
    this.p = paramHm;
    this.r = new Ll();
    this.r.a(paramString, "GET", null, null);
  }
  
  protected final vea<HZ> a(HZ paramHZ)
  {
    return vea.a(paramHZ, Vg.a(paramHZ));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */