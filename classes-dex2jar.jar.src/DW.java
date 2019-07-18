import java.util.List;

public final class dw
  extends sx<dw, dw.a>
  implements dy
{
  private static volatile my<dw> zziq;
  private static final dw zzkg = new dw();
  private int zzil;
  private String zzkb = "";
  private aw zzkc;
  private Ax<Wv> zzkd = sx.i();
  private Ax<Pv> zzke = sx.i();
  private Ax<hw> zzkf = sx.i();
  
  static
  {
    sx.a(dw.class, zzkg);
  }
  
  private final void a(Pv paramPv)
  {
    if (paramPv != null)
    {
      if (!this.zzke.b()) {
        this.zzke = sx.a(this.zzke);
      }
      this.zzke.add(paramPv);
      return;
    }
    throw new NullPointerException();
  }
  
  private final void a(Wv paramWv)
  {
    if (paramWv != null)
    {
      if (!this.zzkd.b()) {
        this.zzkd = sx.a(this.zzkd);
      }
      this.zzkd.add(paramWv);
      return;
    }
    throw new NullPointerException();
  }
  
  private final void a(aw paramaw)
  {
    if (paramaw != null)
    {
      this.zzkc = paramaw;
      this.zzil |= 0x2;
      return;
    }
    throw new NullPointerException();
  }
  
  private final void a(String paramString)
  {
    if (paramString != null)
    {
      this.zzil |= 0x1;
      this.zzkb = paramString;
      return;
    }
    throw new NullPointerException();
  }
  
  public static dw.a p()
  {
    return (dw.a)zzkg.f();
  }
  
  public static dw q()
  {
    return zzkg;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (ew.a[(paramInt - 1)])
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
            ((sx.b)paramObject1).<init>(zzkg);
            zziq = (my)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zzkg;
    case 3: 
      return sx.a(zzkg, "\001\005\000\001\001\005\005\000\003\000\001\b\000\002\033\003\t\001\004\033\005\033", new Object[] { "zzil", "zzkb", "zzkd", Wv.class, "zzkc", "zzke", Pv.class, "zzkf", hw.class });
    case 2: 
      return new dw.a(null);
    }
    return new dw();
  }
  
  public final String j()
  {
    return this.zzkb;
  }
  
  public final boolean k()
  {
    return (this.zzil & 0x1) != 0;
  }
  
  public final boolean l()
  {
    return (this.zzil & 0x2) != 0;
  }
  
  public final aw m()
  {
    aw localaw1 = this.zzkc;
    aw localaw2 = localaw1;
    if (localaw1 == null) {
      localaw2 = aw.l();
    }
    return localaw2;
  }
  
  public final int n()
  {
    return this.zzkd.size();
  }
  
  public final int o()
  {
    return this.zzke.size();
  }
  
  public static final class a
    extends sx.a<dw, a>
    implements dy
  {
    private a()
    {
      super();
    }
    
    public final a a(Pv paramPv)
    {
      d();
      dw.a((dw)this.b, paramPv);
      return this;
    }
    
    public final a a(Wv paramWv)
    {
      d();
      dw.a((dw)this.b, paramWv);
      return this;
    }
    
    public final a a(aw paramaw)
    {
      d();
      dw.a((dw)this.b, paramaw);
      return this;
    }
    
    public final a a(String paramString)
    {
      d();
      dw.a((dw)this.b, paramString);
      return this;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */