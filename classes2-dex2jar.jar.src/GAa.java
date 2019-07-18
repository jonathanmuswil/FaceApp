import android.graphics.Bitmap;
import android.os.Bundle;

public final class gAa
  extends xza<hAa>
{
  private final String j;
  private final FVa<Bundle> k;
  private final FVa<String> l;
  private final yza<tka> m;
  private hAa.a n;
  private final Bundle o;
  private final rka p;
  private final QQa<Bitmap> q;
  private final boolean r;
  
  public gAa(kya paramkya, Bundle paramBundle, rka paramrka, QQa<Bitmap> paramQQa, boolean paramBoolean)
  {
    super(paramkya);
    this.o = paramBundle;
    this.p = paramrka;
    this.q = paramQQa;
    this.r = paramBoolean;
    this.j = "Effect";
    paramkya = FVa.t();
    oXa.a(paramkya, "BehaviorSubject.create<Bundle>()");
    this.k = paramkya;
    paramkya = FVa.t();
    oXa.a(paramkya, "BehaviorSubject.create<String>()");
    this.l = paramkya;
    this.m = new yza();
    paramkya = oya.b(this.o);
    paramBundle = oya.j(oya.c(paramkya));
    this.k.a(paramkya);
    this.l.a(paramBundle);
  }
  
  private final hAa.a a(Bitmap paramBitmap, boolean paramBoolean1, boolean paramBoolean2, rka paramrka)
  {
    hAa.a locala = this.n;
    if ((locala != null) && (locala.d() == paramBoolean1)) {
      return locala;
    }
    paramBitmap = new hAa.a(paramBitmap, paramBoolean1, paramBoolean2, paramrka);
    this.n = paramBitmap;
    return paramBitmap;
  }
  
  private final void a(hAa.b.d paramd)
  {
    Bundle localBundle = (Bundle)RPa.a(this.k);
    oya.a(oya.c(localBundle), paramd.a(), paramd.b());
    this.k.a(localBundle);
    paramd = f();
    oXa.a(localBundle, "newConfig");
    paramd.a(localBundle);
  }
  
  private final void a(hAa paramhAa, hAa.b.a parama)
  {
    Bundle localBundle = (Bundle)RPa.a(this.k);
    oya.c(oya.c(localBundle), parama.a().a());
    this.l.a(parama.a().a());
    this.k.a(localBundle);
    parama = f();
    oXa.a(localBundle, "newConfig");
    parama.a(localBundle);
    this.m.a(paramhAa, null);
  }
  
  private final void a(hAa paramhAa, hAa.b.b paramb)
  {
    this.l.a(paramb.a().a());
    this.m.a(paramhAa, paramb.a());
  }
  
  private final void a(hAa paramhAa, hAa.b.c paramc)
  {
    Bundle localBundle = (Bundle)RPa.a(this.k);
    oya.c(oya.c(localBundle), "");
    this.l.a("");
    this.k.a(localBundle);
    paramc = f();
    oXa.a(localBundle, "newConfig");
    paramc.a(localBundle);
    this.m.a(paramhAa, null);
  }
  
  private final void a(rka paramrka, QQa<Bitmap> paramQQa)
  {
    paramQQa = QQa.a(paramQQa, zia.l.d(), this.l.e(), yPa.a.e());
    oXa.a(paramQQa, "Observable.combineLatest….zipperTriple()\n        )");
    gla.b(this, paramQQa, null, null, new _za(this, paramrka), 3, null);
  }
  
  private final void b(hAa paramhAa)
  {
    QQa localQQa = zia.l.d().a(cAa.a);
    oXa.a(localQQa, "BillingRepository.observeIsPro().filter { it }");
    gla.b(this, localQQa, null, null, new eAa(this, paramhAa), 3, null);
  }
  
  private final void c(hAa paramhAa)
  {
    gla.b(this, paramhAa.getViewActions(), null, null, new fAa(this, paramhAa), 3, null);
  }
  
  private final void g()
  {
    QQa localQQa = this.k.e(aAa.a).e();
    oXa.a(localQQa, "configSub.map { it.effec… }.distinctUntilChanged()");
    gla.b(this, localQQa, null, null, new bAa(this), 3, null);
  }
  
  public void a(hAa paramhAa)
  {
    oXa.b(paramhAa, "view");
    super.b(paramhAa);
    b(paramhAa);
    g();
    a(this.p, this.q);
    c(paramhAa);
    paramhAa.a(this.p);
  }
  
  public String b()
  {
    return this.j;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/gAa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */