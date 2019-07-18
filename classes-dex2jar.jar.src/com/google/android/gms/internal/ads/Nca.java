package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class nca
  implements Application.ActivityLifecycleCallbacks
{
  private final Application a;
  private final WeakReference<Application.ActivityLifecycleCallbacks> b;
  private boolean c = false;
  
  public nca(Application paramApplication, Application.ActivityLifecycleCallbacks paramActivityLifecycleCallbacks)
  {
    this.b = new WeakReference(paramActivityLifecycleCallbacks);
    this.a = paramApplication;
  }
  
  private final void a(vca paramvca)
  {
    try
    {
      Application.ActivityLifecycleCallbacks localActivityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks)this.b.get();
      if (localActivityLifecycleCallbacks != null)
      {
        paramvca.a(localActivityLifecycleCallbacks);
        return;
      }
      if (!this.c)
      {
        this.a.unregisterActivityLifecycleCallbacks(this);
        this.c = true;
      }
      return;
    }
    catch (Exception paramvca)
    {
      Tl.b("Error while dispatching lifecycle callback.", paramvca);
    }
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    a(new oca(this, paramActivity, paramBundle));
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    a(new uca(this, paramActivity));
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    a(new rca(this, paramActivity));
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    a(new qca(this, paramActivity));
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    a(new tca(this, paramActivity, paramBundle));
  }
  
  public final void onActivityStarted(Activity paramActivity)
  {
    a(new pca(this, paramActivity));
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    a(new sca(this, paramActivity));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */