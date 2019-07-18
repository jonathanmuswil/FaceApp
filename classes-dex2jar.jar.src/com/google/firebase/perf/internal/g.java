package com.google.firebase.perf.internal;

import Nv;
import Rv;
import android.util.Log;

public final class g
  extends u
{
  private final Rv a;
  
  g(Rv paramRv)
  {
    this.a = paramRv;
  }
  
  public final boolean a()
  {
    Rv localRv = this.a;
    if (localRv == null) {
      Log.w("FirebasePerformance", "ApplicationInfo is null");
    }
    for (;;)
    {
      i = 0;
      break label142;
      if (!localRv.j())
      {
        Log.w("FirebasePerformance", "GoogleAppId is null");
      }
      else if (!this.a.k())
      {
        Log.w("FirebasePerformance", "AppInstanceId is null");
      }
      else if (!this.a.n())
      {
        Log.w("FirebasePerformance", "ApplicationProcessState is null");
      }
      else
      {
        if (!this.a.l()) {
          break;
        }
        if (!this.a.m().j())
        {
          Log.w("FirebasePerformance", "AndroidAppInfo.packageName is null");
        }
        else
        {
          if (this.a.m().k()) {
            break;
          }
          Log.w("FirebasePerformance", "AndroidAppInfo.sdkVersion is null");
        }
      }
    }
    int i = 1;
    label142:
    if (i == 0)
    {
      Log.w("FirebasePerformance", "ApplicationInfo is invalid");
      return false;
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/internal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */