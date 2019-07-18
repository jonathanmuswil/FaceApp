import android.content.Context;

public final class ywa
  extends gla<Awa>
{
  private final wwa i;
  
  public ywa(wwa paramwwa)
  {
    this.i = paramwwa;
  }
  
  private final void a(Awa.a parama)
  {
    if ((parama instanceof Awa.a.a))
    {
      b(((Awa.a.a)parama).a());
    }
    else
    {
      if (!(parama instanceof Awa.a.b)) {
        break label40;
      }
      c(((Awa.a.b)parama).a());
    }
    return;
    label40:
    throw new UVa();
  }
  
  private final void b(String paramString)
  {
    Object localObject = (Awa)c();
    if (localObject != null)
    {
      localObject = ((Awa)localObject).h();
      if (localObject != null)
      {
        paramString = zwa.a.a((Context)localObject, paramString, this.i, zia.l.b(), h(), i());
        if (paramString == null)
        {
          paramString = (Awa)c();
          if (paramString != null) {
            paramString.Y();
          }
          return;
        }
        ((Context)localObject).startActivity(paramString);
      }
    }
  }
  
  private final void c(String paramString)
  {
    f().set(paramString);
  }
  
  private final Hm<String> f()
  {
    Hm localHm;
    if (this.i.d()) {
      localHm = Uma.qa.p();
    } else {
      localHm = Uma.qa.q();
    }
    return localHm;
  }
  
  private final String g()
  {
    Object localObject = f().get();
    oXa.a(localObject, "draftPreference().get()");
    return (String)localObject;
  }
  
  private final boolean h()
  {
    return true;
  }
  
  private final boolean i()
  {
    return this.i.d();
  }
  
  public void a(Awa paramAwa)
  {
    oXa.b(paramAwa, "view");
    super.b(paramAwa);
    paramAwa.a(new Awa.b.a(g(), this.i));
    gla.a(this, paramAwa.getViewActions(), null, null, new xwa(this), 3, null);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/ywa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */