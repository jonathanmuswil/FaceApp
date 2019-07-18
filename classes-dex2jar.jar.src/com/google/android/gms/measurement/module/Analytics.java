package com.google.android.gms.measurement.module;

import android.content.Context;
import android.support.annotation.Keep;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.measurement.internal.aa;

public class Analytics
{
  private static volatile Analytics a;
  private final aa b;
  
  private Analytics(aa paramaa)
  {
    t.a(paramaa);
    this.b = paramaa;
  }
  
  @Keep
  public static Analytics getInstance(Context paramContext)
  {
    if (a == null) {
      try
      {
        if (a == null)
        {
          paramContext = aa.a(paramContext, null);
          Analytics localAnalytics = new com/google/android/gms/measurement/module/Analytics;
          localAnalytics.<init>(paramContext);
          a = localAnalytics;
        }
      }
      finally {}
    }
    return a;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/module/Analytics.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */