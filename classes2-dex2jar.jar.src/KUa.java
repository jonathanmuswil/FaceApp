public final class kua
  extends gla<lua>
{
  private final String i;
  private Nka j;
  private final String k;
  
  public kua(String paramString)
  {
    this.k = paramString;
    this.i = "AuthForVote";
  }
  
  private final cWa a(lua.b paramb)
  {
    boolean bool = oXa.a(paramb, lua.b.d.a);
    Object localObject = null;
    if (bool)
    {
      f();
      paramb = cWa.a;
    }
    else
    {
      lua locallua;
      if (oXa.a(paramb, lua.b.a.a))
      {
        Kra.b.a();
        locallua = (lua)c();
        paramb = (lua.b)localObject;
        if (locallua != null)
        {
          locallua.i();
          paramb = cWa.a;
        }
      }
      else if (oXa.a(paramb, lua.b.b.a))
      {
        locallua = (lua)c();
        paramb = (lua.b)localObject;
        if (locallua != null)
        {
          locallua.k();
          paramb = cWa.a;
        }
      }
      else
      {
        if (!oXa.a(paramb, lua.b.c.a)) {
          break label154;
        }
        locallua = (lua)c();
        paramb = (lua.b)localObject;
        if (locallua != null)
        {
          locallua.g(this.k);
          paramb = cWa.a;
        }
      }
    }
    return paramb;
    label154:
    throw new UVa();
  }
  
  private final void a(Nka paramNka)
  {
    lua locallua = (lua)c();
    if (locallua != null) {
      locallua.a(new lua.c.a(paramNka.l(), paramNka.n().m()));
    }
  }
  
  private final void f()
  {
    XQa localXQa = doa.c.e(this.k).a(gRa.a()).b(new gua(this));
    oXa.a(localXQa, "NetworkRepository.pollIn…{ view?.bindTo(Loading) }");
    hua localhua = new hua(this);
    a(localXQa, new jua(this), localhua);
  }
  
  public void a(lua paramlua)
  {
    oXa.b(paramlua, "view");
    super.b(paramlua);
    Nka localNka = this.j;
    if (localNka != null) {
      a(localNka);
    } else {
      f();
    }
    gla.a(this, paramlua.getViewActions(), null, null, new fua(this), 3, null);
  }
  
  public String b()
  {
    return this.i;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/kua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */