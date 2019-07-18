package com.google.android.gms.measurement.internal;

import Fq;
import Gq;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.util.h;
import iH;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import yK;

public class aa
  implements ya
{
  private static volatile aa a;
  private long A;
  private volatile Boolean B;
  private Boolean C;
  private Boolean D;
  private int E;
  private AtomicInteger F;
  private final long G;
  private final Context b;
  private final String c;
  private final String d;
  private final String e;
  private final boolean f;
  private final tc g;
  private final wc h;
  private final H i;
  private final v j;
  private final W k;
  private final Nb l;
  private final hc m;
  private final t n;
  private final com.google.android.gms.common.util.e o;
  private final gb p;
  private final Ha q;
  private final a r;
  private final bb s;
  private r t;
  private jb u;
  private e v;
  private q w;
  private N x;
  private boolean y;
  private Boolean z;
  
  private aa(Ga paramGa)
  {
    int i1 = 0;
    this.y = false;
    this.F = new AtomicInteger(0);
    com.google.android.gms.common.internal.t.a(paramGa);
    this.g = new tc(paramGa.a);
    m.a(this.g);
    this.b = paramGa.a;
    this.c = paramGa.b;
    this.d = paramGa.c;
    this.e = paramGa.d;
    this.f = paramGa.h;
    this.B = paramGa.e;
    Object localObject1 = paramGa.g;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = ((yK)localObject1).g;
      if (localObject2 != null)
      {
        localObject2 = ((Bundle)localObject2).get("measurementEnabled");
        if ((localObject2 instanceof Boolean)) {
          this.C = ((Boolean)localObject2);
        }
        localObject1 = ((yK)localObject1).g.get("measurementDeactivated");
        if ((localObject1 instanceof Boolean)) {
          this.D = ((Boolean)localObject1);
        }
      }
    }
    iH.a(this.b);
    this.o = h.d();
    this.G = this.o.a();
    this.h = new wc(this);
    localObject1 = new H(this);
    ((xa)localObject1).o();
    this.i = ((H)localObject1);
    localObject1 = new v(this);
    ((xa)localObject1).o();
    this.j = ((v)localObject1);
    localObject1 = new hc(this);
    ((xa)localObject1).o();
    this.m = ((hc)localObject1);
    localObject1 = new t(this);
    ((xa)localObject1).o();
    this.n = ((t)localObject1);
    this.r = new a(this);
    localObject1 = new gb(this);
    ((Db)localObject1).w();
    this.p = ((gb)localObject1);
    localObject1 = new Ha(this);
    ((Db)localObject1).w();
    this.q = ((Ha)localObject1);
    localObject1 = new Nb(this);
    ((Db)localObject1).w();
    this.l = ((Nb)localObject1);
    localObject1 = new bb(this);
    ((xa)localObject1).o();
    this.s = ((bb)localObject1);
    localObject1 = new W(this);
    ((xa)localObject1).o();
    this.k = ((W)localObject1);
    localObject1 = paramGa.g;
    int i2 = i1;
    if (localObject1 != null)
    {
      i2 = i1;
      if (((yK)localObject1).b != 0L) {
        i2 = 1;
      }
    }
    localObject1 = this.g;
    if ((this.b.getApplicationContext() instanceof Application))
    {
      localObject1 = z();
      if ((((Ha)localObject1).getContext().getApplicationContext() instanceof Application))
      {
        localObject2 = (Application)((Ha)localObject1).getContext().getApplicationContext();
        if (((Ha)localObject1).c == null) {
          ((Ha)localObject1).c = new _a((Ha)localObject1, null);
        }
        if ((i2 ^ 0x1) != 0)
        {
          ((Application)localObject2).unregisterActivityLifecycleCallbacks(((Ha)localObject1).c);
          ((Application)localObject2).registerActivityLifecycleCallbacks(((Ha)localObject1).c);
          ((Ha)localObject1).c().A().a("Registered activity lifecycle callback");
        }
      }
    }
    else
    {
      c().v().a("Application context is not an Application");
    }
    this.k.a(new ba(this, paramGa));
  }
  
  private final void G()
  {
    if (this.y) {
      return;
    }
    throw new IllegalStateException("AppMeasurement is not initialized");
  }
  
  public static aa a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    return a(paramContext, new yK(0L, 0L, true, null, null, null, paramBundle));
  }
  
  public static aa a(Context paramContext, yK paramyK)
  {
    yK localyK = paramyK;
    if (paramyK != null) {
      if (paramyK.e != null)
      {
        localyK = paramyK;
        if (paramyK.f != null) {}
      }
      else
      {
        localyK = new yK(paramyK.a, paramyK.b, paramyK.c, paramyK.d, null, null, paramyK.g);
      }
    }
    com.google.android.gms.common.internal.t.a(paramContext);
    com.google.android.gms.common.internal.t.a(paramContext.getApplicationContext());
    if (a == null)
    {
      try
      {
        if (a == null)
        {
          paramyK = new com/google/android/gms/measurement/internal/Ga;
          paramyK.<init>(paramContext, localyK);
          paramContext = new com/google/android/gms/measurement/internal/aa;
          paramContext.<init>(paramyK);
          a = paramContext;
        }
      }
      finally {}
    }
    else if (localyK != null)
    {
      paramContext = localyK.g;
      if ((paramContext != null) && (paramContext.containsKey("dataCollectionDefaultEnabled"))) {
        a.a(localyK.g.getBoolean("dataCollectionDefaultEnabled"));
      }
    }
    return a;
  }
  
  private final void a(Ga paramGa)
  {
    n().j();
    wc.m();
    Object localObject = new e(this);
    ((xa)localObject).o();
    this.v = ((e)localObject);
    paramGa = new q(this, paramGa.f);
    paramGa.w();
    this.w = paramGa;
    localObject = new r(this);
    ((Db)localObject).w();
    this.t = ((r)localObject);
    localObject = new jb(this);
    ((Db)localObject).w();
    this.u = ((jb)localObject);
    this.m.p();
    this.i.p();
    this.x = new N(this);
    this.w.x();
    c().y().a("App measurement is starting up, version", Long.valueOf(this.h.l()));
    localObject = this.g;
    c().y().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
    localObject = this.g;
    paramGa = paramGa.B();
    if (TextUtils.isEmpty(this.c))
    {
      if (g().f(paramGa))
      {
        localObject = c().y();
        paramGa = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
      }
      else
      {
        localObject = c().y();
        paramGa = String.valueOf(paramGa);
        if (paramGa.length() != 0) {
          paramGa = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(paramGa);
        } else {
          paramGa = new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
        }
      }
      ((x)localObject).a(paramGa);
    }
    c().z().a("Debug-level message logging enabled");
    if (this.E != this.F.get()) {
      c().s().a("Not all components initialized", Integer.valueOf(this.E), Integer.valueOf(this.F.get()));
    }
    this.y = true;
  }
  
  private static void a(wa paramwa)
  {
    if (paramwa != null) {
      return;
    }
    throw new IllegalStateException("Component not created");
  }
  
  private static void b(Db paramDb)
  {
    if (paramDb != null)
    {
      if (paramDb.u()) {
        return;
      }
      paramDb = String.valueOf(paramDb.getClass());
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramDb).length() + 27);
      localStringBuilder.append("Component not initialized: ");
      localStringBuilder.append(paramDb);
      throw new IllegalStateException(localStringBuilder.toString());
    }
    throw new IllegalStateException("Component not created");
  }
  
  private static void b(xa paramxa)
  {
    if (paramxa != null)
    {
      if (paramxa.l()) {
        return;
      }
      String str = String.valueOf(paramxa.getClass());
      paramxa = new StringBuilder(String.valueOf(str).length() + 27);
      paramxa.append("Component not initialized: ");
      paramxa.append(str);
      throw new IllegalStateException(paramxa.toString());
    }
    throw new IllegalStateException("Component not created");
  }
  
  public final q A()
  {
    b(this.w);
    return this.w;
  }
  
  public final jb B()
  {
    b(this.u);
    return this.u;
  }
  
  public final gb C()
  {
    b(this.p);
    return this.p;
  }
  
  public final r D()
  {
    b(this.t);
    return this.t;
  }
  
  public final Nb E()
  {
    b(this.l);
    return this.l;
  }
  
  public final e F()
  {
    b(this.v);
    return this.v;
  }
  
  public final tc a()
  {
    return this.g;
  }
  
  final void a(Db paramDb)
  {
    this.E += 1;
  }
  
  final void a(xa paramxa)
  {
    this.E += 1;
  }
  
  final void a(boolean paramBoolean)
  {
    this.B = Boolean.valueOf(paramBoolean);
  }
  
  public final com.google.android.gms.common.util.e b()
  {
    return this.o;
  }
  
  public final v c()
  {
    b(this.j);
    return this.j;
  }
  
  public final boolean d()
  {
    n().j();
    G();
    if (this.h.a(m.za))
    {
      if (this.h.p()) {
        return false;
      }
      localBoolean = this.D;
      if ((localBoolean != null) && (localBoolean.booleanValue())) {
        return false;
      }
      localBoolean = h().w();
      if (localBoolean != null) {
        return localBoolean.booleanValue();
      }
      localBoolean = this.h.q();
      if (localBoolean != null) {
        return localBoolean.booleanValue();
      }
      localBoolean = this.C;
      if (localBoolean != null) {
        return localBoolean.booleanValue();
      }
      if (f.b()) {
        return false;
      }
      if ((this.h.a(m.va)) && (this.B != null)) {
        return this.B.booleanValue();
      }
      return true;
    }
    if (this.h.p()) {
      return false;
    }
    Boolean localBoolean = this.h.q();
    boolean bool1;
    if (localBoolean != null)
    {
      bool1 = localBoolean.booleanValue();
    }
    else
    {
      boolean bool2 = f.b() ^ true;
      bool1 = bool2;
      if (bool2)
      {
        bool1 = bool2;
        if (this.B != null)
        {
          bool1 = bool2;
          if (((Boolean)m.va.a(null)).booleanValue()) {
            bool1 = this.B.booleanValue();
          }
        }
      }
    }
    return h().c(bool1);
  }
  
  protected final void e()
  {
    n().j();
    if (h().f.a() == 0L) {
      h().f.a(this.o.a());
    }
    if (Long.valueOf(h().k.a()).longValue() == 0L)
    {
      c().A().a("Persisting first open", Long.valueOf(this.G));
      h().k.a(this.G);
    }
    tc localtc;
    if (!v())
    {
      if (d())
      {
        if (!g().d("android.permission.INTERNET")) {
          c().s().a("App is missing INTERNET permission");
        }
        if (!g().d("android.permission.ACCESS_NETWORK_STATE")) {
          c().s().a("App is missing ACCESS_NETWORK_STATE permission");
        }
        localtc = this.g;
        if ((!Gq.a(this.b).a()) && (!this.h.v()))
        {
          if (!Q.a(this.b)) {
            c().s().a("AppMeasurementReceiver not registered/enabled");
          }
          if (!hc.a(this.b, false)) {
            c().s().a("AppMeasurementService not registered/enabled");
          }
        }
        c().s().a("Uploading is not possible. App measurement disabled");
      }
    }
    else
    {
      localtc = this.g;
      if ((!TextUtils.isEmpty(A().A())) || (!TextUtils.isEmpty(A().C())))
      {
        g();
        if (hc.a(A().A(), h().s(), A().C(), h().t()))
        {
          c().y().a("Rechecking which service to use due to a GMP App Id change");
          h().v();
          D().A();
          this.u.A();
          this.u.F();
          h().k.a(this.G);
          h().m.a(null);
        }
        h().c(A().A());
        h().d(A().C());
        if (this.h.a(A().B())) {
          this.l.a(this.G);
        }
      }
      z().a(h().m.a());
      localtc = this.g;
      if ((!TextUtils.isEmpty(A().A())) || (!TextUtils.isEmpty(A().C())))
      {
        boolean bool = d();
        if ((!h().z()) && (!this.h.p())) {
          h().d(bool ^ true);
        }
        if ((!this.h.n(A().B())) || (bool)) {
          z().J();
        }
        B().a(new AtomicReference());
      }
    }
    h().u.a(this.h.a(m.Ha));
    h().v.a(this.h.a(m.Ia));
  }
  
  public final t f()
  {
    a(this.n);
    return this.n;
  }
  
  public final hc g()
  {
    a(this.m);
    return this.m;
  }
  
  public final Context getContext()
  {
    return this.b;
  }
  
  public final H h()
  {
    a(this.i);
    return this.i;
  }
  
  public final wc i()
  {
    return this.h;
  }
  
  public final v j()
  {
    v localv = this.j;
    if ((localv != null) && (localv.l())) {
      return this.j;
    }
    return null;
  }
  
  public final N k()
  {
    return this.x;
  }
  
  final W l()
  {
    return this.k;
  }
  
  public final boolean m()
  {
    return TextUtils.isEmpty(this.c);
  }
  
  public final W n()
  {
    b(this.k);
    return this.k;
  }
  
  public final String o()
  {
    return this.c;
  }
  
  public final String p()
  {
    return this.d;
  }
  
  public final String q()
  {
    return this.e;
  }
  
  public final boolean r()
  {
    return this.f;
  }
  
  public final boolean s()
  {
    return (this.B != null) && (this.B.booleanValue());
  }
  
  final long t()
  {
    Long localLong = Long.valueOf(h().k.a());
    if (localLong.longValue() == 0L) {
      return this.G;
    }
    return Math.min(this.G, localLong.longValue());
  }
  
  final void u()
  {
    this.F.incrementAndGet();
  }
  
  protected final boolean v()
  {
    G();
    n().j();
    Object localObject = this.z;
    if ((localObject == null) || (this.A == 0L) || ((localObject != null) && (!((Boolean)localObject).booleanValue()) && (Math.abs(this.o.b() - this.A) > 1000L)))
    {
      this.A = this.o.b();
      localObject = this.g;
      boolean bool1 = g().d("android.permission.INTERNET");
      boolean bool2 = true;
      if ((bool1) && (g().d("android.permission.ACCESS_NETWORK_STATE")) && ((Gq.a(this.b).a()) || (this.h.v()) || ((Q.a(this.b)) && (hc.a(this.b, false))))) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      this.z = Boolean.valueOf(bool1);
      if (this.z.booleanValue())
      {
        bool1 = bool2;
        if (!g().c(A().A(), A().C())) {
          if (!TextUtils.isEmpty(A().C())) {
            bool1 = bool2;
          } else {
            bool1 = false;
          }
        }
        this.z = Boolean.valueOf(bool1);
      }
    }
    return this.z.booleanValue();
  }
  
  final void w()
  {
    tc localtc = this.g;
    throw new IllegalStateException("Unexpected call on client side");
  }
  
  final void x()
  {
    tc localtc = this.g;
  }
  
  public final a y()
  {
    a locala = this.r;
    if (locala != null) {
      return locala;
    }
    throw new IllegalStateException("Component not created");
  }
  
  public final Ha z()
  {
    b(this.q);
    return this.q;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */