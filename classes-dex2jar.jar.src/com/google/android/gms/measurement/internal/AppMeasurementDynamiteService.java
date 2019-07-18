package com.google.android.gms.measurement.internal;

import Hq;
import Iq;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.DynamiteApi;
import gd;
import java.util.Map;
import oK;
import qK;
import tK;
import wK;
import yK;

@DynamiteApi
public class AppMeasurementDynamiteService
  extends oK
{
  aa a = null;
  private Map<Integer, Fa> b = new gd();
  
  private final void a()
  {
    if (this.a != null) {
      return;
    }
    throw new IllegalStateException("Attempting to perform action before initialize.");
  }
  
  private final void a(qK paramqK, String paramString)
  {
    this.a.g().a(paramqK, paramString);
  }
  
  public void beginAdUnitExposure(String paramString, long paramLong)
    throws RemoteException
  {
    a();
    this.a.y().a(paramString, paramLong);
  }
  
  public void clearConditionalUserProperty(String paramString1, String paramString2, Bundle paramBundle)
    throws RemoteException
  {
    a();
    this.a.z().a(paramString1, paramString2, paramBundle);
  }
  
  public void endAdUnitExposure(String paramString, long paramLong)
    throws RemoteException
  {
    a();
    this.a.y().b(paramString, paramLong);
  }
  
  public void generateEventId(qK paramqK)
    throws RemoteException
  {
    a();
    long l = this.a.g().t();
    this.a.g().a(paramqK, l);
  }
  
  public void getAppInstanceId(qK paramqK)
    throws RemoteException
  {
    a();
    this.a.n().a(new kc(this, paramqK));
  }
  
  public void getCachedAppInstanceId(qK paramqK)
    throws RemoteException
  {
    a();
    a(paramqK, this.a.z().K());
  }
  
  public void getConditionalUserProperties(String paramString1, String paramString2, qK paramqK)
    throws RemoteException
  {
    a();
    this.a.n().a(new nc(this, paramqK, paramString1, paramString2));
  }
  
  public void getCurrentScreenClass(qK paramqK)
    throws RemoteException
  {
    a();
    a(paramqK, this.a.z().A());
  }
  
  public void getCurrentScreenName(qK paramqK)
    throws RemoteException
  {
    a();
    a(paramqK, this.a.z().B());
  }
  
  public void getGmpAppId(qK paramqK)
    throws RemoteException
  {
    a();
    a(paramqK, this.a.z().C());
  }
  
  public void getMaxUserProperties(String paramString, qK paramqK)
    throws RemoteException
  {
    a();
    this.a.z();
    t.b(paramString);
    this.a.g().a(paramqK, 25);
  }
  
  public void getTestFlag(qK paramqK, int paramInt)
    throws RemoteException
  {
    a();
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt == 4) {
              this.a.g().a(paramqK, this.a.z().E().booleanValue());
            }
            return;
          }
          this.a.g().a(paramqK, this.a.z().H().intValue());
          return;
        }
        hc localhc = this.a.g();
        double d = this.a.z().I().doubleValue();
        Bundle localBundle = new Bundle();
        localBundle.putDouble("r", d);
        try
        {
          paramqK.a(localBundle);
          return;
        }
        catch (RemoteException paramqK)
        {
          localhc.a.c().v().a("Error returning double value to wrapper", paramqK);
          return;
        }
      }
      this.a.g().a(paramqK, this.a.z().G().longValue());
      return;
    }
    this.a.g().a(paramqK, this.a.z().F());
  }
  
  public void getUserProperties(String paramString1, String paramString2, boolean paramBoolean, qK paramqK)
    throws RemoteException
  {
    a();
    this.a.n().a(new mc(this, paramqK, paramString1, paramString2, paramBoolean));
  }
  
  public void initForTests(Map paramMap)
    throws RemoteException
  {
    a();
  }
  
  public void initialize(Hq paramHq, yK paramyK, long paramLong)
    throws RemoteException
  {
    Context localContext = (Context)Iq.J(paramHq);
    paramHq = this.a;
    if (paramHq == null)
    {
      this.a = aa.a(localContext, paramyK);
      return;
    }
    paramHq.c().v().a("Attempting to initialize multiple times");
  }
  
  public void isDataCollectionEnabled(qK paramqK)
    throws RemoteException
  {
    a();
    this.a.n().a(new oc(this, paramqK));
  }
  
  public void logEvent(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, long paramLong)
    throws RemoteException
  {
    a();
    this.a.z().a(paramString1, paramString2, paramBundle, paramBoolean1, paramBoolean2, paramLong);
  }
  
  public void logEventAndBundle(String paramString1, String paramString2, Bundle paramBundle, qK paramqK, long paramLong)
    throws RemoteException
  {
    a();
    t.b(paramString2);
    Bundle localBundle;
    if (paramBundle != null) {
      localBundle = new Bundle(paramBundle);
    } else {
      localBundle = new Bundle();
    }
    localBundle.putString("_o", "app");
    paramString2 = new k(paramString2, new h(paramBundle), "app", paramLong);
    this.a.n().a(new lc(this, paramqK, paramString2, paramString1));
  }
  
  public void logHealthData(int paramInt, String paramString, Hq paramHq1, Hq paramHq2, Hq paramHq3)
    throws RemoteException
  {
    a();
    Object localObject = null;
    if (paramHq1 == null) {
      paramHq1 = null;
    } else {
      paramHq1 = Iq.J(paramHq1);
    }
    if (paramHq2 == null) {
      paramHq2 = null;
    } else {
      paramHq2 = Iq.J(paramHq2);
    }
    if (paramHq3 == null) {
      paramHq3 = (Hq)localObject;
    } else {
      paramHq3 = Iq.J(paramHq3);
    }
    this.a.c().a(paramInt, true, false, paramString, paramHq1, paramHq2, paramHq3);
  }
  
  public void onActivityCreated(Hq paramHq, Bundle paramBundle, long paramLong)
    throws RemoteException
  {
    a();
    _a local_a = this.a.z().c;
    this.a.c().v().a("Got on activity created");
    if (local_a != null)
    {
      this.a.z().D();
      local_a.onActivityCreated((Activity)Iq.J(paramHq), paramBundle);
    }
  }
  
  public void onActivityDestroyed(Hq paramHq, long paramLong)
    throws RemoteException
  {
    a();
    _a local_a = this.a.z().c;
    if (local_a != null)
    {
      this.a.z().D();
      local_a.onActivityDestroyed((Activity)Iq.J(paramHq));
    }
  }
  
  public void onActivityPaused(Hq paramHq, long paramLong)
    throws RemoteException
  {
    a();
    _a local_a = this.a.z().c;
    if (local_a != null)
    {
      this.a.z().D();
      local_a.onActivityPaused((Activity)Iq.J(paramHq));
    }
  }
  
  public void onActivityResumed(Hq paramHq, long paramLong)
    throws RemoteException
  {
    a();
    _a local_a = this.a.z().c;
    if (local_a != null)
    {
      this.a.z().D();
      local_a.onActivityResumed((Activity)Iq.J(paramHq));
    }
  }
  
  public void onActivitySaveInstanceState(Hq paramHq, qK paramqK, long paramLong)
    throws RemoteException
  {
    a();
    _a local_a = this.a.z().c;
    Bundle localBundle = new Bundle();
    if (local_a != null)
    {
      this.a.z().D();
      local_a.onActivitySaveInstanceState((Activity)Iq.J(paramHq), localBundle);
    }
    try
    {
      paramqK.a(localBundle);
      return;
    }
    catch (RemoteException paramHq)
    {
      this.a.c().v().a("Error returning bundle value to wrapper", paramHq);
    }
  }
  
  public void onActivityStarted(Hq paramHq, long paramLong)
    throws RemoteException
  {
    a();
    _a local_a = this.a.z().c;
    if (local_a != null)
    {
      this.a.z().D();
      local_a.onActivityStarted((Activity)Iq.J(paramHq));
    }
  }
  
  public void onActivityStopped(Hq paramHq, long paramLong)
    throws RemoteException
  {
    a();
    _a local_a = this.a.z().c;
    if (local_a != null)
    {
      this.a.z().D();
      local_a.onActivityStopped((Activity)Iq.J(paramHq));
    }
  }
  
  public void performAction(Bundle paramBundle, qK paramqK, long paramLong)
    throws RemoteException
  {
    a();
    paramqK.a(null);
  }
  
  public void registerOnMeasurementEventListener(tK paramtK)
    throws RemoteException
  {
    a();
    Fa localFa = (Fa)this.b.get(Integer.valueOf(paramtK.Pa()));
    Object localObject = localFa;
    if (localFa == null)
    {
      localObject = new b(paramtK);
      this.b.put(Integer.valueOf(paramtK.Pa()), localObject);
    }
    this.a.z().a((Fa)localObject);
  }
  
  public void resetAnalyticsData(long paramLong)
    throws RemoteException
  {
    a();
    this.a.z().a(paramLong);
  }
  
  public void setConditionalUserProperty(Bundle paramBundle, long paramLong)
    throws RemoteException
  {
    a();
    if (paramBundle == null)
    {
      this.a.c().s().a("Conditional user property must not be null");
      return;
    }
    this.a.z().a(paramBundle, paramLong);
  }
  
  public void setCurrentScreen(Hq paramHq, String paramString1, String paramString2, long paramLong)
    throws RemoteException
  {
    a();
    this.a.C().a((Activity)Iq.J(paramHq), paramString1, paramString2);
  }
  
  public void setDataCollectionEnabled(boolean paramBoolean)
    throws RemoteException
  {
    a();
    this.a.z().b(paramBoolean);
  }
  
  public void setEventInterceptor(tK paramtK)
    throws RemoteException
  {
    a();
    Ha localHa = this.a.z();
    paramtK = new a(paramtK);
    localHa.h();
    localHa.v();
    localHa.n().a(new Na(localHa, paramtK));
  }
  
  public void setInstanceIdProvider(wK paramwK)
    throws RemoteException
  {
    a();
  }
  
  public void setMeasurementEnabled(boolean paramBoolean, long paramLong)
    throws RemoteException
  {
    a();
    this.a.z().a(paramBoolean);
  }
  
  public void setMinimumSessionDuration(long paramLong)
    throws RemoteException
  {
    a();
    this.a.z().b(paramLong);
  }
  
  public void setSessionTimeoutDuration(long paramLong)
    throws RemoteException
  {
    a();
    this.a.z().c(paramLong);
  }
  
  public void setUserId(String paramString, long paramLong)
    throws RemoteException
  {
    a();
    this.a.z().a(null, "_id", paramString, true, paramLong);
  }
  
  public void setUserProperty(String paramString1, String paramString2, Hq paramHq, boolean paramBoolean, long paramLong)
    throws RemoteException
  {
    a();
    paramHq = Iq.J(paramHq);
    this.a.z().a(paramString1, paramString2, paramHq, paramBoolean, paramLong);
  }
  
  public void unregisterOnMeasurementEventListener(tK paramtK)
    throws RemoteException
  {
    a();
    Fa localFa = (Fa)this.b.remove(Integer.valueOf(paramtK.Pa()));
    Object localObject = localFa;
    if (localFa == null) {
      localObject = new b(paramtK);
    }
    this.a.z().b((Fa)localObject);
  }
  
  final class a
    implements Ea
  {
    private tK a;
    
    a(tK paramtK)
    {
      this.a = paramtK;
    }
    
    public final void a(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
    {
      try
      {
        this.a.onEvent(paramString1, paramString2, paramBundle, paramLong);
        return;
      }
      catch (RemoteException paramString1)
      {
        AppMeasurementDynamiteService.this.a.c().v().a("Event interceptor threw exception", paramString1);
      }
    }
  }
  
  final class b
    implements Fa
  {
    private tK a;
    
    b(tK paramtK)
    {
      this.a = paramtK;
    }
    
    public final void onEvent(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
    {
      try
      {
        this.a.onEvent(paramString1, paramString2, paramBundle, paramLong);
        return;
      }
      catch (RemoteException paramString1)
      {
        AppMeasurementDynamiteService.this.a.c().v().a("Event listener threw exception", paramString1);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/AppMeasurementDynamiteService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */