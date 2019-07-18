package com.google.android.gms.flags.impl;

import OF;
import android.content.Context;
import android.content.SharedPreferences;

public final class j
{
  private static SharedPreferences a;
  
  public static SharedPreferences a(Context paramContext)
    throws Exception
  {
    try
    {
      if (a == null)
      {
        k localk = new com/google/android/gms/flags/impl/k;
        localk.<init>(paramContext);
        a = (SharedPreferences)OF.a(localk);
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/flags/impl/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */