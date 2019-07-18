package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;
import com.google.android.gms.measurement.internal.Ca;
import com.google.android.gms.measurement.internal.eb;
import fQ.a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class b
{
  private static final Set<String> a = new HashSet(Arrays.asList(new String[] { "_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire" }));
  private static final List<String> b = Arrays.asList(new String[] { "_e", "_f", "_iap", "_s", "_au", "_ui", "_cd", "app_open" });
  private static final List<String> c = Arrays.asList(new String[] { "auto", "app", "am" });
  private static final List<String> d = Arrays.asList(new String[] { "_r", "_dbg" });
  private static final List<String> e = Arrays.asList((String[])com.google.android.gms.common.util.b.a(new String[][] { Ca.a, Ca.b }));
  private static final List<String> f = Arrays.asList(new String[] { "^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$" });
  
  public static fQ.a a(AppMeasurement.ConditionalUserProperty paramConditionalUserProperty)
  {
    fQ.a locala = new fQ.a();
    locala.a = paramConditionalUserProperty.mOrigin;
    locala.n = paramConditionalUserProperty.mActive;
    locala.m = paramConditionalUserProperty.mCreationTimestamp;
    locala.k = paramConditionalUserProperty.mExpiredEventName;
    Bundle localBundle = paramConditionalUserProperty.mExpiredEventParams;
    if (localBundle != null) {
      locala.l = new Bundle(localBundle);
    }
    locala.b = paramConditionalUserProperty.mName;
    locala.f = paramConditionalUserProperty.mTimedOutEventName;
    localBundle = paramConditionalUserProperty.mTimedOutEventParams;
    if (localBundle != null) {
      locala.g = new Bundle(localBundle);
    }
    locala.j = paramConditionalUserProperty.mTimeToLive;
    locala.h = paramConditionalUserProperty.mTriggeredEventName;
    localBundle = paramConditionalUserProperty.mTriggeredEventParams;
    if (localBundle != null) {
      locala.i = new Bundle(localBundle);
    }
    locala.o = paramConditionalUserProperty.mTriggeredTimestamp;
    locala.d = paramConditionalUserProperty.mTriggerEventName;
    locala.e = paramConditionalUserProperty.mTriggerTimeout;
    paramConditionalUserProperty = paramConditionalUserProperty.mValue;
    if (paramConditionalUserProperty != null) {
      locala.c = eb.a(paramConditionalUserProperty);
    }
    return locala;
  }
  
  public static boolean a(fQ.a parama)
  {
    if (parama == null) {
      return false;
    }
    String str = parama.a;
    if ((str != null) && (!str.isEmpty()))
    {
      Object localObject = parama.c;
      if ((localObject != null) && (eb.a(localObject) == null)) {
        return false;
      }
      if (!a(str)) {
        return false;
      }
      if (!a(str, parama.b)) {
        return false;
      }
      localObject = parama.k;
      if (localObject != null)
      {
        if (!a((String)localObject, parama.l)) {
          return false;
        }
        if (!a(str, parama.k, parama.l)) {
          return false;
        }
      }
      localObject = parama.h;
      if (localObject != null)
      {
        if (!a((String)localObject, parama.i)) {
          return false;
        }
        if (!a(str, parama.h, parama.i)) {
          return false;
        }
      }
      localObject = parama.f;
      if (localObject != null)
      {
        if (!a((String)localObject, parama.g)) {
          return false;
        }
        if (!a(str, parama.f, parama.g)) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public static boolean a(String paramString)
  {
    return !c.contains(paramString);
  }
  
  public static boolean a(String paramString, Bundle paramBundle)
  {
    if (b.contains(paramString)) {
      return false;
    }
    if (paramBundle != null)
    {
      paramString = d.iterator();
      while (paramString.hasNext()) {
        if (paramBundle.containsKey((String)paramString.next())) {
          return false;
        }
      }
    }
    return true;
  }
  
  public static boolean a(String paramString1, String paramString2)
  {
    if ((!"_ce1".equals(paramString2)) && (!"_ce2".equals(paramString2)))
    {
      if ("_ln".equals(paramString2)) {
        return (paramString1.equals("fcm")) || (paramString1.equals("fiam"));
      }
      if (e.contains(paramString2)) {
        return false;
      }
      paramString1 = f.iterator();
      while (paramString1.hasNext()) {
        if (paramString2.matches((String)paramString1.next())) {
          return false;
        }
      }
      return true;
    }
    return (paramString1.equals("fcm")) || (paramString1.equals("frc"));
  }
  
  public static boolean a(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (!"_cmp".equals(paramString2)) {
      return true;
    }
    if (!a(paramString1)) {
      return false;
    }
    if (paramBundle == null) {
      return false;
    }
    paramString2 = d.iterator();
    while (paramString2.hasNext()) {
      if (paramBundle.containsKey((String)paramString2.next())) {
        return false;
      }
    }
    int i = -1;
    int j = paramString1.hashCode();
    if (j != 101200)
    {
      if (j != 101230)
      {
        if ((j == 3142703) && (paramString1.equals("fiam"))) {
          i = 2;
        }
      }
      else if (paramString1.equals("fdl")) {
        i = 1;
      }
    }
    else if (paramString1.equals("fcm")) {
      i = 0;
    }
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2) {
          return false;
        }
        paramBundle.putString("_cis", "fiam_integration");
        return true;
      }
      paramBundle.putString("_cis", "fdl_integration");
      return true;
    }
    paramBundle.putString("_cis", "fcm_integration");
    return true;
  }
  
  public static AppMeasurement.ConditionalUserProperty b(fQ.a parama)
  {
    AppMeasurement.ConditionalUserProperty localConditionalUserProperty = new AppMeasurement.ConditionalUserProperty();
    localConditionalUserProperty.mOrigin = parama.a;
    localConditionalUserProperty.mActive = parama.n;
    localConditionalUserProperty.mCreationTimestamp = parama.m;
    localConditionalUserProperty.mExpiredEventName = parama.k;
    Bundle localBundle = parama.l;
    if (localBundle != null) {
      localConditionalUserProperty.mExpiredEventParams = new Bundle(localBundle);
    }
    localConditionalUserProperty.mName = parama.b;
    localConditionalUserProperty.mTimedOutEventName = parama.f;
    localBundle = parama.g;
    if (localBundle != null) {
      localConditionalUserProperty.mTimedOutEventParams = new Bundle(localBundle);
    }
    localConditionalUserProperty.mTimeToLive = parama.j;
    localConditionalUserProperty.mTriggeredEventName = parama.h;
    localBundle = parama.i;
    if (localBundle != null) {
      localConditionalUserProperty.mTriggeredEventParams = new Bundle(localBundle);
    }
    localConditionalUserProperty.mTriggeredTimestamp = parama.o;
    localConditionalUserProperty.mTriggerEventName = parama.d;
    localConditionalUserProperty.mTriggerTimeout = parama.e;
    parama = parama.c;
    if (parama != null) {
      localConditionalUserProperty.mValue = eb.a(parama);
    }
    return localConditionalUserProperty;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/analytics/connector/internal/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */