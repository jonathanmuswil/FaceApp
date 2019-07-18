package com.google.android.gms.vision.clearcut;

import Fq;
import Gq;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.annotation.Keep;
import com.google.android.gms.vision.L;
import jL;
import oL;
import rL;
import vL;
import wL;

@Keep
public class LogUtils
{
  public static wL zza(long paramLong, int paramInt)
  {
    wL localwL = new wL();
    rL localrL = new rL();
    localwL.e = localrL;
    oL localoL = new oL();
    localrL.e = new oL[1];
    localrL.e[0] = localoL;
    localoL.i = Long.valueOf(paramLong);
    localoL.j = Long.valueOf(paramInt);
    localoL.k = new vL[paramInt];
    return localwL;
  }
  
  public static jL zzd(Context paramContext)
  {
    jL localjL = new jL();
    localjL.c = paramContext.getPackageName();
    paramContext = zze(paramContext);
    if (paramContext != null) {
      localjL.d = paramContext;
    }
    return localjL;
  }
  
  private static String zze(Context paramContext)
  {
    try
    {
      String str = Gq.a(paramContext).b(paramContext.getPackageName(), 0).versionName;
      return str;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      L.zza(localNameNotFoundException, "Unable to find calling package info for %s", new Object[] { paramContext.getPackageName() });
    }
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/vision/clearcut/LogUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */