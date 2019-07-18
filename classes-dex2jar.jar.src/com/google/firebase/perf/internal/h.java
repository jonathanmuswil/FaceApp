package com.google.firebase.perf.internal;

import Aw;
import Aw.a;
import Iw;
import Mv;
import Nv;
import Nv.a;
import Rv;
import Rv.a;
import Tv;
import Zp;
import Zp.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.d;
import com.google.firebase.iid.FirebaseInstanceId;
import dw;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jw;
import jw.a;
import pw;
import pw.a;
import sx;
import sx.a;
import xv;

public class h
{
  @SuppressLint({"StaticFieldLeak"})
  private static h a;
  private final ExecutorService b = new ThreadPoolExecutor(0, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
  private FirebaseApp c;
  private com.google.firebase.perf.a d;
  private FirebaseInstanceId e = null;
  private Context f;
  private Zp g = null;
  private String h;
  private final Rv.a i = Rv.o();
  private z j = null;
  private a k = null;
  private FeatureControl l = null;
  private boolean m;
  
  private h(ExecutorService paramExecutorService, Zp paramZp, z paramz, a parama, FirebaseInstanceId paramFirebaseInstanceId, FeatureControl paramFeatureControl)
  {
    this.b.execute(new i(this));
  }
  
  public static h a()
  {
    if (a == null) {
      try
      {
        h localh = a;
        if (localh == null) {
          try
          {
            FirebaseApp.getInstance();
            localh = new com/google/firebase/perf/internal/h;
            localh.<init>(null, null, null, null, null, null);
            a = localh;
          }
          catch (IllegalStateException localIllegalStateException)
          {
            return null;
          }
        }
      }
      finally {}
    }
    return a;
  }
  
  private static String a(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return "";
  }
  
  private final void a(pw parampw)
  {
    if (this.g == null) {
      return;
    }
    if (this.d.c())
    {
      if (!parampw.k().k())
      {
        Log.w("FirebasePerformance", "App Instance ID is null or empty, dropping the log");
        return;
      }
      Object localObject = this.f;
      ArrayList localArrayList = new ArrayList();
      if (parampw.l()) {
        localArrayList.add(new p(parampw.m()));
      }
      if (parampw.n()) {
        localArrayList.add(new o(parampw.o(), (Context)localObject));
      }
      if (parampw.j()) {
        localArrayList.add(new g(parampw.k()));
      }
      if (parampw.p()) {
        localArrayList.add(new n(parampw.q()));
      }
      boolean bool = localArrayList.isEmpty();
      int n = 0;
      int i1;
      if (bool)
      {
        Log.d("FirebasePerformance", "No validators found for PerfMetric.");
        i1 = n;
      }
      else
      {
        int i2 = localArrayList.size();
        i1 = 0;
        while (i1 < i2)
        {
          localObject = localArrayList.get(i1);
          i1++;
          if (!((u)localObject).a())
          {
            i1 = n;
            break label228;
          }
        }
        i1 = 1;
      }
      label228:
      if (i1 == 0)
      {
        Log.w("FirebasePerformance", "Unable to process the PerfMetric due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.");
        return;
      }
      if (!this.j.a(parampw))
      {
        if (parampw.n()) {
          this.k.a(xv.b.toString(), 1L);
        } else if (parampw.l()) {
          this.k.a(xv.a.toString(), 1L);
        }
        if (this.m)
        {
          if (parampw.n())
          {
            parampw = String.valueOf(parampw.o().j());
            if (parampw.length() != 0) {
              parampw = "Rate Limited NetworkRequestMetric - ".concat(parampw);
            } else {
              parampw = new String("Rate Limited NetworkRequestMetric - ");
            }
            Log.i("FirebasePerformance", parampw);
            return;
          }
          if (parampw.l())
          {
            parampw = String.valueOf(parampw.m().k());
            if (parampw.length() != 0) {
              parampw = "Rate Limited TraceMetric - ".concat(parampw);
            } else {
              parampw = new String("Rate Limited TraceMetric - ");
            }
            Log.i("FirebasePerformance", parampw);
          }
        }
        return;
      }
      parampw = parampw.d();
    }
    try
    {
      this.g.a(parampw).a();
      return;
    }
    catch (SecurityException parampw)
    {
      for (;;) {}
    }
  }
  
  private final void b()
  {
    this.c = FirebaseApp.getInstance();
    this.d = com.google.firebase.perf.a.b();
    this.f = this.c.b();
    this.h = this.c.d().b();
    Rv.a locala = this.i;
    locala.a(this.h);
    Object localObject2 = Nv.l();
    ((Nv.a)localObject2).a(this.f.getPackageName());
    ((Nv.a)localObject2).b("1.0.0.233854359");
    ((Nv.a)localObject2).c(a(this.f));
    locala.a((Nv.a)localObject2);
    c();
    if (this.g == null) {
      try
      {
        this.g = Zp.a(this.f, "FIREPERF");
      }
      catch (SecurityException localSecurityException)
      {
        localObject1 = String.valueOf(localSecurityException.getMessage());
        if (((String)localObject1).length() != 0) {
          localObject1 = "Caught SecurityException while init ClearcutLogger: ".concat((String)localObject1);
        } else {
          localObject1 = new String("Caught SecurityException while init ClearcutLogger: ");
        }
        Log.w("FirebasePerformance", (String)localObject1);
        this.g = null;
      }
    }
    RemoteConfigManager.zzbz().zzcb();
    localObject2 = this.j;
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = new z(this.f, 100L, 500L);
    }
    this.j = ((z)localObject1);
    localObject2 = this.k;
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = a.a();
    }
    this.k = ((a)localObject1);
    localObject2 = this.l;
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = FeatureControl.zzaq();
    }
    this.l = ((FeatureControl)localObject1);
    this.m = Mv.a(this.f);
  }
  
  private final void b(Aw paramAw, Tv paramTv)
  {
    if (this.d.c())
    {
      if (this.m)
      {
        long l1 = paramAw.j();
        Log.d("FirebasePerformance", String.format("Logging TraceMetric - %s %dms", new Object[] { paramAw.k(), Long.valueOf(l1 / 1000L) }));
      }
      Aw localAw = paramAw;
      if (!this.l.zzar())
      {
        paramAw = (Aw.a)paramAw.g();
        paramAw.g();
        paramAw = (Aw)paramAw.O();
        localAw = paramAw;
        if (this.m)
        {
          Log.d("FirebasePerformance", String.format("Sessions are disabled. Dropping all sessions from Trace - %s", new Object[] { paramAw.k() }));
          localAw = paramAw;
        }
      }
      c();
      pw.a locala = pw.r();
      paramAw = (Rv.a)this.i.clone();
      paramAw.a(paramTv);
      paramAw.a(this.d.a());
      locala.a(paramAw);
      locala.a(localAw);
      a((pw)locala.O());
    }
  }
  
  private final void b(dw paramdw, Tv paramTv)
  {
    if (this.d.c())
    {
      if (this.m) {
        Log.d("FirebasePerformance", String.format("Logging GaugeMetric. Cpu Metrics: %d, Memory Metrics: %d, Has Metadata: %b, Session ID: %s", new Object[] { Integer.valueOf(paramdw.n()), Integer.valueOf(paramdw.o()), Boolean.valueOf(paramdw.l()), paramdw.j() }));
      }
      if (!this.l.zzar())
      {
        if (this.m) {
          Log.d("FirebasePerformance", "Sessions are disabled. Not logging GaugeMetric.");
        }
        return;
      }
      pw.a locala = pw.r();
      c();
      Rv.a locala1 = this.i;
      locala1.a(paramTv);
      locala.a(locala1);
      locala.a(paramdw);
      a((pw)locala.O());
    }
  }
  
  private final void b(jw paramjw, Tv paramTv)
  {
    if (this.d.c())
    {
      if (this.m)
      {
        boolean bool = paramjw.y();
        long l1 = 0L;
        long l2;
        if (!bool) {
          l2 = 0L;
        } else {
          l2 = paramjw.z();
        }
        if (paramjw.p()) {
          l1 = paramjw.q();
        }
        Log.d("FirebasePerformance", String.format("Logging NetworkRequestMetric - %s %db %dms,", new Object[] { paramjw.j(), Long.valueOf(l1), Long.valueOf(l2 / 1000L) }));
      }
      jw localjw = paramjw;
      if (!this.l.zzar())
      {
        paramjw = (jw.a)paramjw.g();
        paramjw.l();
        paramjw = (jw)paramjw.O();
        localjw = paramjw;
        if (this.m)
        {
          Log.d("FirebasePerformance", String.format("Sessions are disabled. Dropping all sessions from Network Request - %s", new Object[] { paramjw.j() }));
          localjw = paramjw;
        }
      }
      c();
      pw.a locala = pw.r();
      paramjw = this.i;
      paramjw.a(paramTv);
      locala.a(paramjw);
      locala.a(localjw);
      a((pw)locala.O());
    }
  }
  
  private final void c()
  {
    if (this.i.g()) {
      return;
    }
    if (this.d.c())
    {
      if (this.e == null) {
        this.e = FirebaseInstanceId.b();
      }
      String str = this.e.a();
      if ((str != null) && (!str.isEmpty())) {
        this.i.b(str);
      }
    }
  }
  
  public final void a(Aw paramAw, Tv paramTv)
  {
    this.b.execute(new j(this, paramAw, paramTv));
    SessionManager.zzcl().zzcn();
  }
  
  public final void a(dw paramdw, Tv paramTv)
  {
    this.b.execute(new l(this, paramdw, paramTv));
    SessionManager.zzcl().zzcn();
  }
  
  public final void a(jw paramjw, Tv paramTv)
  {
    this.b.execute(new k(this, paramjw, paramTv));
    SessionManager.zzcl().zzcn();
  }
  
  public final void a(boolean paramBoolean)
  {
    this.b.execute(new m(this, paramBoolean));
  }
  
  public final void b(boolean paramBoolean)
  {
    this.j.a(paramBoolean);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/internal/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */