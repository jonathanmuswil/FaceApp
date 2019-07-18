package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

public final class i
{
  private static Boolean a;
  private static Boolean b;
  private static Boolean c;
  private static Boolean d;
  
  public static boolean a()
  {
    return "user".equals(Build.TYPE);
  }
  
  public static boolean a(Context paramContext)
  {
    if (c == null)
    {
      paramContext = paramContext.getPackageManager();
      boolean bool;
      if ((paramContext.hasSystemFeature("com.google.android.feature.services_updater")) && (paramContext.hasSystemFeature("cn.google.services"))) {
        bool = true;
      } else {
        bool = false;
      }
      c = Boolean.valueOf(bool);
    }
    return c.booleanValue();
  }
  
  @TargetApi(21)
  public static boolean b(Context paramContext)
  {
    if (b == null)
    {
      boolean bool;
      if ((m.h()) && (paramContext.getPackageManager().hasSystemFeature("cn.google"))) {
        bool = true;
      } else {
        bool = false;
      }
      b = Boolean.valueOf(bool);
    }
    return b.booleanValue();
  }
  
  @TargetApi(20)
  public static boolean c(Context paramContext)
  {
    if (a == null)
    {
      boolean bool;
      if ((m.g()) && (paramContext.getPackageManager().hasSystemFeature("android.hardware.type.watch"))) {
        bool = true;
      } else {
        bool = false;
      }
      a = Boolean.valueOf(bool);
    }
    return a.booleanValue();
  }
  
  @TargetApi(26)
  public static boolean d(Context paramContext)
  {
    return (c(paramContext)) && ((!m.j()) || ((b(paramContext)) && (!m.k())));
  }
  
  public static boolean e(Context paramContext)
  {
    if (d == null)
    {
      boolean bool;
      if ((!paramContext.getPackageManager().hasSystemFeature("android.hardware.type.iot")) && (!paramContext.getPackageManager().hasSystemFeature("android.hardware.type.embedded"))) {
        bool = false;
      } else {
        bool = true;
      }
      d = Boolean.valueOf(bool);
    }
    return d.booleanValue();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/util/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */