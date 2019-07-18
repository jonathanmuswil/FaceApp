import io.faceapp.m;
import io.faceapp.m.a;
import io.faceapp.ui.misc.c.a;
import java.util.List;

public final class rFa
  extends gla<sFa>
{
  private final String i;
  public sFa.a j;
  public KDa k;
  private Eda l;
  private kRa m;
  private final List<Eda> n;
  private final Eda o;
  private final boolean p;
  
  public rFa(List<Eda> paramList, Eda paramEda, boolean paramBoolean)
  {
    this.n = paramList;
    this.o = paramEda;
    this.p = paramBoolean;
    this.i = "FilterSelector";
  }
  
  private final cWa a(sFa.b paramb)
  {
    boolean bool = oXa.a(paramb, sFa.b.a.a);
    cWa localcWa = null;
    Object localObject;
    if (bool)
    {
      localObject = this.j;
      if (localObject != null)
      {
        paramb = this.k;
        if (paramb != null)
        {
          ((sFa.a)localObject).a(paramb);
          paramb = (sFa)c();
          if (paramb != null)
          {
            paramb.dismiss();
            localcWa = cWa.a;
          }
        }
        else
        {
          oXa.b("target");
          throw null;
        }
      }
      else
      {
        oXa.b("resultListener");
        throw null;
      }
    }
    else if (oXa.a(paramb, sFa.b.f.a))
    {
      paramb = this.l;
      if (paramb != null)
      {
        a(paramb);
        localcWa = cWa.a;
      }
      else
      {
        oXa.b("selectedPhoto");
        throw null;
      }
    }
    else if ((paramb instanceof sFa.b.g))
    {
      a(((sFa.b.g)paramb).a());
      localcWa = cWa.a;
    }
    else if ((paramb instanceof sFa.b.b))
    {
      localObject = this.j;
      if (localObject != null)
      {
        KDa localKDa = this.k;
        if (localKDa != null)
        {
          Eda localEda = this.l;
          if (localEda != null)
          {
            ((sFa.a)localObject).a(localKDa, localEda, ((sFa.b.b)paramb).a());
            paramb = (sFa)c();
            if (paramb != null)
            {
              paramb.dismiss();
              localcWa = cWa.a;
            }
          }
          else
          {
            oXa.b("selectedPhoto");
            throw null;
          }
        }
        else
        {
          oXa.b("target");
          throw null;
        }
      }
      else
      {
        oXa.b("resultListener");
        throw null;
      }
    }
    else if ((paramb instanceof sFa.b.e))
    {
      localObject = (sFa)c();
      if (localObject != null)
      {
        ((sFa)localObject).a(((sFa.b.e)paramb).a());
        localcWa = cWa.a;
      }
    }
    else if ((paramb instanceof sFa.b.c))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("FilterSelector, filter: ");
      ((StringBuilder)localObject).append(((sFa.b.c)paramb).a().b());
      paramb = ((StringBuilder)localObject).toString();
      localObject = (sFa)c();
      if (localObject != null)
      {
        localObject = ((sla)localObject).getRouter();
        if (localObject != null) {
          m.a.a((m)localObject, paramb, false, 2, null);
        }
      }
      paramb = (sFa)c();
      if (paramb != null)
      {
        paramb.dismiss();
        localcWa = cWa.a;
      }
    }
    else
    {
      if (!(paramb instanceof sFa.b.d)) {
        break label422;
      }
      a(((sFa.b.d)paramb).a());
      localcWa = cWa.a;
    }
    return localcWa;
    label422:
    throw new UVa();
  }
  
  private final List<zka> a(Eda paramEda, KDa paramKDa)
  {
    paramEda = paramKDa.a(paramEda.c());
    return Aka.a.b(paramEda);
  }
  
  private final void a(Eda paramEda)
  {
    Object localObject1 = this.m;
    if (localObject1 != null) {
      ((kRa)localObject1).i();
    }
    this.l = paramEda;
    Object localObject2 = this.l;
    if (localObject2 != null)
    {
      localObject1 = this.k;
      if (localObject1 != null)
      {
        localObject2 = a((Eda)localObject2, (KDa)localObject1);
        localObject1 = zia.l.d();
        paramEda = new oFa(this, paramEda, (List)localObject2);
        this.m = gla.b(this, (QQa)localObject1, new qFa(this), null, paramEda, 2, null);
        return;
      }
      oXa.b("target");
      throw null;
    }
    oXa.b("selectedPhoto");
    throw null;
  }
  
  private final void a(c.a parama)
  {
    sFa localsFa = (sFa)c();
    if (localsFa != null)
    {
      List localList = this.n;
      Eda localEda = this.l;
      if (localEda != null)
      {
        KDa localKDa = this.k;
        if (localKDa != null)
        {
          localsFa.a(new sFa.c.b(localList, localEda, localKDa, parama));
        }
        else
        {
          oXa.b("target");
          throw null;
        }
      }
      else
      {
        oXa.b("selectedPhoto");
        throw null;
      }
    }
  }
  
  public final void a(KDa paramKDa)
  {
    oXa.b(paramKDa, "<set-?>");
    this.k = paramKDa;
  }
  
  public final void a(sFa.a parama)
  {
    oXa.b(parama, "<set-?>");
    this.j = parama;
  }
  
  public void a(sFa paramsFa)
  {
    oXa.b(paramsFa, "view");
    super.b(paramsFa);
    paramsFa.c(this.p);
    Eda localEda = this.o;
    if (localEda == null) {
      localEda = (Eda)mWa.g(this.n);
    }
    this.l = localEda;
    localEda = this.l;
    if (localEda != null)
    {
      a(localEda);
      gla.a(this, paramsFa.getViewActions(), null, null, new nFa(this), 3, null);
      return;
    }
    oXa.b("selectedPhoto");
    throw null;
  }
  
  public String b()
  {
    return this.i;
  }
  
  public void b(sFa paramsFa)
  {
    oXa.b(paramsFa, "view");
    kRa localkRa = this.m;
    if (localkRa != null) {
      localkRa.i();
    }
    super.a(paramsFa);
  }
  
  public final KDa f()
  {
    KDa localKDa = this.k;
    if (localKDa != null) {
      return localKDa;
    }
    oXa.b("target");
    throw null;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/rFa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */