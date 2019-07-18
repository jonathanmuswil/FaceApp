import java.util.HashMap;

public abstract class qIa<V extends sIa, P extends rIa<V>>
  extends ala<V, P>
  implements sIa
{
  private final boolean la;
  private final GVa<JDa> ma;
  private final GVa<XDa.a> na;
  private final GVa<Rva.a> oa;
  private HashMap pa;
  
  public qIa()
  {
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.ma = localGVa;
    localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.na = localGVa;
    localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.oa = localGVa;
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.pa;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public boolean Qb()
  {
    return this.la;
  }
  
  public GVa<Rva.a> b()
  {
    return this.oa;
  }
  
  public GVa<XDa.a> cc()
  {
    return this.na;
  }
  
  public GVa<JDa> dc()
  {
    return this.ma;
  }
  
  public void e()
  {
    throw new IllegalStateException("Sharing is not supported for current fragment");
  }
  
  public void i(boolean paramBoolean)
  {
    z(paramBoolean);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/qIa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */