import java.util.List;

final class RFa$b
{
  private FVa<dGa.b> a;
  private List<String> b;
  private kRa c;
  
  public RFa$b()
  {
    FVa localFVa = FVa.f(dGa.b.b.a);
    oXa.a(localFVa, "BehaviorSubject.createDefault(Empty)");
    this.a = localFVa;
    this.b = mWa.a();
  }
  
  public final void a()
  {
    this.a.a(dGa.b.b.a);
    this.b = mWa.a();
    kRa localkRa = this.c;
    if (localkRa != null) {
      localkRa.i();
    }
    this.c = null;
  }
  
  public final void a(List<String> paramList)
  {
    oXa.b(paramList, "<set-?>");
    this.b = paramList;
  }
  
  public final void a(kRa paramkRa)
  {
    this.c = paramkRa;
  }
  
  public final List<String> b()
  {
    return this.b;
  }
  
  public final kRa c()
  {
    return this.c;
  }
  
  public final FVa<dGa.b> d()
  {
    return this.a;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/RFa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */