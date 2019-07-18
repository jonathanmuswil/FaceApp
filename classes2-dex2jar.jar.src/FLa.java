import java.util.List;

public final class fLa
  extends gla<gLa>
  implements ULa
{
  private final FVa<List<String>> i;
  private final PKa j;
  
  public fLa()
  {
    FVa localFVa = FVa.f(mWa.a(new String[] { "default" }));
    oXa.a(localFVa, "BehaviorSubject.createDe…t(arrayListOf(\"default\"))");
    this.i = localFVa;
    this.j = new PKa(this);
  }
  
  private final void b(String paramString)
  {
    List localList = (List)RPa.a(this.i);
    localList.add(paramString);
    this.i.a(localList);
  }
  
  private final void f()
  {
    List localList = (List)RPa.a(this.i);
    localList.remove(localList.size() - 1);
    this.i.a(localList);
  }
  
  public void a(gLa paramgLa)
  {
    oXa.b(paramgLa, "view");
    super.b(paramgLa);
    QQa localQQa = QQa.d(this.i.e(new cLa(this)));
    oXa.a(localQQa, "Observable.switchOnNext(…tElementSet(it.last()) })");
    gla.b(this, localQQa, null, null, new dLa(paramgLa), 3, null);
    gla.a(this, paramgLa.xa(), null, null, new eLa(this, paramgLa), 3, null);
  }
  
  public void a(String paramString)
  {
    oXa.b(paramString, "submenuKey");
    b(paramString);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fLa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */