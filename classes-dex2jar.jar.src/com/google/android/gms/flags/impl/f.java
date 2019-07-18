package com.google.android.gms.flags.impl;

import OF;
import android.content.SharedPreferences;
import android.util.Log;

public final class f
  extends a<Long>
{
  public static Long a(SharedPreferences paramSharedPreferences, String paramString, Long paramLong)
  {
    try
    {
      g localg = new com/google/android/gms/flags/impl/g;
      localg.<init>(paramSharedPreferences, paramString, paramLong);
      paramSharedPreferences = (Long)OF.a(localg);
      return paramSharedPreferences;
    }
    catch (Exception paramSharedPreferences)
    {
      paramSharedPreferences = String.valueOf(paramSharedPreferences.getMessage());
      if (paramSharedPreferences.length() != 0) {
        paramSharedPreferences = "Flag value not available, returning default: ".concat(paramSharedPreferences);
      } else {
        paramSharedPreferences = new String("Flag value not available, returning default: ");
      }
      Log.w("FlagDataUtils", paramSharedPreferences);
    }
    return paramLong;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/flags/impl/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */