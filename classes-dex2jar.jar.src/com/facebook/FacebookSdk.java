package com.facebook;

import Vn;
import Yn;
import Yn.a;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.AsyncTask;
import android.os.Bundle;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.C;
import com.facebook.internal.G;
import com.facebook.internal.J;
import com.facebook.internal.N;
import com.facebook.internal.S;
import com.facebook.internal.T;
import com.facebook.internal.b;
import com.facebook.internal.c;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

public final class FacebookSdk
{
  private static final String a = "com.facebook.FacebookSdk";
  private static final HashSet<L> b = new HashSet(Arrays.asList(new L[] { L.f }));
  private static Executor c;
  private static volatile String d;
  private static volatile String e;
  private static volatile String f;
  private static volatile Boolean g;
  private static volatile Boolean h;
  private static volatile Boolean i;
  private static volatile String j = "facebook.com";
  private static AtomicLong k = new AtomicLong(65536L);
  private static volatile boolean l = false;
  private static boolean m = false;
  private static G<File> n;
  private static Context o;
  private static int p = 64206;
  private static final Object q = new Object();
  private static String r = N.a();
  private static final BlockingQueue<Runnable> s = new LinkedBlockingQueue(10);
  private static final ThreadFactory t = new u();
  private static Boolean u = Boolean.valueOf(false);
  
  @Deprecated
  public static void a(Context paramContext, a parama)
  {
    try
    {
      if (u.booleanValue())
      {
        if (parama != null) {
          parama.a();
        }
        return;
      }
      T.a(paramContext, "applicationContext");
      T.a(paramContext, false);
      T.b(paramContext, false);
      o = paramContext.getApplicationContext();
      b(o);
      if (!S.b(d))
      {
        if (((o instanceof Application)) && (g.booleanValue())) {
          Vn.a((Application)o, d);
        }
        u = Boolean.valueOf(true);
        C.f();
        J.d();
        c.a(o);
        Object localObject1 = new com/facebook/internal/G;
        Object localObject2 = new com/facebook/v;
        ((v)localObject2).<init>();
        ((G)localObject1).<init>((Callable)localObject2);
        n = (G)localObject1;
        localObject2 = new java/util/concurrent/FutureTask;
        localObject1 = new com/facebook/w;
        ((w)localObject1).<init>(parama, paramContext);
        ((FutureTask)localObject2).<init>((Callable)localObject1);
        i().execute((Runnable)localObject2);
        return;
      }
      paramContext = new com/facebook/p;
      paramContext.<init>("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
      throw paramContext;
    }
    finally {}
  }
  
  static void a(Context paramContext, String paramString)
  {
    if ((paramContext != null) && (paramString != null)) {}
    try
    {
      b localb = b.a(paramContext);
      SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append("ping");
      localObject = ((StringBuilder)localObject).toString();
      long l1 = localSharedPreferences.getLong((String)localObject, 0L);
      try
      {
        paramContext = Yn.a(Yn.a.a, localb, AppEventsLogger.a(paramContext), a(paramContext), paramContext);
        paramContext = E.a(null, String.format("%s/activities", new Object[] { paramString }), paramContext, null);
        if (l1 != 0L) {
          return;
        }
        paramContext.b();
        paramContext = localSharedPreferences.edit();
        paramContext.putLong((String)localObject, System.currentTimeMillis());
        paramContext.apply();
      }
      catch (JSONException paramString)
      {
        paramContext = new com/facebook/p;
        paramContext.<init>("An error occurred while publishing install.", paramString);
        throw paramContext;
      }
      paramContext = new java/lang/IllegalArgumentException;
      paramContext.<init>("Both context and applicationId must be non-null");
      throw paramContext;
    }
    catch (Exception paramContext)
    {
      S.a("Facebook-publish", paramContext);
    }
  }
  
  public static boolean a(Context paramContext)
  {
    T.c();
    return paramContext.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
  }
  
  public static boolean a(L paramL)
  {
    synchronized (b)
    {
      boolean bool;
      if ((n()) && (b.contains(paramL))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  static void b(Context paramContext)
  {
    if (paramContext == null) {
      return;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
      if ((paramContext != null) && (paramContext.metaData != null))
      {
        if (d == null)
        {
          Object localObject = paramContext.metaData.get("com.facebook.sdk.ApplicationId");
          if ((localObject instanceof String))
          {
            localObject = (String)localObject;
            if (((String)localObject).toLowerCase(Locale.ROOT).startsWith("fb")) {
              d = ((String)localObject).substring(2);
            } else {
              d = (String)localObject;
            }
          }
          else if ((localObject instanceof Integer))
          {
            throw new p("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
          }
        }
        if (e == null) {
          e = paramContext.metaData.getString("com.facebook.sdk.ApplicationName");
        }
        if (f == null) {
          f = paramContext.metaData.getString("com.facebook.sdk.ClientToken");
        }
        if (p == 64206) {
          p = paramContext.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
        }
        if (g == null) {
          g = Boolean.valueOf(paramContext.metaData.getBoolean("com.facebook.sdk.AutoLogAppEventsEnabled", true));
        }
        if (h == null) {
          h = Boolean.valueOf(paramContext.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
        }
        if (i == null) {
          i = Boolean.valueOf(paramContext.metaData.getBoolean("com.facebook.sdk.AdvertiserIDCollectionEnabled", true));
        }
      }
      return;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
  }
  
  public static void b(Context paramContext, String paramString)
  {
    paramContext = paramContext.getApplicationContext();
    i().execute(new x(paramContext, paramString));
  }
  
  @Deprecated
  public static void c(Context paramContext)
  {
    try
    {
      a(paramContext, null);
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public static boolean c()
  {
    T.c();
    return i.booleanValue();
  }
  
  public static Context d()
  {
    T.c();
    return o;
  }
  
  public static String e()
  {
    T.c();
    return d;
  }
  
  public static boolean f()
  {
    T.c();
    return g.booleanValue();
  }
  
  public static int g()
  {
    T.c();
    return p;
  }
  
  public static String h()
  {
    T.c();
    return f;
  }
  
  public static Executor i()
  {
    synchronized (q)
    {
      if (c == null) {
        c = AsyncTask.THREAD_POOL_EXECUTOR;
      }
      return c;
    }
  }
  
  public static boolean isInitialized()
  {
    try
    {
      boolean bool = u.booleanValue();
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static String j()
  {
    return j;
  }
  
  public static String k()
  {
    S.a(a, String.format("getGraphApiVersion: %s", new Object[] { r }));
    return r;
  }
  
  public static long l()
  {
    T.c();
    return k.get();
  }
  
  public static String m()
  {
    return "4.39.0";
  }
  
  public static boolean n()
  {
    return l;
  }
  
  public static boolean o()
  {
    return m;
  }
  
  public static abstract interface a
  {
    public abstract void a();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/FacebookSdk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */