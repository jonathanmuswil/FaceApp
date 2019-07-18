package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.e;
import com.google.android.gms.measurement.internal.Fa;
import com.google.android.gms.measurement.internal.Ha;
import com.google.android.gms.measurement.internal.a;
import com.google.android.gms.measurement.internal.aa;
import com.google.android.gms.measurement.internal.ab;
import com.google.android.gms.measurement.internal.ec;
import com.google.android.gms.measurement.internal.hc;
import com.google.android.gms.measurement.internal.za;
import gd;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement
{
  private static volatile AppMeasurement a;
  private final aa b;
  private final ab c;
  private final boolean d;
  
  private AppMeasurement(aa paramaa)
  {
    t.a(paramaa);
    this.b = paramaa;
    this.c = null;
    this.d = false;
  }
  
  private AppMeasurement(ab paramab)
  {
    t.a(paramab);
    this.c = paramab;
    this.b = null;
    this.d = true;
  }
  
  public static AppMeasurement a(Context paramContext, Bundle paramBundle)
  {
    if (a == null) {
      try
      {
        if (a == null)
        {
          ab localab = b(paramContext, paramBundle);
          if (localab != null)
          {
            paramContext = new com/google/android/gms/measurement/AppMeasurement;
            paramContext.<init>(localab);
            a = paramContext;
          }
          else
          {
            paramBundle = aa.a(paramContext, null, null, paramBundle);
            paramContext = new com/google/android/gms/measurement/AppMeasurement;
            paramContext.<init>(paramBundle);
            a = paramContext;
          }
        }
      }
      finally {}
    }
    return a;
  }
  
  private static AppMeasurement a(Context paramContext, String paramString1, String paramString2)
  {
    if (a == null) {
      try
      {
        if (a == null)
        {
          paramString1 = b(paramContext, null);
          if (paramString1 != null)
          {
            paramContext = new com/google/android/gms/measurement/AppMeasurement;
            paramContext.<init>(paramString1);
            a = paramContext;
          }
          else
          {
            paramContext = aa.a(paramContext, null, null, null);
            paramString1 = new com/google/android/gms/measurement/AppMeasurement;
            paramString1.<init>(paramContext);
            a = paramString1;
          }
        }
      }
      finally {}
    }
    return a;
  }
  
  private static ab b(Context paramContext, Bundle paramBundle)
  {
    try
    {
      Class localClass = Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
      paramContext = (ab)localClass.getDeclaredMethod("getScionFrontendApiImplementation", new Class[] { Context.class, Bundle.class }).invoke(null, new Object[] { paramContext, paramBundle });
      return paramContext;
    }
    catch (ClassNotFoundException|Exception paramContext) {}
    return null;
  }
  
  @Deprecated
  @Keep
  public static AppMeasurement getInstance(Context paramContext)
  {
    return a(paramContext, null, null);
  }
  
  public Map<String, Object> a(boolean paramBoolean)
  {
    if (this.d) {
      return this.c.a(null, null, paramBoolean);
    }
    Object localObject = this.b.z().c(paramBoolean);
    gd localgd = new gd(((List)localObject).size());
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      ec localec = (ec)((Iterator)localObject).next();
      localgd.put(localec.b, localec.y());
    }
    return localgd;
  }
  
  public void a(String paramString1, String paramString2, Object paramObject)
  {
    t.b(paramString1);
    if (this.d)
    {
      this.c.a(paramString1, paramString2, paramObject);
      return;
    }
    this.b.z().a(paramString1, paramString2, paramObject, true);
  }
  
  public final void b(boolean paramBoolean)
  {
    if (this.d)
    {
      this.c.setDataCollectionEnabled(paramBoolean);
      return;
    }
    this.b.z().b(paramBoolean);
  }
  
  @Keep
  public void beginAdUnitExposure(String paramString)
  {
    if (this.d)
    {
      this.c.f(paramString);
      return;
    }
    this.b.y().a(paramString, this.b.b().b());
  }
  
  @Keep
  public void clearConditionalUserProperty(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (this.d)
    {
      this.c.clearConditionalUserProperty(paramString1, paramString2, paramBundle);
      return;
    }
    this.b.z().a(paramString1, paramString2, paramBundle);
  }
  
  @Keep
  protected void clearConditionalUserPropertyAs(String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    if (this.d) {
      throw new IllegalStateException("Unexpected call on client side");
    }
    this.b.z().a(paramString1, paramString2, paramString3, paramBundle);
    throw null;
  }
  
  @Keep
  public void endAdUnitExposure(String paramString)
  {
    if (this.d)
    {
      this.c.g(paramString);
      return;
    }
    this.b.y().b(paramString, this.b.b().b());
  }
  
  @Keep
  public long generateEventId()
  {
    if (this.d) {
      return this.c.V();
    }
    return this.b.g().t();
  }
  
  @Keep
  public String getAppInstanceId()
  {
    if (this.d) {
      return this.c.ea();
    }
    return this.b.z().K();
  }
  
  @Keep
  public List<ConditionalUserProperty> getConditionalUserProperties(String paramString1, String paramString2)
  {
    if (this.d) {
      paramString1 = this.c.b(paramString1, paramString2);
    } else {
      paramString1 = this.b.z().b(paramString1, paramString2);
    }
    int i;
    if (paramString1 == null) {
      i = 0;
    } else {
      i = paramString1.size();
    }
    paramString2 = new ArrayList(i);
    paramString1 = paramString1.iterator();
    while (paramString1.hasNext()) {
      paramString2.add(new ConditionalUserProperty((Bundle)paramString1.next(), null));
    }
    return paramString2;
  }
  
  @Keep
  protected List<ConditionalUserProperty> getConditionalUserPropertiesAs(String paramString1, String paramString2, String paramString3)
  {
    if (this.d) {
      throw new IllegalStateException("Unexpected call on client side");
    }
    this.b.z().a(paramString1, paramString2, paramString3);
    throw null;
  }
  
  @Keep
  public String getCurrentScreenClass()
  {
    if (this.d) {
      return this.c.Z();
    }
    return this.b.z().A();
  }
  
  @Keep
  public String getCurrentScreenName()
  {
    if (this.d) {
      return this.c.W();
    }
    return this.b.z().B();
  }
  
  @Keep
  public String getGmpAppId()
  {
    if (this.d) {
      return this.c.X();
    }
    return this.b.z().C();
  }
  
  @Keep
  public int getMaxUserProperties(String paramString)
  {
    if (this.d) {
      return this.c.c(paramString);
    }
    this.b.z();
    t.b(paramString);
    return 25;
  }
  
  @Keep
  protected Map<String, Object> getUserProperties(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (this.d) {
      return this.c.a(paramString1, paramString2, paramBoolean);
    }
    return this.b.z().a(paramString1, paramString2, paramBoolean);
  }
  
  @Keep
  protected Map<String, Object> getUserPropertiesAs(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    if (this.d) {
      throw new IllegalStateException("Unexpected call on client side");
    }
    this.b.z().a(paramString1, paramString2, paramString3, paramBoolean);
    throw null;
  }
  
  @Keep
  public void logEventInternal(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (this.d)
    {
      this.c.a(paramString1, paramString2, paramBundle);
      return;
    }
    this.b.z().b(paramString1, paramString2, paramBundle);
  }
  
  public void registerOnMeasurementEventListener(OnEventListener paramOnEventListener)
  {
    if (this.d)
    {
      this.c.a(paramOnEventListener);
      return;
    }
    this.b.z().a(paramOnEventListener);
  }
  
  @Keep
  public void setConditionalUserProperty(ConditionalUserProperty paramConditionalUserProperty)
  {
    t.a(paramConditionalUserProperty);
    if (this.d)
    {
      this.c.e(ConditionalUserProperty.a(paramConditionalUserProperty));
      return;
    }
    this.b.z().a(ConditionalUserProperty.a(paramConditionalUserProperty));
  }
  
  @Keep
  protected void setConditionalUserPropertyAs(ConditionalUserProperty paramConditionalUserProperty)
  {
    t.a(paramConditionalUserProperty);
    if (this.d) {
      throw new IllegalStateException("Unexpected call on client side");
    }
    this.b.z().b(ConditionalUserProperty.a(paramConditionalUserProperty));
    throw null;
  }
  
  public static class ConditionalUserProperty
  {
    @Keep
    public boolean mActive;
    @Keep
    public String mAppId;
    @Keep
    public long mCreationTimestamp;
    @Keep
    public String mExpiredEventName;
    @Keep
    public Bundle mExpiredEventParams;
    @Keep
    public String mName;
    @Keep
    public String mOrigin;
    @Keep
    public long mTimeToLive;
    @Keep
    public String mTimedOutEventName;
    @Keep
    public Bundle mTimedOutEventParams;
    @Keep
    public String mTriggerEventName;
    @Keep
    public long mTriggerTimeout;
    @Keep
    public String mTriggeredEventName;
    @Keep
    public Bundle mTriggeredEventParams;
    @Keep
    public long mTriggeredTimestamp;
    @Keep
    public Object mValue;
    
    public ConditionalUserProperty() {}
    
    private ConditionalUserProperty(Bundle paramBundle)
    {
      t.a(paramBundle);
      this.mAppId = ((String)za.a(paramBundle, "app_id", String.class, null));
      this.mOrigin = ((String)za.a(paramBundle, "origin", String.class, null));
      this.mName = ((String)za.a(paramBundle, "name", String.class, null));
      this.mValue = za.a(paramBundle, "value", Object.class, null);
      this.mTriggerEventName = ((String)za.a(paramBundle, "trigger_event_name", String.class, null));
      Long localLong = Long.valueOf(0L);
      this.mTriggerTimeout = ((Long)za.a(paramBundle, "trigger_timeout", Long.class, localLong)).longValue();
      this.mTimedOutEventName = ((String)za.a(paramBundle, "timed_out_event_name", String.class, null));
      this.mTimedOutEventParams = ((Bundle)za.a(paramBundle, "timed_out_event_params", Bundle.class, null));
      this.mTriggeredEventName = ((String)za.a(paramBundle, "triggered_event_name", String.class, null));
      this.mTriggeredEventParams = ((Bundle)za.a(paramBundle, "triggered_event_params", Bundle.class, null));
      this.mTimeToLive = ((Long)za.a(paramBundle, "time_to_live", Long.class, localLong)).longValue();
      this.mExpiredEventName = ((String)za.a(paramBundle, "expired_event_name", String.class, null));
      this.mExpiredEventParams = ((Bundle)za.a(paramBundle, "expired_event_params", Bundle.class, null));
    }
    
    private final Bundle a()
    {
      Bundle localBundle = new Bundle();
      Object localObject = this.mAppId;
      if (localObject != null) {
        localBundle.putString("app_id", (String)localObject);
      }
      localObject = this.mOrigin;
      if (localObject != null) {
        localBundle.putString("origin", (String)localObject);
      }
      localObject = this.mName;
      if (localObject != null) {
        localBundle.putString("name", (String)localObject);
      }
      localObject = this.mValue;
      if (localObject != null) {
        za.a(localBundle, localObject);
      }
      localObject = this.mTriggerEventName;
      if (localObject != null) {
        localBundle.putString("trigger_event_name", (String)localObject);
      }
      localBundle.putLong("trigger_timeout", this.mTriggerTimeout);
      localObject = this.mTimedOutEventName;
      if (localObject != null) {
        localBundle.putString("timed_out_event_name", (String)localObject);
      }
      localObject = this.mTimedOutEventParams;
      if (localObject != null) {
        localBundle.putBundle("timed_out_event_params", (Bundle)localObject);
      }
      localObject = this.mTriggeredEventName;
      if (localObject != null) {
        localBundle.putString("triggered_event_name", (String)localObject);
      }
      localObject = this.mTriggeredEventParams;
      if (localObject != null) {
        localBundle.putBundle("triggered_event_params", (Bundle)localObject);
      }
      localBundle.putLong("time_to_live", this.mTimeToLive);
      localObject = this.mExpiredEventName;
      if (localObject != null) {
        localBundle.putString("expired_event_name", (String)localObject);
      }
      localObject = this.mExpiredEventParams;
      if (localObject != null) {
        localBundle.putBundle("expired_event_params", (Bundle)localObject);
      }
      localBundle.putLong("creation_timestamp", this.mCreationTimestamp);
      localBundle.putBoolean("active", this.mActive);
      localBundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
      return localBundle;
    }
  }
  
  public static abstract interface OnEventListener
    extends Fa
  {
    public abstract void onEvent(String paramString1, String paramString2, Bundle paramBundle, long paramLong);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/AppMeasurement.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */