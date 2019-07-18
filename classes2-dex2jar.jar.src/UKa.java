import io.faceapp.m;

public final class uKa
  extends gla<vKa>
{
  private final String i = "RateUs";
  private vKa.b j = vKa.b.a.a;
  private Integer k;
  private String l = "";
  private boolean m;
  private boolean n = true;
  
  private final void a(int paramInt)
  {
    Object localObject1 = icb.a(b());
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("onRateClicked [rating]: ");
    ((StringBuilder)localObject2).append(paramInt);
    ((icb.a)localObject1).a(((StringBuilder)localObject2).toString(), new Object[0]);
    asa.d.i("Any star clicked");
    this.k = Integer.valueOf(paramInt);
    if (paramInt < 5) {
      localObject1 = new vKa.b.b(paramInt);
    } else {
      localObject1 = new vKa.b.c(paramInt);
    }
    if ((localObject1 instanceof vKa.b.b)) {
      asa.d.i("Feedback field shown");
    }
    this.j = ((vKa.b)localObject1);
    localObject2 = (vKa)c();
    if (localObject2 != null) {
      ((jta)localObject2).a(localObject1);
    }
  }
  
  private final void a(vKa.a parama)
  {
    if (oXa.a(parama, vKa.a.b.a))
    {
      asa.d.i("Dismiss: button");
      a(false);
    }
    else if (oXa.a(parama, vKa.a.a.a))
    {
      asa.d.i("Dismiss: back");
      a(false);
    }
    else if (oXa.a(parama, vKa.a.f.a))
    {
      g();
    }
    else if (oXa.a(parama, vKa.a.d.a))
    {
      f();
    }
    else if ((parama instanceof vKa.a.e))
    {
      a(((vKa.a.e)parama).a());
    }
    else
    {
      if (!(parama instanceof vKa.a.c)) {
        break label126;
      }
      b(((vKa.a.c)parama).a());
    }
    return;
    label126:
    throw new UVa();
  }
  
  private final void a(boolean paramBoolean)
  {
    Object localObject = this.k;
    if (localObject != null)
    {
      int i1 = ((Integer)localObject).intValue();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Rating ");
      localStringBuilder.append(i1);
      localStringBuilder.append(", ");
      if (paramBoolean) {
        localObject = "sent";
      } else {
        localObject = "unsent";
      }
      localStringBuilder.append((String)localObject);
      localObject = localStringBuilder.toString();
      asa.d.i((String)localObject);
      if (this.m) {
        asa.d.i("Feedback was modified");
      }
      dsa.a.a(i1, this.l);
    }
    else
    {
      dsa.a.b();
    }
    localObject = (vKa)c();
    if (localObject != null) {
      ((vKa)localObject).ca();
    }
  }
  
  private final void b(String paramString)
  {
    boolean bool1 = this.m;
    boolean bool2;
    if (paramString.length() > 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.m = (bool1 | bool2);
    this.l = paramString;
  }
  
  private final void f()
  {
    Object localObject = icb.a(b());
    boolean bool1 = false;
    ((icb.a)localObject).a("onOpenGooglePlay", new Object[0]);
    asa.d.i("Rate in store clicked");
    localObject = (vKa)c();
    boolean bool2 = bool1;
    if (localObject != null)
    {
      localObject = ((sla)localObject).getRouter();
      bool2 = bool1;
      if (localObject != null) {
        bool2 = ((m)localObject).g();
      }
    }
    if (bool2) {
      asa.d.a();
    }
    a(true);
  }
  
  private final void g()
  {
    icb.a locala = icb.a(b());
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("onSubmitReview [rating]: ");
    ((StringBuilder)localObject).append(this.k);
    ((StringBuilder)localObject).append(" [comment]: ");
    ((StringBuilder)localObject).append(this.l);
    locala.a(((StringBuilder)localObject).toString(), new Object[0]);
    asa.d.i("Submit feedback clicked");
    localObject = (vKa)c();
    if (localObject != null) {
      ((vKa)localObject).aa();
    }
    a(true);
  }
  
  public void a(vKa paramvKa)
  {
    oXa.b(paramvKa, "view");
    super.b(paramvKa);
    if (this.n)
    {
      asa.d.i("Shown");
      dsa.a.c();
      this.n = false;
    }
    paramvKa.a(this.j);
    gla.a(this, paramvKa.getViewActions(), null, null, new tKa(this), 3, null);
  }
  
  public String b()
  {
    return this.i;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/uKa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */