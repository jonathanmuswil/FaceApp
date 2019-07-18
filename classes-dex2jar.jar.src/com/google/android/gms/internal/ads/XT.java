package com.google.android.gms.internal.ads;

public final class xt
  extends pR<xt, a>
  implements _R
{
  private static volatile hS<xt> zzdv;
  private static final xt zzkj = new xt();
  private int zzdj;
  private FQ zzkf;
  private FQ zzkg;
  private FQ zzkh;
  private FQ zzki;
  
  static
  {
    pR.a(xt.class, zzkj);
  }
  
  private xt()
  {
    FQ localFQ = FQ.a;
    this.zzkf = localFQ;
    this.zzkg = localFQ;
    this.zzkh = localFQ;
    this.zzki = localFQ;
  }
  
  public static xt a(byte[] paramArrayOfByte, bR parambR)
    throws yR
  {
    return (xt)pR.a(zzkj, paramArrayOfByte, parambR);
  }
  
  private final void a(FQ paramFQ)
  {
    if (paramFQ != null)
    {
      this.zzdj |= 0x1;
      this.zzkf = paramFQ;
      return;
    }
    throw new NullPointerException();
  }
  
  private final void b(FQ paramFQ)
  {
    if (paramFQ != null)
    {
      this.zzdj |= 0x2;
      this.zzkg = paramFQ;
      return;
    }
    throw new NullPointerException();
  }
  
  private final void c(FQ paramFQ)
  {
    if (paramFQ != null)
    {
      this.zzdj |= 0x4;
      this.zzkh = paramFQ;
      return;
    }
    throw new NullPointerException();
  }
  
  private final void d(FQ paramFQ)
  {
    if (paramFQ != null)
    {
      this.zzdj |= 0x8;
      this.zzki = paramFQ;
      return;
    }
    throw new NullPointerException();
  }
  
  public static a n()
  {
    return (a)zzkj.a(pR.e.e, null, null);
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
            ((pR.b)paramObject1).<init>(zzkj);
            zzdv = (hS)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zzkj;
    case 3: 
      return pR.a(zzkj, "\001\004\000\001\001\004\004\000\000\000\001\n\000\002\n\001\003\n\002\004\n\003", new Object[] { "zzdj", "zzkf", "zzkg", "zzkh", "zzki" });
    case 2: 
      return new a(null);
    }
    return new xt();
  }
  
  public final FQ j()
  {
    return this.zzkf;
  }
  
  public final FQ k()
  {
    return this.zzkg;
  }
  
  public final FQ l()
  {
    return this.zzkh;
  }
  
  public final FQ m()
  {
    return this.zzki;
  }
  
  public static final class a
    extends pR.a<xt, a>
    implements _R
  {
    private a()
    {
      super();
    }
    
    public final a a(FQ paramFQ)
    {
      g();
      xt.a((xt)this.b, paramFQ);
      return this;
    }
    
    public final a b(FQ paramFQ)
    {
      g();
      xt.b((xt)this.b, paramFQ);
      return this;
    }
    
    public final a c(FQ paramFQ)
    {
      g();
      xt.c((xt)this.b, paramFQ);
      return this;
    }
    
    public final a d(FQ paramFQ)
    {
      g();
      xt.d((xt)this.b, paramFQ);
      return this;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */