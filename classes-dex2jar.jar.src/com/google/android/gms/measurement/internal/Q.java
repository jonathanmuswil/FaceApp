package com.google.android.gms.measurement.internal;

import Eq;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.f;

public final class q
  extends Db
{
  private String c;
  private String d;
  private int e;
  private String f;
  private String g;
  private long h;
  private long i;
  private long j;
  private int k;
  private String l;
  private String m;
  
  q(aa paramaa, long paramLong)
  {
    super(paramaa);
    this.j = paramLong;
  }
  
  /* Error */
  private final String F()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 36	com/google/android/gms/measurement/internal/q:getContext	()Landroid/content/Context;
    //   4: invokevirtual 42	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   7: ldc 44
    //   9: invokevirtual 50	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   12: astore_1
    //   13: aload_1
    //   14: ifnonnull +5 -> 19
    //   17: aconst_null
    //   18: areturn
    //   19: aload_1
    //   20: ldc 52
    //   22: iconst_1
    //   23: anewarray 54	java/lang/Class
    //   26: dup
    //   27: iconst_0
    //   28: ldc 38
    //   30: aastore
    //   31: invokevirtual 58	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   34: aconst_null
    //   35: iconst_1
    //   36: anewarray 60	java/lang/Object
    //   39: dup
    //   40: iconst_0
    //   41: aload_0
    //   42: invokevirtual 36	com/google/android/gms/measurement/internal/q:getContext	()Landroid/content/Context;
    //   45: aastore
    //   46: invokevirtual 66	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   49: astore_2
    //   50: aload_2
    //   51: ifnonnull +5 -> 56
    //   54: aconst_null
    //   55: areturn
    //   56: aload_1
    //   57: ldc 68
    //   59: iconst_0
    //   60: anewarray 54	java/lang/Class
    //   63: invokevirtual 58	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   66: aload_2
    //   67: iconst_0
    //   68: anewarray 60	java/lang/Object
    //   71: invokevirtual 66	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   74: checkcast 70	java/lang/String
    //   77: astore_1
    //   78: aload_1
    //   79: areturn
    //   80: astore_1
    //   81: aload_0
    //   82: invokevirtual 73	com/google/android/gms/measurement/internal/q:c	()Lcom/google/android/gms/measurement/internal/v;
    //   85: invokevirtual 79	com/google/android/gms/measurement/internal/v:x	()Lcom/google/android/gms/measurement/internal/x;
    //   88: ldc 81
    //   90: invokevirtual 87	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;)V
    //   93: aconst_null
    //   94: areturn
    //   95: astore_1
    //   96: aload_0
    //   97: invokevirtual 73	com/google/android/gms/measurement/internal/q:c	()Lcom/google/android/gms/measurement/internal/v;
    //   100: invokevirtual 90	com/google/android/gms/measurement/internal/v:w	()Lcom/google/android/gms/measurement/internal/x;
    //   103: ldc 92
    //   105: invokevirtual 87	com/google/android/gms/measurement/internal/x:a	(Ljava/lang/String;)V
    //   108: aconst_null
    //   109: areturn
    //   110: astore_1
    //   111: goto -3 -> 108
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	this	q
    //   12	67	1	localObject1	Object
    //   80	1	1	localException1	Exception
    //   95	1	1	localException2	Exception
    //   110	1	1	localClassNotFoundException	ClassNotFoundException
    //   49	18	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   56	78	80	java/lang/Exception
    //   19	50	95	java/lang/Exception
    //   0	13	110	java/lang/ClassNotFoundException
  }
  
  final String A()
  {
    v();
    return this.l;
  }
  
  final String B()
  {
    v();
    return this.c;
  }
  
  final String C()
  {
    v();
    return this.m;
  }
  
  final int D()
  {
    v();
    return this.e;
  }
  
  final int E()
  {
    v();
    return this.k;
  }
  
  final pc a(String paramString)
  {
    j();
    h();
    String str1 = B();
    String str2 = A();
    v();
    String str3 = this.d;
    long l1 = D();
    v();
    String str4 = this.f;
    long l2 = g().l();
    v();
    j();
    if (this.h == 0L) {
      this.h = this.a.g().a(getContext(), getContext().getPackageName());
    }
    long l3 = this.h;
    boolean bool1 = this.a.d();
    boolean bool2 = f().y;
    j();
    h();
    String str5;
    if ((g().m(this.c)) && (!this.a.d())) {
      str5 = null;
    } else {
      str5 = F();
    }
    v();
    long l4 = this.i;
    long l5 = this.a.t();
    int n = E();
    Object localObject = g();
    ((wc)localObject).h();
    localObject = ((wc)localObject).e("google_analytics_adid_collection_enabled");
    if ((localObject != null) && (!((Boolean)localObject).booleanValue())) {
      bool3 = false;
    } else {
      bool3 = true;
    }
    boolean bool4 = Boolean.valueOf(bool3).booleanValue();
    localObject = g();
    ((wc)localObject).h();
    localObject = ((wc)localObject).e("google_analytics_ssaid_collection_enabled");
    if ((localObject != null) && (!((Boolean)localObject).booleanValue())) {
      bool3 = false;
    } else {
      bool3 = true;
    }
    boolean bool5 = Boolean.valueOf(bool3).booleanValue();
    boolean bool3 = f().y();
    String str6 = C();
    if (g().e(B(), m.ya))
    {
      localObject = g().e("google_analytics_default_allow_ad_personalization_signals");
      if (localObject != null)
      {
        localObject = Boolean.valueOf(((Boolean)localObject).booleanValue() ^ true);
        break label365;
      }
    }
    localObject = null;
    label365:
    return new pc(str1, str2, str3, l1, str4, l2, l3, paramString, bool1, bool2 ^ true, str5, l4, l5, n, bool4, bool5, bool3, str6, (Boolean)localObject, this.j);
  }
  
  protected final boolean y()
  {
    return true;
  }
  
  protected final void z()
  {
    String str1 = getContext().getPackageName();
    Object localObject1 = getContext().getPackageManager();
    Object localObject3 = "Unknown";
    String str2 = "";
    Object localObject4 = "unknown";
    int n = Integer.MIN_VALUE;
    if (localObject1 == null) {
      c().s().a("PackageManager is null, app identity information might be inaccurate. appId", v.a(str1));
    }
    String str3;
    for (;;)
    {
      localObject1 = "Unknown";
      Object localObject5 = localObject4;
      i1 = n;
      break label268;
      try
      {
        localObject5 = ((PackageManager)localObject1).getInstallerPackageName(str1);
        localObject4 = localObject5;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        c().s().a("Error retrieving app installer package name. appId", v.a(str1));
      }
      if (localObject4 == null)
      {
        localObject6 = "manual_install";
      }
      else
      {
        localObject6 = localObject4;
        if ("com.android.vending".equals(localObject4)) {
          localObject6 = "";
        }
      }
      try
      {
        PackageInfo localPackageInfo = ((PackageManager)localObject1).getPackageInfo(getContext().getPackageName(), 0);
        localObject4 = localObject6;
        if (localPackageInfo != null)
        {
          localObject4 = ((PackageManager)localObject1).getApplicationLabel(localPackageInfo.applicationInfo);
          if (!TextUtils.isEmpty((CharSequence)localObject4)) {
            localObject4 = ((CharSequence)localObject4).toString();
          } else {
            localObject4 = "Unknown";
          }
          try
          {
            String str4 = localPackageInfo.versionName;
            localObject3 = str4;
            i1 = localPackageInfo.versionCode;
            localObject1 = localObject4;
            localObject3 = str4;
          }
          catch (PackageManager.NameNotFoundException localNameNotFoundException1)
          {
            localObject2 = localObject4;
            localObject4 = localObject3;
            localObject3 = localObject2;
          }
          c().s().a("Error retrieving package info. appId, appName", v.a(str1), localObject3);
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException2)
      {
        str3 = "Unknown";
      }
    }
    Object localObject2 = localObject3;
    int i1 = n;
    localObject3 = str3;
    label268:
    this.c = str1;
    this.f = ((String)localObject6);
    this.d = ((String)localObject3);
    this.e = i1;
    this.g = ((String)localObject2);
    this.h = 0L;
    a();
    Object localObject6 = f.a(getContext());
    int i2 = 1;
    if ((localObject6 != null) && (((Status)localObject6).B())) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if ((!TextUtils.isEmpty(this.a.o())) && ("am".equals(this.a.p()))) {
      n = 1;
    } else {
      n = 0;
    }
    i1 |= n;
    if (i1 == 0) {
      if (localObject6 == null) {
        c().s().a("GoogleService failed to initialize (no status)");
      } else {
        c().s().a("GoogleService failed to initialize, status", Integer.valueOf(((Status)localObject6).y()), ((Status)localObject6).z());
      }
    }
    if (i1 != 0)
    {
      localObject6 = g().q();
      if (g().p())
      {
        if (this.a.m()) {
          c().y().a("Collection disabled with firebase_analytics_collection_deactivated=1");
        }
      }
      else if ((localObject6 != null) && (!((Boolean)localObject6).booleanValue()))
      {
        if (this.a.m()) {
          c().y().a("Collection disabled with firebase_analytics_collection_enabled=0");
        }
      }
      else if ((localObject6 == null) && (f.b()))
      {
        c().y().a("Collection disabled with google_app_measurement_enable=0");
      }
      else
      {
        c().A().a("Collection enabled");
        i1 = i2;
        break label575;
      }
    }
    i1 = 0;
    label575:
    this.l = "";
    this.m = "";
    this.i = 0L;
    a();
    if ((!TextUtils.isEmpty(this.a.o())) && ("am".equals(this.a.p()))) {
      this.m = this.a.o();
    }
    try
    {
      str3 = f.a();
      if (TextUtils.isEmpty(str3)) {
        localObject6 = str2;
      } else {
        localObject6 = str3;
      }
      this.l = ((String)localObject6);
      if (!TextUtils.isEmpty(str3))
      {
        localObject6 = new com/google/android/gms/common/internal/x;
        ((com.google.android.gms.common.internal.x)localObject6).<init>(getContext());
        this.m = ((com.google.android.gms.common.internal.x)localObject6).a("admob_app_id");
      }
      if (i1 != 0) {
        c().A().a("App package, google app id", this.c, this.l);
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      c().s().a("getGoogleAppId or isMeasurementEnabled failed with exception. appId", v.a(str1), localIllegalStateException);
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      this.k = Eq.a(getContext());
      return;
    }
    this.k = 0;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */