package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.common.util.e;

@yh
public final class dk
{
  private long a = -1L;
  private long b = -1L;
  private int c = -1;
  int d = -1;
  private long e = 0L;
  private final Object f = new Object();
  private final String g;
  private final ok h;
  private int i = 0;
  private int j = 0;
  
  public dk(String paramString, ok paramok)
  {
    this.g = paramString;
    this.h = paramok;
  }
  
  private static boolean a(Context paramContext)
  {
    paramContext = li.b(paramContext);
    int k = paramContext.getResources().getIdentifier("Theme.Translucent", "style", "android");
    if (k == 0)
    {
      Tl.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
      return false;
    }
    ComponentName localComponentName = new ComponentName(paramContext.getPackageName(), "com.google.android.gms.ads.AdActivity");
    try
    {
      if (k == paramContext.getPackageManager().getActivityInfo(localComponentName, 0).theme) {
        return true;
      }
      Tl.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
      return false;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Tl.d("Fail to fetch AdActivity theme");
      Tl.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
    }
    return false;
  }
  
  public final Bundle a(Context paramContext, String paramString)
  {
    synchronized (this.f)
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putString("session_id", this.g);
      localBundle.putLong("basets", this.b);
      localBundle.putLong("currts", this.a);
      localBundle.putString("seq_num", paramString);
      localBundle.putInt("preqs", this.c);
      localBundle.putInt("preqs_in_session", this.d);
      localBundle.putLong("time_in_session", this.e);
      localBundle.putInt("pclick", this.i);
      localBundle.putInt("pimp", this.j);
      localBundle.putBoolean("support_transparent_background", a(paramContext));
      return localBundle;
    }
  }
  
  public final void a()
  {
    synchronized (this.f)
    {
      this.j += 1;
      return;
    }
  }
  
  public final void a(sea paramsea, long paramLong)
  {
    synchronized (this.f)
    {
      long l1 = this.h.g();
      long l2 = k.j().a();
      if (this.b == -1L)
      {
        ga localga = ra.eb;
        if (l2 - l1 > ((Long)Kea.e().a(localga)).longValue()) {
          this.d = -1;
        } else {
          this.d = this.h.e();
        }
        this.b = paramLong;
        this.a = this.b;
      }
      else
      {
        this.a = paramLong;
      }
      if ((paramsea != null) && (paramsea.c != null) && (paramsea.c.getInt("gw", 2) == 1)) {
        return;
      }
      this.c += 1;
      this.d += 1;
      if (this.d == 0)
      {
        this.e = 0L;
        this.h.b(l2);
      }
      else
      {
        this.e = (l2 - this.h.c());
      }
      return;
    }
  }
  
  public final void b()
  {
    synchronized (this.f)
    {
      this.i += 1;
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */