package com.google.android.gms.internal.ads;

public final class zt
  extends pR<zt, a>
  implements _R
{
  private static volatile hS<zt> zzdv;
  private static final zt zzlc = new zt();
  private int zzdj;
  private String zzeo = "";
  
  static
  {
    pR.a(zt.class, zzlc);
  }
  
  private final void a(String paramString)
  {
    if (paramString != null)
    {
      this.zzdj |= 0x1;
      this.zzeo = paramString;
      return;
    }
    throw new NullPointerException();
  }
  
  public static a j()
  {
    return (a)zzlc.a(pR.e.e, null, null);
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (au.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 7: 
      return null;
    case 6: 
      return Byte.valueOf((byte)1);
    case 5: 
      paramObject2 = zzdv;
      paramObject1 = paramObject2;
      if (paramObject2 == null) {
        try
        {
          paramObject2 = zzdv;
          paramObject1 = paramObject2;
          if (paramObject2 == null)
          {
            paramObject1 = new com/google/android/gms/internal/ads/pR$b;
            ((pR.b)paramObject1).<init>(zzlc);
            zzdv = (hS)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zzlc;
    case 3: 
      return pR.a(zzlc, "\001\001\000\001\001\001\001\000\000\000\001\b\000", new Object[] { "zzdj", "zzeo" });
    case 2: 
      return new a(null);
    }
    return new zt();
  }
  
  public static final class a
    extends pR.a<zt, a>
    implements _R
  {
    private a()
    {
      super();
    }
    
    public final a a(String paramString)
    {
      g();
      zt.a((zt)this.b, paramString);
      return this;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */