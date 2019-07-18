package com.google.android.gms.internal.ads;

public final class yt
  extends pR<yt, a>
  implements _R
{
  private static volatile hS<yt> zzdv;
  private static final yt zzlb = new yt();
  private int zzdj;
  private long zzjw;
  private String zzkz = "";
  private FQ zzla = FQ.a;
  
  static
  {
    pR.a(yt.class, zzlb);
  }
  
  public static yt l()
  {
    return zzlb;
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
            ((pR.b)paramObject1).<init>(zzlb);
            zzdv = (hS)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zzlb;
    case 3: 
      return pR.a(zzlb, "\001\003\000\001\001\004\003\000\000\000\001\002\000\003\b\001\004\n\002", new Object[] { "zzdj", "zzjw", "zzkz", "zzla" });
    case 2: 
      return new a(null);
    }
    return new yt();
  }
  
  public final boolean j()
  {
    return (this.zzdj & 0x1) == 1;
  }
  
  public final long k()
  {
    return this.zzjw;
  }
  
  public static final class a
    extends pR.a<yt, a>
    implements _R
  {
    private a()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */