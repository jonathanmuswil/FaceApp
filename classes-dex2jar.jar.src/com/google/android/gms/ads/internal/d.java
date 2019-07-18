package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.Cm;
import com.google.android.gms.internal.ads.Fe;
import com.google.android.gms.internal.ads.Ge;
import com.google.android.gms.internal.ads.Ke;
import com.google.android.gms.internal.ads.Kea;
import com.google.android.gms.internal.ads.Ne;
import com.google.android.gms.internal.ads.Tl;
import com.google.android.gms.internal.ads.Yj;
import com.google.android.gms.internal.ads.Yl;
import com.google.android.gms.internal.ads.dm;
import com.google.android.gms.internal.ads.ga;
import com.google.android.gms.internal.ads.gm;
import com.google.android.gms.internal.ads.oa;
import com.google.android.gms.internal.ads.ra;
import com.google.android.gms.internal.ads.xm;
import com.google.android.gms.internal.ads.yh;
import org.json.JSONObject;

@yh
public final class d
{
  private Context a;
  private long b = 0L;
  
  private final void a(Context paramContext, Yl paramYl, boolean paramBoolean, Yj paramYj, String paramString1, String paramString2, Runnable paramRunnable)
  {
    if (k.j().b() - this.b < 5000L)
    {
      Tl.d("Not retrying to fetch app settings");
      return;
    }
    this.b = k.j().b();
    int i = 1;
    int j;
    if (paramYj == null)
    {
      j = i;
    }
    else
    {
      long l1 = paramYj.a();
      long l2 = k.j().a();
      ga localga = ra.cd;
      int k;
      if (l2 - l1 > ((Long)Kea.e().a(localga)).longValue()) {
        k = 1;
      } else {
        k = 0;
      }
      j = i;
      if (k == 0) {
        if (!paramYj.b()) {
          j = i;
        } else {
          j = 0;
        }
      }
    }
    if (j == 0) {
      return;
    }
    if (paramContext == null)
    {
      Tl.d("Context not provided to fetch application settings");
      return;
    }
    if ((TextUtils.isEmpty(paramString1)) && (TextUtils.isEmpty(paramString2)))
    {
      Tl.d("App settings could not be fetched. Required parameters missing");
      return;
    }
    paramYj = paramContext.getApplicationContext();
    if (paramYj == null) {
      paramYj = paramContext;
    }
    this.a = paramYj;
    paramYj = k.p().b(this.a, paramYl);
    paramYl = Ke.b;
    paramYl = paramYj.a("google.afma.config.fetchAppSettings", paramYl, paramYl);
    try
    {
      paramYj = new org/json/JSONObject;
      paramYj.<init>();
      if (!TextUtils.isEmpty(paramString1)) {
        paramYj.put("app_id", paramString1);
      } else if (!TextUtils.isEmpty(paramString2)) {
        paramYj.put("ad_unit_id", paramString2);
      }
      paramYj.put("is_init", paramBoolean);
      paramYj.put("pn", paramContext.getPackageName());
      paramYl = paramYl.a(paramYj);
      paramContext = gm.a(paramYl, e.a, Cm.b);
      if (paramRunnable != null) {
        paramYl.a(paramRunnable, Cm.b);
      }
      dm.a(paramContext, "ConfigLoader.maybeFetchNewAppSettings");
      return;
    }
    catch (Exception paramContext)
    {
      Tl.b("Error requesting application settings", paramContext);
    }
  }
  
  public final void a(Context paramContext, Yl paramYl, String paramString, Yj paramYj)
  {
    String str;
    if (paramYj != null) {
      str = paramYj.d();
    } else {
      str = null;
    }
    a(paramContext, paramYl, false, paramYj, str, paramString, null);
  }
  
  public final void a(Context paramContext, Yl paramYl, String paramString, Runnable paramRunnable)
  {
    a(paramContext, paramYl, true, null, paramString, null, paramRunnable);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/internal/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */