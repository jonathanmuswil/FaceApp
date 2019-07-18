package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.i;

public final class b
{
  private SharedPreferences a;
  
  public b(Context paramContext)
  {
    try
    {
      paramContext = i.getRemoteContext(paramContext);
      if (paramContext == null) {
        paramContext = null;
      } else {
        paramContext = paramContext.getSharedPreferences("google_ads_flags", 0);
      }
      this.a = paramContext;
      return;
    }
    catch (Throwable paramContext)
    {
      Log.w("GmscoreFlag", "Error while getting SharedPreferences ", paramContext);
      this.a = null;
    }
  }
  
  final float a(String paramString, float paramFloat)
  {
    try
    {
      if (this.a == null) {
        return 0.0F;
      }
      paramFloat = this.a.getFloat(paramString, 0.0F);
      return paramFloat;
    }
    catch (Throwable paramString)
    {
      Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", paramString);
    }
    return 0.0F;
  }
  
  final String a(String paramString1, String paramString2)
  {
    try
    {
      if (this.a == null) {
        return paramString2;
      }
      paramString1 = this.a.getString(paramString1, paramString2);
      return paramString1;
    }
    catch (Throwable paramString1)
    {
      Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", paramString1);
    }
    return paramString2;
  }
  
  public final boolean a(String paramString, boolean paramBoolean)
  {
    try
    {
      if (this.a == null) {
        return false;
      }
      paramBoolean = this.a.getBoolean(paramString, false);
      return paramBoolean;
    }
    catch (Throwable paramString)
    {
      Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", paramString);
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/identifier/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */