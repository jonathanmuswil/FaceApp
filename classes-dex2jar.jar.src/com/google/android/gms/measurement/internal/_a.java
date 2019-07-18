package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.e;

@TargetApi(14)
final class _a
  implements Application.ActivityLifecycleCallbacks
{
  private _a(Ha paramHa) {}
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    try
    {
      this.a.c().A().a("onActivityCreated");
      Object localObject = paramActivity.getIntent();
      if (localObject != null)
      {
        Uri localUri = ((Intent)localObject).getData();
        if (localUri != null)
        {
          boolean bool = localUri.isHierarchical();
          if (bool)
          {
            if (paramBundle == null)
            {
              Bundle localBundle = this.a.e().a(localUri);
              this.a.e();
              if (hc.a((Intent)localObject)) {
                localObject = "gs";
              } else {
                localObject = "auto";
              }
              if (localBundle != null) {
                this.a.b((String)localObject, "_cmp", localBundle);
              }
            }
            localObject = localUri.getQueryParameter("referrer");
            if (TextUtils.isEmpty((CharSequence)localObject)) {
              return;
            }
            int i;
            if ((((String)localObject).contains("gclid")) && ((((String)localObject).contains("utm_campaign")) || (((String)localObject).contains("utm_source")) || (((String)localObject).contains("utm_medium")) || (((String)localObject).contains("utm_term")) || (((String)localObject).contains("utm_content")))) {
              i = 1;
            } else {
              i = 0;
            }
            if (i == 0)
            {
              this.a.c().z().a("Activity created with data 'referrer' param without gclid and at least one utm field");
              return;
            }
            this.a.c().z().a("Activity created with referrer", localObject);
            if (!TextUtils.isEmpty((CharSequence)localObject)) {
              this.a.a("auto", "_ldl", localObject, true);
            }
          }
        }
      }
    }
    catch (Exception localException)
    {
      this.a.c().s().a("Throwable caught in onActivityCreated", localException);
    }
    this.a.r().a(paramActivity, paramBundle);
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    this.a.r().a(paramActivity);
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    this.a.r().b(paramActivity);
    paramActivity = this.a.t();
    long l = paramActivity.b().b();
    paramActivity.n().a(new Rb(paramActivity, l));
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    this.a.r().c(paramActivity);
    paramActivity = this.a.t();
    long l = paramActivity.b().b();
    paramActivity.n().a(new Qb(paramActivity, l));
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    this.a.r().b(paramActivity, paramBundle);
  }
  
  public final void onActivityStarted(Activity paramActivity) {}
  
  public final void onActivityStopped(Activity paramActivity) {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */