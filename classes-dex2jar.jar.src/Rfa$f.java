public abstract class Rfa$f
  extends Rfa
{
  private final String c;
  private final int d;
  
  private Rfa$f(String paramString, int paramInt)
  {
    super(null);
    this.c = paramString;
    this.d = paramInt;
  }
  
  public final boolean a(String paramString, int paramInt)
  {
    oXa.b(paramString, "errorCode");
    boolean bool;
    if ((oXa.a(this.c, paramString)) && (this.d == paramInt)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final gbb b()
  {
    DZa localDZa = DZa.a(rZa.b("application/json"), "");
    BZa.a locala = new BZa.a();
    locala.a(this.d);
    locala.a("Response.error()");
    locala.a("X-FaceApp-ErrorCode", this.c);
    locala.a(vZa.b);
    xZa.a locala1 = new xZa.a();
    locala1.b("http://localhost/");
    locala.a(locala1.a());
    return new gbb(tbb.a(localDZa, locala.a()));
  }
  
  public final String c()
  {
    return this.c;
  }
  
  public static final class a
    extends Rfa.f
  {
    public static final a e = new a();
    
    private a()
    {
      super(400, null);
    }
  }
  
  public static final class b
    extends Rfa.f
  {
    public static final b e = new b();
    
    private b()
    {
      super(400, null);
    }
  }
  
  public static final class c
    extends Rfa.f
  {
    public static final c e = new c();
    
    private c()
    {
      super(400, null);
    }
  }
  
  public static final class d
    extends Rfa.f
  {
    public static final d e = new d();
    
    private d()
    {
      super(400, null);
    }
  }
  
  public static final class e
    extends Rfa.f
  {
    public static final e e = new e();
    
    private e()
    {
      super(400, null);
    }
  }
  
  public static final class f
    extends Rfa.f
  {
    public static final f e = new f();
    
    private f()
    {
      super(400, null);
    }
  }
  
  public static final class g
    extends Rfa.f
  {
    public static final g e = new g();
    
    private g()
    {
      super(400, null);
    }
  }
  
  public static final class h
    extends Rfa.f
  {
    public static final h e = new h();
    
    private h()
    {
      super(400, null);
    }
  }
  
  public static final class i
    extends Rfa.f
  {
    public static final i e = new i();
    
    private i()
    {
      super(400, null);
    }
  }
  
  public static final class j
    extends Rfa.f
  {
    public static final j e = new j();
    
    private j()
    {
      super(400, null);
    }
  }
  
  public static final class k
    extends Rfa.f
  {
    public static final k e = new k();
    
    private k()
    {
      super(410, null);
    }
  }
  
  public static final class l
    extends Rfa.f
  {
    public static final l e = new l();
    
    private l()
    {
      super(402, null);
    }
  }
  
  public static final class m
    extends Rfa.f
  {
    public static final m e = new m();
    
    private m()
    {
      super(429, null);
    }
  }
  
  public static final class n
    extends Rfa.f
  {
    public static final n e = new n();
    
    private n()
    {
      super(429, null);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Rfa$f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */