import java.util.ArrayList;

public final class oOa
  extends gla<yOa>
{
  @Deprecated
  public static final oOa.a i = new oOa.a(null);
  private final String j;
  private Nka k;
  private Integer l;
  private Mka m;
  private ArrayList<String> n;
  private String o;
  private final String p;
  private final yOa.d q;
  
  public oOa(String paramString, yOa.d paramd)
  {
    this.p = paramString;
    this.q = paramd;
    this.j = "Voting";
  }
  
  private final cWa a(yOa.b paramb)
  {
    boolean bool = oXa.a(paramb, yOa.b.e.a);
    String str = null;
    if (bool)
    {
      h();
      paramb = cWa.a;
    }
    else if (oXa.a(paramb, yOa.b.g.a))
    {
      paramb = this.l;
      if (paramb != null)
      {
        b(paramb.intValue());
        paramb = cWa.a;
      }
      else
      {
        throw new IllegalArgumentException("Required value was null.");
      }
    }
    else
    {
      yOa localyOa;
      if (oXa.a(paramb, yOa.b.d.a))
      {
        localyOa = (yOa)c();
        paramb = str;
        if (localyOa != null)
        {
          localyOa.I();
          paramb = cWa.a;
        }
      }
      else if (oXa.a(paramb, yOa.b.a.a))
      {
        localyOa = (yOa)c();
        paramb = str;
        if (localyOa != null)
        {
          str = this.o;
          if (str != null)
          {
            paramb = this.n;
            if (paramb != null)
            {
              localyOa.a(str, paramb);
              paramb = cWa.a;
            }
            else
            {
              oXa.b("suggestedComments");
              throw null;
            }
          }
          else
          {
            oXa.b("commentText");
            throw null;
          }
        }
      }
      else if ((paramb instanceof yOa.b.f))
      {
        a(((yOa.b.f)paramb).a());
        paramb = cWa.a;
      }
      else if ((paramb instanceof yOa.b.b))
      {
        this.o = ((yOa.b.b)paramb).a();
        g();
        paramb = cWa.a;
      }
      else
      {
        if (!(paramb instanceof yOa.b.c)) {
          break label356;
        }
        if ((!((yOa.b.c)paramb).a()) && (this.l != null))
        {
          localyOa = (yOa)c();
          paramb = str;
          if (localyOa != null)
          {
            localyOa.j();
            paramb = cWa.a;
          }
        }
        else
        {
          if (this.q != null)
          {
            localyOa = (yOa)c();
            paramb = str;
            if (localyOa == null) {
              break label354;
            }
            localyOa.dismiss();
          }
          else
          {
            localyOa = (yOa)c();
            paramb = str;
            if (localyOa == null) {
              break label354;
            }
            localyOa.i();
          }
          paramb = cWa.a;
        }
      }
    }
    label354:
    return paramb;
    label356:
    throw new UVa();
  }
  
  private final void a(int paramInt)
  {
    this.l = Integer.valueOf(paramInt);
    g();
  }
  
  private final void b(int paramInt)
  {
    Object localObject1 = doa.c;
    Object localObject2 = this.m;
    if (localObject2 != null)
    {
      localObject2 = ((Mka)localObject2).m();
      String str = this.o;
      if (str != null)
      {
        localObject2 = ((doa)localObject1).a((String)localObject2, paramInt, str).a(gRa.a()).b(new uOa(this)).a(new vOa(this));
        oXa.a(localObject2, "NetworkRepository.submit…iew?.showLoading(false) }");
        localObject1 = new wOa(this);
        a((XQa)localObject2, new xOa(this), (cXa)localObject1);
        return;
      }
      oXa.b("commentText");
      throw null;
    }
    oXa.b("poll");
    throw null;
  }
  
  private final void g()
  {
    Object localObject = this.m;
    if (localObject != null)
    {
      if (((Mka)localObject).p() != null)
      {
        localObject = yOa.c.a.a;
      }
      else
      {
        localObject = this.l;
        if (localObject != null)
        {
          int i1 = ((Integer)localObject).intValue();
          localObject = this.o;
          if (localObject != null)
          {
            localObject = new yOa.c.e(i1, (String)localObject);
          }
          else
          {
            oXa.b("commentText");
            throw null;
          }
        }
        else
        {
          localObject = yOa.c.d.a;
        }
      }
      yOa localyOa = (yOa)c();
      if (localyOa != null) {
        localyOa.a(localObject);
      }
      return;
    }
    oXa.b("poll");
    throw null;
  }
  
  private final void h()
  {
    XQa localXQa = doa.c.e(this.p).a(gRa.a()).b(new qOa(this));
    oXa.a(localXQa, "NetworkRepository.pollIn…{ view?.bindTo(Loading) }");
    rOa localrOa = new rOa(this);
    a(localXQa, new tOa(this), localrOa);
  }
  
  private final void i()
  {
    Object localObject = this.m;
    if (localObject != null)
    {
      if (oXa.a(((Mka)localObject).t().n(), ((fka)Uma.qa.c().get()).b().e()))
      {
        localObject = (yOa)c();
        if (localObject != null) {
          ((yOa)localObject).f(this.p);
        }
      }
      else
      {
        localObject = this.m;
        if (localObject == null) {
          break label158;
        }
        if ((((Mka)localObject).p() != null) && (this.q == null))
        {
          localObject = (yOa)c();
          if (localObject != null) {
            ((yOa)localObject).f(this.p);
          }
        }
        else
        {
          localObject = (yOa)c();
          if (localObject != null)
          {
            Mka localMka = this.m;
            if (localMka != null)
            {
              ((yOa)localObject).a(localMka);
            }
            else
            {
              oXa.b("poll");
              throw null;
            }
          }
          g();
        }
      }
      return;
      label158:
      oXa.b("poll");
      throw null;
    }
    oXa.b("poll");
    throw null;
  }
  
  public void a(yOa paramyOa)
  {
    oXa.b(paramyOa, "view");
    super.b(paramyOa);
    if (this.k != null)
    {
      Mka localMka = this.m;
      if (localMka != null)
      {
        paramyOa.a(localMka);
        g();
      }
      else
      {
        oXa.b("poll");
        throw null;
      }
    }
    else
    {
      h();
    }
    gla.a(this, paramyOa.getViewActions(), null, null, new pOa(this), 3, null);
  }
  
  public String b()
  {
    return this.j;
  }
  
  private static final class a {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/oOa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */