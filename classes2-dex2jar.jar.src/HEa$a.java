final class HEa$a
{
  private FVa<WEa.c> a;
  private String b;
  private kRa c;
  
  public HEa$a()
  {
    FVa localFVa = FVa.f(WEa.c.b.a);
    oXa.a(localFVa, "BehaviorSubject.createDefault(Empty)");
    this.a = localFVa;
  }
  
  public final void a()
  {
    this.a.a(WEa.c.b.a);
    this.b = null;
    kRa localkRa = this.c;
    if (localkRa != null) {
      localkRa.i();
    }
    this.c = null;
  }
  
  public final void a(String paramString)
  {
    this.b = paramString;
  }
  
  public final void a(kRa paramkRa)
  {
    this.c = paramkRa;
  }
  
  public final String b()
  {
    return this.b;
  }
  
  public final kRa c()
  {
    return this.c;
  }
  
  public final FVa<WEa.c> d()
  {
    return this.a;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/HEa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */