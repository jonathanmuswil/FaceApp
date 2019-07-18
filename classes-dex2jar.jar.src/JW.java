import java.util.List;

public final class jw
  extends sx<jw, jw.a>
  implements dy
{
  private static volatile my<jw> zziq;
  private static final jw zzla = new jw();
  private int zzil;
  private Wx<String, String> zzjb = Wx.c();
  private String zzko = "";
  private int zzkp;
  private long zzkq;
  private long zzkr;
  private int zzks;
  private int zzkt;
  private String zzku = "";
  private long zzkv;
  private long zzkw;
  private long zzkx;
  private long zzky;
  private Ax<rw> zzkz = sx.i();
  
  static
  {
    sx.a(jw.class, zzla);
  }
  
  public static jw.a B()
  {
    return (jw.a)zzla.f();
  }
  
  public static jw C()
  {
    return zzla;
  }
  
  private final void F()
  {
    this.zzil &= 0xFFFFFFBF;
    this.zzku = zzla.zzku;
  }
  
  private final void G()
  {
    this.zzkz = sx.i();
  }
  
  private final void a(long paramLong)
  {
    this.zzil |= 0x100;
    this.zzkw = paramLong;
  }
  
  private final void a(Iterable<? extends rw> paramIterable)
  {
    if (!this.zzkz.b()) {
      this.zzkz = sx.a(this.zzkz);
    }
    Iw.a(paramIterable, this.zzkz);
  }
  
  private final void a(String paramString)
  {
    if (paramString != null)
    {
      this.zzil |= 0x40;
      this.zzku = paramString;
      return;
    }
    throw new NullPointerException();
  }
  
  private final void a(jw.c paramc)
  {
    if (paramc != null)
    {
      this.zzil |= 0x2;
      this.zzkp = paramc.o();
      return;
    }
    throw new NullPointerException();
  }
  
  private final void a(jw.d paramd)
  {
    if (paramd != null)
    {
      this.zzil |= 0x10;
      this.zzks = paramd.o();
      return;
    }
    throw new NullPointerException();
  }
  
  private final void b(int paramInt)
  {
    this.zzil |= 0x20;
    this.zzkt = paramInt;
  }
  
  private final void b(long paramLong)
  {
    this.zzil |= 0x200;
    this.zzkx = paramLong;
  }
  
  private final void b(String paramString)
  {
    if (paramString != null)
    {
      this.zzil |= 0x1;
      this.zzko = paramString;
      return;
    }
    throw new NullPointerException();
  }
  
  private final void c(long paramLong)
  {
    this.zzil |= 0x400;
    this.zzky = paramLong;
  }
  
  private final void d(long paramLong)
  {
    this.zzil |= 0x4;
    this.zzkq = paramLong;
  }
  
  private final void e(long paramLong)
  {
    this.zzil |= 0x8;
    this.zzkr = paramLong;
  }
  
  private final void f(long paramLong)
  {
    this.zzil |= 0x80;
    this.zzkv = paramLong;
  }
  
  public final List<rw> A()
  {
    return this.zzkz;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (kw.a[(paramInt - 1)])
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
            ((sx.b)paramObject1).<init>(zzla);
            zziq = (my)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zzla;
    case 3: 
      paramObject1 = jw.c.a();
      xx localxx = jw.d.a();
      paramObject2 = jw.b.a;
      return sx.a(zzla, "\001\r\000\001\001\r\r\001\001\000\001\b\000\002\f\001\003\002\002\004\002\003\005\004\005\006\b\006\007\002\007\b\002\b\t\002\t\n\002\n\013\f\004\f2\r\033", new Object[] { "zzil", "zzko", "zzkp", paramObject1, "zzkq", "zzkr", "zzkt", "zzku", "zzkv", "zzkw", "zzkx", "zzky", "zzks", localxx, "zzjb", paramObject2, "zzkz", rw.class });
    case 2: 
      return new jw.a(null);
    }
    return new jw();
  }
  
  public final String j()
  {
    return this.zzko;
  }
  
  public final boolean k()
  {
    return (this.zzil & 0x20) != 0;
  }
  
  public final boolean l()
  {
    return (this.zzil & 0x2) != 0;
  }
  
  public final jw.c m()
  {
    jw.c localc1 = jw.c.a(this.zzkp);
    jw.c localc2 = localc1;
    if (localc1 == null) {
      localc2 = jw.c.a;
    }
    return localc2;
  }
  
  public final boolean n()
  {
    return (this.zzil & 0x4) != 0;
  }
  
  public final long o()
  {
    return this.zzkq;
  }
  
  public final boolean p()
  {
    return (this.zzil & 0x8) != 0;
  }
  
  public final long q()
  {
    return this.zzkr;
  }
  
  public final int r()
  {
    return this.zzkt;
  }
  
  public final boolean s()
  {
    return (this.zzil & 0x80) != 0;
  }
  
  public final long t()
  {
    return this.zzkv;
  }
  
  public final boolean u()
  {
    return (this.zzil & 0x100) != 0;
  }
  
  public final long v()
  {
    return this.zzkw;
  }
  
  public final boolean w()
  {
    return (this.zzil & 0x200) != 0;
  }
  
  public final long x()
  {
    return this.zzkx;
  }
  
  public final boolean y()
  {
    return (this.zzil & 0x400) != 0;
  }
  
  public final long z()
  {
    return this.zzky;
  }
  
  public static final class a
    extends sx.a<jw, a>
    implements dy
  {
    private a()
    {
      super();
    }
    
    public final a a(int paramInt)
    {
      d();
      jw.a((jw)this.b, paramInt);
      return this;
    }
    
    public final a a(long paramLong)
    {
      d();
      jw.a((jw)this.b, paramLong);
      return this;
    }
    
    public final a a(Iterable<? extends rw> paramIterable)
    {
      d();
      jw.a((jw)this.b, paramIterable);
      return this;
    }
    
    public final a a(String paramString)
    {
      d();
      jw.a((jw)this.b, paramString);
      return this;
    }
    
    public final a a(jw.c paramc)
    {
      d();
      jw.a((jw)this.b, paramc);
      return this;
    }
    
    public final a a(jw.d paramd)
    {
      d();
      jw.a((jw)this.b, paramd);
      return this;
    }
    
    public final a b(long paramLong)
    {
      d();
      jw.b((jw)this.b, paramLong);
      return this;
    }
    
    public final a b(String paramString)
    {
      d();
      jw.b((jw)this.b, paramString);
      return this;
    }
    
    public final a c(long paramLong)
    {
      d();
      jw.c((jw)this.b, paramLong);
      return this;
    }
    
    public final a d(long paramLong)
    {
      d();
      jw.d((jw)this.b, paramLong);
      return this;
    }
    
    public final a e(long paramLong)
    {
      d();
      jw.e((jw)this.b, paramLong);
      return this;
    }
    
    public final a f(long paramLong)
    {
      d();
      jw.f((jw)this.b, paramLong);
      return this;
    }
    
    public final boolean g()
    {
      return ((jw)this.b).k();
    }
    
    public final boolean h()
    {
      return ((jw)this.b).s();
    }
    
    public final long i()
    {
      return ((jw)this.b).x();
    }
    
    public final boolean j()
    {
      return ((jw)this.b).y();
    }
    
    public final a k()
    {
      d();
      jw.a((jw)this.b);
      return this;
    }
    
    public final a l()
    {
      d();
      jw.b((jw)this.b);
      return this;
    }
  }
  
  static final class b
  {
    static final Ux<String, String> a;
    
    static
    {
      Yy localYy = Yy.i;
      a = Ux.a(localYy, "", localYy, "");
    }
  }
  
  public static enum c
    implements vx
  {
    private static final wx<c> k = new lw();
    private final int m;
    
    private c(int paramInt)
    {
      this.m = paramInt;
    }
    
    public static c a(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        return null;
      case 9: 
        return j;
      case 8: 
        return i;
      case 7: 
        return h;
      case 6: 
        return g;
      case 5: 
        return f;
      case 4: 
        return e;
      case 3: 
        return d;
      case 2: 
        return c;
      case 1: 
        return b;
      }
      return a;
    }
    
    public static xx a()
    {
      return mw.a;
    }
    
    public final int o()
    {
      return this.m;
    }
  }
  
  public static enum d
    implements vx
  {
    private static final wx<d> c = new nw();
    private final int e;
    
    private d(int paramInt)
    {
      this.e = paramInt;
    }
    
    public static xx a()
    {
      return ow.a;
    }
    
    public final int o()
    {
      return this.e;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */