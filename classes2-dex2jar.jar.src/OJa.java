import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class oJa
  extends VIa<qJa>
{
  private final String i;
  private List<Mka> j;
  private kRa k;
  private final pJa l;
  
  public oJa(pJa parampJa)
  {
    this.l = parampJa;
    this.i = "PollsFeed";
  }
  
  private final cWa a(XIa.c paramc)
  {
    if (oXa.a(paramc, XIa.c.c.a))
    {
      a(true);
      paramc = cWa.a;
    }
    else if (oXa.a(paramc, XIa.c.d.a))
    {
      a(false);
      paramc = cWa.a;
    }
    else if ((paramc instanceof XIa.c.a))
    {
      qJa localqJa = (qJa)c();
      if (localqJa != null)
      {
        localqJa.c(((XIa.c.a)paramc).a().s());
        paramc = cWa.a;
      }
      else
      {
        paramc = null;
      }
    }
    else
    {
      if (!(paramc instanceof XIa.c.b)) {
        break label120;
      }
      icb.a(b()).a("PollMenuClick: not implemented for now", new Object[0]);
      paramc = cWa.a;
    }
    return paramc;
    label120:
    throw new UVa();
  }
  
  private final void a(Mka paramMka)
  {
    Object localObject = ((fka)Uma.qa.c().get()).b().e();
    boolean bool = oXa.a(paramMka.t().n(), localObject);
    int m;
    if ((!bool) && (paramMka.p() == null)) {
      m = 1;
    } else {
      m = 0;
    }
    if ((!bool) && (m != 0)) {
      paramMka = new qJa.b.c(paramMka.m());
    } else {
      paramMka = new qJa.b.b(paramMka.m());
    }
    localObject = (qJa)c();
    if (localObject != null)
    {
      localObject = ((qJa)localObject).v();
      if (localObject != null) {
        ((VQa)localObject).a(paramMka);
      }
    }
  }
  
  private final void a(String paramString, Rka paramRka)
  {
    Object localObject1 = this.j;
    if (localObject1 != null)
    {
      ArrayList localArrayList1 = new ArrayList(mWa.a((Iterable)localObject1, 10));
      Iterator localIterator1 = ((Iterable)localObject1).iterator();
      while (localIterator1.hasNext())
      {
        localObject1 = (Mka)localIterator1.next();
        if (!(oXa.a(((Mka)localObject1).m(), paramString) ^ true))
        {
          List localList = mWa.a(((Mka)localObject1).q(), paramRka);
          Object localObject2 = ((Mka)localObject1).u();
          ArrayList localArrayList2 = new ArrayList(mWa.a((Iterable)localObject2, 10));
          Iterator localIterator2 = ((Iterable)localObject2).iterator();
          int m = 0;
          while (localIterator2.hasNext())
          {
            localObject2 = localIterator2.next();
            if (m >= 0)
            {
              int n = ((Number)localObject2).intValue();
              int i1 = n;
              if (m == paramRka.l()) {
                i1 = n + 1;
              }
              localArrayList2.add(Integer.valueOf(i1));
              m++;
            }
            else
            {
              mWa.c();
              throw null;
            }
          }
          localObject1 = Mka.a((Mka)localObject1, null, null, null, false, null, null, null, localList, localArrayList2, ((Mka)localObject1).r() + 1, paramRka, false, 2175, null);
        }
        localArrayList1.add(localObject1);
      }
      this.j = localArrayList1;
      a(this, localArrayList1, false, 2, null);
    }
  }
  
  private final void a(List<Mka> paramList, boolean paramBoolean)
  {
    qJa localqJa = (qJa)c();
    if (localqJa != null)
    {
      if (paramList.isEmpty())
      {
        paramList = XIa.d.b.a;
      }
      else
      {
        String str = ((fka)Uma.qa.c().get()).b().e();
        ArrayList localArrayList1 = new ArrayList(mWa.a(paramList, 10));
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          Mka localMka = (Mka)paramList.next();
          boolean bool = oXa.a(localMka.t().n(), str);
          int m;
          if ((!bool) && (localMka.p() == null)) {
            m = 1;
          } else {
            m = 0;
          }
          ArrayList localArrayList2 = new ArrayList();
          localArrayList2.add(new LIa.a(localMka));
          localArrayList2.add(new LIa.d(localMka, m ^ 0x1));
          if (m != 0)
          {
            localArrayList2.add(new LIa.i(localMka));
          }
          else
          {
            localArrayList2.add(new LIa.f(localMka));
            Object localObject = localMka.q();
            ArrayList localArrayList3 = new ArrayList(mWa.a((Iterable)localObject, 10));
            localObject = ((Iterable)localObject).iterator();
            while (((Iterator)localObject).hasNext()) {
              localArrayList3.add(new LIa.b((Rka)((Iterator)localObject).next()));
            }
            localArrayList2.addAll(localArrayList3);
            if (localMka.r() > localMka.q().size()) {
              localArrayList2.add(new LIa.h(localMka));
            }
            localArrayList2.add(new LIa.e(localMka, bool ^ true));
          }
          localArrayList1.add(localArrayList2);
        }
        paramList = new XIa.d.a(mWa.a(localArrayList1), paramBoolean);
      }
      localqJa.a(paramList);
    }
  }
  
  private final void a(qJa.a parama)
  {
    if ((parama instanceof qJa.a.a))
    {
      a(((qJa.a.a)parama).a());
    }
    else if ((parama instanceof qJa.a.c))
    {
      parama = (qJa.a.c)parama;
      a(parama.b(), parama.a());
    }
    else
    {
      if (!(parama instanceof qJa.a.b)) {
        break label67;
      }
      b(((qJa.a.b)parama).a());
    }
    return;
    label67:
    throw new UVa();
  }
  
  private final void a(boolean paramBoolean)
  {
    Object localObject = this.k;
    if (localObject != null) {
      ((kRa)localObject).i();
    }
    if (!paramBoolean)
    {
      localObject = (qJa)c();
      if (localObject != null) {
        ((jta)localObject).a(XIa.d.c.a);
      }
    }
    XQa localXQa = f();
    localObject = new lJa(this, paramBoolean);
    this.k = b(localXQa, new nJa(this), (cXa)localObject);
  }
  
  private final void b(String paramString)
  {
    Object localObject1 = this.j;
    if (localObject1 != null)
    {
      ArrayList localArrayList = new ArrayList();
      localObject1 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = ((Iterator)localObject1).next();
        if ((oXa.a(((Mka)localObject2).m(), paramString) ^ true)) {
          localArrayList.add(localObject2);
        }
      }
      this.j = localArrayList;
      a(this, localArrayList, false, 2, null);
    }
  }
  
  private final XQa<Qka> f()
  {
    Object localObject = this.l;
    int m = eJa.a[localObject.ordinal()];
    if (m != 1)
    {
      if (m == 2) {
        localObject = doa.b(doa.c, 0, 0, 3, null);
      } else {
        throw new UVa();
      }
    }
    else {
      localObject = doa.c(doa.c, 0, 0, 3, null);
    }
    return (XQa<Qka>)localObject;
  }
  
  public void a(qJa paramqJa)
  {
    oXa.b(paramqJa, "view");
    super.b(paramqJa);
    Object localObject = this.j;
    if (localObject != null)
    {
      a(this, (List)localObject, false, 2, null);
    }
    else
    {
      localObject = Uma.qa.c().b().e(gJa.a).a(hJa.a).h().a(gRa.a()).b(new fJa(paramqJa));
      oXa.a(localObject, "AppPreferences.authUserC… { view.bindTo(Loading) }");
      gla.a(this, (XQa)localObject, null, new iJa(this), 1, null);
    }
    gla.a(this, paramqJa.getViewActions(), null, null, new jJa(this), 3, null);
    gla.a(this, paramqJa.A(), null, null, new kJa(this), 3, null);
  }
  
  public String b()
  {
    return this.i;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/oJa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */