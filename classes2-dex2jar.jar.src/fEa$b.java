final class fEa$b
{
  private FVa<AEa.c> a;
  private Eda b;
  private Qda c;
  private String d;
  private kRa e;
  
  public fEa$b()
  {
    FVa localFVa = FVa.f(AEa.c.b.a);
    oXa.a(localFVa, "BehaviorSubject.createDefault(Empty)");
    this.a = localFVa;
  }
  
  public final void a()
  {
    this.a.a(AEa.c.b.a);
    this.b = null;
    this.c = null;
    this.d = null;
    kRa localkRa = this.e;
    if (localkRa != null) {
      localkRa.i();
    }
    this.e = null;
  }
  
  public final void a(Eda paramEda)
  {
    this.b = paramEda;
  }
  
  public final void a(Qda paramQda)
  {
    this.c = paramQda;
  }
  
  public final void a(String paramString)
  {
    this.d = paramString;
  }
  
  public final void a(kRa paramkRa)
  {
    this.e = paramkRa;
  }
  
  public final String b()
  {
    return this.d;
  }
  
  public final Eda c()
  {
    return this.b;
  }
  
  public final kRa d()
  {
    return this.e;
  }
  
  public final FVa<AEa.c> e()
  {
    return this.a;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fEa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */