package com.google.firebase.iid;

import Bq;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kQ;
import mQ;
import nP;
import qP;
import wQ;

public class FirebaseInstanceId
{
  private static final long a = TimeUnit.HOURS.toSeconds(8L);
  private static z b;
  private static ScheduledThreadPoolExecutor c;
  private final Executor d;
  private final FirebaseApp e;
  private final q f;
  private b g;
  private final t h;
  private final E i;
  private boolean j = false;
  private final a k;
  
  private FirebaseInstanceId(FirebaseApp paramFirebaseApp, q paramq, Executor paramExecutor1, Executor paramExecutor2, mQ parammQ, wQ paramwQ)
  {
    if (q.a(paramFirebaseApp) != null) {
      try
      {
        Object localObject;
        if (b == null)
        {
          localObject = new com/google/firebase/iid/z;
          ((z)localObject).<init>(paramFirebaseApp.b());
          b = (z)localObject;
        }
        this.e = paramFirebaseApp;
        this.f = paramq;
        if (this.g == null)
        {
          localObject = (b)paramFirebaseApp.a(b.class);
          if ((localObject != null) && (((b)localObject).b())) {
            this.g = ((b)localObject);
          } else {
            this.g = new V(paramFirebaseApp, paramq, paramExecutor1, paramwQ);
          }
        }
        this.g = this.g;
        this.d = paramExecutor2;
        this.i = new E(b);
        this.k = new a(parammQ);
        this.h = new t(paramExecutor1);
        if (this.k.a()) {
          m();
        }
        return;
      }
      finally {}
    }
    throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
  }
  
  FirebaseInstanceId(FirebaseApp paramFirebaseApp, mQ parammQ, wQ paramwQ)
  {
    this(paramFirebaseApp, new q(paramFirebaseApp.b()), L.b(), L.b(), parammQ, paramwQ);
  }
  
  private final <T> T a(nP<T> paramnP)
    throws IOException
  {
    try
    {
      paramnP = qP.a(paramnP, 30000L, TimeUnit.MILLISECONDS);
      return paramnP;
    }
    catch (InterruptedException|TimeoutException paramnP)
    {
      throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    catch (ExecutionException paramnP)
    {
      Throwable localThrowable = paramnP.getCause();
      if ((localThrowable instanceof IOException))
      {
        if ("INSTANCE_ID_RESET".equals(localThrowable.getMessage())) {
          h();
        }
        throw ((IOException)localThrowable);
      }
      if ((localThrowable instanceof RuntimeException)) {
        throw ((RuntimeException)localThrowable);
      }
      throw new IOException(paramnP);
    }
  }
  
  static void a(Runnable paramRunnable, long paramLong)
  {
    try
    {
      if (c == null)
      {
        ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = new java/util/concurrent/ScheduledThreadPoolExecutor;
        Bq localBq = new Bq;
        localBq.<init>("FirebaseInstanceId");
        localScheduledThreadPoolExecutor.<init>(1, localBq);
        c = localScheduledThreadPoolExecutor;
      }
      c.schedule(paramRunnable, paramLong, TimeUnit.SECONDS);
      return;
    }
    finally {}
  }
  
  public static FirebaseInstanceId b()
  {
    return getInstance(FirebaseApp.getInstance());
  }
  
  private final nP<a> b(String paramString1, String paramString2)
  {
    paramString2 = c(paramString2);
    return qP.a(null).b(this.d, new Q(this, paramString1, paramString2));
  }
  
  private static A c(String paramString1, String paramString2)
  {
    return b.a("", paramString1, paramString2);
  }
  
  private static String c(String paramString)
  {
    if ((!paramString.isEmpty()) && (!paramString.equalsIgnoreCase("fcm")) && (!paramString.equalsIgnoreCase("gcm"))) {
      return paramString;
    }
    return "*";
  }
  
  static boolean g()
  {
    return (Log.isLoggable("FirebaseInstanceId", 3)) || ((Build.VERSION.SDK_INT == 23) && (Log.isLoggable("FirebaseInstanceId", 3)));
  }
  
  @Keep
  public static FirebaseInstanceId getInstance(FirebaseApp paramFirebaseApp)
  {
    return (FirebaseInstanceId)paramFirebaseApp.a(FirebaseInstanceId.class);
  }
  
  private final void l()
  {
    try
    {
      if (!this.j) {
        a(0L);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private final void m()
  {
    A localA = e();
    if ((k()) || (a(localA)) || (this.i.a())) {
      l();
    }
  }
  
  private static String n()
  {
    return q.a(b.b("").a());
  }
  
  public String a()
  {
    m();
    return n();
  }
  
  public String a(String paramString1, String paramString2)
    throws IOException
  {
    if (Looper.getMainLooper() != Looper.myLooper()) {
      return ((a)a(b(paramString1, paramString2))).a();
    }
    throw new IOException("MAIN_THREAD");
  }
  
  final void a(long paramLong)
  {
    try
    {
      long l = Math.min(Math.max(30L, paramLong << 1), a);
      B localB = new com/google/firebase/iid/B;
      localB.<init>(this, this.f, this.i, l);
      a(localB, paramLong);
      this.j = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  final void a(String paramString)
    throws IOException
  {
    Object localObject = e();
    if (!a((A)localObject))
    {
      String str = n();
      localObject = ((A)localObject).b;
      a(this.g.b(str, (String)localObject, paramString));
      return;
    }
    throw new IOException("token not available");
  }
  
  final void a(boolean paramBoolean)
  {
    try
    {
      this.j = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  final boolean a(A paramA)
  {
    return (paramA == null) || (paramA.b(this.f.b()));
  }
  
  final void b(String paramString)
    throws IOException
  {
    A localA = e();
    if (!a(localA))
    {
      String str = n();
      a(this.g.a(str, localA.b, paramString));
      return;
    }
    throw new IOException("token not available");
  }
  
  @Deprecated
  public String c()
  {
    A localA = e();
    if ((this.g.a()) || (a(localA))) {
      l();
    }
    return A.a(localA);
  }
  
  final FirebaseApp d()
  {
    return this.e;
  }
  
  final A e()
  {
    return c(q.a(this.e), "*");
  }
  
  final String f()
    throws IOException
  {
    return a(q.a(this.e), "*");
  }
  
  final void h()
  {
    try
    {
      b.b();
      if (this.k.a()) {
        l();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  final boolean i()
  {
    return this.g.b();
  }
  
  final void j()
  {
    b.c("");
    l();
  }
  
  final boolean k()
  {
    return this.g.a();
  }
  
  private final class a
  {
    private final boolean a;
    private final mQ b;
    private kQ<com.google.firebase.a> c;
    private Boolean d;
    
    a(mQ parammQ)
    {
      this.b = parammQ;
      this.a = c();
      this.d = b();
      if ((this.d == null) && (this.a))
      {
        this.c = new U(this);
        parammQ.a(com.google.firebase.a.class, this.c);
      }
    }
    
    private final Boolean b()
    {
      Object localObject1 = FirebaseInstanceId.a(FirebaseInstanceId.this).b();
      Object localObject2 = ((Context)localObject1).getSharedPreferences("com.google.firebase.messaging", 0);
      if (((SharedPreferences)localObject2).contains("auto_init")) {
        return Boolean.valueOf(((SharedPreferences)localObject2).getBoolean("auto_init", false));
      }
      try
      {
        localObject2 = ((Context)localObject1).getPackageManager();
        if (localObject2 != null)
        {
          localObject1 = ((PackageManager)localObject2).getApplicationInfo(((Context)localObject1).getPackageName(), 128);
          if ((localObject1 != null) && (((ApplicationInfo)localObject1).metaData != null) && (((ApplicationInfo)localObject1).metaData.containsKey("firebase_messaging_auto_init_enabled")))
          {
            boolean bool = ((ApplicationInfo)localObject1).metaData.getBoolean("firebase_messaging_auto_init_enabled");
            return Boolean.valueOf(bool);
          }
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        for (;;) {}
      }
      return null;
    }
    
    private final boolean c()
    {
      try
      {
        Class.forName("com.google.firebase.messaging.a");
        return true;
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        Context localContext = FirebaseInstanceId.a(FirebaseInstanceId.this).b();
        Object localObject = new Intent("com.google.firebase.MESSAGING_EVENT");
        ((Intent)localObject).setPackage(localContext.getPackageName());
        localObject = localContext.getPackageManager().resolveService((Intent)localObject, 0);
        if ((localObject != null) && (((ResolveInfo)localObject).serviceInfo != null)) {
          return true;
        }
      }
      return false;
    }
    
    final boolean a()
    {
      try
      {
        boolean bool;
        if (this.d != null)
        {
          bool = this.d.booleanValue();
          return bool;
        }
        if (this.a)
        {
          bool = FirebaseInstanceId.a(FirebaseInstanceId.this).isDataCollectionDefaultEnabled();
          if (bool) {
            return true;
          }
        }
        return false;
      }
      finally {}
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/iid/FirebaseInstanceId.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */