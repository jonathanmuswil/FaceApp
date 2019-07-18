package com.google.android.gms.common.util;

import Fq;
import Gq;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.j;

public final class r
{
  public static boolean a(Context paramContext, int paramInt)
  {
    if (!a(paramContext, paramInt, "com.google.android.gms")) {
      return false;
    }
    Object localObject = paramContext.getPackageManager();
    try
    {
      localObject = ((PackageManager)localObject).getPackageInfo("com.google.android.gms", 64);
      return j.a(paramContext).a((PackageInfo)localObject);
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      if (Log.isLoggable("UidVerifier", 3)) {
        Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
      }
    }
    return false;
  }
  
  @TargetApi(19)
  public static boolean a(Context paramContext, int paramInt, String paramString)
  {
    return Gq.a(paramContext).a(paramInt, paramString);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/util/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */