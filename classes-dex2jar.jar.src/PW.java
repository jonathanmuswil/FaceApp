public final class pw
  extends sx<pw, pw.a>
  implements dy
{
  private static volatile my<pw> zziq;
  private static final pw zzlt = new pw();
  private int zzil;
  private Rv zzlp;
  private Aw zzlq;
  private jw zzlr;
  private dw zzls;
  
  static
  {
    sx.a(pw.class, zzlt);
  }
  
  private final void a(Aw paramAw)
  {
    if (paramAw != null)
    {
      this.zzlq = paramAw;
      this.zzil |= 0x2;
      return;
    }
    throw new NullPointerException();
  }
  
  private final void a(Rv.a parama)
  {
    this.zzlp = ((Rv)parama.O());
    this.zzil |= 0x1;
  }
  
  private final void a(dw paramdw)
  {
    if (paramdw != null)
    {
      this.zzls = paramdw;
      this.zzil |= 0x8;
      return;
    }
    throw new NullPointerException();
  }
  
  private final void a(jw paramjw)
  {
    if (paramjw != null)
    {
      this.zzlr = paramjw;
      this.zzil |= 0x4;
      return;
    }
    throw new NullPointerException();
  }
  
  public static pw.a r()
  {
    return (pw.a)zzlt.f();
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (qw.a[(paramInt - 1)])
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
            ((sx.b)paramObject1).<init>(zzlt);
            zziq = (my)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zzlt;
    case 3: 
      return sx.a(zzlt, "\001\004\000\001\001\004\004\000\000\000\001\t\000\002\t\001\003\t\002\004\t\003", new Object[] { "zzil", "zzlp", "zzlq", "zzlr", "zzls" });
    case 2: 
      return new pw.a(null);
    }
    return new pw();
  }
  
  public final boolean j()
  {
    return (this.zzil & 0x1) != 0;
  }
  
  public final Rv k()
  {
    Rv localRv1 = this.zzlp;
    Rv localRv2 = localRv1;
    if (localRv1 == null) {
      localRv2 = Rv.p();
    }
    return localRv2;
  }
  
  public final boolean l()
  {
    return (this.zzil & 0x2) != 0;
  }
  
  public final Aw m()
  {
    Aw localAw1 = this.zzlq;
    Aw localAw2 = localAw1;
    if (localAw1 == null) {
      localAw2 = Aw.s();
    }
    return localAw2;
  }
  
  public final boolean n()
  {
    return (this.zzil & 0x4) != 0;
  }
  
  public final jw o()
  {
    jw localjw1 = this.zzlr;
    jw localjw2 = localjw1;
    if (localjw1 == null) {
      localjw2 = jw.C();
    }
    return localjw2;
  }
  
  public final boolean p()
  {
    return (this.zzil & 0x8) != 0;
  }
  
  public final dw q()
  {
    dw localdw1 = this.zzls;
    dw localdw2 = localdw1;
    if (localdw1 == null) {
      localdw2 = dw.q();
    }
    return localdw2;
  }
  
  public static final class a
    extends sx.a<pw, a>
    implements dy
  {
    private a()
    {
      super();
    }
    
    public final a a(Aw paramAw)
    {
      d();
      pw.a((pw)this.b, paramAw);
      return this;
    }
    
    public final a a(Rv.a parama)
    {
      d();
      pw.a((pw)this.b, parama);
      return this;
    }
    
    public final a a(dw paramdw)
    {
      d();
      pw.a((pw)this.b, paramdw);
      return this;
    }
    
    public final a a(jw paramjw)
    {
      d();
      pw.a((pw)this.b, paramjw);
      return this;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/pw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */