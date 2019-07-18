package com.google.firebase.perf.internal;

import Aw;
import Aw.a;
import Iv;
import Mv;
import Tv;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.X;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.firebase.perf.metrics.Trace;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import sx.a;
import wv;
import xv;
import yv;

public class a
  implements Application.ActivityLifecycleCallbacks
{
  private static volatile a a;
  private boolean b = false;
  private h c = null;
  private final wv d;
  private boolean e = true;
  private final WeakHashMap<Activity, Boolean> f = new WeakHashMap();
  private Iv g;
  private Iv h;
  private final Map<String, Long> i = new HashMap();
  private AtomicInteger j = new AtomicInteger(0);
  private Tv k = Tv.c;
  private Set<WeakReference<a>> l = new HashSet();
  private boolean m = false;
  private X n;
  private final WeakHashMap<Activity, Trace> o = new WeakHashMap();
  
  private a(h paramh, wv paramwv)
  {
    this.d = paramwv;
    this.m = e();
    if (this.m) {
      this.n = new X();
    }
  }
  
  public static a a()
  {
    if (a != null) {
      return a;
    }
    return a(null, new wv());
  }
  
  private static a a(h paramh, wv paramwv)
  {
    if (a == null) {
      try
      {
        if (a == null)
        {
          paramh = new com/google/firebase/perf/internal/a;
          paramh.<init>(null, paramwv);
          a = paramh;
        }
      }
      finally {}
    }
    return a;
  }
  
  private static String a(Activity paramActivity)
  {
    paramActivity = String.valueOf(paramActivity.getClass().getSimpleName());
    if (paramActivity.length() != 0) {
      return "_st_".concat(paramActivity);
    }
    return new String("_st_");
  }
  
  private final void a(Tv arg1)
  {
    this.k = ???;
    synchronized (this.l)
    {
      Iterator localIterator = this.l.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)((WeakReference)localIterator.next()).get();
        if (locala != null) {
          locala.zzb(this.k);
        } else {
          localIterator.remove();
        }
      }
      return;
    }
  }
  
  private final void a(String arg1, Iv paramIv1, Iv paramIv2)
  {
    d();
    Aw.a locala = Aw.r();
    locala.a(???);
    locala.a(paramIv1.m());
    locala.b(paramIv1.a(paramIv2));
    locala.a(SessionManager.zzcl().zzcm().p());
    int i1 = this.j.getAndSet(0);
    synchronized (this.i)
    {
      locala.a(this.i);
      if (i1 != 0) {
        locala.a(xv.c.toString(), i1);
      }
      this.i.clear();
      ??? = this.c;
      if (??? != null) {
        ???.a((Aw)locala.O(), Tv.d);
      }
      return;
    }
  }
  
  private final void a(boolean paramBoolean)
  {
    d();
    h localh = this.c;
    if (localh != null) {
      localh.a(paramBoolean);
    }
  }
  
  private final void d()
  {
    if (this.c == null) {
      this.c = h.a();
    }
  }
  
  private static boolean e()
  {
    try
    {
      Class.forName("android.support.v4.app.X");
      return true;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return false;
  }
  
  public final void a(int paramInt)
  {
    this.j.addAndGet(1);
  }
  
  public final void a(Context paramContext)
  {
    try
    {
      boolean bool = this.b;
      if (bool) {
        return;
      }
      paramContext = paramContext.getApplicationContext();
      if ((paramContext instanceof Application))
      {
        ((Application)paramContext).registerActivityLifecycleCallbacks(this);
        this.b = true;
      }
      return;
    }
    finally {}
  }
  
  public final void a(String paramString, long paramLong)
  {
    synchronized (this.i)
    {
      Long localLong = (Long)this.i.get(paramString);
      if (localLong == null) {
        this.i.put(paramString, Long.valueOf(1L));
      } else {
        this.i.put(paramString, Long.valueOf(localLong.longValue() + 1L));
      }
      return;
    }
  }
  
  public final void a(WeakReference<a> paramWeakReference)
  {
    synchronized (this.l)
    {
      this.l.add(paramWeakReference);
      return;
    }
  }
  
  public final void b(WeakReference<a> paramWeakReference)
  {
    synchronized (this.l)
    {
      this.l.remove(paramWeakReference);
      return;
    }
  }
  
  public final boolean b()
  {
    return this.e;
  }
  
  public final Tv c()
  {
    return this.k;
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity) {}
  
  public void onActivityPaused(Activity paramActivity) {}
  
  public void onActivityResumed(Activity paramActivity)
  {
    try
    {
      if (this.f.isEmpty())
      {
        Iv localIv = new Iv;
        localIv.<init>();
        this.h = localIv;
        this.f.put(paramActivity, Boolean.valueOf(true));
        if (this.e)
        {
          a(Tv.b);
          a(true);
          this.e = false;
          return;
        }
        a(Tv.b);
        a(true);
        a(yv.f.toString(), this.g, this.h);
        return;
      }
      this.f.put(paramActivity, Boolean.valueOf(true));
      return;
    }
    finally {}
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity)
  {
    try
    {
      if (this.m)
      {
        this.n.a(paramActivity);
        d();
        Trace localTrace = new com/google/firebase/perf/metrics/Trace;
        localTrace.<init>(a(paramActivity), this.c, this.d, this);
        localTrace.start();
        this.o.put(paramActivity, localTrace);
      }
      return;
    }
    finally
    {
      paramActivity = finally;
      throw paramActivity;
    }
  }
  
  public void onActivityStopped(Activity paramActivity)
  {
    try
    {
      if ((this.m) && (this.o.containsKey(paramActivity)))
      {
        Trace localTrace = (Trace)this.o.get(paramActivity);
        if (localTrace != null)
        {
          this.o.remove(paramActivity);
          Object localObject = this.n.b(paramActivity);
          int i3;
          if (localObject != null)
          {
            localObject = localObject[0];
            if (localObject != null)
            {
              int i1 = 0;
              int i2 = 0;
              i3 = 0;
              for (int i4 = 0;; i4 = i7)
              {
                i5 = i2;
                i6 = i3;
                i7 = i4;
                if (i1 >= ((SparseIntArray)localObject).size()) {
                  break;
                }
                i6 = ((SparseIntArray)localObject).keyAt(i1);
                i5 = ((SparseIntArray)localObject).valueAt(i1);
                i2 += i5;
                i7 = i4;
                if (i6 > 700) {
                  i7 = i4 + i5;
                }
                i4 = i3;
                if (i6 > 16) {
                  i4 = i3 + i5;
                }
                i1++;
                i3 = i4;
              }
            }
          }
          int i5 = 0;
          int i6 = 0;
          int i7 = 0;
          if (i5 > 0) {
            localTrace.incrementCounter(xv.d.toString(), i5);
          }
          if (i6 > 0) {
            localTrace.incrementCounter(xv.e.toString(), i6);
          }
          if (i7 > 0) {
            localTrace.incrementCounter(xv.f.toString(), i7);
          }
          if (Mv.a(paramActivity.getApplicationContext()))
          {
            String str = a(paramActivity);
            i3 = String.valueOf(str).length();
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>(i3 + 81);
            ((StringBuilder)localObject).append("sendScreenTrace name:");
            ((StringBuilder)localObject).append(str);
            ((StringBuilder)localObject).append(" _fr_tot:");
            ((StringBuilder)localObject).append(i5);
            ((StringBuilder)localObject).append(" _fr_slo:");
            ((StringBuilder)localObject).append(i6);
            ((StringBuilder)localObject).append(" _fr_fzn:");
            ((StringBuilder)localObject).append(i7);
            Log.d("FirebasePerformance", ((StringBuilder)localObject).toString());
          }
          localTrace.stop();
        }
      }
      if (this.f.containsKey(paramActivity))
      {
        this.f.remove(paramActivity);
        if (this.f.isEmpty())
        {
          paramActivity = new Iv;
          paramActivity.<init>();
          this.g = paramActivity;
          a(Tv.c);
          a(false);
          a(yv.e.toString(), this.h, this.g);
        }
      }
      return;
    }
    finally {}
  }
  
  public static abstract interface a
  {
    public abstract void zzb(Tv paramTv);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */