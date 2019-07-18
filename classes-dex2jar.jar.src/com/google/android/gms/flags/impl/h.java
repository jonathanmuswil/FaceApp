package com.google.android.gms.flags.impl;

import OF;
import android.content.SharedPreferences;
import android.util.Log;

public final class h
  extends a<String>
{
  public static String a(SharedPreferences paramSharedPreferences, String paramString1, String paramString2)
  {
    try
    {
      i locali = new com/google/android/gms/flags/impl/i;
      locali.<init>(paramSharedPreferences, paramString1, paramString2);
      paramSharedPreferences = (String)OF.a(locali);
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
    return paramString2;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/flags/impl/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */