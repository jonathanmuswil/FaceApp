package com.google.android.gms.common.util;

import Fq;
import Gq;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

public class d
{
  public static int a(Context paramContext, String paramString)
  {
    paramContext = c(paramContext, paramString);
    if (paramContext != null)
    {
      paramContext = paramContext.applicationInfo;
      if (paramContext != null)
      {
        paramContext = paramContext.metaData;
        if (paramContext == null) {
          return -1;
        }
        return paramContext.getInt("com.google.android.gms.version", -1);
      }
    }
    return -1;
  }
  
  public static boolean a()
  {
    return false;
  }
  
  public static boolean b(Context paramContext, String paramString)
  {
    "com.google.android.gms".equals(paramString);
    try
    {
      int i = Gq.a(paramContext).a(paramString, 0).flags;
      if ((i & 0x200000) != 0) {
        return true;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    return false;
  }
  
  private static PackageInfo c(Context paramContext, String paramString)
  {
    try
    {
      paramContext = Gq.a(paramContext).b(paramString, 128);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/util/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */