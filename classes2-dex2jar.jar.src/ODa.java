import android.graphics.Bitmap;
import android.os.Bundle;

public final class oDa
  extends xza<pDa>
{
  private final String j;
  private final FVa<Bundle> k;
  private final FVa<String> l;
  private final yza<Kka> m;
  private pDa.a n;
  private final Bundle o;
  private final rka p;
  private final QQa<Bitmap> q;
  private final boolean r;
  
  public oDa(kya paramkya, Bundle paramBundle, rka paramrka, QQa<Bitmap> paramQQa, boolean paramBoolean)
  {
    super(paramkya);
    this.o = paramBundle;
    this.p = paramrka;
    this.q = paramQQa;
    this.r = paramBoolean;
    this.j = "Tatoo";
    paramkya = FVa.t();
    oXa.a(paramkya, "BehaviorSubject.create<Bundle>()");
    this.k = paramkya;
    paramkya = FVa.t();
    oXa.a(paramkya, "BehaviorSubject.create<String>()");
    this.l = paramkya;
    this.m = new yza();
    paramBundle = oya.b(this.o);
    paramkya = oya.p(oya.u(paramBundle));
    this.k.a(paramBundle);
    this.l.a(paramkya);
  }
  
  private final pDa.a a(Bitmap paramBitmap, boolean paramBoolean, rka paramrka)
  {
    pDa.a locala = this.n;
    if ((locala != null) && (locala.d() == paramBoolean)) {
      return locala;
    }
    paramBitmap = new pDa.a(paramBitmap, paramBoolean, paramrka, this.r);
    this.n = paramBitmap;
    return paramBitmap;
  }
  
  private final void a(pDa.b.d paramd)
  {
    Bundle localBundle = (Bundle)RPa.a(this.k);
    oya.a(oya.u(localBundle), paramd.a(), paramd.b());
    this.k.a(localBundle);
    paramd = f();
    oXa.a(localBundle, "newConfig");
    paramd.a(localBundle);
  }
  
  private final void a(pDa parampDa, pDa.b.a parama)
  {
    this.l.a(parama.a().b());
    this.m.a(parampDa, parama.a());
  }
  
  private final void a(pDa parampDa, pDa.b.b paramb)
  {
    paramb = (Bundle)RPa.a(this.k);
    oya.f(oya.u(paramb), "");
    this.l.a("");
    this.k.a(paramb);
    kya localkya = f();
    oXa.a(paramb, "newConfig");
    localkya.a(paramb);
    this.m.a(parampDa, null);
  }
  
  private final void a(pDa parampDa, pDa.b.c paramc)
  {
    Bundle localBundle = (Bundle)RPa.a(this.k);
    oya.f(oya.u(localBundle), paramc.a().b());
    this.l.a(paramc.a().b());
    this.k.a(localBundle);
    paramc = f();
    oXa.a(localBundle, "newConfig");
    paramc.a(localBundle);
    this.m.a(parampDa, null);
  }
  
  private final void a(rka paramrka, QQa<Bitmap> paramQQa)
  {
    paramQQa = QQa.a(paramQQa, zia.l.d(), this.l.e(), yPa.a.e());
    oXa.a(paramQQa, "Observable.combineLatest….zipperTriple()\n        )");
    gla.b(this, paramQQa, null, null, new mDa(this, paramrka), 3, null);
  }
  
  private final void b(pDa parampDa)
  {
    QQa localQQa = zia.l.d().a(jDa.a);
    oXa.a(localQQa, "BillingRepository.observeIsPro().filter { it }");
    gla.b(this, localQQa, null, null, new lDa(this, parampDa), 3, null);
  }
  
  private final void c(pDa parampDa)
  {
    gla.b(this, parampDa.getViewActions(), null, null, new nDa(this, parampDa), 3, null);
  }
  
  private final void g()
  {
    QQa localQQa = this.k.e(hDa.a).e();
    oXa.a(localQQa, "configSub.map { it -> it… }.distinctUntilChanged()");
    gla.b(this, localQQa, null, null, new iDa(this), 3, null);
  }
  
  public void a(pDa parampDa)
  {
    oXa.b(parampDa, "view");
    super.b(parampDa);
    b(parampDa);
    a(this.p, this.q);
    g();
    c(parampDa);
    parampDa.a(this.p);
  }
  
  public String b()
  {
    return this.j;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/oDa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */