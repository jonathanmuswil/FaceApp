package com.google.android.gms.internal.ads;

public final class wt
  extends pR<wt, a>
  implements _R
{
  private static volatile hS<wt> zzdv;
  private static final wt zzkb = new wt();
  private int zzdj;
  private long zzjw;
  private int zzjx;
  private boolean zzjy;
  private vR zzjz = pR.h();
  private long zzka;
  
  static
  {
    pR.a(wt.class, zzkb);
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
            ((pR.b)paramObject1).<init>(zzkb);
            zzdv = (hS)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zzkb;
    case 3: 
      return pR.a(zzkb, "\001\005\000\001\001\005\005\000\001\000\001\002\000\002\004\001\003\007\002\004\026\005\003\003", new Object[] { "zzdj", "zzjw", "zzjx", "zzjy", "zzjz", "zzka" });
    case 2: 
      return new a(null);
    }
    return new wt();
  }
  
  public static final class a
    extends pR.a<wt, a>
    implements _R
  {
    private a()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */