package com.google.android.gms.measurement.internal;

import Fq;
import Gq;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.o;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class wc
  extends wa
{
  private Boolean b;
  private yc c = xc.a;
  private Boolean d;
  
  wc(aa paramaa)
  {
    super(paramaa);
    m.a(paramaa);
  }
  
  static String m()
  {
    return (String)m.o.a(null);
  }
  
  public static long r()
  {
    return ((Long)m.R.a(null)).longValue();
  }
  
  public static long s()
  {
    return ((Long)m.r.a(null)).longValue();
  }
  
  public static boolean u()
  {
    return ((Boolean)m.n.a(null)).booleanValue();
  }
  
  static boolean w()
  {
    return ((Boolean)m.na.a(null)).booleanValue();
  }
  
  public final long a(String paramString, m.a<Long> parama)
  {
    if (paramString == null) {
      return ((Long)parama.a(null)).longValue();
    }
    paramString = this.c.a(paramString, parama.a());
    if (TextUtils.isEmpty(paramString)) {
      return ((Long)parama.a(null)).longValue();
    }
    try
    {
      long l = ((Long)parama.a(Long.valueOf(Long.parseLong(paramString)))).longValue();
      return l;
    }
    catch (NumberFormatException paramString) {}
    return ((Long)parama.a(null)).longValue();
  }
  
  final void a(yc paramyc)
  {
    this.c = paramyc;
  }
  
  public final boolean a(m.a<Boolean> parama)
  {
    return d(null, parama);
  }
  
  final boolean a(String paramString)
  {
    return d(paramString, m.qa);
  }
  
  public final int b(String paramString, m.a<Integer> parama)
  {
    if (paramString == null) {
      return ((Integer)parama.a(null)).intValue();
    }
    paramString = this.c.a(paramString, parama.a());
    if (TextUtils.isEmpty(paramString)) {
      return ((Integer)parama.a(null)).intValue();
    }
    try
    {
      int i = ((Integer)parama.a(Integer.valueOf(Integer.parseInt(paramString)))).intValue();
      return i;
    }
    catch (NumberFormatException paramString) {}
    return ((Integer)parama.a(null)).intValue();
  }
  
  final boolean b(String paramString)
  {
    return d(paramString, m.ra);
  }
  
  public final double c(String paramString, m.a<Double> parama)
  {
    if (paramString == null) {
      return ((Double)parama.a(null)).doubleValue();
    }
    paramString = this.c.a(paramString, parama.a());
    if (TextUtils.isEmpty(paramString)) {
      return ((Double)parama.a(null)).doubleValue();
    }
    try
    {
      double d1 = ((Double)parama.a(Double.valueOf(Double.parseDouble(paramString)))).doubleValue();
      return d1;
    }
    catch (NumberFormatException paramString) {}
    return ((Double)parama.a(null)).doubleValue();
  }
  
  final boolean c(String paramString)
  {
    return d(paramString, m.wa);
  }
  
  public final int d(String paramString)
  {
    return b(paramString, m.C);
  }
  
  public final boolean d(String paramString, m.a<Boolean> parama)
  {
    if (paramString == null) {
      return ((Boolean)parama.a(null)).booleanValue();
    }
    paramString = this.c.a(paramString, parama.a());
    if (TextUtils.isEmpty(paramString)) {
      return ((Boolean)parama.a(null)).booleanValue();
    }
    return ((Boolean)parama.a(Boolean.valueOf(Boolean.parseBoolean(paramString)))).booleanValue();
  }
  
  final Boolean e(String paramString)
  {
    t.b(paramString);
    try
    {
      if (getContext().getPackageManager() == null)
      {
        c().s().a("Failed to load metadata: PackageManager is null");
        return null;
      }
      ApplicationInfo localApplicationInfo = Gq.a(getContext()).a(getContext().getPackageName(), 128);
      if (localApplicationInfo == null)
      {
        c().s().a("Failed to load metadata: ApplicationInfo is null");
        return null;
      }
      if (localApplicationInfo.metaData == null)
      {
        c().s().a("Failed to load metadata: Metadata bundle is null");
        return null;
      }
      if (!localApplicationInfo.metaData.containsKey(paramString)) {
        return null;
      }
      boolean bool = localApplicationInfo.metaData.getBoolean(paramString);
      return Boolean.valueOf(bool);
    }
    catch (PackageManager.NameNotFoundException paramString)
    {
      c().s().a("Failed to load metadata: Package name not found", paramString);
    }
    return null;
  }
  
  public final boolean e(String paramString, m.a<Boolean> parama)
  {
    return d(paramString, parama);
  }
  
  public final boolean f(String paramString)
  {
    return "1".equals(this.c.a(paramString, "gaia_collection_enabled"));
  }
  
  public final boolean g(String paramString)
  {
    return "1".equals(this.c.a(paramString, "measurement.event_sampling_enabled"));
  }
  
  final boolean h(String paramString)
  {
    return d(paramString, m.ba);
  }
  
  final boolean i(String paramString)
  {
    return d(paramString, m.da);
  }
  
  final boolean j(String paramString)
  {
    return d(paramString, m.ea);
  }
  
  final boolean k(String paramString)
  {
    return d(paramString, m.V);
  }
  
  public final long l()
  {
    a();
    return 15300L;
  }
  
  final String l(String paramString)
  {
    m.a locala = m.W;
    if (paramString == null) {
      return (String)locala.a(null);
    }
    return (String)locala.a(this.c.a(paramString, locala.a()));
  }
  
  final boolean m(String paramString)
  {
    return d(paramString, m.fa);
  }
  
  final boolean n(String paramString)
  {
    return d(paramString, m.ga);
  }
  
  public final boolean o()
  {
    if (this.d == null) {
      try
      {
        if (this.d == null)
        {
          Object localObject1 = getContext().getApplicationInfo();
          String str = o.a();
          if (localObject1 != null)
          {
            localObject1 = ((ApplicationInfo)localObject1).processName;
            boolean bool;
            if ((localObject1 != null) && (((String)localObject1).equals(str))) {
              bool = true;
            } else {
              bool = false;
            }
            this.d = Boolean.valueOf(bool);
          }
          if (this.d == null)
          {
            this.d = Boolean.TRUE;
            c().s().a("My process not in the list of running processes");
          }
        }
      }
      finally {}
    }
    return this.d.booleanValue();
  }
  
  final boolean o(String paramString)
  {
    return d(paramString, m.ia);
  }
  
  public final boolean p()
  {
    a();
    Boolean localBoolean = e("firebase_analytics_collection_deactivated");
    return (localBoolean != null) && (localBoolean.booleanValue());
  }
  
  final boolean p(String paramString)
  {
    return d(paramString, m.ja);
  }
  
  public final Boolean q()
  {
    a();
    return e("firebase_analytics_collection_enabled");
  }
  
  final boolean q(String paramString)
  {
    return d(paramString, m.ka);
  }
  
  final boolean r(String paramString)
  {
    return d(paramString, m.ma);
  }
  
  final boolean s(String paramString)
  {
    return d(paramString, m.la);
  }
  
  public final String t()
  {
    try
    {
      String str = (String)Class.forName("android.os.SystemProperties").getMethod("get", new Class[] { String.class, String.class }).invoke(null, new Object[] { "debug.firebase.analytics.app", "" });
      return str;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      c().s().a("SystemProperties.get() threw an exception", localInvocationTargetException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      c().s().a("Could not access SystemProperties.get()", localIllegalAccessException);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      c().s().a("Could not find SystemProperties.get() method", localNoSuchMethodException);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      c().s().a("Could not find SystemProperties class", localClassNotFoundException);
    }
    return "";
  }
  
  final boolean t(String paramString)
  {
    return d(paramString, m.oa);
  }
  
  final boolean u(String paramString)
  {
    return d(paramString, m.pa);
  }
  
  final boolean v()
  {
    if (this.b == null)
    {
      this.b = e("app_measurement_lite");
      if (this.b == null) {
        this.b = Boolean.valueOf(false);
      }
    }
    return (this.b.booleanValue()) || (!this.a.r());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/wc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */