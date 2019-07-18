package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.internal.ads.Kea;
import com.google.android.gms.internal.ads.Tl;
import com.google.android.gms.internal.ads.mk;
import com.google.android.gms.internal.ads.oa;
import com.google.android.gms.internal.ads.ra;
import com.google.android.gms.internal.ads.vk;
import com.google.android.gms.internal.ads.yh;

@yh
public final class a
{
  private static boolean a(Context paramContext, Intent paramIntent, u paramu)
  {
    try
    {
      String str = String.valueOf(paramIntent.toURI());
      if (str.length() != 0) {
        str = "Launching an intent: ".concat(str);
      } else {
        str = new String("Launching an intent: ");
      }
      mk.f(str);
      k.c();
      vk.a(paramContext, paramIntent);
      if (paramu != null) {
        paramu.a();
      }
      return true;
    }
    catch (ActivityNotFoundException paramContext)
    {
      Tl.d(paramContext.getMessage());
    }
    return false;
  }
  
  public static boolean a(Context paramContext, c paramc, u paramu)
  {
    int i = 0;
    if (paramc == null)
    {
      Tl.d("No intent data for launcher overlay.");
      return false;
    }
    ra.a(paramContext);
    Intent localIntent = paramc.h;
    if (localIntent != null) {
      return a(paramContext, localIntent, paramu);
    }
    localIntent = new Intent();
    if (TextUtils.isEmpty(paramc.b))
    {
      Tl.d("Open GMSG did not contain a URL.");
      return false;
    }
    if (!TextUtils.isEmpty(paramc.c)) {
      localIntent.setDataAndType(Uri.parse(paramc.b), paramc.c);
    } else {
      localIntent.setData(Uri.parse(paramc.b));
    }
    localIntent.setAction("android.intent.action.VIEW");
    if (!TextUtils.isEmpty(paramc.d)) {
      localIntent.setPackage(paramc.d);
    }
    if (!TextUtils.isEmpty(paramc.e))
    {
      String[] arrayOfString = paramc.e.split("/", 2);
      if (arrayOfString.length < 2)
      {
        paramContext = String.valueOf(paramc.e);
        if (paramContext.length() != 0) {
          paramContext = "Could not parse component name from open GMSG: ".concat(paramContext);
        } else {
          paramContext = new String("Could not parse component name from open GMSG: ");
        }
        Tl.d(paramContext);
        return false;
      }
      localIntent.setClassName(arrayOfString[0], arrayOfString[1]);
    }
    paramc = paramc.f;
    if (!TextUtils.isEmpty(paramc))
    {
      int j;
      try
      {
        j = Integer.parseInt(paramc);
      }
      catch (NumberFormatException paramc)
      {
        Tl.d("Could not parse intent flags.");
        j = i;
      }
      localIntent.addFlags(j);
    }
    paramc = ra.Dd;
    if (((Boolean)Kea.e().a(paramc)).booleanValue())
    {
      localIntent.addFlags(268435456);
      localIntent.putExtra("android.support.customtabs.extra.user_opt_out", true);
    }
    else
    {
      paramc = ra.Cd;
      if (((Boolean)Kea.e().a(paramc)).booleanValue())
      {
        k.c();
        vk.b(paramContext, localIntent);
      }
    }
    return a(paramContext, localIntent, paramu);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */