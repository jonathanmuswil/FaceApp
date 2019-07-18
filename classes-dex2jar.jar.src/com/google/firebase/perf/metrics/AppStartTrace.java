package com.google.firebase.perf.metrics;

import Aw;
import Aw.a;
import Iv;
import Tv;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.firebase.perf.internal.SessionManager;
import com.google.firebase.perf.internal.h;
import com.google.firebase.perf.internal.x;
import com.google.firebase.perf.provider.FirebasePerfProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import sx.a;
import wv;
import yv;

public class AppStartTrace
  implements Application.ActivityLifecycleCallbacks
{
  private static final long a = TimeUnit.MINUTES.toMicros(1L);
  private static volatile AppStartTrace b;
  private boolean c = false;
  private h d = null;
  private final wv e;
  private Context f;
  private WeakReference<Activity> g;
  private WeakReference<Activity> h;
  private boolean i = false;
  private Iv j = null;
  private Iv k = null;
  private Iv l = null;
  private boolean m = false;
  
  private AppStartTrace(h paramh, wv paramwv)
  {
    this.e = paramwv;
  }
  
  public static AppStartTrace a()
  {
    if (b != null) {
      return b;
    }
    return a(null, new wv());
  }
  
  private static AppStartTrace a(h paramh, wv paramwv)
  {
    if (b == null) {
      try
      {
        if (b == null)
        {
          paramh = new com/google/firebase/perf/metrics/AppStartTrace;
          paramh.<init>(null, paramwv);
          b = paramh;
        }
      }
      finally {}
    }
    return b;
  }
  
  private final void b()
  {
    try
    {
      boolean bool = this.c;
      if (!bool) {
        return;
      }
      ((Application)this.f).unregisterActivityLifecycleCallbacks(this);
      this.c = false;
      return;
    }
    finally {}
  }
  
  @Keep
  public static void setLauncherActivityOnCreateTime(String paramString) {}
  
  @Keep
  public static void setLauncherActivityOnResumeTime(String paramString) {}
  
  @Keep
  public static void setLauncherActivityOnStartTime(String paramString) {}
  
  public final void a(Context paramContext)
  {
    try
    {
      boolean bool = this.c;
      if (bool) {
        return;
      }
      paramContext = paramContext.getApplicationContext();
      if ((paramContext instanceof Application))
      {
        ((Application)paramContext).registerActivityLifecycleCallbacks(this);
        this.c = true;
        this.f = paramContext;
      }
      return;
    }
    finally {}
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    try
    {
      SessionManager.zzcl().zzc(Tv.b);
      if ((!this.m) && (this.j == null))
      {
        paramBundle = new java/lang/ref/WeakReference;
        paramBundle.<init>(paramActivity);
        this.g = paramBundle;
        paramActivity = new Iv;
        paramActivity.<init>();
        this.j = paramActivity;
        if (FirebasePerfProvider.zzcx().a(this.j) > a) {
          this.i = true;
        }
        return;
      }
      return;
    }
    finally {}
  }
  
  public void onActivityDestroyed(Activity paramActivity) {}
  
  public void onActivityPaused(Activity paramActivity) {}
  
  public void onActivityResumed(Activity paramActivity)
  {
    try
    {
      if ((!this.m) && (this.l == null) && (!this.i))
      {
        Object localObject1 = new java/lang/ref/WeakReference;
        ((WeakReference)localObject1).<init>(paramActivity);
        this.h = ((WeakReference)localObject1);
        localObject1 = new Iv;
        ((Iv)localObject1).<init>();
        this.l = ((Iv)localObject1);
        localObject1 = FirebasePerfProvider.zzcx();
        paramActivity = paramActivity.getClass().getName();
        long l1 = ((Iv)localObject1).a(this.l);
        int n = String.valueOf(paramActivity).length();
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>(n + 47);
        ((StringBuilder)localObject2).append("onResume(): ");
        ((StringBuilder)localObject2).append(paramActivity);
        ((StringBuilder)localObject2).append(": ");
        ((StringBuilder)localObject2).append(l1);
        ((StringBuilder)localObject2).append(" microseconds");
        Log.d("FirebasePerformance", ((StringBuilder)localObject2).toString());
        localObject2 = Aw.r();
        ((Aw.a)localObject2).a(yv.a.toString());
        ((Aw.a)localObject2).a(((Iv)localObject1).m());
        ((Aw.a)localObject2).b(((Iv)localObject1).a(this.l));
        paramActivity = new java/util/ArrayList;
        paramActivity.<init>(3);
        Aw.a locala = Aw.r();
        locala.a(yv.b.toString());
        locala.a(((Iv)localObject1).m());
        locala.b(((Iv)localObject1).a(this.j));
        paramActivity.add((Aw)locala.O());
        localObject1 = Aw.r();
        ((Aw.a)localObject1).a(yv.c.toString());
        ((Aw.a)localObject1).a(this.j.m());
        ((Aw.a)localObject1).b(this.j.a(this.k));
        paramActivity.add((Aw)((sx.a)localObject1).O());
        localObject1 = Aw.r();
        ((Aw.a)localObject1).a(yv.d.toString());
        ((Aw.a)localObject1).a(this.k.m());
        ((Aw.a)localObject1).b(this.k.a(this.l));
        paramActivity.add((Aw)((sx.a)localObject1).O());
        ((Aw.a)localObject2).a(paramActivity);
        ((Aw.a)localObject2).a(SessionManager.zzcl().zzcm().p());
        if (this.d == null) {
          this.d = h.a();
        }
        if (this.d != null) {
          this.d.a((Aw)((sx.a)localObject2).O(), Tv.d);
        }
        if (this.c) {
          b();
        }
        return;
      }
      return;
    }
    finally {}
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity)
  {
    try
    {
      if ((!this.m) && (this.k == null) && (!this.i))
      {
        paramActivity = new Iv;
        paramActivity.<init>();
        this.k = paramActivity;
        return;
      }
      return;
    }
    finally {}
  }
  
  public void onActivityStopped(Activity paramActivity) {}
  
  public static final class a
    implements Runnable
  {
    private final AppStartTrace a;
    
    public a(AppStartTrace paramAppStartTrace)
    {
      this.a = paramAppStartTrace;
    }
    
    public final void run()
    {
      if (AppStartTrace.a(this.a) == null) {
        AppStartTrace.a(this.a, true);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/metrics/AppStartTrace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */