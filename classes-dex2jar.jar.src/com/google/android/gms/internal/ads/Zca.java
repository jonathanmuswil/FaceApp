package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.ads.internal.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@TargetApi(14)
final class zca
  implements Application.ActivityLifecycleCallbacks
{
  private Activity a;
  private Context b;
  private final Object c = new Object();
  private boolean d = true;
  private boolean e = false;
  private final List<Bca> f = new ArrayList();
  private final List<Pca> g = new ArrayList();
  private Runnable h;
  private boolean i = false;
  private long j;
  
  private final void a(Activity paramActivity)
  {
    synchronized (this.c)
    {
      if (!paramActivity.getClass().getName().startsWith("com.google.android.gms.ads")) {
        this.a = paramActivity;
      }
      return;
    }
  }
  
  public final Activity a()
  {
    return this.a;
  }
  
  public final void a(Application paramApplication, Context paramContext)
  {
    if (!this.i)
    {
      paramApplication.registerActivityLifecycleCallbacks(this);
      if ((paramContext instanceof Activity)) {
        a((Activity)paramContext);
      }
      this.b = paramApplication;
      paramApplication = ra.db;
      this.j = ((Long)Kea.e().a(paramApplication)).longValue();
      this.i = true;
    }
  }
  
  public final void a(Bca paramBca)
  {
    synchronized (this.c)
    {
      this.f.add(paramBca);
      return;
    }
  }
  
  public final Context b()
  {
    return this.b;
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    synchronized (this.c)
    {
      if (this.a == null) {
        return;
      }
      if (this.a.equals(paramActivity)) {
        this.a = null;
      }
      Iterator localIterator = this.g.iterator();
      while (localIterator.hasNext())
      {
        Pca localPca = (Pca)localIterator.next();
        try
        {
          if (localPca.a(paramActivity)) {
            localIterator.remove();
          }
        }
        catch (Exception localException)
        {
          k.g().a(localException, "AppActivityTracker.ActivityListener.onActivityDestroyed");
          Tl.b("", localException);
        }
      }
      return;
    }
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    a(paramActivity);
    synchronized (this.c)
    {
      Iterator localIterator = this.g.iterator();
      while (localIterator.hasNext())
      {
        Pca localPca = (Pca)localIterator.next();
        try
        {
          localPca.onActivityPaused(paramActivity);
        }
        catch (Exception localException)
        {
          k.g().a(localException, "AppActivityTracker.ActivityListener.onActivityPaused");
          Tl.b("", localException);
        }
      }
      this.e = true;
      paramActivity = this.h;
      if (paramActivity != null) {
        vk.a.removeCallbacks(paramActivity);
      }
      ??? = vk.a;
      paramActivity = new Aca(this);
      this.h = paramActivity;
      ((Handler)???).postDelayed(paramActivity, this.j);
      return;
    }
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    a(paramActivity);
    this.e = false;
    boolean bool = this.d;
    this.d = true;
    ??? = this.h;
    if (??? != null) {
      vk.a.removeCallbacks((Runnable)???);
    }
    synchronized (this.c)
    {
      Object localObject2 = this.g.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Pca localPca = (Pca)((Iterator)localObject2).next();
        try
        {
          localPca.onActivityResumed(paramActivity);
        }
        catch (Exception localException2)
        {
          k.g().a(localException2, "AppActivityTracker.ActivityListener.onActivityResumed");
          Tl.b("", localException2);
        }
      }
      if ((bool ^ true))
      {
        paramActivity = this.f.iterator();
        while (paramActivity.hasNext())
        {
          localObject2 = (Bca)paramActivity.next();
          try
          {
            ((Bca)localObject2).a(true);
          }
          catch (Exception localException1)
          {
            Tl.b("", localException1);
          }
        }
      }
      Tl.a("App is still foreground.");
      return;
    }
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity)
  {
    a(paramActivity);
  }
  
  public final void onActivityStopped(Activity paramActivity) {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */