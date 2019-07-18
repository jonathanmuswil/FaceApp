package com.google.android.gms.flags.impl;

import OF;
import android.content.SharedPreferences;
import android.util.Log;

public final class d
  extends a<Integer>
{
  public static Integer a(SharedPreferences paramSharedPreferences, String paramString, Integer paramInteger)
  {
    try
    {
      e locale = new com/google/android/gms/flags/impl/e;
      locale.<init>(paramSharedPreferences, paramString, paramInteger);
      paramSharedPreferences = (Integer)OF.a(locale);
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
    return paramInteger;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/flags/impl/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */