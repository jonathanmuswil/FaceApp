public final class Eu$b
  extends Es<b, Eu.b.a>
  implements kt
{
  private static volatile st<b> zzbg;
  private static final b zzbiv = new b();
  private int zzbb;
  private String zzbis = "";
  private long zzbit;
  private long zzbiu;
  private int zzya;
  
  static
  {
    Es.a(b.class, zzbiv);
  }
  
  private final void a(long paramLong)
  {
    this.zzbb |= 0x4;
    this.zzbit = paramLong;
  }
  
  private final void a(String paramString)
  {
    if (paramString != null)
    {
      this.zzbb |= 0x2;
      this.zzbis = paramString;
      return;
    }
    throw new NullPointerException();
  }
  
  private final void b(long paramLong)
  {
    this.zzbb |= 0x8;
    this.zzbiu = paramLong;
  }
  
  public static Eu.b.a i()
  {
    return (Eu.b.a)zzbiv.a(Es.e.e, null, null);
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (Fu.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 7: 
      return null;
    case 6: 
      return Byte.valueOf((byte)1);
    case 5: 
      paramObject2 = zzbg;
      paramObject1 = paramObject2;
      if (paramObject2 == null) {
        try
        {
          paramObject2 = zzbg;
          paramObject1 = paramObject2;
          if (paramObject2 == null)
          {
            paramObject1 = new Es$b;
            ((Es.b)paramObject1).<init>(zzbiv);
            zzbg = (st)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zzbiv;
    case 3: 
      return Es.a(zzbiv, "\001\004\000\001\001\004\004\005\000\000\000\001\004\000\002\b\001\003\002\002\004\002\003", new Object[] { "zzbb", "zzya", "zzbis", "zzbit", "zzbiu" });
    case 2: 
      return new Eu.b.a(null);
    }
    return new b();
  }
  
  public final int d()
  {
    return this.zzya;
  }
  
  public final boolean e()
  {
    return (this.zzbb & 0x1) == 1;
  }
  
  public final String f()
  {
    return this.zzbis;
  }
  
  public final long g()
  {
    return this.zzbit;
  }
  
  public final long h()
  {
    return this.zzbiu;
  }
  
  public static final class a
    extends Es.a<Eu.b, a>
    implements kt
  {
    private a()
    {
      super();
    }
    
    public final a a(long paramLong)
    {
      b();
      Eu.b.a((Eu.b)this.b, paramLong);
      return this;
    }
    
    public final a a(String paramString)
    {
      b();
      Eu.b.a((Eu.b)this.b, paramString);
      return this;
    }
    
    public final a b(long paramLong)
    {
      b();
      Eu.b.b((Eu.b)this.b, paramLong);
      return this;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Eu$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */