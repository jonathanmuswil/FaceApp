package io.faceapp.ui.image_editor.filter_editor;

import FVa;
import QQa;
import RPa;
import android.graphics.Bitmap;
import android.os.Bundle;
import gla;
import java.util.HashMap;
import kya;
import lka;
import mka;
import oXa;
import oya;
import pxa;
import pxa.a;
import xza;
import yPa;
import yza;
import zia;

public final class r
  extends xza<s>
{
  private final String j;
  private final FVa<Bundle> k;
  private final FVa<pxa> l;
  private final yza<lka> m;
  private s.a n;
  private final HashMap<String, String> o;
  private final Bundle p;
  private final mka q;
  private final QQa<Bitmap> r;
  private final boolean s;
  private final boolean t;
  
  public r(kya paramkya, Bundle paramBundle, mka parammka, QQa<Bitmap> paramQQa, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramkya);
    this.p = paramBundle;
    this.q = parammka;
    this.r = paramQQa;
    this.s = paramBoolean1;
    this.t = paramBoolean2;
    this.j = "Filter";
    paramkya = FVa.t();
    oXa.a(paramkya, "BehaviorSubject.create<Bundle>()");
    this.k = paramkya;
    paramkya = FVa.t();
    oXa.a(paramkya, "BehaviorSubject.create<FilterSelection>()");
    this.l = paramkya;
    this.m = new yza();
    this.o = new HashMap();
    paramBundle = oya.b(this.p);
    paramkya = oya.a(oya.d(paramBundle), this.q.c(), null, 2, null);
    this.k.a(paramBundle);
    this.l.a(paramkya);
  }
  
  private final s.a a(Bitmap paramBitmap, mka parammka, boolean paramBoolean)
  {
    s.a locala = this.n;
    if ((locala != null) && (locala.d() == paramBoolean)) {
      return locala;
    }
    paramBitmap = new s.a(paramBitmap, parammka, paramBoolean, this.t);
    this.n = paramBitmap;
    return paramBitmap;
  }
  
  private final pxa a(lka paramlka)
  {
    return pxa.b.a(paramlka, (String)this.o.get(paramlka.m()));
  }
  
  private final void a(s.b.e parame)
  {
    Bundle localBundle = (Bundle)RPa.a(this.k);
    oya.a(oya.v(localBundle), parame.a(), parame.b());
    this.k.a(localBundle);
    parame = f();
    oXa.a(localBundle, "newConfig");
    parame.a(localBundle);
  }
  
  private final void a(s params, s.b.b paramb)
  {
    this.l.a(a(paramb.a()));
    this.m.a(params, paramb.a());
  }
  
  private final void a(s params, s.b.c paramc, mka parammka)
  {
    paramc = (Bundle)RPa.a(this.k);
    oya.d(paramc).remove(parammka.c());
    this.l.a(pxa.b.a());
    this.k.a(paramc);
    parammka = f();
    oXa.a(paramc, "newConfig");
    parammka.a(paramc);
    this.m.a(params, null);
  }
  
  private final void a(s params, mka parammka)
  {
    QQa localQQa = zia.l.d().a(n.a);
    oXa.a(localQQa, "BillingRepository.observeIsPro().filter { it }");
    gla.b(this, localQQa, null, null, new p(this, params, parammka), 3, null);
  }
  
  private final void a(s params, mka parammka, pxa parampxa)
  {
    Bundle localBundle = (Bundle)RPa.a(this.k);
    oya.d(localBundle).putParcelable(parammka.c(), parampxa);
    this.l.a(parampxa);
    this.k.a(localBundle);
    parammka = f();
    oXa.a(localBundle, "newConfig");
    parammka.a(localBundle);
    this.m.a(params, null);
  }
  
  private final void a(mka parammka)
  {
    if (this.s)
    {
      parammka = this.k.e(l.a).e();
      oXa.a(parammka, "configSub.map { it.value… }.distinctUntilChanged()");
      gla.b(this, parammka, null, null, new m(this), 3, null);
    }
  }
  
  private final void a(mka parammka, QQa<Bitmap> paramQQa)
  {
    paramQQa = QQa.a(paramQQa, zia.l.d(), this.l.e(), yPa.a.e());
    oXa.a(paramQQa, "Observable.combineLatest….zipperTriple()\n        )");
    gla.b(this, paramQQa, null, null, new k(this, parammka), 3, null);
  }
  
  private final void b(s params, mka parammka)
  {
    gla.b(this, params.getViewActions(), null, null, new q(this, params, parammka), 3, null);
  }
  
  public void a(s params)
  {
    oXa.b(params, "view");
    super.b(params);
    a(this.q);
    a(params, this.q);
    a(this.q, this.r);
    b(params, this.q);
    params.a(this.q);
  }
  
  public String b()
  {
    return this.j;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/filter_editor/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */