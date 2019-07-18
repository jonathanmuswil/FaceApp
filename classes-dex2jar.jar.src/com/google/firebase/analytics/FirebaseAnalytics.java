package com.google.firebase.analytics;

import QF;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.measurement.internal.Ha;
import com.google.android.gms.measurement.internal.aa;
import com.google.android.gms.measurement.internal.ab;
import com.google.android.gms.measurement.internal.gb;
import com.google.android.gms.measurement.internal.tc;
import com.google.android.gms.measurement.internal.v;
import com.google.android.gms.measurement.internal.x;
import com.google.firebase.iid.FirebaseInstanceId;

public final class FirebaseAnalytics
{
  private static volatile FirebaseAnalytics a;
  private final aa b;
  private final QF c;
  private final boolean d;
  private final Object e;
  
  private FirebaseAnalytics(QF paramQF)
  {
    t.a(paramQF);
    this.b = null;
    this.c = paramQF;
    this.d = true;
    this.e = new Object();
  }
  
  private FirebaseAnalytics(aa paramaa)
  {
    t.a(paramaa);
    this.b = paramaa;
    this.c = null;
    this.d = false;
    this.e = new Object();
  }
  
  @Keep
  public static FirebaseAnalytics getInstance(Context paramContext)
  {
    if (a == null) {
      try
      {
        if (a == null)
        {
          Object localObject;
          if (QF.b(paramContext))
          {
            paramContext = QF.a(paramContext);
            localObject = new com/google/firebase/analytics/FirebaseAnalytics;
            ((FirebaseAnalytics)localObject).<init>(paramContext);
            a = (FirebaseAnalytics)localObject;
          }
          else
          {
            localObject = aa.a(paramContext, null);
            paramContext = new com/google/firebase/analytics/FirebaseAnalytics;
            paramContext.<init>((aa)localObject);
            a = paramContext;
          }
        }
      }
      finally {}
    }
    return a;
  }
  
  @Keep
  public static ab getScionFrontendApiImplementation(Context paramContext, Bundle paramBundle)
  {
    if (!QF.b(paramContext)) {
      return null;
    }
    paramContext = QF.a(paramContext, null, null, null, paramBundle);
    if (paramContext == null) {
      return null;
    }
    return new a(paramContext);
  }
  
  public final void a(String paramString, Bundle paramBundle)
  {
    if (this.d)
    {
      this.c.a(paramString, paramBundle);
      return;
    }
    this.b.z().a("app", paramString, paramBundle, true);
  }
  
  public final void a(String paramString1, String paramString2)
  {
    if (this.d)
    {
      this.c.b(paramString1, paramString2);
      return;
    }
    this.b.z().a("app", paramString1, paramString2, false);
  }
  
  @Keep
  public final String getFirebaseInstanceId()
  {
    return FirebaseInstanceId.b().a();
  }
  
  @Keep
  public final void setCurrentScreen(Activity paramActivity, String paramString1, String paramString2)
  {
    if (this.d)
    {
      this.c.a(paramActivity, paramString1, paramString2);
      return;
    }
    if (!tc.a())
    {
      this.b.c().v().a("setCurrentScreen must be called from the main thread");
      return;
    }
    this.b.C().a(paramActivity, paramString1, paramString2);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/analytics/FirebaseAnalytics.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */