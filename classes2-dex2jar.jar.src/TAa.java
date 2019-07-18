import android.os.Bundle;

public final class tAa
  extends xza<uAa>
{
  private final String j;
  private final FVa<Bundle> k;
  private final FVa<Boolean> l;
  private final Bundle m;
  private final lya.g n;
  
  public tAa(kya paramkya, Bundle paramBundle, lya.g paramg)
  {
    super(paramkya);
    this.m = paramBundle;
    this.n = paramg;
    this.j = "LensBlur";
    paramkya = FVa.f(oya.b(this.m));
    oXa.a(paramkya, "BehaviorSubject.createDe…copyConfig(sourceConfig))");
    this.k = paramkya;
    paramkya = FVa.f(Boolean.valueOf(false));
    oXa.a(paramkya, "BehaviorSubject.createDefault(false)");
    this.l = paramkya;
  }
  
  private final void a(pya parampya)
  {
    Object localObject = (Bundle)this.k.u();
    if (localObject != null)
    {
      localObject = oya.v((Bundle)localObject);
      if (localObject != null)
      {
        localObject = oya.b((Bundle)localObject, parampya);
        break label35;
      }
    }
    localObject = null;
    label35:
    int i;
    if (localObject != null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      a(new uAa.a.b(parampya, 0.5F), true);
    }
  }
  
  private final void a(uAa.a.b paramb, boolean paramBoolean)
  {
    Bundle localBundle = (Bundle)RPa.a(this.k);
    oya.a(oya.v(localBundle), paramb.a(), paramb.b());
    this.l.a(Boolean.valueOf(paramBoolean));
    this.k.a(localBundle);
    paramb = f();
    oXa.a(localBundle, "newConfig");
    paramb.a(localBundle);
  }
  
  private final void a(uAa paramuAa, pya parampya)
  {
    gla.b(this, paramuAa.getViewActions(), null, null, new sAa(this, parampya), 3, null);
  }
  
  private final void b(pya parampya)
  {
    QQa localQQa = this.k.e(new qAa(parampya)).e().a(this.l, yPa.a.c());
    oXa.a(localQQa, "configSub\n        .map {…ub, RxUtils.zipperPair())");
    gla.b(this, localQQa, null, null, new rAa(this, parampya), 3, null);
  }
  
  public void a(uAa paramuAa)
  {
    oXa.b(paramuAa, "view");
    super.b(paramuAa);
    b(this.n.b());
    a(paramuAa, this.n.b());
    paramuAa.a(this.n.a());
  }
  
  public String b()
  {
    return this.j;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tAa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */