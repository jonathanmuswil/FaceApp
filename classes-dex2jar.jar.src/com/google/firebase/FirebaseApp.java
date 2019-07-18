package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.c;
import android.util.Log;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.b.a;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.r.a;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.m;
import com.google.android.gms.common.util.o;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import gd;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import lQ;
import pQ;
import sQ;
import vQ;

public class FirebaseApp
{
  private static final List<String> a = Arrays.asList(new String[] { "com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId" });
  private static final List<String> b = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
  private static final List<String> c = Arrays.asList(new String[] { "com.google.android.gms.measurement.AppMeasurement" });
  private static final List<String> d = Arrays.asList(new String[0]);
  private static final Set<String> e = Collections.emptySet();
  private static final Object f = new Object();
  private static final Executor g = new d(null);
  static final Map<String, FirebaseApp> h = new gd();
  private final Context i;
  private final String j;
  private final d k;
  private final n l;
  private final SharedPreferences m;
  private final lQ n;
  private final AtomicBoolean o = new AtomicBoolean(false);
  private final AtomicBoolean p = new AtomicBoolean();
  private final AtomicBoolean q;
  private final List<Object> r = new CopyOnWriteArrayList();
  private final List<a> s = new CopyOnWriteArrayList();
  private final List<Object> t = new CopyOnWriteArrayList();
  private c u;
  
  protected FirebaseApp(Context paramContext, String paramString, d paramd)
  {
    t.a(paramContext);
    this.i = ((Context)paramContext);
    t.b(paramString);
    this.j = paramString;
    t.a(paramd);
    this.k = ((d)paramd);
    this.u = new pQ();
    this.m = paramContext.getSharedPreferences(a(paramString), 0);
    this.q = new AtomicBoolean(h());
    paramString = h.a(paramContext).a();
    this.l = new n(g, paramString, new e[] { e.a(paramContext, Context.class, new Class[0]), e.a(this, FirebaseApp.class, new Class[0]), e.a(paramd, d.class, new Class[0]), vQ.a("fire-android", ""), vQ.a("fire-core", "16.1.0"), sQ.b() });
    this.n = ((lQ)this.l.a(lQ.class));
  }
  
  public static FirebaseApp a(Context paramContext)
  {
    synchronized (f)
    {
      if (h.containsKey("[DEFAULT]"))
      {
        paramContext = getInstance();
        return paramContext;
      }
      d locald = d.a(paramContext);
      if (locald == null)
      {
        Log.d("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
        return null;
      }
      paramContext = a(paramContext, locald);
      return paramContext;
    }
  }
  
  public static FirebaseApp a(Context paramContext, d paramd)
  {
    return a(paramContext, paramd, "[DEFAULT]");
  }
  
  public static FirebaseApp a(Context paramContext, d paramd, String paramString)
  {
    b.a(paramContext);
    paramString = b(paramString);
    if (paramContext.getApplicationContext() != null) {
      paramContext = paramContext.getApplicationContext();
    }
    synchronized (f)
    {
      boolean bool;
      if (!h.containsKey(paramString)) {
        bool = true;
      } else {
        bool = false;
      }
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("FirebaseApp name ");
      ((StringBuilder)localObject2).append(paramString);
      ((StringBuilder)localObject2).append(" already exists!");
      t.b(bool, ((StringBuilder)localObject2).toString());
      t.a(paramContext, "Application context cannot be null.");
      localObject2 = new com/google/firebase/FirebaseApp;
      ((FirebaseApp)localObject2).<init>(paramContext, paramString, paramd);
      h.put(paramString, localObject2);
      ((FirebaseApp)localObject2).g();
      return (FirebaseApp)localObject2;
    }
  }
  
  private static String a(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("com.google.firebase.common.prefs:");
    localStringBuilder.append(paramString);
    return localStringBuilder.toString();
  }
  
  private <T> void a(Class<T> paramClass, T paramT, Iterable<String> paramIterable, boolean paramBoolean)
  {
    Iterator localIterator = paramIterable.iterator();
    while (localIterator.hasNext())
    {
      paramIterable = (String)localIterator.next();
      if (paramBoolean) {}
      try
      {
        if (d.contains(paramIterable))
        {
          localObject = Class.forName(paramIterable).getMethod("getInstance", new Class[] { paramClass });
          int i1 = ((Method)localObject).getModifiers();
          if ((Modifier.isPublic(i1)) && (Modifier.isStatic(i1))) {
            ((Method)localObject).invoke(null, new Object[] { paramT });
          }
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Failed to initialize ");
        ((StringBuilder)localObject).append(paramIterable);
        Log.wtf("FirebaseApp", ((StringBuilder)localObject).toString(), localIllegalAccessException);
      }
      catch (InvocationTargetException paramIterable)
      {
        Log.wtf("FirebaseApp", "Firebase API initialization failure.", paramIterable);
      }
      catch (NoSuchMethodException paramClass)
      {
        paramClass = new StringBuilder();
        paramClass.append(paramIterable);
        paramClass.append("#getInstance has been removed by Proguard. Add keep rule to prevent it.");
        throw new IllegalStateException(paramClass.toString());
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        if (!e.contains(paramIterable))
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(paramIterable);
          localStringBuilder.append(" is not linked. Skipping initialization.");
          Log.d("FirebaseApp", localStringBuilder.toString());
        }
        else
        {
          paramClass = new StringBuilder();
          paramClass.append(paramIterable);
          paramClass.append(" is missing, but is required. Check if it has been removed by Proguard.");
          throw new IllegalStateException(paramClass.toString());
        }
      }
    }
  }
  
  private void a(boolean paramBoolean)
  {
    Log.d("FirebaseApp", "Notifying background state change listeners.");
    Iterator localIterator = this.s.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).a(paramBoolean);
    }
  }
  
  private static String b(String paramString)
  {
    return paramString.trim();
  }
  
  private void f()
  {
    t.b(this.p.get() ^ true, "FirebaseApp was deleted");
  }
  
  private void g()
  {
    boolean bool = c.c(this.i);
    if (bool) {
      e.a(this.i);
    } else {
      this.l.a(e());
    }
    a(FirebaseApp.class, this, a, bool);
    if (e())
    {
      a(FirebaseApp.class, this, b, bool);
      a(Context.class, this.i, c, bool);
    }
  }
  
  public static FirebaseApp getInstance()
  {
    synchronized (f)
    {
      Object localObject2 = (FirebaseApp)h.get("[DEFAULT]");
      if (localObject2 != null) {
        return (FirebaseApp)localObject2;
      }
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("Default FirebaseApp is not initialized in this process ");
      ((StringBuilder)localObject2).append(o.a());
      ((StringBuilder)localObject2).append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
      localIllegalStateException.<init>(((StringBuilder)localObject2).toString());
      throw localIllegalStateException;
    }
  }
  
  private boolean h()
  {
    if (this.m.contains("firebase_data_collection_default_enabled")) {
      return this.m.getBoolean("firebase_data_collection_default_enabled", true);
    }
    try
    {
      Object localObject = this.i.getPackageManager();
      if (localObject != null)
      {
        localObject = ((PackageManager)localObject).getApplicationInfo(this.i.getPackageName(), 128);
        if ((localObject != null) && (((ApplicationInfo)localObject).metaData != null) && (((ApplicationInfo)localObject).metaData.containsKey("firebase_data_collection_default_enabled")))
        {
          boolean bool = ((ApplicationInfo)localObject).metaData.getBoolean("firebase_data_collection_default_enabled");
          return bool;
        }
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
    return true;
  }
  
  public <T> T a(Class<T> paramClass)
  {
    f();
    return (T)this.l.a(paramClass);
  }
  
  public Context b()
  {
    f();
    return this.i;
  }
  
  public String c()
  {
    f();
    return this.j;
  }
  
  public d d()
  {
    f();
    return this.k;
  }
  
  public boolean e()
  {
    return "[DEFAULT]".equals(c());
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof FirebaseApp)) {
      return false;
    }
    return this.j.equals(((FirebaseApp)paramObject).c());
  }
  
  public int hashCode()
  {
    return this.j.hashCode();
  }
  
  public boolean isDataCollectionDefaultEnabled()
  {
    f();
    return this.q.get();
  }
  
  public String toString()
  {
    r.a locala = r.a(this);
    locala.a("name", this.j);
    locala.a("options", this.k);
    return locala.toString();
  }
  
  public static abstract interface a
  {
    public abstract void a(boolean paramBoolean);
  }
  
  @TargetApi(14)
  private static class b
    implements b.a
  {
    private static AtomicReference<b> a = new AtomicReference();
    
    private static void b(Context paramContext)
    {
      if ((m.a()) && ((paramContext.getApplicationContext() instanceof Application)))
      {
        paramContext = (Application)paramContext.getApplicationContext();
        if (a.get() == null)
        {
          b localb = new b();
          if (a.compareAndSet(null, localb))
          {
            b.a(paramContext);
            b.a().a(localb);
          }
        }
      }
    }
    
    public void a(boolean paramBoolean)
    {
      synchronized ()
      {
        Object localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>(FirebaseApp.h.values());
        Iterator localIterator = ((ArrayList)localObject2).iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (FirebaseApp)localIterator.next();
          if (FirebaseApp.b((FirebaseApp)localObject2).get()) {
            FirebaseApp.a((FirebaseApp)localObject2, paramBoolean);
          }
        }
        return;
      }
    }
  }
  
  @Deprecated
  public static abstract interface c {}
  
  private static class d
    implements Executor
  {
    private static final Handler a = new Handler(Looper.getMainLooper());
    
    public void execute(Runnable paramRunnable)
    {
      a.post(paramRunnable);
    }
  }
  
  @TargetApi(24)
  private static class e
    extends BroadcastReceiver
  {
    private static AtomicReference<e> a = new AtomicReference();
    private final Context b;
    
    public e(Context paramContext)
    {
      this.b = paramContext;
    }
    
    private static void b(Context paramContext)
    {
      if (a.get() == null)
      {
        e locale = new e(paramContext);
        if (a.compareAndSet(null, locale)) {
          paramContext.registerReceiver(locale, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
      }
    }
    
    public void a()
    {
      this.b.unregisterReceiver(this);
    }
    
    public void onReceive(Context arg1, Intent paramIntent)
    {
      synchronized ()
      {
        paramIntent = FirebaseApp.h.values().iterator();
        while (paramIntent.hasNext()) {
          FirebaseApp.a((FirebaseApp)paramIntent.next());
        }
        a();
        return;
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/FirebaseApp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */