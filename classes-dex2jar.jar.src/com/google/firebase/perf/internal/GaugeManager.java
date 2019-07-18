package com.google.firebase.perf.internal;

import Pv;
import Tv;
import Wv;
import android.content.Context;
import android.support.annotation.Keep;
import android.util.Log;
import aw;
import aw.a;
import dw;
import dw.a;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import pv;
import sv;
import sx.a;

@Keep
public class GaugeManager
{
  private static GaugeManager zzdj = new GaugeManager();
  private final FeatureControl zzcy;
  private final ScheduledExecutorService zzdk;
  private final pv zzdl;
  private final sv zzdm;
  private h zzdn;
  private t zzdo;
  private Tv zzdp = Tv.a;
  private String zzdq = null;
  private ScheduledFuture zzdr = null;
  private final ConcurrentLinkedQueue<a> zzds = new ConcurrentLinkedQueue();
  
  private GaugeManager()
  {
    this(Executors.newSingleThreadScheduledExecutor(), null, FeatureControl.zzaq(), null, pv.a(), sv.e());
  }
  
  private GaugeManager(ScheduledExecutorService paramScheduledExecutorService, h paramh, FeatureControl paramFeatureControl, t paramt, pv parampv, sv paramsv)
  {
    this.zzdk = paramScheduledExecutorService;
    this.zzdn = null;
    this.zzcy = paramFeatureControl;
    this.zzdo = null;
    this.zzdl = parampv;
    this.zzdm = paramsv;
  }
  
  private static void zza(boolean paramBoolean1, boolean paramBoolean2, pv parampv, sv paramsv)
  {
    if (paramBoolean1) {
      parampv.c();
    } else {
      Log.d("FirebasePerformance", "Cpu Metrics collection is disabled. Did not collect Cpu Metric.");
    }
    if (paramBoolean2)
    {
      paramsv.d();
      return;
    }
    Log.d("FirebasePerformance", "Memory Metrics collection is disabled. Did not collect Memory Metric.");
  }
  
  private final void zzb(String paramString, Tv paramTv)
  {
    dw.a locala = dw.p();
    while (!this.zzdl.h.isEmpty()) {
      locala.a((Wv)this.zzdl.h.poll());
    }
    while (!this.zzdm.c.isEmpty()) {
      locala.a((Pv)this.zzdm.c.poll());
    }
    locala.a(paramString);
    zzc((dw)locala.O(), paramTv);
  }
  
  public static GaugeManager zzbe()
  {
    try
    {
      GaugeManager localGaugeManager = zzdj;
      return localGaugeManager;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static void zzbh()
  {
    zza(true, true, pv.a(), sv.e());
  }
  
  private final void zzc(dw paramdw, Tv paramTv)
  {
    h localh1 = this.zzdn;
    h localh2 = localh1;
    if (localh1 == null) {
      localh2 = h.a();
    }
    this.zzdn = localh2;
    localh2 = this.zzdn;
    if (localh2 != null)
    {
      localh2.a(paramdw, paramTv);
      while (!this.zzds.isEmpty())
      {
        paramdw = (a)this.zzds.poll();
        this.zzdn.a(a.a(paramdw), a.b(paramdw));
      }
    }
    this.zzds.add(new a(paramdw, paramTv));
  }
  
  public final void zza(String paramString, Tv paramTv)
  {
    if (this.zzdq != null) {
      zzbf();
    }
    int i = s.a[paramTv.ordinal()];
    if (i != 1)
    {
      if (i != 2) {
        l1 = -1L;
      } else {
        l1 = this.zzcy.zzav();
      }
    }
    else {
      l1 = this.zzcy.zzax();
    }
    long l2;
    if (l1 != -1L)
    {
      l2 = l1;
      if (l1 > 0L) {}
    }
    else
    {
      l2 = -1L;
    }
    boolean bool = this.zzcy.zzas();
    int j = 0;
    if (!bool) {
      Log.d("FirebasePerformance", "Cpu Metrics collection is disabled. Did not collect Cpu Metrics.");
    }
    for (;;)
    {
      i = 0;
      break label145;
      if (l2 != -1L) {
        break;
      }
      Log.d("FirebasePerformance", "Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
    }
    this.zzdl.a(l2);
    i = 1;
    label145:
    if (i == 0) {
      l2 = -1L;
    }
    i = s.a[paramTv.ordinal()];
    if (i != 1)
    {
      if (i != 2) {
        l1 = -1L;
      } else {
        l1 = this.zzcy.zzaw();
      }
    }
    else {
      l1 = this.zzcy.zzay();
    }
    long l3;
    if (l1 != -1L)
    {
      l3 = l1;
      if (l1 > 0L) {}
    }
    else
    {
      l3 = -1L;
    }
    if (!this.zzcy.zzat())
    {
      Log.d("FirebasePerformance", "Memory Metrics collection is disabled. Did not collect Memory Metrics.");
      i = j;
    }
    else if (l3 == -1L)
    {
      Log.d("FirebasePerformance", "Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
      i = j;
    }
    else
    {
      this.zzdm.a(l3);
      i = 1;
    }
    long l1 = l2;
    if (i != 0)
    {
      if (l2 != -1L) {
        l3 = Math.min(l2, l3);
      }
      l1 = l3;
    }
    if (l1 == -1L)
    {
      Log.w("FirebasePerformance", "Invalid gauge collection frequency. Unable to start collecting Gauges.");
      return;
    }
    this.zzdq = paramString;
    this.zzdp = paramTv;
    try
    {
      ScheduledExecutorService localScheduledExecutorService = this.zzdk;
      q localq = new com/google/firebase/perf/internal/q;
      localq.<init>(this, paramString, paramTv);
      l1 *= 20L;
      this.zzdr = localScheduledExecutorService.scheduleAtFixedRate(localq, l1, l1, TimeUnit.MILLISECONDS);
      return;
    }
    catch (RejectedExecutionException paramString)
    {
      paramString = String.valueOf(paramString.getMessage());
      if (paramString.length() != 0) {
        paramString = "Unable to start collecting Gauges: ".concat(paramString);
      } else {
        paramString = new String("Unable to start collecting Gauges: ");
      }
      Log.w("FirebasePerformance", paramString);
    }
  }
  
  public final void zzbf()
  {
    String str = this.zzdq;
    if (str == null) {
      return;
    }
    Tv localTv = this.zzdp;
    this.zzdl.b();
    this.zzdm.c();
    ScheduledFuture localScheduledFuture = this.zzdr;
    if (localScheduledFuture != null) {
      localScheduledFuture.cancel(false);
    }
    this.zzdk.schedule(new r(this, str, localTv), 20L, TimeUnit.MILLISECONDS);
    this.zzdq = null;
    this.zzdp = Tv.a;
  }
  
  public final void zzbg()
  {
    zza(this.zzcy.zzas(), this.zzcy.zzat(), this.zzdl, this.zzdm);
  }
  
  final boolean zzc(String paramString, Tv paramTv)
  {
    if (this.zzdo != null)
    {
      dw.a locala = dw.p();
      locala.a(paramString);
      paramString = aw.k();
      paramString.a(this.zzdo.a());
      paramString.a(this.zzdo.d());
      paramString.b(this.zzdo.b());
      paramString.c(this.zzdo.c());
      locala.a((aw)paramString.O());
      zzc((dw)locala.O(), paramTv);
      return true;
    }
    return false;
  }
  
  public final void zze(Context paramContext)
  {
    this.zzdo = new t(paramContext);
  }
  
  final class a
  {
    private final dw a;
    private final Tv b;
    
    a(dw paramdw, Tv paramTv)
    {
      this.a = paramdw;
      this.b = paramTv;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/internal/GaugeManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */