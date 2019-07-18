package com.google.android.gms.flags.impl;

import OF;
import android.content.SharedPreferences;
import android.util.Log;

public final class b
  extends a<Boolean>
{
  public static Boolean a(SharedPreferences paramSharedPreferences, String paramString, Boolean paramBoolean)
  {
    try
    {
      c localc = new com/google/android/gms/flags/impl/c;
      localc.<init>(paramSharedPreferences, paramString, paramBoolean);
      paramSharedPreferences = (Boolean)OF.a(localc);
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
    return paramBoolean;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/flags/impl/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */