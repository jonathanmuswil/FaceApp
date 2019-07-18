import java.util.List;

public final class rw
  extends sx<rw, rw.a>
  implements dy
{
  private static volatile my<rw> zziq;
  private static final zx<Integer, xw> zzlv = new sw();
  private static final rw zzlw = new rw();
  private int zzil;
  private String zzkb = "";
  private yx zzlu = sx.h();
  
  static
  {
    sx.a(rw.class, zzlw);
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
  
  private final void a(xw paramxw)
  {
    if (paramxw != null)
    {
      if (!this.zzlu.b())
      {
        yx localyx = this.zzlu;
        int i = localyx.size();
        if (i == 0) {
          i = 10;
        } else {
          i <<= 1;
        }
        this.zzlu = localyx.g(i);
      }
      this.zzlu.c(paramxw.o());
      return;
    }
    throw new NullPointerException();
  }
  
  public static rw.a k()
  {
    return (rw.a)zzlw.f();
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (tw.a[(paramInt - 1)])
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
            ((sx.b)paramObject1).<init>(zzlw);
            zziq = (my)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zzlw;
    case 3: 
      paramObject1 = xw.a();
      return sx.a(zzlw, "\001\002\000\001\001\002\002\000\001\000\001\b\000\002\036", new Object[] { "zzil", "zzkb", "zzlu", paramObject1 });
    case 2: 
      return new rw.a(null);
    }
    return new rw();
  }
  
  public final xw b(int paramInt)
  {
    return (xw)zzlv.a(Integer.valueOf(this.zzlu.getInt(0)));
  }
  
  public final int j()
  {
    return this.zzlu.size();
  }
  
  public static final class a
    extends sx.a<rw, a>
    implements dy
  {
    private a()
    {
      super();
    }
    
    public final a a(String paramString)
    {
      d();
      rw.a((rw)this.b, paramString);
      return this;
    }
    
    public final a a(xw paramxw)
    {
      d();
      rw.a((rw)this.b, paramxw);
      return this;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/rw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */