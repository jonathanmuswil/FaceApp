import java.util.List;

public final class ina
{
  private static kRa b;
  private static final QVa c = RVa.a(dna.b);
  public static final ina d;
  
  static
  {
    rXa localrXa = new rXa(vXa.a(ina.class), "demoImagesSubject", "getDemoImagesSubject()Lio/reactivex/subjects/BehaviorSubject;");
    vXa.a(localrXa);
    a = new XXa[] { localrXa };
    d = new ina();
  }
  
  private final XQa<List<hka>> a(xda paramxda)
  {
    paramxda = paramxda.d().d(_ma.a).a(ana.a).d(bna.a).c(cna.a);
    oXa.a(paramxda, "hostManager.getHost()\n  …s { cacheDemoImages(it) }");
    return RPa.a(paramxda, new Rfa.f[0]);
  }
  
  private final void a(List<hka> paramList)
  {
    Uma.qa.l().set(paramList);
  }
  
  private final FVa<List<hka>> b()
  {
    QVa localQVa = c;
    XXa localXXa = a[0];
    return (FVa)localQVa.getValue();
  }
  
  private final XQa<List<hka>> c()
  {
    Object localObject1 = new xda(null, 1, null);
    Object localObject2 = new uXa();
    ((uXa)localObject2).a = null;
    ((uXa)localObject2).a = new hna((xda)localObject1, (uXa)localObject2);
    localObject1 = a((xda)localObject1);
    localObject2 = ((uXa)localObject2).a;
    if (localObject2 != null)
    {
      localObject2 = ((XQa)localObject1).a((bRa)localObject2);
      oXa.a(localObject2, "demoImagesObservable(hos…ger).compose(transformer)");
      return (XQa<List<hka>>)localObject2;
    }
    oXa.b("transformer");
    throw null;
  }
  
  public final QQa<List<hka>> a()
  {
    if ((!b().v()) && (b == null)) {
      b = c().d(ena.a);
    }
    QQa localQQa = b().e(fna.a);
    oXa.a(localQQa, "demoImagesSubject.map { it.take(3) }");
    return localQQa;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ina.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */