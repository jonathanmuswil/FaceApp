package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import android.util.Log;
import com.google.android.gms.common.internal.t;

public final class g
{
  private static final String[] a = { "android.", "com.android.", "dalvik.", "java.", "javax." };
  private static DropBoxManager b = null;
  private static boolean c = false;
  private static int d = -1;
  private static int e = 0;
  private static int f = 0;
  
  public static boolean a(Context paramContext, Throwable paramThrowable)
  {
    return a(paramContext, paramThrowable, 536870912);
  }
  
  private static boolean a(Context paramContext, Throwable paramThrowable, int paramInt)
  {
    try
    {
      t.a(paramContext);
      t.a(paramThrowable);
      return false;
    }
    catch (Exception paramContext)
    {
      Log.e("CrashUtils", "Error adding exception to DropBox!", paramContext);
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/util/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */