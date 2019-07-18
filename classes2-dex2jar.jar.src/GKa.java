import io.faceapp.m;
import io.faceapp.m.a;

public final class gKa
  extends gla<hKa>
{
  private final cWa a(hKa.b paramb)
  {
    boolean bool = oXa.a(paramb, hKa.b.c.a);
    Object localObject1 = null;
    Object localObject2;
    if (bool)
    {
      paramb = (hKa)c();
      localObject2 = localObject1;
      if (paramb != null)
      {
        paramb.X();
        localObject2 = cWa.a;
      }
    }
    else if (oXa.a(paramb, hKa.b.f.a))
    {
      paramb = (hKa)c();
      localObject2 = localObject1;
      if (paramb != null)
      {
        paramb = paramb.getRouter();
        localObject2 = localObject1;
        if (paramb != null)
        {
          paramb.a();
          localObject2 = cWa.a;
        }
      }
    }
    else if (oXa.a(paramb, hKa.b.b.a))
    {
      paramb = (hKa)c();
      localObject2 = localObject1;
      if (paramb != null)
      {
        paramb.O();
        localObject2 = cWa.a;
      }
    }
    else
    {
      Object localObject3;
      if ((paramb instanceof hKa.b.a))
      {
        localObject3 = (hKa)c();
        localObject2 = localObject1;
        if (localObject3 != null)
        {
          localObject3 = ((sla)localObject3).getRouter();
          localObject2 = localObject1;
          if (localObject3 != null)
          {
            m.a.a((m)localObject3, ((hKa.b.a)paramb).a(), pIa.a.c, XDa.b.f.c(), false, 8, null);
            localObject2 = cWa.a;
          }
        }
      }
      else if ((paramb instanceof hKa.b.g))
      {
        localObject3 = (hKa)c();
        localObject2 = localObject1;
        if (localObject3 != null)
        {
          ((hKa)localObject3).i(((hKa.b.g)paramb).a());
          localObject2 = cWa.a;
        }
      }
      else if ((paramb instanceof hKa.b.h))
      {
        localObject3 = (hKa)c();
        localObject2 = localObject1;
        if (localObject3 != null)
        {
          ((hKa)localObject3).j(((hKa.b.h)paramb).a());
          localObject2 = cWa.a;
        }
      }
      else if ((paramb instanceof hKa.b.e))
      {
        localObject3 = (hKa)c();
        localObject2 = localObject1;
        if (localObject3 != null)
        {
          paramb = (hKa.b.e)paramb;
          ((hKa)localObject3).b(paramb.b(), paramb.a());
          localObject2 = cWa.a;
        }
      }
      else
      {
        if (!(paramb instanceof hKa.b.d)) {
          break label399;
        }
        localObject3 = (hKa)c();
        localObject2 = localObject1;
        if (localObject3 != null)
        {
          ((hKa)localObject3).k(((hKa.b.d)paramb).a());
          localObject2 = cWa.a;
        }
      }
    }
    return (cWa)localObject2;
    label399:
    throw new UVa();
  }
  
  public void a(hKa paramhKa)
  {
    oXa.b(paramhKa, "view");
    super.b(paramhKa);
    QQa localQQa = QQa.a(Uma.qa.c().b().e(dKa.a), Uma.qa.ma().b(), yPa.a.c());
    oXa.a(localQQa, "Observable.combineLatest…    RxUtils.zipperPair())");
    gla.b(this, localQQa, null, null, new eKa(paramhKa), 3, null);
    gla.a(this, paramhKa.getViewActions(), null, null, new fKa(this), 3, null);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/gKa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */