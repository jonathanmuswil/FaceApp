package com.facebook.appevents;

import Vn;
import _n;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.L;
import com.facebook.internal.H;
import com.facebook.internal.S;
import com.facebook.internal.T;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

public class AppEventsLogger
{
  private static final String a = "com.facebook.appevents.AppEventsLogger";
  private static ScheduledThreadPoolExecutor b;
  private static a c = a.a;
  private static Object d = new Object();
  private static String e;
  private static boolean f;
  private static String g;
  private final String h;
  private final b i;
  
  private AppEventsLogger(Context paramContext, String paramString, com.facebook.b paramb)
  {
    this(S.b(paramContext), paramString, paramb);
  }
  
  protected AppEventsLogger(String paramString1, String paramString2, com.facebook.b paramb)
  {
    T.c();
    this.h = paramString1;
    paramString1 = paramb;
    if (paramb == null) {
      paramString1 = com.facebook.b.n();
    }
    if ((com.facebook.b.w()) && ((paramString2 == null) || (paramString2.equals(paramString1.m()))))
    {
      this.i = new b(paramString1);
    }
    else
    {
      paramString1 = paramString2;
      if (paramString2 == null) {
        paramString1 = S.c(FacebookSdk.d());
      }
      this.i = new b(null, paramString1);
    }
    i();
  }
  
  public static String a(Context paramContext)
  {
    if (e == null) {
      synchronized (d)
      {
        if (e == null)
        {
          e = paramContext.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
          if (e == null)
          {
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localStringBuilder.append("XZ");
            localStringBuilder.append(UUID.randomUUID().toString());
            e = localStringBuilder.toString();
            paramContext.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", e).apply();
          }
        }
      }
    }
    return e;
  }
  
  static void a()
  {
    if (d() != a.b) {
      n.a(r.f);
    }
  }
  
  public static void a(Application paramApplication, String paramString)
  {
    if (FacebookSdk.isInitialized())
    {
      d.c();
      y.c();
      String str = paramString;
      if (paramString == null) {
        str = FacebookSdk.e();
      }
      FacebookSdk.b(paramApplication, str);
      Vn.a(paramApplication, str);
      return;
    }
    throw new com.facebook.p("The Facebook sdk must be initialized before calling activateApp");
  }
  
  public static void a(Context paramContext, String paramString)
  {
    if (!FacebookSdk.f()) {
      return;
    }
    paramContext = new AppEventsLogger(paramContext, paramString, null);
    b.execute(new p(paramContext));
  }
  
  private static void a(f paramf, b paramb)
  {
    n.a(paramb, paramf);
    if ((!paramf.a()) && (!f)) {
      if (paramf.c().equals("fb_mobile_activate_app")) {
        f = true;
      } else {
        H.a(L.e, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
      }
    }
  }
  
  private void a(String paramString, Double paramDouble, Bundle paramBundle, boolean paramBoolean, UUID paramUUID)
  {
    try
    {
      f localf = new com/facebook/appevents/f;
      localf.<init>(this.h, paramString, paramDouble, paramBundle, paramBoolean, paramUUID);
      a(localf, this.i);
    }
    catch (com.facebook.p paramString)
    {
      H.a(L.e, "AppEvents", "Invalid app event: %s", new Object[] { paramString.toString() });
    }
    catch (JSONException paramString)
    {
      H.a(L.e, "AppEvents", "JSON encoding for app event failed: '%s'", new Object[] { paramString.toString() });
    }
  }
  
  private void a(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle, boolean paramBoolean)
  {
    if (paramBigDecimal == null)
    {
      b("purchaseAmount cannot be null");
      return;
    }
    if (paramCurrency == null)
    {
      b("currency cannot be null");
      return;
    }
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    localBundle.putString("fb_currency", paramCurrency.getCurrencyCode());
    a("fb_mobile_purchase", Double.valueOf(paramBigDecimal.doubleValue()), localBundle, paramBoolean, Vn.l());
    a();
  }
  
  public static AppEventsLogger b(Context paramContext, String paramString)
  {
    return new AppEventsLogger(paramContext, paramString, null);
  }
  
  private static void b(String paramString)
  {
    H.a(L.f, "AppEvents", paramString);
  }
  
  static Executor c()
  {
    if (b == null) {
      i();
    }
    return b;
  }
  
  public static a d()
  {
    synchronized (d)
    {
      a locala = c;
      return locala;
    }
  }
  
  static String e()
  {
    synchronized (d)
    {
      String str = g;
      return str;
    }
  }
  
  public static String f()
  {
    return y.b();
  }
  
  public static String g()
  {
    return d.b();
  }
  
  public static void h() {}
  
  private static void i()
  {
    synchronized (d)
    {
      if (b != null) {
        return;
      }
      ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = new java/util/concurrent/ScheduledThreadPoolExecutor;
      localScheduledThreadPoolExecutor.<init>(1);
      b = localScheduledThreadPoolExecutor;
      ??? = new q();
      b.scheduleAtFixedRate((Runnable)???, 0L, 86400L, TimeUnit.SECONDS);
      return;
    }
  }
  
  public static AppEventsLogger newLogger(Context paramContext)
  {
    return new AppEventsLogger(paramContext, null, null);
  }
  
  public void a(String paramString)
  {
    a(paramString, null);
  }
  
  public void a(String paramString, double paramDouble, Bundle paramBundle)
  {
    a(paramString, Double.valueOf(paramDouble), paramBundle, false, Vn.l());
  }
  
  public void a(String paramString, Bundle paramBundle)
  {
    a(paramString, null, paramBundle, false, Vn.l());
  }
  
  protected void a(String paramString, BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    a(paramString, Double.valueOf(paramBigDecimal.doubleValue()), paramBundle, true, Vn.l());
  }
  
  public void a(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    if (_n.a()) {
      Log.w(a, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
    }
    a(paramBigDecimal, paramCurrency, paramBundle, false);
  }
  
  public void b()
  {
    n.a(r.a);
  }
  
  protected void b(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    a(paramBigDecimal, paramCurrency, paramBundle, true);
  }
  
  public void logSdkEvent(String paramString, Double paramDouble, Bundle paramBundle)
  {
    a(paramString, paramDouble, paramBundle, true, Vn.l());
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/appevents/AppEventsLogger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */