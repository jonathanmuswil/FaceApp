import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class xda
{
  private static final long a = TimeUnit.MINUTES.toMillis(10L);
  private static final QVa b = RVa.a(wda.b);
  private static xda.b c;
  public static final xda.a d = new xda.a(null);
  private List<bfa> e;
  private bfa f;
  private final bfa g;
  
  public xda()
  {
    this(null, 1, null);
  }
  
  public xda(bfa parambfa)
  {
    this.g = parambfa;
  }
  
  private final bfa a(List<bfa> paramList)
  {
    if (paramList.size() == 1) {
      return (bfa)paramList.get(0);
    }
    Object localObject1 = this.g;
    if (localObject1 != null)
    {
      localObject2 = ((bfa)localObject1).component1();
      int i = ((bfa)localObject1).component2();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        localObject1 = localIterator.next();
        bfa localbfa = (bfa)localObject1;
        if ((oXa.a(localbfa.getHost(), localObject2)) && (localbfa.getPort() == i)) {
          j = 1;
        } else {
          j = 0;
        }
        if (j != 0) {
          break label114;
        }
      }
      localObject1 = null;
      label114:
      localObject1 = (bfa)localObject1;
      if (localObject1 != null) {
        return (bfa)localObject1;
      }
    }
    localObject1 = paramList.iterator();
    int j = 0;
    while (((Iterator)localObject1).hasNext()) {
      j += ((bfa)((Iterator)localObject1).next()).getWeight();
    }
    double d1 = Math.random() * j;
    Object localObject2 = paramList.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (bfa)((Iterator)localObject2).next();
      double d2 = d1 - ((bfa)localObject1).getWeight();
      d1 = d2;
      if (d2 <= 0) {
        return (bfa)localObject1;
      }
    }
    asa.d.k("Can't pick host while should be available");
    return (bfa)mWa.e(paramList);
  }
  
  private final void b(List<bfa> paramList)
  {
    icb.a locala = icb.a("HostManager");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("New hosts loaded [server]: ");
    localStringBuilder.append(xda.a.a(d).c());
    localStringBuilder.append(" [hosts count]: ");
    localStringBuilder.append(paramList.size());
    locala.a(localStringBuilder.toString(), new Object[0]);
    Uma.qa.w().set(new Dda(xda.a.a(d).c(), paramList));
    c = new xda.b(paramList, System.currentTimeMillis());
  }
  
  private final XQa<List<bfa>> f()
  {
    Object localObject = this.e;
    if (localObject != null)
    {
      if ((((Collection)localObject).isEmpty() ^ true))
      {
        localObject = XQa.a(localObject);
        oXa.a(localObject, "Single.just(candidates)");
      }
      else
      {
        localObject = XQa.a(new IllegalStateException("All hosts are assumed invalid"));
        oXa.a(localObject, "Single.error(IllegalStat…ts are assumed invalid\"))");
      }
      return (XQa<List<bfa>>)localObject;
    }
    localObject = c;
    if (localObject != null)
    {
      if (!((xda.b)localObject).b()) {
        localObject = null;
      }
      if (localObject != null)
      {
        localObject = ((xda.b)localObject).a();
        icb.a("HostManager").a("Used last loaded hosts response", new Object[0]);
        localObject = XQa.a(localObject);
        if (localObject != null) {
          break label117;
        }
      }
    }
    localObject = g();
    label117:
    localObject = ((XQa)localObject).c(new Ada(this));
    oXa.a(localObject, "hostsSingle.doOnSuccess …didates = ArrayList(it) }");
    return (XQa<List<bfa>>)localObject;
  }
  
  private final XQa<List<bfa>> g()
  {
    XQa localXQa = xda.a.a(d).b().c(new Bda(this)).e(Cda.a).b(EVa.b());
    oXa.a(localXQa, "serverMode.getHosts()\n  …scribeOn(Schedulers.io())");
    return localXQa;
  }
  
  public final bfa c()
  {
    return this.f;
  }
  
  public final XQa<bfa> d()
  {
    XQa localXQa = f().d(new yda(this)).c(new zda(this)).b(EVa.b());
    oXa.a(localXQa, "getHostsList()\n         …scribeOn(Schedulers.io())");
    return localXQa;
  }
  
  public final boolean e()
  {
    bfa localbfa = this.f;
    if (localbfa != null)
    {
      Object localObject = icb.a("HostManager");
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Current host invalidated [host]: ");
      localStringBuilder.append(localbfa);
      ((icb.a)localObject).a(localStringBuilder.toString(), new Object[0]);
      localObject = this.e;
      if (localObject != null) {
        ((List)localObject).remove(localbfa);
      }
      this.f = null;
      return true;
    }
    return false;
  }
  
  public static final class a
  {
    static
    {
      rXa localrXa = new rXa(vXa.a(a.class), "serverMode", "getServerMode()Lio/faceapp/api/ServerMode;");
      vXa.a(localrXa);
      a = new XXa[] { localrXa };
    }
    
    private final Bea a()
    {
      QVa localQVa = xda.b();
      Object localObject = xda.d;
      localObject = a[0];
      return (Bea)localQVa.getValue();
    }
    
    public final xda a(String paramString, int paramInt)
    {
      oXa.b(paramString, "hostName");
      return new xda(new bfa(paramString, paramInt, 1));
    }
  }
  
  private static final class b
  {
    private final List<bfa> a;
    private final long b;
    
    public b(List<bfa> paramList, long paramLong)
    {
      this.a = paramList;
      this.b = paramLong;
    }
    
    public final List<bfa> a()
    {
      return this.a;
    }
    
    public final boolean b()
    {
      boolean bool;
      if (System.currentTimeMillis() - this.b <= xda.a()) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          if (oXa.a(this.a, ((b)paramObject).a))
          {
            int i;
            if (this.b == ((b)paramObject).b) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              break label59;
            }
          }
        }
        return false;
      }
      label59:
      return true;
    }
    
    public int hashCode()
    {
      List localList = this.a;
      int i;
      if (localList != null) {
        i = localList.hashCode();
      } else {
        i = 0;
      }
      long l = this.b;
      return i * 31 + (int)(l ^ l >>> 32);
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("LastLoadedHosts(hosts=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", loadTimestamp=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */