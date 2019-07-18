package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

@yh
public final class sj
{
  private final AtomicReference<ThreadPoolExecutor> a = new AtomicReference(null);
  private final Object b = new Object();
  private String c = null;
  private String d = null;
  private final AtomicBoolean e = new AtomicBoolean(false);
  private final AtomicInteger f = new AtomicInteger(-1);
  private final AtomicReference<Object> g = new AtomicReference(null);
  private final AtomicReference<Object> h = new AtomicReference(null);
  private final ConcurrentMap<String, Method> i = new ConcurrentHashMap(9);
  private final AtomicReference<zq> j = new AtomicReference(null);
  private final List<FutureTask> k = new ArrayList();
  
  private static Bundle a(String paramString1, String paramString2)
  {
    Bundle localBundle = new Bundle();
    try
    {
      localBundle.putLong("_aeid", Long.parseLong(paramString1));
    }
    catch (NumberFormatException localNumberFormatException) {}catch (NullPointerException localNullPointerException) {}
    paramString1 = String.valueOf(paramString1);
    if (paramString1.length() != 0) {
      paramString1 = "Invalid event ID: ".concat(paramString1);
    } else {
      paramString1 = new String("Invalid event ID: ");
    }
    Tl.b(paramString1, localNullPointerException);
    if ("_ac".equals(paramString2)) {
      localBundle.putInt("_r", 1);
    }
    return localBundle;
  }
  
  private final Object a(String paramString, Context paramContext)
  {
    if (!a(paramContext, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
      return null;
    }
    paramContext = i(paramContext, paramString);
    try
    {
      paramContext = paramContext.invoke(this.g.get(), new Object[0]);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      a(paramContext, paramString, true);
    }
    return null;
  }
  
  private final <T> T a(String paramString, T paramT, Hj<T> paramHj)
  {
    synchronized (this.j)
    {
      zq localzq = (zq)this.j.get();
      if (localzq != null) {
        try
        {
          paramHj = paramHj.a((zq)this.j.get());
          return paramHj;
        }
        catch (Exception paramHj)
        {
          a(paramHj, paramString, false);
        }
      }
      return paramT;
    }
  }
  
  private final <T> Future<T> a(String paramString, Hj<T> paramHj)
  {
    synchronized (this.j)
    {
      FutureTask localFutureTask = new java/util/concurrent/FutureTask;
      xj localxj = new com/google/android/gms/internal/ads/xj;
      localxj.<init>(this, paramHj, paramString);
      localFutureTask.<init>(localxj);
      if (this.j.get() != null) {
        a().submit(localFutureTask);
      } else {
        this.k.add(localFutureTask);
      }
      return localFutureTask;
    }
  }
  
  private final ThreadPoolExecutor a()
  {
    if (this.a.get() == null)
    {
      AtomicReference localAtomicReference = this.a;
      ga localga = ra.Fa;
      int m = ((Integer)Kea.e().a(localga)).intValue();
      localga = ra.Fa;
      localAtomicReference.compareAndSet(null, new ThreadPoolExecutor(m, ((Integer)Kea.e().a(localga)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new Gj(this)));
    }
    return (ThreadPoolExecutor)this.a.get();
  }
  
  private final void a(Context paramContext, String paramString1, String paramString2)
  {
    if (!a(paramContext, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
      return;
    }
    paramContext = h(paramContext, paramString2);
    try
    {
      paramContext.invoke(this.g.get(), new Object[] { paramString1 });
      int m = String.valueOf(paramString2).length();
      int n = String.valueOf(paramString1).length();
      paramContext = new java/lang/StringBuilder;
      paramContext.<init>(m + 37 + n);
      paramContext.append("Invoke Firebase method ");
      paramContext.append(paramString2);
      paramContext.append(", Ad Unit Id: ");
      paramContext.append(paramString1);
      mk.f(paramContext.toString());
      return;
    }
    catch (Exception paramContext)
    {
      a(paramContext, paramString2, false);
    }
  }
  
  private final void a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    if (!f(paramContext)) {
      return;
    }
    paramString2 = a(paramString2, paramString1);
    if (paramBundle != null) {
      paramString2.putAll(paramBundle);
    }
    if (i(paramContext))
    {
      a("logEventInternal", new vj(paramString1, paramString2));
      return;
    }
    if (!a(paramContext, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
      return;
    }
    paramContext = h(paramContext);
    try
    {
      paramContext.invoke(this.g.get(), new Object[] { "am", paramString1, paramString2 });
      return;
    }
    catch (Exception paramContext)
    {
      a(paramContext, "logEventInternal", true);
    }
  }
  
  private final void a(Exception paramException, String paramString, boolean paramBoolean)
  {
    if (!this.e.get())
    {
      paramException = new StringBuilder(String.valueOf(paramString).length() + 30);
      paramException.append("Invoke Firebase method ");
      paramException.append(paramString);
      paramException.append(" error.");
      Tl.d(paramException.toString());
      if (paramBoolean)
      {
        Tl.d("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
        this.e.set(true);
      }
    }
  }
  
  private final void a(String paramString, Ij paramIj)
  {
    synchronized (this.j)
    {
      FutureTask localFutureTask = new java/util/concurrent/FutureTask;
      wj localwj = new com/google/android/gms/internal/ads/wj;
      localwj.<init>(this, paramIj, paramString);
      localFutureTask.<init>(localwj, null);
      if (this.j.get() != null) {
        localFutureTask.run();
      } else {
        this.k.add(localFutureTask);
      }
      return;
    }
  }
  
  private final boolean a(Context paramContext, String paramString, AtomicReference<Object> paramAtomicReference, boolean paramBoolean)
  {
    if (paramAtomicReference.get() == null) {
      try
      {
        paramAtomicReference.compareAndSet(null, paramContext.getClassLoader().loadClass(paramString).getDeclaredMethod("getInstance", new Class[] { Context.class }).invoke(null, new Object[] { paramContext }));
      }
      catch (Exception paramContext)
      {
        a(paramContext, "getInstance", paramBoolean);
        return false;
      }
    }
    return true;
  }
  
  private final Method h(Context paramContext)
  {
    Method localMethod = (Method)this.i.get("logEventInternal");
    if (localMethod != null) {
      return localMethod;
    }
    try
    {
      paramContext = paramContext.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[] { String.class, String.class, Bundle.class });
      this.i.put("logEventInternal", paramContext);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      a(paramContext, "logEventInternal", true);
    }
    return null;
  }
  
  private final Method h(Context paramContext, String paramString)
  {
    Method localMethod = (Method)this.i.get(paramString);
    if (localMethod != null) {
      return localMethod;
    }
    try
    {
      paramContext = paramContext.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(paramString, new Class[] { String.class });
      this.i.put(paramString, paramContext);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      a(paramContext, paramString, false);
    }
    return null;
  }
  
  private final Method i(Context paramContext, String paramString)
  {
    Method localMethod = (Method)this.i.get(paramString);
    if (localMethod != null) {
      return localMethod;
    }
    try
    {
      paramContext = paramContext.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(paramString, new Class[0]);
      this.i.put(paramString, paramContext);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      a(paramContext, paramString, false);
    }
    return null;
  }
  
  private static boolean i(Context paramContext)
  {
    ga localga = ra.Ga;
    if (!((Boolean)Kea.e().a(localga)).booleanValue())
    {
      localga = ra.Ha;
      if (!((Boolean)Kea.e().a(localga)).booleanValue()) {
        return false;
      }
    }
    localga = ra.Ia;
    if (((Boolean)Kea.e().a(localga)).booleanValue()) {}
    try
    {
      paramContext.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
      return false;
    }
    catch (ClassNotFoundException paramContext)
    {
      for (;;) {}
    }
    return true;
  }
  
  private final Method j(Context paramContext, String paramString)
  {
    Method localMethod = (Method)this.i.get(paramString);
    if (localMethod != null) {
      return localMethod;
    }
    try
    {
      paramContext = paramContext.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(paramString, new Class[] { Activity.class, String.class, String.class });
      this.i.put(paramString, paramContext);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      a(paramContext, paramString, false);
    }
    return null;
  }
  
  public final String a(Context paramContext)
  {
    if (!f(paramContext)) {
      return null;
    }
    synchronized (this.b)
    {
      if (this.c != null)
      {
        paramContext = this.c;
        return paramContext;
      }
      if (i(paramContext)) {
        this.c = ((String)a("getGmpAppId", this.c, Aj.a));
      } else {
        this.c = ((String)a("getGmpAppId", paramContext));
      }
      paramContext = this.c;
      return paramContext;
    }
  }
  
  public final void a(Context paramContext, String paramString)
  {
    if (!f(paramContext)) {
      return;
    }
    if (i(paramContext))
    {
      a("beginAdUnitExposure", new tj(paramString));
      return;
    }
    a(paramContext, paramString, "beginAdUnitExposure");
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    if (!f(paramContext)) {
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("_ai", paramString2);
    localBundle.putString("type", paramString3);
    localBundle.putInt("value", paramInt);
    a(paramContext, "_ar", paramString1, localBundle);
    paramContext = new StringBuilder(String.valueOf(paramString3).length() + 75);
    paramContext.append("Log a Firebase reward video event, reward type: ");
    paramContext.append(paramString3);
    paramContext.append(", reward value: ");
    paramContext.append(paramInt);
    mk.f(paramContext.toString());
  }
  
  public final String b(Context paramContext)
  {
    if (!f(paramContext)) {
      return null;
    }
    Object localObject = ra.Ea;
    long l = ((Long)Kea.e().a((ga)localObject)).longValue();
    if (i(paramContext))
    {
      if (l < 0L) {}
      try
      {
        return (String)a("getAppInstanceId", Bj.a).get();
      }
      catch (Exception paramContext)
      {
        if (!(paramContext instanceof TimeoutException)) {
          break label97;
        }
        return "TIME_OUT";
        return null;
      }
      paramContext = (String)a("getAppInstanceId", Cj.a).get(l, TimeUnit.MILLISECONDS);
      return paramContext;
    }
    label97:
    if (l < 0L) {
      return (String)a("getAppInstanceId", paramContext);
    }
    paramContext = a().submit(new Dj(this, paramContext));
    try
    {
      localObject = (String)paramContext.get(l, TimeUnit.MILLISECONDS);
      return (String)localObject;
    }
    catch (Exception localException)
    {
      paramContext.cancel(true);
      if ((localException instanceof TimeoutException)) {
        return "TIME_OUT";
      }
    }
    return null;
  }
  
  public final void b(Context paramContext, String paramString)
  {
    if (!f(paramContext)) {
      return;
    }
    if (i(paramContext))
    {
      a("endAdUnitExposure", new uj(paramString));
      return;
    }
    a(paramContext, paramString, "endAdUnitExposure");
  }
  
  public final String c(Context paramContext)
  {
    if (!f(paramContext)) {
      return null;
    }
    if (i(paramContext))
    {
      paramContext = (Long)a("getAdEventId", null, Ej.a);
      if (paramContext != null) {
        return Long.toString(paramContext.longValue());
      }
      return null;
    }
    paramContext = a("generateEventId", paramContext);
    if (paramContext != null) {
      return paramContext.toString();
    }
    return null;
  }
  
  public final void c(Context paramContext, String paramString)
  {
    if (!f(paramContext)) {
      return;
    }
    if (!(paramContext instanceof Activity)) {
      return;
    }
    if (i(paramContext))
    {
      a("setScreenName", new zj(paramContext, paramString));
      return;
    }
    if (!a(paramContext, "com.google.firebase.analytics.FirebaseAnalytics", this.h, false)) {
      return;
    }
    Method localMethod = j(paramContext, "setCurrentScreen");
    try
    {
      Activity localActivity = (Activity)paramContext;
      localMethod.invoke(this.h.get(), new Object[] { localActivity, paramString, paramContext.getPackageName() });
      return;
    }
    catch (Exception paramContext)
    {
      a(paramContext, "setCurrentScreen", false);
    }
  }
  
  public final String d(Context paramContext)
  {
    if (!f(paramContext)) {
      return null;
    }
    synchronized (this.b)
    {
      if (this.d != null)
      {
        paramContext = this.d;
        return paramContext;
      }
      if (i(paramContext)) {
        this.d = ((String)a("getAppIdOrigin", this.d, Fj.a));
      } else {
        this.d = "fa";
      }
      paramContext = this.d;
      return paramContext;
    }
  }
  
  public final void d(Context paramContext, String paramString)
  {
    a(paramContext, "_ac", paramString, null);
  }
  
  public final void e(Context paramContext, String paramString)
  {
    a(paramContext, "_ai", paramString, null);
  }
  
  public final void f(Context paramContext, String paramString)
  {
    a(paramContext, "_aq", paramString, null);
  }
  
  public final boolean f(Context paramContext)
  {
    ga localga = ra.za;
    if ((((Boolean)Kea.e().a(localga)).booleanValue()) && (!this.e.get()))
    {
      localga = ra.Ja;
      if (((Boolean)Kea.e().a(localga)).booleanValue()) {
        return true;
      }
      if (this.f.get() == -1)
      {
        Kea.a();
        if (!Hl.c(paramContext, 12451000))
        {
          Kea.a();
          if (Hl.c(paramContext))
          {
            Tl.d("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
            this.f.set(0);
            break label116;
          }
        }
        this.f.set(1);
      }
      label116:
      if (this.f.get() == 1) {
        return true;
      }
    }
    return false;
  }
  
  public final String g(Context paramContext)
  {
    if (!f(paramContext)) {
      return "";
    }
    if (i(paramContext)) {
      return (String)a("getCurrentScreenNameOrScreenClass", "", yj.a);
    }
    if (!a(paramContext, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
      return "";
    }
    try
    {
      String str1 = (String)i(paramContext, "getCurrentScreenName").invoke(this.g.get(), new Object[0]);
      String str2 = str1;
      if (str1 == null) {
        str2 = (String)i(paramContext, "getCurrentScreenClass").invoke(this.g.get(), new Object[0]);
      }
      if (str2 != null) {
        return str2;
      }
      return "";
    }
    catch (Exception paramContext)
    {
      a(paramContext, "getCurrentScreenName", false);
    }
    return "";
  }
  
  public final void g(Context paramContext, String paramString)
  {
    a(paramContext, "_aa", paramString, null);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */