import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import io.faceapp.m;

public final class lza
  extends xza<mza>
{
  private final String j;
  private mza.a k;
  private final FVa<Bundle> l;
  private final FVa<String> m;
  private final FVa<Boolean> n;
  private final yza<kka> o;
  private final Bundle p;
  private final eBa q;
  private final rka r;
  private final QQa<Bitmap> s;
  private final boolean t;
  
  public lza(kya paramkya, Bundle paramBundle, eBa parameBa, rka paramrka, QQa<Bitmap> paramQQa, boolean paramBoolean)
  {
    super(paramkya);
    this.p = paramBundle;
    this.q = parameBa;
    this.r = paramrka;
    this.s = paramQQa;
    this.t = paramBoolean;
    this.j = "Background";
    paramkya = FVa.t();
    oXa.a(paramkya, "BehaviorSubject.create<Bundle>()");
    this.l = paramkya;
    paramkya = FVa.t();
    oXa.a(paramkya, "BehaviorSubject.create<String>()");
    this.m = paramkya;
    paramkya = FVa.f(Boolean.valueOf(false));
    oXa.a(paramkya, "BehaviorSubject.createDefault(false)");
    this.n = paramkya;
    this.o = new yza();
  }
  
  private final mza.a a(Bitmap paramBitmap, boolean paramBoolean, rka paramrka)
  {
    mza.a locala = this.k;
    if ((locala != null) && (locala.d() == paramBoolean)) {
      return locala;
    }
    paramBitmap = new mza.a(paramBitmap, paramBoolean, paramrka, this.t);
    this.k = paramBitmap;
    return paramBitmap;
  }
  
  private final void a(eBa parameBa)
  {
    eBa.a locala = parameBa.a();
    parameBa = RPa.a(this.l);
    oXa.a(parameBa, "configSub.valueNotNull");
    locala.a((Bundle)parameBa);
  }
  
  private final void a(eBa parameBa, Bundle paramBundle)
  {
    this.l.a(paramBundle);
    this.m.a(oya.e(oya.a(paramBundle)));
    parameBa.a().a(paramBundle);
  }
  
  private final void a(eBa parameBa, mza.b.i parami, boolean paramBoolean)
  {
    Bundle localBundle = (Bundle)RPa.a(this.l);
    oya.a(oya.a(localBundle), parami.a());
    this.n.a(Boolean.valueOf(paramBoolean));
    oXa.a(localBundle, "newConf");
    a(parameBa, localBundle);
  }
  
  private final void a(eBa parameBa, mza.b.j paramj)
  {
    Bundle localBundle = (Bundle)RPa.a(this.l);
    oya.a(oya.a(localBundle), paramj.a(), paramj.b());
    oXa.a(localBundle, "newConf");
    a(parameBa, localBundle);
  }
  
  private final void a(mza.b.g paramg)
  {
    mza localmza = (mza)c();
    if (localmza != null) {
      localmza.j(paramg.a());
    }
  }
  
  private final void a(mza parammza, eBa parameBa)
  {
    QQa localQQa = zia.l.d().a(dza.a);
    oXa.a(localQQa, "BillingRepository.observeIsPro().filter { it }");
    gla.b(this, localQQa, null, null, new fza(this, parammza, parameBa), 3, null);
  }
  
  private final void a(mza parammza, eBa parameBa, mza.b.a parama)
  {
    Bundle localBundle1 = (Bundle)RPa.a(this.l);
    oya.a(oya.a(localBundle1), "android-gallery");
    Bundle localBundle2 = oya.a(localBundle1);
    parama = parama.a().toString();
    oXa.a(parama, "action.uri.toString()");
    oya.b(localBundle2, parama);
    oya.c(oya.a(localBundle1), false);
    oXa.a(localBundle1, "newConf");
    a(parameBa, localBundle1);
    this.o.a(parammza, null);
  }
  
  private final void a(mza parammza, eBa parameBa, mza.b.c paramc)
  {
    Bundle localBundle = (Bundle)RPa.a(this.l);
    oya.a(oya.a(localBundle), paramc.a().b());
    oya.b(oya.a(localBundle), paramc.a().d());
    oya.c(oya.a(localBundle), paramc.a().h());
    oXa.a(localBundle, "newConf");
    a(parameBa, localBundle);
    this.o.a(parammza, null);
  }
  
  private final void a(mza parammza, eBa parameBa, mza.b.f paramf)
  {
    paramf = (Bundle)RPa.a(this.l);
    oya.a(oya.a(paramf), "");
    oya.b(oya.a(paramf), "");
    oya.c(oya.a(paramf), false);
    oXa.a(paramf, "newConf");
    a(parameBa, paramf);
    this.o.a(parammza, null);
  }
  
  private final void a(rka paramrka, QQa<Bitmap> paramQQa)
  {
    paramQQa = QQa.a(paramQQa, zia.l.d(), this.m.e(), yPa.a.e());
    oXa.a(paramQQa, "Observable.combineLatest….zipperTriple()\n        )");
    gla.b(this, paramQQa, null, null, new Zya(this, paramrka), 3, null);
  }
  
  private final void b(eBa parameBa)
  {
    Bundle localBundle = (Bundle)this.l.u();
    if (localBundle != null)
    {
      localBundle = oya.a(localBundle);
      if ((localBundle != null) && (localBundle.containsKey("lightSource") == true))
      {
        i = 1;
        break label42;
      }
    }
    int i = 0;
    label42:
    if (i == 0) {
      a(parameBa, new mza.b.i(new PointF(1.0F, 135.0F)), true);
    }
  }
  
  private final void b(mza parammza, eBa parameBa)
  {
    gla.b(this, parammza.getViewActions(), null, null, new kza(this, parameBa, parammza), 3, null);
  }
  
  private final void c(eBa parameBa)
  {
    QQa localQQa = QQa.b(parameBa.a().e(), parameBa.a().d().a(gza.a));
    oXa.a(localQQa, "Observable.merge(\n      …Progress.Slow }\n        )");
    parameBa = new iza(this, parameBa);
    gla.b(this, localQQa, new jza(this), null, parameBa, 2, null);
  }
  
  private final void g()
  {
    Object localObject;
    if (Xma.e.b(Vma.b))
    {
      localObject = (mza)c();
      if (localObject != null) {
        ((mza)localObject).ia();
      }
    }
    else
    {
      localObject = (mza)c();
      if (localObject != null)
      {
        localObject = ((sla)localObject).getRouter();
        if (localObject != null)
        {
          XQa localXQa = Xma.e.a(Vma.b).d(1L).h();
          oXa.a(localXQa, "PermissionsManager.asObs…          .firstOrError()");
          gla.a(this, localXQa, null, new Yya(this), 1, null);
          ((m)localObject).a(Vma.b);
        }
      }
    }
  }
  
  private final void h()
  {
    QQa localQQa = this.l.e(_ya.a).e();
    oXa.a(localQQa, "configSub.map { it.backg… }.distinctUntilChanged()");
    gla.b(this, localQQa, null, null, new aza(this), 3, null);
  }
  
  private final void i()
  {
    QQa localQQa = this.l.e(bza.a).e().a(this.n, yPa.a.c());
    oXa.a(localQQa, "configSub.map { it.backg…ub, RxUtils.zipperPair())");
    gla.b(this, localQQa, null, null, new cza(this), 3, null);
  }
  
  public void a(kya paramkya)
  {
    oXa.b(paramkya, "listener");
    Bundle localBundle1 = (Bundle)RPa.a(this.l);
    Bundle localBundle2 = oya.a(localBundle1);
    Object localObject = (mza)c();
    if (localObject != null) {
      localObject = ((mza)localObject).ha();
    } else {
      localObject = null;
    }
    oya.a(localBundle2, (RectF)localObject);
    oya.c(oya.a(localBundle1), oya.h(oya.v(localBundle1)));
    oXa.a(localBundle1, "newConfig");
    paramkya.a(localBundle1);
  }
  
  public void a(mza parammza)
  {
    oXa.b(parammza, "view");
    super.b(parammza);
    a(parammza, this.q);
    c(this.q);
    a(this.r, this.s);
    h();
    i();
    b(parammza, this.q);
    parammza.a(this.r);
    if (!this.l.v()) {
      a(this.q, oya.b(this.p));
    }
  }
  
  public final void a(mza parammza, mza.b.e parame)
  {
    oXa.b(parammza, "view");
    oXa.b(parame, "action");
    this.m.a(parame.a().b());
    this.o.a(parammza, parame.a());
  }
  
  public String b()
  {
    return this.j;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */