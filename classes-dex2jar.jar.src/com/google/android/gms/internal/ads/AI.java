package com.google.android.gms.internal.ads;

import Fq;
import Gq;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.m;
import java.util.Locale;

public final class ai
{
  private int A;
  private String B;
  private boolean C;
  private int a;
  private boolean b;
  private boolean c;
  private int d;
  private int e;
  private int f;
  private String g;
  private int h;
  private int i;
  private int j;
  private boolean k;
  private int l;
  private double m;
  private boolean n;
  private String o;
  private String p;
  private boolean q;
  private boolean r;
  private String s;
  private boolean t;
  private final boolean u;
  private boolean v;
  private String w;
  private String x;
  private float y;
  private int z;
  
  public ai(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    a(paramContext);
    b(paramContext);
    c(paramContext);
    Locale localLocale = Locale.getDefault();
    ResolveInfo localResolveInfo = a(localPackageManager, "geo:0,0?q=donuts");
    boolean bool1 = true;
    boolean bool2;
    if (localResolveInfo != null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.q = bool2;
    if (a(localPackageManager, "http://www.google.com") != null) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    this.r = bool2;
    this.s = localLocale.getCountry();
    Kea.a();
    this.t = Hl.a();
    this.u = i.a(paramContext);
    this.v = i.b(paramContext);
    this.w = localLocale.getLanguage();
    this.x = a(paramContext, localPackageManager);
    this.B = d(paramContext);
    paramContext = paramContext.getResources();
    if (paramContext == null) {
      return;
    }
    paramContext = paramContext.getDisplayMetrics();
    if (paramContext == null) {
      return;
    }
    this.y = paramContext.density;
    this.z = paramContext.widthPixels;
    this.A = paramContext.heightPixels;
  }
  
  public ai(Context paramContext, _h param_h)
  {
    a(paramContext);
    b(paramContext);
    c(paramContext);
    this.o = Build.FINGERPRINT;
    this.p = Build.DEVICE;
    boolean bool;
    if ((m.b()) && (Qa.a(paramContext))) {
      bool = true;
    } else {
      bool = false;
    }
    this.C = bool;
    this.q = param_h.b;
    this.r = param_h.c;
    this.s = param_h.e;
    this.t = param_h.f;
    this.u = param_h.g;
    this.v = param_h.h;
    this.w = param_h.k;
    this.x = param_h.l;
    this.B = param_h.m;
    this.y = param_h.t;
    this.z = param_h.u;
    this.A = param_h.v;
  }
  
  private static ResolveInfo a(PackageManager paramPackageManager, String paramString)
  {
    try
    {
      Intent localIntent = new android/content/Intent;
      localIntent.<init>("android.intent.action.VIEW", Uri.parse(paramString));
      paramPackageManager = paramPackageManager.resolveActivity(localIntent, 65536);
      return paramPackageManager;
    }
    catch (Throwable paramPackageManager)
    {
      k.g().a(paramPackageManager, "DeviceInfo.getResolveInfo");
    }
    return null;
  }
  
  private static String a(Context paramContext, PackageManager paramPackageManager)
  {
    paramPackageManager = a(paramPackageManager, "market://details?id=com.google.android.gms.ads");
    if (paramPackageManager == null) {
      return null;
    }
    paramPackageManager = paramPackageManager.activityInfo;
    if (paramPackageManager == null) {
      return null;
    }
    try
    {
      paramContext = Gq.a(paramContext).b(paramPackageManager.packageName, 0);
      if (paramContext != null)
      {
        int i1 = paramContext.versionCode;
        paramContext = paramPackageManager.packageName;
        int i2 = String.valueOf(paramContext).length();
        paramPackageManager = new java/lang/StringBuilder;
        paramPackageManager.<init>(i2 + 12);
        paramPackageManager.append(i1);
        paramPackageManager.append(".");
        paramPackageManager.append(paramContext);
        paramContext = paramPackageManager.toString();
        return paramContext;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    return null;
  }
  
  private final void a(Context paramContext)
  {
    paramContext = (AudioManager)paramContext.getSystemService("audio");
    if (paramContext != null) {
      try
      {
        this.a = paramContext.getMode();
        this.b = paramContext.isMusicActive();
        this.c = paramContext.isSpeakerphoneOn();
        this.d = paramContext.getStreamVolume(3);
        this.e = paramContext.getRingerMode();
        this.f = paramContext.getStreamVolume(2);
        return;
      }
      catch (Throwable paramContext)
      {
        k.g().a(paramContext, "DeviceInfo.gatherAudioInfo");
      }
    }
    this.a = -2;
    this.b = false;
    this.c = false;
    this.d = 0;
    this.e = 2;
    this.f = 0;
  }
  
  @TargetApi(16)
  private final void b(Context paramContext)
  {
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    this.g = localTelephonyManager.getNetworkOperator();
    this.i = localTelephonyManager.getNetworkType();
    this.j = localTelephonyManager.getPhoneType();
    this.h = -2;
    this.k = false;
    this.l = -1;
    k.c();
    if (vk.a(paramContext, "android.permission.ACCESS_NETWORK_STATE"))
    {
      paramContext = localConnectivityManager.getActiveNetworkInfo();
      if (paramContext != null)
      {
        this.h = paramContext.getType();
        this.l = paramContext.getDetailedState().ordinal();
      }
      else
      {
        this.h = -1;
      }
      if (Build.VERSION.SDK_INT >= 16) {
        this.k = localConnectivityManager.isActiveNetworkMetered();
      }
    }
  }
  
  private final void c(Context paramContext)
  {
    paramContext = paramContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    boolean bool = false;
    if (paramContext != null)
    {
      int i1 = paramContext.getIntExtra("status", -1);
      int i2 = paramContext.getIntExtra("level", -1);
      int i3 = paramContext.getIntExtra("scale", -1);
      this.m = (i2 / i3);
      if ((i1 == 2) || (i1 == 5)) {
        bool = true;
      }
      this.n = bool;
      return;
    }
    this.m = -1.0D;
    this.n = false;
  }
  
  private static String d(Context paramContext)
  {
    try
    {
      paramContext = Gq.a(paramContext).b("com.android.vending", 128);
      if (paramContext != null)
      {
        int i1 = paramContext.versionCode;
        paramContext = paramContext.packageName;
        int i2 = String.valueOf(paramContext).length();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i2 + 12);
        localStringBuilder.append(i1);
        localStringBuilder.append(".");
        localStringBuilder.append(paramContext);
        paramContext = localStringBuilder.toString();
        return paramContext;
      }
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
    return null;
  }
  
  public final _h a()
  {
    return new _h(this.a, this.q, this.r, this.g, this.s, this.t, this.u, this.v, this.b, this.c, this.w, this.x, this.B, this.d, this.h, this.i, this.j, this.e, this.f, this.y, this.z, this.A, this.m, this.n, this.k, this.l, this.o, this.C, this.p);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */