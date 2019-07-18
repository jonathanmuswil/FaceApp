public final class aw
  extends sx<aw, aw.a>
  implements dy
{
  private static volatile my<aw> zziq;
  private static final aw zzka = new aw();
  private int zzil;
  private String zzju = "";
  private int zzjv;
  private int zzjw;
  private int zzjx;
  private int zzjy;
  private int zzjz;
  
  static
  {
    sx.a(aw.class, zzka);
  }
  
  private final void a(String paramString)
  {
    if (paramString != null)
    {
      this.zzil |= 0x1;
      this.zzju = paramString;
      return;
    }
    throw new NullPointerException();
  }
  
  private final void b(int paramInt)
  {
    this.zzil |= 0x8;
    this.zzjx = paramInt;
  }
  
  private final void c(int paramInt)
  {
    this.zzil |= 0x10;
    this.zzjy = paramInt;
  }
  
  private final void d(int paramInt)
  {
    this.zzil |= 0x20;
    this.zzjz = paramInt;
  }
  
  public static aw.a k()
  {
    return (aw.a)zzka.f();
  }
  
  public static aw l()
  {
    return zzka;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (bw.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 7: 
      return null;
    case 6: 
      return Byte.valueOf((byte)1);
    case 5: 
      paramObject2 = zziq;
      paramObject1 = paramObject2;
      if (paramObject2 == null) {
        try
        {
          paramObject2 = zziq;
          paramObject1 = paramObject2;
          if (paramObject2 == null)
          {
            paramObject1 = new sx$b;
            ((sx.b)paramObject1).<init>(zzka);
            zziq = (my)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zzka;
    case 3: 
      return sx.a(zzka, "\001\006\000\001\001\006\006\000\000\000\001\b\000\002\004\001\003\004\003\004\004\004\005\004\005\006\004\002", new Object[] { "zzil", "zzju", "zzjv", "zzjx", "zzjy", "zzjz", "zzjw" });
    case 2: 
      return new aw.a(null);
    }
    return new aw();
  }
  
  public final boolean j()
  {
    return (this.zzil & 0x10) != 0;
  }
  
  public static final class a
    extends sx.a<aw, a>
    implements dy
  {
    private a()
    {
      super();
    }
    
    public final a a(int paramInt)
    {
      d();
      aw.a((aw)this.b, paramInt);
      return this;
    }
    
    public final a a(String paramString)
    {
      d();
      aw.a((aw)this.b, paramString);
      return this;
    }
    
    public final a b(int paramInt)
    {
      d();
      aw.b((aw)this.b, paramInt);
      return this;
    }
    
    public final a c(int paramInt)
    {
      d();
      aw.c((aw)this.b, paramInt);
      return this;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */