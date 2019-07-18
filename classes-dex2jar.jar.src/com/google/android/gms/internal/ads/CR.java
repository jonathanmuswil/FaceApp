package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

final class cr
  extends iK
{
  private OK a;
  private bU<eK> b;
  private bU<String> c;
  private bU<oK> d;
  private bU<tK> e;
  private bU<AK> f;
  private bU<Boolean> g;
  private bU<ApplicationInfo> h;
  private bU<HK> i;
  private bU<LK> j;
  private bU<ZK> k;
  private bU<String> l;
  private bU<HB> m;
  private bU<HB> n;
  private bU<HB> o;
  private bU<HB> p;
  private bU<Map<kM, HB>> q;
  private bU<Set<Bw<rM>>> r;
  private bU<Set<Bw<rM>>> s;
  private bU t;
  private bU<lM> u;
  
  private cr(Xq paramXq, OK paramOK)
  {
    this.a = paramOK;
    this.b = new hK(Ir.a(), Xq.j(this.v), Xq.a(this.v), PL.a());
    this.c = new PK(paramOK);
    this.d = new qK(Qq.a(), Xq.j(this.v), this.c, PL.a());
    this.e = new vK(Er.a(), PL.a(), Xq.j(this.v));
    this.f = new CK(Fr.a(), PL.a(), this.c);
    this.g = new RK(paramOK);
    this.h = new QK(paramOK);
    this.i = new JK(Gr.a(), Xq.a(this.v), this.g, this.h);
    this.j = new NK(Hr.a(), Xq.a(this.v), Xq.j(this.v));
    this.k = new aL(PL.a());
    this.l = new TK(paramOK);
    this.m = QT.a(BB.a());
    this.n = QT.a(AB.a());
    this.o = QT.a(CB.a());
    this.p = QT.a(DB.a());
    paramXq = TT.a(4);
    paramXq.a(kM.e, this.m);
    paramXq.a(kM.g, this.n);
    paramXq.a(kM.h, this.o);
    paramXq.a(kM.i, this.p);
    this.q = paramXq.a();
    this.r = QT.a(new EB(this.l, Xq.j(this.v), PL.a(), this.q));
    paramXq = YT.a(0, 1);
    paramXq.b(this.r);
    this.s = paramXq.a();
    this.t = vM.a(this.s);
    this.u = QT.a(sM.a(PL.a(), Xq.a(this.v), this.t));
  }
  
  private final EK d()
  {
    ea localea = Dr.a();
    Bm localBm = PL.b();
    List localList = this.a.e();
    WT.a(localList, "Cannot return null from a non-@Nullable @Provides method");
    return new EK(localea, localBm, (List)localList);
  }
  
  private final kK e()
  {
    Vj localVj = Ir.b();
    Bm localBm = PL.b();
    String str = this.a.b();
    WT.a(str, "Cannot return null from a non-@Nullable @Provides method");
    return new kK(localVj, localBm, (String)str, this.a.c());
  }
  
  public final SJ<JSONObject> a()
  {
    Bm localBm = PL.b();
    XT localXT = XT.a(11);
    Object localObject1 = new oJ(new AK(Fr.b(), PL.b(), PK.a(this.a)), 0L, (ScheduledExecutorService)Xq.a(this.v).get());
    WT.a(localObject1, "Cannot return null from a non-@Nullable @Provides method");
    localXT.a((QJ)localObject1);
    Object localObject2 = new HK(Gr.b(), (ScheduledExecutorService)Xq.a(this.v).get(), this.a.d(), QK.a(this.a));
    localObject1 = (ScheduledExecutorService)Xq.a(this.v).get();
    Object localObject3 = ra.Vc;
    localObject1 = new oJ((QJ)localObject2, ((Long)Kea.e().a((ga)localObject3)).longValue(), (ScheduledExecutorService)localObject1);
    WT.a(localObject1, "Cannot return null from a non-@Nullable @Provides method");
    localXT.a((QJ)localObject1);
    localObject3 = new LK(Hr.b(), (ScheduledExecutorService)Xq.a(this.v).get(), Iq.a(Xq.h(this.v)));
    localObject2 = (ScheduledExecutorService)Xq.a(this.v).get();
    localObject1 = ra.kd;
    localObject1 = new oJ((QJ)localObject3, ((Long)Kea.e().a((ga)localObject1)).longValue(), (ScheduledExecutorService)localObject2);
    WT.a(localObject1, "Cannot return null from a non-@Nullable @Provides method");
    localXT.a((QJ)localObject1);
    localObject1 = new oJ(new eK(Ir.b(), Iq.a(Xq.h(this.v)), (ScheduledExecutorService)Xq.a(this.v).get(), PL.b()), 0L, (ScheduledExecutorService)Xq.a(this.v).get());
    WT.a(localObject1, "Cannot return null from a non-@Nullable @Provides method");
    localXT.a((QJ)localObject1);
    localObject1 = new oJ(new ZK(PL.b()), 0L, (ScheduledExecutorService)Xq.a(this.v).get());
    WT.a(localObject1, "Cannot return null from a non-@Nullable @Provides method");
    localXT.a((QJ)localObject1);
    localXT.a(WK.a());
    localXT.a(new oK(null, Iq.a(Xq.h(this.v)), PK.a(this.a), PL.b()));
    localXT.a(new tK(Er.b(), PL.b(), Iq.a(Xq.h(this.v))));
    localXT.a(d());
    localXT.a(e());
    localXT.a((QJ)Xq.i(this.v).get());
    return new SJ(localBm, localXT.a());
  }
  
  public final SJ<JSONObject> b()
  {
    return XK.a(Xq.i(this.v).get(), e(), d(), QT.b(this.b), QT.b(this.d), QT.b(this.e), QT.b(this.f), QT.b(this.i), QT.b(this.j), QT.b(this.k), PL.b());
  }
  
  public final lM c()
  {
    return (lM)this.u.get();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */