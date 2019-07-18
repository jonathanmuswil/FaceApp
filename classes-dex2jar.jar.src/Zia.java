import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.B;
import com.android.billingclient.api.B.a;
import com.android.billingclient.api.D;
import com.android.billingclient.api.F;
import com.android.billingclient.api.F.a;
import com.android.billingclient.api.H;
import com.android.billingclient.api.I;
import com.android.billingclient.api.K;
import com.android.billingclient.api.K.a;
import com.android.billingclient.api.b;
import com.android.billingclient.api.b.a;
import com.android.billingclient.api.g;
import com.android.billingclient.api.g.a;
import com.android.billingclient.api.z;
import io.faceapp.FaceApplication;
import io.faceapp.FaceApplication.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class zia
  implements H, z
{
  private static g a;
  private static final FVa<zia.a> b;
  private static final FVa<List<I>> c;
  private static final FVa<List<I>> d;
  private static final FVa<List<I>> e;
  private static final FVa<lja> f;
  private static final FVa<nja> g;
  private static final FVa<oja> h;
  private static final Handler i = new Handler(Looper.getMainLooper());
  private static String j;
  private static kRa k;
  public static final zia l;
  
  static
  {
    Object localObject = new zia();
    l = (zia)localObject;
    FVa localFVa = FVa.f(zia.a.c);
    oXa.a(localFVa, "BehaviorSubject.createDefault(DISCONNECTED)");
    b = localFVa;
    localFVa = FVa.f(mWa.a());
    oXa.a(localFVa, "BehaviorSubject.createDe…SkuDetails>>(emptyList())");
    c = localFVa;
    localFVa = FVa.f(mWa.a());
    oXa.a(localFVa, "BehaviorSubject.createDe…SkuDetails>>(emptyList())");
    d = localFVa;
    localFVa = FVa.t();
    oXa.a(localFVa, "BehaviorSubject.create<List<SkuDetails>>()");
    e = localFVa;
    localFVa = FVa.t();
    oXa.a(localFVa, "BehaviorSubject.create<DebugPurchase>()");
    f = localFVa;
    localFVa = FVa.t();
    oXa.a(localFVa, "BehaviorSubject.create<PlayStorePurchase>()");
    g = localFVa;
    localObject = FVa.f(((zia)localObject).h());
    oXa.a(localObject, "BehaviorSubject.createDefault(getCachedStatus())");
    h = (FVa)localObject;
  }
  
  private final XQa<Boolean> a(lja.c paramc)
  {
    paramc = a(paramc.b(), paramc.a()).a(XQa.a(Boolean.valueOf(false)));
    oXa.a(paramc, "validatePurchaseGeneral(…eNext(Single.just(false))");
    return paramc;
  }
  
  private final XQa<Boolean> a(qja paramqja, String paramString)
  {
    Object localObject;
    if (paramqja.i()) {
      localObject = paramqja;
    } else {
      localObject = null;
    }
    if (localObject != null)
    {
      localObject = ((qja)localObject).f();
      if (localObject != null) {}
    }
    else
    {
      localObject = "";
    }
    if (!paramqja.g()) {
      paramqja = null;
    }
    if (paramqja != null)
    {
      paramqja = paramqja.f();
      if (paramqja != null) {}
    }
    else
    {
      paramqja = "";
    }
    paramqja = RPa.a(Kra.b.a((String)localObject, paramqja, paramString)).d(cja.a);
    oXa.a(paramqja, "AccountManager\n         …            .map { true }");
    return paramqja;
  }
  
  private final void a(int paramInt)
  {
    Rqa.l.a(String.valueOf(paramInt));
  }
  
  private final void a(Context paramContext)
  {
    paramContext = g.a(paramContext);
    paramContext.b();
    paramContext.a(this);
    paramContext = paramContext.a();
    oXa.a(paramContext, "BillingClient.newBuilder…\n                .build()");
    a = paramContext;
    a(this, false, 1, null);
  }
  
  private final void a(String paramString, List<String> paramList)
  {
    Object localObject = K.c();
    ((K.a)localObject).a(paramList);
    ((K.a)localObject).a(paramString);
    paramList = ((K.a)localObject).a();
    localObject = a;
    if (localObject != null)
    {
      ((g)localObject).a(paramList, new Tia(paramString));
      return;
    }
    oXa.b("playStoreBillingClient");
    throw null;
  }
  
  @SuppressLint({"CheckResult"})
  private final void a(Set<nja> paramSet)
  {
    Object localObject1 = icb.a("IAB");
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("validatePurchases called [inputCount]: ");
    ((StringBuilder)localObject2).append(paramSet.size());
    ((icb.a)localObject1).a(((StringBuilder)localObject2).toString(), new Object[0]);
    a(paramSet.size());
    localObject1 = k;
    if (localObject1 != null) {
      ((kRa)localObject1).i();
    }
    if (paramSet.isEmpty())
    {
      g.a(nja.b.a());
      return;
    }
    localObject1 = mWa.a(paramSet, gja.a);
    paramSet = new ArrayList(mWa.a((Iterable)localObject1, 10));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (nja)((Iterator)localObject1).next();
      paramSet.add(l.c((nja)localObject2).d(new hja((nja)localObject2)).h());
    }
    k = QQa.a(paramSet).a(dja.a).e(eja.a).g().a(nja.b.a()).b(EVa.b()).a(gRa.a()).a(fja.a);
  }
  
  private final void a(nja paramnja)
  {
    Object localObject = b.c();
    ((b.a)localObject).a(paramnja.c());
    b localb = ((b.a)localObject).a();
    localObject = a;
    if (localObject != null)
    {
      ((g)localObject).a(localb, new Aia(paramnja));
      return;
    }
    oXa.b("playStoreBillingClient");
    throw null;
  }
  
  private final void a(oja paramoja)
  {
    Uma.qa.da().set(paramoja);
  }
  
  private final void a(boolean paramBoolean)
  {
    Object localObject = (zia.a)RPa.a(b);
    icb.a locala = icb.a("IAB");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("connectToPlayBillingService called [status]: ");
    localStringBuilder.append(localObject);
    locala.a(localStringBuilder.toString(), new Object[0]);
    if (paramBoolean)
    {
      localObject = a;
      if (localObject != null)
      {
        ((g)localObject).a();
        a(FaceApplication.d.a());
        return;
      }
      oXa.b("playStoreBillingClient");
      throw null;
    }
    if (localObject != zia.a.c)
    {
      if (localObject == zia.a.a)
      {
        localObject = a;
        if (localObject != null)
        {
          if (!((g)localObject).b()) {
            break label149;
          }
        }
        else
        {
          oXa.b("playStoreBillingClient");
          throw null;
        }
      }
      icb.a("IAB").a("connectToPlayBillingService: either already connected, connecting right now or unavailable", new Object[0]);
      break label187;
    }
    label149:
    icb.a("IAB").a("connectToPlayBillingService: start connecting", new Object[0]);
    b.a(zia.a.b);
    localObject = a;
    if (localObject != null)
    {
      ((g)localObject).a(this);
      label187:
      return;
    }
    oXa.b("playStoreBillingClient");
    throw null;
  }
  
  @SuppressLint({"CheckResult"})
  private final void b(nja paramnja)
  {
    Object localObject = Uma.qa.ga().get();
    oXa.a(localObject, "AppPreferences.reportedPurchasesOrders.get()");
    localObject = (List)localObject;
    if (((List)localObject).contains(paramnja.b())) {
      return;
    }
    e.a(new Uia(paramnja)).h().d(new Via(paramnja, (List)localObject));
  }
  
  private final XQa<Boolean> c(nja paramnja)
  {
    Object localObject = paramnja.d();
    paramnja = paramnja.c();
    if (paramnja == null) {
      paramnja = "";
    }
    uXa localuXa = new uXa();
    localuXa.a = null;
    localuXa.a = new bja((qja)localObject, paramnja, localuXa);
    paramnja = a((qja)localObject, paramnja);
    localObject = localuXa.a;
    if (localObject != null)
    {
      paramnja = paramnja.a((bRa)localObject);
      oXa.a(paramnja, "validatePurchaseGeneral(…ken).compose(transformer)");
      return paramnja;
    }
    oXa.b("transformer");
    throw null;
  }
  
  private final oja h()
  {
    Object localObject = Uma.qa.da().get();
    oXa.a(localObject, "AppPreferences.proVersionStatus.get()");
    oja localoja = (oja)localObject;
    localObject = icb.a("IAB");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("get cached proVersionStatus: ");
    localStringBuilder.append(localoja);
    ((icb.a)localObject).a(localStringBuilder.toString(), new Object[0]);
    return localoja;
  }
  
  @SuppressLint({"CheckResult"})
  private final void i()
  {
    QQa.a(Uma.qa.ba().b(), Uma.qa.ca().b(), Eia.a).e().h(Gia.a).c(Hia.a);
  }
  
  @SuppressLint({"CheckResult"})
  private final void j()
  {
    QQa.a(c, d, Iia.a).c(Jia.a);
    QQa.a(f, g, yPa.a.c()).e(Kia.a).c(Lia.a);
    i();
    e.c(Mia.a);
    h.c(Nia.a);
  }
  
  public final XQa<I> a(qja paramqja)
  {
    oXa.b(paramqja, "sku");
    paramqja = e.a(new Wia(paramqja)).h().d(new Xia(paramqja)).b(Zia.a);
    oXa.a(paramqja, "skuDetailsSubj\n         …oPlayBillingService() } }");
    return paramqja;
  }
  
  public void a()
  {
    icb.a("IAB").a("Billing service disconnected", new Object[0]);
    a(this, false, 1, null);
  }
  
  public final void a(Activity paramActivity, String paramString, I paramI)
  {
    oXa.b(paramActivity, "activity");
    oXa.b(paramString, "from");
    oXa.b(paramI, "skuDetails");
    asa.d.a(paramI, paramString);
    j = paramString;
    paramString = B.j();
    paramString.a(paramI);
    paramI = paramString.a();
    paramString = a;
    if (paramString != null)
    {
      paramActivity = paramString.a(paramActivity, paramI);
      oXa.a(paramActivity, "billingResult");
      if (paramActivity.b() == -1) {
        a(this, false, 1, null);
      }
      return;
    }
    oXa.b("playStoreBillingClient");
    throw null;
  }
  
  public final void a(Application paramApplication)
  {
    oXa.b(paramApplication, "application");
    if (a != null) {
      return;
    }
    j();
    paramApplication = paramApplication.getApplicationContext();
    oXa.a(paramApplication, "application.applicationContext");
    a(paramApplication);
  }
  
  public void a(D paramD)
  {
    oXa.b(paramD, "billingResult");
    int m = paramD.b();
    Object localObject1 = icb.a("IAB");
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Billing setup finished [response]: ");
    ((StringBuilder)localObject2).append(yia.a(paramD));
    paramD = ((StringBuilder)localObject2).toString();
    int n = 0;
    ((icb.a)localObject1).a(paramD, new Object[0]);
    asa.d.c("BillingSetup result", ija.a.a(m));
    if (m != -1)
    {
      if (m != 0)
      {
        if (m == 3) {
          b.a(zia.a.d);
        }
      }
      else
      {
        b.a(zia.a.a);
        paramD = a;
        if (paramD != null)
        {
          paramD = paramD.a("subscriptions");
          localObject2 = asa.d;
          localObject1 = ija.a;
          oXa.a(paramD, "subscriptionsResult");
          ((asa)localObject2).c(((ija)localObject1).a(paramD.b()));
          localObject1 = qja.o.a();
          paramD = new ArrayList(localObject1.length);
          int i1 = localObject1.length;
          for (m = 0; m < i1; m++) {
            paramD.add(localObject1[m].f());
          }
          a("inapp", paramD);
          paramD = qja.o.c();
          localObject1 = new ArrayList(paramD.length);
          i1 = paramD.length;
          for (m = n; m < i1; m++) {
            ((Collection)localObject1).add(paramD[m].f());
          }
          a("subs", (List)localObject1);
          g();
        }
        else
        {
          oXa.b("playStoreBillingClient");
          throw null;
        }
      }
    }
    else {
      a(true);
    }
  }
  
  public void a(D paramD, List<F> paramList)
  {
    oXa.b(paramD, "billingResult");
    icb.a locala = icb.a("IAB");
    paramList = new StringBuilder();
    paramList.append("onPurchasesUpdated [response]: ");
    paramList.append(yia.a(paramD));
    locala.a(paramList.toString(), new Object[0]);
    int m = paramD.b();
    if ((m != 0) && (m != 7))
    {
      j = null;
      if (paramD.b() == -1) {
        a(this, false, 1, null);
      }
    }
    else
    {
      g();
    }
  }
  
  public final boolean b()
  {
    boolean bool = ((oja)RPa.a(h)).c();
    i.post(Bia.a);
    return bool;
  }
  
  public final QQa<zia.a> c()
  {
    QQa localQQa = b.e().b(Dia.a);
    oXa.a(localQQa, "billingStatusSubj.distin…oPlayBillingService() } }");
    return localQQa;
  }
  
  public final QQa<Boolean> d()
  {
    QQa localQQa = h.e(Oia.a).e().b(Qia.a);
    oXa.a(localQQa, "proVersionStatusSubj.map…oPlayBillingService() } }");
    return localQQa;
  }
  
  public final QQa<oja> e()
  {
    QQa localQQa = h.e().b(Sia.a);
    oXa.a(localQQa, "proVersionStatusSubj.dis…oPlayBillingService() } }");
    return localQQa;
  }
  
  public final void f()
  {
    kRa localkRa = k;
    if (localkRa != null) {
      localkRa.i();
    }
  }
  
  public final void g()
  {
    icb.a("IAB").a("queryPurchasesAsync called", new Object[0]);
    HashSet localHashSet = new HashSet();
    Object localObject1 = a;
    if (localObject1 != null)
    {
      localObject1 = ((g)localObject1).b("inapp");
      icb.a("IAB").a("================== Query InApp purchases =================", new Object[0]);
      Object localObject2 = icb.a("IAB");
      Object localObject3 = new StringBuilder();
      ((StringBuilder)localObject3).append("== InApp Response: ");
      oXa.a(localObject1, "inappPurchases");
      Object localObject4 = ((F.a)localObject1).a();
      oXa.a(localObject4, "inappPurchases.billingResult");
      ((StringBuilder)localObject3).append(yia.a((D)localObject4));
      ((icb.a)localObject2).a(((StringBuilder)localObject3).toString(), new Object[0]);
      localObject2 = ((F.a)localObject1).b();
      Object localObject5;
      if (localObject2 != null)
      {
        localObject2 = ((Iterable)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (F)((Iterator)localObject2).next();
          localObject5 = icb.a("IAB");
          localObject4 = new StringBuilder();
          ((StringBuilder)localObject4).append("== InApp ");
          oXa.a(localObject3, "purchase");
          ((StringBuilder)localObject4).append(yia.a((F)localObject3));
          ((icb.a)localObject5).a(((StringBuilder)localObject4).toString(), new Object[0]);
        }
      }
      localObject3 = ((F.a)localObject1).b();
      Object localObject6;
      int m;
      int n;
      Object localObject7;
      if (localObject3 != null)
      {
        localObject2 = new ArrayList();
        localObject4 = ((Iterable)localObject3).iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject5 = ((Iterator)localObject4).next();
          localObject3 = (F)localObject5;
          localObject6 = qja.values();
          m = localObject6.length;
          for (n = 0; n < m; n++)
          {
            localObject7 = localObject6[n].f();
            oXa.a(localObject3, "purchase");
            if (oXa.a(localObject7, ((F)localObject3).f()))
            {
              n = 1;
              break label344;
            }
          }
          n = 0;
          label344:
          if (n != 0) {
            ((Collection)localObject2).add(localObject5);
          }
        }
        localObject3 = new ArrayList(mWa.a((Iterable)localObject2, 10));
        localObject2 = ((Iterable)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject5 = (F)((Iterator)localObject2).next();
          localObject4 = nja.b;
          oXa.a(localObject5, "it");
          ((Collection)localObject3).add(((nja.a)localObject4).a((F)localObject5));
        }
        localHashSet.addAll((Collection)localObject3);
      }
      localObject2 = a;
      if (localObject2 != null)
      {
        localObject2 = ((g)localObject2).b("subs");
        icb.a("IAB").a("================== Query Subs purchases =================", new Object[0]);
        localObject3 = icb.a("IAB");
        localObject4 = new StringBuilder();
        ((StringBuilder)localObject4).append("== Subs Response: ");
        oXa.a(localObject2, "subsPurchases");
        localObject5 = ((F.a)localObject2).a();
        oXa.a(localObject5, "subsPurchases.billingResult");
        ((StringBuilder)localObject4).append(yia.a((D)localObject5));
        ((icb.a)localObject3).a(((StringBuilder)localObject4).toString(), new Object[0]);
        localObject3 = ((F.a)localObject2).b();
        if (localObject3 != null)
        {
          localObject7 = ((Iterable)localObject3).iterator();
          while (((Iterator)localObject7).hasNext())
          {
            localObject5 = (F)((Iterator)localObject7).next();
            localObject4 = icb.a("IAB");
            localObject3 = new StringBuilder();
            ((StringBuilder)localObject3).append("== Subs ");
            oXa.a(localObject5, "purchase");
            ((StringBuilder)localObject3).append(yia.a((F)localObject5));
            ((icb.a)localObject4).a(((StringBuilder)localObject3).toString(), new Object[0]);
          }
        }
        localObject3 = ((F.a)localObject2).b();
        if (localObject3 != null)
        {
          localObject2 = new ArrayList();
          localObject4 = ((Iterable)localObject3).iterator();
          while (((Iterator)localObject4).hasNext())
          {
            localObject5 = ((Iterator)localObject4).next();
            localObject7 = (F)localObject5;
            localObject3 = qja.values();
            m = localObject3.length;
            for (n = 0; n < m; n++)
            {
              localObject6 = localObject3[n].f();
              oXa.a(localObject7, "purchase");
              if (oXa.a(localObject6, ((F)localObject7).f()))
              {
                n = 1;
                break label769;
              }
            }
            n = 0;
            label769:
            if (n != 0) {
              ((Collection)localObject2).add(localObject5);
            }
          }
          localObject3 = new ArrayList(mWa.a((Iterable)localObject2, 10));
          localObject5 = ((Iterable)localObject2).iterator();
          while (((Iterator)localObject5).hasNext())
          {
            localObject4 = (F)((Iterator)localObject5).next();
            localObject2 = nja.b;
            oXa.a(localObject4, "it");
            ((Collection)localObject3).add(((nja.a)localObject2).a((F)localObject4));
          }
          localHashSet.addAll((Collection)localObject3);
        }
        if ((((F.a)localObject1).c() == 0) && (((F.a)localObject1).c() == 0))
        {
          a(localHashSet);
        }
        else
        {
          asa.a(asa.d, "INVENTORY_FAILED", null, 2, null);
          icb.a("IAB").a("queryPurchasesAsync: purchases processing stopped since bad response; reconnecting", new Object[0]);
          a(this, false, 1, null);
        }
        return;
      }
      oXa.b("playStoreBillingClient");
      throw null;
    }
    oXa.b("playStoreBillingClient");
    throw null;
  }
  
  public static enum a
  {
    static
    {
      a locala1 = new a("READY", 0);
      a = locala1;
      a locala2 = new a("CONNECTING", 1);
      b = locala2;
      a locala3 = new a("DISCONNECTED", 2);
      c = locala3;
      a locala4 = new a("UNAVAILABLE", 3);
      d = locala4;
      e = new a[] { locala1, locala2, locala3, locala4 };
    }
    
    private a() {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */