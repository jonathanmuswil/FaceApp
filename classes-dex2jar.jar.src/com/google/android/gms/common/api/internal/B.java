package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.m;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b
  implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2
{
  private static final b a = new b();
  private final AtomicBoolean b = new AtomicBoolean();
  private final AtomicBoolean c = new AtomicBoolean();
  private final ArrayList<a> d = new ArrayList();
  private boolean e = false;
  
  public static b a()
  {
    return a;
  }
  
  public static void a(Application paramApplication)
  {
    synchronized (a)
    {
      if (!a.e)
      {
        paramApplication.registerActivityLifecycleCallbacks(a);
        paramApplication.registerComponentCallbacks(a);
        a.e = true;
      }
      return;
    }
  }
  
  private final void b(boolean paramBoolean)
  {
    synchronized (a)
    {
      ArrayList localArrayList = this.d;
      int i = localArrayList.size();
      int j = 0;
      while (j < i)
      {
        Object localObject1 = localArrayList.get(j);
        j++;
        ((a)localObject1).a(paramBoolean);
      }
      return;
    }
  }
  
  public final void a(a parama)
  {
    synchronized (a)
    {
      this.d.add(parama);
      return;
    }
  }
  
  @TargetApi(16)
  public final boolean a(boolean paramBoolean)
  {
    if (!this.c.get()) {
      if (m.c())
      {
        ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(localRunningAppProcessInfo);
        if ((!this.c.getAndSet(true)) && (localRunningAppProcessInfo.importance > 100)) {
          this.b.set(true);
        }
      }
      else
      {
        return paramBoolean;
      }
    }
    return b();
  }
  
  public final boolean b()
  {
    return this.b.get();
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    boolean bool = this.b.compareAndSet(true, false);
    this.c.set(true);
    if (bool) {
      b(false);
    }
  }
  
  public final void onActivityDestroyed(Activity paramActivity) {}
  
  public final void onActivityPaused(Activity paramActivity) {}
  
  public final void onActivityResumed(Activity paramActivity)
  {
    boolean bool = this.b.compareAndSet(true, false);
    this.c.set(true);
    if (bool) {
      b(false);
    }
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity) {}
  
  public final void onActivityStopped(Activity paramActivity) {}
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public final void onLowMemory() {}
  
  public final void onTrimMemory(int paramInt)
  {
    if ((paramInt == 20) && (this.b.compareAndSet(false, true)))
    {
      this.c.set(true);
      b(true);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(boolean paramBoolean);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */