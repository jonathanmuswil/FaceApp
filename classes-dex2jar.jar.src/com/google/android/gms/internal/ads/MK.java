package com.google.android.gms.internal.ads;

import android.util.Log;

@yh
public final class mk
  extends Tl
{
  public static boolean a()
  {
    if (Tl.a(2))
    {
      ga localga = ra.Mb;
      if (((Boolean)Kea.e().a(localga)).booleanValue()) {
        return true;
      }
    }
    return false;
  }
  
  public static void e(String paramString, Throwable paramThrowable)
  {
    if (a()) {
      Log.v("Ads", paramString, paramThrowable);
    }
  }
  
  public static void f(String paramString)
  {
    if (a()) {
      Log.v("Ads", paramString);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */