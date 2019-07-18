package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.k;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

@yh
public final class ua
{
  private String a;
  private Map<String, String> b;
  private Context c = null;
  private String d = null;
  
  public ua(Context paramContext, String paramString)
  {
    this.c = paramContext;
    this.d = paramString;
    paramString = ra.fa;
    this.a = ((String)Kea.e().a(paramString));
    this.b = new LinkedHashMap();
    this.b.put("s", "gmob_sdk");
    this.b.put("v", "3");
    this.b.put("os", Build.VERSION.RELEASE);
    this.b.put("sdk", Build.VERSION.SDK);
    paramString = this.b;
    k.c();
    paramString.put("device", vk.b());
    Map localMap = this.b;
    if (paramContext.getApplicationContext() != null) {
      paramString = paramContext.getApplicationContext().getPackageName();
    } else {
      paramString = paramContext.getPackageName();
    }
    localMap.put("app", paramString);
    paramString = this.b;
    k.c();
    if (vk.j(paramContext)) {
      paramContext = "1";
    } else {
      paramContext = "0";
    }
    paramString.put("is_lite_sdk", paramContext);
    paramContext = k.n().a(this.c);
    try
    {
      this.b.put("network_coarse", Integer.toString(((_h)paramContext.get()).o));
      this.b.put("network_fine", Integer.toString(((_h)paramContext.get()).p));
      return;
    }
    catch (Exception paramContext)
    {
      k.g().a(paramContext, "CsiConfiguration.CsiConfiguration");
    }
  }
  
  final Context a()
  {
    return this.c;
  }
  
  final String b()
  {
    return this.d;
  }
  
  final String c()
  {
    return this.a;
  }
  
  final Map<String, String> d()
  {
    return this.b;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */